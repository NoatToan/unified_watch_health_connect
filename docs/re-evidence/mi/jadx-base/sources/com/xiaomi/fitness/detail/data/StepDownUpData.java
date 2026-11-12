package com.xiaomi.fitness.detail.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/detail/data/StepDownUpData;", "", "speed", "", "time", "downUp", "level", "downUpValue", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getSpeed", "()Ljava/lang/String;", "getTime", "getDownUp", "getLevel", "getDownUpValue", "()I", "fastType", "", "getFastType", "()Z", "setFastType", "(Z)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepDownUpData {

    @NotNull
    private final String downUp;
    private final int downUpValue;
    private boolean fastType;

    @NotNull
    private final String level;

    @NotNull
    private final String speed;

    @NotNull
    private final String time;

    public StepDownUpData(@NotNull String speed, @NotNull String time, @NotNull String downUp, @NotNull String level, int i) {
        Intrinsics.checkNotNullParameter(speed, "speed");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(downUp, "downUp");
        Intrinsics.checkNotNullParameter(level, "level");
        this.speed = speed;
        this.downUp = downUp;
        this.level = level;
        this.time = time;
        this.downUpValue = i;
    }

    @NotNull
    public final String getDownUp() {
        return this.downUp;
    }

    public final int getDownUpValue() {
        return this.downUpValue;
    }

    public final boolean getFastType() {
        return this.fastType;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getSpeed() {
        return this.speed;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public final void setFastType(boolean z) {
        this.fastType = z;
    }
}
