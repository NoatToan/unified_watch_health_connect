package f20;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodActivity;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.developer.glogger.GloggerAdminActivity;
import com.garmin.android.apps.connectmobile.devices.dashboard.version2.RegisteredUnPairedDeviceActivity;
import com.garmin.android.apps.connectmobile.settings.CopyrightActivity;
import com.garmin.android.apps.connectmobile.settings.GCMActivityAppDiagnostics;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.ImageMultiPickerActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportCreateEditActivity;
import ig1.u0;
import ig1.z0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68394a;

    public /* synthetic */ i(int i14) {
        this.f68394a = i14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f68394a) {
            case 0:
                ContactActivity.a aVar = ContactActivity.T;
                break;
            case 1:
                int i15 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.a.f48898h;
                break;
            case 2:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 3:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                if (dialogInterface != null) {
                    dialogInterface.cancel();
                }
                break;
            case 4:
                dialogInterface.dismiss();
                break;
            case 5:
                dialogInterface.dismiss();
                break;
            case 6:
                dialogInterface.dismiss();
                break;
            case 7:
                UserProfileActivity.a aVar4 = UserProfileActivity.f46494x;
                dialogInterface.dismiss();
                break;
            case 8:
                com.garmin.android.apps.connectmobile.contacts.details.c.a aVar5 = com.garmin.android.apps.connectmobile.contacts.details.c.f32482m;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 9:
                int i16 = CoursesActivity.f33039i;
                dialogInterface.cancel();
                break;
            case 10:
                int i17 = CoursesActivity.f33039i;
                dialogInterface.cancel();
                break;
            case 11:
                MultiSportCreateEditActivity.a aVar6 = MultiSportCreateEditActivity.f49083f;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 12:
                MultiSportCreateEditActivity.a aVar7 = MultiSportCreateEditActivity.f49083f;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 13:
                MultiSportCreateEditActivity.a aVar8 = MultiSportCreateEditActivity.f49083f;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 14:
                int i18 = CopyrightActivity.f41511a;
                dialogInterface.dismiss();
                break;
            case 15:
                GCMActivityAppDiagnostics.shareReportPreCheck$lambda$1(dialogInterface, i14);
                break;
            case 16:
                dialogInterface.cancel();
                break;
            case 17:
                int i19 = RegisteredUnPairedDeviceActivity.f33842j;
                dialogInterface.cancel();
                break;
            case 18:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.C0689a c0689a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.f38856n;
                dialogInterface.dismiss();
                break;
            case 19:
                dialogInterface.dismiss();
                break;
            case 20:
                ImageMultiPickerActivity.a aVar9 = ImageMultiPickerActivity.f46078j;
                dialogInterface.dismiss();
                break;
            case 21:
                EditContactMethodActivity.a aVar10 = EditContactMethodActivity.f32519d;
                dialogInterface.dismiss();
                break;
            case 22:
                int i24 = GloggerAdminActivity.f33666d;
                dialogInterface.dismiss();
                break;
            case 23:
                int i25 = GloggerAdminActivity.f33666d;
                dialogInterface.dismiss();
                break;
            case 24:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 25:
                int i26 = u0.f93414j;
                break;
            case 26:
                int i27 = z0.f93431j;
                break;
            case 27:
                EmergencyContactSendRequestActivity.a aVar11 = EmergencyContactSendRequestActivity.f32570v;
                dialogInterface.dismiss();
                break;
            case 28:
                EmergencyContactSendRequestActivity.a aVar12 = EmergencyContactSendRequestActivity.f32570v;
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
