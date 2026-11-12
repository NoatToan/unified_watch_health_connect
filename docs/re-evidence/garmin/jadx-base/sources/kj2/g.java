package kj2;

import e23.p;
import i3.mh;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o13.p f104999b;

    public /* synthetic */ g(int i14, o13.p pVar) {
        this.f104998a = 2;
        this.f104999b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f104998a;
        o13.p pVar = this.f104999b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    mh.c((String) pVar.f128595b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar, 0, 0, 262142);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    String str = (String) pVar.f128595b;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, mVar2), mVar2, 0, 0, 131070);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                rv1.i.g(pVar, (m) obj, p0.t(1));
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    String str2 = (String) pVar.f128594a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, mVar3), mVar3, 0, 0, 131070);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(o13.p pVar, int i14, byte b14) {
        this.f104998a = i14;
        this.f104999b = pVar;
    }
}
