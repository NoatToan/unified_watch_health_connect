package af1;

import e23.q;
import java.util.List;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bf1.a f3092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u82.f f3093c;

    public /* synthetic */ i(bf1.a aVar, u82.f fVar, int i14) {
        this.f3091a = i14;
        this.f3092b = aVar;
        this.f3093c = fVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f3091a;
        ve1.b bVar = null;
        kVar = null;
        qe1.k kVar = null;
        bVar = null;
        u82.f fVar = this.f3093c;
        bf1.a aVar = this.f3092b;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i14) {
            case 0:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(f14) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    if (f14 != null) {
                        int iFloatValue = (int) f14.floatValue();
                        List list = (List) fVar.a();
                        if (list != null) {
                            bVar = (ve1.b) list.get(iFloatValue);
                        }
                    }
                    if (bVar != null) {
                        mVar.C(-1255781215);
                        xe1.j.a(bVar, aVar, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-1255695686);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(f14) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (f14 != null) {
                        int iFloatValue2 = (int) f14.floatValue();
                        List list2 = (List) fVar.a();
                        if (list2 != null) {
                            kVar = (qe1.k) list2.get(iFloatValue2);
                        }
                    }
                    if (kVar != null) {
                        mVar.C(-842556769);
                        xe1.j.c(kVar, aVar, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-842469318);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
