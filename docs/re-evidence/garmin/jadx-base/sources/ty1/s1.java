package ty1;

import android.content.DialogInterface;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.y f167233b;

    public /* synthetic */ s1(com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar, int i14) {
        this.f167232a = i14;
        this.f167233b = yVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167232a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = this.f167233b;
        switch (i14) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                dialogInterface.getClass();
                yVar.H6();
                dialogInterface.dismiss();
                break;
            default:
                bg0.a.c cVar = (bg0.a.c) obj;
                bg0.a.b bVar = (bg0.a.b) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
                bVar.getClass();
                if (!yVar.f46358r) {
                    yVar.F6(cVar, bVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
