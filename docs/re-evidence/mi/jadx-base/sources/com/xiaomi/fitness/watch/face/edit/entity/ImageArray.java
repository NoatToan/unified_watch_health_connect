package com.xiaomi.fitness.watch.face.edit.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/ImageArray;", "", "name", "", "recolorEnable", "", "imgFormat", "imageList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/Image;", "colorGroup", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRecolorEnable", "()Z", "getImgFormat", "getImageList", "()Ljava/util/List;", "getColorGroup", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageArray {

    @Nullable
    private final String colorGroup;

    @Nullable
    private final List<Image> imageList;

    @Nullable
    private final String imgFormat;

    @Nullable
    private final String name;
    private final boolean recolorEnable;

    public ImageArray() {
        this(null, false, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageArray copy$default(ImageArray imageArray, String str, boolean z, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageArray.name;
        }
        if ((i & 2) != 0) {
            z = imageArray.recolorEnable;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = imageArray.imgFormat;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = imageArray.imageList;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str3 = imageArray.colorGroup;
        }
        return imageArray.copy(str, z2, str4, list2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRecolorEnable() {
        return this.recolorEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImgFormat() {
        return this.imgFormat;
    }

    @Nullable
    public final List<Image> component4() {
        return this.imageList;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColorGroup() {
        return this.colorGroup;
    }

    @NotNull
    public final ImageArray copy(@Nullable String name, boolean recolorEnable, @Nullable String imgFormat, @Nullable List<Image> imageList, @Nullable String colorGroup) {
        return new ImageArray(name, recolorEnable, imgFormat, imageList, colorGroup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageArray)) {
            return false;
        }
        ImageArray imageArray = (ImageArray) other;
        return Intrinsics.areEqual(this.name, imageArray.name) && this.recolorEnable == imageArray.recolorEnable && Intrinsics.areEqual(this.imgFormat, imageArray.imgFormat) && Intrinsics.areEqual(this.imageList, imageArray.imageList) && Intrinsics.areEqual(this.colorGroup, imageArray.colorGroup);
    }

    @Nullable
    public final String getColorGroup() {
        return this.colorGroup;
    }

    @Nullable
    public final List<Image> getImageList() {
        return this.imageList;
    }

    @Nullable
    public final String getImgFormat() {
        return this.imgFormat;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getRecolorEnable() {
        return this.recolorEnable;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.recolorEnable)) * 31;
        String str2 = this.imgFormat;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Image> list = this.imageList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.colorGroup;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ImageArray(name=" + this.name + ", recolorEnable=" + this.recolorEnable + ", imgFormat=" + this.imgFormat + ", imageList=" + this.imageList + ", colorGroup=" + this.colorGroup + ")";
    }

    public ImageArray(@Nullable String str, boolean z, @Nullable String str2, @Nullable List<Image> list, @Nullable String str3) {
        this.name = str;
        this.recolorEnable = z;
        this.imgFormat = str2;
        this.imageList = list;
        this.colorGroup = str3;
    }

    public /* synthetic */ ImageArray(String str, boolean z, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str3);
    }
}
