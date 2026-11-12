package com.huami.sky.lib.entity;

import com.huami.sky.lib.constant.WebConstant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/lib/entity/UserSleepProbability;", "", "", "toString", "", "component1", "", "component2", "component3", "component4", "time", WebConstant.QueryParam.SLEEP_PROBABILITY, WebConstant.QueryParam.DEEP_SLEEP_PROBABILITY, WebConstant.QueryParam.REM_PROBABILITY, "copy", "", "hashCode", "other", "", "equals", "J", "getTime", "()J", "F", "getSleepProbability", "()F", "getDeepSleepProbability", "getRemProbability", "<init>", "(JFFF)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserSleepProbability {
    private final float deepSleepProbability;
    private final float remProbability;
    private final float sleepProbability;
    private final long time;

    public UserSleepProbability(long j, float f, float f2, float f3) {
        this.time = j;
        this.sleepProbability = f;
        this.deepSleepProbability = f2;
        this.remProbability = f3;
    }

    public static /* synthetic */ UserSleepProbability copy$default(UserSleepProbability userSleepProbability, long j, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userSleepProbability.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = userSleepProbability.sleepProbability;
        }
        float f4 = f;
        if ((i & 4) != 0) {
            f2 = userSleepProbability.deepSleepProbability;
        }
        float f5 = f2;
        if ((i & 8) != 0) {
            f3 = userSleepProbability.remProbability;
        }
        return userSleepProbability.copy(j2, f4, f5, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSleepProbability() {
        return this.sleepProbability;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getDeepSleepProbability() {
        return this.deepSleepProbability;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getRemProbability() {
        return this.remProbability;
    }

    @NotNull
    public final UserSleepProbability copy(long time, float sleepProbability, float deepSleepProbability, float remProbability) {
        return new UserSleepProbability(time, sleepProbability, deepSleepProbability, remProbability);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSleepProbability)) {
            return false;
        }
        UserSleepProbability userSleepProbability = (UserSleepProbability) other;
        return this.time == userSleepProbability.time && Intrinsics.areEqual((Object) Float.valueOf(this.sleepProbability), (Object) Float.valueOf(userSleepProbability.sleepProbability)) && Intrinsics.areEqual((Object) Float.valueOf(this.deepSleepProbability), (Object) Float.valueOf(userSleepProbability.deepSleepProbability)) && Intrinsics.areEqual((Object) Float.valueOf(this.remProbability), (Object) Float.valueOf(userSleepProbability.remProbability));
    }

    public final float getDeepSleepProbability() {
        return this.deepSleepProbability;
    }

    public final float getRemProbability() {
        return this.remProbability;
    }

    public final float getSleepProbability() {
        return this.sleepProbability;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((b.a(this.time) * 31) + Float.floatToIntBits(this.sleepProbability)) * 31) + Float.floatToIntBits(this.deepSleepProbability)) * 31) + Float.floatToIntBits(this.remProbability);
    }

    @NotNull
    public String toString() {
        return "time=" + this.time + ",sleep=" + this.sleepProbability + ",deep=" + this.deepSleepProbability + ",rem=" + this.remProbability;
    }
}
