package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class o1 extends m3<UserSettingsDTO, Double> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27424e = 0;

    public o1(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // ch1.a5
    public final Object s(Object obj) {
        return Double.valueOf(((UserSettingsDTO) obj).I());
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_height;
    }

    @Override // ch1.a5
    public final String u() {
        return b(R.string.lbl_height);
    }

    @Override // ch1.a5
    public final xg1.c v(Object obj) {
        return new a0.h(13, this, (UserSettingsDTO) obj);
    }

    @Override // ch1.a5
    public final xg1.r<Double> w() {
        return new n1(this);
    }

    @Override // ch1.a5
    public final void x(Object obj, Object obj2) {
        Double d14 = (Double) obj;
        ((UserSettingsDTO) obj2).S0(d14 != null ? d14.doubleValue() : -1.0d);
        if (d14 != null) {
            f12.l.f68084a.getClass();
            f12.l.a.a().U2(d14.floatValue());
        }
    }

    @Override // ch1.m3
    public final /* bridge */ /* synthetic */ Double y() {
        return Double.valueOf(-1.0d);
    }
}
