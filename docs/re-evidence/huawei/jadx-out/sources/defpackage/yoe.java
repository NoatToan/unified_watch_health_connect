package defpackage;

import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class yoe {
    private static volatile yoe d;

    private yoe() throws yob {
        d();
    }

    private void d() throws yob {
        try {
            Method method = Class.forName("com.huawei.security.keystore.HwUniversalKeyStoreProvider").getMethod(JsbMapKeyNames.H5_TEXT_DOWNLOAD_INSTALL, new Class[0]);
            method.setAccessible(true);
            method.invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new yob("install HwKeyStore fail:" + e.getMessage());
        }
    }

    public static yoe a() throws yob {
        if (d == null) {
            synchronized (yoe.class) {
                if (d == null) {
                    d = new yoe();
                }
            }
        }
        return d;
    }
}
