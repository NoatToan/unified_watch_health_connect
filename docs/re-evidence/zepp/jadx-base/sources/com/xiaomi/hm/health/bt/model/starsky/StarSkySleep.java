package com.xiaomi.hm.health.bt.model.starsky;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.constant.WebConstant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/bt/model/starsky/StarSkySleep;", "", "", "toString", "", "component1", "", "component2", "component3", "component4", "timestamp", WebConstant.QueryParam.SLEEP_PROBABILITY, WebConstant.QueryParam.DEEP_SLEEP_PROBABILITY, WebConstant.QueryParam.REM_PROBABILITY, "copy", "", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getSleepProbability", "()F", "c", "getDeepSleepProbability", GoogleApiAvailabilityLight.a, "getRemProbability", "<init>", "(JFFF)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StarSkySleep {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float sleepProbability;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float deepSleepProbability;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float remProbability;

    public StarSkySleep(long j, float f, float f2, float f3) {
        this.timestamp = j;
        this.sleepProbability = f;
        this.deepSleepProbability = f2;
        this.remProbability = f3;
    }

    public static /* synthetic */ StarSkySleep copy$default(StarSkySleep starSkySleep, long j, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = starSkySleep.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = starSkySleep.sleepProbability;
        }
        float f4 = f;
        if ((i & 4) != 0) {
            f2 = starSkySleep.deepSleepProbability;
        }
        float f5 = f2;
        if ((i & 8) != 0) {
            f3 = starSkySleep.remProbability;
        }
        return starSkySleep.copy(j2, f4, f5, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
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
    public final StarSkySleep copy(long timestamp, float sleepProbability, float deepSleepProbability, float remProbability) {
        return new StarSkySleep(timestamp, sleepProbability, deepSleepProbability, remProbability);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarSkySleep)) {
            return false;
        }
        StarSkySleep starSkySleep = (StarSkySleep) other;
        return this.timestamp == starSkySleep.timestamp && Intrinsics.areEqual((Object) Float.valueOf(this.sleepProbability), (Object) Float.valueOf(starSkySleep.sleepProbability)) && Intrinsics.areEqual((Object) Float.valueOf(this.deepSleepProbability), (Object) Float.valueOf(starSkySleep.deepSleepProbability)) && Intrinsics.areEqual((Object) Float.valueOf(this.remProbability), (Object) Float.valueOf(starSkySleep.remProbability));
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

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((b.a(this.timestamp) * 31) + Float.floatToIntBits(this.sleepProbability)) * 31) + Float.floatToIntBits(this.deepSleepProbability)) * 31) + Float.floatToIntBits(this.remProbability);
    }

    @NotNull
    public String toString() {
        return "StarSkySleep<timestamp=" + this.timestamp + ", sleepProbability=" + this.sleepProbability + ", deepSleepProbability=" + this.deepSleepProbability + ", remProbability=" + this.remProbability + Typography.greater;
    }
}
