package com.huawei.maps.offlinedata.service.device.receivers;

/* JADX INFO: loaded from: classes12.dex */
public class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f17946a;

    private c() {
    }

    public static c a() {
        if (f17946a == null) {
            synchronized (c.class) {
                if (f17946a == null) {
                    f17946a = new c();
                }
            }
        }
        return f17946a;
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        try {
            com.huawei.maps.offlinedata.service.device.tlvtools.d dVarB = com.huawei.maps.offlinedata.service.device.tlvtools.e.b(bArr);
            if (dVarB == null) {
                com.huawei.maps.offlinedata.utils.g.d("DeviceRemainSpaceReceiver", "deviceRemainSpace TlvByteFather is null");
                return;
            }
            long jA = 0;
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : dVarB.b()) {
                if (fVar.a() != 1) {
                    com.huawei.maps.offlinedata.utils.g.b("DeviceRemainSpaceReceiver", "handleDeviceRemainSpace type error:" + ((int) fVar.a()));
                } else {
                    jA = com.huawei.maps.offlinedata.service.device.tlvtools.a.a(fVar.b(), -1L);
                    com.huawei.maps.offlinedata.utils.g.c("DeviceRemainSpaceReceiver", "handleDeviceRemainSpace deviceRemainSpace:" + jA);
                }
            }
            com.huawei.maps.offlinedata.jsbridge.b.a().a("deviceClient.size", String.valueOf(jA));
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused) {
            com.huawei.maps.offlinedata.utils.g.b("DeviceRemainSpaceReceiver", "catch TlvException");
        }
    }
}
