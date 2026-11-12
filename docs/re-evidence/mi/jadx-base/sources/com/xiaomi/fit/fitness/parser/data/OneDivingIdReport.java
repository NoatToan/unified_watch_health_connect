package com.xiaomi.fit.fitness.parser.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/OneDivingIdReport;", "", "diveAreaId", "", "diveCountryId", "<init>", "(II)V", "getDiveAreaId", "()I", "setDiveAreaId", "(I)V", "getDiveCountryId", "setDiveCountryId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OneDivingIdReport {

    @SerializedName("dive_point_id")
    private int diveAreaId;

    @SerializedName("dive_country_id")
    private int diveCountryId;

    public OneDivingIdReport(int i, int i2) {
        this.diveAreaId = i;
        this.diveCountryId = i2;
    }

    public static /* synthetic */ OneDivingIdReport copy$default(OneDivingIdReport oneDivingIdReport, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = oneDivingIdReport.diveAreaId;
        }
        if ((i3 & 2) != 0) {
            i2 = oneDivingIdReport.diveCountryId;
        }
        return oneDivingIdReport.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDiveAreaId() {
        return this.diveAreaId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDiveCountryId() {
        return this.diveCountryId;
    }

    @NotNull
    public final OneDivingIdReport copy(int diveAreaId, int diveCountryId) {
        return new OneDivingIdReport(diveAreaId, diveCountryId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneDivingIdReport)) {
            return false;
        }
        OneDivingIdReport oneDivingIdReport = (OneDivingIdReport) other;
        return this.diveAreaId == oneDivingIdReport.diveAreaId && this.diveCountryId == oneDivingIdReport.diveCountryId;
    }

    public final int getDiveAreaId() {
        return this.diveAreaId;
    }

    public final int getDiveCountryId() {
        return this.diveCountryId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.diveAreaId) * 31) + Integer.hashCode(this.diveCountryId);
    }

    public final void setDiveAreaId(int i) {
        this.diveAreaId = i;
    }

    public final void setDiveCountryId(int i) {
        this.diveCountryId = i;
    }

    @NotNull
    public String toString() {
        return "OneDivingIdReport(diveAreaId=" + this.diveAreaId + ", diveCountryId=" + this.diveCountryId + ")";
    }
}
