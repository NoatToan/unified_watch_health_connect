package bv1;

import c2.x2;
import cw1.r0;
import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f21385c;

    public /* synthetic */ c(int i14, int i15, String str, List list) {
        this.f21383a = i15;
        this.f21384b = str;
        this.f21385c = list;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21383a;
        List list = this.f21385c;
        String str = this.f21384b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = d.f21399b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-701215888, new c(i15, str, list), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = d.f21399b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    cv1.m.b(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), str, z3.f.c(1865398799, new a31.b(list, 5), mVar2), mVar2, 384);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                r0.a(str, list, (p3.m) obj, p0.t(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                rv1.b.c(str, list, (p3.m) obj, p0.t(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                rv1.b.c(str, list, (p3.m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                w52.y.h(str, list, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(int i14, String str, List list) {
        this.f21383a = i14;
        this.f21384b = str;
        this.f21385c = list;
    }
}
