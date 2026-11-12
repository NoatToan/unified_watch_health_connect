package com.huami.moving.sport.ui.common;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\t\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/moving/sport/ui/common/HrZoneShowRuleConfig;", "", "", "component1", "component2", "", "component3", "showSizeForMHR", "showSizeForHRR", "isEllipsis", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getShowSizeForMHR", "()I", "b", "getShowSizeForHRR", "c", "Z", "()Z", "<init>", "(IIZ)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HrZoneShowRuleConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int showSizeForMHR;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int showSizeForHRR;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isEllipsis;

    public HrZoneShowRuleConfig(int i, int i2, boolean z) {
        this.showSizeForMHR = i;
        this.showSizeForHRR = i2;
        this.isEllipsis = z;
    }

    public static /* synthetic */ HrZoneShowRuleConfig copy$default(HrZoneShowRuleConfig hrZoneShowRuleConfig, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hrZoneShowRuleConfig.showSizeForMHR;
        }
        if ((i3 & 2) != 0) {
            i2 = hrZoneShowRuleConfig.showSizeForHRR;
        }
        if ((i3 & 4) != 0) {
            z = hrZoneShowRuleConfig.isEllipsis;
        }
        return hrZoneShowRuleConfig.copy(i, i2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getShowSizeForMHR() {
        return this.showSizeForMHR;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getShowSizeForHRR() {
        return this.showSizeForHRR;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsEllipsis() {
        return this.isEllipsis;
    }

    @NotNull
    public final HrZoneShowRuleConfig copy(int showSizeForMHR, int showSizeForHRR, boolean isEllipsis) {
        return new HrZoneShowRuleConfig(showSizeForMHR, showSizeForHRR, isEllipsis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrZoneShowRuleConfig)) {
            return false;
        }
        HrZoneShowRuleConfig hrZoneShowRuleConfig = (HrZoneShowRuleConfig) other;
        return this.showSizeForMHR == hrZoneShowRuleConfig.showSizeForMHR && this.showSizeForHRR == hrZoneShowRuleConfig.showSizeForHRR && this.isEllipsis == hrZoneShowRuleConfig.isEllipsis;
    }

    public final int getShowSizeForHRR() {
        return this.showSizeForHRR;
    }

    public final int getShowSizeForMHR() {
        return this.showSizeForMHR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int i = ((this.showSizeForMHR * 31) + this.showSizeForHRR) * 31;
        boolean z = this.isEllipsis;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final boolean isEllipsis() {
        return this.isEllipsis;
    }

    @NotNull
    public String toString() {
        return "HrZoneShowRuleConfig(showSizeForMHR=" + this.showSizeForMHR + ", showSizeForHRR=" + this.showSizeForHRR + ", isEllipsis=" + this.isEllipsis + ")";
    }
}
