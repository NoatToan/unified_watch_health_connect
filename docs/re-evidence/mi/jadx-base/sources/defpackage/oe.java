package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f29050a;

    public class a extends oe {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29051b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.f29051b = true;
        }

        @Override // defpackage.oe
        public void c(int i) throws IOException {
            if (this.f29051b) {
                this.f29051b = false;
            } else {
                super.c(i);
            }
        }
    }

    public oe(OutputStream outputStream) {
        this.f29050a = outputStream;
    }

    public oe a() {
        return new tg5(this.f29050a);
    }

    public oe b() {
        return new ii5(this.f29050a);
    }

    public void c(int i) throws IOException {
        this.f29050a.write(i);
    }

    public void d(byte[] bArr) throws IOException {
        this.f29050a.write(bArr);
    }

    public void e(byte[] bArr, int i, int i2) throws IOException {
        this.f29050a.write(bArr, i, i2);
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

    public void h(pe peVar) throws IOException {
        if (peVar == null) {
            throw new IOException("null object detected");
        }
        peVar.h(new a(this.f29050a));
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

    public void j(gd gdVar) throws IOException {
        if (gdVar == null) {
            throw new IOException("null object detected");
        }
        gdVar.toASN1Primitive().h(this);
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
