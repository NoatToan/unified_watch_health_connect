package g02;

import c2.x2;
import java.util.List;
import kotlin.m3;
import l72.z2;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74501a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f74502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f74503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f74504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f74505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f74506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f74507g;

    public /* synthetic */ o0(h4.r rVar, nr.p0 p0Var, float f14, ds.n nVar, e23.a aVar, e23.a aVar2, int i14) {
        this.f74504d = rVar;
        this.f74505e = p0Var;
        this.f74502b = f14;
        this.f74506f = nVar;
        this.f74503c = aVar;
        this.f74507g = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f74501a;
        Object obj3 = this.f74507g;
        Object obj4 = this.f74503c;
        Object obj5 = this.f74506f;
        Object obj6 = this.f74505e;
        Object obj7 = this.f74504d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                r0.a((String) obj7, (String) obj6, this.f74502b, (e23.p) obj5, (e23.p) obj3, (e23.a) obj4, (p3.m) obj, p3.p0.t(1572865));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gs.p.a((h4.r) obj7, (nr.p0) obj6, this.f74502b, (ds.n) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            case 2:
                u2.h hVar = (u2.h) obj7;
                a2.j jVar = (a2.j) obj6;
                m4.q qVar = (m4.q) obj5;
                m3 m3Var = (m3) obj3;
                x3 x3Var = (x3) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    u2.g.b bVar = u2.g.b.f167845a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    p006l2.r.b(hVar, rVarF, false, s5.x0.a(j92.f.f97931h, zl.a.a(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), null, bVar, jVar, new o4.t1(zl.a.a(mVar), null), new p003ji0.n.Function0(this.f74502b, hVar, true, qVar, m3Var, x3Var), null, mVar, 100663344, 21212);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                z2.a((List) obj7, (h4.r) obj6, (g6.f) obj5, this.f74502b, (e23.a) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(385));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o0(String str, String str2, float f14, e23.p pVar, e23.p pVar2, e23.a aVar, int i14) {
        this.f74504d = str;
        this.f74505e = str2;
        this.f74502b = f14;
        this.f74506f = pVar;
        this.f74507g = pVar2;
        this.f74503c = aVar;
    }

    public /* synthetic */ o0(List list, h4.r rVar, g6.f fVar, float f14, e23.a aVar, e23.l lVar, int i14) {
        this.f74504d = list;
        this.f74505e = rVar;
        this.f74506f = fVar;
        this.f74502b = f14;
        this.f74503c = aVar;
        this.f74507g = lVar;
    }

    public /* synthetic */ o0(u2.h hVar, a2.j jVar, float f14, m4.q qVar, m3 m3Var, p3.p1 p1Var) {
        this.f74504d = hVar;
        this.f74505e = jVar;
        this.f74502b = f14;
        this.f74506f = qVar;
        this.f74507g = m3Var;
        this.f74503c = p1Var;
    }
}
