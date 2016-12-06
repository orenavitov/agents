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
package org.whitesource.agent.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Holds the data for a WhiteSource project.
 *
 * @author ruslan.gogerman
 */
public class ProjectInfo implements Serializable {

    /* --- Members --- */

    private String name;

    private String url;

    private boolean newlyCreated;

    private int totalLibraries;

    private int totalAlerts;

    private int totalVulnerableLibraries;

    private int totalPolicyViolations;

    private Date date;

    // Only after a successful update
    private Collection<ProjectStructureNode> newLibraries;

    /* --- Constructor --- */

    public ProjectInfo() {
        date = new Date();
        newLibraries = new ArrayList<ProjectStructureNode>();
    }

    /* --- Getters / Setters --- */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isNewlyCreated() {
        return newlyCreated;
    }

    public int getTotalLibraries() {
        return totalLibraries;
    }

    public void setTotalLibraries(int totalLibraries) {
        this.totalLibraries = totalLibraries;
    }

    public void setNewlyCreated(boolean newlyCreated) {
        this.newlyCreated = newlyCreated;
    }

    public int getTotalAlerts() {
        return totalAlerts;
    }

    public void setTotalAlerts(int totalAlerts) {
        this.totalAlerts = totalAlerts;
    }

    public int getTotalVulnerableLibraries() {
        return totalVulnerableLibraries;
    }

    public void setTotalVulnerableLibraries(int totalVulnerableLibraries) {
        this.totalVulnerableLibraries = totalVulnerableLibraries;
    }

    public int getTotalPolicyViolations() {
        return totalPolicyViolations;
    }

    public void setTotalPolicyViolations(int totalPolicyViolations) {
        this.totalPolicyViolations = totalPolicyViolations;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Collection<ProjectStructureNode> getNewLibraries() {
        return newLibraries;
    }

    public void setNewLibraries(Collection<ProjectStructureNode> newLibraries) {
        this.newLibraries = newLibraries;
    }
}
