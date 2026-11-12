package en0;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandsCalibrationActivity f64707b;

    public /* synthetic */ k(HandsCalibrationActivity handsCalibrationActivity, int i14) {
        this.f64706a = i14;
        this.f64707b = handsCalibrationActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f64706a;
        HandsCalibrationActivity handsCalibrationActivity = this.f64707b;
        switch (i15) {
            case 0:
                HandsCalibrationActivity.a aVar = HandsCalibrationActivity.f36565z;
                j22.b.f96736a.getClass();
                j22.b.r(handsCalibrationActivity);
                break;
            case 1:
                HandsCalibrationActivity.a aVar2 = HandsCalibrationActivity.f36565z;
                handsCalibrationActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 232);
                break;
            case 2:
                HandsCalibrationActivity.a aVar3 = HandsCalibrationActivity.f36565z;
                if (handsCalibrationActivity.checkSelfPermission("android.permission.CAMERA") == 0) {
                    handsCalibrationActivity.fa();
                } else {
                    handsCalibrationActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 232);
                }
                break;
            case 3:
                HandsCalibrationActivity.a aVar4 = HandsCalibrationActivity.f36565z;
                handsCalibrationActivity.ca();
                break;
            case 4:
                HandsCalibrationActivity.a aVar5 = HandsCalibrationActivity.f36565z;
                handsCalibrationActivity.ca();
                break;
            case 5:
                HandsCalibrationActivity.a aVar6 = HandsCalibrationActivity.f36565z;
                handsCalibrationActivity.finish();
                break;
            case 6:
                HandsCalibrationActivity.a aVar7 = HandsCalibrationActivity.f36565z;
                handsCalibrationActivity.ca();
                break;
            default:
                HandsCalibrationActivity.a aVar8 = HandsCalibrationActivity.f36565z;
                handsCalibrationActivity.finish();
                break;
        }
    }
}
