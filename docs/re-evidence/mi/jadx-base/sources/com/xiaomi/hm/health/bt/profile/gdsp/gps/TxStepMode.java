package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.c3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/TxStepMode;", "Ljava/io/Serializable;", "time", "", "data", "", "(J[B)V", "getData", "()[B", "stepCount", "", "getStepCount", "()I", "stepFreq", "getStepFreq", "stepStride", "getStepStride", "getTime", "()J", "toString", "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TxStepMode implements Serializable {
    public static final int DATA_LEN = 6;
    private static final int DATA_LEN_STEP_COUNT = 2;
    private static final int DATA_LEN_STEP_FREQ = 2;
    private static final int DATA_LEN_STEP_STRIDE = 2;
    private static final long serialVersionUID = 1;

    @NotNull
    private final byte[] data;
    private final int stepCount;
    private final int stepFreq;
    private final int stepStride;
    private final long time;

    public TxStepMode(long j, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.time = j;
        this.data = data;
        if (data.length < 6) {
            this.stepFreq = 0;
            this.stepCount = 0;
            this.stepStride = 0;
        } else {
            this.stepFreq = c3.a(data, 2, 0);
            this.stepCount = c3.a(data, 2, 2);
            this.stepStride = c3.a(data, 2, 4);
        }
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    public final int getStepFreq() {
        return this.stepFreq;
    }

    public final int getStepStride() {
        return this.stepStride;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public String toString() {
        return "TxStepMode(time=" + this.time + ", stepCount=" + this.stepCount + ", stepStride=" + this.stepStride + ", stepFreq=" + this.stepFreq + ')';
    }
}
