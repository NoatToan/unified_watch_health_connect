package com.xiaomi.fit.fitness.device.hm.data;

import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/data/HMStageItem;", "Ljava/io/Serializable;", "<init>", "()V", "time", "", "getTime", "()I", "setTime", "(I)V", "count", "getCount", FitnessReportKey.setCount, StepsInfo.KEY_DISTANCE, "getDis", "setDis", StepsInfo.KEY_CALORIES, "getCal", "setCal", "step", "getStep", "setStep", "empty", "", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HMStageItem implements Serializable {
    private int cal;
    private int count;
    private int dis;
    private int step;
    private int time;

    public final boolean empty() {
        return this.dis == 0 && this.cal == 0 && this.step == 0;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDis() {
        return this.dis;
    }

    public final int getStep() {
        return this.step;
    }

    public final int getTime() {
        return this.time;
    }

    public final void setCal(int i) {
        this.cal = i;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setDis(int i) {
        this.dis = i;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    @NotNull
    public String toString() {
        return "cal = " + this.cal + ", step = " + this.step + ", dis = " + this.dis;
    }
}
