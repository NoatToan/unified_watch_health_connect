package com.huami.module.homepage.cards.business.weight;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f\"\u0004\b\"\u0010#R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/huami/module/homepage/cards/business/weight/WeightEntry;", "", "", "component1", "", "component2", "component3", "component4", "Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;", "component5", EcgData.TIMESTAMP_SERVER_UPDATED, "weightStateText", "weightUnit", "weight", "piecewiseArcEntry", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "b", "Ljava/lang/String;", "getWeightStateText", "()Ljava/lang/String;", "c", "getWeightUnit", "setWeightUnit", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "getWeight", "e", "Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;", "getPiecewiseArcEntry", "()Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;", "setPiecewiseArcEntry", "(Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeightEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long updateTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String weightStateText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String weightUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private PiecewiseArcEntry piecewiseArcEntry;

    public WeightEntry() {
        this(0L, null, null, null, null, 31, null);
    }

    public WeightEntry(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PiecewiseArcEntry piecewiseArcEntry) {
        this.updateTime = j;
        this.weightStateText = str;
        this.weightUnit = str2;
        this.weight = str3;
        this.piecewiseArcEntry = piecewiseArcEntry;
    }

    public static /* synthetic */ WeightEntry copy$default(WeightEntry weightEntry, long j, String str, String str2, String str3, PiecewiseArcEntry piecewiseArcEntry, int i, Object obj) {
        if ((i & 1) != 0) {
            j = weightEntry.updateTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = weightEntry.weightStateText;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = weightEntry.weightUnit;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = weightEntry.weight;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            piecewiseArcEntry = weightEntry.piecewiseArcEntry;
        }
        return weightEntry.copy(j2, str4, str5, str6, piecewiseArcEntry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWeightStateText() {
        return this.weightStateText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWeightUnit() {
        return this.weightUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PiecewiseArcEntry getPiecewiseArcEntry() {
        return this.piecewiseArcEntry;
    }

    @NotNull
    public final WeightEntry copy(long updateTime, @NotNull String weightStateText, @NotNull String weightUnit, @NotNull String weight, @NotNull PiecewiseArcEntry piecewiseArcEntry) {
        return new WeightEntry(updateTime, weightStateText, weightUnit, weight, piecewiseArcEntry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightEntry)) {
            return false;
        }
        WeightEntry weightEntry = (WeightEntry) other;
        return this.updateTime == weightEntry.updateTime && Intrinsics.areEqual(this.weightStateText, weightEntry.weightStateText) && Intrinsics.areEqual(this.weightUnit, weightEntry.weightUnit) && Intrinsics.areEqual(this.weight, weightEntry.weight) && Intrinsics.areEqual(this.piecewiseArcEntry, weightEntry.piecewiseArcEntry);
    }

    @NotNull
    public final PiecewiseArcEntry getPiecewiseArcEntry() {
        return this.piecewiseArcEntry;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    public final String getWeightStateText() {
        return this.weightStateText;
    }

    @NotNull
    public final String getWeightUnit() {
        return this.weightUnit;
    }

    public int hashCode() {
        return (((((((b.a(this.updateTime) * 31) + this.weightStateText.hashCode()) * 31) + this.weightUnit.hashCode()) * 31) + this.weight.hashCode()) * 31) + this.piecewiseArcEntry.hashCode();
    }

    public final void setPiecewiseArcEntry(@NotNull PiecewiseArcEntry piecewiseArcEntry) {
        this.piecewiseArcEntry = piecewiseArcEntry;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setWeightUnit(@NotNull String str) {
        this.weightUnit = str;
    }

    @NotNull
    public String toString() {
        return "WeightEntry(updateTime=" + this.updateTime + ", weightStateText=" + this.weightStateText + ", weightUnit=" + this.weightUnit + ", weight=" + this.weight + ", piecewiseArcEntry=" + this.piecewiseArcEntry + ")";
    }

    public /* synthetic */ WeightEntry(long j, String str, String str2, String str3, PiecewiseArcEntry piecewiseArcEntry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "--" : str, (i & 4) != 0 ? "--" : str2, (i & 8) != 0 ? "--" : str3, (i & 16) != 0 ? new PiecewiseArcEntry(0.0f, 0.0f, false, null, 15, null) : piecewiseArcEntry);
    }
}
