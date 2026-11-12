package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0<?, ?> f6775b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6776a;

    static {
        k0<?, ?> k0Var = new k0<>();
        f6775b = k0Var;
        k0Var.f6776a = false;
    }

    private k0() {
        this.f6776a = true;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof z.a)) {
                return obj.hashCode();
            }
            com.google.protobuf.a.m();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = z.f6936a;
        int i14 = length;
        for (byte b14 : bArr) {
            i14 = (i14 * 31) + b14;
        }
        if (i14 == 0) {
            return 1;
        }
        return i14;
    }

    public final void b() {
        if (this.f6776a) {
            return;
        }
        com.google.protobuf.a.m();
    }

    public final k0<K, V> c() {
        return isEmpty() ? new k0<>() : new k0<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z14;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry<K, V> next = it.next();
                            if (map.containsKey(next.getKey())) {
                                V value = next.getValue();
                                Object obj2 = map.get(next.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z14 = true;
                        }
                    }
                }
                z14 = false;
            } else {
                z14 = true;
            }
            if (z14) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k14, V v14) {
        b();
        Charset charset = z.f6936a;
        k14.getClass();
        v14.getClass();
        return (V) super.put(k14, v14);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        for (K k14 : map.keySet()) {
            Charset charset = z.f6936a;
            k14.getClass();
            map.get(k14).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        return (V) super.remove(obj);
    }

    private k0(Map<K, V> map) {
        super(map);
        this.f6776a = true;
    }
}
