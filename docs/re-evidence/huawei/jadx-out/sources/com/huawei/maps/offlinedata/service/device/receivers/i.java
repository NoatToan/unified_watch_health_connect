package com.huawei.maps.offlinedata.service.device.receivers;

import androidx.media3.common.C;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes12.dex */
public class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17958b;

    class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Timer f17959a;

        a(Timer timer) {
            this.f17959a = timer;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.huawei.maps.offlinedata.service.device.d dVarA = com.huawei.maps.offlinedata.service.device.d.a();
            i iVar = i.this;
            dVarA.a(iVar.f17957a, iVar.f17958b);
            this.f17959a.cancel();
        }
    }

    public i(int i, int i2) {
        this.f17957a = i;
        this.f17958b = i2;
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        try {
            com.huawei.maps.offlinedata.service.device.tlvtools.d dVarB = com.huawei.maps.offlinedata.service.device.tlvtools.e.b(bArr);
            if (dVarB == null) {
                com.huawei.maps.offlinedata.utils.g.d("PoliticalPerspectiveReceiver", "politicalPerspective TlvByteFather is null");
                return;
            }
            String strB = "";
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : dVarB.b()) {
                if (fVar.a() == 2) {
                    strB = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b());
                    com.huawei.maps.offlinedata.utils.g.c("PoliticalPerspectiveReceiver", "handlePoliticalPerspectiveResponse politicalPerspective.");
                } else if (fVar.a() == 19) {
                    com.huawei.maps.offlinedata.utils.g.c("PoliticalPerspectiveReceiver", "handlePoliticalPerspectiveResponse msgId:" + com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), -1));
                } else if (fVar.a() == 20) {
                    com.huawei.maps.offlinedata.utils.g.c("PoliticalPerspectiveReceiver", "handlePoliticalPerspectiveResponse reviewNumberWatchMap.");
                } else {
                    com.huawei.maps.offlinedata.utils.g.b("PoliticalPerspectiveReceiver", "handlePoliticalPerspectiveResponse type error:" + ((int) fVar.a()));
                }
            }
            if (strB.equals(com.huawei.maps.offlinedata.service.device.consts.c.SUCCESS.b())) {
                com.huawei.maps.offlinedata.utils.g.c("PoliticalPerspectiveReceiver", "syc political perspective success. ");
            }
            if (strB.equals(com.huawei.maps.offlinedata.service.device.consts.c.FAILURE.b())) {
                com.huawei.maps.offlinedata.utils.g.d("PoliticalPerspectiveReceiver", "syc political perspective failed, retryTimes is " + this.f17958b);
                Timer timer = new Timer();
                a aVar = new a(timer);
                int i2 = this.f17958b;
                if (i2 >= 3) {
                    com.huawei.maps.offlinedata.utils.g.b("PoliticalPerspectiveReceiver", "syc political perspective failed after retry, retryTimes is " + this.f17958b);
                } else {
                    this.f17958b = i2 + 1;
                    timer.schedule(aVar, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                }
            }
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused) {
            com.huawei.maps.offlinedata.utils.g.b("PoliticalPerspectiveReceiver", "catch TlvException");
        }
    }
}
