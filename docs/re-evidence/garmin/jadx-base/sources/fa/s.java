package fa;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f70057c = new s(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70059b;

    static {
        new s(0, 0);
    }

    public s(int i14, int i15) {
        a.a((i14 == -1 || i14 >= 0) && (i15 == -1 || i15 >= 0));
        this.f70058a = i14;
        this.f70059b = i15;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f70058a == sVar.f70058a && this.f70059b == sVar.f70059b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = this.f70058a;
        return ((i14 >>> 16) | (i14 << 16)) ^ this.f70059b;
    }

    public final String toString() {
        return this.f70058a + "x" + this.f70059b;
    }
}
