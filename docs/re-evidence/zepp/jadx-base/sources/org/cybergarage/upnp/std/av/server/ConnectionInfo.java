package org.cybergarage.upnp.std.av.server;

/* JADX INFO: loaded from: classes23.dex */
public class ConnectionInfo {
    public static final String INPUT = "Input";
    public static final String OK = "OK";
    public static final String OUTPUT = "Output";
    public static final String UNKNOWN = "Unknown";
    private String direction;
    private int id;
    private int peerConnectionID;
    private String peerConnectionManager;
    private String protocolInfo;
    private int rcsId;
    private String status;
    private int transId;

    public ConnectionInfo(int i) {
        setID(i);
        setRcsID(-1);
        setAVTransportID(-1);
        setProtocolInfo("");
        setPeerConnectionManager("");
        setPeerConnectionID(-1);
        setDirection("Output");
        setStatus("Unknown");
    }

    public int getAVTransportID() {
        return this.transId;
    }

    public String getDirection() {
        return this.direction;
    }

    public int getID() {
        return this.id;
    }

    public int getPeerConnectionID() {
        return this.peerConnectionID;
    }

    public String getPeerConnectionManager() {
        return this.peerConnectionManager;
    }

    public String getProtocolInfo() {
        return this.protocolInfo;
    }

    public int getRcsID() {
        return this.rcsId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setAVTransportID(int i) {
        this.transId = i;
    }

    public void setDirection(String str) {
        this.direction = str;
    }

    public void setID(int i) {
        this.id = i;
    }

    public void setPeerConnectionID(int i) {
        this.peerConnectionID = i;
    }

    public void setPeerConnectionManager(String str) {
        this.peerConnectionManager = str;
    }

    public void setProtocolInfo(String str) {
        this.protocolInfo = str;
    }

    public void setRcsID(int i) {
        this.rcsId = i;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
