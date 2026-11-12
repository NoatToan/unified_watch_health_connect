package c32;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.x;
import com.garmin.android.apps.connectmobile.training.atp.create.edit.ATPEditActivity;
import ew1.b3;
import sz0.l;
import z10.d1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f24102b;

    public /* synthetic */ a(e23.a aVar, int i14) {
        this.f24101a = i14;
        this.f24102b = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f24101a;
        e23.a aVar = this.f24102b;
        switch (i15) {
            case 0:
                dialogInterface.dismiss();
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                b3.a aVar2 = b3.f66335d;
                dialogInterface.dismiss();
                aVar.invoke();
                break;
            case 2:
                ey2.c cVar = ey2.c.f67454a;
                dialogInterface.dismiss();
                aVar.invoke();
                break;
            case 3:
                ey2.c cVar2 = ey2.c.f67454a;
                dialogInterface.dismiss();
                aVar.invoke();
                break;
            case 4:
                EditContactMethodActivity.a aVar3 = EditContactMethodActivity.f32519d;
                dialogInterface.getClass();
                aVar.invoke();
                break;
            case 5:
                aVar.invoke();
                break;
            case 6:
                x xVar = x.f37955a;
                aVar.invoke();
                break;
            case 7:
                int i16 = l.f161444a;
                aVar.invoke();
                dialogInterface.dismiss();
                break;
            case 8:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.x.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.x.f46310w;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 9:
                aVar.invoke();
                break;
            case 10:
                aVar.invoke();
                break;
            case 11:
                aVar.invoke();
                break;
            case 12:
                int i17 = yn2.b.G0;
                aVar.invoke();
                break;
            case 13:
                aVar.invoke();
                dialogInterface.dismiss();
                break;
            case 14:
                aVar.invoke();
                dialogInterface.dismiss();
                break;
            case 15:
                d1 d1Var = d1.f200951a;
                dialogInterface.getClass();
                aVar.invoke();
                dialogInterface.dismiss();
                break;
            case 16:
                d1 d1Var2 = d1.f200951a;
                dialogInterface.getClass();
                aVar.invoke();
                dialogInterface.dismiss();
                break;
            case 17:
                d1 d1Var3 = d1.f200951a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                aVar.invoke();
                break;
            case 18:
                dialogInterface.dismiss();
                aVar.invoke();
                break;
            default:
                ATPEditActivity.a aVar5 = ATPEditActivity.f45202g;
                dialogInterface.dismiss();
                aVar.invoke();
                break;
        }
    }
}
