package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iz9<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Optional<Iterable<E>> f22248a;

    public class a extends iz9<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f22249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f22249b = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f22249b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends iz9<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable[] f22250b;

        public class a extends x00<Iterator<? extends T>> {
            public a(int i) {
                super(i);
            }

            @Override // defpackage.x00
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> a(int i) {
                return b.this.f22250b[i].iterator();
            }
        }

        public b(Iterable[] iterableArr) {
            this.f22250b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return epd.e(new a(this.f22250b.length));
        }
    }

    public iz9() {
        this.f22248a = Optional.absent();
    }

    public static <T> iz9<T> e(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return f(iterable, iterable2);
    }

    public static <T> iz9<T> f(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            c6i.o(iterable);
        }
        return new b(iterableArr);
    }

    public static <E> iz9<E> h(Iterable<E> iterable) {
        return iterable instanceof iz9 ? (iz9) iterable : new a(iterable, iterable);
    }

    public final iz9<E> g(h6i<? super E> h6iVar) {
        return h(cpd.d(i(), h6iVar));
    }

    public final Iterable<E> i() {
        return this.f22248a.or(this);
    }

    public final ImmutableSet<E> j() {
        return ImmutableSet.copyOf(i());
    }

    public String toString() {
        return cpd.m(i());
    }

    public iz9(Iterable<E> iterable) {
        this.f22248a = Optional.of(iterable);
    }
}
