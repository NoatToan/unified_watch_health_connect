package di1;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldi1/p;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f59769a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f59770b = {7, 52, Ascii.ETB, 34, -20};

    private p() {
    }

    public static final byte[] a(long j8, byte[] bArr) {
        bArr.getClass();
        f59769a.getClass();
        byte[] bArrC = c(j8);
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i14 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        c0 c0Var = new c0();
        c0Var.a(bArrC);
        int i15 = 0;
        while (i15 < length) {
            int i16 = i15 + 3;
            int i17 = i15 + 2;
            int i18 = i15 + 1;
            int i19 = (bArr2[i16] << Ascii.CAN) | ((bArr2[i17] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr2[i18] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[i15] & UnsignedBytes.MAX_VALUE);
            int i24 = i15 + 7;
            int i25 = i15 + 6;
            int i26 = i15 + 5;
            int i27 = i15 + 4;
            int i28 = ((bArr2[i26] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[i24] << Ascii.CAN) | ((bArr2[i25] & UnsignedBytes.MAX_VALUE) << 16) | (bArr2[i27] & UnsignedBytes.MAX_VALUE);
            for (int i29 = i14; i29 < 32; i29++) {
                int i30 = (31 - i29) * 2;
                int[] iArr = c0Var.f59741a;
                i28 -= (((i19 >>> 5) ^ (i19 << 4)) + i19) ^ iArr[i30 + 1];
                i19 -= iArr[i30] ^ (((i28 << 4) ^ (i28 >>> 5)) + i28);
            }
            bArr2[i15] = (byte) i19;
            bArr2[i18] = (byte) (i19 >> 8);
            bArr2[i17] = (byte) (i19 >> 16);
            bArr2[i16] = (byte) (i19 >> 24);
            bArr2[i27] = (byte) i28;
            bArr2[i26] = (byte) (i28 >> 8);
            bArr2[i25] = (byte) (i28 >> 16);
            bArr2[i24] = (byte) (i28 >> 24);
            i15 += 8;
            i14 = 0;
        }
        byte b14 = (byte) (ByteBuffer.allocate(8).putLong(j8).array()[7] ^ 10);
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        int i34 = length - 1;
        for (int i35 = i34; i35 > 0; i35--) {
            bArr3[i35] = (byte) ((bArr3[i35] - b14) ^ bArr3[i35 - 1]);
        }
        bArr3[0] = (byte) (bArr3[0] - b14);
        int i36 = length - bArr3[i34];
        byte[] bArr4 = new byte[i36];
        System.arraycopy(bArr3, 0, bArr4, 0, i36);
        return bArr4;
    }

    public static final byte[] b(long j8, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        f59769a.getClass();
        int i14 = 8;
        boolean z14 = true;
        int i15 = 0;
        byte[] bArr4 = null;
        if (bArr != null) {
            int length = bArr.length;
            int i16 = length + 1;
            int i17 = i16 % 8;
            int i18 = i16 + (i17 > 0 ? 8 - i17 : 0);
            int i19 = i18 - length;
            bArr2 = new byte[i18];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            int i24 = 0;
            for (int i25 = 0; i25 < i19; i25++) {
                byte[] bArr5 = f59770b;
                bArr2[length + i25] = bArr5[i24 % bArr5.length];
                i24++;
            }
            bArr2[i18 - 1] = (byte) i19;
        } else {
            bArr2 = null;
        }
        byte b14 = (byte) (ByteBuffer.allocate(8).putLong(j8).array()[7] ^ 10);
        if (bArr2 != null) {
            int length2 = bArr2.length;
            byte[] bArr6 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
            bArr6[0] = (byte) (bArr6[0] + b14);
            for (int i26 = 1; i26 < length2; i26++) {
                bArr6[i26] = (byte) ((bArr6[i26 - 1] ^ bArr6[i26]) + b14);
            }
            bArr4 = bArr6;
        }
        byte[] bArrC = c(j8);
        if (bArr4 != null) {
            bArr3 = new byte[bArr4.length];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        } else {
            bArr3 = new byte[0];
        }
        c0 c0Var = new c0();
        c0Var.a(bArrC);
        int length3 = bArr3.length;
        int i27 = 0;
        while (i27 < length3) {
            int i28 = i27 + 3;
            int i29 = i27 + 2;
            int i30 = i27 + 1;
            int i34 = (bArr3[i28] << Ascii.CAN) | ((bArr3[i29] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr3[i30] & UnsignedBytes.MAX_VALUE) << i14) | (bArr3[i27] & UnsignedBytes.MAX_VALUE);
            int i35 = i27 + 7;
            int i36 = i27 + 6;
            int i37 = i27 + 5;
            int i38 = i27 + 4;
            int i39 = (bArr3[i38] & UnsignedBytes.MAX_VALUE) | (bArr3[i35] << Ascii.CAN) | ((bArr3[i36] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr3[i37] & UnsignedBytes.MAX_VALUE) << i14);
            boolean z15 = z14;
            for (int i44 = i15; i44 < 32; i44++) {
                int i45 = i44 * 2;
                int[] iArr = c0Var.f59741a;
                i34 += (((i39 << 4) ^ (i39 >>> 5)) + i39) ^ iArr[i45];
                i39 += (((i34 >>> 5) ^ (i34 << 4)) + i34) ^ iArr[i45 + 1];
            }
            bArr3[i27] = (byte) i34;
            bArr3[i30] = (byte) (i34 >> 8);
            bArr3[i29] = (byte) (i34 >> 16);
            bArr3[i28] = (byte) (i34 >> 24);
            bArr3[i38] = (byte) i39;
            bArr3[i37] = (byte) (i39 >> 8);
            bArr3[i36] = (byte) (i39 >> 16);
            bArr3[i35] = (byte) (i39 >> 24);
            i27 += 8;
            z14 = z15;
            i14 = 8;
            i15 = 0;
        }
        return bArr3;
    }

    public static byte[] c(long j8) {
        byte[] bArr = new byte[4];
        System.arraycopy(ByteBuffer.allocate(8).putLong(j8).array(), 4, bArr, 0, 4);
        int i14 = 0;
        for (int i15 = 3; i14 < i15; i15--) {
            byte b14 = bArr[i14];
            bArr[i14] = bArr[i15];
            bArr[i15] = b14;
            i14++;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(ByteBuffer.allocate(8).putLong(~j8).array(), 4, bArr2, 0, 4);
        int i16 = 0;
        for (int i17 = 3; i16 < i17; i17--) {
            byte b15 = bArr2[i16];
            bArr2[i16] = bArr2[i17];
            bArr2[i17] = b15;
            i16++;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, 4);
        System.arraycopy(bArr2, 0, bArr3, 4, 4);
        System.arraycopy(bArr, 0, bArr3, 8, 4);
        System.arraycopy(bArr2, 0, bArr3, 12, 4);
        return bArr3;
    }
}
