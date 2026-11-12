package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class tza {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f35211b;
    public sza c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f35210a = new byte[256];
    public int d = 0;

    public void a() {
        this.f35211b = null;
        this.c = null;
    }

    public final boolean b() {
        return this.c.f34126b != 0;
    }

    public sza c() {
        if (this.f35211b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.c;
        }
        k();
        if (!b()) {
            h();
            sza szaVar = this.c;
            if (szaVar.c < 0) {
                szaVar.f34126b = 1;
            }
        }
        return this.c;
    }

    public final int d() {
        try {
            return this.f35211b.get() & 255;
        } catch (Exception unused) {
            this.c.f34126b = 1;
            return 0;
        }
    }

    public final void e() {
        this.c.d.f30931a = n();
        this.c.d.f30932b = n();
        this.c.d.c = n();
        this.c.d.d = n();
        int iD = d();
        boolean z = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        pza pzaVar = this.c.d;
        pzaVar.e = (iD & 64) != 0;
        if (z) {
            pzaVar.f30933k = g(iPow);
        } else {
            pzaVar.f30933k = null;
        }
        this.c.d.j = this.f35211b.position();
        r();
        if (b()) {
            return;
        }
        sza szaVar = this.c;
        szaVar.c++;
        szaVar.e.add(szaVar.d);
    }

    public final void f() {
        int iD = d();
        this.d = iD;
        if (iD <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.d;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.f35211b.get(this.f35210a, i, i2);
                i += i2;
            } catch (Exception unused) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error Reading Block n: ");
                    sb.append(i);
                    sb.append(" count: ");
                    sb.append(i2);
                    sb.append(" blockSize: ");
                    sb.append(this.d);
                }
                this.c.f34126b = 1;
                return;
            }
        }
    }

    public final int[] g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f35211b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.c.f34126b = 1;
        }
        return iArr;
    }

    public final void h() {
        i(Integer.MAX_VALUE);
    }

    public final void i(int i) {
        boolean z = false;
        while (!z && !b() && this.c.c <= i) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.c.d = new pza();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f35210a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                sza szaVar = this.c;
                if (szaVar.d == null) {
                    szaVar.d = new pza();
                }
                e();
            } else if (iD != 59) {
                this.c.f34126b = 1;
            } else {
                z = true;
            }
        }
    }

    public final void j() {
        d();
        int iD = d();
        pza pzaVar = this.c.d;
        int i = (iD & 28) >> 2;
        pzaVar.g = i;
        if (i == 0) {
            pzaVar.g = 1;
        }
        pzaVar.f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        pza pzaVar2 = this.c.d;
        pzaVar2.i = iN * 10;
        pzaVar2.h = d();
        d();
    }

    public final void k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.f34126b = 1;
            return;
        }
        l();
        if (!this.c.h || b()) {
            return;
        }
        sza szaVar = this.c;
        szaVar.f34125a = g(szaVar.i);
        sza szaVar2 = this.c;
        szaVar2.l = szaVar2.f34125a[szaVar2.j];
    }

    public final void l() {
        this.c.f = n();
        this.c.g = n();
        int iD = d();
        sza szaVar = this.c;
        szaVar.h = (iD & 128) != 0;
        szaVar.i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.c.j = d();
        this.c.f34127k = d();
    }

    public final void m() {
        do {
            f();
            byte[] bArr = this.f35210a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    public final int n() {
        return this.f35211b.getShort();
    }

    public final void o() {
        this.f35211b = null;
        Arrays.fill(this.f35210a, (byte) 0);
        this.c = new sza();
        this.d = 0;
    }

    public tza p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f35211b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f35211b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void q() {
        int iD;
        do {
            iD = d();
            this.f35211b.position(Math.min(this.f35211b.position() + iD, this.f35211b.limit()));
        } while (iD > 0);
    }

    public final void r() {
        d();
        q();
    }
}
