package com.xiaomi.hm.health.device.headset.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/bean/EarUserTime;", "", "", "component1", "()Ljava/lang/Long;", "component2", "leftEarUserTime", "rightEarUserTime", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/hm/health/device/headset/bean/EarUserTime;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Long;", "getLeftEarUserTime", "setLeftEarUserTime", "(Ljava/lang/Long;)V", "b", "getRightEarUserTime", "setRightEarUserTime", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EarUserTime {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Long leftEarUserTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Long rightEarUserTime;

    /* JADX WARN: Multi-variable type inference failed */
    public EarUserTime() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public EarUserTime(@Nullable Long l, @Nullable Long l2) {
        this.leftEarUserTime = l;
        this.rightEarUserTime = l2;
    }

    public static /* synthetic */ EarUserTime copy$default(EarUserTime earUserTime, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = earUserTime.leftEarUserTime;
        }
        if ((i & 2) != 0) {
            l2 = earUserTime.rightEarUserTime;
        }
        return earUserTime.copy(l, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLeftEarUserTime() {
        return this.leftEarUserTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getRightEarUserTime() {
        return this.rightEarUserTime;
    }

    @NotNull
    public final EarUserTime copy(@Nullable Long leftEarUserTime, @Nullable Long rightEarUserTime) {
        return new EarUserTime(leftEarUserTime, rightEarUserTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarUserTime)) {
            return false;
        }
        EarUserTime earUserTime = (EarUserTime) other;
        return Intrinsics.areEqual(this.leftEarUserTime, earUserTime.leftEarUserTime) && Intrinsics.areEqual(this.rightEarUserTime, earUserTime.rightEarUserTime);
    }

    @Nullable
    public final Long getLeftEarUserTime() {
        return this.leftEarUserTime;
    }

    @Nullable
    public final Long getRightEarUserTime() {
        return this.rightEarUserTime;
    }

    public int hashCode() {
        Long l = this.leftEarUserTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.rightEarUserTime;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final void setLeftEarUserTime(@Nullable Long l) {
        this.leftEarUserTime = l;
    }

    public final void setRightEarUserTime(@Nullable Long l) {
        this.rightEarUserTime = l;
    }

    @NotNull
    public String toString() {
        return "EarUserTime(leftEarUserTime=" + this.leftEarUserTime + ", rightEarUserTime=" + this.rightEarUserTime + ")";
    }

    public /* synthetic */ EarUserTime(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
