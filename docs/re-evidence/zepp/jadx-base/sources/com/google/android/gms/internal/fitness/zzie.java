package com.google.android.gms.internal.fitness;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzie<K, V> extends LinkedHashMap<K, V> {
    private static final zzie b;
    private boolean a;

    static {
        zzie zzieVar = new zzie();
        b = zzieVar;
        zzieVar.a = false;
    }

    private zzie() {
        this.a = true;
    }

    private final void a() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return zzhc.hashCode((byte[]) obj);
        }
        if (obj instanceof zzhb) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                z = true;
            } else {
                if (size() == map.size()) {
                    Iterator<Map.Entry<K, V>> it2 = entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Map.Entry<K, V> next = it2.next();
                            if (map.containsKey(next.getKey())) {
                                V value = next.getValue();
                                Object obj2 = map.get(next.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iC = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    public final boolean isMutable() {
        return this.a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        a();
        zzhc.a(k);
        zzhc.a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        a();
        for (K k : map.keySet()) {
            zzhc.a(k);
            zzhc.a(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        return (V) super.remove(obj);
    }

    public final void zza(zzie<K, V> zzieVar) {
        a();
        if (zzieVar.isEmpty()) {
            return;
        }
        putAll(zzieVar);
    }

    public final void zzar() {
        this.a = false;
    }

    public final zzie<K, V> zzcn() {
        return isEmpty() ? new zzie<>() : new zzie<>(this);
    }

    private zzie(Map<K, V> map) {
        super(map);
        this.a = true;
    }
}
