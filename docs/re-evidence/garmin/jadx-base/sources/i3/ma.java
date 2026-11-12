package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ma implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4.r f88965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f88967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg f88968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x5.l0 f88969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<x5.l0, Unit> f88970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f88971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f88972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f88973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p006l2.a2 f88974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p006l2.z1 f88975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f88976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f88977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f88978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x5.r0 f88979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a2.j f88980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88982r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88983t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88984v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88985w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88986x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88987y;

    /* JADX WARN: Multi-variable type inference failed */
    public ma(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, boolean z14, sg sgVar, x5.l0 l0Var, e23.l<? super x5.l0, Unit> lVar, boolean z15, boolean z16, s5.x0 x0Var, p006l2.a2 a2Var, p006l2.z1 z1Var, boolean z17, int i14, int i15, x5.r0 r0Var, a2.j jVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5, e23.p<? super p3.m, ? super Integer, Unit> pVar6, e23.p<? super p3.m, ? super Integer, Unit> pVar7, o4.r1 r1Var) {
        this.f88965a = rVar;
        this.f88966b = pVar;
        this.f88967c = z14;
        this.f88968d = sgVar;
        this.f88969e = l0Var;
        this.f88970f = lVar;
        this.f88971g = z15;
        this.f88972h = z16;
        this.f88973i = x0Var;
        this.f88974j = a2Var;
        this.f88975k = z1Var;
        this.f88976l = z17;
        this.f88977m = i14;
        this.f88978n = i15;
        this.f88979o = r0Var;
        this.f88980p = jVar;
        this.f88981q = pVar2;
        this.f88982r = pVar3;
        this.f88983t = pVar4;
        this.f88984v = pVar5;
        this.f88985w = pVar6;
        this.f88986x = pVar7;
        this.f88987y = r1Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        h4.r rVarC;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (this.f88966b != null) {
                mVar2.C(-1901539802);
                h4.r.a aVar = h4.r.S;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.f(24);
                    mVar2.K(objQ);
                }
                rVarC = c2.l.C(p5.v.c((e23.l) objQ, aVar, true), 0.0f, l3.k2.g(mVar2), 0.0f, 0.0f, 13);
                mVar2.f();
            } else {
                mVar2.C(-1901156115);
                mVar2.f();
                rVarC = h4.r.S;
            }
            h4.r rVarThen = this.f88965a.then(rVarC);
            int i14 = l3.n1.f109367b;
            String strH = l3.k.h(mVar2, R.string.default_error_message);
            boolean z14 = this.f88967c;
            h4.r rVarD = l3.k2.d(rVarThen, z14, strH);
            ba.f87580a.getClass();
            h4.r rVarA = c2.x2.a(rVarD, ba.f87582c, ba.f87581b);
            sg sgVar = this.f88968d;
            o4.t1 t1Var = new o4.t1(z14 ? sgVar.f89684j : sgVar.f89683i, null);
            sg sgVar2 = this.f88968d;
            o4.r1 r1Var = this.f88987y;
            x5.l0 l0Var = this.f88969e;
            boolean z15 = this.f88971g;
            boolean z16 = this.f88976l;
            x5.r0 r0Var = this.f88979o;
            a2.j jVar = this.f88980p;
            p006l2.r.c(l0Var, this.f88970f, rVarA, z15, this.f88972h, this.f88973i, this.f88974j, this.f88975k, z16, this.f88977m, this.f88978n, r0Var, null, jVar, t1Var, z3.f.c(674541106, new la(l0Var, z15, z16, r0Var, jVar, this.f88967c, this.f88966b, this.f88981q, this.f88982r, this.f88983t, this.f88984v, this.f88985w, this.f88986x, sgVar2, r1Var), mVar2), mVar2, 0, 196608, 4096);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
