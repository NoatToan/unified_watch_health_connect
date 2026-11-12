package oo0;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133120a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ co0.f f133121b;

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f133120a;
        co0.f fVar = this.f133121b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    h.c(fVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                h.c(fVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
