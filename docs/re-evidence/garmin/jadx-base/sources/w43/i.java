package w43;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f182009a = new i();

    public static final class a implements Iterator, f23.a {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // w43.c
    public final int a() {
        return 0;
    }

    @Override // w43.c
    public final void b(int i14, Object obj) {
        throw new IllegalStateException();
    }

    @Override // w43.c
    public final /* bridge */ /* synthetic */ Object get(int i14) {
        return null;
    }

    @Override // w43.c, java.lang.Iterable
    public final Iterator iterator() {
        return new a();
    }
}
