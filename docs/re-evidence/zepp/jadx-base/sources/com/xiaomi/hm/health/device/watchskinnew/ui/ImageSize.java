package com.xiaomi.hm.health.device.watchskinnew.ui;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/ImageSize;", "", "", "component1", "component2", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getWidth", "()I", "b", "getHeight", "<init>", "(II)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ImageSize {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int height;

    public ImageSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ ImageSize copy$default(ImageSize imageSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = imageSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = imageSize.height;
        }
        return imageSize.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final ImageSize copy(int width, int height) {
        return new ImageSize(width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSize)) {
            return false;
        }
        ImageSize imageSize = (ImageSize) other;
        return this.width == imageSize.width && this.height == imageSize.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    @NotNull
    public String toString() {
        return "ImageSize(width=" + this.width + ", height=" + this.height + ")";
    }
}
