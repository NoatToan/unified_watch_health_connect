package com.xiaomi.fitness.watch.face.export.exportview;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/exportview/FaceMarketPhotoDimension;", "", "width", "", "margin", "marginEnd", "marginTop", "marginBottom", "<init>", "(FFFFF)V", "getWidth", "()F", "getMargin", "getMarginEnd", "getMarginTop", "getMarginBottom", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceMarketPhotoDimension {
    private final float margin;
    private final float marginBottom;
    private final float marginEnd;
    private final float marginTop;
    private final float width;

    public FaceMarketPhotoDimension(float f, float f2, float f3, float f4, float f5) {
        this.width = f;
        this.margin = f2;
        this.marginEnd = f3;
        this.marginTop = f4;
        this.marginBottom = f5;
    }

    public static /* synthetic */ FaceMarketPhotoDimension copy$default(FaceMarketPhotoDimension faceMarketPhotoDimension, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = faceMarketPhotoDimension.width;
        }
        if ((i & 2) != 0) {
            f2 = faceMarketPhotoDimension.margin;
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = faceMarketPhotoDimension.marginEnd;
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = faceMarketPhotoDimension.marginTop;
        }
        float f8 = f4;
        if ((i & 16) != 0) {
            f5 = faceMarketPhotoDimension.marginBottom;
        }
        return faceMarketPhotoDimension.copy(f, f6, f7, f8, f5);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getMarginTop() {
        return this.marginTop;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getMarginBottom() {
        return this.marginBottom;
    }

    @NotNull
    public final FaceMarketPhotoDimension copy(float width, float margin, float marginEnd, float marginTop, float marginBottom) {
        return new FaceMarketPhotoDimension(width, margin, marginEnd, marginTop, marginBottom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceMarketPhotoDimension)) {
            return false;
        }
        FaceMarketPhotoDimension faceMarketPhotoDimension = (FaceMarketPhotoDimension) other;
        return Float.compare(this.width, faceMarketPhotoDimension.width) == 0 && Float.compare(this.margin, faceMarketPhotoDimension.margin) == 0 && Float.compare(this.marginEnd, faceMarketPhotoDimension.marginEnd) == 0 && Float.compare(this.marginTop, faceMarketPhotoDimension.marginTop) == 0 && Float.compare(this.marginBottom, faceMarketPhotoDimension.marginBottom) == 0;
    }

    public final float getMargin() {
        return this.margin;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    public final float getMarginEnd() {
        return this.marginEnd;
    }

    public final float getMarginTop() {
        return this.marginTop;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.margin)) * 31) + Float.hashCode(this.marginEnd)) * 31) + Float.hashCode(this.marginTop)) * 31) + Float.hashCode(this.marginBottom);
    }

    @NotNull
    public String toString() {
        return "FaceMarketPhotoDimension(width=" + this.width + ", margin=" + this.margin + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ")";
    }
}
