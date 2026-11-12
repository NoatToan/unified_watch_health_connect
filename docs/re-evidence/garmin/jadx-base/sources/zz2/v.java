package zz2;

import a03.i0;
import a03.l0;
import a03.n0;
import a03.r0;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import i3.ve;
import java.util.Set;
import kotlin.k2;
import o4.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.a1;
import p008y1.b2;
import p3.p1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class v implements e23.q<c2.w, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a03.p f207715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f207716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f207717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f207718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f207719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f207720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f207721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a03.a<a03.y> f207722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f207723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r1 f207724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f207725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f207726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f207727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f207728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f207729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f207730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f207731q;

    /* JADX WARN: Multi-variable type inference failed */
    public v(a03.p pVar, long j8, e23.a<Unit> aVar, h4.r rVar, boolean z14, float f14, float f15, a03.a<a03.y> aVar2, e23.l<? super Float, Unit> lVar, r1 r1Var, long j14, long j15, float f16, p1<Boolean> p1Var, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, o53.b0 b0Var) {
        this.f207715a = pVar;
        this.f207716b = j8;
        this.f207717c = aVar;
        this.f207718d = rVar;
        this.f207719e = z14;
        this.f207720f = f14;
        this.f207721g = f15;
        this.f207722h = aVar2;
        this.f207723i = lVar;
        this.f207724j = r1Var;
        this.f207725k = j14;
        this.f207726l = j15;
        this.f207727m = f16;
        this.f207728n = p1Var;
        this.f207729o = pVar2;
        this.f207730p = qVar;
        this.f207731q = b0Var;
    }

    @Override // e23.q
    public final Unit invoke(c2.w wVar, p3.m mVar, Integer num) {
        c2.w wVar2 = wVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        wVar2.getClass();
        if ((iIntValue & 14) == 0) {
            iIntValue |= mVar2.B(wVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && mVar2.b()) {
            mVar2.e();
        } else {
            float fI = g6.a.i(wVar2.getF22927c());
            mVar2.L(-90558847);
            a03.p pVar = this.f207715a;
            boolean z14 = pVar.f156g;
            r0<a03.y> r0Var = pVar.f158i;
            if (z14) {
                i0.a(0, this.f207716b, this.f207717c, mVar2, ((a03.y) r0Var.f178i.getF182175a()) != a03.y.Hidden);
            }
            mVar2.R();
            h4.r rVarC = x2.c(x2.f(x2.w(this.f207718d, 0.0f, c.f207653b, 1), 1.0f), 1.0f);
            h4.d.f81522a.getClass();
            h4.r rVarC2 = wVar2.c(rVarC, h4.d.a.f81531i);
            mVar2.L(-90544267);
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new zw.b(10);
                mVar2.K(objQ);
            }
            mVar2.R();
            h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarC2, false);
            mVar2.L(-90542130);
            boolean zB = mVar2.B(pVar);
            boolean z15 = this.f207719e;
            boolean zH = zB | mVar2.h(z15);
            Object objQ2 = mVar2.q();
            p1<Boolean> p1Var = this.f207728n;
            if (zH || objQ2 == c2565a) {
                objQ2 = new n(pVar, z15, p1Var, 1);
                mVar2.K(objQ2);
            }
            mVar2.R();
            h4.r rVarT = c2.l.t(rVarC3, (e23.l) objQ2);
            mVar2.L(-90527516);
            boolean zB2 = mVar2.B(pVar);
            Object objQ3 = mVar2.q();
            e23.l<Float, Unit> lVar = this.f207723i;
            if (zB2 || objQ3 == c2565a) {
                if (pVar.f155f) {
                    b2 b2Var = b2.Vertical;
                    yt.f fVar = new yt.f(24, pVar, p1Var);
                    b2Var.getClass();
                    lVar.getClass();
                    objQ3 = new a03.v(fVar, pVar, lVar, b2Var);
                } else {
                    objQ3 = new a03.w();
                }
                mVar2.K(objQ3);
            }
            mVar2.R();
            h4.r rVarA = a5.f.a(rVarT, (a5.a) objQ3, null);
            float fM = lg.d.M(this.f207720f, mVar2);
            float fM2 = lg.d.M(this.f207721g, mVar2);
            a03.m mVar3 = pVar.f153d;
            boolean z16 = pVar.f156g;
            mVar2.L(-90494752);
            Object objQ4 = mVar2.q();
            if (objQ4 == c2565a) {
                objQ4 = new o(p1Var, null);
                mVar2.K(objQ4);
            }
            e23.q qVar = (e23.q) objQ4;
            mVar2.R();
            mVar2.L(-90492253);
            boolean zB3 = mVar2.B(lVar);
            Object objQ5 = mVar2.q();
            if (zB3 || objQ5 == c2565a) {
                objQ5 = new bt1.k(lVar, p1Var, 16);
                mVar2.K(objQ5);
            }
            e23.p pVar2 = (e23.p) objQ5;
            mVar2.R();
            rVarA.getClass();
            mVar3.getClass();
            a03.a<a03.y> aVar = this.f207722h;
            aVar.getClass();
            qVar.getClass();
            pVar2.getClass();
            h4.r rVarA2 = a1.a(rVarA, r0Var.f176g, b2.Vertical, pVar.f(), null, r0Var.f183n.getF182175a() != 0, qVar, new a03.c0(pVar2), false, SyslogConstants.LOG_LOCAL1);
            Set setM0 = p13.u.m0(new a03.y[]{a03.y.Hidden, a03.y.IntermediatelyExpanded, a03.y.SlightlyExpanded, a03.y.FullyExpanded});
            a03.z zVar = new a03.z(z16, fI, fM2, mVar3, pVar, fM);
            rVarA2.getClass();
            setM0.getClass();
            ve.a(rVarA2.then(new l0(new a03.f(r0Var, 1), new n0(r0Var, setM0, aVar, zVar, 0), k2.f91249a)), this.f207724j, this.f207725k, this.f207726l, this.f207727m, 0.0f, null, z3.f.b(-1156670457, new u(this.f207715a, this.f207729o, this.f207730p, this.f207717c, this.f207731q), mVar2), mVar2, 12582912, 96);
        }
        return Unit.INSTANCE;
    }
}
