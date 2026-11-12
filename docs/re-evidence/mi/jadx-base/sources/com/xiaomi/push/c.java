package com.xiaomi.push;

import androidx.work.WorkInfo;
import defpackage.bss;
import defpackage.l3s;
import defpackage.qns;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f14033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14034b;
    public int c;
    public final OutputStream d;

    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public c(byte[] bArr, int i, int i2) {
        this.d = null;
        this.f14033a = bArr;
        this.c = i;
        this.f14034b = i + i2;
    }

    public static int G(int i) {
        return V(i);
    }

    public static int H(int i, int i2) {
        return P(i) + G(i2);
    }

    public static int I(int i, long j) {
        return P(i) + J(j);
    }

    public static int J(long j) {
        return Q(j);
    }

    public static int P(int i) {
        return V(bss.b(i, 0));
    }

    public static int Q(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int V(int i) {
        if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(int i) {
        if (i >= 0) {
            return V(i);
        }
        return 10;
    }

    public static int c(int i, int i2) {
        return P(i) + b(i2);
    }

    public static int d(int i, long j) {
        return P(i) + i(j);
    }

    public static int e(int i, l3s l3sVar) {
        return P(i) + j(l3sVar);
    }

    public static int f(int i, qns qnsVar) {
        return P(i) + k(qnsVar);
    }

    public static int g(int i, String str) {
        return P(i) + l(str);
    }

    public static int h(int i, boolean z) {
        return P(i) + m(z);
    }

    public static int i(long j) {
        return Q(j);
    }

    public static int j(l3s l3sVar) {
        return V(l3sVar.a()) + l3sVar.a();
    }

    public static int k(qns qnsVar) {
        int i = qnsVar.i();
        return V(i) + i;
    }

    public static int l(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return V(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int m(boolean z) {
        return 1;
    }

    public static c n(OutputStream outputStream) {
        return o(outputStream, 4096);
    }

    public static c o(OutputStream outputStream, int i) {
        return new c(outputStream, new byte[i]);
    }

    public static c p(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public void A(l3s l3sVar) throws IOException {
        byte[] bArrD = l3sVar.d();
        W(bArrD.length);
        E(bArrD);
    }

    public void B(qns qnsVar) throws IOException {
        W(qnsVar.a());
        qnsVar.e(this);
    }

    public void C(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        W(bytes.length);
        E(bytes);
    }

    public void D(boolean z) throws IOException {
        S(z ? 1 : 0);
    }

    public void E(byte[] bArr) throws IOException {
        F(bArr, 0, bArr.length);
    }

    public void F(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f14034b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f14033a, i4, i2);
            this.c += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f14033a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.f14034b;
        R();
        if (i7 > this.f14034b) {
            this.d.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, this.f14033a, 0, i7);
            this.c = i7;
        }
    }

    public void K() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void L(int i) throws IOException {
        W(i);
    }

    public void M(int i, int i2) throws IOException {
        T(i, 0);
        L(i2);
    }

    public void N(int i, long j) throws IOException {
        T(i, 0);
        O(j);
    }

    public void O(long j) throws IOException {
        U(j);
    }

    public final void R() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f14033a, 0, this.c);
        this.c = 0;
    }

    public void S(int i) throws IOException {
        r((byte) i);
    }

    public void T(int i, int i2) throws IOException {
        W(bss.b(i, i2));
    }

    public void U(long j) throws IOException {
        while (((-128) & j) != 0) {
            S((((int) j) & 127) | 128);
            j >>>= 7;
        }
        S((int) j);
    }

    public void W(int i) throws IOException {
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            S((i & 127) | 128);
            i >>>= 7;
        }
        S(i);
    }

    public int a() {
        if (this.d == null) {
            return this.f14034b - this.c;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void q() throws IOException {
        if (this.d != null) {
            R();
        }
    }

    public void r(byte b2) throws IOException {
        if (this.c == this.f14034b) {
            R();
        }
        byte[] bArr = this.f14033a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b2;
    }

    public void s(int i) throws IOException {
        if (i >= 0) {
            W(i);
        } else {
            U(i);
        }
    }

    public void t(int i, int i2) throws IOException {
        T(i, 0);
        s(i2);
    }

    public void u(int i, long j) throws IOException {
        T(i, 0);
        z(j);
    }

    public void v(int i, l3s l3sVar) throws IOException {
        T(i, 2);
        A(l3sVar);
    }

    public void w(int i, qns qnsVar) throws IOException {
        T(i, 2);
        B(qnsVar);
    }

    public void x(int i, String str) throws IOException {
        T(i, 2);
        C(str);
    }

    public void y(int i, boolean z) throws IOException {
        T(i, 0);
        D(z);
    }

    public void z(long j) throws IOException {
        U(j);
    }

    public c(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.f14033a = bArr;
        this.c = 0;
        this.f14034b = bArr.length;
    }
}
