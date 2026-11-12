package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class oh3 implements ydq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public static final List<String> f29165a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    public static boolean a(vf3 vf3Var) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f29165a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) vf3Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
