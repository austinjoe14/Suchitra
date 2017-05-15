/**
 * 
 */
package com.kpit.booking.action;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.kpit.booking.form.BusForm;
import com.kpit.booking.form.MovieForm;
import com.kpit.booking.modal.BusModal;
import com.kpit.booking.modal.MovieModal;

/**
 * @author suchitras
 *
 */
public class DeleteMovieInfoAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		MovieForm movie = (MovieForm) form;
		MovieModal movieModal = new MovieModal();
		ServletContext context = request.getServletContext();
		Connection connection = (Connection) context.getAttribute("connection");

		System.out.println("in DeleteMovieInfoAction");
		System.out.println("selectedmovie" +movie.getMovieID());

		boolean result = movieModal.deleteBusDetails(connection,movie.getMovieID());

		List<MovieForm> list = new ArrayList<MovieForm>();
		list = movieModal.getMovieDetails(connection);

		request.setAttribute("movielist", list);
	
		movie.setList(list);
		if (result) {
			return mapping.findForward("succ");
		} else {

			return mapping.findForward("fail");
		}
	}

}
