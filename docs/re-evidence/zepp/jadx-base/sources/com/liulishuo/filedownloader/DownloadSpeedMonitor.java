package com.liulishuo.filedownloader;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes18.dex */
public class DownloadSpeedMonitor implements IDownloadSpeed.Monitor, IDownloadSpeed.Lookup {
    private long a;
    private long b;
    private long c;
    private long d;
    private int e;
    private long f;
    private int g = 1000;

    @Override // com.liulishuo.filedownloader.IDownloadSpeed.Monitor
    public void end(long j) {
        if (this.d <= 0) {
            return;
        }
        long j2 = j - this.c;
        this.a = 0L;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.d;
        if (jUptimeMillis <= 0) {
            this.e = (int) j2;
        } else {
            this.e = (int) (j2 / jUptimeMillis);
        }
    }

    @Override // com.liulishuo.filedownloader.IDownloadSpeed.Lookup
    public int getSpeed() {
        return this.e;
    }

    @Override // com.liulishuo.filedownloader.IDownloadSpeed.Monitor
    public void reset() {
        this.e = 0;
        this.a = 0L;
    }

    @Override // com.liulishuo.filedownloader.IDownloadSpeed.Lookup
    public void setMinIntervalUpdateSpeed(int i) {
        this.g = i;
    }

    @Override // com.liulishuo.filedownloader.IDownloadSpeed.Monitor
    public void start(long j) {
        this.d = SystemClock.uptimeMillis();
        this.c = j;
    }

    @Override // com.liulishuo.filedownloader.IDownloadSpeed.Monitor
    public void update(long j) {
        if (this.g <= 0) {
            return;
        }
        boolean z = true;
        if (this.a != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.a;
            if (jUptimeMillis >= this.g || (this.e == 0 && jUptimeMillis > 0)) {
                int i = (int) ((j - this.b) / jUptimeMillis);
                this.e = i;
                this.e = Math.max(0, i);
            } else {
                z = false;
            }
        }
        if (z) {
            this.b = j;
            this.a = SystemClock.uptimeMillis();
        }
    }
}
