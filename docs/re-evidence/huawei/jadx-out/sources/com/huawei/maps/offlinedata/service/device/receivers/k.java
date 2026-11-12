package com.huawei.maps.offlinedata.service.device.receivers;

import com.huawei.maps.offlinedata.handler.dto.device.TransmitMapParseFinishResponse;

/* JADX INFO: loaded from: classes12.dex */
public class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile k f17963a;

    private k() {
    }

    public static k a() {
        if (f17963a == null) {
            synchronized (k.class) {
                if (f17963a == null) {
                    f17963a = new k();
                }
            }
        }
        return f17963a;
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        try {
            com.huawei.maps.offlinedata.service.device.tlvtools.d dVarB = com.huawei.maps.offlinedata.service.device.tlvtools.e.b(bArr);
            if (dVarB == null) {
                com.huawei.maps.offlinedata.utils.g.d("TransmitMapParseFinishReceiver", "transmitMapParseFinish TlvByteFather is null");
                return;
            }
            long jA = -1;
            int iB = -1;
            int iB2 = -1;
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : dVarB.b()) {
                if (fVar.a() == 9) {
                    jA = com.huawei.maps.offlinedata.service.device.tlvtools.a.a(fVar.b(), -1L);
                } else if (fVar.a() == 10) {
                    iB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), -1);
                } else if (fVar.a() != 21) {
                    com.huawei.maps.offlinedata.utils.g.b("TransmitMapParseFinishReceiver", "handleTransmitMapParseFinish type error:" + ((int) fVar.a()));
                } else {
                    iB2 = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), -1);
                }
            }
            com.huawei.maps.offlinedata.utils.g.c("TransmitMapParseFinishReceiver", "cityId:" + jA + ",mapType:" + iB + ",code:" + iB2);
            TransmitMapParseFinishResponse transmitMapParseFinishResponse = new TransmitMapParseFinishResponse();
            transmitMapParseFinishResponse.setCityId(String.valueOf(jA));
            transmitMapParseFinishResponse.setDataType(Integer.valueOf(iB));
            if (iB2 == 0) {
                com.huawei.maps.offlinedata.jsbridge.b.a().a("deviceClient.parsingFinish", transmitMapParseFinishResponse);
            } else {
                com.huawei.maps.offlinedata.jsbridge.b.a().a("deviceClient.error", transmitMapParseFinishResponse);
            }
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused) {
            com.huawei.maps.offlinedata.utils.g.b("TransmitMapParseFinishReceiver", "catch TlvException");
        }
    }
}
