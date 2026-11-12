package health.compact.a;

import defpackage.ltk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ProductConfigUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f36628a = false;
    private static boolean e = false;

    private ProductConfigUtil() {
    }

    public static String c() {
        String str = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("get", String.class);
            str = declaredMethod.invoke(cls, "ro.secure") instanceof String ? (String) declaredMethod.invoke(cls, "ro.secure") : null;
            com.huawei.hwlogsmodel.LogUtil.a("ProductConfigUtil", "getRootProperty, Root Property info: ", str);
            return str;
        } catch (ClassNotFoundException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("ProductConfigUtil", "getRootProperty", e2.getMessage());
            return str;
        } catch (IllegalAccessException e3) {
            com.huawei.hwlogsmodel.LogUtil.e("ProductConfigUtil", "getRootProperty", e3.getMessage());
            return str;
        } catch (IllegalArgumentException e4) {
            com.huawei.hwlogsmodel.LogUtil.e("ProductConfigUtil", "getRootProperty", e4.getMessage());
            return str;
        } catch (NoSuchMethodException e5) {
            com.huawei.hwlogsmodel.LogUtil.e("ProductConfigUtil", "getRootProperty", e5.getMessage());
            return str;
        } catch (InvocationTargetException e6) {
            com.huawei.hwlogsmodel.LogUtil.e("ProductConfigUtil", "getRootProperty", e6.getMessage());
            return str;
        }
    }

    public static boolean b() {
        if (!f36628a) {
            f36628a = true;
            if ("0".equals(c())) {
                e = true;
            } else {
                e = ltk.e();
            }
        }
        return e;
    }
}
