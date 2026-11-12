package l53;

import c22.t;
import j20.x;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll53/i;", "K", "V", "", "Ll53/a;", "", "nextKey", "Ll53/d;", "builder", "<init>", "(Ljava/lang/Object;Ll53/d;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class i<K, V> implements Iterator<a<V>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f110421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<K, V> f110422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f110423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f110424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f110425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f110426f;

    public i(Object obj, d<K, V> dVar) {
        dVar.getClass();
        this.f110421a = obj;
        this.f110422b = dVar;
        this.f110423c = n53.b.f123788a;
        this.f110425e = dVar.f110412d.f102977e;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a<V> next() {
        k53.f<K, a<V>> fVar = this.f110422b.f110412d;
        if (fVar.f102977e != this.f110425e) {
            org.apache.commons.lang3.e.h();
            return null;
        }
        if (!hasNext()) {
            t.g();
            return null;
        }
        Object obj = this.f110421a;
        this.f110423c = obj;
        this.f110424d = true;
        this.f110426f++;
        a<V> aVar = fVar.get(obj);
        if (aVar == null) {
            throw new ConcurrentModificationException(am.j.k(this.f110421a, ") has changed after it was added to the persistent map.", new StringBuilder("Hash code of a key (")));
        }
        a<V> aVar2 = aVar;
        this.f110421a = aVar2.f110397c;
        return aVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f110426f < this.f110422b.f110412d.getF102978f();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f110424d) {
            x.h();
            return;
        }
        Object obj = this.f110423c;
        d<K, V> dVar = this.f110422b;
        y0.c(dVar).remove(obj);
        this.f110423c = null;
        this.f110424d = false;
        this.f110425e = dVar.f110412d.f102977e;
        this.f110426f--;
    }
}
