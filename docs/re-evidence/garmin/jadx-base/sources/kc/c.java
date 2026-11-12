package kc;

import android.graphics.Color;
import fa.z;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static String a(int i14) {
        Object[] objArr = {Integer.valueOf(Color.red(i14)), Integer.valueOf(Color.green(i14)), Integer.valueOf(Color.blue(i14)), Double.valueOf(((double) Color.alpha(i14)) / 255.0d)};
        int i15 = z.f70071a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
