package defpackage;

import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class us3 implements k7d {
    public static final int[] c = m(new byte[]{101, 120, 112, APDUConstants.TAG_MORE_DATA, 110, 100, 32, 51, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 45, 98, 121, 116, 101, 32, 107});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f36074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36075b;

    public us3(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f36074a = m(bArr);
        this.f36075b = i;
    }

    public static void i(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int iJ = j(i5 ^ iArr[i4], 16);
        iArr[i4] = iJ;
        int i6 = iArr[i3] + iJ;
        iArr[i3] = i6;
        int iJ2 = j(iArr[i2] ^ i6, 12);
        iArr[i2] = iJ2;
        int i7 = iArr[i] + iJ2;
        iArr[i] = i7;
        int iJ3 = j(iArr[i4] ^ i7, 8);
        iArr[i4] = iJ3;
        int i8 = iArr[i3] + iJ3;
        iArr[i3] = i8;
        iArr[i2] = j(iArr[i2] ^ i8, 7);
    }

    public static int j(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static void k(int[] iArr, int[] iArr2) {
        int[] iArr3 = c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void l(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            i(iArr, 0, 4, 8, 12);
            i(iArr, 1, 5, 9, 13);
            i(iArr, 2, 6, 10, 14);
            i(iArr, 3, 7, 11, 15);
            i(iArr, 0, 5, 10, 15);
            i(iArr, 1, 6, 11, 12);
            i(iArr, 2, 7, 8, 13);
            i(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] m(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // defpackage.k7d
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(g() + bArr.length);
        f(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    @Override // defpackage.k7d
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        return e(ByteBuffer.wrap(bArr));
    }

    public ByteBuffer c(byte[] bArr, int i) {
        int[] iArrD = d(m(bArr), i);
        int[] iArr = (int[]) iArrD.clone();
        l(iArr);
        for (int i2 = 0; i2 < iArrD.length; i2++) {
            iArrD[i2] = iArrD[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] d(int[] iArr, int i);

    public byte[] e(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < g()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[g()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        h(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void f(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - g() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrC = mbj.c(g());
        byteBuffer.put(bArrC);
        h(bArrC, byteBuffer, ByteBuffer.wrap(bArr));
    }

    public abstract int g();

    public final void h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferC = c(bArr, this.f36075b + i3);
            if (i3 == i) {
                b83.c(byteBuffer, byteBuffer2, byteBufferC, iRemaining % 64);
            } else {
                b83.c(byteBuffer, byteBuffer2, byteBufferC, 64);
            }
        }
    }
}
