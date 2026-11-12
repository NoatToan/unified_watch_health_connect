package org.cybergarage.upnp.ssdp;

import java.io.InputStream;
import org.cybergarage.http.HTTP;
import org.cybergarage.http.HTTPRequest;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPRequest extends HTTPRequest {
    public SSDPRequest() {
        setVersion("1.1");
    }

    public int getBootId() {
        return getIntegerHeaderValue(HTTP.BOOTID_UPNP_ORG);
    }

    public int getLeaseTime() {
        return SSDP.getLeaseTime(getHeaderValue("Cache-Control"));
    }

    public String getLocation() {
        return getHeaderValue("Location");
    }

    public String getNT() {
        return getHeaderValue(HTTP.NT);
    }

    public String getNTS() {
        return getHeaderValue(HTTP.NTS);
    }

    public String getUSN() {
        return getHeaderValue(HTTP.USN);
    }

    public void setBootId(int i) {
        setHeader(HTTP.BOOTID_UPNP_ORG, i);
    }

    public void setLeaseTime(int i) {
        setHeader("Cache-Control", "max-age=" + Integer.toString(i));
    }

    public void setLocation(String str) {
        setHeader("Location", str);
    }

    public void setNT(String str) {
        setHeader(HTTP.NT, str);
    }

    public void setNTS(String str) {
        setHeader(HTTP.NTS, str);
    }

    public void setUSN(String str) {
        setHeader(HTTP.USN, str);
    }

    public SSDPRequest(InputStream inputStream) {
        super(inputStream);
    }
}
