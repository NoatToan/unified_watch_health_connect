package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.internal.compat.quirk.UseTorchAsFlashQuirk;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class CameraNoResponseWhenEnablingFlashQuirk implements UseTorchAsFlashQuirk {
    public static boolean load(@NonNull CameraCharacteristicsCompat characteristics) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return AndroidManufacturerUtils.MANUFACTURE_SAMSUNG.equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-N920") && ((Integer) characteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
