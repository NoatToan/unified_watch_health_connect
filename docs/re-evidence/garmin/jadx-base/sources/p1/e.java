package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp1/e;", "K", "V", "", "", "Lp1/f1;", "parent", "<init>", "(Lp1/f1;)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1<K, V> f134695a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Lc53/l;", "", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
    public static final class a extends v13.h implements e23.p<c53.l<? super Map.Entry<? extends K, ? extends V>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f134696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long[] f134697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f134698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f134699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f134700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f134701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f134702g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f134703h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f134704i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f134705j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<K, V> eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f134705j = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f134705j, dVar);
            aVar.f134704i = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((a) create((c53.l) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004e  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:14:0x0060). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:20:0x0098). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0095 -> B:21:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a8 -> B:26:0x00a9). Please report as a decompilation issue!!! */
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
                int r2 = r0.f134703h
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 != r5) goto L24
                int r2 = r0.f134701f
                int r6 = r0.f134700e
                long r7 = r0.f134702g
                int r9 = r0.f134699d
                int r10 = r0.f134698c
                long[] r11 = r0.f134697b
                p1.e r12 = r0.f134696a
                java.lang.Object r13 = r0.f134704i
                c53.l r13 = (c53.l) r13
                o13.r.b(r21)
                goto L98
            L24:
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r1)
                r1 = 0
                return r1
            L2b:
                o13.r.b(r21)
                java.lang.Object r2 = r0.f134704i
                c53.l r2 = (c53.l) r2
                p1.e<K, V> r6 = r0.f134705j
                p1.f1<K, V> r7 = r6.f134695a
                long[] r7 = r7.f134720a
                int r8 = r7.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Laf
                r9 = 0
            L3e:
                r10 = r7[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto La8
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r12
                r12 = r6
                r6 = r13
                r13 = r2
                r2 = 0
                r18 = r10
                r11 = r7
                r10 = r8
                r7 = r18
            L60:
                if (r2 >= r6) goto La0
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L98
                int r14 = r9 << 3
                int r14 = r14 + r2
                p1.d0 r15 = new p1.d0
                p1.f1<K, V> r3 = r12.f134695a
                r17 = r4
                java.lang.Object[] r4 = r3.f134721b
                r4 = r4[r14]
                java.lang.Object[] r3 = r3.f134722c
                r3 = r3[r14]
                r15.<init>(r4, r3)
                r0.f134704i = r13
                r0.f134696a = r12
                r0.f134697b = r11
                r0.f134698c = r10
                r0.f134699d = r9
                r0.f134702g = r7
                r0.f134700e = r6
                r0.f134701f = r2
                r0.f134703h = r5
                u13.a r3 = r13.a(r15, r0)
                if (r3 != r1) goto L9a
                return r1
            L98:
                r17 = r4
            L9a:
                long r7 = r7 >> r17
                int r2 = r2 + r5
                r4 = r17
                goto L60
            La0:
                r3 = r4
                if (r6 != r3) goto Laf
                r8 = r10
                r7 = r11
                r6 = r12
                r2 = r13
                goto La9
            La8:
                r3 = r4
            La9:
                if (r9 == r8) goto Laf
                int r9 = r9 + 1
                r4 = r3
                goto L3e
            Laf:
                kotlin.Unit r1 = p005kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(f1<K, V> f1Var) {
        f1Var.getClass();
        this.f134695a = f1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return p005kotlin.jvm.internal.s.g(this.f134695a.d((K) entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!p005kotlin.jvm.internal.s.g(this.f134695a.d((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f134695a.e();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return c53.n.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f134695a.f134724e;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) p005kotlin.jvm.internal.i.d(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return p005kotlin.jvm.internal.i.c(this);
    }
}
