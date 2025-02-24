package com.training.rest.web.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.portal.model.Department;
import com.training.portal.service.DepartmentService;

@Path("/portal")
public class PortalService {

	@Inject
	private DepartmentService departmentService;

	@GET
	@Path("/departments")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDepartments() {

		System.out.println("in getDepartments()");
		List<Department> departments = departmentService.getDepartments();
		System.out.println(" departments : " + departments);
		return Response.ok().entity(departments).build();
	}

}
