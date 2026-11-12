package ha1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.MultipleAlarmsSettingsActivity;
import e23.l;
import p005kotlin.Unit;
import ya1.i;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f82674c;

    public /* synthetic */ c(Object obj, int i14, int i15) {
        this.f82672a = i15;
        this.f82674c = obj;
        this.f82673b = i14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f82672a;
        int i16 = this.f82673b;
        Object obj = this.f82674c;
        switch (i15) {
            case 0:
                int i17 = d.f82675i;
                ((l) obj).invoke(Integer.valueOf(i16));
                break;
            case 1:
                AlarmsSettingsActivity alarmsSettingsActivity = (AlarmsSettingsActivity) obj;
                com.garmin.android.apps.connectmobile.settings.devices.d dVar = alarmsSettingsActivity.f41860f;
                dVar.getClass();
                dVar.a(i16);
                DeviceSettingsDTO deviceSettingsDTO = alarmsSettingsActivity.f41858d;
                deviceSettingsDTO.getClass();
                alarmsSettingsActivity.ea(deviceSettingsDTO);
                DeviceSettingsDTO deviceSettingsDTO2 = alarmsSettingsActivity.f41858d;
                deviceSettingsDTO2.getClass();
                alarmsSettingsActivity.fa(deviceSettingsDTO2);
                break;
            case 2:
                MultipleAlarmsSettingsActivity multipleAlarmsSettingsActivity = (MultipleAlarmsSettingsActivity) obj;
                com.garmin.android.apps.connectmobile.settings.devices.d dVar2 = multipleAlarmsSettingsActivity.f42155c;
                dVar2.getClass();
                dVar2.a(i16);
                DeviceSettingsDTO deviceSettingsDTO3 = multipleAlarmsSettingsActivity.f42154b;
                deviceSettingsDTO3.getClass();
                multipleAlarmsSettingsActivity.da(deviceSettingsDTO3);
                DeviceSettingsDTO deviceSettingsDTO4 = multipleAlarmsSettingsActivity.f42154b;
                deviceSettingsDTO4.getClass();
                multipleAlarmsSettingsActivity.ea(deviceSettingsDTO4);
                break;
            case 3:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b) obj).z6(Integer.valueOf(i16));
                break;
            default:
                l<Integer, Unit> lVar = ((i) obj).f195563a;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(i16));
                }
                break;
        }
    }
}
