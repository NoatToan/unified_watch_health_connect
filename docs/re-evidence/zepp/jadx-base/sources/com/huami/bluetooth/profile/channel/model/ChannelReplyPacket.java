package com.huami.bluetooth.profile.channel.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0019\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelReplyPacket;", "", "", "toString", "", "isSuccess", "", "toRawData", "", "a", LogUtil.I, "getType", "()I", "type", "b", "getSessionId", "sessionId", "c", "getErrorCode", "errorCode", GoogleApiAvailabilityLight.a, "getIndex", "index", "e", "getAppId", "appId", "<init>", "(IIIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class ChannelReplyPacket {
    public static final int REPLY_BYTE_LEN = 4;
    public static final int REPLY_CODE_BUSY = 6;
    public static final int REPLY_CODE_OK = 1;
    public static final int REPLY_CODE_PACKET_LOST = 3;
    public static final int REPLY_CODE_PACKET_MALFORMED = 4;
    public static final int REPLY_CODE_SESSION_ID_UNMATCH = 2;
    public static final int REPLY_CODE_UNKNOWN_MODULE = 5;
    public static final int REPLY_PACKET_TYPE = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int errorCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int appId;

    public ChannelReplyPacket(int i, int i2, int i3, int i4, int i5) {
        this.type = i;
        this.sessionId = i2;
        this.errorCode = i3;
        this.index = i4;
        this.appId = i5;
    }

    public final int getAppId() {
        return this.appId;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isSuccess() {
        return this.errorCode == 1;
    }

    @NotNull
    public final byte[] toRawData() {
        return new byte[]{(byte) this.type, (byte) this.sessionId, (byte) this.errorCode, (byte) this.index};
    }

    @NotNull
    public String toString() {
        return "ChannelReplyPacket(sessionId=" + this.sessionId + ", errorCode=" + this.errorCode + ", index=" + this.index + ')';
    }

    public /* synthetic */ ChannelReplyPacket(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
