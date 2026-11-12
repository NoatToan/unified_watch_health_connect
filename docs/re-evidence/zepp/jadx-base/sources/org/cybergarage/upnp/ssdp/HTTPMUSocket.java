package org.cybergarage.upnp.ssdp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.util.Enumeration;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.upnp.UPnP;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class HTTPMUSocket {
    private InetSocketAddress ssdpMultiGroup = null;
    private MulticastSocket ssdpMultiSock = null;
    private NetworkInterface ssdpMultiIf = null;

    public HTTPMUSocket() {
    }

    public boolean close() {
        MulticastSocket multicastSocket = this.ssdpMultiSock;
        if (multicastSocket == null) {
            return true;
        }
        try {
            multicastSocket.leaveGroup(this.ssdpMultiGroup, this.ssdpMultiIf);
            this.ssdpMultiSock.close();
            this.ssdpMultiSock = null;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void finalize() {
        close();
    }

    public String getLocalAddress() {
        InetSocketAddress inetSocketAddress = this.ssdpMultiGroup;
        if (inetSocketAddress != null && this.ssdpMultiIf != null) {
            InetAddress address = inetSocketAddress.getAddress();
            Enumeration<InetAddress> inetAddresses = this.ssdpMultiIf.getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                if ((address instanceof Inet6Address) && (inetAddressNextElement instanceof Inet6Address)) {
                    return inetAddressNextElement.getHostAddress();
                }
                if ((address instanceof Inet4Address) && (inetAddressNextElement instanceof Inet4Address)) {
                    return inetAddressNextElement.getHostAddress();
                }
            }
        }
        return "";
    }

    public int getLocalPort() {
        return this.ssdpMultiSock.getLocalPort();
    }

    public String getMulticastAddress() {
        return getMulticastInetAddress().getHostAddress();
    }

    public InetAddress getMulticastInetAddress() {
        return this.ssdpMultiGroup.getAddress();
    }

    public int getMulticastPort() {
        return this.ssdpMultiGroup.getPort();
    }

    public MulticastSocket getSocket() {
        return this.ssdpMultiSock;
    }

    public boolean open(String str, int i, InetAddress inetAddress) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket((SocketAddress) null);
            this.ssdpMultiSock = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.ssdpMultiSock.bind(new InetSocketAddress(i));
            this.ssdpMultiGroup = new InetSocketAddress(InetAddress.getByName(str), i);
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            this.ssdpMultiIf = byInetAddress;
            this.ssdpMultiSock.joinGroup(this.ssdpMultiGroup, byInetAddress);
            return true;
        } catch (Exception e) {
            Debug.warning(e);
            return false;
        }
    }

    public boolean post(HTTPRequest hTTPRequest, String str, int i) {
        return send(hTTPRequest.toString(), str, i);
    }

    public SSDPPacket receive() throws IOException {
        SSDPPacket sSDPPacket = new SSDPPacket(new byte[1024], 1024);
        sSDPPacket.setLocalAddress(getLocalAddress());
        MulticastSocket multicastSocket = this.ssdpMultiSock;
        if (multicastSocket == null) {
            throw new IOException("Multicast socket has already been closed.");
        }
        multicastSocket.receive(sSDPPacket.getDatagramPacket());
        sSDPPacket.setTimeStamp(System.currentTimeMillis());
        return sSDPPacket;
    }

    public boolean send(String str, String str2, int i) {
        MulticastSocket multicastSocket;
        try {
            if (str2 == null || i <= 0) {
                multicastSocket = new MulticastSocket();
            } else {
                multicastSocket = new MulticastSocket((SocketAddress) null);
                multicastSocket.bind(new InetSocketAddress(str2, i));
            }
            DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(), this.ssdpMultiGroup);
            multicastSocket.setTimeToLive(UPnP.getTimeToLive());
            multicastSocket.send(datagramPacket);
            multicastSocket.close();
            return true;
        } catch (Exception e) {
            Debug.warning(e);
            return false;
        }
    }

    public boolean post(HTTPRequest hTTPRequest) {
        return send(hTTPRequest.toString(), null, -1);
    }

    public HTTPMUSocket(String str, int i, String str2) {
        open(str, i, str2);
    }

    public boolean open(String str, int i, String str2) {
        try {
            return open(str, i, InetAddress.getByName(str2));
        } catch (Exception e) {
            Debug.warning(e);
            return false;
        }
    }

    public boolean send(String str) {
        return send(str, null, -1);
    }
}
