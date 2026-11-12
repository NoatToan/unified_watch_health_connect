package com.xiaomi.fitness.homepage.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/homepage/util/HealthTypeBean;", "", "healthType", "", "enable", "", "manualSet", "<init>", "(IZZ)V", "getHealthType", "()I", "getEnable", "()Z", "setEnable", "(Z)V", "getManualSet", "toString", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HealthTypeBean {
    private boolean enable;
    private final int healthType;
    private final boolean manualSet;

    public HealthTypeBean(int i, boolean z, boolean z2) {
        this.healthType = i;
        this.enable = z;
        this.manualSet = z2;
    }

    public static /* synthetic */ HealthTypeBean copy$default(HealthTypeBean healthTypeBean, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = healthTypeBean.healthType;
        }
        if ((i2 & 2) != 0) {
            z = healthTypeBean.enable;
        }
        if ((i2 & 4) != 0) {
            z2 = healthTypeBean.manualSet;
        }
        return healthTypeBean.copy(i, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHealthType() {
        return this.healthType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getManualSet() {
        return this.manualSet;
    }

    @NotNull
    public final HealthTypeBean copy(int healthType, boolean enable, boolean manualSet) {
        return new HealthTypeBean(healthType, enable, manualSet);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthTypeBean)) {
            return false;
        }
        HealthTypeBean healthTypeBean = (HealthTypeBean) other;
        return this.healthType == healthTypeBean.healthType && this.enable == healthTypeBean.enable && this.manualSet == healthTypeBean.manualSet;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getHealthType() {
        return this.healthType;
    }

    public final boolean getManualSet() {
        return this.manualSet;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.healthType) * 31) + Boolean.hashCode(this.enable)) * 31) + Boolean.hashCode(this.manualSet);
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    @NotNull
    public String toString() {
        int i = this.healthType;
        return "(healthType=" + i + "(" + HealthDataTypeUtils.INSTANCE.convertToDataTypeStr$health_chinaProductRelease(i) + "), enable=" + this.enable + ", manualSet=" + this.manualSet + ")";
    }

    public /* synthetic */ HealthTypeBean(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i2 & 4) != 0 ? false : z2);
    }
}
