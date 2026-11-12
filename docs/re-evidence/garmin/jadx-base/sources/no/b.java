package no;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import qs.g;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.eventType.b f126709b;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.activities.manual.eventType.b bVar, int i14) {
        this.f126708a = i14;
        this.f126709b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f126708a;
        com.garmin.android.apps.connectmobile.activities.manual.eventType.b bVar = this.f126709b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-1566043740, new b(bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar2 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    g.f147071e.getClass();
                    bVar.u6(i53.a.a(g.RACE, g.RECREATION, g.SPECIAL_EVENT, g.TRAINING, g.TRANSPORTATION, g.TOURING, g.GEOCAHING, g.FITNESS, g.UNCATEGORIZED), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
