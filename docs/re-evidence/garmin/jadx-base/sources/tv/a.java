package tv;

import com.garmin.android.apps.connectmobile.bikesensors.CalibrationSettingsActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalibrationSettingsActivity f166496b;

    public /* synthetic */ a(CalibrationSettingsActivity calibrationSettingsActivity, int i14) {
        this.f166495a = i14;
        this.f166496b = calibrationSettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f166495a;
        CalibrationSettingsActivity calibrationSettingsActivity = this.f166496b;
        switch (i14) {
            case 0:
                CalibrationSettingsActivity.a aVar = CalibrationSettingsActivity.f30766m;
                calibrationSettingsActivity.ca();
                break;
            case 1:
                CalibrationSettingsActivity.a aVar2 = CalibrationSettingsActivity.f30766m;
                calibrationSettingsActivity.ca();
                break;
            case 2:
                CalibrationSettingsActivity.a aVar3 = CalibrationSettingsActivity.f30766m;
                calibrationSettingsActivity.ca();
                break;
            case 3:
                CalibrationSettingsActivity.a aVar4 = CalibrationSettingsActivity.f30766m;
                calibrationSettingsActivity.ca();
                break;
            default:
                int i15 = c.f166498b;
                CalibrationSettingsActivity.a aVar5 = CalibrationSettingsActivity.f30766m;
                calibrationSettingsActivity.ca();
                break;
        }
    }
}
