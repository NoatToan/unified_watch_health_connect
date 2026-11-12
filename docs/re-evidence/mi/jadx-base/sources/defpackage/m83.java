package defpackage;

import com.xiaomi.miot.ble.bouncycastle.crypto.DataLengthException;
import com.xiaomi.miot.ble.bouncycastle.crypto.InvalidCipherTextException;
import com.xiaomi.miot.ble.bouncycastle.crypto.OutputLengthException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class m83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv2 f25872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25873b;
    public boolean c;
    public byte[] d;
    public byte[] e;
    public int f;
    public nw3 g;
    public byte[] h;
    public a i = new a();
    public a j = new a();

    public class a extends ByteArrayOutputStream {
        public a() {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public m83(qv2 qv2Var) {
        this.f25872a = qv2Var;
        int blockSize = qv2Var.getBlockSize();
        this.f25873b = blockSize;
        this.h = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    public final int a(byte[] bArr, int i, int i2, byte[] bArr2) {
        k83 k83Var = new k83(this.f25872a, this.f * 8);
        k83Var.a(this.g);
        byte[] bArr3 = new byte[16];
        if (e()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        byte macSize = (byte) (bArr3[0] | ((((k83Var.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr4 = this.d;
        bArr3[0] = (byte) (macSize | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        k83Var.update(bArr3, 0, 16);
        if (e()) {
            int iC = c();
            if (iC < 65280) {
                k83Var.update((byte) (iC >> 8));
                k83Var.update((byte) iC);
            } else {
                k83Var.update((byte) -1);
                k83Var.update((byte) -2);
                k83Var.update((byte) (iC >> 24));
                k83Var.update((byte) (iC >> 16));
                k83Var.update((byte) (iC >> 8));
                k83Var.update((byte) iC);
                i3 = 6;
            }
            byte[] bArr5 = this.e;
            if (bArr5 != null) {
                k83Var.update(bArr5, 0, bArr5.length);
            }
            if (this.i.size() > 0) {
                k83Var.update(this.i.a(), 0, this.i.size());
            }
            int i6 = (i3 + iC) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    k83Var.update((byte) 0);
                    i6++;
                }
            }
        }
        k83Var.update(bArr, i, i2);
        return k83Var.doFinal(bArr2, 0);
    }

    public int b(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        int iH = h(this.j.a(), 0, this.j.size(), bArr, i);
        i();
        return iH;
    }

    public final int c() {
        int size = this.i.size();
        byte[] bArr = this.e;
        return size + (bArr == null ? 0 : bArr.length);
    }

    public int d(int i) {
        int size = i + this.j.size();
        if (this.c) {
            return size + this.f;
        }
        int i2 = this.f;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    public final boolean e() {
        return c() > 0;
    }

    public void f(boolean z, nw3 nw3Var) throws IllegalArgumentException {
        nw3 nw3VarB;
        this.c = z;
        if (nw3Var instanceof f0) {
            f0 f0Var = (f0) nw3Var;
            this.d = f0Var.d();
            this.e = f0Var.a();
            this.f = f0Var.c() / 8;
            nw3VarB = f0Var.b();
        } else {
            if (!(nw3Var instanceof ckh)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + nw3Var.getClass().getName());
            }
            ckh ckhVar = (ckh) nw3Var;
            this.d = ckhVar.a();
            this.e = null;
            this.f = this.h.length / 2;
            nw3VarB = ckhVar.b();
        }
        if (nw3VarB != null) {
            this.g = nw3VarB;
        }
        byte[] bArr = this.d;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        i();
    }

    public int g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException, IOException {
        if (bArr.length < i + i2) {
            throw new DataLengthException("Input buffer too short");
        }
        this.j.write(bArr, i, i2);
        return 0;
    }

    public int h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        int i4;
        if (this.g == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.d;
        int length = bArr3.length;
        int i5 = 15 - length;
        if (i5 < 4 && i2 >= (1 << (i5 * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr4 = new byte[this.f25873b];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        n7l n7lVar = new n7l(this.f25872a);
        n7lVar.a(this.c, new ckh(this.g, bArr4));
        if (!this.c) {
            int i6 = this.f;
            if (i2 < i6) {
                throw new InvalidCipherTextException("data too short");
            }
            int i7 = i2 - i6;
            if (bArr2.length < i7 + i3) {
                throw new OutputLengthException("Output buffer too short.");
            }
            int i8 = i + i7;
            System.arraycopy(bArr, i8, this.h, 0, i6);
            byte[] bArr5 = this.h;
            n7lVar.processBlock(bArr5, 0, bArr5, 0);
            int i9 = this.f;
            while (true) {
                byte[] bArr6 = this.h;
                if (i9 == bArr6.length) {
                    break;
                }
                bArr6[i9] = 0;
                i9++;
            }
            int i10 = i;
            int i11 = i3;
            while (true) {
                i4 = this.f25873b;
                if (i10 >= i8 - i4) {
                    break;
                }
                n7lVar.processBlock(bArr, i10, bArr2, i11);
                int i12 = this.f25873b;
                i11 += i12;
                i10 += i12;
            }
            byte[] bArr7 = new byte[i4];
            int i13 = i7 - (i10 - i);
            System.arraycopy(bArr, i10, bArr7, 0, i13);
            n7lVar.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i11, i13);
            byte[] bArr8 = new byte[this.f25873b];
            a(bArr2, i3, i7, bArr8);
            if (xj1.b(this.h, bArr8)) {
                return i7;
            }
            throw new InvalidCipherTextException("mac check in CCM failed");
        }
        int i14 = this.f + i2;
        if (bArr2.length < i14 + i3) {
            throw new OutputLengthException("Output buffer too short.");
        }
        a(bArr, i, i2, this.h);
        byte[] bArr9 = new byte[this.f25873b];
        n7lVar.processBlock(this.h, 0, bArr9, 0);
        int i15 = i;
        int i16 = i3;
        while (true) {
            int i17 = i + i2;
            int i18 = this.f25873b;
            if (i15 >= i17 - i18) {
                byte[] bArr10 = new byte[i18];
                int i19 = i17 - i15;
                System.arraycopy(bArr, i15, bArr10, 0, i19);
                n7lVar.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i16, i19);
                System.arraycopy(bArr9, 0, bArr2, i3 + i2, this.f);
                return i14;
            }
            n7lVar.processBlock(bArr, i15, bArr2, i16);
            int i20 = this.f25873b;
            i16 += i20;
            i15 += i20;
        }
    }

    public void i() {
        this.f25872a.reset();
        this.i.reset();
        this.j.reset();
    }
}
