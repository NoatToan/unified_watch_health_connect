package com.xiaomi.accountsdk.utils;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class EasyMap<K, V> extends HashMap<K, V> {
    private static final long serialVersionUID = -7846033686833655451L;

    public EasyMap() {
    }

    public EasyMap<K, V> easyPut(K k2, V v) {
        put(k2, v);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EasyMap<K, V> easyPutOpt(K k2, V v) {
        if (k2 != null && v != 0 && (!(v instanceof String) || (!((String) v).isEmpty()))) {
            put(k2, v);
        }
        return this;
    }

    public EasyMap(K k2, V v) {
        put(k2, v);
    }
}
