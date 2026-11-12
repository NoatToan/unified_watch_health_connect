package com.huami.ai.speech.alexa.entity.payload;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\f\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/ImageSource;", "", "", "component1", "component2", "component3", "", "component4", "component5", "url", "darkBackgroundUrl", "size", "widthPixels", "heightPixels", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "b", "getDarkBackgroundUrl", "c", "getSize", GoogleApiAvailabilityLight.a, "J", "getWidthPixels", "()J", "e", "getHeightPixels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ImageSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("url")
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("darkBackgroundUrl")
    @NotNull
    private final String darkBackgroundUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("size")
    @NotNull
    private final String size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("widthPixels")
    private final long widthPixels;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("heightPixels")
    private final long heightPixels;

    public ImageSource(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2) {
        this.url = str;
        this.darkBackgroundUrl = str2;
        this.size = str3;
        this.widthPixels = j;
        this.heightPixels = j2;
    }

    public static /* synthetic */ ImageSource copy$default(ImageSource imageSource, String str, String str2, String str3, long j, long j2, int i, Object obj) {
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
            j = imageSource.widthPixels;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = imageSource.heightPixels;
        }
        return imageSource.copy(str, str4, str5, j3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDarkBackgroundUrl() {
        return this.darkBackgroundUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getWidthPixels() {
        return this.widthPixels;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getHeightPixels() {
        return this.heightPixels;
    }

    @NotNull
    public final ImageSource copy(@NotNull String url, @NotNull String darkBackgroundUrl, @NotNull String size, long widthPixels, long heightPixels) {
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
        return Intrinsics.areEqual(this.url, imageSource.url) && Intrinsics.areEqual(this.darkBackgroundUrl, imageSource.darkBackgroundUrl) && Intrinsics.areEqual(this.size, imageSource.size) && this.widthPixels == imageSource.widthPixels && this.heightPixels == imageSource.heightPixels;
    }

    @NotNull
    public final String getDarkBackgroundUrl() {
        return this.darkBackgroundUrl;
    }

    public final long getHeightPixels() {
        return this.heightPixels;
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final long getWidthPixels() {
        return this.widthPixels;
    }

    public int hashCode() {
        return (((((((this.url.hashCode() * 31) + this.darkBackgroundUrl.hashCode()) * 31) + this.size.hashCode()) * 31) + b.a(this.widthPixels)) * 31) + b.a(this.heightPixels);
    }

    @NotNull
    public String toString() {
        return "ImageSource(url=" + this.url + ", darkBackgroundUrl=" + this.darkBackgroundUrl + ", size=" + this.size + ", widthPixels=" + this.widthPixels + ", heightPixels=" + this.heightPixels + ')';
    }
}
