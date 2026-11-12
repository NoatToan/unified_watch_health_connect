package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class vye extends e4h.a {
    public static e4h<vye> e;
    public double c;
    public double d;

    static {
        e4h<vye> e4hVarA = e4h.a(64, new vye(0.0d, 0.0d));
        e = e4hVarA;
        e4hVarA.g(0.5f);
    }

    public vye(double d, double d2) {
        this.c = d;
        this.d = d2;
    }

    public static vye b(double d, double d2) {
        vye vyeVar = (vye) e.b();
        vyeVar.c = d;
        vyeVar.d = d2;
        return vyeVar;
    }

    public static void c(vye vyeVar) {
        e.c(vyeVar);
    }

    @Override // e4h.a
    public e4h.a a() {
        return new vye(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.c + ", y: " + this.d;
    }
}
