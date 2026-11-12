package w3;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw3/y;", "K", "V", "Lw3/u;", "", "Lw3/i;", "parentIterator", "<init>", "(Lw3/i;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<K, V> f181820d;

    public y(i<K, V> iVar) {
        this.f181820d = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i14 = this.f181819c;
        this.f181819c = i14 + 2;
        Object[] objArr = this.f181817a;
        return new c(this.f181820d, objArr[i14], objArr[i14 + 1]);
    }
}
