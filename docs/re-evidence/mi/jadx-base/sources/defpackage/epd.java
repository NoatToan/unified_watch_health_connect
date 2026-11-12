package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class epd {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends uaq<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f16923a;

        public a(Iterator it) {
            this.f16923a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16923a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return (T) this.f16923a.next();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> extends b10<T> {
        public final /* synthetic */ Iterator c;
        public final /* synthetic */ h6i d;

        public b(Iterator it, h6i h6iVar) {
            this.c = it;
            this.d = h6iVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.b10
        public T a() {
            while (this.c.hasNext()) {
                T t = (T) this.c.next();
                if (this.d.apply(t)) {
                    return t;
                }
            }
            return b();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    public class c<F, T> extends pyp<F, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dua f16924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Iterator it, dua duaVar) {
            super(it);
            this.f16924b = duaVar;
        }

        @Override // defpackage.pyp
        public T a(F f) {
            return (T) this.f16924b.apply(f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class d<T> extends uaq<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f16926b;

        public d(Object obj) {
            this.f16926b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f16925a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f16925a) {
                throw new NoSuchElementException();
            }
            this.f16925a = true;
            return (T) this.f16926b;
        }
    }

    public static final class e<T> extends x00<T> {
        public static final zaq<Object> e = new e(new Object[0], 0, 0, 0);
        public final T[] c;
        public final int d;

        public e(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.c = tArr;
            this.d = i;
        }

        @Override // defpackage.x00
        public T a(int i) {
            return this.c[this.d + i];
        }
    }

    public static class f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<? extends T> f16927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<? extends T> f16928b = epd.h();
        public Iterator<? extends Iterator<? extends T>> c;
        public Deque<Iterator<? extends Iterator<? extends T>>> d;

        public f(Iterator<? extends Iterator<? extends T>> it) {
            this.c = (Iterator) c6i.o(it);
        }

        public final Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.c;
                if (it != null && it.hasNext()) {
                    return this.c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.c = this.d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) c6i.o(this.f16928b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itA = a();
                this.c = itA;
                if (itA == null) {
                    return false;
                }
                Iterator<? extends T> next = itA.next();
                this.f16928b = next;
                if (next instanceof f) {
                    f fVar = (f) next;
                    this.f16928b = fVar.f16928b;
                    if (this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.c);
                    if (fVar.d != null) {
                        while (!fVar.d.isEmpty()) {
                            this.d.addFirst(fVar.d.removeLast());
                        }
                    }
                    this.c = fVar.c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f16928b;
            this.f16927a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f16927a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f16927a = null;
        }
    }

    public enum g implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            d44.e(false);
        }
    }

    public static class h<T> extends uaq<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<dqh<T>> f16931a;

        public h(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.f16931a = new PriorityQueue(2, new Comparator() { // from class: fpd
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return epd.h.b(comparator, (dqh) obj, (dqh) obj2);
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f16931a.add(epd.p(it));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int b(Comparator comparator, dqh dqhVar, dqh dqhVar2) {
            return comparator.compare(dqhVar.peek(), dqhVar2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f16931a.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            dqh<T> dqhVarRemove = this.f16931a.remove();
            T next = dqhVarRemove.next();
            if (dqhVarRemove.hasNext()) {
                this.f16931a.add(dqhVarRemove);
            }
            return next;
        }
    }

    public static class i<E> implements dqh<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<? extends E> f16932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16933b;
        public E c;

        public i(Iterator<? extends E> it) {
            this.f16932a = (Iterator) c6i.o(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16933b || this.f16932a.hasNext();
        }

        @Override // defpackage.dqh, java.util.Iterator
        public E next() {
            if (!this.f16933b) {
                return this.f16932a.next();
            }
            E e = (E) d2h.a(this.c);
            this.f16933b = false;
            this.c = null;
            return e;
        }

        @Override // defpackage.dqh
        public E peek() {
            if (!this.f16933b) {
                this.c = this.f16932a.next();
                this.f16933b = true;
            }
            return (E) d2h.a(this.c);
        }

        @Override // java.util.Iterator
        public void remove() {
            c6i.u(!this.f16933b, "Can't remove after you've peeked at next");
            this.f16932a.remove();
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        c6i.o(collection);
        c6i.o(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int b(Iterator<?> it, int i2) {
        c6i.o(it);
        int i3 = 0;
        c6i.e(i2 >= 0, "numberToAdvance must be nonnegative");
        while (i3 < i2 && it.hasNext()) {
            it.next();
            i3++;
        }
        return i3;
    }

    public static <T> ListIterator<T> c(Iterator<T> it) {
        return (ListIterator) it;
    }

    public static void d(Iterator<?> it) {
        c6i.o(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> e(Iterator<? extends Iterator<? extends T>> it) {
        return new f(it);
    }

    public static boolean f(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !j4h.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> uaq<T> h() {
        return i();
    }

    public static <T> zaq<T> i() {
        return (zaq<T>) e.e;
    }

    public static <T> Iterator<T> j() {
        return g.INSTANCE;
    }

    public static <T> uaq<T> k(Iterator<T> it, h6i<? super T> h6iVar) {
        c6i.o(it);
        c6i.o(h6iVar);
        return new b(it, h6iVar);
    }

    public static <T> T l(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T m(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T n(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i2 = 0; i2 < 4 && it.hasNext(); i2++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append(Typography.greater);
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> uaq<T> o(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        c6i.p(iterable, "iterators");
        c6i.p(comparator, "comparator");
        return new h(iterable, comparator);
    }

    public static <T> dqh<T> p(Iterator<? extends T> it) {
        return it instanceof i ? (i) it : new i(it);
    }

    public static <T> T q(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean r(Iterator<?> it, Collection<?> collection) {
        c6i.o(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean s(Iterator<?> it, Collection<?> collection) {
        c6i.o(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> uaq<T> t(T t) {
        return new d(t);
    }

    public static int u(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return ahd.j(j);
    }

    public static String v(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static <F, T> Iterator<T> w(Iterator<F> it, dua<? super F, ? extends T> duaVar) {
        c6i.o(duaVar);
        return new c(it, duaVar);
    }

    public static <T> uaq<T> x(Iterator<? extends T> it) {
        c6i.o(it);
        return it instanceof uaq ? (uaq) it : new a(it);
    }
}
