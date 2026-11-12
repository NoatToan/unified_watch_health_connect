package defpackage;

import cn.hutool.core.collection.CollUtil;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Set;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes.dex */
public class r43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f32166a = CollUtil.q("true", "yes", "y", DeviceTagInterface.CUSTOM_TAG_TYPE, SNSAuthProvider.VALUE_SNS_OK, "1", DebugKt.DEBUG_PROPERTY_VALUE_ON, "是", "对", "真", "對", "√");

    public static boolean a(Class<?> cls) {
        return cls == Boolean.class || cls == Boolean.TYPE;
    }

    public static boolean b(String str) {
        if (!tt3.H(str)) {
            return false;
        }
        return f32166a.contains(str.trim().toLowerCase());
    }

    public static byte c(boolean z) {
        return (byte) k(z);
    }

    public static Byte d(boolean z) {
        return Byte.valueOf(c(z));
    }

    public static char e(boolean z) {
        return (char) k(z);
    }

    public static Character f(boolean z) {
        return Character.valueOf(e(z));
    }

    public static double g(boolean z) {
        return k(z);
    }

    public static Double h(boolean z) {
        return Double.valueOf(g(z));
    }

    public static float i(boolean z) {
        return k(z);
    }

    public static Float j(boolean z) {
        return Float.valueOf(i(z));
    }

    public static int k(boolean z) {
        return z ? 1 : 0;
    }

    public static Integer l(boolean z) {
        return Integer.valueOf(k(z));
    }

    public static long m(boolean z) {
        return k(z);
    }

    public static Long n(boolean z) {
        return Long.valueOf(m(z));
    }

    public static short o(boolean z) {
        return (short) k(z);
    }

    public static Short p(boolean z) {
        return Short.valueOf(o(z));
    }
}
