package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.RequiresApi;
import androidx.core.util.Supplier;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class msq {

    @RequiresApi(26)
    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    @RequiresApi(28)
    public static class b {
        public static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    @RequiresApi(34)
    public static class c {
        public static int a(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        public static int b(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    public static int a(Resources resources, int i, Supplier<Integer> supplier, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return supplier.get().intValue();
    }

    public static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, PluginPackageConstant.RN_DIR_A);
    }

    public static int c(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int d(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i, i2, i3);
        }
        if (!i(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iC = c(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iC, new Supplier() { // from class: ksq
            @Override // androidx.core.util.Supplier
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int g(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i, i2, i3);
        }
        if (!i(i, i2, i3)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iD = d(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new Supplier() { // from class: lsq
            @Override // androidx.core.util.Supplier
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    public static boolean i(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iB = b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iB != 0 && resources.getBoolean(iB);
    }
}
