package q3;

import c53.l;
import c53.n;
import e23.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.i;
import p1.h1;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq3/e;", "T", "", "Lp1/h1;", "set", "<init>", "(Lp1/h1;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<T> implements Set<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1<T> f142365a;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", l = {31}, m = "invokeSuspend", v = 1)
    public static final class a extends h implements p<l<? super T>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f142366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long[] f142367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f142368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f142369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f142370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f142371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f142372g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f142373h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f142374i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e<T> f142375j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<T> eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f142375j = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f142375j, dVar);
            aVar.f142374i = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((a) create((l) obj, dVar)).invokeSuspend(Unit.INSTANCE);
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
                int r2 = r0.f142373h
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 != r5) goto L24
                int r2 = r0.f142371f
                int r6 = r0.f142370e
                long r7 = r0.f142372g
                int r9 = r0.f142369d
                int r10 = r0.f142368c
                long[] r11 = r0.f142367b
                java.lang.Object[] r12 = r0.f142366a
                java.lang.Object r13 = r0.f142374i
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
                java.lang.Object r2 = r0.f142374i
                c53.l r2 = (c53.l) r2
                q3.e<T> r6 = r0.f142375j
                p1.h1<T> r6 = r6.f142365a
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
                r0.f142374i = r13
                r0.f142366a = r12
                r0.f142367b = r11
                r0.f142368c = r10
                r0.f142369d = r9
                r0.f142372g = r7
                r0.f142370e = r6
                r0.f142371f = r2
                r0.f142373h = r5
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
            throw new UnsupportedOperationException("Method not decompiled: q3.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(h1<T> h1Var) {
        this.f142365a = h1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f142365a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f142365a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f142365a.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return n.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f142365a.f134735d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return i.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) i.d(this, tArr);
    }
}
