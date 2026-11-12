package org.cybergarage.upnp.event;

import org.cybergarage.http.HTTP;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.http.HTTPResponse;
import org.cybergarage.upnp.Device;
import org.cybergarage.upnp.Service;
import org.cybergarage.upnp.device.NT;

/* JADX INFO: loaded from: classes23.dex */
public class SubscriptionRequest extends HTTPRequest {
    private static final String CALLBACK_END_WITH = ">";
    private static final String CALLBACK_START_WITH = "<";

    public SubscriptionRequest() {
        setContentLength(0L);
    }

    private void setService(Service service) {
        Device rootDevice;
        Device rootDevice2;
        String eventSubURL = service.getEventSubURL();
        setURI(eventSubURL, true);
        Device device = service.getDevice();
        String uRLBase = device != null ? device.getURLBase() : "";
        if ((uRLBase == null || uRLBase.length() <= 0) && (rootDevice = service.getRootDevice()) != null) {
            uRLBase = rootDevice.getURLBase();
        }
        if ((uRLBase == null || uRLBase.length() <= 0) && (rootDevice2 = service.getRootDevice()) != null) {
            uRLBase = rootDevice2.getLocation();
        }
        if ((uRLBase != null && uRLBase.length() > 0) || !HTTP.isAbsoluteURL(eventSubURL)) {
            eventSubURL = uRLBase;
        }
        String host = HTTP.getHost(eventSubURL);
        int port = HTTP.getPort(eventSubURL);
        setHost(host, port);
        setRequestHost(host);
        setRequestPort(port);
    }

    public String getCallback() {
        return getStringHeaderValue(HTTP.CALLBACK, "<", ">");
    }

    public String getNT() {
        return getHeaderValue(HTTP.NT);
    }

    public String getSID() {
        String sid = Subscription.getSID(getHeaderValue(HTTP.SID));
        return sid == null ? "" : sid;
    }

    public long getTimeout() {
        return Subscription.getTimeout(getHeaderValue("TIMEOUT"));
    }

    public boolean hasCallback() {
        String callback = getCallback();
        return callback != null && callback.length() > 0;
    }

    public boolean hasNT() {
        String nt = getNT();
        return nt != null && nt.length() > 0;
    }

    public boolean hasSID() {
        String sid = getSID();
        return sid != null && sid.length() > 0;
    }

    public void post(SubscriptionResponse subscriptionResponse) {
        super.post((HTTPResponse) subscriptionResponse);
    }

    public void setCallback(String str) {
        setStringHeader(HTTP.CALLBACK, str, "<", ">");
    }

    public void setNT(String str) {
        setHeader(HTTP.NT, str);
    }

    public void setRenewRequest(Service service, String str, long j) {
        setMethod("SUBSCRIBE");
        setService(service);
        setSID(str);
        setTimeout(j);
    }

    public void setSID(String str) {
        setHeader(HTTP.SID, Subscription.toSIDHeaderString(str));
    }

    public void setSubscribeRequest(Service service, String str, long j) {
        setMethod("SUBSCRIBE");
        setService(service);
        setCallback(str);
        setNT(NT.EVENT);
        setTimeout(j);
    }

    public final void setTimeout(long j) {
        setHeader("TIMEOUT", Subscription.toTimeoutHeaderString(j));
    }

    public void setUnsubscribeRequest(Service service) {
        setMethod("UNSUBSCRIBE");
        setService(service);
        setSID(service.getSID());
    }

    public SubscriptionResponse post() {
        return new SubscriptionResponse(post(getRequestHost(), getRequestPort()));
    }

    public SubscriptionRequest(HTTPRequest hTTPRequest) {
        this();
        set(hTTPRequest);
    }
}
