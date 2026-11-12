package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class n6r<K, V> extends h93<K, V> {
    @Override // defpackage.h93
    public w0e<K, V> c(K k2, V v, ReferenceQueue<? super V> referenceQueue) {
        return new q6r(k2, v, referenceQueue);
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.get(obj);
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // defpackage.h93, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }
}
