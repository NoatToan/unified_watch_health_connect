package q33;

import l43.o0;
import p43.n0;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<A, C> extends f<A, i<? extends A, ? extends C>> implements l43.e<A, C> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f142455d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o43.h<x, i<A, C>> f142456c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o43.n nVar, v vVar) {
        super(vVar);
        nVar.getClass();
        vVar.getClass();
        this.f142456c = nVar.e(new a(this));
    }

    @Override // l43.e
    public final C c(o0 o0Var, s33.o oVar, n0 n0Var) {
        oVar.getClass();
        return w(o0Var, oVar, l43.d.PROPERTY, n0Var, c.f142445a);
    }

    @Override // l43.e
    public final C e(o0 o0Var, s33.o oVar, n0 n0Var) {
        oVar.getClass();
        return w(o0Var, oVar, l43.d.PROPERTY_GETTER, n0Var, b.f142444a);
    }

    @Override // q33.f
    public final i o(x xVar) {
        return (i) ((o43.e.k) this.f142456c).invoke(xVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    public final C w(o0 o0Var, s33.o oVar, l43.d dVar, n0 n0Var, e23.p<? super i<? extends A, ? extends C>, ? super a0, ? extends C> pVar) {
        C cInvoke;
        Boolean boolD = u33.b.B.d(oVar.f156769d);
        boolean zD = w33.g.d(oVar);
        u33.c cVarQ = q();
        f.f142458b.getClass();
        x xVarA = f.b.a(o0Var, true, true, boolD, zD, this.f142459a, cVarQ);
        if (xVarA == null) {
            if (o0Var instanceof o0.a) {
                y0 y0Var = ((o0.a) o0Var).f110078c;
                z zVar = y0Var instanceof z ? (z) y0Var : null;
                if (zVar != null) {
                    xVarA = zVar.f142541b;
                } else {
                    xVarA = null;
                }
            } else {
                xVarA = null;
            }
        }
        if (xVarA != null) {
            u33.c cVar = xVarA.a().f150096b;
            o.f142513b.getClass();
            u33.c cVar2 = o.f142517f;
            cVar2.getClass();
            a0 a0VarP = f.p(oVar, o0Var.f110076a, o0Var.f110077b, dVar, cVar.a(cVar2.f168291b, cVar2.f168292c, cVar2.f168293d));
            if (a0VarP != null && (cInvoke = pVar.invoke((Object) ((o43.e.k) this.f142456c).invoke(xVarA), a0VarP)) != null) {
                return q23.m.a(n0Var) ? (C) x(cInvoke) : cInvoke;
            }
        }
        return null;
    }

    public abstract d43.g x(Object obj);
}
