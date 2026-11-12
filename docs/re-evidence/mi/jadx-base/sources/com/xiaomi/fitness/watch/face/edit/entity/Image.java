package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/Image;", "", "name", "", "src", "recolorEnable", "", "format", "color", "colorGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSrc", "getRecolorEnable", "()Z", "setRecolorEnable", "(Z)V", "getFormat", "getColor", "setColor", "(Ljava/lang/String;)V", "getColorGroup", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Image {

    @Nullable
    private String color;

    @Nullable
    private final String colorGroup;

    @Nullable
    private final String format;

    @Nullable
    private final String name;
    private boolean recolorEnable;

    @Nullable
    private final String src;

    public Image() {
        this(null, null, false, null, null, null, 63, null);
    }

    public static /* synthetic */ Image copy$default(Image image, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = image.name;
        }
        if ((i & 2) != 0) {
            str2 = image.src;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            z = image.recolorEnable;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = image.format;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = image.color;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = image.colorGroup;
        }
        return image.copy(str, str6, z2, str7, str8, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRecolorEnable() {
        return this.recolorEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getColorGroup() {
        return this.colorGroup;
    }

    @NotNull
    public final Image copy(@Nullable String name, @Nullable String src, boolean recolorEnable, @Nullable String format, @Nullable String color, @Nullable String colorGroup) {
        return new Image(name, src, recolorEnable, format, color, colorGroup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Image)) {
            return false;
        }
        Image image = (Image) other;
        return Intrinsics.areEqual(this.name, image.name) && Intrinsics.areEqual(this.src, image.src) && this.recolorEnable == image.recolorEnable && Intrinsics.areEqual(this.format, image.format) && Intrinsics.areEqual(this.color, image.color) && Intrinsics.areEqual(this.colorGroup, image.colorGroup);
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getColorGroup() {
        return this.colorGroup;
    }

    @Nullable
    public final String getFormat() {
        return this.format;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getRecolorEnable() {
        return this.recolorEnable;
    }

    @Nullable
    public final String getSrc() {
        return this.src;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.src;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.recolorEnable)) * 31;
        String str3 = this.format;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.colorGroup;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setRecolorEnable(boolean z) {
        this.recolorEnable = z;
    }

    @NotNull
    public String toString() {
        return "Image(name=" + this.name + ", src=" + this.src + ", recolorEnable=" + this.recolorEnable + ", format=" + this.format + ", color=" + this.color + ", colorGroup=" + this.colorGroup + ")";
    }

    public Image(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.name = str;
        this.src = str2;
        this.recolorEnable = z;
        this.format = str3;
        this.color = str4;
        this.colorGroup = str5;
    }

    public /* synthetic */ Image(String str, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
