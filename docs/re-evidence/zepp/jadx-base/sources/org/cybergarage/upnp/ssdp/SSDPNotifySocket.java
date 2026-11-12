package org.cybergarage.upnp.ssdp;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.net.HostInterface;
import org.cybergarage.upnp.ControlPoint;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPNotifySocket extends HTTPMUSocket implements Runnable {
    private ControlPoint controlPoint = null;
    private Thread deviceNotifyThread = null;
    private boolean useIPv6Address;

    public SSDPNotifySocket(String str) {
        String iPv6Address;
        this.useIPv6Address = false;
        if (HostInterface.isIPv6Address(str)) {
            iPv6Address = SSDP.getIPv6Address();
            this.useIPv6Address = true;
        } else {
            iPv6Address = SSDP.ADDRESS;
        }
        open(iPv6Address, 1900, str);
        setControlPoint(null);
    }

    public ControlPoint getControlPoint() {
        return this.controlPoint;
    }

    public boolean post(SSDPNotifyRequest sSDPNotifyRequest) {
        sSDPNotifyRequest.setHost(this.useIPv6Address ? SSDP.getIPv6Address() : SSDP.ADDRESS, 1900);
        return post((HTTPRequest) sSDPNotifyRequest);
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread threadCurrentThread = Thread.currentThread();
        ControlPoint controlPoint = getControlPoint();
        while (this.deviceNotifyThread == threadCurrentThread) {
            Thread.yield();
            try {
                SSDPPacket sSDPPacketReceive = receive();
                if (sSDPPacketReceive != null) {
                    Log.d("upnp", sSDPPacketReceive.toString());
                    InetAddress multicastInetAddress = getMulticastInetAddress();
                    InetAddress hostInetAddress = sSDPPacketReceive.getHostInetAddress();
                    if (!multicastInetAddress.equals(hostInetAddress)) {
                        Debug.warning("Invalidate Multicast Received from IP " + multicastInetAddress + " on " + hostInetAddress);
                    } else if (controlPoint != null) {
                        controlPoint.notifyReceived(sSDPPacketReceive);
                    }
                }
            } catch (IOException unused) {
                return;
            }
        }
    }

    public void setControlPoint(ControlPoint controlPoint) {
        this.controlPoint = controlPoint;
    }

    public void start() {
        StringBuffer stringBuffer = new StringBuffer("Cyber.SSDPNotifySocket/");
        String localAddress = getLocalAddress();
        if (localAddress != null && localAddress.length() > 0) {
            stringBuffer.append(getLocalAddress());
            stringBuffer.append(JsonLexerKt.COLON);
            stringBuffer.append(getLocalPort());
            stringBuffer.append(" -> ");
            stringBuffer.append(getMulticastAddress());
            stringBuffer.append(JsonLexerKt.COLON);
            stringBuffer.append(getMulticastPort());
        }
        Thread thread = new Thread(this, stringBuffer.toString());
        this.deviceNotifyThread = thread;
        thread.start();
    }

    public void stop() {
        close();
        this.deviceNotifyThread = null;
    }
}
