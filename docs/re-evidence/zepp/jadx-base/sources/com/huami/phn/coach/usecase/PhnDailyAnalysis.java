package com.huami.phn.coach.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lcom/huami/phn/coach/usecase/PhnDailyAnalysis;", "", "Ljava/util/Calendar;", "component1", "", "component2", "component3", "component4", "date", "atl", "ctl", "tsb", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Calendar;", "getDate", "()Ljava/util/Calendar;", "b", "F", "getAtl", "()F", "c", "getCtl", GoogleApiAvailabilityLight.a, "getTsb", "<init>", "(Ljava/util/Calendar;FFF)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PhnDailyAnalysis {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Calendar date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float atl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float ctl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float tsb;

    public PhnDailyAnalysis(@NotNull Calendar calendar, float f, float f2, float f3) {
        this.date = calendar;
        this.atl = f;
        this.ctl = f2;
        this.tsb = f3;
    }

    public static /* synthetic */ PhnDailyAnalysis copy$default(PhnDailyAnalysis phnDailyAnalysis, Calendar calendar, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            calendar = phnDailyAnalysis.date;
        }
        if ((i & 2) != 0) {
            f = phnDailyAnalysis.atl;
        }
        if ((i & 4) != 0) {
            f2 = phnDailyAnalysis.ctl;
        }
        if ((i & 8) != 0) {
            f3 = phnDailyAnalysis.tsb;
        }
        return phnDailyAnalysis.copy(calendar, f, f2, f3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Calendar getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAtl() {
        return this.atl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getCtl() {
        return this.ctl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTsb() {
        return this.tsb;
    }

    @NotNull
    public final PhnDailyAnalysis copy(@NotNull Calendar date, float atl, float ctl, float tsb) {
        return new PhnDailyAnalysis(date, atl, ctl, tsb);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhnDailyAnalysis)) {
            return false;
        }
        PhnDailyAnalysis phnDailyAnalysis = (PhnDailyAnalysis) other;
        return Intrinsics.areEqual(this.date, phnDailyAnalysis.date) && Intrinsics.areEqual((Object) Float.valueOf(this.atl), (Object) Float.valueOf(phnDailyAnalysis.atl)) && Intrinsics.areEqual((Object) Float.valueOf(this.ctl), (Object) Float.valueOf(phnDailyAnalysis.ctl)) && Intrinsics.areEqual((Object) Float.valueOf(this.tsb), (Object) Float.valueOf(phnDailyAnalysis.tsb));
    }

    public final float getAtl() {
        return this.atl;
    }

    public final float getCtl() {
        return this.ctl;
    }

    @NotNull
    public final Calendar getDate() {
        return this.date;
    }

    public final float getTsb() {
        return this.tsb;
    }

    public int hashCode() {
        return (((((this.date.hashCode() * 31) + Float.floatToIntBits(this.atl)) * 31) + Float.floatToIntBits(this.ctl)) * 31) + Float.floatToIntBits(this.tsb);
    }

    @NotNull
    public String toString() {
        return "PhnDailyAnalysis(date=" + this.date + ", atl=" + this.atl + ", ctl=" + this.ctl + ", tsb=" + this.tsb + ")";
    }
}
