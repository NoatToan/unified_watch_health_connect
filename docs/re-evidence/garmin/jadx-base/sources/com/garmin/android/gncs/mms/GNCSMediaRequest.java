package com.garmin.android.gncs.mms;

import android.graphics.Bitmap;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import ds.e0;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;
import w13.a;
import w13.b;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\b\u0010!\u001a\u00020\"H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/garmin/android/gncs/mms/GNCSMediaRequest;", "", "notificationId", "", FirebaseAnalytics.Param.INDEX, "height", "width", "maxSize", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;", "quality", "(IIIIILcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;I)V", "getHeight", "()I", "getIndex", "getMaxSize", "getNotificationId", "getQuality", "getType", "()Lcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "MediaType", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GNCSMediaRequest {
    private final int height;
    private final int index;
    private final int maxSize;
    private final int notificationId;
    private final int quality;
    private final MediaType type;
    private final int width;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;", "", "format", "Landroid/graphics/Bitmap$CompressFormat;", "(Ljava/lang/String;ILandroid/graphics/Bitmap$CompressFormat;)V", "getFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "PNG", "JPEG", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum MediaType {
        PNG(Bitmap.CompressFormat.PNG),
        JPEG(Bitmap.CompressFormat.JPEG);

        private static final /* synthetic */ a $ENTRIES = b.g(values());
        private final Bitmap.CompressFormat format;

        MediaType(Bitmap.CompressFormat compressFormat) {
            this.format = compressFormat;
        }

        public static a<MediaType> getEntries() {
            return $ENTRIES;
        }

        public final Bitmap.CompressFormat getFormat() {
            return this.format;
        }
    }

    public /* synthetic */ GNCSMediaRequest(int i14, int i15, int i16, int i17, int i18, MediaType mediaType, int i19, int i24, j jVar) {
        this(i14, i15, i16, i17, i18, mediaType, (i24 & 64) != 0 ? 100 : i19);
    }

    public static /* synthetic */ GNCSMediaRequest copy$default(GNCSMediaRequest gNCSMediaRequest, int i14, int i15, int i16, int i17, int i18, MediaType mediaType, int i19, int i24, Object obj) {
        if ((i24 & 1) != 0) {
            i14 = gNCSMediaRequest.notificationId;
        }
        if ((i24 & 2) != 0) {
            i15 = gNCSMediaRequest.index;
        }
        if ((i24 & 4) != 0) {
            i16 = gNCSMediaRequest.height;
        }
        if ((i24 & 8) != 0) {
            i17 = gNCSMediaRequest.width;
        }
        if ((i24 & 16) != 0) {
            i18 = gNCSMediaRequest.maxSize;
        }
        if ((i24 & 32) != 0) {
            mediaType = gNCSMediaRequest.type;
        }
        if ((i24 & 64) != 0) {
            i19 = gNCSMediaRequest.quality;
        }
        MediaType mediaType2 = mediaType;
        int i25 = i19;
        int i26 = i18;
        int i27 = i16;
        return gNCSMediaRequest.copy(i14, i15, i27, i17, i26, mediaType2, i25);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MediaType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    public final GNCSMediaRequest copy(int notificationId, int index, int height, int width, int maxSize, MediaType type, int quality) {
        type.getClass();
        return new GNCSMediaRequest(notificationId, index, height, width, maxSize, type, quality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GNCSMediaRequest)) {
            return false;
        }
        GNCSMediaRequest gNCSMediaRequest = (GNCSMediaRequest) other;
        return this.notificationId == gNCSMediaRequest.notificationId && this.index == gNCSMediaRequest.index && this.height == gNCSMediaRequest.height && this.width == gNCSMediaRequest.width && this.maxSize == gNCSMediaRequest.maxSize && this.type == gNCSMediaRequest.type && this.quality == gNCSMediaRequest.quality;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    public final int getQuality() {
        return this.quality;
    }

    public final MediaType getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.quality) + ((this.type.hashCode() + q2.d(this.maxSize, q2.d(this.width, q2.d(this.height, q2.d(this.index, Integer.hashCode(this.notificationId) * 31, 31), 31), 31), 31)) * 31);
    }

    public String toString() {
        int i14 = this.notificationId;
        int i15 = this.index;
        int i16 = this.height;
        int i17 = this.width;
        int i18 = this.maxSize;
        String strName = this.type.name();
        int i19 = this.quality;
        StringBuilder sbJ = e5.j(i14, i15, "GNCSMediaRequest(notificationId=", ", index=", ", height=");
        e0.m(i16, i17, ", width=", ", maxSize=", sbJ);
        g.t(i18, ", mediaType=", strName, ", quality=", sbJ);
        return am.j.q(sbJ, i19, ")");
    }

    public GNCSMediaRequest(int i14, int i15, int i16, int i17, int i18, MediaType mediaType, int i19) {
        mediaType.getClass();
        this.notificationId = i14;
        this.index = i15;
        this.height = i16;
        this.width = i17;
        this.maxSize = i18;
        this.type = mediaType;
        this.quality = i19;
    }
}
