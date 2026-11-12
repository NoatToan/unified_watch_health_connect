package com.xiaomi.fitness.health.sleep.view.widget;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/view/widget/DonutPieceModel;", "", "percentage", "", "colorResId", "", "pieceTitle", "", "<init>", "(FILjava/lang/String;)V", "getPercentage", "()F", "getColorResId", "()I", "getPieceTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DonutPieceModel {
    private final int colorResId;
    private final float percentage;

    @NotNull
    private final String pieceTitle;

    public DonutPieceModel(float f, int i, @NotNull String pieceTitle) {
        Intrinsics.checkNotNullParameter(pieceTitle, "pieceTitle");
        this.percentage = f;
        this.colorResId = i;
        this.pieceTitle = pieceTitle;
    }

    public static /* synthetic */ DonutPieceModel copy$default(DonutPieceModel donutPieceModel, float f, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = donutPieceModel.percentage;
        }
        if ((i2 & 2) != 0) {
            i = donutPieceModel.colorResId;
        }
        if ((i2 & 4) != 0) {
            str = donutPieceModel.pieceTitle;
        }
        return donutPieceModel.copy(f, i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getColorResId() {
        return this.colorResId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPieceTitle() {
        return this.pieceTitle;
    }

    @NotNull
    public final DonutPieceModel copy(float percentage, int colorResId, @NotNull String pieceTitle) {
        Intrinsics.checkNotNullParameter(pieceTitle, "pieceTitle");
        return new DonutPieceModel(percentage, colorResId, pieceTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DonutPieceModel)) {
            return false;
        }
        DonutPieceModel donutPieceModel = (DonutPieceModel) other;
        return Float.compare(this.percentage, donutPieceModel.percentage) == 0 && this.colorResId == donutPieceModel.colorResId && Intrinsics.areEqual(this.pieceTitle, donutPieceModel.pieceTitle);
    }

    public final int getColorResId() {
        return this.colorResId;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final String getPieceTitle() {
        return this.pieceTitle;
    }

    public int hashCode() {
        return (((Float.hashCode(this.percentage) * 31) + Integer.hashCode(this.colorResId)) * 31) + this.pieceTitle.hashCode();
    }

    @NotNull
    public String toString() {
        return "DonutPieceModel(percentage=" + this.percentage + ", colorResId=" + this.colorResId + ", pieceTitle=" + this.pieceTitle + ")";
    }
}
