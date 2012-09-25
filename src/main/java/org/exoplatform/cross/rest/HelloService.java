/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.cross.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.exoplatform.services.rest.resource.ResourceContainer;

/**
 * Created by The eXo Platform SAS Author : eXoPlatform bangnv@exoplatform.com
 * Sep 24, 2012
 */

@Path("/rest/")
public class HelloService implements ResourceContainer {

	@GET
	@Path("/helloworld/")
	public String helloworld(@QueryParam("name") String name) throws Exception {
		return "HelloWorld";
	}

}