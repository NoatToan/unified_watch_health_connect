package com.huawei.health.h5pro.load.expression;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ExpressionFunctionRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Object> f6967b;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f6967b = concurrentHashMap;
        concurrentHashMap.put("TimeFunctions", new TimeFunctions());
        concurrentHashMap.put("RouteFunctions", new RouteFunctions());
    }

    private ExpressionFunctionRegistry() {
    }

    public static Object get(String str) {
        return f6967b.get(str);
    }

    public static void register(String str, Object obj) {
        f6967b.put(str, obj);
    }
}
