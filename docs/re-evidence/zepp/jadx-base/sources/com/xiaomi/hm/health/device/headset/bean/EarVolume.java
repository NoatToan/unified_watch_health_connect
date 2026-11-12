package com.xiaomi.hm.health.device.headset.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0004\"\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/bean/EarVolume;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "leftEarVolume", "rightEarVolume", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/headset/bean/EarVolume;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getLeftEarVolume", "setLeftEarVolume", "(Ljava/lang/Integer;)V", "b", "getRightEarVolume", "setRightEarVolume", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EarVolume {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer leftEarVolume;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer rightEarVolume;

    /* JADX WARN: Multi-variable type inference failed */
    public EarVolume() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public EarVolume(@Nullable Integer num, @Nullable Integer num2) {
        this.leftEarVolume = num;
        this.rightEarVolume = num2;
    }

    public static /* synthetic */ EarVolume copy$default(EarVolume earVolume, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = earVolume.leftEarVolume;
        }
        if ((i & 2) != 0) {
            num2 = earVolume.rightEarVolume;
        }
        return earVolume.copy(num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLeftEarVolume() {
        return this.leftEarVolume;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getRightEarVolume() {
        return this.rightEarVolume;
    }

    @NotNull
    public final EarVolume copy(@Nullable Integer leftEarVolume, @Nullable Integer rightEarVolume) {
        return new EarVolume(leftEarVolume, rightEarVolume);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarVolume)) {
            return false;
        }
        EarVolume earVolume = (EarVolume) other;
        return Intrinsics.areEqual(this.leftEarVolume, earVolume.leftEarVolume) && Intrinsics.areEqual(this.rightEarVolume, earVolume.rightEarVolume);
    }

    @Nullable
    public final Integer getLeftEarVolume() {
        return this.leftEarVolume;
    }

    @Nullable
    public final Integer getRightEarVolume() {
        return this.rightEarVolume;
    }

    public int hashCode() {
        Integer num = this.leftEarVolume;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.rightEarVolume;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setLeftEarVolume(@Nullable Integer num) {
        this.leftEarVolume = num;
    }

    public final void setRightEarVolume(@Nullable Integer num) {
        this.rightEarVolume = num;
    }

    @NotNull
    public String toString() {
        return "EarVolume(leftEarVolume=" + this.leftEarVolume + ", rightEarVolume=" + this.rightEarVolume + ")";
    }

    public /* synthetic */ EarVolume(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
