/**
 * Copyright (C) 2016 White Source Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.whitesource.agent.api.dispatch;

import org.whitesource.agent.api.model.ProjectInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Base, abstract, implementation of the interface.
 * 
 * @author ruslan.gogerman
 */
public abstract class BaseResult implements Serializable {

	/* --- Static members --- */

	private static final long serialVersionUID = -118945041509618608L;

	/* --- Members --- */

	/**
	 * Name of organization in.
	 */
	private String organization;

	private Collection<ProjectInfo> projects;

	/* --- Constructors --- */

	public BaseResult(String organization) {
		this.organization = organization;
		projects = new ArrayList<ProjectInfo>();
	}

	/* --- Getters / Setters --- */

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Collection<ProjectInfo> getProjects() {
		return projects;
	}

	public void setProjects(Collection<ProjectInfo> projects) {
		this.projects = projects;
	}
}
