package zo;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i f206066b;

    public /* synthetic */ p(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i iVar, int i14) {
        this.f206065a = i14;
        this.f206066b = iVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f206065a;
        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i iVar = this.f206066b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.i.f29362q;
                i2.a aVar2 = i2.f36769a;
                aVar2.getClass();
                i2.a.a(a2.ACTIVITIES, "Selected duration: " + iIntValue);
                iVar.K6(iIntValue);
                return Unit.INSTANCE;
            default:
                oi0.h hVar = iVar.f29363o;
                if (hVar != null) {
                    return hVar.d(iIntValue, true);
                }
                p005kotlin.jvm.internal.s.m("gcmContentDescriptionTimeFormatter");
                throw null;
        }
    }
}
