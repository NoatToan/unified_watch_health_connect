package com.huami.bluetooth.profile.channel.module.file_transfer;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.BufByteDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \"2\u00020\u0001:\u0001\"BE\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0019\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u001c\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0019\u0010\u001f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferPacket;", "", "", "toString", "", "a", LogUtil.I, "getSessionID", "()I", SDKConstants.PARAM_SESSION_ID, "b", "getChunkSize", "chunkSize", "", "c", "[B", "getData", "()[B", "data", "", GoogleApiAvailabilityLight.a, "Z", "isLastPacket", "()Z", "e", "isFirst", "f", "getCrc", "crc", "g", "getOffset", "offset", "<init>", "(II[BZZII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileTransferPacket {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int chunkSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final byte[] data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isLast;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isFirst;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int crc;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int offset;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferPacket$Companion;", "", "", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferPacket;", "parse", "parseV2", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FileTransferPacket parse(@NotNull byte[] bytes) {
            BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
            bufByteDecoder.append(bytes);
            int i = bufByteDecoder.readByte();
            int i2 = bufByteDecoder.readByte();
            byte[] bytes2 = bufByteDecoder.readBytes(bufByteDecoder.readInt(2));
            int i3 = bufByteDecoder.readByte();
            boolean z = ((i3 >> 1) & 1) > 0;
            return new FileTransferPacket(i, i2, bytes2, z, (i3 & 1) > 0, z ? BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null) : 0, 0, 64, null);
        }

        @NotNull
        public final FileTransferPacket parseV2(@NotNull byte[] bytes) {
            BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
            bufByteDecoder.append(bytes);
            int i = bufByteDecoder.readByte();
            int i2 = i & 1;
            return new FileTransferPacket(bufByteDecoder.readByte(), bufByteDecoder.readByte(), bufByteDecoder.readBytes(bufByteDecoder.readInt(2)), ((i >> 1) & 1) > 0, i2 > 0, 0, i2 > 0 ? BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null) : 0);
        }
    }

    public FileTransferPacket(int i, int i2, @NotNull byte[] bArr, boolean z, boolean z2, int i3, int i4) {
        this.sessionID = i;
        this.chunkSize = i2;
        this.data = bArr;
        this.isLast = z;
        this.isFirst = z2;
        this.crc = i3;
        this.offset = i4;
    }

    public final int getChunkSize() {
        return this.chunkSize;
    }

    public final int getCrc() {
        return this.crc;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: isFirst, reason: from getter */
    public final boolean getIsFirst() {
        return this.isFirst;
    }

    /* JADX INFO: renamed from: isLastPacket, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        return "FileTransferPacket(sessionID=" + this.sessionID + ", chunkSize=" + this.chunkSize + ", dataSize=" + this.data.length + ", isLast=" + this.isLast + ", crc=" + this.crc + ')';
    }

    public /* synthetic */ FileTransferPacket(int i, int i2, byte[] bArr, boolean z, boolean z2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, bArr, (i5 & 8) != 0 ? false : z, z2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? 0 : i4);
    }
}
