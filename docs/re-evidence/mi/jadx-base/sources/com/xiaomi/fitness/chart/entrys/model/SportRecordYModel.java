package com.xiaomi.fitness.chart.entrys.model;

import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/model/SportRecordYModel;", "", "sportRecordTitle", "", Constants.KEY_RECHARGE_MAXVALUE, "", Constants.KEY_RECHARGE_MINVALUE, "<init>", "(Ljava/lang/String;FF)V", "getSportRecordTitle", "()Ljava/lang/String;", "setSportRecordTitle", "(Ljava/lang/String;)V", "getMaxValue", "()F", "setMaxValue", "(F)V", "getMinValue", "setMinValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRecordYModel {
    private float maxValue;
    private float minValue;

    @NotNull
    private String sportRecordTitle;

    public SportRecordYModel(@NotNull String sportRecordTitle, float f, float f2) {
        Intrinsics.checkNotNullParameter(sportRecordTitle, "sportRecordTitle");
        this.sportRecordTitle = sportRecordTitle;
        this.maxValue = f;
        this.minValue = f2;
    }

    public static /* synthetic */ SportRecordYModel copy$default(SportRecordYModel sportRecordYModel, String str, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportRecordYModel.sportRecordTitle;
        }
        if ((i & 2) != 0) {
            f = sportRecordYModel.maxValue;
        }
        if ((i & 4) != 0) {
            f2 = sportRecordYModel.minValue;
        }
        return sportRecordYModel.copy(str, f, f2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportRecordTitle() {
        return this.sportRecordTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final SportRecordYModel copy(@NotNull String sportRecordTitle, float maxValue, float minValue) {
        Intrinsics.checkNotNullParameter(sportRecordTitle, "sportRecordTitle");
        return new SportRecordYModel(sportRecordTitle, maxValue, minValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecordYModel)) {
            return false;
        }
        SportRecordYModel sportRecordYModel = (SportRecordYModel) other;
        return Intrinsics.areEqual(this.sportRecordTitle, sportRecordYModel.sportRecordTitle) && Float.compare(this.maxValue, sportRecordYModel.maxValue) == 0 && Float.compare(this.minValue, sportRecordYModel.minValue) == 0;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final String getSportRecordTitle() {
        return this.sportRecordTitle;
    }

    public int hashCode() {
        return (((this.sportRecordTitle.hashCode() * 31) + Float.hashCode(this.maxValue)) * 31) + Float.hashCode(this.minValue);
    }

    public final void setMaxValue(float f) {
        this.maxValue = f;
    }

    public final void setMinValue(float f) {
        this.minValue = f;
    }

    public final void setSportRecordTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sportRecordTitle = str;
    }

    @NotNull
    public String toString() {
        return "SportRecordYModel(sportRecordTitle=" + this.sportRecordTitle + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ")";
    }
}
