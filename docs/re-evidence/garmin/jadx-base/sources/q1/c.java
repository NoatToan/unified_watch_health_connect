package q1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0014\u0010\n\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b\b\u0010\u000b¨\u0006\f"}, d2 = {"Lq1/c;", "", "K", "V", "", "initialCapacity", "", "loadFactor", "<init>", "(IF)V", "original", "(Lq1/c;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<K, V> f142057a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(c<? extends K, V> cVar) {
        this(0, 0.0f, 3, null);
        cVar.getClass();
        Set<Map.Entry<? extends K, V>> setEntrySet = cVar.f142057a.entrySet();
        setEntrySet.getClass();
        for (Map.Entry<? extends K, V> entry : setEntrySet) {
            K key = entry.getKey();
            V value = entry.getValue();
            key.getClass();
            value.getClass();
            this.f142057a.put(key, value);
        }
    }

    public c(int i14, float f14) {
        this.f142057a = new LinkedHashMap<>(i14, f14, true);
    }

    public /* synthetic */ c(int i14, float f14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 16 : i14, (i15 & 2) != 0 ? 0.75f : f14);
    }

    public c() {
        this(0, 0.0f, 3, null);
    }
}
