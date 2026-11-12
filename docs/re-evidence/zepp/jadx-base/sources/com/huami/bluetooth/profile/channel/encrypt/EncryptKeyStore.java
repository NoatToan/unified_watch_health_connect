package com.huami.bluetooth.profile.channel.encrypt;

import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/encrypt/EncryptKeyStore;", "", "", "getKey", "", "getLocalNOnce", "", "updateLocalNOnce", "value", "setLocalNOnce", "setRemoteNOnce", "", "validRemoteNOnce", "", "toString", "a", "[B", "key", "b", "J", "r0", "c", "r1", "rawKey", "keyMateriel", "<init>", "([B[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class EncryptKeyStore {
    private static final long d = 4294967295L;
    private static final long e = 100000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private byte[] key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private long r0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private long r1;

    public EncryptKeyStore(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        int i = 0;
        BufByteDecoder bufByteDecoder = new BufByteDecoder(bArr, 0, 2, null);
        this.r0 = bufByteDecoder.readLong(4);
        this.r1 = bufByteDecoder.readLong(4);
        byte[] bytes = bufByteDecoder.readBytes(16);
        ArrayList arrayList = new ArrayList(bytes.length);
        int length = bytes.length;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (bArr2[i2 % bArr2.length] ^ bytes[i])));
            i++;
            i2++;
        }
        this.key = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        Debug.fi("EncryptKeyStore", ByteArrayKt.toHexString(bArr) + ",R0:" + this.r0 + ",R1:" + this.r1);
    }

    @NotNull
    public final byte[] getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: getLocalNOnce, reason: from getter */
    public final long getR0() {
        return this.r0;
    }

    public final void setLocalNOnce(long value) {
        this.r0 = value;
    }

    public final void setRemoteNOnce(long value) {
        this.r1 = value;
    }

    @NotNull
    public String toString() {
        return "EncryptKeyStore(key=" + Arrays.toString(this.key) + ", r0=" + this.r0 + ", r1=" + this.r1 + ')';
    }

    public final void updateLocalNOnce() {
        long j = this.r0 + 1;
        this.r0 = j;
        this.r0 = j % 4294967295L;
    }

    public final boolean validRemoteNOnce(long value) {
        boolean z = ((value - this.r1) + 4294967295L) % 4294967295L <= 100000;
        if (z) {
            this.r1 = value;
        }
        return z;
    }
}
