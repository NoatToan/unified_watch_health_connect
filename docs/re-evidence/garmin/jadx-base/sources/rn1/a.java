package rn1;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm1.b f153643b;

    public /* synthetic */ a(mm1.b bVar, int i14) {
        this.f153642a = i14;
        this.f153643b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f153642a;
        mm1.b bVar = this.f153643b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    f.a(bVar != null ? bVar.getOverallStats() : null, mVar, mm1.a.f119613m);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    f.a(bVar != null ? bVar.getOverallStats() : null, mVar, mm1.a.f119613m);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
