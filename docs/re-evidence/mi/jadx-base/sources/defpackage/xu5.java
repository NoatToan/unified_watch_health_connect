package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class xu5 implements jl8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm5 f39472b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f39471a = new byte[4096];

    public xu5(zm5 zm5Var, long j, long j2) {
        this.f39472b = zm5Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.jl8
    public int a(int i) throws IOException {
        int iV = v(i);
        if (iV == 0) {
            byte[] bArr = this.f39471a;
            iV = u(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        r(iV);
        return iV;
    }

    @Override // defpackage.jl8
    public boolean e(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int iT = t(bArr, i, i2);
        while (iT < i2 && iT != -1) {
            iT = u(bArr, i, i2, iT, z);
        }
        r(iT);
        return iT != -1;
    }

    @Override // defpackage.jl8
    public int g(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        s(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = u(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.g += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, iMin);
        this.f += iMin;
        return iMin;
    }

    @Override // defpackage.jl8
    public long getLength() {
        return this.c;
    }

    @Override // defpackage.jl8
    public long getPosition() {
        return this.d;
    }

    @Override // defpackage.jl8
    public void i(byte[] bArr, int i, int i2) throws IOException {
        k(bArr, i, i2, false);
    }

    @Override // defpackage.jl8
    public boolean k(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!q(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.jl8
    public void l() {
        this.f = 0;
    }

    @Override // defpackage.jl8
    public long n() {
        return this.d + ((long) this.f);
    }

    @Override // defpackage.jl8
    public void o(int i) throws IOException {
        q(i, false);
    }

    @Override // defpackage.jl8
    public void p(int i) throws IOException {
        w(i, false);
    }

    @Override // defpackage.jl8
    public boolean q(int i, boolean z) throws IOException {
        s(i);
        int iU = this.g - this.f;
        while (iU < i) {
            iU = u(this.e, this.f, i, iU, z);
            if (iU == -1) {
                return false;
            }
            this.g = this.f + iU;
        }
        this.f += i;
        return true;
    }

    public final void r(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    @Override // defpackage.jl8, defpackage.zm5
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iT = t(bArr, i, i2);
        if (iT == 0) {
            iT = u(bArr, i, i2, 0, true);
        }
        r(iT);
        return iT;
    }

    @Override // defpackage.jl8
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        e(bArr, i, i2, false);
    }

    public final void s(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, wlq.r(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int t(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, iMin);
        x(iMin);
        return iMin;
    }

    public final int u(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f39472b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int v(int i) {
        int iMin = Math.min(this.g, i);
        x(iMin);
        return iMin;
    }

    public boolean w(int i, boolean z) throws IOException {
        int iV = v(i);
        while (iV < i && iV != -1) {
            iV = u(this.f39471a, -iV, Math.min(i, this.f39471a.length + iV), iV, z);
        }
        r(iV);
        return iV != -1;
    }

    public final void x(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }
}
