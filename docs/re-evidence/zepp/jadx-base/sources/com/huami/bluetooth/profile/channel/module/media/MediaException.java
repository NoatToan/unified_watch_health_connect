package com.huami.bluetooth.profile.channel.module.media;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/MediaException;", "", "", "getBytes", "", "toString", "", "a", LogUtil.I, "sessionId", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "b", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "source", "c", Constants.EXCEPTION, "<init>", "(ILcom/huami/bluetooth/profile/channel/module/media/MediaSource;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MediaException {
    public static final int DECODE_FAILED = 8;
    public static final int DOWNLOAD_FAIL = 5;
    public static final int INVALID_PARAMETER = 2;
    public static final int INVALID_STATE = 3;
    public static final int MEDIA_EXCEPTION = 15;
    public static final int NO_NETWORK = 4;
    public static final int UNKNOWN_ERROR = 1;
    public static final int UNSUPPORT_FORMAT = 7;
    public static final int UNSUPPORT_RESOURCE = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final MediaSource source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int exception;

    public MediaException(int i, @NotNull MediaSource mediaSource, int i2) {
        this.sessionId = i;
        this.source = mediaSource;
        this.exception = i2;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(15);
        byteArrayOutputStream.write(this.sessionId);
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.source.getSource()));
        byteArrayOutputStream.write(this.exception);
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public String toString() {
        return "MediaException(sessionId=" + this.sessionId + ", source=" + this.source + ", exception=" + this.exception + ')';
    }
}
