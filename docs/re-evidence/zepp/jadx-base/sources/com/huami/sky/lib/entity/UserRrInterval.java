package com.huami.sky.lib.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/sky/lib/entity/UserRrInterval;", "", "", "toString", "", "", "component1", "", "component2", "time", "interval", "copy", "hashCode", "other", "", "equals", "Ljava/util/List;", "getTime", "()Ljava/util/List;", "getInterval", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserRrInterval {

    @NotNull
    private final List<Integer> interval;

    @NotNull
    private final List<Long> time;

    public UserRrInterval(@NotNull List<Long> list, @NotNull List<Integer> list2) {
        this.time = list;
        this.interval = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserRrInterval copy$default(UserRrInterval userRrInterval, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userRrInterval.time;
        }
        if ((i & 2) != 0) {
            list2 = userRrInterval.interval;
        }
        return userRrInterval.copy(list, list2);
    }

    @NotNull
    public final List<Long> component1() {
        return this.time;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.interval;
    }

    @NotNull
    public final UserRrInterval copy(@NotNull List<Long> time, @NotNull List<Integer> interval) {
        return new UserRrInterval(time, interval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRrInterval)) {
            return false;
        }
        UserRrInterval userRrInterval = (UserRrInterval) other;
        return Intrinsics.areEqual(this.time, userRrInterval.time) && Intrinsics.areEqual(this.interval, userRrInterval.interval);
    }

    @NotNull
    public final List<Integer> getInterval() {
        return this.interval;
    }

    @NotNull
    public final List<Long> getTime() {
        return this.time;
    }

    public int hashCode() {
        return (this.time.hashCode() * 31) + this.interval.hashCode();
    }

    @NotNull
    public String toString() {
        return "time=" + this.time + ",interval=" + this.interval;
    }
}
