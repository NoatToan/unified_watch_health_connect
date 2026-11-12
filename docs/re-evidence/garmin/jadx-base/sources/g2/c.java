package g2;

import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lg2/c;", "Lh5/x0;", "Lg2/c$a;", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends h5.x0<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f75063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.s f75064b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/c$a;", "Lh4/r$c;", "<init>", "(Lg2/c;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends h4.r.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q5.g.a f75065a;

        public a() {
        }

        @Override // h4.r.c
        public final void onAttach() {
            c cVar = c.this;
            cVar.f75063a = this;
            if (cVar.f75064b != null) {
                this.f75065a = f5.g0.i(this, new e52.b(28, this, cVar));
            }
        }

        @Override // h4.r.c
        public final void onDetach() {
            c cVar = c.this;
            if (cVar.f75063a == this) {
                cVar.f75063a = null;
            }
            q5.g.a aVar = this.f75065a;
            if (aVar != null) {
                aVar.b();
            }
            this.f75065a = null;
        }
    }

    public final Object a(v13.c cVar) {
        o53.s sVarB = this.f75064b;
        if (sVarB == null) {
            sVarB = gl.b.b();
            this.f75064b = sVarB;
            a aVar = this.f75063a;
            if (aVar != null && aVar.getIsAttached()) {
                aVar.f75065a = f5.g0.i(aVar, new e52.b(28, aVar, c.this));
            }
        }
        Object objC = sVarB.C(cVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new a();
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // h5.x0
    public final int hashCode() {
        return 234;
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "AwaitFirstLayoutModifier";
    }

    @Override // h5.x0
    public final /* bridge */ /* synthetic */ void update(h4.r.c cVar) {
    }
}
