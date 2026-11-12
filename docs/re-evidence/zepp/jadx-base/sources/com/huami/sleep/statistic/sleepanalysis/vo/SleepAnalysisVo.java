package com.huami.sleep.statistic.sleepanalysis.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006#"}, d2 = {"Lcom/huami/sleep/statistic/sleepanalysis/vo/SleepAnalysisVo;", "", "", "component1", "component2", "component3", "component4", "mainTitle", "subTitle", "bestTipStr", "worstTipStr", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMainTitle", "()Ljava/lang/String;", "setMainTitle", "(Ljava/lang/String;)V", "b", "getSubTitle", "setSubTitle", "c", "getBestTipStr", "setBestTipStr", GoogleApiAvailabilityLight.a, "getWorstTipStr", "setWorstTipStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepAnalysisVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String mainTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String subTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String bestTipStr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private String worstTipStr;

    public SleepAnalysisVo() {
        this(null, null, null, null, 15, null);
    }

    public SleepAnalysisVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.mainTitle = str;
        this.subTitle = str2;
        this.bestTipStr = str3;
        this.worstTipStr = str4;
    }

    public static /* synthetic */ SleepAnalysisVo copy$default(SleepAnalysisVo sleepAnalysisVo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepAnalysisVo.mainTitle;
        }
        if ((i & 2) != 0) {
            str2 = sleepAnalysisVo.subTitle;
        }
        if ((i & 4) != 0) {
            str3 = sleepAnalysisVo.bestTipStr;
        }
        if ((i & 8) != 0) {
            str4 = sleepAnalysisVo.worstTipStr;
        }
        return sleepAnalysisVo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBestTipStr() {
        return this.bestTipStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWorstTipStr() {
        return this.worstTipStr;
    }

    @NotNull
    public final SleepAnalysisVo copy(@NotNull String mainTitle, @NotNull String subTitle, @NotNull String bestTipStr, @NotNull String worstTipStr) {
        return new SleepAnalysisVo(mainTitle, subTitle, bestTipStr, worstTipStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepAnalysisVo)) {
            return false;
        }
        SleepAnalysisVo sleepAnalysisVo = (SleepAnalysisVo) other;
        return Intrinsics.areEqual(this.mainTitle, sleepAnalysisVo.mainTitle) && Intrinsics.areEqual(this.subTitle, sleepAnalysisVo.subTitle) && Intrinsics.areEqual(this.bestTipStr, sleepAnalysisVo.bestTipStr) && Intrinsics.areEqual(this.worstTipStr, sleepAnalysisVo.worstTipStr);
    }

    @NotNull
    public final String getBestTipStr() {
        return this.bestTipStr;
    }

    @NotNull
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getWorstTipStr() {
        return this.worstTipStr;
    }

    public int hashCode() {
        return (((((this.mainTitle.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.bestTipStr.hashCode()) * 31) + this.worstTipStr.hashCode();
    }

    public final void setBestTipStr(@NotNull String str) {
        this.bestTipStr = str;
    }

    public final void setMainTitle(@NotNull String str) {
        this.mainTitle = str;
    }

    public final void setSubTitle(@NotNull String str) {
        this.subTitle = str;
    }

    public final void setWorstTipStr(@NotNull String str) {
        this.worstTipStr = str;
    }

    @NotNull
    public String toString() {
        return "SleepAnalysisVo(mainTitle=" + this.mainTitle + ", subTitle=" + this.subTitle + ", bestTipStr=" + this.bestTipStr + ", worstTipStr=" + this.worstTipStr + ")";
    }

    public /* synthetic */ SleepAnalysisVo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
