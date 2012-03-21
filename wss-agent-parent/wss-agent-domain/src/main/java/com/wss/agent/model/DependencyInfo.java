package com.wss.agent.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * WhiteSource Model for a project's dependency 
 * 
 * @author tom.shapira
 *
 */
public class DependencyInfo implements Serializable {
	
	/* --- Static members --- */
	
	private static final long serialVersionUID = -6212622409560068635L;

	/* --- Members --- */
	
	private String groupId;
	
	private String artifactId;
	
	private String version;
	
	private String type;
	
	private String classifier;
	
	private String scope;
	
	private String systemPath;
	
	private Collection<ExclusionInfo> exclusions;
	
	private boolean optional;
	
	/* --- Constructors --- */
	
	/**
	 * Default constructor
	 */
	public DependencyInfo() {
		exclusions = new ArrayList<ExclusionInfo>();
	}
	
	/* --- Overridden methods --- */
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("DependencyInfo@").append(Integer.toHexString(hashCode()))
			.append("[")
			.append("groupId= ").append(groupId).append(",")
			.append("artifactId= ").append(artifactId).append(",")
			.append("version= ").append(version)
			.append(" ]");
		
		return sb.toString();
	}
	
	/* --- Getters / Setters --- */
	
	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClassifier() {
		return classifier;
	}

	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSystemPath() {
		return systemPath;
	}

	public void setSystemPath(String systemPath) {
		this.systemPath = systemPath;
	}

	public Collection<ExclusionInfo> getExclusions() {
		return exclusions;
	}

	public void setExclusions(Collection<ExclusionInfo> exclusions) {
		this.exclusions = exclusions;
	}

	public boolean getOptional() {
		return optional;
	}

	public void setOptional(boolean optional) {
		this.optional = optional;
	}

}