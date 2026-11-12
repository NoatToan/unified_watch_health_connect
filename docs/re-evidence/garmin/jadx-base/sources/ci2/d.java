package ci2;

import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.appcompat.widget.SwitchCompat;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27690b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f27689a = i14;
        this.f27690b = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i14, KeyEvent keyEvent) {
        int i15 = this.f27689a;
        Object obj = this.f27690b;
        switch (i15) {
            case 0:
                com.garmin.androiddynamicsettings.app.presentationlayer.b bVar = (com.garmin.androiddynamicsettings.app.presentationlayer.b) obj;
                com.garmin.androiddynamicsettings.app.presentationlayer.b.a aVar = com.garmin.androiddynamicsettings.app.presentationlayer.b.f50687j;
                if (bVar.f50697i && i14 == 4) {
                    bVar.f50689a.getClass();
                    androidx.appcompat.app.e eVar = bVar.f50690b;
                    if (eVar == null) {
                        s.m("progressDialog");
                        throw null;
                    }
                    eVar.dismiss();
                    bVar.finish();
                }
                return true;
            case 1:
                com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d dVar = (com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.d) obj;
                dialogInterface.getClass();
                if (i14 == 4) {
                    dialogInterface.dismiss();
                    SwitchCompat switchCompat = dVar.f44165d;
                    if (switchCompat != null) {
                        switchCompat.setChecked(true);
                    }
                }
                return true;
            default:
                com.garmin.realtimesettings.app.presentationlayer.a aVar2 = (com.garmin.realtimesettings.app.presentationlayer.a) obj;
                if (aVar2.f52620n && i14 == 4) {
                    aVar2.f52607a.getClass();
                    androidx.appcompat.app.e eVar2 = aVar2.f52608b;
                    if (eVar2 == null) {
                        s.m("progressDialog");
                        throw null;
                    }
                    eVar2.dismiss();
                    aVar2.finish();
                }
                return true;
        }
    }
}
