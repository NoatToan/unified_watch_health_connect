package com.huami.ai.entity.template;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\bR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\b¨\u0006&"}, d2 = {"Lcom/huami/ai/entity/template/ImageSource;", "", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Long;", "component5", "url", "darkBackgroundUrl", "size", "widthPixels", "heightPixels", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/huami/ai/entity/template/ImageSource;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "b", "getDarkBackgroundUrl", "c", "getSize", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getWidthPixels", "e", "getHeightPixels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ImageSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String darkBackgroundUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long widthPixels;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long heightPixels;

    public ImageSource(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable Long l2) {
        this.url = str;
        this.darkBackgroundUrl = str2;
        this.size = str3;
        this.widthPixels = l;
        this.heightPixels = l2;
    }

    public static /* synthetic */ ImageSource copy$default(ImageSource imageSource, String str, String str2, String str3, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageSource.url;
        }
        if ((i & 2) != 0) {
            str2 = imageSource.darkBackgroundUrl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = imageSource.size;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            l = imageSource.widthPixels;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            l2 = imageSource.heightPixels;
        }
        return imageSource.copy(str, str4, str5, l3, l2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkBackgroundUrl() {
        return this.darkBackgroundUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getWidthPixels() {
        return this.widthPixels;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getHeightPixels() {
        return this.heightPixels;
    }

    @NotNull
    public final ImageSource copy(@NotNull String url, @Nullable String darkBackgroundUrl, @Nullable String size, @Nullable Long widthPixels, @Nullable Long heightPixels) {
        return new ImageSource(url, darkBackgroundUrl, size, widthPixels, heightPixels);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSource)) {
            return false;
        }
        ImageSource imageSource = (ImageSource) other;
        return Intrinsics.areEqual(this.url, imageSource.url) && Intrinsics.areEqual(this.darkBackgroundUrl, imageSource.darkBackgroundUrl) && Intrinsics.areEqual(this.size, imageSource.size) && Intrinsics.areEqual(this.widthPixels, imageSource.widthPixels) && Intrinsics.areEqual(this.heightPixels, imageSource.heightPixels);
    }

    @Nullable
    public final String getDarkBackgroundUrl() {
        return this.darkBackgroundUrl;
    }

    @Nullable
    public final Long getHeightPixels() {
        return this.heightPixels;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Long getWidthPixels() {
        return this.widthPixels;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.darkBackgroundUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.size;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.widthPixels;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.heightPixels;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ImageSource(url=" + this.url + ", darkBackgroundUrl=" + ((Object) this.darkBackgroundUrl) + ", size=" + ((Object) this.size) + ", widthPixels=" + this.widthPixels + ", heightPixels=" + this.heightPixels + ')';
    }

    public /* synthetic */ ImageSource(String str, String str2, String str3, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2);
    }
}
