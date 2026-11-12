package miuix.view;

import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import miui.util.HapticFeedbackUtil;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class PlatformConstants {
    public static final int VERSION;
    public static double romHapticVersion = 1.0d;

    static {
        int iCheckVersion;
        try {
            Class<?> cls = Class.forName("miui.util.HapticFeedbackUtil");
            Class<?> cls2 = Class.forName("miui.view.MiuiHapticFeedbackConstants");
            if (cls.getMethod("isSupportLinearMotorVibrate", Integer.TYPE) != null) {
                Field declaredField = cls2.getDeclaredField("FLAG_MIUI_HAPTIC_VERSION");
                iCheckVersion = declaredField != null ? declaredField.getInt(null) : 0;
            } else {
                iCheckVersion = checkVersion();
            }
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodException unused) {
            iCheckVersion = -1;
        } catch (IllegalAccessException | NoSuchFieldException unused2) {
            iCheckVersion = checkVersion();
        }
        VERSION = iCheckVersion;
        String.format("Platform version: %d.", Integer.valueOf(iCheckVersion));
        try {
            Class<?> cls3 = Class.forName("miui.util.HapticFeedbackUtil");
            romHapticVersion = ((Double) cls3.getDeclaredMethod("getCurVersion", new Class[0]).invoke(cls3, new Object[0])).doubleValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Rom haptic version: ");
        sb.append(romHapticVersion);
    }

    public static int checkVersion() {
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(268435471)) {
            return 5;
        }
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(268435470)) {
            return 4;
        }
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(268435469)) {
            return 3;
        }
        if (HapticFeedbackUtil.isSupportLinearMotorVibrate(268435468)) {
            return 2;
        }
        return HapticFeedbackUtil.isSupportLinearMotorVibrate(268435465) ? 1 : 0;
    }
}
