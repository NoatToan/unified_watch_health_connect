package fb1;

import android.content.DialogInterface;
import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h f70215b;

    public /* synthetic */ c0(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h hVar, int i14) {
        this.f70214a = i14;
        this.f70215b = hVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f70214a;
        int i15 = 1;
        int i16 = 0;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h hVar = this.f70215b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                hVar.w6();
                return Unit.INSTANCE;
            case 1:
                num.intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                try {
                    dialogInterface.dismiss();
                    hVar.f40649q++;
                    hVar.u6();
                    break;
                } catch (Exception unused) {
                    hVar.H6();
                }
                return Unit.INSTANCE;
            case 2:
                num.intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                hVar.f40649q = 0;
                return Unit.INSTANCE;
            case 3:
                num.intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                try {
                    dialogInterface.dismiss();
                    hVar.f40650r++;
                    hVar.I6();
                    break;
                } catch (Exception unused2) {
                    hVar.H6();
                }
                return Unit.INSTANCE;
            case 4:
                num.intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                hVar.f40650r = 0;
                return Unit.INSTANCE;
            case 5:
                num.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                try {
                    dialogInterface.dismiss();
                    hVar.f40651t++;
                    hVar.w6();
                    break;
                } catch (Exception unused3) {
                    hVar.H6();
                }
                return Unit.INSTANCE;
            case 6:
                num.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar7 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                hVar.f40651t = 0;
                return Unit.INSTANCE;
            case 7:
                num.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar8 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                r rVar = (r) hVar.f40647o.getValue();
                db1.r rVar2 = hVar.f40643k;
                if (rVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mUserGlucoseDTO");
                    throw null;
                }
                ge1.b.T(v1.a(rVar), null, null, new q(rVar2, rVar, null), 3);
                dh.b.L(rVar.f70295b, hVar, new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.c(new b0(hVar, i15)));
                return Unit.INSTANCE;
            default:
                num.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar9 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                g22.e.l(hVar);
                r rVar3 = (r) hVar.f40647o.getValue();
                db1.t tVar = hVar.f40645m;
                if (tVar == null) {
                    p005kotlin.jvm.internal.s.m("mUserGlucoseInputDTO");
                    throw null;
                }
                ge1.b.T(v1.a(rVar3), null, null, new o(tVar, rVar3, null), 3);
                dh.b.L(rVar3.f70294a, hVar, new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.c(new b0(hVar, i16)));
                return Unit.INSTANCE;
        }
    }
}
