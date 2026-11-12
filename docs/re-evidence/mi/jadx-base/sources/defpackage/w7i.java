package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class w7i implements kgi {
    public static boolean a(vf3 vf3Var) {
        Integer num = (Integer) vf3Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
