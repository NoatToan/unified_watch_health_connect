package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class e6 extends m3<UserSettingsDTO, Double> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27337e = 0;

    public e6(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // ch1.a5
    public final Object s(Object obj) {
        return Double.valueOf(((UserSettingsDTO) obj).E2() / 1000.0d);
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_weight;
    }

    @Override // ch1.a5
    public final String u() {
        return b(R.string.card_weight_title);
    }

    @Override // ch1.a5
    public final xg1.c v(Object obj) {
        return new a0.h(20, this, (UserSettingsDTO) obj);
    }

    @Override // ch1.a5
    public final xg1.r<Double> w() {
        return new d6(this);
    }

    @Override // ch1.a5
    public final void x(Object obj, Object obj2) {
        Double d14 = (Double) obj;
        ((UserSettingsDTO) obj2).s1(d14 != null ? d14.doubleValue() * 1000.0d : 0.0d);
    }

    @Override // ch1.m3
    public final /* bridge */ /* synthetic */ Double y() {
        return Double.valueOf(0.0d);
    }
}
