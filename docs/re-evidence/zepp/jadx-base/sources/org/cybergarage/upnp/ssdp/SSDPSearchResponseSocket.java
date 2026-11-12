package org.cybergarage.upnp.ssdp;

import java.net.BindException;
import java.net.DatagramSocket;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.upnp.ControlPoint;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPSearchResponseSocket extends HTTPUSocket implements Runnable {
    private ControlPoint controlPoint;
    private Thread deviceSearchResponseThread;

    public SSDPSearchResponseSocket() {
        this.controlPoint = null;
        this.deviceSearchResponseThread = null;
        setControlPoint(null);
    }

    public ControlPoint getControlPoint() {
        return this.controlPoint;
    }

    public boolean post(String str, int i, SSDPSearchResponse sSDPSearchResponse) {
        return post(str, i, sSDPSearchResponse.getHeader());
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread threadCurrentThread = Thread.currentThread();
        ControlPoint controlPoint = getControlPoint();
        while (this.deviceSearchResponseThread == threadCurrentThread) {
            Thread.yield();
            SSDPPacket sSDPPacketReceive = receive();
            if (sSDPPacketReceive == null) {
                return;
            }
            if (controlPoint != null) {
                controlPoint.searchResponseReceived(sSDPPacketReceive);
            }
        }
    }

    public void setControlPoint(ControlPoint controlPoint) {
        this.controlPoint = controlPoint;
    }

    public void start() {
        StringBuffer stringBuffer = new StringBuffer("Cyber.SSDPSearchResponseSocket/");
        DatagramSocket datagramSocket = getDatagramSocket();
        if (datagramSocket.getLocalAddress() != null) {
            stringBuffer.append(datagramSocket.getLocalAddress());
            stringBuffer.append(JsonLexerKt.COLON);
            stringBuffer.append(datagramSocket.getLocalPort());
        }
        Thread thread = new Thread(this, stringBuffer.toString());
        this.deviceSearchResponseThread = thread;
        thread.start();
    }

    public void stop() {
        this.deviceSearchResponseThread = null;
    }

    public boolean post(String str, int i, SSDPSearchRequest sSDPSearchRequest) {
        return post(str, i, sSDPSearchRequest.toString());
    }

    public SSDPSearchResponseSocket(String str, int i) throws BindException {
        super(str, i);
        this.controlPoint = null;
        this.deviceSearchResponseThread = null;
        setControlPoint(null);
    }
}
