package w91;

import lc.m0;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ba1.d f183578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f183579c;

    public /* synthetic */ a(ba1.d dVar, m0 m0Var, int i14) {
        this.f183577a = i14;
        this.f183578b = dVar;
        this.f183579c = m0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        aa1.h value;
        switch (this.f183577a) {
            case 0:
                q91.g gVar = (q91.g) obj;
                gVar.getClass();
                ba1.d dVar = this.f183578b;
                dVar.getClass();
                z1<aa1.h> z1Var = dVar.f16990p;
                do {
                    value = z1Var.getValue();
                } while (!z1Var.b(value, aa1.h.b(value, false, false, false, false, 0.0d, null, null, null, gVar, false, 767)));
                dVar.K4(false);
                lc.y.l(this.f183579c, y.d.INSTANCE);
                break;
            case 1:
                q91.d dVar2 = (q91.d) obj;
                dVar2.getClass();
                ba1.d dVar3 = this.f183578b;
                dVar3.C4(dVar2, new f(dVar3, dVar2, this.f183579c, 3));
                break;
            case 2:
                q91.d dVar4 = (q91.d) obj;
                dVar4.getClass();
                ba1.d dVar5 = this.f183578b;
                dVar5.getClass();
                dVar5.f16984j.b(dVar4, dVar5.f16987m);
                lc.y.l(this.f183579c, y.a.INSTANCE);
                break;
            case 3:
                q91.d dVar6 = (q91.d) obj;
                dVar6.getClass();
                this.f183578b.I4(dVar6);
                m0 m0Var = this.f183579c;
                m0Var.n();
                lc.y.l(m0Var, y.e.INSTANCE);
                break;
            default:
                q91.d dVar7 = (q91.d) obj;
                dVar7.getClass();
                ba1.d dVar8 = this.f183578b;
                m0 m0Var2 = this.f183579c;
                dVar8.C4(dVar7, new f(dVar8, dVar7, m0Var2, 4));
                m0Var2.h(new w40.d(21), y.g.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
