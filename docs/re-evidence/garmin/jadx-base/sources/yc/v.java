package yc;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0005:\u0001\u0016Bi\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lyc/v;", "", "K", "V", "Lyc/m2;", "Lyc/s0$b;", "Lyc/h3;", "pagingSource", "Lo53/b0;", "coroutineScope", "Lo53/z;", "notifyDispatcher", "backgroundDispatcher", "Lyc/m2$a;", "boundaryCallback", "Lyc/m2$d;", "config", "Lyc/h3$b$c;", "initialPage", "initialLastKey", "<init>", "(Lyc/h3;Lo53/b0;Lo53/z;Lo53/z;Lyc/m2$a;Lyc/m2$d;Lyc/h3$b$c;Ljava/lang/Object;)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class v<K, V> extends m2<V> implements s0.b<V> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f196516x = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h3<K, V> f196517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m2.a<V> f196518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final K f196519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f196520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f196521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f196522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f196523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f196524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f196525r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f196526t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f196527v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s0<K, V> f196528w;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", f = "ContiguousPagedList.jvm.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v<K, V> f196529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f196530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f196531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v<K, V> vVar, boolean z14, boolean z15, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f196529a = vVar;
            this.f196530b = z14;
            this.f196531c = z15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f196529a, this.f196530b, this.f196531c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = v.f196516x;
            this.f196529a.p(this.f196530b, this.f196531c);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public v(h3<K, V> h3Var, o53.b0 b0Var, o53.z zVar, o53.z zVar2, m2.a<V> aVar, m2.d dVar, h3.b.c<K, V> cVar, K k14) {
        h3.b.c<K, V> cVar2;
        super(h3Var, b0Var, zVar, new s2(), dVar);
        h3Var.getClass();
        b0Var.getClass();
        zVar.getClass();
        zVar2.getClass();
        dVar.getClass();
        cVar.getClass();
        int i14 = cVar.f196019d;
        this.f196517j = h3Var;
        this.f196518k = aVar;
        this.f196519l = k14;
        this.f196524q = Integer.MAX_VALUE;
        this.f196525r = Integer.MIN_VALUE;
        boolean z14 = true;
        this.f196527v = dVar.f196232e != Integer.MAX_VALUE;
        s0.a aVar2 = this.f196223d;
        aVar2.getClass();
        this.f196528w = new s0<>(b0Var, dVar, h3Var, zVar, zVar2, this, aVar2);
        boolean z15 = dVar.f196230c;
        s2<T> s2Var = this.f196223d;
        if (z15) {
            int i15 = i14 != Integer.MIN_VALUE ? i14 : 0;
            int i16 = cVar.f196020e;
            s2Var.f(i15, cVar, i16 != Integer.MIN_VALUE ? i16 : 0, 0, (i14 == Integer.MIN_VALUE || i16 == Integer.MIN_VALUE) ? false : true);
            n(0, s2Var.getSize());
            s2<T> s2Var2 = this.f196223d;
            if (s2Var2.f196448b <= 0 && s2Var2.f196449c <= 0) {
                z14 = false;
            }
            this.f196526t = z14;
            cVar2 = cVar;
        } else {
            s2Var.f(0, cVar, 0, i14 == Integer.MIN_VALUE ? 0 : i14, false);
            cVar2 = cVar;
            n(0, s2Var.getSize());
            s2<T> s2Var3 = this.f196223d;
            if (s2Var3.f196448b <= 0 && s2Var3.f196449c <= 0) {
                z14 = false;
            }
            this.f196526t = z14;
        }
        r(c1.REFRESH, cVar2.f196016a);
    }

    @Override // yc.s0.b
    public final void a(c1 c1Var, z0 z0Var) {
        c1Var.getClass();
        z0Var.getClass();
        ge1.b.T(this.f196221b, this.f196222c, null, new o2(this, c1Var, z0Var, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yc.s0.b
    public final boolean b(c1 c1Var, h3.b.c<?, V> cVar) {
        boolean z14;
        boolean z15;
        c1Var.getClass();
        cVar.getClass();
        List<V> list = cVar.f196016a;
        s2<T> s2Var = this.f196223d;
        int i14 = s2Var.f196448b;
        ArrayList arrayList = s2Var.f196447a;
        int i15 = 0;
        boolean z16 = s2Var.f196453g + i14 > (s2Var.f196452f / 2) + i14;
        boolean z17 = this.f196527v;
        int i16 = this.f196225f;
        m2.d dVar = this.f196224e;
        if (z17) {
            if (s2Var.f196452f + list.size() <= dVar.f196232e || arrayList.size() <= 1 || s2Var.f196452f < i16) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        if (c1Var == c1.APPEND) {
            if (!z14 || z16) {
                int size = list.size();
                if (size != 0) {
                    arrayList.add(cVar);
                    s2Var.f196452f += size;
                    int iMin = Math.min(s2Var.f196449c, size);
                    int i17 = size - iMin;
                    if (iMin != 0) {
                        s2Var.f196449c -= iMin;
                    }
                    int i18 = (s2Var.f196448b + s2Var.f196452f) - size;
                    m(i18, iMin);
                    n(i18 + iMin, i17);
                }
                int size2 = this.f196521n - list.size();
                this.f196521n = size2;
                if (size2 > 0 && !list.isEmpty()) {
                    z15 = true;
                }
            } else {
                this.f196521n = 0;
            }
            z15 = false;
        } else {
            if (c1Var != c1.PREPEND) {
                com.google.firebase.messaging.l.j(c1Var, "unexpected result type ");
                return false;
            }
            if (z14 && z16) {
                this.f196520m = 0;
            } else {
                int size3 = list.size();
                if (size3 != 0) {
                    arrayList.add(0, cVar);
                    s2Var.f196452f += size3;
                    int iMin2 = Math.min(s2Var.f196448b, size3);
                    int i19 = size3 - iMin2;
                    if (iMin2 != 0) {
                        s2Var.f196448b -= iMin2;
                    }
                    s2Var.f196450d -= i19;
                    m(s2Var.f196448b, iMin2);
                    n(0, i19);
                    this.f196524q += i19;
                    this.f196525r += i19;
                }
                int size4 = this.f196520m - list.size();
                this.f196520m = size4;
                if (size4 > 0 && !list.isEmpty()) {
                    z15 = true;
                }
            }
            z15 = false;
        }
        if (z17) {
            s0<K, V> s0Var = this.f196528w;
            if (z16) {
                if (!(s0Var.f196400i.f196237b instanceof z0.b)) {
                    int i24 = dVar.f196232e;
                    int i25 = 0;
                    while (s2Var.g(i24, i16, 0)) {
                        int size5 = ((h3.b.c) arrayList.remove(0)).f196016a.size();
                        i25 += size5;
                        s2Var.f196452f -= size5;
                    }
                    int i26 = s2Var.f196453g - i25;
                    s2Var.f196453g = i26 >= 0 ? i26 : 0;
                    if (i25 > 0) {
                        if (this.f196526t) {
                            int i27 = s2Var.f196448b;
                            s2Var.f196448b = i27 + i25;
                            m(i27, i25);
                        } else {
                            s2Var.f196450d += i25;
                            q(s2Var.f196448b, i25);
                        }
                    }
                    if (i25 > 0) {
                        s0.d dVar2 = s0Var.f196400i;
                        c1 c1Var2 = c1.PREPEND;
                        z0.c.f196665b.getClass();
                        dVar2.b(c1Var2, z0.c.f196667d);
                    }
                }
            } else if (!(s0Var.f196400i.f196238c instanceof z0.b)) {
                int i28 = dVar.f196232e;
                while (s2Var.g(i28, i16, arrayList.size() - 1)) {
                    int size6 = ((h3.b.c) arrayList.remove(arrayList.size() - 1)).f196016a.size();
                    i15 += size6;
                    s2Var.f196452f -= size6;
                }
                int i29 = s2Var.f196453g;
                int i30 = s2Var.f196452f;
                int i34 = i30 - 1;
                if (i29 > i34) {
                    i29 = i34;
                }
                s2Var.f196453g = i29;
                if (i15 > 0) {
                    int i35 = s2Var.f196448b + i30;
                    if (this.f196526t) {
                        s2Var.f196449c += i15;
                        m(i35, i15);
                    } else {
                        q(i35, i15);
                    }
                }
                if (i15 > 0) {
                    s0.d dVar3 = s0Var.f196400i;
                    c1 c1Var3 = c1.APPEND;
                    z0.c.f196665b.getClass();
                    dVar3.b(c1Var3, z0.c.f196667d);
                }
            }
        }
        r(c1Var, list);
        return z15;
    }

    @Override // yc.m2
    public final void d(e23.p<? super c1, ? super z0, Unit> pVar) {
        pVar.getClass();
        s0.d dVar = this.f196528w.f196400i;
        dVar.getClass();
        pVar.invoke(c1.REFRESH, dVar.f196236a);
        pVar.invoke(c1.PREPEND, dVar.f196237b);
        pVar.invoke(c1.APPEND, dVar.f196238c);
    }

    @Override // yc.m2
    public final K f() {
        i3<K, V> i3Var;
        K kC;
        s2<T> s2Var = this.f196223d;
        s2Var.getClass();
        m2.d dVar = this.f196224e;
        dVar.getClass();
        ArrayList arrayList = s2Var.f196447a;
        if (arrayList.isEmpty()) {
            i3Var = null;
        } else {
            List listB1 = p13.h0.b1(arrayList);
            listB1.getClass();
            i3Var = new i3<>(listB1, Integer.valueOf(s2Var.f196448b + s2Var.f196453g), new u2(dVar.f196228a, dVar.f196229b, dVar.f196230c, dVar.f196231d, dVar.f196232e, 0, 32, null), s2Var.f196448b);
        }
        return (i3Var == null || (kC = this.f196517j.c(i3Var)) == null) ? this.f196519l : kC;
    }

    @Override // yc.m2
    public final h3<K, V> g() {
        return this.f196517j;
    }

    @Override // yc.m2
    public final boolean h() {
        return this.f196528w.f196399h.get();
    }

    @Override // yc.m2
    public final void l(int i14) {
        m2.d dVar = this.f196224e;
        int i15 = dVar.f196229b;
        s2<T> s2Var = this.f196223d;
        int i16 = s2Var.f196448b;
        f196516x.getClass();
        int i17 = ((dVar.f196229b + i14) + 1) - (s2Var.f196448b + s2Var.f196452f);
        int iMax = Math.max(i15 - (i14 - i16), this.f196520m);
        this.f196520m = iMax;
        s0<K, V> s0Var = this.f196528w;
        if (iMax > 0) {
            z0 z0Var = s0Var.f196400i.f196237b;
            if ((z0Var instanceof z0.c) && !z0Var.f196662a) {
                s0Var.c();
            }
        }
        int iMax2 = Math.max(i17, this.f196521n);
        this.f196521n = iMax2;
        if (iMax2 > 0) {
            z0 z0Var2 = s0Var.f196400i.f196238c;
            if ((z0Var2 instanceof z0.c) && !z0Var2.f196662a) {
                s0Var.b();
            }
        }
        this.f196524q = Math.min(this.f196524q, i14);
        this.f196525r = Math.max(this.f196525r, i14);
        t(true);
    }

    @Override // yc.m2
    public final void o(c1 c1Var, z0 z0Var) {
        c1Var.getClass();
        z0Var.getClass();
        this.f196528w.f196400i.b(c1Var, z0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void p(boolean z14, boolean z15) {
        s2<T> s2Var = this.f196223d;
        m2.a<V> aVar = this.f196518k;
        if (z14) {
            aVar.getClass();
            aVar.a((V) p13.h0.b0(((h3.b.c) p13.h0.b0(s2Var.f196447a)).f196016a));
        }
        if (z15) {
            aVar.getClass();
            p13.h0.m0(((h3.b.c) p13.h0.m0(s2Var.f196447a)).f196016a).getClass();
        }
    }

    public final void q(int i14, int i15) {
        if (i15 == 0) {
            return;
        }
        Iterator it = p13.h0.G0(this.f196226g).iterator();
        while (it.hasNext()) {
            m2.b bVar = (m2.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.c(i14, i15);
            }
        }
    }

    public final void r(c1 c1Var, List<? extends V> list) {
        if (this.f196518k != null) {
            k3 k3Var = this.f196223d;
            boolean z14 = k3Var.getSize() == 0;
            boolean z15 = !z14 && c1Var == c1.PREPEND && list.isEmpty();
            boolean z16 = !z14 && c1Var == c1.APPEND && list.isEmpty();
            if (this.f196524q == Integer.MAX_VALUE) {
                this.f196524q = k3Var.getSize();
            }
            if (this.f196525r == Integer.MIN_VALUE) {
                this.f196525r = 0;
            }
            if (z14 || z15 || z16) {
                ge1.b.T(this.f196221b, this.f196222c, null, new w(z14, this, z15, z16, null), 2);
            }
        }
    }

    public final void t(boolean z14) {
        boolean z15 = this.f196522o;
        m2.d dVar = this.f196224e;
        boolean z16 = z15 && this.f196524q <= dVar.f196229b;
        boolean z17 = this.f196523p && this.f196525r >= (this.f196223d.getSize() - 1) - dVar.f196229b;
        if (z16 || z17) {
            if (z16) {
                this.f196522o = false;
            }
            if (z17) {
                this.f196523p = false;
            }
            if (z14) {
                ge1.b.T(this.f196221b, this.f196222c, null, new b(this, z16, z17, null), 2);
            } else {
                p(z16, z17);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/v$a;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
