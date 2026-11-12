package com.xiaomi.fitness.sport_manager.receiver.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/data/IncreaseData;", "", "<init>", "()V", "curData", "", "lastData", "preMode", "", "getIncreaseData", "curMode", "data", CervicalMucusRecord.Appearance.CLEAR, "", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IncreaseData {
    private double curData;
    private double lastData;
    private int preMode = -1;

    public final void clear() {
        this.curData = 0.0d;
        this.lastData = 0.0d;
        this.preMode = -1;
    }

    public final double getIncreaseData(int curMode, double data) {
        double d;
        if (curMode != this.preMode) {
            this.curData = data;
            this.lastData = data;
            d = 0.0d;
        } else {
            this.curData = data;
            d = data - this.lastData;
            this.lastData = data;
        }
        this.preMode = curMode;
        if (d < 0.0d) {
            return 0.0d;
        }
        return d;
    }
}
