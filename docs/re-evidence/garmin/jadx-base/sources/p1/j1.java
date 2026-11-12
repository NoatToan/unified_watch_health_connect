package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/j1;", "E", "", "Lp1/h1;", "parent", "<init>", "(Lp1/h1;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class j1<E> implements Set<E>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1<E> f134746a;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "androidx.collection.SetWrapper$iterator$1", f = "ScatterSet.kt", l = {1153}, m = "invokeSuspend")
    public static final class a extends v13.h implements e23.p<c53.l<? super E>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f134747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long[] f134748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f134749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f134750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f134751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f134752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f134753g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f134754h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f134755i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ j1<E> f134756j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1<E> j1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f134756j = j1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f134756j, dVar);
            aVar.f134755i = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((a) create((c53.l) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0050  */
        /* JADX WARN: Code duplicated, block: B:21:0x008d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x008f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004e -> B:23:0x0093). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:14:0x0061). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:20:0x008a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0087 -> B:20:0x008a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                u13.a r1 = u13.a.COROUTINE_SUSPENDED
                int r2 = r0.f134754h
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 != r5) goto L24
                int r2 = r0.f134752f
                int r6 = r0.f134751e
                long r7 = r0.f134753g
                int r9 = r0.f134750d
                int r10 = r0.f134749c
                long[] r11 = r0.f134748b
                java.lang.Object[] r12 = r0.f134747a
                java.lang.Object r13 = r0.f134755i
                c53.l r13 = (c53.l) r13
                o13.r.b(r21)
                goto L8a
            L24:
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r1)
                r1 = 0
                return r1
            L2b:
                o13.r.b(r21)
                java.lang.Object r2 = r0.f134755i
                c53.l r2 = (c53.l) r2
                p1.j1<E> r6 = r0.f134756j
                p1.h1<E> r6 = r6.f134746a
                java.lang.Object[] r7 = r6.f134733b
                long[] r6 = r6.f134732a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto L98
                r9 = r3
            L40:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L93
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L61:
                if (r2 >= r6) goto L8d
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L8a
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f134755i = r13
                r0.f134747a = r12
                r0.f134748b = r11
                r0.f134749c = r10
                r0.f134750d = r9
                r0.f134753g = r7
                r0.f134751e = r6
                r0.f134752f = r2
                r0.f134754h = r5
                u13.a r14 = r13.a(r14, r0)
                if (r14 != r1) goto L8a
                return r1
            L8a:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L61
            L8d:
                if (r6 != r4) goto L98
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L93:
                if (r9 == r8) goto L98
                int r9 = r9 + 1
                goto L40
            L98:
                kotlin.Unit r1 = p005kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.j1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j1(h1<E> h1Var) {
        h1Var.getClass();
        this.f134746a = h1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f134746a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f134746a.a((E) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f134746a.equals(((j1) obj).f134746a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f134746a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f134746a.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return c53.n.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f134746a.f134735d;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    public final String toString() {
        return this.f134746a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
