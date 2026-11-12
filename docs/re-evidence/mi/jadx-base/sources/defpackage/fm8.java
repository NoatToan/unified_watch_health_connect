package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class fm8 extends e4h.a {
    public static e4h<fm8> e;
    public float c;
    public float d;

    static {
        e4h<fm8> e4hVarA = e4h.a(256, new fm8(0.0f, 0.0f));
        e = e4hVarA;
        e4hVarA.g(0.5f);
    }

    public fm8() {
    }

    public static fm8 b(float f, float f2) {
        fm8 fm8Var = (fm8) e.b();
        fm8Var.c = f;
        fm8Var.d = f2;
        return fm8Var;
    }

    public static void c(fm8 fm8Var) {
        e.c(fm8Var);
    }

    @Override // e4h.a
    public e4h.a a() {
        return new fm8(0.0f, 0.0f);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm8)) {
            return false;
        }
        fm8 fm8Var = (fm8) obj;
        return this.c == fm8Var.c && this.d == fm8Var.d;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.c) ^ Float.floatToIntBits(this.d);
    }

    public String toString() {
        return this.c + "x" + this.d;
    }

    public fm8(float f, float f2) {
        this.c = f;
        this.d = f2;
    }
}
