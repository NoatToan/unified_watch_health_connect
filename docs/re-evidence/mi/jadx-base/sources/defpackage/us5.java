package defpackage;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes4.dex */
public final class us5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f36078b;
    public final Format c;
    public final int d;
    public final int e;

    public us5(String str, Format format, Format format2, int i, int i2) {
        rk1.a(i == 0 || i2 == 0);
        this.f36077a = rk1.d(str);
        this.f36078b = (Format) rk1.e(format);
        this.c = (Format) rk1.e(format2);
        this.d = i;
        this.e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || us5.class != obj.getClass()) {
            return false;
        }
        us5 us5Var = (us5) obj;
        return this.d == us5Var.d && this.e == us5Var.e && this.f36077a.equals(us5Var.f36077a) && this.f36078b.equals(us5Var.f36078b) && this.c.equals(us5Var.c);
    }

    public int hashCode() {
        return ((((((((527 + this.d) * 31) + this.e) * 31) + this.f36077a.hashCode()) * 31) + this.f36078b.hashCode()) * 31) + this.c.hashCode();
    }
}
