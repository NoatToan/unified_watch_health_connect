package com.huawei.maps.offlinedata.service.device;

import com.huawei.maps.offlinedata.health.p2p.OfflineMapP2pMessage;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f17896a;

    private c() {
    }

    public static c a() {
        if (f17896a == null) {
            synchronized (c.class) {
                if (f17896a == null) {
                    f17896a = new c();
                }
            }
        }
        return f17896a;
    }

    public void a(int i, OfflineMapP2pMessage offlineMapP2pMessage) {
        byte[] data = offlineMapP2pMessage.getData();
        if (data == null) {
            return;
        }
        byte b2 = data[0];
        g.c("DeviceReceiverService", "onDataReceived msgType: " + ((int) b2));
        int length = data.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(data, 1, bArr, 0, length);
        com.huawei.maps.offlinedata.service.device.receivers.f fVarA = e.a().a(b2);
        if (fVarA != null) {
            fVarA.a(b2, bArr);
        }
    }
}
