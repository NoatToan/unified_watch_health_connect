package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class t1s {
    @RequiresApi(21)
    public static boolean a(vf3 vf3Var, int i) {
        int[] iArr = (int[]) vf3Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
