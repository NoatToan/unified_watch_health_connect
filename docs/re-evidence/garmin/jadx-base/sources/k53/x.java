package k53;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk53/x;", "K", "V", "Lk53/u;", "", "Lk53/i;", "parentIterator", "<init>", "(Lk53/i;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<K, V> f103003d;

    public x(i<K, V> iVar) {
        iVar.getClass();
        this.f103003d = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i14 = this.f103002c;
        this.f103002c = i14 + 2;
        Object[] objArr = this.f103000a;
        return new c(this.f103003d, objArr[i14], objArr[i14 + 1]);
    }
}
