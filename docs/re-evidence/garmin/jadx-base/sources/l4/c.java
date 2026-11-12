package l4;

import h5.h0;
import h5.i1;
import h5.j1;
import i3.e5;
import o4.q0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll4/c;", "Lh4/r$c;", "Ll4/b;", "Lh5/i1;", "Ll4/a;", "Ll4/f;", "cacheDrawScope", "Lkotlin/Function1;", "Ll4/l;", "block", "<init>", "(Ll4/f;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends h4.r.c implements b, i1, l4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f109837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f109838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f109839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l<? super f, l> f109840d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo4/q0;", "invoke", "()Lo4/q0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<q0> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final q0 invoke() {
            c cVar = c.this;
            t tVar = cVar.f109839c;
            if (tVar == null) {
                tVar = new t();
                cVar.f109839c = tVar;
            }
            if (tVar.f109871b == null) {
                q0 graphicsContext = h5.k.h(cVar).getGraphicsContext();
                tVar.c();
                tVar.f109871b = graphicsContext;
            }
            return tVar;
        }
    }

    public c(f fVar, e23.l<? super f, l> lVar) {
        this.f109837a = fVar;
        this.f109840d = lVar;
        fVar.f109845a = this;
        new a();
    }

    @Override // l4.a
    public final long b() {
        return g6.n.c(h5.k.e(this, 4).f69146c);
    }

    @Override // h5.s
    public final void b1() {
        l0();
    }

    @Override // l4.a
    public final g6.c getDensity() {
        return h5.k.g(this).A;
    }

    @Override // l4.a
    public final g6.o getLayoutDirection() {
        return h5.k.g(this).B;
    }

    @Override // l4.b
    public final void l0() {
        t tVar = this.f109839c;
        if (tVar != null) {
            tVar.c();
        }
        this.f109838b = false;
        this.f109837a.f109846b = null;
        h5.t.a(this);
    }

    @Override // h5.j, h5.u1
    public final void onDensityChange() {
        l0();
    }

    @Override // h4.r.c
    public final void onDetach() {
        super.onDetach();
        t tVar = this.f109839c;
        if (tVar != null) {
            tVar.c();
        }
    }

    @Override // h5.j
    public final void onLayoutDirectionChange() {
        l0();
    }

    @Override // h4.r.c
    public final void onReset() {
        super.onReset();
        l0();
    }

    @Override // h5.s
    public final void p(h0 h0Var) {
        boolean z14 = this.f109838b;
        f fVar = this.f109837a;
        if (!z14) {
            fVar.f109846b = null;
            j1.a(this, new d(this, fVar));
            if (fVar.f109846b == null) {
                throw e5.m("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f109838b = true;
        }
        l lVar = fVar.f109846b;
        lVar.getClass();
        lVar.f109849a.invoke(h0Var);
    }

    @Override // h5.i1
    public final void x1() {
        l0();
    }
}
