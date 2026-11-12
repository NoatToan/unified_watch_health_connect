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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/huami/module/homepage/cards/business/weight/BmiEntry;", "", "", "component1", "", "component2", "component3", "Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;", "component4", EcgData.TIMESTAMP_SERVER_UPDATED, "bmiStateText", "bmi", "piecewiseArcEntry", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "b", "Ljava/lang/String;", "getBmiStateText", "()Ljava/lang/String;", "c", "getBmi", GoogleApiAvailabilityLight.a, "Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;", "getPiecewiseArcEntry", "()Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;", "setPiecewiseArcEntry", "(Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BmiEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long updateTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String bmiStateText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String bmi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private PiecewiseArcEntry piecewiseArcEntry;

    public BmiEntry() {
        this(0L, null, null, null, 15, null);
    }

    public BmiEntry(long j, @NotNull String str, @NotNull String str2, @NotNull PiecewiseArcEntry piecewiseArcEntry) {
        this.updateTime = j;
        this.bmiStateText = str;
        this.bmi = str2;
        this.piecewiseArcEntry = piecewiseArcEntry;
    }

    public static /* synthetic */ BmiEntry copy$default(BmiEntry bmiEntry, long j, String str, String str2, PiecewiseArcEntry piecewiseArcEntry, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bmiEntry.updateTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = bmiEntry.bmiStateText;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = bmiEntry.bmi;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            piecewiseArcEntry = bmiEntry.piecewiseArcEntry;
        }
        return bmiEntry.copy(j2, str3, str4, piecewiseArcEntry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBmiStateText() {
        return this.bmiStateText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBmi() {
        return this.bmi;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PiecewiseArcEntry getPiecewiseArcEntry() {
        return this.piecewiseArcEntry;
    }

    @NotNull
    public final BmiEntry copy(long updateTime, @NotNull String bmiStateText, @NotNull String bmi, @NotNull PiecewiseArcEntry piecewiseArcEntry) {
        return new BmiEntry(updateTime, bmiStateText, bmi, piecewiseArcEntry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BmiEntry)) {
            return false;
        }
        BmiEntry bmiEntry = (BmiEntry) other;
        return this.updateTime == bmiEntry.updateTime && Intrinsics.areEqual(this.bmiStateText, bmiEntry.bmiStateText) && Intrinsics.areEqual(this.bmi, bmiEntry.bmi) && Intrinsics.areEqual(this.piecewiseArcEntry, bmiEntry.piecewiseArcEntry);
    }

    @NotNull
    public final String getBmi() {
        return this.bmi;
    }

    @NotNull
    public final String getBmiStateText() {
        return this.bmiStateText;
    }

    @NotNull
    public final PiecewiseArcEntry getPiecewiseArcEntry() {
        return this.piecewiseArcEntry;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((b.a(this.updateTime) * 31) + this.bmiStateText.hashCode()) * 31) + this.bmi.hashCode()) * 31) + this.piecewiseArcEntry.hashCode();
    }

    public final void setPiecewiseArcEntry(@NotNull PiecewiseArcEntry piecewiseArcEntry) {
        this.piecewiseArcEntry = piecewiseArcEntry;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        return "BmiEntry(updateTime=" + this.updateTime + ", bmiStateText=" + this.bmiStateText + ", bmi=" + this.bmi + ", piecewiseArcEntry=" + this.piecewiseArcEntry + ")";
    }

    public /* synthetic */ BmiEntry(long j, String str, String str2, PiecewiseArcEntry piecewiseArcEntry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "--" : str, (i & 4) == 0 ? str2 : "--", (i & 8) != 0 ? new PiecewiseArcEntry(0.0f, 0.0f, false, null, 15, null) : piecewiseArcEntry);
    }
}
