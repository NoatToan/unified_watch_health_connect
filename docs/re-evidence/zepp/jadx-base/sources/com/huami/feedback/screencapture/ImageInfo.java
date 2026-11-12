package com.huami.feedback.screencapture;

import android.net.Uri;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J?\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006*"}, d2 = {"Lcom/huami/feedback/screencapture/ImageInfo;", "", "", "component1", "Landroid/net/Uri;", "component2", "", "component3", "", "component4", "component5", "dataPath", "uri", "dateTaken", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDataPath", "()Ljava/lang/String;", "b", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "c", "J", "getDateTaken", "()J", GoogleApiAvailabilityLight.a, LogUtil.I, "getWidth", "()I", "e", "getHeight", "<init>", "(Ljava/lang/String;Landroid/net/Uri;JII)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ImageInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String dataPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Uri uri;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long dateTaken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int width;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int height;

    public ImageInfo(@Nullable String str, @Nullable Uri uri, long j, int i, int i2) {
        this.dataPath = str;
        this.uri = uri;
        this.dateTaken = j;
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ ImageInfo copy$default(ImageInfo imageInfo, String str, Uri uri, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imageInfo.dataPath;
        }
        if ((i3 & 2) != 0) {
            uri = imageInfo.uri;
        }
        Uri uri2 = uri;
        if ((i3 & 4) != 0) {
            j = imageInfo.dateTaken;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            i = imageInfo.width;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = imageInfo.height;
        }
        return imageInfo.copy(str, uri2, j2, i4, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDataPath() {
        return this.dataPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDateTaken() {
        return this.dateTaken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final ImageInfo copy(@Nullable String dataPath, @Nullable Uri uri, long dateTaken, int width, int height) {
        return new ImageInfo(dataPath, uri, dateTaken, width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageInfo)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) other;
        return Intrinsics.areEqual(this.dataPath, imageInfo.dataPath) && Intrinsics.areEqual(this.uri, imageInfo.uri) && this.dateTaken == imageInfo.dateTaken && this.width == imageInfo.width && this.height == imageInfo.height;
    }

    @Nullable
    public final String getDataPath() {
        return this.dataPath;
    }

    public final long getDateTaken() {
        return this.dateTaken;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.dataPath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.uri;
        return ((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + b.a(this.dateTaken)) * 31) + this.width) * 31) + this.height;
    }

    @NotNull
    public String toString() {
        return "ImageInfo(dataPath=" + ((Object) this.dataPath) + ", uri=" + this.uri + ", dateTaken=" + this.dateTaken + ", width=" + this.width + ", height=" + this.height + ')';
    }
}
