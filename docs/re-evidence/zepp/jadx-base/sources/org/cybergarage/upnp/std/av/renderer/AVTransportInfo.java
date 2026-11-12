package org.cybergarage.upnp.std.av.renderer;

/* JADX INFO: loaded from: classes23.dex */
public class AVTransportInfo {
    private int instanceID;
    private String uri;
    private String uriMetaData;

    public AVTransportInfo() {
        setInstanceID(0);
        setURI("");
        setURIMetaData("");
    }

    public int getInstanceID() {
        return this.instanceID;
    }

    public String getURI() {
        return this.uri;
    }

    public String getURIMetaData() {
        return this.uriMetaData;
    }

    public void setInstanceID(int i) {
        this.instanceID = i;
    }

    public void setURI(String str) {
        this.uri = str;
    }

    public void setURIMetaData(String str) {
        this.uriMetaData = str;
    }
}
