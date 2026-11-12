package fb1;

import android.content.DialogInterface;
import android.content.Intent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70237b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar, int i14) {
        this.f70236a = i14;
        this.f70237b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f70236a;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = this.f70237b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                try {
                    dialogInterface.dismiss();
                    bVar.f40473p++;
                    bVar.y6();
                } catch (Exception unused) {
                    bVar.getClass();
                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.A.info("Returning to caller activity");
                    bVar.requireActivity().setResult(-1, new Intent());
                    bVar.requireActivity().finish();
                }
                break;
            case 1:
                num.intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                bVar.f40473p = 0;
                break;
            default:
                num.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                bVar.f40472o = true;
                bVar.y6();
                break;
        }
        return Unit.INSTANCE;
    }
}
