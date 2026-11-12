package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp1/o1;", "K", "V", "", "Lp1/f1;", "parent", "<init>", "(Lp1/f1;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o1<K, V> implements Collection<V>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1<K, V> f134782a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "androidx.collection.Values$iterator$1", f = "ScatterMap.kt", l = {1446}, m = "invokeSuspend")
    public static final class a extends v13.h implements e23.p<c53.l<? super V>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f134783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long[] f134784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f134785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f134786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f134787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f134788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f134789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f134790h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f134791i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ o1<K, V> f134792j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o1<K, V> o1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f134792j = o1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f134792j, dVar);
            aVar.f134791i = obj;
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
                int r2 = r0.f134790h
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 != r5) goto L24
                int r2 = r0.f134788f
                int r6 = r0.f134787e
                long r7 = r0.f134789g
                int r9 = r0.f134786d
                int r10 = r0.f134785c
                long[] r11 = r0.f134784b
                java.lang.Object[] r12 = r0.f134783a
                java.lang.Object r13 = r0.f134791i
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
                java.lang.Object r2 = r0.f134791i
                c53.l r2 = (c53.l) r2
                p1.o1<K, V> r6 = r0.f134792j
                p1.f1<K, V> r6 = r6.f134782a
                java.lang.Object[] r7 = r6.f134722c
                long[] r6 = r6.f134720a
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
                r0.f134791i = r13
                r0.f134783a = r12
                r0.f134784b = r11
                r0.f134785c = r10
                r0.f134786d = r9
                r0.f134789g = r7
                r0.f134787e = r6
                r0.f134788f = r2
                r0.f134790h = r5
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
            throw new UnsupportedOperationException("Method not decompiled: p1.o1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o1(f1<K, V> f1Var) {
        f1Var.getClass();
        this.f134782a = f1Var;
    }

    @Override // java.util.Collection
    public final boolean add(V v14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f134782a.c(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f134782a.c((V) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f134782a.e();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return c53.n.a(new a(this, null));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super V> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f134782a.f134724e;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
