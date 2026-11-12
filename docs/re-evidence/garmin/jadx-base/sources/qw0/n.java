package qw0;

import java.util.ArrayList;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f148327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f148328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po.j f148329d;

    public /* synthetic */ n(ArrayList arrayList, com.garmin.android.library.mapsdkadapter.i.d dVar, po.j jVar, int i14) {
        this.f148326a = i14;
        this.f148327b = arrayList;
        this.f148328c = dVar;
        this.f148329d = jVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f148326a;
        po.j jVar = this.f148329d;
        com.garmin.android.library.mapsdkadapter.i.d dVar = this.f148328c;
        ArrayList arrayList = this.f148327b;
        int i15 = 1;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1050811838, new n(arrayList, dVar, jVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a(arrayList, dVar, jVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
