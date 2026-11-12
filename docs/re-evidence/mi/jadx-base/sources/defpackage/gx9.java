package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;
import java.nio.BufferUnderflowException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class gx9 {
    public static boolean a(vf3 vf3Var) {
        Boolean bool = (Boolean) vf3Var.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            zpe.k("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean b(vf3 vf3Var) {
        try {
            return a(vf3Var);
        } catch (BufferUnderflowException unused) {
            return false;
        }
    }

    public static boolean c(vf3 vf3Var) {
        if (za6.a(fx9.class) == null) {
            return a(vf3Var);
        }
        zpe.a("FlashAvailability", "Device has quirk " + fx9.class.getSimpleName() + ". Checking for flash availability safely...");
        return b(vf3Var);
    }
}
