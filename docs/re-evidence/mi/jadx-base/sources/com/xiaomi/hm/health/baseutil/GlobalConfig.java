package com.xiaomi.hm.health.baseutil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class GlobalConfig implements InvocationHandler {
    private static volatile Object sProxy;
    private static Object sRealConfig = new IGlobalConfig() { // from class: com.xiaomi.hm.health.baseutil.GlobalConfig.1
    };

    public interface IGlobalConfig {
        default boolean isBuildAmazfit() {
            return false;
        }

        default boolean isBuildDebug() {
            return false;
        }

        default boolean isBuildInner() {
            return false;
        }

        default boolean isBuildMidong() {
            return true;
        }

        default boolean isBuildPlay() {
            return false;
        }
    }

    public static void config(IGlobalConfig iGlobalConfig) {
        sRealConfig = iGlobalConfig;
    }

    public static IGlobalConfig get() {
        return (IGlobalConfig) get(IGlobalConfig.class, GlobalConfig.class);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = sRealConfig;
        Objects.requireNonNull(obj2, "GlobalConfig Invoke on Null");
        try {
            return method.invoke(obj2, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static IGlobalConfig get(Class<?> cls) {
        return (IGlobalConfig) get(cls, GlobalConfig.class);
    }

    public static Object get(Class<?> cls, Class<? extends InvocationHandler> cls2) {
        if (sProxy == null) {
            synchronized (GlobalConfig.class) {
                if (sProxy == null) {
                    try {
                        sProxy = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, cls2.newInstance());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        Objects.requireNonNull(sProxy, "GlobalConfig Proxy is Null");
        return sProxy;
    }
}
