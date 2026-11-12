package com.huami.homepage.promotion.beans;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/huami/homepage/promotion/beans/PromotionVo;", "", "", "component1", "component2", "component3", "component4", "Lcom/huami/homepage/promotion/beans/NavigateInfo;", "component5", "Lcom/huami/homepage/promotion/beans/Extension;", "component6", "id", "imageUrl", "title", MessengerShareContentUtility.SUBTITLE, "navigateInfo", GPXTrackPoint.XML.TAG_EXTENSIONS, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getImageUrl", "c", "getTitle", GoogleApiAvailabilityLight.a, "getSubtitle", "e", "Lcom/huami/homepage/promotion/beans/NavigateInfo;", "getNavigateInfo", "()Lcom/huami/homepage/promotion/beans/NavigateInfo;", "f", "Lcom/huami/homepage/promotion/beans/Extension;", "getExtensions", "()Lcom/huami/homepage/promotion/beans/Extension;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/homepage/promotion/beans/NavigateInfo;Lcom/huami/homepage/promotion/beans/Extension;)V", "promotion_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PromotionVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final NavigateInfo navigateInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Extension extensions;

    public PromotionVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull NavigateInfo navigateInfo, @Nullable Extension extension) {
        this.id = str;
        this.imageUrl = str2;
        this.title = str3;
        this.subtitle = str4;
        this.navigateInfo = navigateInfo;
        this.extensions = extension;
    }

    public static /* synthetic */ PromotionVo copy$default(PromotionVo promotionVo, String str, String str2, String str3, String str4, NavigateInfo navigateInfo, Extension extension, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotionVo.id;
        }
        if ((i & 2) != 0) {
            str2 = promotionVo.imageUrl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = promotionVo.title;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = promotionVo.subtitle;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            navigateInfo = promotionVo.navigateInfo;
        }
        NavigateInfo navigateInfo2 = navigateInfo;
        if ((i & 32) != 0) {
            extension = promotionVo.extensions;
        }
        return promotionVo.copy(str, str5, str6, str7, navigateInfo2, extension);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NavigateInfo getNavigateInfo() {
        return this.navigateInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Extension getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final PromotionVo copy(@NotNull String id, @NotNull String imageUrl, @NotNull String title, @NotNull String subtitle, @NotNull NavigateInfo navigateInfo, @Nullable Extension extensions) {
        return new PromotionVo(id, imageUrl, title, subtitle, navigateInfo, extensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionVo)) {
            return false;
        }
        PromotionVo promotionVo = (PromotionVo) other;
        return Intrinsics.areEqual(this.id, promotionVo.id) && Intrinsics.areEqual(this.imageUrl, promotionVo.imageUrl) && Intrinsics.areEqual(this.title, promotionVo.title) && Intrinsics.areEqual(this.subtitle, promotionVo.subtitle) && Intrinsics.areEqual(this.navigateInfo, promotionVo.navigateInfo) && Intrinsics.areEqual(this.extensions, promotionVo.extensions);
    }

    @Nullable
    public final Extension getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final NavigateInfo getNavigateInfo() {
        return this.navigateInfo;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.navigateInfo.hashCode()) * 31;
        Extension extension = this.extensions;
        return iHashCode + (extension == null ? 0 : extension.hashCode());
    }

    @NotNull
    public String toString() {
        return "PromotionVo(id=" + this.id + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", navigateInfo=" + this.navigateInfo + ", extensions=" + this.extensions + ")";
    }

    public /* synthetic */ PromotionVo(String str, String str2, String str3, String str4, NavigateInfo navigateInfo, Extension extension, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, navigateInfo, (i & 32) != 0 ? null : extension);
    }
}
