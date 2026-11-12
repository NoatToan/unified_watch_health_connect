package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zt, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lzt;", "", "", "toString", "", "hashCode", "other", "", "equals", "messageId", "Ljava/lang/String;", PluginDeviceInfo.FICONON, "()Ljava/lang/String;", "imageUrl", PluginDeviceInfo.FDESC, "Lk9;", "errorCode", "Lk9;", PluginDeviceInfo.FMODEL, "()Lk9;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk9;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StickyNotificationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String imageUrl;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final k9 errorCode;

    public StickyNotificationResponse(@NotNull String messageId, @NotNull String imageUrl, @NotNull k9 errorCode) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.messageId = messageId;
        this.imageUrl = imageUrl;
        this.errorCode = errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final k9 getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyNotificationResponse)) {
            return false;
        }
        StickyNotificationResponse stickyNotificationResponse = (StickyNotificationResponse) other;
        return Intrinsics.areEqual(this.messageId, stickyNotificationResponse.messageId) && Intrinsics.areEqual(this.imageUrl, stickyNotificationResponse.imageUrl) && this.errorCode == stickyNotificationResponse.errorCode;
    }

    public int hashCode() {
        return (((this.messageId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.errorCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "StickyNotificationResponse(messageId=" + this.messageId + ", imageUrl=" + this.imageUrl + ", errorCode=" + this.errorCode + ')';
    }
}
