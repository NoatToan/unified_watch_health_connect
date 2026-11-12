package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yt, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0011"}, d2 = {"Lyt;", "", "", "toString", "", "hashCode", "other", "", "equals", "messageId", "imageUrl", "Lrk;", "format", "width", "height", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrk;II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StickyNotificationRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String imageUrl;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final rk format;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int width;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final int height;

    public StickyNotificationRequest(@NotNull String messageId, @NotNull String imageUrl, @NotNull rk format, int i, int i2) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(format, "format");
        this.messageId = messageId;
        this.imageUrl = imageUrl;
        this.format = format;
        this.width = i;
        this.height = i2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyNotificationRequest)) {
            return false;
        }
        StickyNotificationRequest stickyNotificationRequest = (StickyNotificationRequest) other;
        return Intrinsics.areEqual(this.messageId, stickyNotificationRequest.messageId) && Intrinsics.areEqual(this.imageUrl, stickyNotificationRequest.imageUrl) && this.format == stickyNotificationRequest.format && this.width == stickyNotificationRequest.width && this.height == stickyNotificationRequest.height;
    }

    public int hashCode() {
        return (((((((this.messageId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.format.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    @NotNull
    public String toString() {
        return "StickyNotificationRequest(messageId=" + this.messageId + ", imageUrl=" + this.imageUrl + ", format=" + this.format + ", width=" + this.width + ", height=" + this.height + ')';
    }
}
