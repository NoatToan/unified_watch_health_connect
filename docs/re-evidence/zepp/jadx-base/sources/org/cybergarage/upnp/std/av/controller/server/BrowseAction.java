package org.cybergarage.upnp.std.av.controller.server;

import org.cybergarage.upnp.Action;
import org.cybergarage.upnp.Argument;

/* JADX INFO: loaded from: classes23.dex */
public class BrowseAction {
    public static final String BROWSE_DIRECT_CHILDREN = "BrowseDirectChildren";
    public static final String BROWSE_FLAG = "BrowseFlag";
    public static final String BROWSE_METADATA = "BrowseMetadata";
    public static final String FILTER = "Filter";
    public static final String NUMBER_RETURNED = "NumberReturned";
    public static final String OBJECT_ID = "ObjectID";
    public static final String REQUESTED_COUNT = "RequestedCount";
    public static final String RESULT = "Result";
    public static final String SORT_CRITERIA = "SortCriteria";
    public static final String STARTING_INDEX = "StartingIndex";
    public static final String TOTAL_MACHES = "TotalMatches";
    public static final String UPDATE_ID = "UpdateID";
    private Action action;

    public BrowseAction(Action action) {
        this.action = action;
    }

    public Argument getArgument(String str) {
        return this.action.getArgument(str);
    }

    public String getBrowseFlag() {
        return this.action.getArgumentValue("BrowseFlag");
    }

    public String getFilter() {
        return this.action.getArgumentValue("Filter");
    }

    public String getObjectID() {
        return this.action.getArgumentValue("ObjectID");
    }

    public int getRequestedCount() {
        return this.action.getArgumentIntegerValue("RequestedCount");
    }

    public String getSortCriteria() {
        return this.action.getArgumentValue("SortCriteria");
    }

    public int getStartingIndex() {
        return this.action.getArgumentIntegerValue("StartingIndex");
    }

    public boolean isDirectChildren() {
        return "BrowseDirectChildren".equals(getBrowseFlag());
    }

    public boolean isMetadata() {
        return "BrowseMetadata".equals(getBrowseFlag());
    }

    public boolean postControlAction() {
        return this.action.postControlAction();
    }

    public void setBrowseFlag(String str) {
        this.action.setArgumentValue("BrowseFlag", str);
    }

    public void setFilter(String str) {
        this.action.setArgumentValue("Filter", str);
    }

    public void setNumberReturned(int i) {
        this.action.setArgumentValue("NumberReturned", i);
    }

    public void setObjectID(String str) {
        this.action.setArgumentValue("ObjectID", str);
    }

    public void setRequestedCount(int i) {
        this.action.setArgumentValue("RequestedCount", i);
    }

    public void setResult(String str) {
        this.action.setArgumentValue("Result", str);
    }

    public void setSortCriteria(String str) {
        this.action.setArgumentValue("SortCriteria", str);
    }

    public void setStartingIndex(int i) {
        this.action.setArgumentValue("StartingIndex", i);
    }

    public void setTotalMaches(int i) {
        this.action.setArgumentValue("TotalMatches", i);
    }

    public void setUpdateID(int i) {
        this.action.setArgumentValue("UpdateID", i);
    }
}
