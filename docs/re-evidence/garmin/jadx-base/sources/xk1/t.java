package xk1;

import android.content.DialogInterface;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b f191289b;

    public /* synthetic */ t(com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar, int i14) {
        this.f191288a = i14;
        this.f191289b = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f191288a) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar = this.f191289b;
                vk1.f fVar = bVar.f44098a;
                if (fVar != null) {
                    fVar.f178622l = false;
                }
                bVar.z6();
                break;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                SwitchCompat switchCompat = this.f191289b.f44102e;
                if (switchCompat != null) {
                    switchCompat.setChecked(true);
                }
                break;
            case 2:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar2 = this.f191289b;
                vk1.f fVar2 = bVar2.f44098a;
                if (fVar2 != null) {
                    fVar2.f178622l = false;
                }
                bVar2.z6();
                break;
            case 3:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                SwitchCompat switchCompat2 = this.f191289b.f44102e;
                if (switchCompat2 != null) {
                    switchCompat2.setChecked(true);
                }
                break;
            default:
                dialogInterface.getClass();
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.b bVar3 = this.f191289b;
                vk1.f fVar3 = bVar3.f44098a;
                fVar3.getClass();
                vk1.c.i(fVar3);
                bVar3.w6();
                bVar3.f44101d = true;
                bVar3.C6();
                dialogInterface.dismiss();
                break;
        }
    }
}
