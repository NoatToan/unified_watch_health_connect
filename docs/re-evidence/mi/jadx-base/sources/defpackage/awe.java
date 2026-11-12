package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class awe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3513b;

    public awe(int i, int i2) {
        this.f3512a = i;
        this.f3513b = i2;
    }

    public final int a() {
        return this.f3513b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i, byte[] bArr);

    public final int d() {
        return this.f3512a;
    }

    public awe e() {
        return new khd(this);
    }

    public boolean f() {
        return false;
    }

    public awe g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f3512a;
        byte[] bArrC = new byte[i];
        StringBuilder sb = new StringBuilder(this.f3513b * (i + 1));
        for (int i2 = 0; i2 < this.f3513b; i2++) {
            bArrC = c(i2, bArrC);
            for (int i3 = 0; i3 < this.f3512a; i3++) {
                int i4 = bArrC[i3] & 255;
                if (i4 < 64) {
                    c = '#';
                } else if (i4 < 128) {
                    c = '+';
                } else {
                    c = i4 < 192 ? '.' : ' ';
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
