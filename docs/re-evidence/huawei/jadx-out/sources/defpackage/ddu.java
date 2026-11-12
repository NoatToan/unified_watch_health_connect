package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public class ddu {
    private static volatile boolean d = false;

    public static void c() {
        synchronized (ddu.class) {
            if (d) {
                LogUtil.a("WalletConfigInit", "has done");
                return;
            }
            try {
                Class<?> cls = Class.forName("health.compact.a.DeviceConfigInit");
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                cls.getMethod("create", new Class[0]).invoke(declaredConstructor.newInstance(new Object[0]), new Object[0]);
                d = true;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                LogUtil.j("WalletConfigInit", "WalletConfigInit create Exception");
            }
        }
    }
}
