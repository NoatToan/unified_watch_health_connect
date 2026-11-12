package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ypk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40405b;
    public final float c;
    public final float d;

    public ypk(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ypk)) {
            return false;
        }
        ypk ypkVar = (ypk) obj;
        return this.f40404a == ypkVar.f40404a && this.f40405b == ypkVar.f40405b;
    }

    public int hashCode() {
        return ilb.a(this.f40404a, this.f40405b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f40404a), Integer.valueOf(this.f40405b));
    }

    public ypk(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public ypk(int i, int i2, float f, float f2) {
        b6i.b(i > 0);
        b6i.b(i2 > 0);
        this.f40404a = i;
        this.f40405b = i2;
        this.c = f;
        this.d = f2;
    }
}
