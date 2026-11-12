package jk1;

import e23.p;
import hk1.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99378a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f99379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f99380c;

    public /* synthetic */ c(r rVar, String str) {
        this.f99380c = rVar;
        this.f99379b = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f99378a;
        r rVar = this.f99380c;
        String str = this.f99379b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (rVar == null) {
                        mVar.C(164888558);
                        mVar.f();
                    } else {
                        mVar.C(164888559);
                        ik1.b.c(g22.n.d(str), rVar, mVar, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                d.a(str, rVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(String str, r rVar, int i14) {
        this.f99379b = str;
        this.f99380c = rVar;
    }
}
