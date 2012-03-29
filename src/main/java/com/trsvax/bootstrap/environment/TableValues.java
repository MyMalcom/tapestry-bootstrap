package com.trsvax.bootstrap.environment;

import com.trsvax.bootstrap.FrameworkMixin;

public class TableValues implements TableEnvironment {
	private String type;
	private boolean isInstrumented;
	private String sortIcon = "icon-random";
	
	public TableValues(TableEnvironment values) {
		if ( values != null ) {
			
		}
	}

	public boolean isInstrumented() {
		return isInstrumented;
	}

	public void withInstrumented(boolean value) {
		isInstrumented = value;
		
	}

	public String getType(FrameworkMixin mixin) {
		return mixin.getType() == null ? type : mixin.getType();
	}
	
	public TableValues withType(String type) {
		this.type = type;
		return this;
	}

	public String getSortIcon() {
		return sortIcon;
	}

	public TableValues withSortIcon(String sortIcon) {
		this.sortIcon = sortIcon;
		return this;
	}

}