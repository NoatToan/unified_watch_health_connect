package tv;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bikesensors.CalibrationSettingsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.google.common.util.concurrent.FutureCallback;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltv/b;", "Lcom/google/common/util/concurrent/FutureCallback;", "Ljava/lang/Void;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements FutureCallback<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalibrationSettingsActivity f166497a;

    public b(CalibrationSettingsActivity calibrationSettingsActivity) {
        this.f166497a = calibrationSettingsActivity;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th3) {
        th3.getClass();
        String strN = fb1.c.n("Characteristic notification failed to be enabled: ", th3.getMessage());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CalibrationSettingsActivity", strN);
        CalibrationSettingsActivity.a aVar2 = CalibrationSettingsActivity.f30766m;
        CalibrationSettingsActivity calibrationSettingsActivity = this.f166497a;
        calibrationSettingsActivity.ga();
        calibrationSettingsActivity.runOnUiThread(new a(calibrationSettingsActivity, 2));
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Void r14) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CalibrationSettingsActivity", "Characteristic notification successfully enabled.");
        CalibrationSettingsActivity calibrationSettingsActivity = this.f166497a;
        calibrationSettingsActivity.f30773f = true;
        calibrationSettingsActivity.fa();
    }
}
