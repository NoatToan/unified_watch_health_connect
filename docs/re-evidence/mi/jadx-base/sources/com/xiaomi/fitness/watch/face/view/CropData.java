package com.xiaomi.fitness.watch.face.view;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/CropData;", "Ljava/io/Serializable;", "startX", "", "startY", "width", "<init>", "(FFF)V", "getStartX", "()F", "getStartY", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CropData implements Serializable {
    private final float startX;
    private final float startY;
    private final float width;

    public CropData(float f, float f2, float f3) {
        this.startX = f;
        this.startY = f2;
        this.width = f3;
    }

    public static /* synthetic */ CropData copy$default(CropData cropData, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cropData.startX;
        }
        if ((i & 2) != 0) {
            f2 = cropData.startY;
        }
        if ((i & 4) != 0) {
            f3 = cropData.width;
        }
        return cropData.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStartX() {
        return this.startX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getStartY() {
        return this.startY;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    @NotNull
    public final CropData copy(float startX, float startY, float width) {
        return new CropData(startX, startY, width);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropData)) {
            return false;
        }
        CropData cropData = (CropData) other;
        return Float.compare(this.startX, cropData.startX) == 0 && Float.compare(this.startY, cropData.startY) == 0 && Float.compare(this.width, cropData.width) == 0;
    }

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((Float.hashCode(this.startX) * 31) + Float.hashCode(this.startY)) * 31) + Float.hashCode(this.width);
    }

    @NotNull
    public String toString() {
        return "CropData(startX=" + this.startX + ", startY=" + this.startY + ", width=" + this.width + ")";
    }
}
