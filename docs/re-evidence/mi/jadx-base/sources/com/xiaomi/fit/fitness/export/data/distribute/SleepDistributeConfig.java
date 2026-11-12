package com.xiaomi.fit.fitness.export.data.distribute;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/distribute/SleepDistributeConfig;", "", "time", "", "map", "", "", "age", "<init>", "(JLjava/util/Map;I)V", "getTime", "()J", "getMap", "()Ljava/util/Map;", "getAge", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepDistributeConfig {
    private final int age;

    @NotNull
    private final Map<Integer, Integer> map;
    private final long time;

    public SleepDistributeConfig(long j, @NotNull Map<Integer, Integer> map, int i) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.time = j;
        this.map = map;
        this.age = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepDistributeConfig copy$default(SleepDistributeConfig sleepDistributeConfig, long j, Map map, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = sleepDistributeConfig.time;
        }
        if ((i2 & 2) != 0) {
            map = sleepDistributeConfig.map;
        }
        if ((i2 & 4) != 0) {
            i = sleepDistributeConfig.age;
        }
        return sleepDistributeConfig.copy(j, map, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final Map<Integer, Integer> component2() {
        return this.map;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final SleepDistributeConfig copy(long time, @NotNull Map<Integer, Integer> map, int age) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new SleepDistributeConfig(time, map, age);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDistributeConfig)) {
            return false;
        }
        SleepDistributeConfig sleepDistributeConfig = (SleepDistributeConfig) other;
        return this.time == sleepDistributeConfig.time && Intrinsics.areEqual(this.map, sleepDistributeConfig.map) && this.age == sleepDistributeConfig.age;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final Map<Integer, Integer> getMap() {
        return this.map;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + this.map.hashCode()) * 31) + Integer.hashCode(this.age);
    }

    @NotNull
    public String toString() {
        return "SleepDistributeConfig(time=" + this.time + ", map=" + this.map + ", age=" + this.age + ")";
    }
}
