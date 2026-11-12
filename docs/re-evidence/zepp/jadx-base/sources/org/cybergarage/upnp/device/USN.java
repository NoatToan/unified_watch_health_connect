package org.cybergarage.upnp.device;

/* JADX INFO: loaded from: classes23.dex */
public class USN {
    public static final String ROOTDEVICE = "upnp:rootdevice";

    public static final String getUDN(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf("::");
        return iIndexOf < 0 ? str.trim() : new String(str.getBytes(), 0, iIndexOf).trim();
    }

    public static final boolean isRootDevice(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith("upnp:rootdevice");
    }
}
