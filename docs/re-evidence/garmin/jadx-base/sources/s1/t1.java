package s1;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u000f\u0010\u0011\u0012B1\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Ls1/t1;", "S", "", "Ls1/a2;", "transitionState", "parentTransition", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ls1/a2;Ls1/t1;Ljava/lang/String;)V", "(Ls1/a2;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "Ls1/t0;", "(Ls1/t0;Ljava/lang/String;)V", "d", "c", "b", "a", "", "runFrameLoop", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t1<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2<S> f155744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1<?> f155745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f155747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.c2 f155748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p3.b2 f155749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.b2 f155750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3.c2 f155751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f4.s<t1<S>.d<?, ?>> f155752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f4.s<t1<?>> f155753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p3.c2 f155754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p3.d0 f155755l;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u000bB%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ls1/t1$a;", "T", "Ls1/r;", "V", "", "Ls1/c2;", "typeConverter", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ls1/t1;Ls1/c2;Ljava/lang/String;)V", "a", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a<T, V extends r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c2<T, V> f155756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f155757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p3.c2 f155758c = p3.p0.n(null);

        /* JADX INFO: renamed from: s1.t1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls1/t1$a$a;", "T", "Ls1/r;", "V", "Lp3/x3;", "Ls1/t1$d;", "Ls1/t1;", "animation", "Lkotlin/Function1;", "Ls1/t1$b;", "Ls1/f0;", "transitionSpec", "targetValueByState", "<init>", "(Ls1/t1$a;Ls1/t1$d;Le23/l;Le23/l;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class C2947a<T, V extends r> implements x3<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t1<S>.d<T, V> f155760a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public e23.l<? super b<S>, ? extends f0<T>> f155761b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public e23.l<? super S, ? extends T> f155762c;

            public C2947a(t1<S>.d<T, V> dVar, e23.l<? super b<S>, ? extends f0<T>> lVar, e23.l<? super S, ? extends T> lVar2) {
                this.f155760a = dVar;
                this.f155761b = lVar;
                this.f155762c = lVar2;
            }

            public final void a(b<S> bVar) {
                T tInvoke = this.f155762c.invoke(bVar.f());
                boolean zI = t1.this.i();
                t1<S>.d<T, V> dVar = this.f155760a;
                if (zI) {
                    dVar.n(this.f155762c.invoke(bVar.c()), tInvoke, this.f155761b.invoke(bVar));
                } else {
                    dVar.o(tInvoke, this.f155761b.invoke(bVar));
                }
            }

            @Override // p3.x3
            /* JADX INFO: renamed from: getValue */
            public final T getF182175a() {
                a(t1.this.f());
                return this.f155760a.f155775j.getF182175a();
            }
        }

        public a(c2<T, V> c2Var, String str) {
            this.f155756a = c2Var;
            this.f155757b = str;
        }

        public final C2947a a(e23.l lVar, e23.l lVar2) {
            p3.c2 c2Var = this.f155758c;
            C2947a c2947a = (C2947a) c2Var.getF182175a();
            t1<S> t1Var = t1.this;
            if (c2947a == null) {
                Object objInvoke = lVar2.invoke(t1Var.f155744a.a());
                r rVar = (r) this.f155756a.a().invoke(lVar2.invoke(t1Var.f155744a.a()));
                rVar.d();
                c2947a = new C2947a(t1Var.new d(objInvoke, rVar, this.f155756a, this.f155757b), lVar, lVar2);
                c2Var.setValue(c2947a);
                t1Var.f155752i.add(c2947a.f155760a);
            }
            c2947a.f155762c = lVar2;
            c2947a.f155761b = lVar;
            c2947a.a(t1Var.f());
            return c2947a;
        }
    }

    public interface b<S> {
        default boolean a(S s8, S s14) {
            return p005kotlin.jvm.internal.s.g(s8, c()) && p005kotlin.jvm.internal.s.g(s14, f());
        }

        S c();

        S f();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls1/t1$c;", "S", "Ls1/t1$b;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f155764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S f155765b;

        public c(S s8, S s14) {
            this.f155764a = s8;
            this.f155765b = s14;
        }

        @Override // s1.t1.b
        public final S c() {
            return this.f155764a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f155764a, bVar.c()) && p005kotlin.jvm.internal.s.g(this.f155765b, bVar.f());
        }

        @Override // s1.t1.b
        public final S f() {
            return this.f155765b;
        }

        public final int hashCode() {
            S s8 = this.f155764a;
            int iHashCode = (s8 != null ? s8.hashCode() : 0) * 31;
            S s14 = this.f155765b;
            return iHashCode + (s14 != null ? s14.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls1/t1$d;", "T", "Ls1/r;", "V", "Lp3/x3;", "initialValue", "initialVelocityVector", "Ls1/c2;", "typeConverter", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ls1/t1;Ljava/lang/Object;Ls1/r;Ls1/c2;Ljava/lang/String;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class d<T, V extends r> implements x3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c2<T, V> f155766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p3.c2 f155767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p3.c2 f155768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p3.c2 f155769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a1.b f155770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r1<T, V> f155771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p3.c2 f155772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final p3.z1 f155773h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f155774i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final p3.c2 f155775j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public V f155776k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final p3.b2 f155777l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f155778m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final j1 f155779n;

        /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
        public d(T t7, V v14, c2<T, V> c2Var, String str) {
            this.f155766a = c2Var;
            p3.c2 c2VarN = p3.p0.n(t7);
            this.f155767b = c2VarN;
            T tInvoke = null;
            this.f155768c = p3.p0.n(l.c(7, 0.0f, 0.0f, null));
            this.f155769d = p3.p0.n(new r1(c(), c2Var, t7, c2VarN.getF182175a(), v14));
            this.f155772g = p3.p0.n(Boolean.TRUE);
            this.f155773h = new p3.z1(-1.0f);
            this.f155775j = p3.p0.n(t7);
            this.f155776k = v14;
            this.f155777l = new p3.b2(a().getF155847h());
            Float f14 = (Float) u2.f155813b.get(c2Var);
            if (f14 != null) {
                float fFloatValue = f14.floatValue();
                V vInvoke = c2Var.a().invoke(t7);
                int f155699e = vInvoke.getF155699e();
                for (int i14 = 0; i14 < f155699e; i14++) {
                    vInvoke.e(fFloatValue, i14);
                }
                tInvoke = this.f155766a.b().invoke(vInvoke);
            }
            this.f155779n = l.c(3, 0.0f, 0.0f, tInvoke);
        }

        public final r1<T, V> a() {
            return (r1) this.f155769d.getF182175a();
        }

        public final f0<T> c() {
            return (f0) this.f155768c.getF182175a();
        }

        public final void e(long j8) {
            if (this.f155773h.getFloatValue() == -1.0f) {
                this.f155778m = true;
                if (p005kotlin.jvm.internal.s.g(a().f155727c, a().f155728d)) {
                    l(a().f155727c);
                } else {
                    l(a().e(j8));
                    this.f155776k = (V) a().f(j8);
                }
            }
        }

        @Override // p3.x3
        /* JADX INFO: renamed from: getValue */
        public final T getF182175a() {
            return this.f155775j.getF182175a();
        }

        public final void l(T t7) {
            this.f155775j.setValue(t7);
        }

        public final void m(T t7, boolean z14) {
            r1<T, V> r1Var = this.f155771f;
            T t14 = r1Var != null ? r1Var.f155727c : null;
            p3.c2 c2Var = this.f155767b;
            boolean zG = p005kotlin.jvm.internal.s.g(t14, c2Var.getF182175a());
            p3.b2 b2Var = this.f155777l;
            p3.c2 c2Var2 = this.f155769d;
            if (zG) {
                c2Var2.setValue(new r1(this.f155779n, this.f155766a, t7, t7, this.f155776k.c()));
                this.f155774i = true;
                b2Var.k(a().getF155847h());
                return;
            }
            f0<T> f0VarC = (!z14 || this.f155778m || (c() instanceof j1)) ? c() : this.f155779n;
            t1<S> t1Var = t1.this;
            long jE = t1Var.e();
            p3.c2 c2Var3 = t1Var.f155751h;
            c2Var2.setValue(new r1(jE <= 0 ? f0VarC : new k1(f0VarC, t1Var.e()), this.f155766a, t7, c2Var.getF182175a(), this.f155776k));
            b2Var.k(a().getF155847h());
            this.f155774i = false;
            c2Var3.setValue(Boolean.TRUE);
            if (t1Var.i()) {
                f4.s<t1<S>.d<?, ?>> sVar = t1Var.f155752i;
                int size = sVar.size();
                long jMax = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    t1<S>.d<?, ?> dVar = sVar.get(i14);
                    jMax = Math.max(jMax, dVar.f155777l.j());
                    dVar.e(0L);
                }
                c2Var3.setValue(Boolean.FALSE);
            }
        }

        public final void n(T t7, T t14, f0<T> f0Var) {
            this.f155767b.setValue(t14);
            this.f155768c.setValue(f0Var);
            if (p005kotlin.jvm.internal.s.g(a().f155728d, t7) && p005kotlin.jvm.internal.s.g(a().f155727c, t14)) {
                return;
            }
            m(t7, false);
        }

        public final void o(T t7, f0<T> f0Var) {
            if (this.f155774i) {
                r1<T, V> r1Var = this.f155771f;
                if (p005kotlin.jvm.internal.s.g(t7, r1Var != null ? r1Var.f155727c : null)) {
                    return;
                }
            }
            p3.c2 c2Var = this.f155767b;
            boolean zG = p005kotlin.jvm.internal.s.g(c2Var.getF182175a(), t7);
            p3.z1 z1Var = this.f155773h;
            if (zG && z1Var.getFloatValue() == -1.0f) {
                return;
            }
            c2Var.setValue(t7);
            this.f155768c.setValue(f0Var);
            T f182175a = z1Var.getFloatValue() == -3.0f ? t7 : this.f155775j.getF182175a();
            p3.c2 c2Var2 = this.f155772g;
            m(f182175a, !((Boolean) c2Var2.getF182175a()).booleanValue());
            c2Var2.setValue(Boolean.valueOf(z1Var.getFloatValue() == -3.0f));
            if (z1Var.getFloatValue() >= 0.0f) {
                l(a().e((long) (z1Var.getFloatValue() * a().getF155847h())));
            } else if (z1Var.getFloatValue() == -3.0f) {
                l(t7);
            }
            this.f155774i = false;
            z1Var.i(-1.0f);
        }

        public final String toString() {
            return "current value: " + this.f155775j.getF182175a() + ", target: " + this.f155767b.getF182175a() + ", spec: " + c();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1202}, m = "invokeSuspend", v = 1)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f155781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f155782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f155783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t1<S> f155784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t1<S> t1Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f155784d = t1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = new e(this.f155784d, dVar);
            eVar.f155783c = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            float fH;
            o53.b0 b0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155782b;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var2 = (o53.b0) this.f155783c;
                fH = q1.h(b0Var2.getF7937b());
                b0Var = b0Var2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fH = this.f155781a;
                b0Var = (o53.b0) this.f155783c;
                o13.r.b(obj);
            }
            while (o53.c0.g(b0Var)) {
                l02.l lVar = new l02.l(this.f155784d, fH, 4);
                this.f155783c = b0Var;
                this.f155781a = fH;
                this.f155782b = 1;
                if (p3.g1.a(getF157466b()).v(lVar, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s1/t1$f", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements p3.h0 {
        @Override // p3.h0
        public final void dispose() {
        }
    }

    public t1(a2<S> a2Var, t1<?> t1Var, String str) {
        this.f155744a = a2Var;
        this.f155745b = t1Var;
        this.f155746c = str;
        this.f155747d = p3.p0.n(a2Var.a());
        this.f155748e = p3.p0.n(new c(a2Var.a(), a2Var.a()));
        this.f155749f = new p3.b2(0L);
        this.f155750g = new p3.b2(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f155751h = p3.p0.n(bool);
        this.f155752i = new f4.s<>();
        this.f155753j = new f4.s<>();
        this.f155754k = p3.p0.n(bool);
        this.f155755l = p3.p0.f(new s1(this, 0));
        a2Var.d(this);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(S s8, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1493585151);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(s8) : o0VarE.r(s8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(this) ? 32 : 16;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (i()) {
                o0VarE.C(416369985);
            } else {
                o0VarE.C(466062241);
                r(s8);
                int i17 = i15 & 112;
                Object[] objArr = i17 == 32;
                Object objQ = o0VarE.q();
                p3.m.a aVar = p3.m.f135153a;
                if (objArr == true) {
                    objQ = p3.p0.f(new s1(this, i16));
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p3.p0.f(new s1(this, i16));
                        o0VarE.K(objQ);
                    }
                }
                if (((Boolean) ((x3) objQ).getF182175a()).booleanValue()) {
                    Object objH = r1.q2.h(o0VarE, 466470356, aVar);
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objH == c2565a) {
                        objH = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objH);
                    }
                    o53.b0 b0Var = (o53.b0) objH;
                    int i18 = (o0VarE.r(b0Var) ? 1 : 0) | (i17 != 32 ? 0 : 1);
                    Object objQ2 = o0VarE.q();
                    if (i18 != 0 || objQ2 == c2565a) {
                        objQ2 = new rk0.g(12, b0Var, this);
                        o0VarE.K(objQ2);
                    }
                    p3.l0.b(b0Var, this, (e23.l) objQ2, o0VarE);
                } else {
                    o0VarE.C(416369985);
                }
                o0VarE.g0(false);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(this, s8, i14, 27);
        }
    }

    public final long b() {
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        long jMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            jMax = Math.max(jMax, sVar.get(i14).f155777l.j());
        }
        f4.s<t1<?>> sVar2 = this.f155753j;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            jMax = Math.max(jMax, sVar2.get(i15).b());
        }
        return jMax;
    }

    public final void c() {
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            t1<S>.d<?, ?> dVar = sVar.get(i14);
            dVar.f155771f = null;
            dVar.f155770e = null;
            dVar.f155774i = false;
        }
        f4.s<t1<?>> sVar2 = this.f155753j;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            sVar2.get(i15).c();
        }
    }

    public final boolean d() {
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (sVar.get(i14).f155770e != null) {
                return true;
            }
        }
        f4.s<t1<?>> sVar2 = this.f155753j;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            if (sVar2.get(i15).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        t1<?> t1Var = this.f155745b;
        return t1Var != null ? t1Var.e() : this.f155749f.j();
    }

    public final b<S> f() {
        return (b) this.f155748e.getF182175a();
    }

    public final long g() {
        return ((Number) this.f155755l.getF182175a()).longValue();
    }

    public final boolean h() {
        return this.f155750g.j() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.f155754k.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [V extends s1.r, s1.r] */
    public final void j(long j8, boolean z14) {
        p3.b2 b2Var = this.f155750g;
        long j14 = b2Var.j();
        a2<S> a2Var = this.f155744a;
        if (j14 == Long.MIN_VALUE) {
            b2Var.k(j8);
            a2Var.f155486a.setValue(Boolean.TRUE);
        } else if (!((Boolean) a2Var.f155486a.getF182175a()).booleanValue()) {
            a2Var.f155486a.setValue(Boolean.TRUE);
        }
        this.f155751h.setValue(Boolean.FALSE);
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        boolean z15 = true;
        for (int i14 = 0; i14 < size; i14++) {
            t1<S>.d<?, ?> dVar = sVar.get(i14);
            p3.c2 c2Var = dVar.f155772g;
            p3.c2 c2Var2 = dVar.f155772g;
            if (!((Boolean) c2Var.getF182175a()).booleanValue()) {
                long jB = z14 ? dVar.a().getF155847h() : j8;
                dVar.l(dVar.a().e(jB));
                dVar.f155776k = dVar.a().f(jB);
                if (dVar.a().c(jB)) {
                    c2Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c2Var2.getF182175a()).booleanValue()) {
                z15 = false;
            }
        }
        f4.s<t1<?>> sVar2 = this.f155753j;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            t1<?> t1Var = sVar2.get(i15);
            p3.c2 c2Var3 = t1Var.f155747d;
            a2<?> a2Var2 = t1Var.f155744a;
            if (!p005kotlin.jvm.internal.s.g(c2Var3.getF182175a(), a2Var2.a())) {
                t1Var.j(j8, z14);
            }
            if (!p005kotlin.jvm.internal.s.g(t1Var.f155747d.getF182175a(), a2Var2.a())) {
                z15 = false;
            }
        }
        if (z15) {
            k();
        }
    }

    public final void k() {
        this.f155750g.k(Long.MIN_VALUE);
        a2<S> a2Var = this.f155744a;
        if (a2Var instanceof t0) {
            ((t0) a2Var).c(this.f155747d.getF182175a());
        }
        p(0L);
        a2Var.f155486a.setValue(Boolean.FALSE);
        f4.s<t1<?>> sVar = this.f155753j;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            sVar.get(i14).k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(float f14) {
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            t1<S>.d<?, ?> dVar = sVar.get(i14);
            dVar.getClass();
            if (f14 == -4.0f || f14 == -5.0f) {
                r1<?, V> r1Var = dVar.f155771f;
                if (r1Var != 0) {
                    dVar.a().g(r1Var.f155727c);
                    dVar.f155770e = null;
                    dVar.f155771f = null;
                }
                Object obj = f14 == -4.0f ? dVar.a().f155728d : dVar.a().f155727c;
                dVar.a().g(obj);
                dVar.a().h(obj);
                dVar.l(obj);
                dVar.f155777l.k(dVar.a().getF155847h());
            } else {
                dVar.f155773h.i(f14);
            }
        }
        f4.s<t1<?>> sVar2 = this.f155753j;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            sVar2.get(i15).l(f14);
        }
    }

    public final void m(Object obj, Object obj2) {
        this.f155750g.k(Long.MIN_VALUE);
        a2<S> a2Var = this.f155744a;
        a2Var.f155486a.setValue(Boolean.FALSE);
        boolean zI = i();
        p3.c2 c2Var = this.f155747d;
        if (!zI || !p005kotlin.jvm.internal.s.g(a2Var.a(), obj) || !p005kotlin.jvm.internal.s.g(c2Var.getF182175a(), obj2)) {
            if (!p005kotlin.jvm.internal.s.g(a2Var.a(), obj) && (a2Var instanceof t0)) {
                ((t0) a2Var).c(obj);
            }
            c2Var.setValue(obj2);
            this.f155754k.setValue(Boolean.TRUE);
            this.f155748e.setValue(new c(obj, obj2));
        }
        f4.s<t1<?>> sVar = this.f155753j;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            t1<?> t1Var = sVar.get(i14);
            t1Var.getClass();
            if (t1Var.i()) {
                t1Var.m(t1Var.f155744a.a(), t1Var.f155747d.getF182175a());
            }
        }
        f4.s<t1<S>.d<?, ?>> sVar2 = this.f155752i;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            sVar2.get(i15).e(0L);
        }
    }

    public final void n(long j8) {
        p3.b2 b2Var = this.f155750g;
        if (b2Var.j() == Long.MIN_VALUE) {
            b2Var.k(j8);
        }
        p(j8);
        this.f155751h.setValue(Boolean.FALSE);
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            sVar.get(i14).e(j8);
        }
        f4.s<t1<?>> sVar2 = this.f155753j;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            t1<?> t1Var = sVar2.get(i15);
            if (!p005kotlin.jvm.internal.s.g(t1Var.f155747d.getF182175a(), t1Var.f155744a.a())) {
                t1Var.n(j8);
            }
        }
    }

    public final void o(a1.b bVar) {
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            t1<S>.d<?, ?> dVar = sVar.get(i14);
            p3.c2 c2Var = dVar.f155775j;
            if (!p005kotlin.jvm.internal.s.g(dVar.a().f155727c, dVar.a().f155728d)) {
                dVar.f155771f = dVar.a();
                dVar.f155770e = bVar;
            }
            dVar.f155769d.setValue(new r1((k) dVar.f155779n, (c2<T, r>) dVar.f155766a, (Object) c2Var.getF182175a(), (Object) c2Var.getF182175a(), dVar.f155776k.c()));
            dVar.f155777l.k(dVar.a().getF155847h());
            dVar.f155774i = true;
        }
        f4.s<t1<?>> sVar2 = this.f155753j;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            sVar2.get(i15).o(bVar);
        }
    }

    public final void p(long j8) {
        if (this.f155745b == null) {
            this.f155749f.k(j8);
        }
    }

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
    public final void q() {
        g gVar;
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            t1<S>.d<?, ?> dVar = sVar.get(i14);
            a1.b bVar = dVar.f155770e;
            if (bVar != null && (gVar = dVar.f155771f) != null) {
                long jD = MathKt.d(bVar.f155484g * ((double) bVar.f155481d));
                Object objE = gVar.e(jD);
                if (dVar.f155774i) {
                    dVar.a().h(objE);
                }
                dVar.a().g(objE);
                dVar.f155777l.k(dVar.a().getF155847h());
                if (dVar.f155773h.getFloatValue() == -2.0f || dVar.f155774i) {
                    dVar.l(objE);
                } else {
                    dVar.e(t1.this.e());
                }
                if (jD >= bVar.f155484g) {
                    dVar.f155770e = null;
                    dVar.f155771f = null;
                } else {
                    bVar.f155480c = false;
                }
            }
        }
        f4.s<t1<?>> sVar2 = this.f155753j;
        int size2 = sVar2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            sVar2.get(i15).q();
        }
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
    public final void r(S s8) {
        p3.c2 c2Var = this.f155747d;
        if (p005kotlin.jvm.internal.s.g(c2Var.getF182175a(), s8)) {
            return;
        }
        this.f155748e.setValue(new c(c2Var.getF182175a(), s8));
        a2<S> a2Var = this.f155744a;
        if (!p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
            a2Var.c(c2Var.getF182175a());
        }
        c2Var.setValue(s8);
        if (!h()) {
            this.f155751h.setValue(Boolean.TRUE);
        }
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        for (int i14 = 0; i14 < size; i14++) {
            sVar.get(i14).f155773h.i(-2.0f);
        }
    }

    public final String toString() {
        f4.s<t1<S>.d<?, ?>> sVar = this.f155752i;
        int size = sVar.size();
        String str = "Transition animation values: ";
        for (int i14 = 0; i14 < size; i14++) {
            str = str + sVar.get(i14) + ", ";
        }
        return str;
    }

    public /* synthetic */ t1(a2 a2Var, t1 t1Var, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(a2Var, t1Var, (i14 & 4) != 0 ? null : str);
    }

    public /* synthetic */ t1(a2 a2Var, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(a2Var, (i14 & 2) != 0 ? null : str);
    }

    public t1(a2<S> a2Var, String str) {
        this(a2Var, null, str);
    }

    public t1(S s8, String str) {
        this(new t0(s8), null, str);
    }

    public /* synthetic */ t1(t0 t0Var, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(t0Var, (i14 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(t0<S> t0Var, String str) {
        this(t0Var, null, str);
        t0Var.getClass();
    }
}
