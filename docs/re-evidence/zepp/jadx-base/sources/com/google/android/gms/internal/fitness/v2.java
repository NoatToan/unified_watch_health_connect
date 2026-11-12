package com.google.android.gms.internal.fitness;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class v2<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzhl> a;

    private v2(Map.Entry<K, zzhl> entry) {
        this.a = entry;
    }

    public final zzhl a() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        return zzhl.zzce();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzik) {
            return this.a.getValue().zzh((zzik) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
