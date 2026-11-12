package en0;

import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandsCalibrationActivity f64705b;

    public /* synthetic */ j(HandsCalibrationActivity handsCalibrationActivity, int i14) {
        this.f64704a = i14;
        this.f64705b = handsCalibrationActivity;
    }

    @Override // u03.a
    public final void run() {
        switch (this.f64704a) {
            case 0:
                this.f64705b.f36570e = true;
                break;
            case 1:
                HandsCalibrationActivity handsCalibrationActivity = this.f64705b;
                handsCalibrationActivity.f36570e = true;
                handsCalibrationActivity.finish();
                break;
            default:
                HandsCalibrationActivity handsCalibrationActivity2 = this.f64705b;
                handsCalibrationActivity2.f36570e = true;
                handsCalibrationActivity2.finish();
                break;
        }
    }
}
