package ad0;

import b.u;
import e23.r;
import lc.m0;
import lc.v;
import lc.w;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.n;
import p3.x1;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2720a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc0.c f2721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f2723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f2724e;

    public /* synthetic */ b(zc0.c cVar, String str, u uVar, m0 m0Var) {
        this.f2721b = cVar;
        this.f2722c = str;
        this.f2724e = uVar;
        this.f2723d = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f2720a;
        p3.m.a aVar = p3.m.f135153a;
        u uVar = this.f2724e;
        m0 m0Var = this.f2723d;
        r1.l lVar = (r1.l) obj;
        v vVar = (v) obj2;
        p3.m mVar = (p3.m) obj3;
        Integer num = (Integer) obj4;
        switch (i14) {
            case 0:
                num.getClass();
                lVar.getClass();
                vVar.getClass();
                x1 x1Var = n.f135158a;
                boolean zR = mVar.r(uVar);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new d.a(uVar);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d.a(uVar);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) ((k23.g) objQ);
                zc0.c cVar = this.f2721b;
                boolean zR2 = mVar.r(cVar) | mVar.r(m0Var);
                Object objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new a42.i(2, cVar, m0Var);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a42.i(2, cVar, m0Var);
                        mVar.K(objQ2);
                    }
                }
                m.a(cVar, this.f2722c, aVar2, (e23.l) objQ2, mVar, 0);
                break;
            default:
                q2.t(num, lVar, vVar);
                x1 x1Var2 = n.f135158a;
                int i15 = ((a.b) w.a(vVar, s0.f105811a.b(a.b.class))).f2717b;
                boolean zR3 = mVar.r(m0Var) | mVar.r(uVar);
                Object objQ3 = mVar.q();
                if (zR3) {
                    objQ3 = new c(m0Var, uVar, 0);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new c(m0Var, uVar, 0);
                        mVar.K(objQ3);
                    }
                }
                k.b(i15, this.f2721b, this.f2722c, (e23.a) objQ3, mVar, 0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(zc0.c cVar, String str, m0 m0Var, u uVar) {
        this.f2721b = cVar;
        this.f2722c = str;
        this.f2723d = m0Var;
        this.f2724e = uVar;
    }
}
