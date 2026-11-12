package com.xiaomi.fitness.watch.face.export.exportview;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/exportview/FaceCategoryDimension;", "", "width", "", "margin", "marginEnd", "<init>", "(FFF)V", "getWidth", "()F", "getMargin", "getMarginEnd", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceCategoryDimension {
    private final float margin;
    private final float marginEnd;
    private final float width;

    public FaceCategoryDimension(float f, float f2, float f3) {
        this.width = f;
        this.margin = f2;
        this.marginEnd = f3;
    }

    public static /* synthetic */ FaceCategoryDimension copy$default(FaceCategoryDimension faceCategoryDimension, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = faceCategoryDimension.width;
        }
        if ((i & 2) != 0) {
            f2 = faceCategoryDimension.margin;
        }
        if ((i & 4) != 0) {
            f3 = faceCategoryDimension.marginEnd;
        }
        return faceCategoryDimension.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMarginEnd() {
        return this.marginEnd;
    }

    @NotNull
    public final FaceCategoryDimension copy(float width, float margin, float marginEnd) {
        return new FaceCategoryDimension(width, margin, marginEnd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceCategoryDimension)) {
            return false;
        }
        FaceCategoryDimension faceCategoryDimension = (FaceCategoryDimension) other;
        return Float.compare(this.width, faceCategoryDimension.width) == 0 && Float.compare(this.margin, faceCategoryDimension.margin) == 0 && Float.compare(this.marginEnd, faceCategoryDimension.marginEnd) == 0;
    }

    public final float getMargin() {
        return this.margin;
    }

    public final float getMarginEnd() {
        return this.marginEnd;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((Float.hashCode(this.width) * 31) + Float.hashCode(this.margin)) * 31) + Float.hashCode(this.marginEnd);
    }

    @NotNull
    public String toString() {
        return "FaceCategoryDimension(width=" + this.width + ", margin=" + this.margin + ", marginEnd=" + this.marginEnd + ")";
    }
}
