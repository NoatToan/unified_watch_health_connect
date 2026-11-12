package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp1/s0;", "E", "Lp1/e1;", "", "Lp1/r0;", "parent", "<init>", "(Lp1/r0;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s0<E> extends e1<E> implements Set<E>, f23.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0<E> f134823b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010)\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p1/s0$a", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<E>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134824a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c53.k f134825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s0<E> f134826c;

        /* JADX INFO: renamed from: p1.s0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {1, 9, 0})
        @v13.e(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
        public static final class C2558a extends v13.h implements e23.p<c53.l<? super E>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f134827a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public s0 f134828b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long[] f134829c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f134830d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f134831e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f134832f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ s0<E> f134833g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ a f134834h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2558a(s0<E> s0Var, a aVar, t13.d<? super C2558a> dVar) {
                super(2, dVar);
                this.f134833g = s0Var;
                this.f134834h = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2558a c2558a = new C2558a(this.f134833g, this.f134834h, dVar);
                c2558a.f134832f = obj;
                return c2558a;
            }

            @Override // e23.p
            public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
                return ((C2558a) create((c53.l) obj, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                s0<E> s0Var;
                long[] jArr;
                int i14;
                a aVar;
                c53.l lVar;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f134831e;
                if (i15 == 0) {
                    o13.r.b(obj);
                    c53.l lVar2 = (c53.l) this.f134832f;
                    s0Var = this.f134833g;
                    r0<E> r0Var = s0Var.f134823b;
                    jArr = r0Var.f134685c;
                    i14 = r0Var.f134687e;
                    aVar = this.f134834h;
                    lVar = lVar2;
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i16 = this.f134830d;
                    long[] jArr2 = this.f134829c;
                    s0<E> s0Var2 = this.f134828b;
                    aVar = this.f134827a;
                    lVar = (c53.l) this.f134832f;
                    o13.r.b(obj);
                    i14 = i16;
                    s0Var = s0Var2;
                    jArr = jArr2;
                }
                while (i14 != Integer.MAX_VALUE) {
                    int i17 = (int) ((jArr[i14] >> 31) & 2147483647L);
                    aVar.f134824a = i14;
                    Object obj2 = s0Var.f134823b.f134684b[i14];
                    this.f134832f = lVar;
                    this.f134827a = aVar;
                    this.f134828b = s0Var;
                    this.f134829c = jArr;
                    this.f134830d = i17;
                    this.f134831e = 1;
                    if (lVar.a(obj2, this) == aVar2) {
                        return aVar2;
                    }
                    i14 = i17;
                }
                return Unit.INSTANCE;
            }
        }

        public a(s0<E> s0Var) {
            this.f134826c = s0Var;
            this.f134825b = c53.n.a(new C2558a(s0Var, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f134825b.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.f134825b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i14 = this.f134824a;
            if (i14 != -1) {
                this.f134826c.f134823b.h(i14);
                this.f134824a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r0<E> r0Var) {
        super(r0Var);
        r0Var.getClass();
        this.f134823b = r0Var;
    }

    @Override // p1.e1, java.util.Set, java.util.Collection
    public final boolean add(E e4) {
        return this.f134823b.b(e4);
    }

    @Override // p1.e1, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        r0<E> r0Var = this.f134823b;
        r0Var.getClass();
        int i14 = r0Var.f134689g;
        for (Object obj : collection) {
            int iD = r0Var.d((E) obj);
            r0Var.f134684b[iD] = obj;
            long[] jArr = r0Var.f134685c;
            int i15 = r0Var.f134686d;
            jArr[iD] = (((long) i15) & 2147483647L) | 4611686016279904256L;
            if (i15 != Integer.MAX_VALUE) {
                jArr[i15] = ((((long) iD) & 2147483647L) << 31) | (jArr[i15] & (-4611686016279904257L));
            }
            r0Var.f134686d = iD;
            if (r0Var.f134687e == Integer.MAX_VALUE) {
                r0Var.f134687e = iD;
            }
        }
        return i14 != r0Var.f134689g;
    }

    @Override // p1.e1, java.util.Set, java.util.Collection
    public final void clear() {
        this.f134823b.c();
    }

    @Override // p1.e1, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // p1.e1, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f134823b.g(obj);
    }

    @Override // p1.e1, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        r0<E> r0Var = this.f134823b;
        r0Var.getClass();
        int i14 = r0Var.f134689g;
        Iterator<T> it = collection.iterator();
        while (true) {
            int i15 = 1;
            int i16 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i17 = iHashCode ^ (iHashCode << 16);
            int i18 = i17 & 127;
            int i19 = r0Var.f134688f;
            int i24 = (i17 >>> 7) & i19;
            while (true) {
                long[] jArr = r0Var.f134683a;
                int i25 = i24 >> 3;
                int i26 = (i24 & 7) << 3;
                int i27 = i15;
                int i28 = i16;
                long j8 = (((-i26) >> 63) & (jArr[i25 + i15] << (64 - i26))) | (jArr[i25] >>> i26);
                long j14 = (((long) i18) * 72340172838076673L) ^ j8;
                long j15 = -9187201950435737472L;
                long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
                while (j16 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i24) & i19;
                    long j17 = j15;
                    if (p005kotlin.jvm.internal.s.g(r0Var.f134684b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j16 &= j16 - 1;
                    j15 = j17;
                }
                if ((j8 & ((~j8) << 6) & j15) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i16 = i28 + 8;
                i24 = (i24 + i16) & i19;
                i15 = i27;
            }
            if (iNumberOfTrailingZeros >= 0) {
                r0Var.h(iNumberOfTrailingZeros);
            }
        }
        return i14 != r0Var.f134689g;
    }

    @Override // p1.e1, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.f134823b.i(collection);
    }
}
