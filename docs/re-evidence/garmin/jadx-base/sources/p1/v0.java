package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp1/v0;", "E", "Lp1/j1;", "", "Lp1/u0;", "parent", "<init>", "(Lp1/u0;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v0<E> extends j1<E> implements Set<E>, f23.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0<E> f134845b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010)\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p1/v0$a", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<E>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134846a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c53.k f134847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v0<E> f134848c;

        /* JADX INFO: renamed from: p1.v0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {1, 9, 0})
        @v13.e(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
        public static final class C2559a extends v13.h implements e23.p<c53.l<? super E>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f134849a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public v0 f134850b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long[] f134851c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f134852d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f134853e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f134854f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f134855g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public long f134856h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f134857i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f134858j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ v0<E> f134859k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a f134860l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2559a(v0<E> v0Var, a aVar, t13.d<? super C2559a> dVar) {
                super(2, dVar);
                this.f134859k = v0Var;
                this.f134860l = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C2559a c2559a = new C2559a(this.f134859k, this.f134860l, dVar);
                c2559a.f134858j = obj;
                return c2559a;
            }

            @Override // e23.p
            public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
                return ((C2559a) create((c53.l) obj, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0052  */
            /* JADX WARN: Code duplicated, block: B:21:0x0099 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:22:0x009b  */
            /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:23:0x00a1). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x0096). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    r21 = this;
                    r0 = r21
                    u13.a r1 = u13.a.COROUTINE_SUSPENDED
                    int r2 = r0.f134857i
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L2d
                    if (r2 != r5) goto L26
                    int r2 = r0.f134855g
                    int r6 = r0.f134854f
                    long r7 = r0.f134856h
                    int r9 = r0.f134853e
                    int r10 = r0.f134852d
                    long[] r11 = r0.f134851c
                    p1.v0 r12 = r0.f134850b
                    p1.v0$a r13 = r0.f134849a
                    java.lang.Object r14 = r0.f134858j
                    c53.l r14 = (c53.l) r14
                    o13.r.b(r22)
                    goto L96
                L26:
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r1)
                    r1 = 0
                    return r1
                L2d:
                    o13.r.b(r22)
                    java.lang.Object r2 = r0.f134858j
                    c53.l r2 = (c53.l) r2
                    p1.v0<E> r6 = r0.f134859k
                    p1.u0<E> r7 = r6.f134845b
                    long[] r7 = r7.f134732a
                    int r8 = r7.length
                    int r8 = r8 + (-2)
                    if (r8 < 0) goto La6
                    p1.v0$a r9 = r0.f134860l
                    r10 = 0
                L42:
                    r11 = r7[r10]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto La1
                    int r13 = r10 - r8
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r2
                    r2 = 0
                    r19 = r11
                    r12 = r6
                    r11 = r7
                    r6 = r13
                    r13 = r9
                    r9 = r10
                    r10 = r8
                    r7 = r19
                L65:
                    if (r2 >= r6) goto L99
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.3E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto L96
                    int r15 = r9 << 3
                    int r15 = r15 + r2
                    r13.f134846a = r15
                    p1.u0<E> r3 = r12.f134845b
                    java.lang.Object[] r3 = r3.f134733b
                    r3 = r3[r15]
                    r0.f134858j = r14
                    r0.f134849a = r13
                    r0.f134850b = r12
                    r0.f134851c = r11
                    r0.f134852d = r10
                    r0.f134853e = r9
                    r0.f134856h = r7
                    r0.f134854f = r6
                    r0.f134855g = r2
                    r0.f134857i = r5
                    u13.a r3 = r14.a(r3, r0)
                    if (r3 != r1) goto L96
                    return r1
                L96:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L65
                L99:
                    if (r6 != r4) goto La6
                    r8 = r10
                    r7 = r11
                    r6 = r12
                    r2 = r14
                    r10 = r9
                    r9 = r13
                La1:
                    if (r10 == r8) goto La6
                    int r10 = r10 + 1
                    goto L42
                La6:
                    kotlin.Unit r1 = p005kotlin.Unit.INSTANCE
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p1.v0.a.C2559a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(v0<E> v0Var) {
            this.f134848c = v0Var;
            this.f134847b = c53.n.a(new C2559a(v0Var, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f134847b.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.f134847b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i14 = this.f134846a;
            if (i14 != -1) {
                this.f134848c.f134845b.m(i14);
                this.f134846a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u0<E> u0Var) {
        super(u0Var);
        u0Var.getClass();
        this.f134845b = u0Var;
    }

    @Override // p1.j1, java.util.Set, java.util.Collection
    public final boolean add(E e4) {
        return this.f134845b.d(e4);
    }

    @Override // p1.j1, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        u0<E> u0Var = this.f134845b;
        u0Var.getClass();
        int i14 = u0Var.f134735d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            u0Var.j((E) it.next());
        }
        return i14 != u0Var.f134735d;
    }

    @Override // p1.j1, java.util.Set, java.util.Collection
    public final void clear() {
        this.f134845b.e();
    }

    @Override // p1.j1, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // p1.j1, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f134845b.l(obj);
    }

    @Override // p1.j1, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        u0<E> u0Var = this.f134845b;
        u0Var.getClass();
        int i14 = u0Var.f134735d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            u0Var.i((E) it.next());
        }
        return i14 != u0Var.f134735d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:5:0x0017->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[EDGE_INSN: B:24:0x0059->B:18:0x0059 BREAK  A[LOOP:0: B:5:0x0017->B:17:0x0056], SYNTHETIC] */
    @Override // p1.j1, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        u0<E> u0Var = this.f134845b;
        u0Var.getClass();
        Object[] objArr = u0Var.f134733b;
        int i14 = u0Var.f134735d;
        long[] jArr = u0Var.f134732a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j8 = jArr[i15];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j8) < 128) {
                            int i18 = (i15 << 3) + i17;
                            if (!p13.h0.R(collection, objArr[i18])) {
                                u0Var.m(i18);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    if (i15 != length) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return i14 != u0Var.f134735d;
    }
}
