package p1;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp1/d0;", "K", "V", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d0<K, V> implements Map.Entry<K, V>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f134692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f134693b;

    public d0(K k14, V v14) {
        this.f134692a = k14;
        this.f134693b = v14;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f134692a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f134693b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
