package com.xiaomi.fitness.watch.face.export.exportview;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/exportview/FaceEntranceDimension;", "", "height", "", "margin", "marginEnd", "marginVertical", "<init>", "(FFFF)V", "getHeight", "()F", "getMargin", "getMarginEnd", "getMarginVertical", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceEntranceDimension {
    private final float height;
    private final float margin;
    private final float marginEnd;
    private final float marginVertical;

    public FaceEntranceDimension(float f, float f2, float f3, float f4) {
        this.height = f;
        this.margin = f2;
        this.marginEnd = f3;
        this.marginVertical = f4;
    }

    public static /* synthetic */ FaceEntranceDimension copy$default(FaceEntranceDimension faceEntranceDimension, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = faceEntranceDimension.height;
        }
        if ((i & 2) != 0) {
            f2 = faceEntranceDimension.margin;
        }
        if ((i & 4) != 0) {
            f3 = faceEntranceDimension.marginEnd;
        }
        if ((i & 8) != 0) {
            f4 = faceEntranceDimension.marginVertical;
        }
        return faceEntranceDimension.copy(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHeight() {
        return this.height;
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
    public final float getMarginVertical() {
        return this.marginVertical;
    }

    @NotNull
    public final FaceEntranceDimension copy(float height, float margin, float marginEnd, float marginVertical) {
        return new FaceEntranceDimension(height, margin, marginEnd, marginVertical);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceEntranceDimension)) {
            return false;
        }
        FaceEntranceDimension faceEntranceDimension = (FaceEntranceDimension) other;
        return Float.compare(this.height, faceEntranceDimension.height) == 0 && Float.compare(this.margin, faceEntranceDimension.margin) == 0 && Float.compare(this.marginEnd, faceEntranceDimension.marginEnd) == 0 && Float.compare(this.marginVertical, faceEntranceDimension.marginVertical) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getMargin() {
        return this.margin;
    }

    public final float getMarginEnd() {
        return this.marginEnd;
    }

    public final float getMarginVertical() {
        return this.marginVertical;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.height) * 31) + Float.hashCode(this.margin)) * 31) + Float.hashCode(this.marginEnd)) * 31) + Float.hashCode(this.marginVertical);
    }

    @NotNull
    public String toString() {
        return "FaceEntranceDimension(height=" + this.height + ", margin=" + this.margin + ", marginEnd=" + this.marginEnd + ", marginVertical=" + this.marginVertical + ")";
    }
}
