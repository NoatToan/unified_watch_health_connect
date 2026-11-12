package tv;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bikesensors.CalibrationSettingsActivity;
import com.garmin.android.apps.connectmobile.i2;
import java.util.TimerTask;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltv/c;", "Ljava/util/TimerTask;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f166498b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalibrationSettingsActivity f166499a;

    public c(CalibrationSettingsActivity calibrationSettingsActivity) {
        this.f166499a = calibrationSettingsActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CalibrationSettingsActivity", "Timeout: 25 seconds passed!");
        CalibrationSettingsActivity calibrationSettingsActivity = this.f166499a;
        calibrationSettingsActivity.runOnUiThread(new a(calibrationSettingsActivity, 4));
    }
}
