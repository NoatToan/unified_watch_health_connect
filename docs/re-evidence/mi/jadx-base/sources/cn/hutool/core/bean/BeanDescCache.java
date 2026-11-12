package cn.hutool.core.bean;

import cn.hutool.core.lang.SimpleCache;
import cn.hutool.core.lang.func.Func0;

/* JADX INFO: loaded from: classes.dex */
public enum BeanDescCache {
    INSTANCE;

    private final SimpleCache<Class<?>, BeanDesc> bdCache = new SimpleCache<>();

    BeanDescCache() {
    }

    public BeanDesc getBeanDesc(Class<?> cls, Func0<BeanDesc> func0) {
        return this.bdCache.get(cls, func0);
    }
}
