package com.huawei.maps.offlinedata.service.device.receivers;

/* JADX INFO: loaded from: classes12.dex */
public class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile h f17956a;

    public static h a() {
        if (f17956a == null) {
            synchronized (h.class) {
                if (f17956a == null) {
                    f17956a = new h();
                }
            }
        }
        return f17956a;
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        com.huawei.maps.offlinedata.service.device.d.a().a(-1, 0);
    }
}
