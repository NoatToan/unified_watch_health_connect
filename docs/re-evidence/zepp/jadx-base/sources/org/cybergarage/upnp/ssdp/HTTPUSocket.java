package org.cybergarage.upnp.ssdp;

import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class HTTPUSocket {
    private DatagramSocket ssdpUniSock = null;
    private String localAddr = "";

    public HTTPUSocket() {
        open();
    }

    public boolean close() {
        DatagramSocket datagramSocket = this.ssdpUniSock;
        if (datagramSocket == null) {
            return true;
        }
        try {
            datagramSocket.close();
            this.ssdpUniSock = null;
            return true;
        } catch (Exception e) {
            Debug.warning(e);
            return false;
        }
    }

    public void finalize() {
        close();
    }

    public DatagramSocket getDatagramSocket() {
        return this.ssdpUniSock;
    }

    public String getLocalAddress() {
        return this.localAddr.length() > 0 ? this.localAddr : this.ssdpUniSock.getLocalAddress().getHostAddress();
    }

    public DatagramSocket getUDPSocket() {
        return this.ssdpUniSock;
    }

    public boolean open() {
        close();
        try {
            this.ssdpUniSock = new DatagramSocket();
            return true;
        } catch (Exception e) {
            Debug.warning(e);
            return false;
        }
    }

    public boolean post(String str, int i, String str2) {
        try {
            this.ssdpUniSock.send(new DatagramPacket(str2.getBytes(), str2.length(), InetAddress.getByName(str), i));
            return true;
        } catch (Exception e) {
            Debug.warning(e);
            if (this.ssdpUniSock == null) {
                return false;
            }
            Debug.warning("addr = " + this.ssdpUniSock.getLocalAddress().getHostName());
            Debug.warning("port = " + this.ssdpUniSock.getLocalPort());
            return false;
        }
    }

    public SSDPPacket receive() {
        SSDPPacket sSDPPacket = new SSDPPacket(new byte[1024], 1024);
        sSDPPacket.setLocalAddress(getLocalAddress());
        try {
            this.ssdpUniSock.receive(sSDPPacket.getDatagramPacket());
            sSDPPacket.setTimeStamp(System.currentTimeMillis());
            return sSDPPacket;
        } catch (Exception unused) {
            return null;
        }
    }

    public void setLocalAddress(String str) {
        this.localAddr = str;
    }

    public boolean open(String str, int i) throws BindException {
        close();
        try {
            this.ssdpUniSock = new DatagramSocket(new InetSocketAddress(InetAddress.getByName(str), i));
            setLocalAddress(str);
            return true;
        } catch (BindException e) {
            Debug.warning(e);
            throw e;
        } catch (Exception e2) {
            Debug.warning(e2);
            return false;
        }
    }

    public HTTPUSocket(String str, int i) throws BindException {
        open(str, i);
    }

    public HTTPUSocket(int i) {
        open(i);
    }

    public boolean open(int i) {
        close();
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(i);
            DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
            this.ssdpUniSock = datagramSocket;
            datagramSocket.setReuseAddress(true);
            this.ssdpUniSock.bind(inetSocketAddress);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
