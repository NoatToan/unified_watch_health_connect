package org.cybergarage.upnp.ssdp;

import org.cybergarage.http.HTTP;
import org.cybergarage.net.HostInterface;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPSearchRequest extends SSDPRequest {
    public SSDPSearchRequest(String str, int i) {
        setMethod(HTTP.M_SEARCH);
        setURI("*");
        setHeader(HTTP.ST, str);
        setHeader(HTTP.MX, Integer.toString(i));
        setHeader(HTTP.MAN, "\"ssdp:discover\"");
    }

    public void setLocalAddress(String str) {
        setHost(HostInterface.isIPv6Address(str) ? SSDP.getIPv6Address() : SSDP.ADDRESS, 1900);
    }

    public SSDPSearchRequest(String str) {
        this(str, 3);
    }

    public SSDPSearchRequest() {
        this("upnp:rootdevice");
    }
}
