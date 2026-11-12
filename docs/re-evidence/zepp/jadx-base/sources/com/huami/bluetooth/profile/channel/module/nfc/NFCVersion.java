package com.huami.bluetooth.profile.channel.module.nfc;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/NFCVersion;", "", "", "toString", "", "component1", "", "component2", "component3", "version", DataCacher.j, "chunkSize", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "[B", "getFlags", "()[B", "c", "getChunkSize", "<init>", "(I[BI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NFCVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] flags;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int chunkSize;

    public NFCVersion(int i, @NotNull byte[] bArr, int i2) {
        this.version = i;
        this.flags = bArr;
        this.chunkSize = i2;
    }

    public static /* synthetic */ NFCVersion copy$default(NFCVersion nFCVersion, int i, byte[] bArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = nFCVersion.version;
        }
        if ((i3 & 2) != 0) {
            bArr = nFCVersion.flags;
        }
        if ((i3 & 4) != 0) {
            i2 = nFCVersion.chunkSize;
        }
        return nFCVersion.copy(i, bArr, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChunkSize() {
        return this.chunkSize;
    }

    @NotNull
    public final NFCVersion copy(int version, @NotNull byte[] flags, int chunkSize) {
        return new NFCVersion(version, flags, chunkSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NFCVersion)) {
            return false;
        }
        NFCVersion nFCVersion = (NFCVersion) other;
        return this.version == nFCVersion.version && Intrinsics.areEqual(this.flags, nFCVersion.flags) && this.chunkSize == nFCVersion.chunkSize;
    }

    public final int getChunkSize() {
        return this.chunkSize;
    }

    @NotNull
    public final byte[] getFlags() {
        return this.flags;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version * 31) + Arrays.hashCode(this.flags)) * 31) + this.chunkSize;
    }

    @NotNull
    public String toString() {
        return "NFCVersion(version=" + this.version + ", flags=" + ((Object) GattUtils.bytesToHexString(this.flags)) + ", chunkSize=" + this.chunkSize + ')';
    }
}
