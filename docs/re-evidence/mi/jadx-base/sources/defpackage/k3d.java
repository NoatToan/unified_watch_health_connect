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
public class k3d implements ydq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public static final List<String> f23389a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    public static boolean a(vf3 vf3Var) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f23389a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) vf3Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
