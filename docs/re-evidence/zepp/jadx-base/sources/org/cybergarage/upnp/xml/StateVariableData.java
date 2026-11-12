package org.cybergarage.upnp.xml;

import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.upnp.control.QueryResponse;

/* JADX INFO: loaded from: classes23.dex */
public class StateVariableData extends NodeData {
    private String value = "";
    private QueryListener queryListener = null;
    private QueryResponse queryRes = null;

    public QueryListener getQueryListener() {
        return this.queryListener;
    }

    public QueryResponse getQueryResponse() {
        return this.queryRes;
    }

    public String getValue() {
        return this.value;
    }

    public void setQueryListener(QueryListener queryListener) {
        this.queryListener = queryListener;
    }

    public void setQueryResponse(QueryResponse queryResponse) {
        this.queryRes = queryResponse;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
