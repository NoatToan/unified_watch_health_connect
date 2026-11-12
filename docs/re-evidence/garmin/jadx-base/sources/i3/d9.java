package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class d9 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, c2.k3> f87833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b<Float, s1.n> f87834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f87835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f87837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f87838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f87839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f87840h;

    /* JADX WARN: Multi-variable type inference failed */
    public d9(e23.p<? super p3.m, ? super Integer, ? extends c2.k3> pVar, s1.b<Float, s1.n> bVar, mc mcVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, e23.a<Unit> aVar, o53.b0 b0Var, boolean z14) {
        this.f87833a = pVar;
        this.f87834b = bVar;
        this.f87835c = mcVar;
        this.f87836d = pVar2;
        this.f87837e = qVar;
        this.f87838f = aVar;
        this.f87839g = b0Var;
        this.f87840h = z14;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        int i14 = 0;
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarG = c2.l.G(c2.x2.f(h4.r.S, 1.0f), this.f87833a.invoke(mVar2, 0));
            s1.b<Float, s1.n> bVar = this.f87834b;
            boolean zR = mVar2.r(bVar);
            Object objQ = mVar2.q();
            if (zR) {
                objQ = new x8(bVar, i14);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new x8(bVar, i14);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarA = o4.s0.a(o4.s0.a(rVarG, (e23.l) objQ), new j0(this.f87835c, 0));
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar2);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            e23.p<p3.m, Integer, Unit> pVar = this.f87836d;
            if (pVar != null) {
                mVar2.C(1352934765);
                int i15 = l3.n1.f109367b;
                kc.a(b0Var, z3.f.c(2000500644, new c9(this.f87835c, this.f87838f, this.f87839g, this.f87840h, l3.k.h(mVar2, R.string.m3c_bottom_sheet_dismiss_description), l3.k.h(mVar2, R.string.m3c_bottom_sheet_expand_description), l3.k.h(mVar2, R.string.m3c_bottom_sheet_collapse_description), pVar), mVar2), mVar2, 54);
                mVar2.f();
            } else {
                mVar2.C(1356009965);
                mVar2.f();
            }
            this.f87837e.invoke(b0Var, mVar2, 6);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
