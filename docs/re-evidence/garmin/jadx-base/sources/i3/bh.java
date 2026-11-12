package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class bh implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4.r f87608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f87609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sg f87610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f87611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<String, Unit> f87612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f87613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f87614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f87615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p006l2.a2 f87616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p006l2.z1 f87617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f87618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f87619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f87620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x5.r0 f87621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a2.j f87622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87625r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87626t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f87630y;

    /* JADX WARN: Multi-variable type inference failed */
    public bh(h4.r rVar, boolean z14, sg sgVar, String str, e23.l<? super String, Unit> lVar, boolean z15, boolean z16, s5.x0 x0Var, p006l2.a2 a2Var, p006l2.z1 z1Var, boolean z17, int i14, int i15, x5.r0 r0Var, a2.j jVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, e23.p<? super p3.m, ? super Integer, Unit> pVar5, e23.p<? super p3.m, ? super Integer, Unit> pVar6, e23.p<? super p3.m, ? super Integer, Unit> pVar7, o4.r1 r1Var) {
        this.f87608a = rVar;
        this.f87609b = z14;
        this.f87610c = sgVar;
        this.f87611d = str;
        this.f87612e = lVar;
        this.f87613f = z15;
        this.f87614g = z16;
        this.f87615h = x0Var;
        this.f87616i = a2Var;
        this.f87617j = z1Var;
        this.f87618k = z17;
        this.f87619l = i14;
        this.f87620m = i15;
        this.f87621n = r0Var;
        this.f87622o = jVar;
        this.f87623p = pVar;
        this.f87624q = pVar2;
        this.f87625r = pVar3;
        this.f87626t = pVar4;
        this.f87627v = pVar5;
        this.f87628w = pVar6;
        this.f87629x = pVar7;
        this.f87630y = r1Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i14 = l3.n1.f109367b;
            String strH = l3.k.h(mVar2, R.string.default_error_message);
            h4.r rVar = this.f87608a;
            boolean z14 = this.f87609b;
            h4.r rVarD = l3.k2.d(rVar, z14, strH);
            wg.f90137a.getClass();
            h4.r rVarA = c2.x2.a(rVarD, wg.f90139c, wg.f90138b);
            sg sgVar = this.f87610c;
            o4.t1 t1Var = new o4.t1(z14 ? sgVar.f89684j : sgVar.f89683i, null);
            o4.r1 r1Var = this.f87630y;
            sg sgVar2 = this.f87610c;
            String str = this.f87611d;
            boolean z15 = this.f87613f;
            boolean z16 = this.f87618k;
            x5.r0 r0Var = this.f87621n;
            a2.j jVar = this.f87622o;
            p006l2.r.a(str, this.f87612e, rVarA, z15, this.f87614g, this.f87615h, this.f87616i, this.f87617j, z16, this.f87619l, this.f87620m, r0Var, null, jVar, t1Var, z3.f.c(1451491557, new ah(str, z15, z16, r0Var, jVar, this.f87609b, this.f87623p, this.f87624q, this.f87625r, this.f87626t, this.f87627v, this.f87628w, this.f87629x, r1Var, sgVar2), mVar2), mVar2, 0, 4096);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
