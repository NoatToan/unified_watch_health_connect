package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;

/* JADX INFO: loaded from: classes.dex */
public class CrashWhenTakingPhotoWithAutoFlashAEModeQuirk implements Quirk {
    public static boolean load() {
        return AndroidManufacturerUtils.MANUFACTURE_SAMSUNG.equals(Build.MANUFACTURER.toUpperCase()) && Build.MODEL.toUpperCase().startsWith("SM-A300");
    }
}
