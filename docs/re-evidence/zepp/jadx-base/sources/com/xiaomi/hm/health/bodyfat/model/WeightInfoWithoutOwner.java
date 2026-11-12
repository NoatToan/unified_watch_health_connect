package com.xiaomi.hm.health.bodyfat.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.dataflow.Constant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JN\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\bR\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R\u0019\u0010\u0011\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/model/WeightInfoWithoutOwner;", "", "", "component1", "", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "", "component6", ParamKey.createTime, Constant.KEY_HR_VALUE, ParamKey.impedance, "encryptImpedance", ParamKey.singleStress, "weight", "copy", "(JIILjava/lang/Integer;IF)Lcom/xiaomi/hm/health/bodyfat/model/WeightInfoWithoutOwner;", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getCreateTime", "()J", "b", LogUtil.I, "getHeartRate", "()I", "c", "getImpedance", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getEncryptImpedance", "e", "getSingleStress", "f", "F", "getWeight", "()F", "<init>", "(JIILjava/lang/Integer;IF)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeightInfoWithoutOwner {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long createTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int heartRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int impedance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer encryptImpedance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int singleStress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final float weight;

    public WeightInfoWithoutOwner(long j, int i, int i2, @Nullable Integer num, int i3, float f) {
        this.createTime = j;
        this.heartRate = i;
        this.impedance = i2;
        this.encryptImpedance = num;
        this.singleStress = i3;
        this.weight = f;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getImpedance() {
        return this.impedance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getEncryptImpedance() {
        return this.encryptImpedance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSingleStress() {
        return this.singleStress;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @NotNull
    public final WeightInfoWithoutOwner copy(long createTime, int heartRate, int impedance, @Nullable Integer encryptImpedance, int singleStress, float weight) {
        return new WeightInfoWithoutOwner(createTime, heartRate, impedance, encryptImpedance, singleStress, weight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightInfoWithoutOwner)) {
            return false;
        }
        WeightInfoWithoutOwner weightInfoWithoutOwner = (WeightInfoWithoutOwner) other;
        return this.createTime == weightInfoWithoutOwner.createTime && this.heartRate == weightInfoWithoutOwner.heartRate && this.impedance == weightInfoWithoutOwner.impedance && Intrinsics.areEqual(this.encryptImpedance, weightInfoWithoutOwner.encryptImpedance) && this.singleStress == weightInfoWithoutOwner.singleStress && Intrinsics.areEqual((Object) Float.valueOf(this.weight), (Object) Float.valueOf(weightInfoWithoutOwner.weight));
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Integer getEncryptImpedance() {
        return this.encryptImpedance;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getImpedance() {
        return this.impedance;
    }

    public final int getSingleStress() {
        return this.singleStress;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iA = ((((b.a(this.createTime) * 31) + this.heartRate) * 31) + this.impedance) * 31;
        Integer num = this.encryptImpedance;
        return ((((iA + (num == null ? 0 : num.hashCode())) * 31) + this.singleStress) * 31) + Float.floatToIntBits(this.weight);
    }

    @NotNull
    public String toString() {
        return "WeightInfoWithoutOwner(createTime=" + this.createTime + ", heartRate=" + this.heartRate + ", impedance=" + this.impedance + ", encryptImpedance=" + this.encryptImpedance + ", singleStress=" + this.singleStress + ", weight=" + this.weight + ')';
    }
}
