package org.cybergarage.upnp.ssdp;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.net.HostInterface;
import org.cybergarage.upnp.device.SearchListener;
import org.cybergarage.util.ListenerList;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPSearchSocket extends HTTPMUSocket implements Runnable {
    private ListenerList deviceSearchListenerList = new ListenerList();
    private Thread deviceSearchThread = null;
    private boolean useIPv6Address;

    public SSDPSearchSocket(String str, int i, String str2) {
        open(str, str2);
    }

    public void addSearchListener(SearchListener searchListener) {
        this.deviceSearchListenerList.add(searchListener);
    }

    public boolean open(Inet4Address inet4Address) {
        this.useIPv6Address = false;
        return open(SSDP.ADDRESS, 1900, inet4Address);
    }

    public void performSearchListener(SSDPPacket sSDPPacket) {
        int size = this.deviceSearchListenerList.size();
        for (int i = 0; i < size; i++) {
            ((SearchListener) this.deviceSearchListenerList.get(i)).deviceSearchReceived(sSDPPacket);
        }
    }

    public void removeSearchListener(SearchListener searchListener) {
        this.deviceSearchListenerList.remove(searchListener);
    }

    @Override // java.lang.Runnable
    public void run() {
        Thread threadCurrentThread = Thread.currentThread();
        while (this.deviceSearchThread == threadCurrentThread) {
            Thread.yield();
            try {
                SSDPPacket sSDPPacketReceive = receive();
                if (sSDPPacketReceive != null && sSDPPacketReceive.isDiscover()) {
                    performSearchListener(sSDPPacketReceive);
                }
            } catch (IOException unused) {
                return;
            }
        }
    }

    public void start() {
        StringBuffer stringBuffer = new StringBuffer("Cyber.SSDPSearchSocket/");
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
        this.deviceSearchThread = thread;
        thread.start();
    }

    public void stop() {
        close();
        this.deviceSearchThread = null;
    }

    public boolean open(Inet6Address inet6Address) {
        this.useIPv6Address = true;
        return open(SSDP.getIPv6Address(), 1900, inet6Address);
    }

    public SSDPSearchSocket(InetAddress inetAddress) {
        if (inetAddress.getAddress().length != 4) {
            open((Inet6Address) inetAddress);
        } else {
            open((Inet4Address) inetAddress);
        }
    }

    public boolean open(String str, String str2) {
        if (HostInterface.isIPv6Address(str) && HostInterface.isIPv6Address(str2)) {
            this.useIPv6Address = true;
        } else if (HostInterface.isIPv4Address(str) && HostInterface.isIPv4Address(str2)) {
            this.useIPv6Address = false;
        } else {
            throw new IllegalArgumentException("Cannot open a UDP Socket for IPv6 address on IPv4 interface or viceversa");
        }
        return open(str2, 1900, str);
    }

    public boolean open(String str) {
        String iPv6Address;
        this.useIPv6Address = false;
        if (HostInterface.isIPv6Address(str)) {
            iPv6Address = SSDP.getIPv6Address();
            this.useIPv6Address = true;
        } else {
            iPv6Address = SSDP.ADDRESS;
        }
        return open(iPv6Address, 1900, str);
    }
}
