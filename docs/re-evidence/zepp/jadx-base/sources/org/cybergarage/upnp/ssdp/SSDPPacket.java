package org.cybergarage.upnp.ssdp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.cybergarage.http.HTTP;
import org.cybergarage.http.HTTPHeader;
import org.cybergarage.upnp.device.MAN;
import org.cybergarage.upnp.device.NT;
import org.cybergarage.upnp.device.NTS;
import org.cybergarage.upnp.device.ST;
import org.cybergarage.upnp.device.USN;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPPacket {
    private DatagramPacket dgmPacket;
    private String localAddr = "";
    public byte[] packetBytes = null;
    private long timeStamp;

    public SSDPPacket(byte[] bArr, int i) {
        this.dgmPacket = null;
        this.dgmPacket = new DatagramPacket(bArr, i);
    }

    public String getCacheControl() {
        return HTTPHeader.getValue(getData(), "Cache-Control");
    }

    public byte[] getData() {
        byte[] bArr = this.packetBytes;
        if (bArr != null) {
            return bArr;
        }
        DatagramPacket datagramPacket = getDatagramPacket();
        byte[] bytes = new String(datagramPacket.getData(), 0, datagramPacket.getLength()).getBytes();
        this.packetBytes = bytes;
        return bytes;
    }

    public DatagramPacket getDatagramPacket() {
        return this.dgmPacket;
    }

    public String getHost() {
        return HTTPHeader.getValue(getData(), HTTP.HOST);
    }

    public InetAddress getHostInetAddress() {
        String strSubstring;
        String host = getHost();
        int iLastIndexOf = host.lastIndexOf(":");
        if (iLastIndexOf >= 0) {
            strSubstring = host.substring(0, iLastIndexOf);
            if (strSubstring.charAt(0) == '[') {
                strSubstring = strSubstring.substring(1, strSubstring.length());
            }
            if (strSubstring.charAt(strSubstring.length() - 1) == ']') {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
        } else {
            strSubstring = "127.0.0.1";
        }
        return new InetSocketAddress(strSubstring, 0).getAddress();
    }

    public int getLeaseTime() {
        return SSDP.getLeaseTime(getCacheControl());
    }

    public String getLocalAddress() {
        return this.localAddr;
    }

    public String getLocation() {
        return HTTPHeader.getValue(getData(), "Location");
    }

    public String getMAN() {
        return HTTPHeader.getValue(getData(), HTTP.MAN);
    }

    public int getMX() {
        return HTTPHeader.getIntegerValue(getData(), HTTP.MX);
    }

    public String getNT() {
        return HTTPHeader.getValue(getData(), HTTP.NT);
    }

    public String getNTS() {
        return HTTPHeader.getValue(getData(), HTTP.NTS);
    }

    public String getRemoteAddress() {
        return getDatagramPacket().getAddress().getHostAddress();
    }

    public InetAddress getRemoteInetAddress() {
        return getDatagramPacket().getAddress();
    }

    public int getRemotePort() {
        return getDatagramPacket().getPort();
    }

    public String getST() {
        return HTTPHeader.getValue(getData(), HTTP.ST);
    }

    public String getServer() {
        return HTTPHeader.getValue(getData(), "Server");
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String getUSN() {
        return HTTPHeader.getValue(getData(), HTTP.USN);
    }

    public boolean isAlive() {
        return NTS.isAlive(getNTS());
    }

    public boolean isByeBye() {
        return NTS.isByeBye(getNTS());
    }

    public boolean isDiscover() {
        return MAN.isDiscover(getMAN());
    }

    public boolean isRootDevice() {
        if (NT.isRootDevice(getNT()) || ST.isRootDevice(getST())) {
            return true;
        }
        return USN.isRootDevice(getUSN());
    }

    public void setLocalAddress(String str) {
        this.localAddr = str;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public String toString() {
        return new String(getData());
    }
}
