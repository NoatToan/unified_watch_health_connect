package org.acra.util;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.acra.util.a;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a {
    public static BundleWrapper.Internal b() {
        final Object persistableBundle = Build.VERSION.SDK_INT >= 22 ? new PersistableBundle() : new Bundle();
        return (BundleWrapper.Internal) Proxy.newProxyInstance(BundleWrapper.class.getClassLoader(), new Class[]{BundleWrapper.Internal.class}, new InvocationHandler() { // from class: m90
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return a.c(persistableBundle, obj, method, objArr);
            }
        });
    }

    public static /* synthetic */ Object c(Object obj, Object obj2, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("asPersistableBundle")) {
            if (Build.VERSION.SDK_INT >= 22) {
                return obj;
            }
            return null;
        }
        if (!method.getName().equals("asBundle")) {
            return obj.getClass().getMethod(method.getName(), method.getParameterTypes()).invoke(obj, objArr);
        }
        if (Build.VERSION.SDK_INT < 22) {
            return obj;
        }
        return null;
    }

    public static BundleWrapper d(@Nullable Bundle bundle) {
        BundleWrapper.Internal internalB = b();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof Integer) {
                    internalB.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof int[]) {
                    internalB.putIntArray(str, (int[]) obj);
                } else if (obj instanceof Long) {
                    internalB.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof long[]) {
                    internalB.putLongArray(str, (long[]) obj);
                } else if (obj instanceof Double) {
                    internalB.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof double[]) {
                    internalB.putDoubleArray(str, (double[]) obj);
                } else if (obj instanceof String) {
                    internalB.putString(str, (String) obj);
                } else if (obj instanceof String[]) {
                    internalB.putStringArray(str, (String[]) obj);
                } else if (obj instanceof Boolean) {
                    internalB.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof boolean[]) {
                    internalB.putBooleanArray(str, (boolean[]) obj);
                }
            }
        }
        return internalB;
    }

    @RequiresApi(api = 21)
    public static BundleWrapper e(@Nullable PersistableBundle persistableBundle) {
        BundleWrapper.Internal internalB = b();
        if (persistableBundle != null) {
            internalB.putAll(persistableBundle);
        }
        return internalB;
    }
}
