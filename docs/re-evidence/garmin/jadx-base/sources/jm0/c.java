package jm0;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import aq2.j;
import com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.ActivitiesEditIntervalsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import com.garmin.android.apps.connectmobile.settings.devices.hrm.HrmGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.index.ManagePeopleActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration.EventTrainingPlanIntegrationActivity;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import com.garmin.feature.garminpay.ui.devicesettings.RapidPassSettingActivity;
import kd0.b0;
import wr2.p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99562a;

    public /* synthetic */ c(int i14) {
        this.f99562a = i14;
    }

    private final void a(DialogInterface dialogInterface, int i14) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f99562a) {
            case 0:
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.dismiss();
                break;
            case 2:
                dialogInterface.dismiss();
                break;
            case 3:
                String str = DeveloperSettingsActivity.f51946n;
                break;
            case 4:
                String str2 = DeveloperSettingsActivity.f51946n;
                j.f12491a.getClass();
                p.f186870a.getClass();
                SharedPreferences sharedPreferencesA = p.a("dynamic_feature_app");
                sharedPreferencesA.getClass();
                sharedPreferencesA.edit().putInt("SHOULD_USE_OAUTH2_TOKEN", i14).apply();
                dialogInterface.dismiss();
                break;
            case 5:
                dialogInterface.dismiss();
                break;
            case 6:
                int i15 = b0.f103987c;
                dialogInterface.dismiss();
                break;
            case 7:
                int i16 = ActivitiesEditIntervalsActivity.f29107m;
                break;
            case 8:
                EventTrainingPlanIntegrationActivity.a aVar = EventTrainingPlanIntegrationActivity.f46267e;
                dialogInterface.dismiss();
                break;
            case 9:
                CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                dialogInterface.dismiss();
                break;
            case 10:
                int i17 = HrmGeneralSettingsActivity.f43025t;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 11:
                li0.f.a aVar3 = li0.f.f112657g;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                break;
            case 12:
                li0.f.a aVar4 = li0.f.f112657g;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                break;
            case 13:
                li0.f.a aVar5 = li0.f.f112657g;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                break;
            case 14:
                dialogInterface.dismiss();
                break;
            case 15:
                dialogInterface.dismiss();
                break;
            case 16:
                dialogInterface.cancel();
                break;
            case 17:
                dialogInterface.cancel();
                break;
            case 18:
                dialogInterface.dismiss();
                break;
            case 19:
                int i18 = RapidPassSettingActivity.a.f52031f;
                break;
            case 20:
                dialogInterface.dismiss();
                break;
            case 21:
                dialogInterface.dismiss();
                break;
            case 22:
                dialogInterface.dismiss();
                break;
            case 23:
                dialogInterface.dismiss();
                break;
            case 24:
                dialogInterface.dismiss();
                break;
            case 25:
                ManagePeopleActivity.a aVar6 = ManagePeopleActivity.f43042n;
                dialogInterface.dismiss();
                break;
            case 26:
                GroupDetailActivity.a aVar7 = GroupDetailActivity.f36137j;
                dialogInterface.dismiss();
                break;
            case 27:
                break;
            case 28:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
