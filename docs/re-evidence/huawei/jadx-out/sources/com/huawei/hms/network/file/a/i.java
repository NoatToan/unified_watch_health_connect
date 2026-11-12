package com.huawei.hms.network.file.a;

import android.os.SystemClock;
import com.huawei.hms.network.file.core.util.FLogger;

/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f15683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f15684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f15685c;
    long d;

    public int a(int i) {
        if (i < 0) {
            return 0;
        }
        if (this.f15685c == 0) {
            this.f15685c = SystemClock.elapsedRealtime();
        }
        long j = i;
        if (j > this.f15684b) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = (int) (((jElapsedRealtime - this.f15685c) / 1000.0d) * ((double) this.f15683a));
            if (j2 < 0) {
                j2 = this.d;
            }
            if (j2 > 0) {
                long j3 = this.f15684b + j2;
                this.f15684b = j3 < 0 ? this.d : Math.min(j3, this.d);
                this.f15685c = jElapsedRealtime;
            }
            long j4 = this.f15684b;
            if (j > j4) {
                long j5 = (j - j4) + 1;
                long j6 = (long) ((j5 * 1000.0d) / ((double) this.f15683a));
                if (j6 <= 0) {
                    j6 = 10;
                }
                try {
                    Thread.sleep(j6);
                    this.f15684b += j5;
                    this.f15685c = SystemClock.elapsedRealtime();
                } catch (InterruptedException unused) {
                    FLogger.e("TokenBucketSpeedLimiter", "acquireSync InterruptedException");
                    return 0;
                }
            }
        }
        this.f15684b -= j;
        return i;
    }

    public i(int i) {
        this.f15683a = i;
        this.d = ((long) i) * 2;
    }
}
