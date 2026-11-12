package org.cybergarage.upnp.ssdp;

import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPNotifyRequest extends SSDPRequest {
    public SSDPNotifyRequest() {
        setMethod(HTTP.NOTIFY);
        setURI("*");
    }
}
