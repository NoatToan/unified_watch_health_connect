package com.garmin.android.apps.connectmobile.settings.devices;

import ch1.q4;
import java.util.Observable;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class Fenix5DeviceSettings extends Forerunner935DeviceSettings {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42058a;

        static {
            int[] iArr = new int[u0.values().length];
            f42058a = iArr;
            try {
                iArr[u0.N2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42058a[u0.P2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42058a[u0.O2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42058a[u0.f203846y4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42058a[u0.F5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings
    public final int ka() {
        int i14 = a.f42058a[this.f125980f.ordinal()];
        if (i14 == 1) {
            return 2131231946;
        }
        if (i14 == 2) {
            return 2131231948;
        }
        if (i14 == 3) {
            return 2131231946;
        }
        if (i14 != 4) {
            return i14 != 5 ? 2131231957 : 2131231935;
        }
        return 2131231927;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.p, java.util.Observer
    public void update(Observable observable, Object obj) {
        if (obj != null) {
            String str = obj instanceof String ? (String) obj : null;
            if (observable instanceof q4) {
                Forerunner35DeviceSystemSettings.ca(this, this.f125985k, str, true);
            } else {
                super.update(observable, obj);
            }
        }
    }
}
