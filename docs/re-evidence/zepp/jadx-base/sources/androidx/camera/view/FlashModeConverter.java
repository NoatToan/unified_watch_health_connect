package androidx.camera.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.device.authorization.RegionUtil;
import com.xiaomi.hm.health.Constant;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
    }

    @NonNull
    public static String nameOf(int i) {
        if (i == 0) {
            return RegionUtil.REGION_STRING_AUTO;
        }
        if (i == 1) {
            return Constant.ON;
        }
        if (i == 2) {
            return Constant.OFF;
        }
        throw new IllegalArgumentException("Unknown flash mode " + i);
    }

    public static int valueOf(@Nullable String str) {
        Objects.requireNonNull(str, "name cannot be null");
        switch (str) {
            case "ON":
                return 1;
            case "OFF":
                return 2;
            case "AUTO":
                return 0;
            default:
                throw new IllegalArgumentException("Unknown flash mode name " + str);
        }
    }
}
