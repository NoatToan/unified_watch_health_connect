package com.xiaomi.hm.health.bt.profile.mili.model;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class Progress implements Serializable {
    private static final long serialVersionUID = 1;
    public int progress;
    public int total;

    public Progress() {
        this.total = -1;
        this.progress = 0;
    }

    public int getPercent() {
        int i = this.total;
        if (i == 0) {
            return 0;
        }
        return (int) ((((long) this.progress) * 100) / ((long) i));
    }

    public void reset() {
        this.total = -1;
        this.progress = 0;
    }

    public String toString() {
        return "Progress [" + this.progress + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.total + "]";
    }

    public Progress(int total, int progress) {
        this.total = -1;
        this.progress = 0;
        this.total = total;
        this.progress = progress;
    }
}
