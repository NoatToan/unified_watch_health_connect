package w43;

import java.util.Iterator;
import p43.k1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, V> implements Iterable<V>, f23.a {

    /* JADX INFO: renamed from: w43.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC3389a<K, V, T extends V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f181987a;

        public AbstractC3389a(int i14) {
            this.f181987a = i14;
        }
    }

    public abstract c<V> a();

    public abstract k1.a b();

    public final boolean isEmpty() {
        return ((e) this).f181997a.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return a().iterator();
    }
}
