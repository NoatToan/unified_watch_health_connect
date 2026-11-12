package com.huami.watchfacesstore.device;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes17.dex */
public final class WFProgress {
    public int progress;
    public int total;

    public WFProgress() {
        this.total = -1;
        this.progress = 0;
    }

    public int getPercent() {
        int i = this.total;
        if (i == 0) {
            return 0;
        }
        return (this.progress * 100) / i;
    }

    public void reset() {
        this.total = -1;
        this.progress = 0;
    }

    public String toString() {
        return "Progress [" + this.progress + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.total + "]";
    }

    public WFProgress(int total, int progress) {
        this.total = -1;
        this.progress = 0;
        this.total = total;
        this.progress = progress;
    }
}
