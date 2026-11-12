package com.xiaomi.smarthome.framework.plugin.rn;

import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RnModuleProvider {
    private static final String LOG_TAG = "RnFrameworkModuleManager";
    private static volatile RnModuleProvider sInstance;
    private final HashMap<String, String> mProviderReflections = new HashMap<>();
    private final HashMap<String, ProviderProxy> mProviderImpls = new HashMap<>();

    public static class ProviderProxy<T> implements InvocationHandler {
        private T delegate;
        private T impl;

        private ProviderProxy() {
        }

        public static Object getDefaultValue(Class<?> cls) {
            if (cls == Integer.TYPE) {
                return 0;
            }
            if (cls == Double.TYPE) {
                return Double.valueOf(0.0d);
            }
            if (cls == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (cls == Character.TYPE) {
                return (char) 0;
            }
            if (cls == Byte.TYPE) {
                return (byte) 0;
            }
            if (cls == Short.TYPE) {
                return (short) 0;
            }
            if (cls == Long.TYPE) {
                return 0L;
            }
            if (cls == Float.TYPE) {
                return Float.valueOf(0.0f);
            }
            return null;
        }

        public void bind(T t) {
            this.delegate = t;
            this.impl = (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), this.delegate.getClass().getInterfaces(), this);
        }

        public void defaultImpl(Class<T> cls) {
            this.impl = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (this.delegate == null) {
                RnModuleProvider.log("invoke method with default:" + obj.getClass() + " : " + method);
                return getDefaultValue(method.getReturnType());
            }
            RnModuleProvider.log("invoke method with defined:" + this.delegate.getClass().getSimpleName() + " : " + method);
            return method.invoke(this.delegate, objArr);
        }
    }

    private RnModuleProvider() {
    }

    public static <T> T as(Class<T> cls) {
        return (T) getInstance().getProviderInternal(cls);
    }

    public static RnModuleProvider getInstance() {
        if (sInstance == null) {
            synchronized (RnModuleProvider.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new RnModuleProvider();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider$ProviderProxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    private synchronized <T> T getProviderInternal(Class<T> cls) {
        String name = cls.getName();
        ProviderProxy providerProxy = this.mProviderImpls.get(name);
        if (providerProxy != null) {
            return (T) providerProxy.impl;
        }
        String str = this.mProviderReflections.get(name);
        ?? NewInstance = 0;
        NewInstance = 0;
        ?? providerProxy2 = new ProviderProxy();
        if (str != null) {
            try {
                NewInstance = Class.forName(str).newInstance();
            } catch (Exception unused) {
                log("cannot find provider impl for " + str + " please check impl has empty construct");
            }
        }
        if (NewInstance != 0) {
            providerProxy2.bind(NewInstance);
        } else {
            providerProxy2.defaultImpl(cls);
        }
        this.mProviderImpls.put(name, (ProviderProxy) providerProxy2);
        return (T) ((ProviderProxy) providerProxy2).impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void log(String str) {
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "rn-core-framework", 3, LOG_TAG, str);
    }

    public RnModuleProvider bindImpl(String str, String str2) {
        this.mProviderReflections.put(str, str2);
        return this;
    }
}
