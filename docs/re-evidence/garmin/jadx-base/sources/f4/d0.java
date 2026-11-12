package f4;

import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf4/d0;", "K", "V", "", "Lf4/u;", "map", "", "", "iterator", "<init>", "(Lf4/u;Ljava/util/Iterator;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u<K, V> f68728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<Map.Entry<K, V>> f68729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f68731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f68732e;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(u<K, V> uVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f68728a = uVar;
        this.f68729b = it;
        this.f68730c = uVar.b().f68812d;
        a();
    }

    public final void a() {
        this.f68731d = this.f68732e;
        Iterator<Map.Entry<K, V>> it = this.f68729b;
        this.f68732e = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.f68732e != null;
    }

    public final void remove() {
        u<K, V> uVar = this.f68728a;
        if (uVar.b().f68812d != this.f68730c) {
            org.apache.commons.lang3.e.h();
            return;
        }
        Map.Entry<? extends K, ? extends V> entry = this.f68731d;
        if (entry == null) {
            j20.x.h();
            return;
        }
        uVar.remove(entry.getKey());
        this.f68731d = null;
        Unit unit = Unit.INSTANCE;
        this.f68730c = uVar.b().f68812d;
    }
}
