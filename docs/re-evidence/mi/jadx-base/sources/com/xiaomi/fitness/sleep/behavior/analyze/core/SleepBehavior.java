package com.xiaomi.fitness.sleep.behavior.analyze.core;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J#\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/SleepBehavior;", "", "db", "", "", "events", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Events;", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Events;)V", "getDb", "()Ljava/util/List;", "getEvents", "()Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Events;", "data", "", "getData", "()[B", "setData", "([B)V", "time", "", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepBehavior {

    @Nullable
    private byte[] data;

    @SerializedName("DB")
    @NotNull
    private final List<Double> db;

    @SerializedName("Events")
    @NotNull
    private final Events events;
    private long time;

    public SleepBehavior(@NotNull List<Double> db, @NotNull Events events) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(events, "events");
        this.db = db;
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepBehavior copy$default(SleepBehavior sleepBehavior, List list, Events events, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sleepBehavior.db;
        }
        if ((i & 2) != 0) {
            events = sleepBehavior.events;
        }
        return sleepBehavior.copy(list, events);
    }

    @NotNull
    public final List<Double> component1() {
        return this.db;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Events getEvents() {
        return this.events;
    }

    @NotNull
    public final SleepBehavior copy(@NotNull List<Double> db, @NotNull Events events) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(events, "events");
        return new SleepBehavior(db, events);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepBehavior)) {
            return false;
        }
        SleepBehavior sleepBehavior = (SleepBehavior) other;
        return Intrinsics.areEqual(this.db, sleepBehavior.db) && Intrinsics.areEqual(this.events, sleepBehavior.events);
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final List<Double> getDb() {
        return this.db;
    }

    @NotNull
    public final Events getEvents() {
        return this.events;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (this.db.hashCode() * 31) + this.events.hashCode();
    }

    public final void setData(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "SleepBehavior(db=" + this.db + ", events=" + this.events + ")";
    }
}
