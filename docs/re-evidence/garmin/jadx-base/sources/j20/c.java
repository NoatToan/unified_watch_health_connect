package j20;

import android.widget.TextView;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.a f96555b;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.contacts.emergency.a aVar, int i14) {
        this.f96554a = i14;
        this.f96555b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        TextView textView;
        int i14 = this.f96554a;
        com.garmin.android.apps.connectmobile.contacts.emergency.a aVar = this.f96555b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a c0534a = com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m;
                int i15 = com.garmin.android.apps.connectmobile.contacts.emergency.a.c.f32614a[g3Var.f35300a.ordinal()];
                if (i15 != 1) {
                    if (i15 == 2) {
                        aVar.w6();
                    } else {
                        if (i15 != 3) {
                            u0.r();
                            return null;
                        }
                        a2 a2Var = a2.SAFETY_FEATURES;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "EmergencyContactConfirmFragment", "Status was ERROR while observing contactLiveData, not Status.SUCCESS");
                        aVar.w6();
                    }
                }
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.contacts.emergency.a.C0534a c0534a2 = com.garmin.android.apps.connectmobile.contacts.emergency.a.f32601m;
                int i16 = com.garmin.android.apps.connectmobile.contacts.emergency.a.c.f32614a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.l(aVar);
                } else if (i16 == 2) {
                    String str = (String) g3Var.f35301b;
                    if (str != null && (textView = aVar.f32608g) != null) {
                        textView.setText(str);
                        aVar.w6();
                    }
                    g22.e.f(aVar);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(aVar);
                    g22.e.c(aVar);
                }
                return Unit.INSTANCE;
        }
    }
}
