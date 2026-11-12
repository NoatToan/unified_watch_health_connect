package org.cybergarage.upnp.ssdp;

import java.io.InputStream;
import org.cybergarage.http.HTTP;
import org.cybergarage.http.HTTPResponse;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPResponse extends HTTPResponse {
    public SSDPResponse() {
        setVersion("1.1");
    }

    public int getBootId() {
        return getIntegerHeaderValue(HTTP.BOOTID_UPNP_ORG);
    }

    @Override // org.cybergarage.http.HTTPResponse
    public String getHeader() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getStatusLineString());
        stringBuffer.append(getHeaderString());
        stringBuffer.append("\r\n");
        return stringBuffer.toString();
    }

    public int getLeaseTime() {
        return SSDP.getLeaseTime(getHeaderValue("Cache-Control"));
    }

    public String getLocation() {
        return getHeaderValue("Location");
    }

    public String getMYNAME() {
        return getHeaderValue(HTTP.MYNAME);
    }

    public String getST() {
        return getHeaderValue(HTTP.ST);
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

    public void setMYNAME(String str) {
        setHeader(HTTP.MYNAME, str);
    }

    public void setST(String str) {
        setHeader(HTTP.ST, str);
    }

    public void setUSN(String str) {
        setHeader(HTTP.USN, str);
    }

    public SSDPResponse(InputStream inputStream) {
        super(inputStream);
    }
}
