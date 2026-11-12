package zo;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.bikesensors.orca.OrcaGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.moveiq.MoveIQEventDetailsActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206033a;

    public /* synthetic */ g(int i14) {
        this.f206033a = i14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f206033a) {
            case 0:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                break;
            case 1:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.a aVar2 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.j.f29365e;
                break;
            case 2:
                int i15 = zo0.b.f206089d;
                dialogInterface.dismiss();
                break;
            case 3:
                int i16 = OrcaGeneralSettingsActivity.f30882v;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 4:
                MoveIQEventDetailsActivity.a aVar3 = MoveIQEventDetailsActivity.f39211k;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            default:
                int i17 = zz0.j.f207619l;
                dialogInterface.dismiss();
                break;
        }
    }
}
