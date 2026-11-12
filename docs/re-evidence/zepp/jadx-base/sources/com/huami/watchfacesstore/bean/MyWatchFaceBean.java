package com.huami.watchfacesstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.ad.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J|\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b&\u0010\"R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010#\u001a\u0004\b'\u0010%\"\u0004\b(\u0010)R\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b*\u0010%R\u001c\u0010\u0015\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010)R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00100\u001a\u0004\b1\u0010\r\"\u0004\b2\u00103R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010+\u001a\u0004\b\u0018\u0010-\"\u0004\b4\u00105R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010)¨\u0006:"}, d2 = {"Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "", "", "component1", "", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "component10", "builtinId", "deviceImage", "id", "image", "name", "officialBuiltin", "transparentBackground", "color", "isSelected", Constants.GIF_PATH, "copy", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "toString", "hashCode", "other", "equals", LogUtil.I, "getBuiltinId", "()I", "Ljava/lang/String;", "getDeviceImage", "()Ljava/lang/String;", "getId", "getImage", "setImage", "(Ljava/lang/String;)V", "getName", "Z", "getOfficialBuiltin", "()Z", "getTransparentBackground", "setTransparentBackground", "Ljava/lang/Integer;", "getColor", "setColor", "(Ljava/lang/Integer;)V", "setSelected", "(Z)V", "getGif", "setGif", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MyWatchFaceBean {

    @SerializedName("builtin_id")
    private final int builtinId;

    @Nullable
    private Integer color;

    @SerializedName("device_image")
    @Nullable
    private final String deviceImage;

    @Nullable
    private String gif;

    @SerializedName("id")
    private final int id;

    @SerializedName("image")
    @NotNull
    private String image;
    private boolean isSelected;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("official_builtin")
    private final boolean officialBuiltin;

    @SerializedName("transparent_background")
    @Nullable
    private String transparentBackground;

    public MyWatchFaceBean(int i, @Nullable String str, int i2, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4, @Nullable Integer num, boolean z2, @Nullable String str5) {
        this.builtinId = i;
        this.deviceImage = str;
        this.id = i2;
        this.image = str2;
        this.name = str3;
        this.officialBuiltin = z;
        this.transparentBackground = str4;
        this.color = num;
        this.isSelected = z2;
        this.gif = str5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBuiltinId() {
        return this.builtinId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getGif() {
        return this.gif;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceImage() {
        return this.deviceImage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getOfficialBuiltin() {
        return this.officialBuiltin;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransparentBackground() {
        return this.transparentBackground;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final MyWatchFaceBean copy(int builtinId, @Nullable String deviceImage, int id, @NotNull String image, @NotNull String name, boolean officialBuiltin, @Nullable String transparentBackground, @Nullable Integer color, boolean isSelected, @Nullable String gif) {
        return new MyWatchFaceBean(builtinId, deviceImage, id, image, name, officialBuiltin, transparentBackground, color, isSelected, gif);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyWatchFaceBean)) {
            return false;
        }
        MyWatchFaceBean myWatchFaceBean = (MyWatchFaceBean) other;
        return this.builtinId == myWatchFaceBean.builtinId && Intrinsics.areEqual(this.deviceImage, myWatchFaceBean.deviceImage) && this.id == myWatchFaceBean.id && Intrinsics.areEqual(this.image, myWatchFaceBean.image) && Intrinsics.areEqual(this.name, myWatchFaceBean.name) && this.officialBuiltin == myWatchFaceBean.officialBuiltin && Intrinsics.areEqual(this.transparentBackground, myWatchFaceBean.transparentBackground) && Intrinsics.areEqual(this.color, myWatchFaceBean.color) && this.isSelected == myWatchFaceBean.isSelected && Intrinsics.areEqual(this.gif, myWatchFaceBean.gif);
    }

    public final int getBuiltinId() {
        return this.builtinId;
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final String getDeviceImage() {
        return this.deviceImage;
    }

    @Nullable
    public final String getGif() {
        return this.gif;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getOfficialBuiltin() {
        return this.officialBuiltin;
    }

    @Nullable
    public final String getTransparentBackground() {
        return this.transparentBackground;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int i = this.builtinId * 31;
        String str = this.deviceImage;
        int iHashCode = (((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.id) * 31) + this.image.hashCode()) * 31) + this.name.hashCode()) * 31;
        boolean z = this.officialBuiltin;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (iHashCode + r1) * 31;
        String str2 = this.transparentBackground;
        int iHashCode2 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.color;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.isSelected;
        int i3 = (iHashCode3 + (z2 ? 1 : z2)) * 31;
        String str3 = this.gif;
        return i3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setColor(@Nullable Integer num) {
        this.color = num;
    }

    public final void setGif(@Nullable String str) {
        this.gif = str;
    }

    public final void setImage(@NotNull String str) {
        this.image = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setTransparentBackground(@Nullable String str) {
        this.transparentBackground = str;
    }

    @NotNull
    public String toString() {
        return "MyWatchFaceBean(builtinId=" + this.builtinId + ", deviceImage=" + this.deviceImage + ", id=" + this.id + ", image=" + this.image + ", name=" + this.name + ", officialBuiltin=" + this.officialBuiltin + ", transparentBackground=" + this.transparentBackground + ", color=" + this.color + ", isSelected=" + this.isSelected + ", gif=" + this.gif + ")";
    }

    public /* synthetic */ MyWatchFaceBean(int i, String str, int i2, String str2, String str3, boolean z, String str4, Integer num, boolean z2, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, str2, str3, z, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? null : str5);
    }
}
