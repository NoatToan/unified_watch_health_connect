package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class x3 extends a5<UserSettingsDTO, Double> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27496e = 0;

    public x3(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // ch1.a5
    public final Double s(UserSettingsDTO userSettingsDTO) {
        double dZ = userSettingsDTO.Z();
        if (dZ < 0.0d) {
            dZ = 21600.0d;
        }
        return Double.valueOf(dZ);
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_wake_time;
    }

    @Override // ch1.a5
    public final String u() {
        return b(R.string.settings_users_sleep_wake_time);
    }

    @Override // ch1.a5
    public final xg1.c<Double> v(UserSettingsDTO userSettingsDTO) {
        return new a0.h(16, this, userSettingsDTO);
    }

    @Override // ch1.a5
    public final xg1.r<Double> w() {
        return new eh1.a(this.f70343a);
    }

    @Override // ch1.a5
    public final void x(Double d14, UserSettingsDTO userSettingsDTO) {
        Double d15 = d14;
        userSettingsDTO.j1(d15 != null ? d15.longValue() : 0L);
    }
}
