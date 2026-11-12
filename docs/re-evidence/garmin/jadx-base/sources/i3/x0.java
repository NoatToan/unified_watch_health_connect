package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class x0 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f90183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f90185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f90186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f90187e;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(mc mcVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, o53.b0 b0Var, boolean z14) {
        this.f90183a = mcVar;
        this.f90184b = pVar;
        this.f90185c = qVar;
        this.f90186d = b0Var;
        this.f90187e = z14;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarA = o4.s0.a(c2.x2.f(h4.r.S, 1.0f), new j0(this.f90183a, 0));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarA, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            e23.p<p3.m, Integer, Unit> pVar = this.f90184b;
            if (pVar != null) {
                mVar2.C(-1044068159);
                int i14 = l3.n1.f109367b;
                kc.a(b0Var, z3.f.c(-511691176, new w0(this.f90183a, this.f90186d, this.f90187e, l3.k.h(mVar2, R.string.m3c_bottom_sheet_expand_description), l3.k.h(mVar2, R.string.m3c_bottom_sheet_collapse_description), l3.k.h(mVar2, R.string.m3c_bottom_sheet_dismiss_description), pVar), mVar2), mVar2, 54);
                mVar2.f();
            } else {
                mVar2.C(-1040260677);
                mVar2.f();
            }
            this.f90185c.invoke(b0Var, mVar2, 6);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
