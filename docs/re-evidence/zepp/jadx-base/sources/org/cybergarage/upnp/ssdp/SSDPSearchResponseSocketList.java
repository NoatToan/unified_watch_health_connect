package org.cybergarage.upnp.ssdp;

import java.net.InetAddress;
import java.util.Vector;
import org.cybergarage.net.HostInterface;
import org.cybergarage.upnp.ControlPoint;
import org.cybergarage.util.AlwaysLog;

/* JADX INFO: loaded from: classes23.dex */
public class SSDPSearchResponseSocketList extends Vector {
    private static final String TAG = SSDPSearchResponseSocketList.class.getSimpleName();
    private InetAddress[] binds;

    public SSDPSearchResponseSocketList() {
        this.binds = null;
    }

    public void close() {
        int size = size();
        for (int i = 0; i < size; i++) {
            getSSDPSearchResponseSocket(i).close();
        }
        clear();
    }

    public SSDPSearchResponseSocket getSSDPSearchResponseSocket(int i) {
        return (SSDPSearchResponseSocket) get(i);
    }

    public boolean isValidAddress(String str) {
        return str != null && str.length() >= 1 && str.indexOf(58) == -1;
    }

    public boolean open(int i) {
        String[] strArr;
        InetAddress[] inetAddressArr = this.binds;
        if (inetAddressArr != null) {
            strArr = new String[inetAddressArr.length];
            for (int i2 = 0; i2 < inetAddressArr.length; i2++) {
                strArr[i2] = inetAddressArr[i2].getHostAddress();
            }
        } else {
            int nHostAddresses = HostInterface.getNHostAddresses();
            strArr = new String[nHostAddresses];
            for (int i3 = 0; i3 < nHostAddresses; i3++) {
                strArr[i3] = HostInterface.getHostAddress(i3);
            }
        }
        for (int i4 = 0; i4 < strArr.length; i4++) {
            AlwaysLog.i(TAG, "bindAddresses k = " + i4 + ", addr = " + strArr[i4]);
        }
        boolean z = false;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            try {
                if (isValidAddress(strArr[i5])) {
                    SSDPSearchResponseSocket sSDPSearchResponseSocket = new SSDPSearchResponseSocket(strArr[i5], i);
                    if (sSDPSearchResponseSocket.getDatagramSocket() == null) {
                        AlwaysLog.e(TAG, "SSDPSearchResponseSocket.getSocket() == null!!!");
                    } else {
                        AlwaysLog.i(TAG, "SSDPSearchResponseSocket create success!!!bindAddresses = " + strArr[i5]);
                        add(sSDPSearchResponseSocket);
                        z = true;
                    }
                } else {
                    AlwaysLog.e(TAG, "ready to create SSDPSearchResponseSocket bindAddresses = " + strArr[i5] + ", it's invalid so drop it!!!");
                }
            } catch (Exception unused) {
                stop();
                close();
                clear();
                return false;
            }
        }
        return z;
    }

    public boolean post(SSDPSearchRequest sSDPSearchRequest) {
        int size = size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            SSDPSearchResponseSocket sSDPSearchResponseSocket = getSSDPSearchResponseSocket(i);
            String localAddress = sSDPSearchResponseSocket.getLocalAddress();
            sSDPSearchRequest.setLocalAddress(localAddress);
            if (!sSDPSearchResponseSocket.post(HostInterface.isIPv6Address(localAddress) ? SSDP.getIPv6Address() : SSDP.ADDRESS, 1900, sSDPSearchRequest)) {
                z = false;
            }
        }
        return z;
    }

    public void setControlPoint(ControlPoint controlPoint) {
        int size = size();
        for (int i = 0; i < size; i++) {
            getSSDPSearchResponseSocket(i).setControlPoint(controlPoint);
        }
    }

    public void start() {
        int size = size();
        for (int i = 0; i < size; i++) {
            getSSDPSearchResponseSocket(i).start();
        }
    }

    public void stop() {
        int size = size();
        for (int i = 0; i < size; i++) {
            getSSDPSearchResponseSocket(i).stop();
        }
    }

    public SSDPSearchResponseSocketList(InetAddress[] inetAddressArr) {
        this.binds = null;
        this.binds = inetAddressArr;
    }

    public boolean open() {
        return open(1900);
    }
}
