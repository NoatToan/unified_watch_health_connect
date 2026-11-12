package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/DSPTestResult;", "", "", "toString", "", "component1", "component2", "component3", "component4", "position", "psr", "minPeriod", "maxPeriod", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getPosition", "()I", "b", "getPsr", "c", "getMinPeriod", GoogleApiAvailabilityLight.a, "getMaxPeriod", "<init>", "(IIII)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DSPTestResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int position;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int psr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int minPeriod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int maxPeriod;

    public DSPTestResult(int i, int i2, int i3, int i4) {
        this.position = i;
        this.psr = i2;
        this.minPeriod = i3;
        this.maxPeriod = i4;
    }

    public static /* synthetic */ DSPTestResult copy$default(DSPTestResult dSPTestResult, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = dSPTestResult.position;
        }
        if ((i5 & 2) != 0) {
            i2 = dSPTestResult.psr;
        }
        if ((i5 & 4) != 0) {
            i3 = dSPTestResult.minPeriod;
        }
        if ((i5 & 8) != 0) {
            i4 = dSPTestResult.maxPeriod;
        }
        return dSPTestResult.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPsr() {
        return this.psr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinPeriod() {
        return this.minPeriod;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxPeriod() {
        return this.maxPeriod;
    }

    @NotNull
    public final DSPTestResult copy(int position, int psr, int minPeriod, int maxPeriod) {
        return new DSPTestResult(position, psr, minPeriod, maxPeriod);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DSPTestResult)) {
            return false;
        }
        DSPTestResult dSPTestResult = (DSPTestResult) other;
        return this.position == dSPTestResult.position && this.psr == dSPTestResult.psr && this.minPeriod == dSPTestResult.minPeriod && this.maxPeriod == dSPTestResult.maxPeriod;
    }

    public final int getMaxPeriod() {
        return this.maxPeriod;
    }

    public final int getMinPeriod() {
        return this.minPeriod;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getPsr() {
        return this.psr;
    }

    public int hashCode() {
        return (((((this.position * 31) + this.psr) * 31) + this.minPeriod) * 31) + this.maxPeriod;
    }

    @NotNull
    public String toString() {
        return "DSPTestResult{position=" + this.position + ", psr=" + this.psr + ", minPeriod=" + this.minPeriod + ", maxPeriod=" + this.maxPeriod + ", }";
    }
}
