package com.xiaomi.hm.health.baseutil;

import defpackage.cg2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class GlobalConfig implements InvocationHandler {
    private static volatile Object a;
    private static Object b = new a();

    public interface IGlobalConfig {
        boolean isBuildAmazfit();

        boolean isBuildDebug();

        boolean isBuildInner();

        boolean isBuildMidong();

        boolean isBuildPlay();
    }

    public class a implements IGlobalConfig {
        @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
        public /* synthetic */ boolean isBuildAmazfit() {
            return cg2.a(this);
        }

        @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
        public /* synthetic */ boolean isBuildDebug() {
            return cg2.b(this);
        }

        @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
        public /* synthetic */ boolean isBuildInner() {
            return cg2.c(this);
        }

        @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
        public /* synthetic */ boolean isBuildMidong() {
            return cg2.d(this);
        }

        @Override // com.xiaomi.hm.health.baseutil.GlobalConfig.IGlobalConfig
        public /* synthetic */ boolean isBuildPlay() {
            return cg2.e(this);
        }
    }

    public static void config(IGlobalConfig iGlobalConfig) {
        b = iGlobalConfig;
    }

    public static IGlobalConfig get() {
        return (IGlobalConfig) get(IGlobalConfig.class, GlobalConfig.class);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = b;
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
        if (a == null) {
            synchronized (GlobalConfig.class) {
                if (a == null) {
                    try {
                        a = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, cls2.newInstance());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        Objects.requireNonNull(a, "GlobalConfig Proxy is Null");
        return a;
    }
}
