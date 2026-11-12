package com.xiaomi.fitness.detail.model;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.detail.view.StickerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J`\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010#\"\u0004\b$\u0010%¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "", "drawableID", "", "drawableUri", "Landroid/net/Uri;", "editString", "", "chartKey", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "watermarkView", "Lcom/xiaomi/fitness/detail/view/StickerView;", "viewDrawable", "Landroid/graphics/drawable/Drawable;", "isSelect", "", "<init>", "(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Lcom/xiaomi/fitness/detail/view/StickerView;Landroid/graphics/drawable/Drawable;Z)V", "getDrawableID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDrawableUri", "()Landroid/net/Uri;", "getEditString", "()Ljava/lang/String;", "getChartKey", "()Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "getWatermarkView", "()Lcom/xiaomi/fitness/detail/view/StickerView;", "setWatermarkView", "(Lcom/xiaomi/fitness/detail/view/StickerView;)V", "getViewDrawable", "()Landroid/graphics/drawable/Drawable;", "setViewDrawable", "(Landroid/graphics/drawable/Drawable;)V", "()Z", "setSelect", "(Z)V", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Lcom/xiaomi/fitness/detail/view/StickerView;Landroid/graphics/drawable/Drawable;Z)Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "equals", "other", "hashCode", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportRecordShareModel {

    @Nullable
    private final SportRecordKey chartKey;

    @Nullable
    private final Integer drawableID;

    @Nullable
    private final Uri drawableUri;

    @Nullable
    private final String editString;
    private boolean isSelect;

    @Nullable
    private Drawable viewDrawable;

    @Nullable
    private StickerView watermarkView;

    public SportRecordShareModel() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ SportRecordShareModel copy$default(SportRecordShareModel sportRecordShareModel, Integer num, Uri uri, String str, SportRecordKey sportRecordKey, StickerView stickerView, Drawable drawable, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sportRecordShareModel.drawableID;
        }
        if ((i & 2) != 0) {
            uri = sportRecordShareModel.drawableUri;
        }
        Uri uri2 = uri;
        if ((i & 4) != 0) {
            str = sportRecordShareModel.editString;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            sportRecordKey = sportRecordShareModel.chartKey;
        }
        SportRecordKey sportRecordKey2 = sportRecordKey;
        if ((i & 16) != 0) {
            stickerView = sportRecordShareModel.watermarkView;
        }
        StickerView stickerView2 = stickerView;
        if ((i & 32) != 0) {
            drawable = sportRecordShareModel.viewDrawable;
        }
        Drawable drawable2 = drawable;
        if ((i & 64) != 0) {
            z = sportRecordShareModel.isSelect;
        }
        return sportRecordShareModel.copy(num, uri2, str2, sportRecordKey2, stickerView2, drawable2, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getDrawableID() {
        return this.drawableID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Uri getDrawableUri() {
        return this.drawableUri;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEditString() {
        return this.editString;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SportRecordKey getChartKey() {
        return this.chartKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StickerView getWatermarkView() {
        return this.watermarkView;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Drawable getViewDrawable() {
        return this.viewDrawable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final SportRecordShareModel copy(@Nullable Integer drawableID, @Nullable Uri drawableUri, @Nullable String editString, @Nullable SportRecordKey chartKey, @Nullable StickerView watermarkView, @Nullable Drawable viewDrawable, boolean isSelect) {
        return new SportRecordShareModel(drawableID, drawableUri, editString, chartKey, watermarkView, viewDrawable, isSelect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecordShareModel)) {
            return false;
        }
        SportRecordShareModel sportRecordShareModel = (SportRecordShareModel) other;
        return Intrinsics.areEqual(this.drawableID, sportRecordShareModel.drawableID) && Intrinsics.areEqual(this.drawableUri, sportRecordShareModel.drawableUri) && Intrinsics.areEqual(this.editString, sportRecordShareModel.editString) && this.chartKey == sportRecordShareModel.chartKey && Intrinsics.areEqual(this.watermarkView, sportRecordShareModel.watermarkView) && Intrinsics.areEqual(this.viewDrawable, sportRecordShareModel.viewDrawable) && this.isSelect == sportRecordShareModel.isSelect;
    }

    @Nullable
    public final SportRecordKey getChartKey() {
        return this.chartKey;
    }

    @Nullable
    public final Integer getDrawableID() {
        return this.drawableID;
    }

    @Nullable
    public final Uri getDrawableUri() {
        return this.drawableUri;
    }

    @Nullable
    public final String getEditString() {
        return this.editString;
    }

    @Nullable
    public final Drawable getViewDrawable() {
        return this.viewDrawable;
    }

    @Nullable
    public final StickerView getWatermarkView() {
        return this.watermarkView;
    }

    public int hashCode() {
        Integer num = this.drawableID;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Uri uri = this.drawableUri;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.editString;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SportRecordKey sportRecordKey = this.chartKey;
        int iHashCode4 = (iHashCode3 + (sportRecordKey == null ? 0 : sportRecordKey.hashCode())) * 31;
        StickerView stickerView = this.watermarkView;
        int iHashCode5 = (iHashCode4 + (stickerView == null ? 0 : stickerView.hashCode())) * 31;
        Drawable drawable = this.viewDrawable;
        return ((iHashCode5 + (drawable != null ? drawable.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSelect);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final void setViewDrawable(@Nullable Drawable drawable) {
        this.viewDrawable = drawable;
    }

    public final void setWatermarkView(@Nullable StickerView stickerView) {
        this.watermarkView = stickerView;
    }

    @NotNull
    public String toString() {
        return "SportRecordShareModel(drawableID=" + this.drawableID + ", drawableUri=" + this.drawableUri + ", editString=" + this.editString + ", chartKey=" + this.chartKey + ", watermarkView=" + this.watermarkView + ", viewDrawable=" + this.viewDrawable + ", isSelect=" + this.isSelect + ")";
    }

    public SportRecordShareModel(@Nullable Integer num, @Nullable Uri uri, @Nullable String str, @Nullable SportRecordKey sportRecordKey, @Nullable StickerView stickerView, @Nullable Drawable drawable, boolean z) {
        this.drawableID = num;
        this.drawableUri = uri;
        this.editString = str;
        this.chartKey = sportRecordKey;
        this.watermarkView = stickerView;
        this.viewDrawable = drawable;
        this.isSelect = z;
    }

    public /* synthetic */ SportRecordShareModel(Integer num, Uri uri, String str, SportRecordKey sportRecordKey, StickerView stickerView, Drawable drawable, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : sportRecordKey, (i & 16) != 0 ? null : stickerView, (i & 32) == 0 ? drawable : null, (i & 64) != 0 ? false : z);
    }
}
