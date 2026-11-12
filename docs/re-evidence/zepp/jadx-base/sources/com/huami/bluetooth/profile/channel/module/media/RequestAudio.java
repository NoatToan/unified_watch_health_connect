package com.huami.bluetooth.profile.channel.module.media;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u001a\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/RequestAudio;", "", "", "toString", "", "a", LogUtil.I, "getSessionId", "()I", "sessionId", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "b", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "getSource", "()Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "source", "c", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", GoogleApiAvailabilityLight.a, "getOffset", "offset", "e", "getFormat", TrainingWebConst.QueryParam.VIDEO_FORMAT, "<init>", "(ILcom/huami/bluetooth/profile/channel/module/media/MediaSource;Ljava/lang/String;II)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RequestAudio {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int OPUS_16000_1_16 = 2;
    public static final int OPUS_8000_1_16 = 1;
    public static final int REQUEST_AUDIO = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final MediaSource source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int offset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int format;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/RequestAudio$Companion;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/media/RequestAudio;", "fromBytes", "", "OPUS_16000_1_16", LogUtil.I, "OPUS_8000_1_16", "REQUEST_AUDIO", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RequestAudio fromBytes(@NotNull byte[] data) {
            byte b = data[0];
            int i = data[1] & 255;
            MediaSource mediaSourceFromBytes = MediaSource.INSTANCE.fromBytes(MeidaHelperKt.twoBytesToUInt(data[2], data[3]));
            int iFindStringEndIndex = MeidaHelperKt.findStringEndIndex(data, 4);
            String strDecodeToString = MeidaHelperKt.decodeToString(data, 4, iFindStringEndIndex);
            int i2 = iFindStringEndIndex + 1;
            int i3 = i2 + 1;
            return new RequestAudio(i, mediaSourceFromBytes, strDecodeToString, MeidaHelperKt.twoBytesToUInt(data[i2], data[i3]), data[i3 + 1] & 255);
        }
    }

    public RequestAudio(int i, @NotNull MediaSource mediaSource, @NotNull String str, int i2, int i3) {
        this.sessionId = i;
        this.source = mediaSource;
        this.url = str;
        this.offset = i2;
        this.format = i3;
    }

    public final int getFormat() {
        return this.format;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final MediaSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        return "RequestAudio(sessionId=" + this.sessionId + ", source=" + this.source + ", url='" + this.url + "', offset=" + this.offset + ", format=" + this.format + ')';
    }
}
