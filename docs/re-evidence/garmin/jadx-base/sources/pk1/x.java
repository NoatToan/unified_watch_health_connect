package pk1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpk1/x;", "Lz22/a$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements z22.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f138349a;

    public x(u uVar) {
        this.f138349a = uVar;
    }

    @Override // z22.a.b
    public final void b(String str) {
        u uVar = this.f138349a;
        if (str != null) {
            GCMSettingsItemView gCMSettingsItemView = uVar.f138328m;
            if (gCMSettingsItemView != null) {
                gCMSettingsItemView.setSummary(str);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("sleepWakeTimeView");
                throw null;
            }
        }
        a2 a2Var = a2.SETTINGS;
        i2.f36769a.getClass();
        i2.a.f(a2Var, "UserSettingsFragment", "Oops! Your awake time can not be the same as your sleep time.");
        String string = uVar.getString(R.string.sleep_validation_times_error_message);
        string.getClass();
        new androidx.appcompat.app.e.a(uVar.requireContext()).setMessage(string).setPositiveButton(R.string.common_button_got_it, new mt0.y(14)).show();
    }
}
