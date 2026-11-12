package defpackage;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes3.dex */
public class n83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pv2 f27639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27640b;
    public boolean c;
    public byte[] d;
    public byte[] e;
    public int f;
    public lw3 g;
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

    public n83(pv2 pv2Var) {
        this.f27639a = pv2Var;
        int blockSize = pv2Var.getBlockSize();
        this.f27640b = blockSize;
        this.h = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    public final int a(byte[] bArr, int i, int i2, byte[] bArr2) {
        j83 j83Var = new j83(this.f27639a, this.f * 8);
        j83Var.a(this.g);
        byte[] bArr3 = new byte[16];
        if (f()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        byte macSize = (byte) (bArr3[0] | ((((j83Var.getMacSize() - 2) / 2) & 7) << 3));
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
        j83Var.update(bArr3, 0, 16);
        if (f()) {
            int iC = c();
            if (iC < 65280) {
                j83Var.update((byte) (iC >> 8));
                j83Var.update((byte) iC);
            } else {
                j83Var.update((byte) -1);
                j83Var.update((byte) -2);
                j83Var.update((byte) (iC >> 24));
                j83Var.update((byte) (iC >> 16));
                j83Var.update((byte) (iC >> 8));
                j83Var.update((byte) iC);
                i3 = 6;
            }
            byte[] bArr5 = this.e;
            if (bArr5 != null) {
                j83Var.update(bArr5, 0, bArr5.length);
            }
            if (this.i.size() > 0) {
                j83Var.update(this.i.a(), 0, this.i.size());
            }
            int i6 = (i3 + iC) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    j83Var.update((byte) 0);
                    i6++;
                }
            }
        }
        j83Var.update(bArr, i, i2);
        return j83Var.doFinal(bArr2, 0);
    }

    public int b(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        int iJ = j(this.j.a(), 0, this.j.size(), bArr, i);
        k();
        return iJ;
    }

    public final int c() {
        int size = this.i.size();
        byte[] bArr = this.e;
        return size + (bArr == null ? 0 : bArr.length);
    }

    public byte[] d() {
        int i = this.f;
        byte[] bArr = new byte[i];
        System.arraycopy(this.h, 0, bArr, 0, i);
        return bArr;
    }

    public int e(int i) {
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

    public final boolean f() {
        return c() > 0;
    }

    public void g(boolean z, lw3 lw3Var) throws IllegalArgumentException {
        lw3 lw3VarB;
        this.c = z;
        if (lw3Var instanceof c0) {
            c0 c0Var = (c0) lw3Var;
            this.d = c0Var.d();
            this.e = c0Var.a();
            this.f = c0Var.c() / 8;
            lw3VarB = c0Var.b();
        } else {
            if (!(lw3Var instanceof akh)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + lw3Var.getClass().getName());
            }
            akh akhVar = (akh) lw3Var;
            this.d = akhVar.a();
            this.e = null;
            this.f = this.h.length / 2;
            lw3VarB = akhVar.b();
        }
        if (lw3VarB != null) {
            this.g = lw3VarB;
        }
        byte[] bArr = this.d;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        k();
    }

    public void h(byte[] bArr, int i, int i2) {
        this.i.write(bArr, i, i2);
    }

    public int i(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        if (bArr.length < i + i2) {
            throw new DataLengthException("Input buffer too short");
        }
        this.j.write(bArr, i, i2);
        return 0;
    }

    public int j(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
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
        byte[] bArr4 = new byte[this.f27640b];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        m7l m7lVar = new m7l(this.f27639a);
        m7lVar.a(this.c, new akh(this.g, bArr4));
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
            m7lVar.processBlock(bArr5, 0, bArr5, 0);
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
                i4 = this.f27640b;
                if (i10 >= i8 - i4) {
                    break;
                }
                m7lVar.processBlock(bArr, i10, bArr2, i11);
                int i12 = this.f27640b;
                i11 += i12;
                i10 += i12;
            }
            byte[] bArr7 = new byte[i4];
            int i13 = i7 - (i10 - i);
            System.arraycopy(bArr, i10, bArr7, 0, i13);
            m7lVar.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i11, i13);
            byte[] bArr8 = new byte[this.f27640b];
            a(bArr2, i3, i7, bArr8);
            if (vj1.m(this.h, bArr8)) {
                return i7;
            }
            throw new InvalidCipherTextException("mac check in CCM failed");
        }
        int i14 = this.f + i2;
        if (bArr2.length < i14 + i3) {
            throw new OutputLengthException("Output buffer too short.");
        }
        a(bArr, i, i2, this.h);
        byte[] bArr9 = new byte[this.f27640b];
        m7lVar.processBlock(this.h, 0, bArr9, 0);
        int i15 = i;
        int i16 = i3;
        while (true) {
            int i17 = i + i2;
            int i18 = this.f27640b;
            if (i15 >= i17 - i18) {
                byte[] bArr10 = new byte[i18];
                int i19 = i17 - i15;
                System.arraycopy(bArr, i15, bArr10, 0, i19);
                m7lVar.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i16, i19);
                System.arraycopy(bArr9, 0, bArr2, i3 + i2, this.f);
                return i14;
            }
            m7lVar.processBlock(bArr, i15, bArr2, i16);
            int i20 = this.f27640b;
            i16 += i20;
            i15 += i20;
        }
    }

    public void k() {
        this.f27639a.reset();
        this.i.reset();
        this.j.reset();
    }
}
