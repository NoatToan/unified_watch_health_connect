package defpackage;

import android.R;

/* JADX INFO: loaded from: classes43.dex */
public class pze {
    private static int a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i != 0) {
            return i;
        }
        if (i2 < 11) {
            return i3;
        }
        if (i2 < 14) {
            return i4;
        }
        return i2 < 24 ? i5 : i6;
    }

    public static int d(int i, int i2) {
        return a(i, i2, R.style.Theme, R.style.Theme.Holo, R.style.Theme.DeviceDefault, R.style.Theme.DeviceDefault.Light.DarkActionBar);
    }
}
