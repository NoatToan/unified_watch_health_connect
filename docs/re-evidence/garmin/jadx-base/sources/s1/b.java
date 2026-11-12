package s1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B;\b\u0007\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ls1/b;", "T", "Ls1/r;", "V", "", "initialValue", "Ls1/c2;", "typeConverter", "visibilityThreshold", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/Object;Ls1/c2;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Ls1/c2;Ljava/lang/Object;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b<T, V extends r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2<T, V> f155487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f155488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m<T, V> f155489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f155490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.c2 f155491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Float f155492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Float f155493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v0 f155494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1<T> f155495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final V f155496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V f155497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V f155498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public V f155499m;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<T, V> f155500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f155501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T, V> bVar, T t7, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f155500a = bVar;
            this.f155501b = t7;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f155500a, this.f155501b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            b<T, V> bVar = this.f155500a;
            b.a(bVar);
            T tD = bVar.d(this.f155501b);
            bVar.f155489c.f155628b.setValue(tD);
            bVar.f155491e.setValue(tD);
            return Unit.INSTANCE;
        }
    }

    public b(T t7, c2<T, V> c2Var, T t14, String str) {
        this.f155487a = c2Var;
        this.f155488b = t14;
        m<T, V> mVar = new m<>(c2Var, t7, null, 0L, 0L, false, 60, null);
        this.f155489c = mVar;
        this.f155490d = p3.p0.n(Boolean.FALSE);
        this.f155491e = p3.p0.n(t7);
        this.f155494h = new v0();
        this.f155495i = new j1<>(0.0f, 0.0f, t14, 3, null);
        V v14 = mVar.f155629c;
        V v15 = v14 instanceof n ? d.f155526e : v14 instanceof o ? d.f155527f : v14 instanceof p ? d.f155528g : d.f155529h;
        v15.getClass();
        this.f155496j = v15;
        V v16 = mVar.f155629c;
        V v17 = v16 instanceof n ? d.f155522a : v16 instanceof o ? d.f155523b : v16 instanceof p ? d.f155524c : d.f155525d;
        v17.getClass();
        this.f155497k = v17;
        this.f155498l = v15;
        this.f155499m = v17;
    }

    public static final void a(b bVar) {
        m<T, V> mVar = bVar.f155489c;
        mVar.f155629c.d();
        mVar.f155630d = Long.MIN_VALUE;
        bVar.f155490d.setValue(Boolean.FALSE);
    }

    public static Object b(b bVar, Float f14, y yVar, v13.i iVar) {
        Object objE = bVar.e();
        c2<T, V> c2Var = bVar.f155487a;
        return v0.a(bVar.f155494h, new s1.a(bVar, f14, new x((y<Object>) yVar, (c2<Object, V>) c2Var, objE, (r) c2Var.a().invoke(f14)), bVar.f155489c.f155630d, null, null), iVar);
    }

    public static Object c(b bVar, Object obj, k kVar, e23.l lVar, t13.d dVar, int i14) {
        if ((i14 & 2) != 0) {
            kVar = bVar.f155495i;
        }
        k kVar2 = kVar;
        T tInvoke = bVar.f155487a.b().invoke(bVar.f155489c.f155629c);
        if ((i14 & 8) != 0) {
            lVar = null;
        }
        e23.l lVar2 = lVar;
        Object objE = bVar.e();
        c2<T, V> c2Var = bVar.f155487a;
        return v0.a(bVar.f155494h, new s1.a(bVar, tInvoke, new r1((k<Object>) kVar2, c2Var, objE, obj, c2Var.a().invoke(tInvoke)), bVar.f155489c.f155630d, lVar2, null), dVar);
    }

    public final T d(T t7) {
        if (p005kotlin.jvm.internal.s.g(this.f155498l, this.f155496j) && p005kotlin.jvm.internal.s.g(this.f155499m, this.f155497k)) {
            return t7;
        }
        c2<T, V> c2Var = this.f155487a;
        V vInvoke = c2Var.a().invoke(t7);
        int f155699e = vInvoke.getF155699e();
        boolean z14 = false;
        for (int i14 = 0; i14 < f155699e; i14++) {
            if (vInvoke.a(i14) < this.f155498l.a(i14) || vInvoke.a(i14) > this.f155499m.a(i14)) {
                vInvoke.e(j23.t.d(vInvoke.a(i14), this.f155498l.a(i14), this.f155499m.a(i14)), i14);
                z14 = true;
            }
        }
        return z14 ? c2Var.b().invoke(vInvoke) : t7;
    }

    public final T e() {
        return this.f155489c.f155628b.getF182175a();
    }

    public final boolean f() {
        return ((Boolean) this.f155490d.getF182175a()).booleanValue();
    }

    public final Object g(T t7, t13.d<? super Unit> dVar) {
        Object objA = v0.a(this.f155494h, new a(this, t7, null), dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    public final Object h(v13.i iVar) {
        Object objA = v0.a(this.f155494h, new c(this, null), iVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    public final void i(Float f14, Float f15) {
        c2<T, V> c2Var = this.f155487a;
        V vInvoke = c2Var.a().invoke(f14);
        if (vInvoke == null) {
            vInvoke = this.f155496j;
        }
        V vInvoke2 = c2Var.a().invoke(f15);
        if (vInvoke2 == null) {
            vInvoke2 = this.f155497k;
        }
        int f155699e = vInvoke.getF155699e();
        for (int i14 = 0; i14 < f155699e; i14++) {
            if (vInvoke.a(i14) > vInvoke2.a(i14)) {
                x0.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i14);
            }
        }
        this.f155498l = vInvoke;
        this.f155499m = vInvoke2;
        this.f155493g = f15;
        this.f155492f = f14;
        if (f()) {
            return;
        }
        T tD = d(e());
        if (p005kotlin.jvm.internal.s.g(tD, e())) {
            return;
        }
        this.f155489c.f155628b.setValue(tD);
    }

    public /* synthetic */ b(Object obj, c2 c2Var, Object obj2, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, c2Var, (i14 & 4) != 0 ? null : obj2, (i14 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ b(Object obj, c2 c2Var, Object obj2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, c2Var, (i14 & 4) != 0 ? null : obj2);
    }

    @o13.e
    public /* synthetic */ b(Object obj, c2 c2Var, Object obj2) {
        this(obj, c2Var, obj2, "Animatable");
    }
}
