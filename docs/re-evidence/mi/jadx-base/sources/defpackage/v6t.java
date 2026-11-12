package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v6t f36573a;

    public v6t() {
    }

    public int a() {
        v6t v6tVar = this.f36573a;
        return Math.min(Integer.MAX_VALUE, v6tVar != null ? v6tVar.a() : Integer.MAX_VALUE);
    }

    public void b(int i) {
        v6t v6tVar = this.f36573a;
        if (v6tVar != null) {
            v6tVar.b(i);
        }
    }

    public void c(boolean z) {
        v6t v6tVar = this.f36573a;
        if (v6tVar != null) {
            v6tVar.c(z);
        }
    }

    public abstract boolean d();

    public final boolean e() {
        v6t v6tVar = this.f36573a;
        if (v6tVar == null || v6tVar.e()) {
            return d();
        }
        return false;
    }

    public v6t(v6t v6tVar) {
        this.f36573a = v6tVar;
    }
}
