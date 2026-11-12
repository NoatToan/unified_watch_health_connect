package com.huawei.maps.offlinedata.service.device.receivers;

/* JADX INFO: loaded from: classes12.dex */
public class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17953b;

    public e(String str, long j) {
        this.f17952a = str;
        this.f17953b = j;
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        try {
            int iB = -1;
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : com.huawei.maps.offlinedata.service.device.tlvtools.e.b(bArr).b()) {
                if (fVar.a() == 12) {
                    iB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), -1);
                    com.huawei.maps.offlinedata.utils.g.c("HandShakeReceiver", "handleHandshakeResponse handshakeValue:" + iB);
                } else if (fVar.a() == 19) {
                    com.huawei.maps.offlinedata.utils.g.c("HandShakeReceiver", "handleHandshakeResponse msgId:" + com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), -1));
                } else {
                    com.huawei.maps.offlinedata.utils.g.d("HandShakeReceiver", "handleHandshakeResponse type error:" + ((int) fVar.a()));
                }
            }
            if (iB != com.huawei.maps.offlinedata.service.device.consts.a.MAP_SUCCESS.b()) {
                com.huawei.maps.offlinedata.service.device.f.b().b(String.valueOf(this.f17953b));
            } else {
                com.huawei.maps.offlinedata.utils.g.c("HandShakeReceiver", "handshake success, start transmit file. ");
                com.huawei.maps.offlinedata.service.device.d.a().a(this.f17952a, this.f17953b);
            }
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused) {
            com.huawei.maps.offlinedata.utils.g.b("HandShakeReceiver", "catch TlvException");
            com.huawei.maps.offlinedata.service.device.f.b().b(String.valueOf(this.f17953b));
        }
    }
}
