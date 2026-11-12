package ag0;

import android.content.DialogInterface;
import aq.n0;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesActivity;
import com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectActivity;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageMultiPickerActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.MySegmentsActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import com.garmin.android.apps.connectmobile.segments.presentation.i;
import com.garmin.android.apps.connectmobile.settings.thirdparty.Office365ConnectActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3141a;

    private final void a(DialogInterface dialogInterface, int i14) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f3141a) {
            case 0:
                int[] iArr = f.f3142e;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                break;
            case 1:
                int i15 = g.f3148f;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                break;
            case 2:
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 3:
                Office365ConnectActivity.a aVar2 = Office365ConnectActivity.f43946j;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 4:
                break;
            case 5:
                EditExercisesActivity.a aVar3 = EditExercisesActivity.f29765m;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 6:
                EditExercisesActivity.a aVar4 = EditExercisesActivity.f29765m;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 7:
                EditExercisesMultiSelectActivity.a aVar5 = EditExercisesMultiSelectActivity.f29784b;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 8:
                EditExercisesMultiSelectActivity.a aVar6 = EditExercisesMultiSelectActivity.f29784b;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 9:
                int i16 = n0.f12063j;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 10:
                com.garmin.android.apps.connectmobile.startup.d.a aVar7 = com.garmin.android.apps.connectmobile.startup.d.f44815e;
                break;
            case 11:
                int i17 = BLEScanningActivity.A;
                dialogInterface.dismiss();
                break;
            case 12:
                int i18 = BLEScanningActivity.A;
                dialogInterface.dismiss();
                break;
            case 13:
                int i19 = BLEScanningActivity.A;
                dialogInterface.dismiss();
                break;
            case 14:
                int i24 = BLEScanningActivity.A;
                dialogInterface.dismiss();
                break;
            case 15:
                GroupRideShareActivity.a aVar8 = GroupRideShareActivity.f36417i;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                break;
            case 16:
                int i25 = ImageMultiPickerActivity.f36770j;
                dialogInterface.dismiss();
                break;
            case 17:
                dialogInterface.dismiss();
                break;
            case 18:
                dialogInterface.dismiss();
                break;
            case 19:
                dialogInterface.dismiss();
                break;
            case 20:
                MultiSportsDetailsActivity.a aVar9 = MultiSportsDetailsActivity.f48440z;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 21:
                WorkoutDetailsActivity.a aVar10 = WorkoutDetailsActivity.f48482f;
                break;
            case 22:
                WorkoutDetailsActivity.a aVar11 = WorkoutDetailsActivity.f48482f;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                break;
            case 23:
                int i26 = MySegmentsActivity.f41380y;
                dialogInterface.dismiss();
                break;
            case 24:
                int i27 = MySegmentsActivity.f41380y;
                dialogInterface.dismiss();
                break;
            case 25:
                com.garmin.android.apps.connectmobile.segments.presentation.d.a aVar12 = com.garmin.android.apps.connectmobile.segments.presentation.d.f41436b;
                dialogInterface.dismiss();
                break;
            case 26:
                SegmentDetailsActivity.a aVar13 = SegmentDetailsActivity.Z;
                dialogInterface.dismiss();
                break;
            case 27:
                i.a aVar14 = i.f41451c;
                dialogInterface.dismiss();
                break;
            case 28:
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }

    public /* synthetic */ e(int i14) {
        this.f3141a = i14;
    }
}
