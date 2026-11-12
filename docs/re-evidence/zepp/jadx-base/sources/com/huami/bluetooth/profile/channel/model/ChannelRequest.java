package com.huami.bluetooth.profile.channel.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 )2\u00020\u0001:\u0001)BU\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010&\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0015\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR$\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\"R\u0019\u0010&\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a¨\u0006*"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;", "", "", "toString", "", "a", LogUtil.I, "getMode", "()I", "mode", "", "b", "[B", "getData", "()[B", "data", "c", "getReplyFreq", "replyFreq", GoogleApiAvailabilityLight.a, "getSessionId", "sessionId", "", "e", "Z", "getEncrypt", "()Z", "encrypt", "f", "getDataSize", "dataSize", "g", "getOriginData", "setOriginData", "([B)V", "originData", "h", "getNeedTailReply", "needTailReply", "<init>", "(I[BIIZI[BZ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelRequest {
    public static final int REPLY_FREQ = 16;
    public static final int SESSION_ID_LOOP_COUNT = 256;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int replyFreq;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean encrypt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int dataSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private byte[] originData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean needTailReply;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int i = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelRequest$Companion;", "", "", "requestSessionId", "REPLY_FREQ", LogUtil.I, "SESSION_ID", "SESSION_ID_LOOP_COUNT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized int requestSessionId() {
            ChannelRequest.i++;
            ChannelRequest.i %= 256;
            return ChannelRequest.i;
        }
    }

    public ChannelRequest(int i2, @NotNull byte[] bArr, int i3, int i4, boolean z, int i5, @Nullable byte[] bArr2, boolean z2) {
        this.module = i2;
        this.data = bArr;
        this.replyFreq = i3;
        this.sessionId = i4;
        this.encrypt = z;
        this.dataSize = i5;
        this.originData = bArr2;
        this.needTailReply = z2;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getDataSize() {
        return this.dataSize;
    }

    public final boolean getEncrypt() {
        return this.encrypt;
    }

    /* JADX INFO: renamed from: getMode, reason: from getter */
    public final int getModule() {
        return this.module;
    }

    public final boolean getNeedTailReply() {
        return this.needTailReply;
    }

    @Nullable
    public final byte[] getOriginData() {
        return this.originData;
    }

    public final int getReplyFreq() {
        return this.replyFreq;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public final void setOriginData(@Nullable byte[] bArr) {
        this.originData = bArr;
    }

    @NotNull
    public String toString() {
        return "(module=" + this.module + ", data=" + ((Object) GattUtils.bytesToHexString(this.data)) + ", replyFreq=" + this.replyFreq + ", sessionId=" + this.sessionId + ", encrypt=" + this.encrypt + ", dataSize=" + this.dataSize + ')';
    }

    public /* synthetic */ ChannelRequest(int i2, byte[] bArr, int i3, int i4, boolean z, int i5, byte[] bArr2, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bArr, (i6 & 4) != 0 ? 16 : i3, (i6 & 8) != 0 ? INSTANCE.requestSessionId() : i4, (i6 & 16) != 0 ? false : z, (i6 & 32) != 0 ? bArr.length : i5, (i6 & 64) != 0 ? null : bArr2, (i6 & 128) != 0 ? true : z2);
    }
}
