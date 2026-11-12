package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class jxk {
    public static final jxk c = new jxk(-1, false);
    public static final jxk d = new jxk(-2, false);
    public static final jxk e = new jxk(-1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23224b;

    public jxk(int i, boolean z) {
        this.f23223a = i;
        this.f23224b = z;
    }

    public static jxk a() {
        return c;
    }

    public static jxk b() {
        return e;
    }

    public static jxk d() {
        return d;
    }

    public boolean c() {
        return this.f23224b;
    }

    public int e() {
        if (g()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f23223a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jxk)) {
            return false;
        }
        jxk jxkVar = (jxk) obj;
        return this.f23223a == jxkVar.f23223a && this.f23224b == jxkVar.f23224b;
    }

    public boolean f() {
        return this.f23223a != -2;
    }

    public boolean g() {
        return this.f23223a == -1;
    }

    public int hashCode() {
        return ilb.c(Integer.valueOf(this.f23223a), Boolean.valueOf(this.f23224b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f23223a), Boolean.valueOf(this.f23224b));
    }
}
