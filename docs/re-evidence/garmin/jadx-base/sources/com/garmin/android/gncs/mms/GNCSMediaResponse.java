package com.garmin.android.gncs.mms;

import am.j;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import fb1.c;
import i3.e5;
import p005kotlin.Metadata;
import w13.a;
import w13.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\b\u0010\"\u001a\u00020#H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/garmin/android/gncs/mms/GNCSMediaResponse;", "", "notificationId", "", FirebaseAnalytics.Param.INDEX, "(II)V", "imageData", "", "getImageData", "()[B", "setImageData", "([B)V", "getIndex", "()I", "getNotificationId", "status", "Lcom/garmin/android/gncs/mms/GNCSMediaResponse$Status;", "getStatus", "()Lcom/garmin/android/gncs/mms/GNCSMediaResponse$Status;", "setStatus", "(Lcom/garmin/android/gncs/mms/GNCSMediaResponse$Status;)V", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;", "getType", "()Lcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;", "setType", "(Lcom/garmin/android/gncs/mms/GNCSMediaRequest$MediaType;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Status", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GNCSMediaResponse {
    private byte[] imageData;
    private final int index;
    private final int notificationId;
    private Status status;
    private GNCSMediaRequest.MediaType type = GNCSMediaRequest.MediaType.PNG;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/gncs/mms/GNCSMediaResponse$Status;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "UNKNOWN", "SUCCESS", "INVALID_UID", "INVALID_INDEX", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Status {
        UNKNOWN(0),
        SUCCESS(1),
        INVALID_UID(2),
        INVALID_INDEX(3);

        private static final /* synthetic */ a $ENTRIES = b.g(values());
        private final int code;

        Status(int i14) {
            this.code = i14;
        }

        public static a<Status> getEntries() {
            return $ENTRIES;
        }

        public final int getCode() {
            return this.code;
        }
    }

    public GNCSMediaResponse(int i14, int i15) {
        this.notificationId = i14;
        this.index = i15;
    }

    public static /* synthetic */ GNCSMediaResponse copy$default(GNCSMediaResponse gNCSMediaResponse, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i14 = gNCSMediaResponse.notificationId;
        }
        if ((i16 & 2) != 0) {
            i15 = gNCSMediaResponse.index;
        }
        return gNCSMediaResponse.copy(i14, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final GNCSMediaResponse copy(int notificationId, int index) {
        return new GNCSMediaResponse(notificationId, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GNCSMediaResponse)) {
            return false;
        }
        GNCSMediaResponse gNCSMediaResponse = (GNCSMediaResponse) other;
        return this.notificationId == gNCSMediaResponse.notificationId && this.index == gNCSMediaResponse.index;
    }

    public final byte[] getImageData() {
        return this.imageData;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final GNCSMediaRequest.MediaType getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (Integer.hashCode(this.notificationId) * 31);
    }

    public final void setImageData(byte[] bArr) {
        this.imageData = bArr;
    }

    public final void setStatus(Status status) {
        this.status = status;
    }

    public final void setType(GNCSMediaRequest.MediaType mediaType) {
        mediaType.getClass();
        this.type = mediaType;
    }

    public String toString() {
        int i14 = this.notificationId;
        int i15 = this.index;
        Status status = this.status;
        String strName = status != null ? status.name() : null;
        byte[] bArr = this.imageData;
        Integer numValueOf = bArr != null ? Integer.valueOf(bArr.length) : null;
        String strName2 = this.type.name();
        StringBuilder sbJ = e5.j(i14, i15, "GNCSMediaResponse(notificationId=", ", index=", ", status=");
        c.u(numValueOf, strName, ", imageData=", " bytes, mediaType=", sbJ);
        return j.o(strName2, ")", sbJ);
    }
}
