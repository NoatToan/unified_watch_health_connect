package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f23764a;

    public class a extends ke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23765b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.f23765b = true;
        }

        @Override // defpackage.ke
        public void c(int i) throws IOException {
            if (this.f23765b) {
                this.f23765b = false;
            } else {
                super.c(i);
            }
        }
    }

    public ke(OutputStream outputStream) {
        this.f23764a = outputStream;
    }

    public ke a() {
        return new ug5(this.f23764a);
    }

    public ke b() {
        return new ji5(this.f23764a);
    }

    public void c(int i) throws IOException {
        this.f23764a.write(i);
    }

    public void d(byte[] bArr) throws IOException {
        this.f23764a.write(bArr);
    }

    public void e(byte[] bArr, int i, int i2) throws IOException {
        this.f23764a.write(bArr, i, i2);
    }

    public void f(int i, int i2, byte[] bArr) throws IOException {
        k(i, i2);
        i(bArr.length);
        d(bArr);
    }

    public void g(int i, byte[] bArr) throws IOException {
        c(i);
        i(bArr.length);
        d(bArr);
    }

    public void h(re reVar) throws IOException {
        if (reVar == null) {
            throw new IOException("null object detected");
        }
        reVar.h(new a(this.f23764a));
    }

    public void i(int i) throws IOException {
        if (i <= 127) {
            c((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            } else {
                i3++;
            }
        }
        c((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            c((byte) (i >> i4));
        }
    }

    public void j(hd hdVar) throws IOException {
        if (hdVar == null) {
            throw new IOException("null object detected");
        }
        hdVar.toASN1Primitive().h(this);
    }

    public void k(int i, int i2) throws IOException {
        if (i2 < 31) {
            c(i | i2);
            return;
        }
        c(i | 31);
        if (i2 < 128) {
            c(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        e(bArr, i3, 5 - i3);
    }
}
