package k53;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk53/b;", "K", "V", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b<K, V> implements Map.Entry<K, V>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f102958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f102959b;

    public b(K k14, V v14) {
        this.f102958a = k14;
        this.f102959b = v14;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && p005kotlin.jvm.internal.s.g(entry.getKey(), this.f102958a) && p005kotlin.jvm.internal.s.g(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f102958a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f102959b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k14 = this.f102958a;
        int iHashCode = k14 != null ? k14.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f102958a);
        sb3.append('=');
        sb3.append(getValue());
        return sb3.toString();
    }
}
