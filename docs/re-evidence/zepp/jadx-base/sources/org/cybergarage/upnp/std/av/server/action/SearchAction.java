package org.cybergarage.upnp.std.av.server.action;

import org.cybergarage.upnp.Action;

/* JADX INFO: loaded from: classes23.dex */
public class SearchAction extends Action {
    public static final String CONTAINER_ID = "ContainerID";
    public static final String FILTER = "Filter";
    public static final String NUMBER_RETURNED = "NumberReturned";
    public static final String REQUESTED_COUNT = "RequestedCount";
    public static final String RESULT = "Result";
    public static final String SEARCH_CRITERIA = "SearchCriteria";
    public static final String SORT_CRITERIA = "SortCriteria";
    public static final String STARTING_INDEX = "StartingIndex";
    public static final String TOTAL_MACHES = "TotalMatches";
    public static final String UPDATE_ID = "UpdateID";

    public SearchAction(Action action) {
        super(action);
    }

    public String getContainerID() {
        return getArgumentValue("ContainerID");
    }

    public String getFilter() {
        return getArgumentValue("Filter");
    }

    public int getRequestedCount() {
        return getArgumentIntegerValue("RequestedCount");
    }

    public String getSearchCriteria() {
        return getArgumentValue("SearchCriteria");
    }

    public String getSortCriteria() {
        return getArgumentValue("SortCriteria");
    }

    public int getStartingIndex() {
        return getArgumentIntegerValue("StartingIndex");
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
