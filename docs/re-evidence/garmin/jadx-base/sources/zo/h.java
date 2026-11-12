package zo;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.d f206035b;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.d dVar, int i14) {
        this.f206034a = i14;
        this.f206035b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f206034a;
        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.d dVar = this.f206035b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.d.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.d.f29333t;
                i2.a aVar2 = i2.f36769a;
                aVar2.getClass();
                i2.a.a(a2.ACTIVITIES, "Selected duration: " + iIntValue);
                dVar.K6(iIntValue);
                return Unit.INSTANCE;
            default:
                oi0.h hVar = dVar.f29334q;
                if (hVar != null) {
                    return hVar.d(iIntValue, true);
                }
                p005kotlin.jvm.internal.s.m("gcmContentDescriptionTimeFormatter");
                throw null;
        }
    }
}
