package w43;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f182018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f182019b;

    public static final class a implements Iterator<T>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f182020a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o<T> f182021b;

        public a(o<T> oVar) {
            this.f182021b = oVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f182020a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f182020a) {
                this.f182020a = false;
                return this.f182021b.f182018a;
            }
            c22.t.g();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(T t7, int i14) {
        super(null);
        t7.getClass();
        this.f182018a = t7;
        this.f182019b = i14;
    }

    @Override // w43.c
    public final int a() {
        return 1;
    }

    @Override // w43.c
    public final void b(int i14, T t7) {
        throw new IllegalStateException();
    }

    @Override // w43.c
    public final T get(int i14) {
        if (i14 == this.f182019b) {
            return this.f182018a;
        }
        return null;
    }

    @Override // w43.c, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
