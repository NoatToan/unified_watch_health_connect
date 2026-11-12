package m30;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116301a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n30.b f116302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f116303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f116304d;

    public /* synthetic */ a(n30.b bVar, e23.l lVar, e23.l lVar2) {
        this.f116302b = bVar;
        this.f116303c = lVar;
        this.f116304d = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f116301a;
        e23.l lVar = this.f116304d;
        e23.l lVar2 = this.f116303c;
        n30.b bVar = this.f116302b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                b.a(bVar, lVar2, lVar, mVar, p0.t(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    b.a(bVar, lVar2, lVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(n30.b bVar, e23.l lVar, e23.l lVar2, int i14) {
        this.f116302b = bVar;
        this.f116303c = lVar;
        this.f116304d = lVar2;
    }
}
