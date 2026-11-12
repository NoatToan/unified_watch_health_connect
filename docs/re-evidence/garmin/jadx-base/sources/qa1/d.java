package qa1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class d extends q implements l<Boolean, Unit> {
    public d(Object obj) {
        super(1, obj, com.garmin.android.apps.connectmobile.powercurve.view.a.class, "onActivityExcluded", "onActivityExcluded(Z)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.garmin.android.apps.connectmobile.powercurve.view.a aVar = (com.garmin.android.apps.connectmobile.powercurve.view.a) this.receiver;
        if (zBooleanValue) {
            a aVar2 = aVar.f40344a;
            if (aVar2 != null) {
                aVar2.a();
            }
        } else {
            com.garmin.android.apps.connectmobile.powercurve.view.a.C0757a c0757a = com.garmin.android.apps.connectmobile.powercurve.view.a.f40343c;
            aVar.getClass();
            a2 a2Var = a2.ACTIVITIES;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "PowerCurve", "failed to exclude the activity from power curve");
        }
        aVar.dismiss();
        return Unit.INSTANCE;
    }
}
