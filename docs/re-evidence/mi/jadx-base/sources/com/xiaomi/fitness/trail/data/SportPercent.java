package com.xiaomi.fitness.trail.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/trail/data/SportPercent;", "", "name", "", "intPercent", "", "decimal", "", "duration", "time", "", "<init>", "(Ljava/lang/String;IFLjava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getIntPercent", "()I", "getDecimal", "()F", "getDuration", "getTime", "()J", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportPercent {
    private final float decimal;

    @NotNull
    private final String duration;
    private final int intPercent;

    @NotNull
    private final String name;
    private final long time;

    public SportPercent(@NotNull String name, int i, float f, @NotNull String duration, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.name = name;
        this.intPercent = i;
        this.decimal = f;
        this.duration = duration;
        this.time = j;
    }

    public final float getDecimal() {
        return this.decimal;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    public final int getIntPercent() {
        return this.intPercent;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getTime() {
        return this.time;
    }
}
