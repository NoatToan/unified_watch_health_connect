package w31;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f181856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z31.b f181857c;

    public /* synthetic */ f(h hVar, z31.b bVar, int i14) {
        this.f181855a = i14;
        this.f181856b = hVar;
        this.f181857c = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f181855a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(279315916, new f(this.f181856b, this.f181857c, i14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    this.f181856b.f(this.f181857c, null, null, mVar2, 8, 6);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
