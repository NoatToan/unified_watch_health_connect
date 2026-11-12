package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class kw0 implements kgi {
    public static boolean a(vf3 vf3Var) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && ((Integer) vf3Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
