package com.huami.bluetooth.profile.channel.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import io.netty.buffer.ByteBuf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 .2\u00020\u0001:\u0001.B'\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J(\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u001f\u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0014R\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/ChannelDataBuf;", "", "", GoogleApiAvailabilityLight.a, "lastIndex", "receiveIndex", "", "c", "packetDataSize", "isLastPacket", "cachedDataSize", "totalSize", "a", "value", "b", "", "getData", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "packet", "append", LogUtil.I, "getModule", "()I", "module", "getSessionId", "sessionId", "getTotalSize", "Lio/netty/buffer/ByteBuf;", "Lio/netty/buffer/ByteBuf;", "getBuf", "()Lio/netty/buffer/ByteBuf;", "buf", "e", "f", "Z", "isComplete", "()Z", "setComplete", "(Z)V", "g", "getFlag", "setFlag", "(I)V", "flag", "<init>", "(IIILio/netty/buffer/ByteBuf;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelDataBuf {
    public static final int PACKET_LOOP_SIZE = 256;

    @NotNull
    public static final String TAG = "ChannelDataBuf";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sessionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int totalSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ByteBuf buf;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int lastIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isComplete;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int flag;

    public ChannelDataBuf(int i, int i2, int i3, @NotNull ByteBuf byteBuf) {
        this.module = i;
        this.sessionId = i2;
        this.totalSize = i3;
        this.buf = byteBuf;
        byteBuf.clear();
        this.lastIndex = -1;
    }

    private final boolean a(int packetDataSize, boolean isLastPacket, int cachedDataSize, int totalSize) {
        if (packetDataSize <= 0) {
            return false;
        }
        if ((this.flag & 8) != 0) {
            return !isLastPacket || cachedDataSize + packetDataSize == b(totalSize + 8);
        }
        int i = cachedDataSize + packetDataSize;
        if (i > totalSize) {
            return false;
        }
        return !isLastPacket || i == totalSize;
    }

    private final int b(int value) {
        return value + ((16 - (value % 16)) % 16);
    }

    private final boolean c(int lastIndex, int receiveIndex) {
        return (lastIndex + 1) % 256 != receiveIndex;
    }

    private final int d() {
        return this.buf.readableBytes();
    }

    public final int append(@NotNull ChannelDataPacket packet) {
        if (this.sessionId != packet.getSessionId()) {
            return 2;
        }
        if (c(this.lastIndex, packet.getIndex())) {
            Debug.fi(TAG, "Packet lost");
            return 3;
        }
        this.flag |= packet.getFlag();
        if (!a(packet.getData().length, packet.isEndPacket(), d(), this.totalSize)) {
            return 4;
        }
        this.lastIndex = packet.getIndex();
        this.isComplete = packet.isEndPacket();
        this.buf.writeBytes(packet.getData());
        return 1;
    }

    @NotNull
    public final ByteBuf getBuf() {
        return this.buf;
    }

    @NotNull
    public final byte[] getData() {
        return this.buf.readBytes(this.buf.readableBytes()).array();
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getModule() {
        return this.module;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    /* JADX INFO: renamed from: isComplete, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public final void setComplete(boolean z) {
        this.isComplete = z;
    }

    public final void setFlag(int i) {
        this.flag = i;
    }
}
