package jk;

import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.gms.gcm.Task;
import com.google.common.primitives.UnsignedBytes;
import i3.e5;
import java.util.zip.Checksum;
import okhttp3.internal.ws.WebSocketProtocol;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
public class s implements Checksum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f99225b = {0, 52225, 55297, 5120, 61441, 15360, Task.EXTRAS_LIMIT_BYTES, 58369, 40961, 27648, 30720, 46081, CacheDataSink.DEFAULT_BUFFER_SIZE, 39937, 34817, 17408};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99226a;

    public s() {
        this.f99226a = 0;
    }

    @Override // java.util.zip.Checksum
    public final long getValue() {
        return ((long) this.f99226a) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @Override // java.util.zip.Checksum
    public final void reset() {
        this.f99226a = 0;
    }

    @Override // java.util.zip.Checksum
    public final void update(int i14) {
        int i15 = this.f99226a;
        int[] iArr = f99225b;
        int i16 = iArr[i15 & 15];
        int i17 = (i15 >>> 4) & 4095;
        this.f99226a = i17;
        int i18 = (i17 ^ i16) ^ iArr[i14 & 15];
        int i19 = i18 & 65535;
        this.f99226a = i19;
        int i24 = iArr[i18 & 15];
        int i25 = (i19 >>> 4) & 4095;
        this.f99226a = i25;
        this.f99226a = (iArr[(i14 >>> 4) & 15] ^ (i24 ^ i25)) & 65535;
    }

    public s(short s8) {
        this.f99226a = s8;
    }

    @Override // java.util.zip.Checksum
    public final void update(byte[] bArr, int i14, int i15) {
        if (i15 <= bArr.length) {
            if (i14 <= bArr.length) {
                int i16 = i14 + i15;
                if (i16 > bArr.length) {
                    l2.r(bArr.length, e5.j(i14, i15, "Block offset and length combined should not exceed the data block size: ", "/", "/"));
                    return;
                } else {
                    while (i14 < i16) {
                        update(bArr[i14] & UnsignedBytes.MAX_VALUE);
                        i14++;
                    }
                    return;
                }
            }
            vb.h.s("Block offset should not exceed the data block size");
            return;
        }
        vb.h.s("Block length should not exceed the data block size");
    }
}
