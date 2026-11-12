package com.xiaomi.hm.health.bt.profile.mili.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
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
        return "Progress [" + this.progress + "/" + this.total + "]";
    }

    public Progress(int i, int i2) {
        this.total = i;
        this.progress = i2;
    }
}
