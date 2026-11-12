package fb1;

import java.util.LinkedList;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedList f70209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f f70210c;

    public /* synthetic */ a0(LinkedList linkedList, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f fVar, int i14) {
        this.f70208a = i14;
        this.f70209b = linkedList;
        this.f70210c = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f70208a;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f fVar = this.f70210c;
        LinkedList linkedList = this.f70209b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.f40604w;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1323006319, new a0(linkedList, fVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.b bVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.f40604w;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    g6.f.a aVar = g6.f.f75994b;
                    x0Var.e(c2.l.y(h4.r.S, 16), z3.f.c(1607589738, new e11.c0(13, linkedList, fVar), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
