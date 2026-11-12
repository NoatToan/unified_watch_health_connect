package tb;

import bb.o;
import com.google.common.primitives.UnsignedBytes;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f163583d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f163584a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f163585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163586c;

    public static long a(byte[] bArr, int i14, boolean z14) {
        long j8 = ((long) bArr[0]) & 255;
        if (z14) {
            j8 &= ~f163583d[i14 - 1];
        }
        for (int i15 = 1; i15 < i14; i15++) {
            j8 = (j8 << 8) | (((long) bArr[i15]) & 255);
        }
        return j8;
    }

    public final long b(o oVar, boolean z14, boolean z15, int i14) {
        int i15;
        int i16 = this.f163585b;
        byte[] bArr = this.f163584a;
        if (i16 == 0) {
            if (!oVar.readFully(bArr, 0, 1, z14)) {
                return -1L;
            }
            int i17 = bArr[0] & UnsignedBytes.MAX_VALUE;
            int i18 = 0;
            while (true) {
                if (i18 >= 8) {
                    i15 = -1;
                    break;
                }
                if ((f163583d[i18] & ((long) i17)) != 0) {
                    i15 = i18 + 1;
                    break;
                }
                i18++;
            }
            this.f163586c = i15;
            if (i15 == -1) {
                h.z("No valid varint length mask found");
                return 0L;
            }
            this.f163585b = 1;
        }
        int i19 = this.f163586c;
        if (i19 > i14) {
            this.f163585b = 0;
            return -2L;
        }
        if (i19 != 1) {
            oVar.readFully(bArr, 1, i19 - 1);
        }
        this.f163585b = 0;
        return a(bArr, this.f163586c, z15);
    }
}
