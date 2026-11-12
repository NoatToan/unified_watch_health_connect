package kd0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/u5;", "Lwn1/k0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u5 implements wn1.k0 {
    @Override // wn1.k0
    public final boolean a(long j8) {
        return Boolean.parseBoolean(GCMSettingManager.h(j8, GCMSettingManager.f41535a.getString(R.string.key_is_user_primary)));
    }

    @Override // wn1.k0
    public final String b(long j8) {
        return GCMSettingManager.t(j8);
    }

    @Override // wn1.k0
    public final void c(long j8, boolean z14) {
        GCMSettingManager.C(j8, GCMSettingManager.f41535a.getString(R.string.key_is_user_primary), Boolean.toString(z14));
    }

    @Override // wn1.k0
    public final void d(long j8, String str) {
        GCMSettingManager.C(j8, GCMSettingManager.f41535a.getString(R.string.key_user_short_names), str);
    }
}
