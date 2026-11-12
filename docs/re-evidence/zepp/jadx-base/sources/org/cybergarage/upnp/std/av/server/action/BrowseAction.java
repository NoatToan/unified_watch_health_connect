package org.cybergarage.upnp.std.av.server.action;

import org.cybergarage.upnp.Action;

/* JADX INFO: loaded from: classes23.dex */
public class BrowseAction extends Action {
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

    public BrowseAction(Action action) {
        super(action);
    }

    public String getBrowseFlag() {
        return getArgumentValue("BrowseFlag");
    }

    public String getFilter() {
        return getArgumentValue("Filter");
    }

    public int getNumberReturned() {
        return getArgumentIntegerValue("NumberReturned");
    }

    public String getObjectID() {
        return getArgumentValue("ObjectID");
    }

    public int getRequestedCount() {
        return getArgumentIntegerValue("RequestedCount");
    }

    public String getSortCriteria() {
        return getArgumentValue("SortCriteria");
    }

    public int getStartingIndex() {
        return getArgumentIntegerValue("StartingIndex");
    }

    public int getTotalMatches() {
        return getArgumentIntegerValue("TotalMatches");
    }

    public boolean isDirectChildren() {
        return "BrowseDirectChildren".equals(getBrowseFlag());
    }

    public boolean isMetadata() {
        return "BrowseMetadata".equals(getBrowseFlag());
    }

    public void setNumberReturned(int i) {
        setArgumentValue("NumberReturned", i);
    }

    public void setResult(String str) {
        setArgumentValue("Result", str);
    }

    public void setTotalMaches(int i) {
        setArgumentValue("TotalMatches", i);
    }

    public void setUpdateID(int i) {
        setArgumentValue("UpdateID", i);
    }
}
