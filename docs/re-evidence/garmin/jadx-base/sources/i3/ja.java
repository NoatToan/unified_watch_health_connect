package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ja implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4.r f88557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f88559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg f88560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f88561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<String, Unit> f88562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f88563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f88564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f88565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p006l2.a2 f88566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p006l2.z1 f88567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f88568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f88569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f88570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x5.r0 f88571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a2.j f88572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88574r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88575t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88576v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88579y;

    /* JADX WARN: Multi-variable type inference failed */
    public ja(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, boolean z14, sg sgVar, String str, e23.l<? super String, Unit> lVar, boolean z15, boolean z16, s5.x0 x0Var, p006l2.a2 a2Var, p006l2.z1 z1Var, boolean z17, int i14, int i15, x5.r0 r0Var, a2.j jVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5, e23.p<? super p3.m, ? super Integer, Unit> pVar6, e23.p<? super p3.m, ? super Integer, Unit> pVar7, o4.r1 r1Var) {
        this.f88557a = rVar;
        this.f88558b = pVar;
        this.f88559c = z14;
        this.f88560d = sgVar;
        this.f88561e = str;
        this.f88562f = lVar;
        this.f88563g = z15;
        this.f88564h = z16;
        this.f88565i = x0Var;
        this.f88566j = a2Var;
        this.f88567k = z1Var;
        this.f88568l = z17;
        this.f88569m = i14;
        this.f88570n = i15;
        this.f88571o = r0Var;
        this.f88572p = jVar;
        this.f88573q = pVar2;
        this.f88574r = pVar3;
        this.f88575t = pVar4;
        this.f88576v = pVar5;
        this.f88577w = pVar6;
        this.f88578x = pVar7;
        this.f88579y = r1Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        h4.r rVarC;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (this.f88558b != null) {
                mVar2.C(-903490605);
                h4.r.a aVar = h4.r.S;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.f(23);
                    mVar2.K(objQ);
                }
                rVarC = c2.l.C(p5.v.c((e23.l) objQ, aVar, true), 0.0f, l3.k2.g(mVar2), 0.0f, 0.0f, 13);
                mVar2.f();
            } else {
                mVar2.C(-903106918);
                mVar2.f();
                rVarC = h4.r.S;
            }
            h4.r rVarThen = this.f88557a.then(rVarC);
            int i14 = l3.n1.f109367b;
            String strH = l3.k.h(mVar2, R.string.default_error_message);
            boolean z14 = this.f88559c;
            h4.r rVarD = l3.k2.d(rVarThen, z14, strH);
            ba.f87580a.getClass();
            h4.r rVarA = c2.x2.a(rVarD, ba.f87582c, ba.f87581b);
            sg sgVar = this.f88560d;
            o4.t1 t1Var = new o4.t1(z14 ? sgVar.f89684j : sgVar.f89683i, null);
            sg sgVar2 = this.f88560d;
            o4.r1 r1Var = this.f88579y;
            String str = this.f88561e;
            boolean z15 = this.f88563g;
            boolean z16 = this.f88568l;
            x5.r0 r0Var = this.f88571o;
            a2.j jVar = this.f88572p;
            p006l2.r.a(str, this.f88562f, rVarA, z15, this.f88564h, this.f88565i, this.f88566j, this.f88567k, z16, this.f88569m, this.f88570n, r0Var, null, jVar, t1Var, z3.f.c(-1189274459, new ia(str, z15, z16, r0Var, jVar, this.f88559c, this.f88558b, this.f88573q, this.f88574r, this.f88575t, this.f88576v, this.f88577w, this.f88578x, sgVar2, r1Var), mVar2), mVar2, 0, 4096);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
