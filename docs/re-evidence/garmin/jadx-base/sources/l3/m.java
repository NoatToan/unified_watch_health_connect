package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.w2;
import p3.a4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B[\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eBk\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Ll3/m;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Ls1/k;", "animationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Le23/l;Le23/a;Le23/a;Le23/l;)V", "Ll3/o0;", "anchors", "(Ljava/lang/Object;Ll3/o0;Le23/l;Le23/a;Le23/a;Le23/l;)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f109318o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Float, Float> f109319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Float> f109320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<s1.k<Float>> f109321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<T, Boolean> f109322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f109323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f109324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.c2 f109325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3.d0 f109326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p3.d0 f109327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p3.z1 f109328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p3.z1 f109329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p3.c2 f109330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p3.c2 f109331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f109332n;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {564}, m = "anchoredDrag")
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f109333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<T> f109334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f109335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m<T> mVar, t13.d<? super b> dVar) {
            super(dVar);
            this.f109334b = mVar;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f109333a = obj;
            this.f109335c |= Integer.MIN_VALUE;
            return this.f109334b.a(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {566}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<T> f109337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f109338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.r<f, o0<T>, T, t13.d<? super Unit>, Object> f109339d;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lo13/p;", "Ll3/o0;", "<destruct>", "", "<anonymous>", "(Lo13/p;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {568}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<o13.p<? extends o0<T>, ? extends T>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f109340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f109341b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e23.r<f, o0<T>, T, t13.d<? super Unit>, Object> f109342c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m<T> f109343d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e23.r<? super f, ? super o0<T>, ? super T, ? super t13.d<? super Unit>, ? extends Object> rVar, m<T> mVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f109342c = rVar;
                this.f109343d = mVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f109342c, this.f109343d, dVar);
                aVar.f109341b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
                return ((a) create((o13.p) obj, dVar)).invokeSuspend(Unit.INSTANCE);
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
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f109340a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    o13.p pVar = (o13.p) this.f109341b;
                    o0<T> o0Var = (o0) pVar.f128594a;
                    B b14 = pVar.f128595b;
                    d dVar = this.f109343d.f109332n;
                    this.f109340a = 1;
                    if (this.f109342c.invoke(dVar, o0Var, b14, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(m<T> mVar, T t7, e23.r<? super f, ? super o0<T>, ? super T, ? super t13.d<? super Unit>, ? extends Object> rVar, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f109337b = mVar;
            this.f109338c = t7;
            this.f109339d = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new c(this.f109337b, this.f109338c, this.f109339d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109336a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = m.f109318o;
                m<T> mVar = this.f109337b;
                mVar.f109330l.setValue(this.f109338c);
                l lVar = new l(mVar, 4);
                a aVar2 = new a(this.f109339d, mVar, null);
                this.f109336a = 1;
                if (k.c(lVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l3/m$d", "Ll3/f;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m<T> f109344a;

        public d(m<T> mVar) {
            this.f109344a = mVar;
        }

        @Override // l3.f
        public final void a(float f14, float f15) {
            int i14 = m.f109318o;
            m<T> mVar = this.f109344a;
            mVar.f109328j.i(f14);
            mVar.f109329k.i(f15);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l3/m$e", "Ly1/d1;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements p008y1.d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f109345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<T> f109346b;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l3/m$e$a", "Ly1/v0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements p008y1.v0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m<T> f109347a;

            public a(m<T> mVar) {
                this.f109347a = mVar;
            }

            @Override // p008y1.v0
            public final void a(float f14) {
                m<T> mVar = this.f109347a;
                mVar.f109332n.a(mVar.g(f14), 0.0f);
            }
        }

        public e(m<T> mVar) {
            this.f109346b = mVar;
            this.f109345a = new a(mVar);
        }

        @Override // p008y1.d1
        public final Object a(u1.k1 k1Var, p008y1.b1 b1Var, y1.p0.b bVar) {
            Object objB = this.f109346b.b(k1Var, new p(this, b1Var, null), bVar);
            return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(T t7, e23.l<? super Float, Float> lVar, e23.a<Float> aVar, e23.a<? extends s1.k<Float>> aVar2, e23.l<? super T, Boolean> lVar2) {
        this.f109319a = lVar;
        this.f109320b = aVar;
        this.f109321c = aVar2;
        this.f109322d = lVar2;
        this.f109323e = new b1();
        this.f109324f = new e(this);
        this.f109325g = p3.p0.n(t7);
        this.f109326h = p3.p0.f(new l(this, 0));
        this.f109327i = p3.p0.f(new l(this, 1));
        this.f109328j = new p3.z1(Float.NaN);
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        p3.p0.g(a4Var, new l(this, 2));
        this.f109329k = new p3.z1(0.0f);
        this.f109330l = p3.p0.n(null);
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f109331m = p3.p0.n(new e1(k0Var));
        this.f109332n = new d(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(T t7, u1.k1 k1Var, e23.r<? super f, ? super o0<T>, ? super T, ? super t13.d<? super Unit>, ? extends Object> rVar, t13.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f109335c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f109335c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f109333a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f109335c;
        p3.c2 c2Var = this.f109330l;
        e23.l<T, Boolean> lVar = this.f109322d;
        p3.z1 z1Var = this.f109328j;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                if (e().d(t7)) {
                    b1 b1Var = this.f109323e;
                    c cVar = new c(this, t7, rVar, null);
                    bVar.f109335c = 1;
                    b1Var.getClass();
                    if (o53.c0.e(new c1(k1Var, b1Var, cVar, null), bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    i(t7);
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            c2Var.setValue(null);
            T tA = e().a(z1Var.getFloatValue());
            if (tA != null && Math.abs(z1Var.getFloatValue() - e().c(tA)) <= 0.5f && lVar.invoke(tA).booleanValue()) {
                i(tA);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            c2Var.setValue(null);
            T tA2 = e().a(z1Var.getFloatValue());
            if (tA2 != null && Math.abs(z1Var.getFloatValue() - e().c(tA2)) <= 0.5f && lVar.invoke(tA2).booleanValue()) {
                i(tA2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(u1.k1 k1Var, p pVar, v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f109365c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f109365c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f109363a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f109365c;
        e23.l<T, Boolean> lVar = this.f109322d;
        p3.z1 z1Var = this.f109328j;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                b1 b1Var = this.f109323e;
                o oVar = new o(this, pVar, null);
                nVar.f109365c = 1;
                b1Var.getClass();
                if (o53.c0.e(new c1(k1Var, b1Var, oVar, null), nVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            T tA = e().a(z1Var.getFloatValue());
            if (tA != null && Math.abs(z1Var.getFloatValue() - e().c(tA)) <= 0.5f && lVar.invoke(tA).booleanValue()) {
                i(tA);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            T tA2 = e().a(z1Var.getFloatValue());
            if (tA2 != null && Math.abs(z1Var.getFloatValue() - e().c(tA2)) <= 0.5f && lVar.invoke(tA2).booleanValue()) {
                i(tA2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(float f14, float f15, Object obj) {
        o0<T> o0VarE = e();
        float fC = o0VarE.c(obj);
        float fFloatValue = this.f109320b.invoke().floatValue();
        if (fC != f14 && !Float.isNaN(fC)) {
            e23.l<Float, Float> lVar = this.f109319a;
            if (fC < f14) {
                if (f15 >= fFloatValue) {
                    T tB = o0VarE.b(f14, true);
                    tB.getClass();
                    return tB;
                }
                T tB2 = o0VarE.b(f14, true);
                tB2.getClass();
                if (f14 >= Math.abs(Math.abs(lVar.invoke(Float.valueOf(Math.abs(o0VarE.c(tB2) - fC))).floatValue()) + fC)) {
                    return tB2;
                }
            } else {
                if (f15 <= (-fFloatValue)) {
                    T tB3 = o0VarE.b(f14, false);
                    tB3.getClass();
                    return tB3;
                }
                T tB4 = o0VarE.b(f14, false);
                tB4.getClass();
                float fAbs = Math.abs(fC - Math.abs(lVar.invoke(Float.valueOf(Math.abs(fC - o0VarE.c(tB4)))).floatValue()));
                if (f14 >= 0.0f ? f14 <= fAbs : Math.abs(f14) >= fAbs) {
                    return tB4;
                }
            }
        }
        return obj;
    }

    public final float d(float f14) {
        float fG = g(f14);
        p3.z1 z1Var = this.f109328j;
        float floatValue = Float.isNaN(z1Var.getFloatValue()) ? 0.0f : z1Var.getFloatValue();
        z1Var.i(fG);
        return fG - floatValue;
    }

    public final o0<T> e() {
        return (o0) this.f109331m.getF182175a();
    }

    public final boolean f() {
        return this.f109330l.getF182175a() != null;
    }

    public final float g(float f14) {
        p3.z1 z1Var = this.f109328j;
        return j23.t.d((Float.isNaN(z1Var.getFloatValue()) ? 0.0f : z1Var.getFloatValue()) + f14, e().e(), e().f());
    }

    public final float h() {
        p3.z1 z1Var = this.f109328j;
        if (!Float.isNaN(z1Var.getFloatValue())) {
            return z1Var.getFloatValue();
        }
        vb.h.z("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void i(T t7) {
        this.f109325g.setValue(t7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object j(float f14, v13.i iVar) {
        T f182175a = this.f109325g.getF182175a();
        Object objC = c(h(), f14, f182175a);
        if (this.f109322d.invoke((T) objC).booleanValue()) {
            Object objA = a(objC, u1.k1.Default, new h(this, f14, null), iVar);
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (objA != aVar) {
                objA = Unit.INSTANCE;
            }
            return objA == aVar ? objA : Unit.INSTANCE;
        }
        Object objA2 = a(f182175a, u1.k1.Default, new h(this, f14, null), iVar);
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        if (objA2 != aVar2) {
            objA2 = Unit.INSTANCE;
        }
        return objA2 == aVar2 ? objA2 : Unit.INSTANCE;
    }

    public final boolean k(T t7) {
        z53.b bVar = this.f109323e.f109182b;
        boolean zF = bVar.f();
        if (!zF) {
            return zF;
        }
        try {
            d dVar = this.f109332n;
            float fC = e().c(t7);
            if (!Float.isNaN(fC)) {
                dVar.a(fC, 0.0f);
                this.f109330l.setValue(null);
            }
            i(t7);
            Unit unit = Unit.INSTANCE;
            return zF;
        } finally {
            bVar.e(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll3/m$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ m(Object obj, e23.l lVar, e23.a aVar, e23.a aVar2, e23.l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, lVar, aVar, aVar2, (i14 & 16) != 0 ? new w2(11) : lVar2);
    }

    public /* synthetic */ m(Object obj, o0 o0Var, e23.l lVar, e23.a aVar, e23.a aVar2, e23.l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, o0Var, lVar, aVar, aVar2, (i14 & 32) != 0 ? new w2(11) : lVar2);
    }

    public m(T t7, o0<T> o0Var, e23.l<? super Float, Float> lVar, e23.a<Float> aVar, e23.a<? extends s1.k<Float>> aVar2, e23.l<? super T, Boolean> lVar2) {
        this(t7, lVar, aVar, aVar2, lVar2);
        this.f109331m.setValue(o0Var);
        k(t7);
    }
}
