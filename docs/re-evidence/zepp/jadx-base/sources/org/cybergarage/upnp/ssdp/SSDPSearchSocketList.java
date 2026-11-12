package org.cybergarage.upnp.ssdp;

import java.net.InetAddress;
import java.util.Vector;
import org.cybergarage.net.HostInterface;
import org.cybergarage.upnp.device.SearchListener;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPSearchSocketList extends Vector {
    private InetAddress[] binds;
    private String multicastIPv4;
    private String multicastIPv6;
    private int port;

    public SSDPSearchSocketList() {
        this.binds = null;
        this.multicastIPv4 = SSDP.ADDRESS;
        this.multicastIPv6 = SSDP.getIPv6Address();
        this.port = 1900;
    }

    public void addSearchListener(SearchListener searchListener) {
        int size = size();
        for (int i = 0; i < size; i++) {
            getSSDPSearchSocket(i).addSearchListener(searchListener);
        }
    }

    public void close() {
        int size = size();
        for (int i = 0; i < size; i++) {
            getSSDPSearchSocket(i).close();
        }
        clear();
    }

    public SSDPSearchSocket getSSDPSearchSocket(int i) {
        return (SSDPSearchSocket) get(i);
    }

    public boolean open() {
        String[] strArr;
        InetAddress[] inetAddressArr = this.binds;
        if (inetAddressArr != null) {
            strArr = new String[inetAddressArr.length];
            for (int i = 0; i < inetAddressArr.length; i++) {
                strArr[i] = inetAddressArr[i].getHostAddress();
            }
        } else {
            int nHostAddresses = HostInterface.getNHostAddresses();
            strArr = new String[nHostAddresses];
            for (int i2 = 0; i2 < nHostAddresses; i2++) {
                strArr[i2] = HostInterface.getHostAddress(i2);
            }
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3] != null) {
                add(HostInterface.isIPv6Address(strArr[i3]) ? new SSDPSearchSocket(strArr[i3], this.port, this.multicastIPv6) : new SSDPSearchSocket(strArr[i3], this.port, this.multicastIPv4));
            }
        }
        return true;
    }

    public void start() {
        int size = size();
        for (int i = 0; i < size; i++) {
            getSSDPSearchSocket(i).start();
        }
    }

    public void stop() {
        int size = size();
        for (int i = 0; i < size; i++) {
            getSSDPSearchSocket(i).stop();
        }
    }

    public SSDPSearchSocketList(InetAddress[] inetAddressArr) {
        this.binds = null;
        this.multicastIPv4 = SSDP.ADDRESS;
        this.multicastIPv6 = SSDP.getIPv6Address();
        this.port = 1900;
        this.binds = inetAddressArr;
    }

    public SSDPSearchSocketList(InetAddress[] inetAddressArr, int i, String str, String str2) {
        this.binds = null;
        this.multicastIPv4 = SSDP.ADDRESS;
        this.multicastIPv6 = SSDP.getIPv6Address();
        this.port = 1900;
        this.binds = inetAddressArr;
        this.port = i;
        this.multicastIPv4 = str;
        this.multicastIPv6 = str2;
    }
}
