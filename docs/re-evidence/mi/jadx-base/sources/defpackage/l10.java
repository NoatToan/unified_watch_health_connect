package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l10<T> extends j00<T> {
    public final o0m g;
    public final ook h;

    public class a extends e52<T> {
        public a() {
        }

        @Override // defpackage.e52
        public void f() {
            l10.this.v();
        }

        @Override // defpackage.e52
        public void g(Throwable th) {
            l10.this.w(th);
        }

        @Override // defpackage.e52
        public void h(T t, int i) {
            l10.this.x(t, i);
        }

        @Override // defpackage.e52
        public void i(float f) {
            l10.this.m(f);
        }
    }

    public l10(dbi<T> dbiVar, o0m o0mVar, ook ookVar) {
        if (epa.d()) {
            epa.a("AbstractProducerToDataSourceAdapter()");
        }
        this.g = o0mVar;
        this.h = ookVar;
        if (epa.d()) {
            epa.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        ookVar.e(o0mVar.b(), o0mVar.a(), o0mVar.getId(), o0mVar.e());
        if (epa.d()) {
            epa.b();
        }
        if (epa.d()) {
            epa.a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        dbiVar.a(u(), o0mVar);
        if (epa.d()) {
            epa.b();
        }
        if (epa.d()) {
            epa.b();
        }
    }

    @Override // defpackage.j00, defpackage.cp5
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.a()) {
            return true;
        }
        this.h.k(this.g.getId());
        this.g.l();
        return true;
    }

    public final cg4<T> u() {
        return new a();
    }

    public final synchronized void v() {
        b6i.i(g());
    }

    public final void w(Throwable th) {
        if (super.k(th)) {
            this.h.j(this.g.b(), this.g.getId(), th, this.g.e());
        }
    }

    public void x(T t, int i) {
        boolean zD = e52.d(i);
        if (super.o(t, zD) && zD) {
            this.h.b(this.g.b(), this.g.getId(), this.g.e());
        }
    }
}
