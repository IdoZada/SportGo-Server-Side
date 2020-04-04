package acs.boundary;

import java.util.Date;
import java.util.Map;

import acs.CreatedBy;
import acs.ElementID;
import acs.Location;

public class ElementBoundary {
	private ElementID elementId;
	private String type;
	private String name;
	private Boolean active;
	private Date timeStamp;
	private CreatedBy createdBy;
	private Location location;
	private Map<String,Object> attributes;
	
	

	public ElementBoundary() {
	}
	

	public ElementBoundary(ElementID elementId, String type, Boolean active,String name, Date timeStamp, CreatedBy createdBy,Location location,Map<String,Object> attributes) {
		this.elementId = elementId;
		this.type = type;
		this.active = active;
		this.name = name;
		this.timeStamp = timeStamp;
		this.createdBy = createdBy;
		this.location = location;
		this.attributes = attributes;
	}
	
	
	public ElementID getElementId() {
		return elementId;
	}

	public void setElementId(ElementID elementId) {
		this.elementId = elementId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public CreatedBy getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(CreatedBy createdBy) {
		this.createdBy = createdBy;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
	public Map<String, Object> getAttributes() {
		return attributes;
	}


	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	
	public Date getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}