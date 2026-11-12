package com.huawei.haf.router.core;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.HafRuntimeException;
import com.huawei.haf.router.facade.model.RouteMeta;
import com.huawei.haf.router.facade.template.InterceptorHandler;
import com.huawei.haf.router.facade.template.RouteGroup;
import com.huawei.haf.router.facade.template.ServiceProvider;
import com.huawei.haf.router.facade.template.SingleServiceProvider;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Map<String, String> f6061a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static Map<Integer, Class<? extends InterceptorHandler>> f6063c;
    static Map<String, Class<? extends RouteGroup>> d;
    static Map<String, RouteMeta> e;
    static Map<Class, ServiceProvider> h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final List<InterceptorHandler> f6062b = Collections.synchronizedList(new ArrayList());

    static {
        d = new ConflictDetectionMap();
        e = new ConflictDetectionMap();
        f6061a = new ConflictDetectionHanderMap();
        f6063c = new ConflictDetectionTreeMap();
    }

    private AppRouterStore() {
    }

    static class ConflictDetectionMap<K, V> extends ConcurrentHashMap<K, V> {
        private static final long serialVersionUID = 6118990152932037007L;

        private ConflictDetectionMap() {
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            if (containsKey(k)) {
                LogUtil.e("HAF_AppRouter", "More than one route use same path[", k, "]");
            }
            return (V) super.put(k, v);
        }
    }

    static class ConflictDetectionHanderMap extends ConcurrentHashMap<String, String> {
        private static final long serialVersionUID = -7257139389544821068L;

        private ConflictDetectionHanderMap() {
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String put(String str, String str2) {
            Class<?> clsC;
            if (containsKey(str) && (clsC = ReflectionUtils.c(str, BaseApplication.b().getClassLoader())) != null && SingleServiceProvider.class.isAssignableFrom(clsC)) {
                LogUtil.e("HAF_AppRouter", "The '", str, "' has many subclasses, but this class implements SingleServiceProvider, which may be risky.");
            }
            return (String) super.put(str, str2);
        }
    }

    static class ConflictDetectionTreeMap extends TreeMap<Integer, Class<? extends InterceptorHandler>> {
        private static final long serialVersionUID = 4783324284301084127L;

        private ConflictDetectionTreeMap() {
        }

        @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Class<? extends InterceptorHandler> put(Integer num, Class<? extends InterceptorHandler> cls) {
            if (containsKey(num)) {
                throw new HafRuntimeException(String.format(Locale.ENGLISH, "More than one interceptors use same priority [%s]", num));
            }
            return (Class) super.put(num, cls);
        }
    }
}
