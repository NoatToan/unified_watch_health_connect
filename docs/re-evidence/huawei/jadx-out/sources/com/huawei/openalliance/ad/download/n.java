package com.huawei.openalliance.ad.download;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18633b;

    void a(int i) {
        this.f18632a.e += (long) i;
        if (this.f18632a.f18635b) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.f18632a.d;
            if (j >= 10) {
                hw.a("DownloadWorker.SpeedAdjuster", "totalReadLengthDuringCheckPoints: %d checkDuration: %d", Long.valueOf(this.f18632a.e), Long.valueOf(j));
                this.f18632a.d = jCurrentTimeMillis;
                long j2 = ((this.f18632a.e * SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) / j) / 100;
                long jAbs = Math.abs(j2 - ((long) this.f18632a.f18636c));
                hw.a("DownloadWorker.SpeedAdjuster", "current speed: %d target speed: %d diff: %d maxReadDSize: %d", Long.valueOf(j2), Integer.valueOf(this.f18632a.f18636c), Long.valueOf(jAbs), Integer.valueOf(this.f18632a.f18634a));
                if (jAbs > 1024) {
                    if (j2 > this.f18632a.f18636c) {
                        if (this.f18632a.f18634a <= 1) {
                            long j3 = (((j * jAbs) * 100) / j2) / 100;
                            if (j3 > 120000) {
                                j3 = 120000;
                            }
                            hw.a("DownloadWorker.SpeedAdjuster", "sleep time: %d", Long.valueOf(j3));
                            try {
                                Thread.sleep(j3);
                            } catch (InterruptedException e) {
                                hw.a("DownloadWorker.SpeedAdjuster", "adjustSpeedDynamically occur error %s", e.getClass().getSimpleName());
                            }
                        } else {
                            this.f18632a.f18634a -= 30;
                            a aVar = this.f18632a;
                            aVar.f18634a = aVar.f18634a >= 1 ? this.f18632a.f18634a : 1;
                        }
                    } else {
                        this.f18632a.f18634a += 30;
                        a aVar2 = this.f18632a;
                        int i2 = aVar2.f18634a;
                        int i3 = this.f18633b;
                        if (i2 <= i3) {
                            i3 = this.f18632a.f18634a;
                        }
                        aVar2.f18634a = i3;
                    }
                }
                hw.a("DownloadWorker.SpeedAdjuster", "max read size: %d", Integer.valueOf(this.f18632a.f18634a));
                this.f18632a.e = 0L;
            }
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f18635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18636c;
        long d;
        long e;

        a() {
        }
    }

    a a() {
        return this.f18632a;
    }

    n(b bVar, int i) {
        this.f18633b = i;
        a aVar = new a();
        this.f18632a = aVar;
        aVar.f18635b = bVar.f();
        aVar.f18634a = aVar.f18635b ? 100 : i;
        aVar.f18636c = bVar.g();
        aVar.d = System.currentTimeMillis();
        aVar.e = 0L;
    }
}
