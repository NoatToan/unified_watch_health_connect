package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class hx9 implements ydq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f20560a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    public static boolean a(vf3 vf3Var) {
        return f20560a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) vf3Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
