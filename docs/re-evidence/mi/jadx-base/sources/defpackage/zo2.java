package defpackage;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class zo2 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f41511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41512b;

    public zo2() {
        this.f41512b = 0;
        this.f41511a = new int[1];
    }

    public static int[] p(int i) {
        return new int[(i + 31) / 32];
    }

    public void a(boolean z) {
        f(this.f41512b + 1);
        if (z) {
            int[] iArr = this.f41511a;
            int i = this.f41512b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f41512b++;
    }

    public void b(zo2 zo2Var) {
        int i = zo2Var.f41512b;
        f(this.f41512b + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(zo2Var.g(i2));
        }
    }

    public void c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        f(this.f41512b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public void d() {
        int length = this.f41511a.length;
        for (int i = 0; i < length; i++) {
            this.f41511a[i] = 0;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zo2 clone() {
        return new zo2((int[]) this.f41511a.clone(), this.f41512b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zo2)) {
            return false;
        }
        zo2 zo2Var = (zo2) obj;
        return this.f41512b == zo2Var.f41512b && Arrays.equals(this.f41511a, zo2Var.f41511a);
    }

    public final void f(int i) {
        if (i > (this.f41511a.length << 5)) {
            int[] iArrP = p(i);
            int[] iArr = this.f41511a;
            System.arraycopy(iArr, 0, iArrP, 0, iArr.length);
            this.f41511a = iArrP;
        }
    }

    public boolean g(int i) {
        return ((1 << (i & 31)) & this.f41511a[i / 32]) != 0;
    }

    public int[] h() {
        return this.f41511a;
    }

    public int hashCode() {
        return (this.f41512b * 31) + Arrays.hashCode(this.f41511a);
    }

    public int i(int i) {
        int i2 = this.f41512b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f41511a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f41511a;
            if (i3 == iArr.length) {
                return this.f41512b;
            }
            i4 = iArr[i3];
        }
        int iNumberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f41512b;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    public int j(int i) {
        int i2 = this.f41512b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f41511a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f41511a;
            if (i3 == iArr.length) {
                return this.f41512b;
            }
            i4 = ~iArr[i3];
        }
        int iNumberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f41512b;
        return iNumberOfTrailingZeros > i5 ? i5 : iNumberOfTrailingZeros;
    }

    public int k() {
        return this.f41512b;
    }

    public int l() {
        return (this.f41512b + 7) / 8;
    }

    public boolean n(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f41512b) {
            throw new IllegalArgumentException();
        }
        if (i2 == i) {
            return true;
        }
        int i3 = i2 - 1;
        int i4 = i / 32;
        int i5 = i3 / 32;
        int i6 = i4;
        while (i6 <= i5) {
            int i7 = (2 << (i6 >= i5 ? 31 & i3 : 31)) - (1 << (i6 > i4 ? 0 : i & 31));
            int i8 = this.f41511a[i6] & i7;
            if (!z) {
                i7 = 0;
            }
            if (i8 != i7) {
                return false;
            }
            i6++;
        }
        return true;
    }

    public void q() {
        int[] iArr = new int[this.f41511a.length];
        int i = (this.f41512b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.f41511a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j5 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i4 = this.f41512b;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i] = i7;
        }
        this.f41511a = iArr;
    }

    public void r(int i) {
        int[] iArr = this.f41511a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public void s(int i, int i2) {
        this.f41511a[i / 32] = i2;
    }

    public void t(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (g(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public String toString() {
        int i = this.f41512b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f41512b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(g(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public void u(zo2 zo2Var) {
        if (this.f41512b != zo2Var.f41512b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f41511a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ zo2Var.f41511a[i];
            i++;
        }
    }

    public zo2(int i) {
        this.f41512b = i;
        this.f41511a = p(i);
    }

    public zo2(int[] iArr, int i) {
        this.f41511a = iArr;
        this.f41512b = i;
    }
}
