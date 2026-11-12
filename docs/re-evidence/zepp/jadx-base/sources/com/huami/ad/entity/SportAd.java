package com.huami.ad.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003Jo\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R\u001c\u0010\u0014\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0015\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/huami/ad/entity/SportAd;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "Lcom/huami/ad/entity/AdExtension;", "component9", "id", "title", "subTitle", "image", "describe", "target", "mode", "status", GPXTrackPoint.XML.TAG_EXTENSIONS, "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getTitle", "c", "getSubTitle", GoogleApiAvailabilityLight.a, "getImage", "e", "getDescribe", "f", "getTarget", "g", LogUtil.I, "getMode", "()I", "h", "getStatus", "i", "Lcom/huami/ad/entity/AdExtension;", "getExtensions", "()Lcom/huami/ad/entity/AdExtension;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/huami/ad/entity/AdExtension;)V", "ad_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportAd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("sub_title")
    @Nullable
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("image")
    @Nullable
    private final String image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("describe")
    @Nullable
    private final String describe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("target")
    @Nullable
    private final String target;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("mode")
    private final int mode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    private final int status;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName(GPXTrackPoint.XML.TAG_EXTENSIONS)
    @Nullable
    private final AdExtension extensions;

    public SportAd(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, int i2, @Nullable AdExtension adExtension) {
        this.id = str;
        this.title = str2;
        this.subTitle = str3;
        this.image = str4;
        this.describe = str5;
        this.target = str6;
        this.mode = i;
        this.status = i2;
        this.extensions = adExtension;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescribe() {
        return this.describe;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AdExtension getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final SportAd copy(@NotNull String id, @Nullable String title, @Nullable String subTitle, @Nullable String image, @Nullable String describe, @Nullable String target, int mode, int status, @Nullable AdExtension extensions) {
        return new SportAd(id, title, subTitle, image, describe, target, mode, status, extensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportAd)) {
            return false;
        }
        SportAd sportAd = (SportAd) other;
        return Intrinsics.areEqual(this.id, sportAd.id) && Intrinsics.areEqual(this.title, sportAd.title) && Intrinsics.areEqual(this.subTitle, sportAd.subTitle) && Intrinsics.areEqual(this.image, sportAd.image) && Intrinsics.areEqual(this.describe, sportAd.describe) && Intrinsics.areEqual(this.target, sportAd.target) && this.mode == sportAd.mode && this.status == sportAd.status && Intrinsics.areEqual(this.extensions, sportAd.extensions);
    }

    @Nullable
    public final String getDescribe() {
        return this.describe;
    }

    @Nullable
    public final AdExtension getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.describe;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.target;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.mode) * 31) + this.status) * 31;
        AdExtension adExtension = this.extensions;
        return iHashCode6 + (adExtension != null ? adExtension.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SportAd(id=" + this.id + ", title=" + ((Object) this.title) + ", subTitle=" + ((Object) this.subTitle) + ", image=" + ((Object) this.image) + ", describe=" + ((Object) this.describe) + ", target=" + ((Object) this.target) + ", mode=" + this.mode + ", status=" + this.status + ", extensions=" + this.extensions + ')';
    }

    public /* synthetic */ SportAd(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, AdExtension adExtension, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, adExtension);
    }
}
