package com.garmin.android.apps.connectmobile.instantinput;

import androidx.preference.Preference;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.framework.widget.SwitchPreferenceCompat;
import com.mapbox.maps.renderer.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/instantinput/b;", "Landroidx/preference/b;", "<init>", "()V", "a", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends androidx.preference.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f36934i = new a(null);

    @Override // androidx.preference.b
    public final void v6() {
        u6(R.xml.gcm_settings_instant_input);
        Preference preferenceH0 = H0(getString(R.string.key_allow_instant_input));
        preferenceH0.getClass();
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) preferenceH0;
        if (switchPreferenceCompat.K0) {
            switchPreferenceCompat.x(R.string.instant_input_description_allow_instant_input_on);
        } else {
            switchPreferenceCompat.x(R.string.instant_input_description_allow_instant_input_off);
        }
        switchPreferenceCompat.f10151e = new e(switchPreferenceCompat, 8);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/instantinput/b$a;", "", "<init>", "()V", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
