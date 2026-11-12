package com.huawei.maps.offlinedata.service.device.receivers;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile g f17954b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17955a = new HashMap();

    private g() {
    }

    public static g a() {
        if (f17954b == null) {
            synchronized (g.class) {
                if (f17954b == null) {
                    f17954b = new g();
                }
            }
        }
        return f17954b;
    }

    private int a(byte[] bArr) {
        int i = -1;
        try {
            com.huawei.maps.offlinedata.service.device.tlvtools.d dVarB = com.huawei.maps.offlinedata.service.device.tlvtools.e.b(bArr);
            if (dVarB == null) {
                com.huawei.maps.offlinedata.utils.g.d("One2OneReceiversManager", "parseMsgId TlvByteFather is null");
            }
            int iB = -1;
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : dVarB.b()) {
                try {
                    if (fVar.a() == 19) {
                        iB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), -1);
                        com.huawei.maps.offlinedata.utils.g.c("One2OneReceiversManager", "parseMsgId msgId:" + iB);
                    }
                } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g e) {
                    e = e;
                    i = iB;
                    com.huawei.maps.offlinedata.utils.g.b("One2OneReceiversManager", "catch TlvException:" + e.getMessage());
                    return i;
                }
            }
            return iB;
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g e2) {
            e = e2;
        }
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        int iA = a(bArr);
        if (this.f17955a.get(Integer.valueOf(i)) != null && ((Map) this.f17955a.get(Integer.valueOf(i))).get(Integer.valueOf(iA)) != null) {
            ((f) ((Map) this.f17955a.get(Integer.valueOf(i))).get(Integer.valueOf(iA))).a(i, bArr);
            a(i, iA);
        } else {
            com.huawei.maps.offlinedata.utils.g.b("One2OneReceiversManager", "receiver is not in map.");
        }
    }

    public boolean a(f fVar, int i, int i2) {
        if (fVar == null) {
            return false;
        }
        if (this.f17955a.get(Integer.valueOf(i)) == null) {
            this.f17955a.put(Integer.valueOf(i), new HashMap());
        }
        ((Map) this.f17955a.get(Integer.valueOf(i))).put(Integer.valueOf(i2), fVar);
        return true;
    }

    public void a(int i, int i2) {
        if (this.f17955a.get(Integer.valueOf(i)) != null) {
            ((Map) this.f17955a.get(Integer.valueOf(i))).remove(Integer.valueOf(i2));
        }
    }
}
