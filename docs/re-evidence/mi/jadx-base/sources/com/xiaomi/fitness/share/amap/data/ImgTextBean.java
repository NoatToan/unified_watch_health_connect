package com.xiaomi.fitness.share.amap.data;

import android.net.Uri;
import com.amap.api.maps.model.Marker;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003Je\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001J\u0013\u00106\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u000eHÖ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0011\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/share/amap/data/ImgTextBean;", "", "latlng", "Lcom/xiaomi/fit/data/common/data/sport/Location;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "feelings", "", "imgUriList", "", "Landroid/net/Uri;", "isShowImgTextMarker", "", "bgResource", "", "marker", "Lcom/amap/api/maps/model/Marker;", "index", "<init>", "(Lcom/xiaomi/fit/data/common/data/sport/Location;FLjava/lang/String;Ljava/util/List;ZILcom/amap/api/maps/model/Marker;I)V", "getLatlng", "()Lcom/xiaomi/fit/data/common/data/sport/Location;", "getProgress", "()F", "getFeelings", "()Ljava/lang/String;", "setFeelings", "(Ljava/lang/String;)V", "getImgUriList", "()Ljava/util/List;", "setImgUriList", "(Ljava/util/List;)V", "()Z", "setShowImgTextMarker", "(Z)V", "getBgResource", "()I", "setBgResource", "(I)V", "getMarker", "()Lcom/amap/api/maps/model/Marker;", "setMarker", "(Lcom/amap/api/maps/model/Marker;)V", "getIndex", "setIndex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImgTextBean {
    private int bgResource;

    @Nullable
    private String feelings;

    @Nullable
    private List<? extends Uri> imgUriList;
    private int index;
    private boolean isShowImgTextMarker;

    @NotNull
    private final Location latlng;

    @Nullable
    private Marker marker;
    private final float progress;

    public ImgTextBean(@NotNull Location latlng, float f, @Nullable String str, @Nullable List<? extends Uri> list, boolean z, int i, @Nullable Marker marker, int i2) {
        Intrinsics.checkNotNullParameter(latlng, "latlng");
        this.latlng = latlng;
        this.progress = f;
        this.feelings = str;
        this.imgUriList = list;
        this.isShowImgTextMarker = z;
        this.bgResource = i;
        this.marker = marker;
        this.index = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Location getLatlng() {
        return this.latlng;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeelings() {
        return this.feelings;
    }

    @Nullable
    public final List<Uri> component4() {
        return this.imgUriList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsShowImgTextMarker() {
        return this.isShowImgTextMarker;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBgResource() {
        return this.bgResource;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Marker getMarker() {
        return this.marker;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final ImgTextBean copy(@NotNull Location latlng, float progress, @Nullable String feelings, @Nullable List<? extends Uri> imgUriList, boolean isShowImgTextMarker, int bgResource, @Nullable Marker marker, int index) {
        Intrinsics.checkNotNullParameter(latlng, "latlng");
        return new ImgTextBean(latlng, progress, feelings, imgUriList, isShowImgTextMarker, bgResource, marker, index);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImgTextBean)) {
            return false;
        }
        ImgTextBean imgTextBean = (ImgTextBean) other;
        return Intrinsics.areEqual(this.latlng, imgTextBean.latlng) && Float.compare(this.progress, imgTextBean.progress) == 0 && Intrinsics.areEqual(this.feelings, imgTextBean.feelings) && Intrinsics.areEqual(this.imgUriList, imgTextBean.imgUriList) && this.isShowImgTextMarker == imgTextBean.isShowImgTextMarker && this.bgResource == imgTextBean.bgResource && Intrinsics.areEqual(this.marker, imgTextBean.marker) && this.index == imgTextBean.index;
    }

    public final int getBgResource() {
        return this.bgResource;
    }

    @Nullable
    public final String getFeelings() {
        return this.feelings;
    }

    @Nullable
    public final List<Uri> getImgUriList() {
        return this.imgUriList;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Location getLatlng() {
        return this.latlng;
    }

    @Nullable
    public final Marker getMarker() {
        return this.marker;
    }

    public final float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iHashCode = ((this.latlng.hashCode() * 31) + Float.hashCode(this.progress)) * 31;
        String str = this.feelings;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<? extends Uri> list = this.imgUriList;
        int iHashCode3 = (((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isShowImgTextMarker)) * 31) + Integer.hashCode(this.bgResource)) * 31;
        Marker marker = this.marker;
        return ((iHashCode3 + (marker != null ? marker.hashCode() : 0)) * 31) + Integer.hashCode(this.index);
    }

    public final boolean isShowImgTextMarker() {
        return this.isShowImgTextMarker;
    }

    public final void setBgResource(int i) {
        this.bgResource = i;
    }

    public final void setFeelings(@Nullable String str) {
        this.feelings = str;
    }

    public final void setImgUriList(@Nullable List<? extends Uri> list) {
        this.imgUriList = list;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setMarker(@Nullable Marker marker) {
        this.marker = marker;
    }

    public final void setShowImgTextMarker(boolean z) {
        this.isShowImgTextMarker = z;
    }

    @NotNull
    public String toString() {
        return "ImgTextBean(latlng=" + this.latlng + ", progress=" + this.progress + ", feelings=" + this.feelings + ", imgUriList=" + this.imgUriList + ", isShowImgTextMarker=" + this.isShowImgTextMarker + ", bgResource=" + this.bgResource + ", marker=" + this.marker + ", index=" + this.index + ")";
    }

    public /* synthetic */ ImgTextBean(Location location, float f, String str, List list, boolean z, int i, Marker marker, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(location, f, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? true : z, i, (i3 & 64) != 0 ? null : marker, i2);
    }
}
