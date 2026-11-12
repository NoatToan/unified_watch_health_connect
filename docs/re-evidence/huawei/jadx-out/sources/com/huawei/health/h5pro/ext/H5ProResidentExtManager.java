package com.huawei.health.h5pro.ext;

import android.text.TextUtils;
import com.huawei.health.h5pro.ext.hostapp.H5ProHostAppRuntimeApi;
import com.huawei.health.h5pro.ext.interceptor.H5ProDefaultInterceptor;
import com.huawei.health.h5pro.ext.interceptor.H5ProInterceptor;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionExtApi;
import com.huawei.health.h5pro.ext.version.H5ProVersionUpgradeExtApi;
import com.huawei.health.h5pro.utils.LogUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class H5ProResidentExtManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static H5ProVersionUpgradeExtApi f6783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static H5ProInterceptor f6784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static H5ProPermissionExtApi f6785c;
    private static H5ProHostAppRuntimeApi d;

    private H5ProResidentExtManager() {
    }

    public static String[] getAllExtApiClass() {
        String[] strArr;
        synchronized (H5ProResidentExtManager.class) {
            ArrayList arrayList = new ArrayList();
            H5ProPermissionExtApi h5ProPermissionExtApi = f6785c;
            if (h5ProPermissionExtApi != null) {
                arrayList.add(h5ProPermissionExtApi.getClass().getName());
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return strArr;
    }

    public static void restoreExtApi(String[] strArr) {
        synchronized (H5ProResidentExtManager.class) {
            if (c() && strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    b(str);
                }
            }
        }
    }

    private static boolean c() {
        return f6785c == null;
    }

    private static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Constructor<?> constructorC = c(Class.forName(str));
            if (constructorC != null) {
                Object objNewInstance = constructorC.newInstance(new Object[0]);
                if (objNewInstance instanceof H5ProPermissionExtApi) {
                    setPermissionExtApi((H5ProPermissionExtApi) objNewInstance);
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            LogUtil.i("H5PRO_H5ProResidentExtManager", "registerByClass: exception, " + e.getMessage());
        }
    }

    private static Constructor<?> c(Class<?> cls) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes() == null || constructor.getParameterTypes().length == 0) {
                return constructor;
            }
        }
        return null;
    }

    public static void setPermissionExtApi(H5ProPermissionExtApi h5ProPermissionExtApi) {
        f6785c = h5ProPermissionExtApi;
    }

    public static H5ProPermissionExtApi getPermissionExtApi() {
        return f6785c;
    }

    public static H5ProInterceptor getVersionInterceptor() {
        H5ProInterceptor h5ProInterceptor;
        synchronized (H5ProResidentExtManager.class) {
            if (f6784b == null) {
                f6784b = new H5ProDefaultInterceptor();
            }
            h5ProInterceptor = f6784b;
        }
        return h5ProInterceptor;
    }

    public static void setVersionInterceptor(H5ProInterceptor h5ProInterceptor) {
        synchronized (H5ProResidentExtManager.class) {
            f6784b = h5ProInterceptor;
        }
    }

    public static H5ProVersionUpgradeExtApi getVersionUpgradeExtApi() {
        return f6783a;
    }

    public static void setVersionUpgradeExtApi(H5ProVersionUpgradeExtApi h5ProVersionUpgradeExtApi) {
        f6783a = h5ProVersionUpgradeExtApi;
    }

    public static H5ProHostAppRuntimeApi getHostAppRuntimeApi() {
        return d;
    }

    public static void setHostAppApi(H5ProHostAppRuntimeApi h5ProHostAppRuntimeApi) {
        d = h5ProHostAppRuntimeApi;
    }
}
