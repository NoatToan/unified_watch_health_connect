package xk1;

import android.content.DialogInterface;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d f191294b;

    public /* synthetic */ w(com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d dVar, int i14) {
        this.f191293a = i14;
        this.f191294b = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f191293a) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d dVar = this.f191294b;
                vk1.f fVar = dVar.f44162a;
                if (fVar != null) {
                    fVar.f178622l = false;
                }
                dVar.C6();
                break;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                SwitchCompat switchCompat = this.f191294b.f44165d;
                if (switchCompat != null) {
                    switchCompat.setChecked(true);
                }
                break;
            default:
                dialogInterface.getClass();
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d dVar2 = this.f191294b;
                vk1.f fVar2 = dVar2.f44162a;
                fVar2.getClass();
                vk1.c.i(fVar2);
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d.v6(dVar2);
                dVar2.f44164c = true;
                dVar2.E6();
                dialogInterface.dismiss();
                break;
        }
    }
}
