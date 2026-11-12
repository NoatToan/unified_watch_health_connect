package defpackage;

import defpackage.r63;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r63<T extends r63<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32228b;
    public boolean c;

    public r63(int i, int i2) {
        this(i, i2, false);
    }

    public int a(int i, r63<? extends r63<?>> r63Var, int i2, int i3) {
        byte[] bArr = new byte[8192];
        int iMin = Math.min(8192, i3);
        int i4 = 0;
        while (true) {
            int iD = d(i4 + i2, bArr, 0, iMin);
            if (iD <= 0) {
                return i4;
            }
            r63Var.j(i4 + i, bArr, 0, iD);
            i4 += iD;
            i3 -= iD;
            iMin = Math.min(8192, i3);
        }
    }

    public abstract int b(OutputStream outputStream, int i, int i2) throws IOException;

    public int c(int i) {
        if (i < 0 || i >= this.f32228b) {
            return -1;
        }
        return e(i) & 255;
    }

    public int d(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i >= (i4 = this.f32228b)) {
            return -1;
        }
        return f(i, bArr, i2, Math.min(i3, i4 - i));
    }

    public abstract int e(int i);

    public abstract int f(int i, byte[] bArr, int i2, int i3);

    public abstract int g(int i, byte[] bArr, int i2, int i3);

    public abstract void h(int i, byte b2);

    public int i() {
        return this.f32228b;
    }

    public int j(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i >= m()) {
            throw new IndexOutOfBoundsException("Attempt to write outside the bounds of the data.");
        }
        int iG = g(i, bArr, i2, Math.min(i3, m() - i));
        this.f32228b = Math.max(this.f32228b, i + iG);
        return iG;
    }

    public void k(int i, byte b2) {
        if (i < 0 || i >= m()) {
            throw new IndexOutOfBoundsException("Attempt to write outside the bounds of the data.");
        }
        h(i, b2);
        this.f32228b = Math.max(this.f32228b, i + 1);
    }

    public int l(int i) {
        int iMin = Math.min(i, this.f32227a);
        this.f32228b = iMin;
        return iMin;
    }

    public int m() {
        return this.f32227a;
    }

    public String n(int i, int i2) {
        if (i2 == -1) {
            i2 = i();
        }
        int iMin = Math.min(i2, i());
        StringBuilder sb = new StringBuilder();
        sb.append("[l=" + this.f32228b + ", s=" + m() + "]");
        if (iMin > 0) {
            sb.append("\n");
        }
        for (int i3 = 0; i3 < iMin; i3++) {
            int iC = c(i3 + i);
            if (iC < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(iC));
            sb.append(" ");
            if (i3 > 0 && (i3 + 1) % 16 == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String toString() {
        return n(0, 0);
    }

    public r63(int i, int i2, boolean z) {
        this.f32227a = i2;
        l(i);
        this.c = z;
    }
}
