package com.xiaomi.fitness.electronic.scale.model;

import android.graphics.Bitmap;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/DataReportBean;", "Ljava/io/Serializable;", "imgBitmap", "Landroid/graphics/Bitmap;", "imgPath", "", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "getImgBitmap", "()Landroid/graphics/Bitmap;", "setImgBitmap", "(Landroid/graphics/Bitmap;)V", "getImgPath", "()Ljava/lang/String;", "setImgPath", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataReportBean implements Serializable {

    @Nullable
    private Bitmap imgBitmap;

    @NotNull
    private String imgPath;

    /* JADX WARN: Multi-variable type inference failed */
    public DataReportBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DataReportBean copy$default(DataReportBean dataReportBean, Bitmap bitmap, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = dataReportBean.imgBitmap;
        }
        if ((i & 2) != 0) {
            str = dataReportBean.imgPath;
        }
        return dataReportBean.copy(bitmap, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getImgBitmap() {
        return this.imgBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgPath() {
        return this.imgPath;
    }

    @NotNull
    public final DataReportBean copy(@Nullable Bitmap imgBitmap, @NotNull String imgPath) {
        Intrinsics.checkNotNullParameter(imgPath, "imgPath");
        return new DataReportBean(imgBitmap, imgPath);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataReportBean)) {
            return false;
        }
        DataReportBean dataReportBean = (DataReportBean) other;
        return Intrinsics.areEqual(this.imgBitmap, dataReportBean.imgBitmap) && Intrinsics.areEqual(this.imgPath, dataReportBean.imgPath);
    }

    @Nullable
    public final Bitmap getImgBitmap() {
        return this.imgBitmap;
    }

    @NotNull
    public final String getImgPath() {
        return this.imgPath;
    }

    public int hashCode() {
        Bitmap bitmap = this.imgBitmap;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.imgPath.hashCode();
    }

    public final void setImgBitmap(@Nullable Bitmap bitmap) {
        this.imgBitmap = bitmap;
    }

    public final void setImgPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imgPath = str;
    }

    @NotNull
    public String toString() {
        return "DataReportBean(imgBitmap=" + this.imgBitmap + ", imgPath=" + this.imgPath + ")";
    }

    public DataReportBean(@Nullable Bitmap bitmap, @NotNull String imgPath) {
        Intrinsics.checkNotNullParameter(imgPath, "imgPath");
        this.imgBitmap = bitmap;
        this.imgPath = imgPath;
    }

    public /* synthetic */ DataReportBean(Bitmap bitmap, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? "" : str);
    }
}
