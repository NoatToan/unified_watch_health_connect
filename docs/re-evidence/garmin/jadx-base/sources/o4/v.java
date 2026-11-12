package o4;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo4/v;", "Lh5/c0;", "Lh5/y1;", "Lh4/r$c;", "Lkotlin/Function1;", "Lo4/t0;", "", "layerBlock", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends h4.r.c implements h5.c0, h5.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super t0, Unit> f129014a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f5.v1 f129015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v f129016b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f5.v1 v1Var, v vVar) {
            super(1);
            this.f129015a = v1Var;
            this.f129016b = vVar;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            f5.v1.a.K(aVar, this.f129015a, 0, 0, this.f129016b.f129014a, 4);
            return Unit.INSTANCE;
        }
    }

    public v(e23.l<? super t0, Unit> lVar) {
        this.f129014a = lVar;
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        boolean z14;
        r1 r1Var;
        if (h4.i.f81562d) {
            h5.c1 c1VarE = h5.k.e(this, 2);
            if (c1VarE.Y) {
                r1 r1Var2 = c1VarE.T;
                z14 = c1VarE.X;
                r1Var = r1Var2;
            } else {
                o1 o1Var = s0.f128982a;
                if (o1Var == null) {
                    s0.f128982a = new o1();
                } else {
                    o1Var.e();
                }
                o1 o1Var2 = s0.f128982a;
                o1Var2.getClass();
                o1Var2.f128920t = c1VarE.f81711p.A;
                o1Var2.f128919r = g6.n.c(c1VarE.f69146c);
                f4.f.f68735e.getClass();
                f4.f fVarA = f4.f.a.a();
                e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68733f() : null;
                f4.f fVarB = f4.f.a.b(fVarA);
                try {
                    this.f129014a.invoke(o1Var2);
                    Unit unit = Unit.INSTANCE;
                    f4.f.a.e(fVarA, fVarB, f68793s);
                    r1Var = o1Var2.f128916o;
                    z14 = o1Var2.f128917p;
                } catch (Throwable th3) {
                    f4.f.a.e(fVarA, fVarB, f68793s);
                    throw th3;
                }
            }
            if (z14) {
                p5.h0.y(k0Var, r1Var);
            }
        }
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        f5.v1 v1VarQ = y0Var.Q(j8);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a(v1VarQ, this));
    }

    @Override // h5.y1
    public final boolean o1() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f129014a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
