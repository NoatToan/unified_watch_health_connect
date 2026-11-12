package cn.hutool.core.bean;

import cn.hutool.core.lang.SimpleCache;
import cn.hutool.core.lang.func.Func0;
import java.beans.PropertyDescriptor;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum BeanInfoCache {
    INSTANCE;

    private final SimpleCache<Class<?>, Map<String, PropertyDescriptor>> pdCache = new SimpleCache<>();
    private final SimpleCache<Class<?>, Map<String, PropertyDescriptor>> ignoreCasePdCache = new SimpleCache<>();

    BeanInfoCache() {
    }

    private SimpleCache<Class<?>, Map<String, PropertyDescriptor>> getCache(boolean z) {
        return z ? this.ignoreCasePdCache : this.pdCache;
    }

    public Map<String, PropertyDescriptor> getPropertyDescriptorMap(Class<?> cls, boolean z) {
        return getCache(z).get(cls);
    }

    public void putPropertyDescriptorMap(Class<?> cls, Map<String, PropertyDescriptor> map, boolean z) {
        getCache(z).put(cls, map);
    }

    public Map<String, PropertyDescriptor> getPropertyDescriptorMap(Class<?> cls, boolean z, Func0<Map<String, PropertyDescriptor>> func0) {
        return getCache(z).get(cls, func0);
    }
}
