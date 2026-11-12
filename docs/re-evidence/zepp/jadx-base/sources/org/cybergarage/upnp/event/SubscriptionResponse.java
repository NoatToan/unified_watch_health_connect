package org.cybergarage.upnp.event;

import org.cybergarage.http.HTTP;
import org.cybergarage.http.HTTPResponse;
import org.cybergarage.upnp.UPnP;

/* JADX INFO: loaded from: classes23.dex */
public class SubscriptionResponse extends HTTPResponse {
    public SubscriptionResponse() {
        setServer(UPnP.getServerName());
    }

    public String getSID() {
        return Subscription.getSID(getHeaderValue(HTTP.SID));
    }

    public long getTimeout() {
        return Subscription.getTimeout(getHeaderValue("TIMEOUT"));
    }

    public void setErrorResponse(int i) {
        setStatusCode(i);
        setContentLength(0L);
    }

    public void setResponse(int i) {
        setStatusCode(i);
        setContentLength(0L);
    }

    public void setSID(String str) {
        setHeader(HTTP.SID, Subscription.toSIDHeaderString(str));
    }

    public void setTimeout(long j) {
        setHeader("TIMEOUT", Subscription.toTimeoutHeaderString(j));
    }

    public SubscriptionResponse(HTTPResponse hTTPResponse) {
        super(hTTPResponse);
    }
}
