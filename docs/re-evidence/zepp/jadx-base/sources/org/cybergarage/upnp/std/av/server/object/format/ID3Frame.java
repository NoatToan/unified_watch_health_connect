package org.cybergarage.upnp.std.av.server.object.format;

/* JADX INFO: loaded from: classes23.dex */
public class ID3Frame {
    public static final String TIT1 = "TIT1";
    public static final String TIT2 = "TIT2";
    public static final String TIT3 = "TIT3";
    public static final String TPE1 = "TPE1";
    public static final String TPE2 = "TPE2";
    public static final String TPE3 = "TPE3";
    public static final String TPE4 = "TPE4";
    private byte[] data;
    private int flag;
    private String id;
    private int size;

    public ID3Frame() {
        setID("");
        setFlag(0);
        setSize(0);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getID() {
        return this.id;
    }

    public int getSize() {
        return this.size;
    }

    public String getStringData() {
        return new String(this.data, 1, getSize() - 1);
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setSize(int i) {
        this.size = i;
    }
}
