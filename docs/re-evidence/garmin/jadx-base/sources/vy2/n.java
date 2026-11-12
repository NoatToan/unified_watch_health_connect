package vy2;

import ch.qos.logback.core.joran.action.Action;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvy2/n;", "K", "V", "Lxy2/h;", "", "Lxy2/h$b;", Action.KEY_ATTRIBUTE, "<init>", "(Lxy2/h$b;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class n<K, V> extends xy2.h implements Map<K, V>, f23.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f180857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xy2.h.b<?> bVar) {
        super(bVar);
        bVar.getClass();
        this.f180857b = new LinkedHashMap();
    }

    @Override // java.util.Map
    public final void clear() {
        this.f180857b.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f180857b.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f180857b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f180857b.entrySet();
    }

    public V get(Object obj) {
        return (V) this.f180857b.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f180857b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f180857b.keySet();
    }

    @Override // java.util.Map
    public final V put(K k14, V v14) {
        return (V) this.f180857b.put(k14, v14);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        this.f180857b.putAll(map);
    }

    public V remove(Object obj) {
        return (V) this.f180857b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f180857b.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f180857b.values();
    }
}
