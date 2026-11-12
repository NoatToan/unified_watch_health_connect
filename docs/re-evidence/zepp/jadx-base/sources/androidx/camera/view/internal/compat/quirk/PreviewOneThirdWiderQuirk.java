package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;

/* JADX INFO: loaded from: classes.dex */
public class PreviewOneThirdWiderQuirk implements Quirk {
    private static final String SAMSUNG_A3_2017 = "A3Y17LTE";
    private static final String SAMSUNG_J5_PRIME = "ON5XELTE";

    public static boolean load() {
        String str = Build.DEVICE;
        return (SAMSUNG_J5_PRIME.equals(str.toUpperCase()) && Build.VERSION.SDK_INT >= 26) || SAMSUNG_A3_2017.equals(str.toUpperCase());
    }

    public float getCropRectScaleX() {
        return 0.75f;
    }
}
