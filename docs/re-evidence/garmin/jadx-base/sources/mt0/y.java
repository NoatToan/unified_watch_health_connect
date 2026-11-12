package mt0;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity;
import com.garmin.android.apps.connectmobile.lteconnect.LteConnectionActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity;
import com.garmin.android.apps.connectmobile.shareableevents.ShareableEventActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120928a;

    public /* synthetic */ y(int i14) {
        this.f120928a = i14;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f120928a) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 1:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                dialogInterface.dismiss();
                break;
            case 2:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                dialogInterface.dismiss();
                break;
            case 3:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 4:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.a.C0679a c0679a = com.garmin.android.apps.connectmobile.liveeventsharing.ui.a.f38531q;
                dialogInterface.dismiss();
                break;
            case 5:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
                dialogInterface.dismiss();
                break;
            case 6:
                dialogInterface.dismiss();
                break;
            case 7:
                ActivityTrackingPulseOXSetting.a aVar2 = ActivityTrackingPulseOXSetting.f41786l;
                break;
            case 8:
                int i15 = DeviceUserSettingsActivity.f42010c1;
                break;
            case 9:
                int i16 = ng1.l1.f125962i;
                break;
            case 10:
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar3 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                dialogInterface.dismiss();
                break;
            case 11:
                WorkoutStepEditActivity.a aVar4 = WorkoutStepEditActivity.f49573h;
                break;
            case 12:
                int i17 = ShareableEventActivity.f44216b;
                break;
            case 13:
                ov1.j.a aVar5 = ov1.j.f134173d;
                dialogInterface.dismiss();
                break;
            case 14:
                pk1.u.a aVar6 = pk1.u.E;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 15:
                pk1.u.a aVar7 = pk1.u.E;
                dialogInterface.dismiss();
                break;
            case 16:
                pk1.u.a aVar8 = pk1.u.E;
                dialogInterface.dismiss();
                break;
            case 17:
                dialogInterface.dismiss();
                break;
            case 18:
                PostUserAuthenticationActivity.a aVar9 = PostUserAuthenticationActivity.f30291i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                GarminConnectMobileApp.f28685g.getClass();
                GarminConnectMobileApp.a.b().d();
                break;
            case 19:
                PostUserAuthenticationActivity.a aVar10 = PostUserAuthenticationActivity.f30291i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                GarminConnectMobileApp.f28685g.getClass();
                GarminConnectMobileApp.a.b().d();
                break;
            case 20:
                PostUserAuthenticationActivity.a aVar11 = PostUserAuthenticationActivity.f30291i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 21:
                PostUserAuthenticationActivity.a aVar12 = PostUserAuthenticationActivity.f30291i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 22:
                PostUserAuthenticationActivity.a aVar13 = PostUserAuthenticationActivity.f30291i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                GarminConnectMobileApp.f28685g.getClass();
                GarminConnectMobileApp.a.b().d();
                break;
            case 23:
                LteConnectionActivity.a aVar14 = LteConnectionActivity.f38695j;
                dialogInterface.dismiss();
                break;
            case 24:
                com.garmin.android.apps.connectmobile.powercurve.view.a.C0757a c0757a = com.garmin.android.apps.connectmobile.powercurve.view.a.f40343c;
                dialogInterface.dismiss();
                break;
            case 25:
                PregnancySetupActivity.a aVar15 = PregnancySetupActivity.f40934g;
                dialogInterface.dismiss();
                break;
            case 26:
                PregnancySetupActivity.a aVar16 = PregnancySetupActivity.f40934g;
                dialogInterface.dismiss();
                break;
            case 27:
                PregnancySetupActivity.a aVar17 = PregnancySetupActivity.f40934g;
                dialogInterface.dismiss();
                break;
            case 28:
                dialogInterface.dismiss();
                break;
            default:
                String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
                dialogInterface.dismiss();
                break;
        }
    }
}
