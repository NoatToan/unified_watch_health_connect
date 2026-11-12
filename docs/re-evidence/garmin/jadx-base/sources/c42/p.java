package c42;

import com.garmin.android.apps.connectmobile.R;
import l72.h3;
import o4.t1;
import o4.u1;
import o4.v1;
import p005kotlin.Unit;
import p13.j0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.y f24426b;

    public /* synthetic */ p(lc.y yVar, int i14) {
        this.f24425a = i14;
        this.f24426b = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00df  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f24425a;
        lc.y yVar = this.f24426b;
        switch (i14) {
            case 0:
                yVar.h(new a81.j(true, 9), new n.a(((Long) obj).longValue(), (String) obj2));
                break;
            case 1:
                yVar.h(new a81.j(false, 9), new n.a(((Long) obj).longValue(), (String) obj2));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    b3.b.a aVar = b3.b.a.f15503a;
                    u4.d dVarC = d3.b.f57305a;
                    if (dVarC == null) {
                        g6.f.a aVar2 = g6.f.f75994b;
                        u4.d.a aVar3 = new u4.d.a("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                        j0 j0Var = u4.m.f168519a;
                        o4.d0.f128823b.getClass();
                        t1 t1Var = new t1(o4.d0.f128824c, null);
                        u1.f129010b.getClass();
                        v1.f129019b.getClass();
                        int i15 = v1.f129021d;
                        u4.e eVar = new u4.e();
                        eVar.k(20.0f, 11.0f);
                        eVar.g(7.83f);
                        eVar.j(5.59f, -5.59f);
                        eVar.i(12.0f, 4.0f);
                        eVar.j(-8.0f, 8.0f);
                        eVar.j(8.0f, 8.0f);
                        eVar.j(1.41f, -1.41f);
                        eVar.i(7.83f, 13.0f);
                        eVar.g(20.0f);
                        eVar.p(-2.0f);
                        eVar.c();
                        u4.d.a.b(aVar3, eVar.f168407a, 0, t1Var, 1.0f, null, 1.0f, i15, 1.0f);
                        dVarC = aVar3.c();
                        d3.b.f57305a = dVarC;
                    }
                    u4.d dVar = dVarC;
                    String strQ = gl1.y.Q(mVar, R.string.billing_address);
                    boolean zR = mVar.r(yVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new gk1.b(yVar, 7);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new gk1.b(yVar, 7);
                            mVar.K(objQ);
                        }
                    }
                    h3.e(dVar, strQ, null, null, (e23.a) objQ, null, null, mVar, 384, 104);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
