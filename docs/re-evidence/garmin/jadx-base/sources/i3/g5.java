package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/g5;", "Li3/b0;", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g5 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g5 f88187a = new g5();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f88188a;

        public a(c0 c0Var) {
            this.f88188a = c0Var;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0048  */
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                int i14 = l3.n1.f109367b;
                String strH = l3.k.h(mVar2, R.string.m3c_dialog);
                c0 c0Var = this.f88188a;
                h4.r rVarT = c2.x2.t(c0Var.f87688b, l.f88773a, 0.0f, l.f88774b, 10);
                h4.r.a aVar = h4.r.S;
                boolean zB = mVar2.B(strH);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new i11.g(strH, 7);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new i11.g(strH, 7);
                        mVar2.K(objQ);
                    }
                }
                h4.r rVarThen = rVarT.then(p5.v.c((e23.l) objQ, aVar, false));
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarThen, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar2);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.u uVar = c2.u.f22885a;
                v.h.B(c0Var.f87690d, mVar2, 0);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    private g5() {
    }

    @Override // i3.b0
    public final void a(c0 c0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1565826668);
        int i15 = (o0VarE.B(c0Var) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p004k6.c.a(c0Var.f87687a, c0Var.f87689c, z3.f.c(1163527043, new a(c0Var), o0VarE), o0VarE, 384, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(this, c0Var, i14, i16);
        }
    }
}
