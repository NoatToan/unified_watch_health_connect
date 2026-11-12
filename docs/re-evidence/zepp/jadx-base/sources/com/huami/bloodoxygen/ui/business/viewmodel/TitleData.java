package com.huami.bloodoxygen.ui.business.viewmodel;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/bloodoxygen/ui/business/viewmodel/TitleData;", "Lcom/huami/bloodoxygen/ui/business/viewmodel/HistoryViewTypeData;", "", "component1", "component2", "", "component3", "year", "date", "showYear", "copy", "toString", "", "hashCode", "", "other", "equals", "b", "Ljava/lang/String;", "getYear", "()Ljava/lang/String;", "c", "getDate", GoogleApiAvailabilityLight.a, "Z", "getShowYear", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TitleData extends HistoryViewTypeData {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String year;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean showYear;

    public /* synthetic */ TitleData(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z);
    }

    public static /* synthetic */ TitleData copy$default(TitleData titleData, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = titleData.year;
        }
        if ((i & 2) != 0) {
            str2 = titleData.date;
        }
        if ((i & 4) != 0) {
            z = titleData.showYear;
        }
        return titleData.copy(str, str2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowYear() {
        return this.showYear;
    }

    @NotNull
    public final TitleData copy(@NotNull String year, @NotNull String date, boolean showYear) {
        return new TitleData(year, date, showYear);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleData)) {
            return false;
        }
        TitleData titleData = (TitleData) other;
        return Intrinsics.areEqual(this.year, titleData.year) && Intrinsics.areEqual(this.date, titleData.date) && this.showYear == titleData.showYear;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final boolean getShowYear() {
        return this.showYear;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.year.hashCode() * 31) + this.date.hashCode()) * 31;
        boolean z = this.showYear;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "TitleData(year=" + this.year + ", date=" + this.date + ", showYear=" + this.showYear + ")";
    }

    public TitleData(@NotNull String str, @NotNull String str2, boolean z) {
        super(ViewType.TITLE, null);
        this.year = str;
        this.date = str2;
        this.showYear = z;
    }
}
