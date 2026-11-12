package l53;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B7\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll53/b;", "K", "V", "Lk53/b;", "", "", "Ll53/a;", "mutableMap", Action.KEY_ATTRIBUTE, "links", "<init>", "(Ljava/util/Map;Ljava/lang/Object;Ll53/a;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<K, V> extends k53.b<K, V> implements Map.Entry<K, V>, f23.d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<K, a<V>> f110398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a<V> f110399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Map<K, a<V>> map, K k14, a<V> aVar) {
        super(k14, aVar.f110395a);
        map.getClass();
        aVar.getClass();
        this.f110398c = map;
        this.f110399d = aVar;
    }

    @Override // k53.b, java.util.Map.Entry
    public final V getValue() {
        return this.f110399d.f110395a;
    }

    @Override // k53.b, java.util.Map.Entry
    public final V setValue(V v14) {
        a<V> aVar = this.f110399d;
        V v15 = aVar.f110395a;
        a<V> aVar2 = new a<>(v14, aVar.f110396b, aVar.f110397c);
        this.f110399d = aVar2;
        this.f110398c.put(this.f102958a, aVar2);
        return v15;
    }
}
