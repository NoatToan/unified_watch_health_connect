package f11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b11.o;
import b11.v;
import c53.c0;
import e23.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o13.r;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.g0;
import p13.h0;
import p13.l0;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import s21.n;
import v01.a0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lf11/g;", "Landroidx/lifecycle/u1;", "Lf11/g$b;", "mode", "Lv01/a0;", "getCreateMealUseCase", "Lv01/h;", "createMealUseCase", "<init>", "(Lf11/g$b;Lv01/a0;Lv01/h;)V", "b", "c", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f67929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f67930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v01.h f67931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f67932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f67933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f67934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f67935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f67936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f67937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f67938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f67939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f67940l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf11/g$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        LOADED,
        LOAD_FAILED,
        LOADING,
        ERROR,
        SAVED
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld11/b;", "mealData", "Li53/c;", "Lv01/f;", "errors", "", "", "<anonymous>", "(Ld11/b;Li53/c;)Ljava/util/Set;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.CreateMealViewModel$foodsWithServingQtyError$1", f = "CreateMealViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements q<d11.b, i53.c<? extends v01.f>, t13.d<? super Set<? extends String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ d11.b f67949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ i53.c f67950b;

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(d11.b bVar, i53.c<? extends v01.f> cVar, t13.d<? super Set<? extends String>> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f67949a = bVar;
            dVar2.f67950b = cVar;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            d11.d dVar;
            i53.c<v> cVar;
            d11.b bVar = this.f67949a;
            i53.c cVar2 = this.f67950b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (!cVar2.contains(v01.f.FOOD_SERVING_QUANTITY_INVALID)) {
                return l0.f134950a;
            }
            Set setU = (bVar == null || (dVar = bVar.f57044a) == null || (cVar = dVar.f57059c) == null) ? null : c0.u(c0.o(c0.h(new g0(cVar), new ep0.a(23)), new ep0.a(24)));
            return setU == null ? l0.f134950a : setU;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements r53.i<i53.f<? extends o>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f67951a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f67952a;

            /* JADX INFO: renamed from: f11.g$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.CreateMealViewModel$special$$inlined$map$1$2", f = "CreateMealViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1413a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f67953a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f67954b;

                public C1413a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f67953a = obj;
                    this.f67954b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f67952a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1413a c1413a;
                List listB;
                s21.o oVar;
                List<n> listB0;
                if (dVar instanceof C1413a) {
                    c1413a = (C1413a) dVar;
                    int i14 = c1413a.f67954b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1413a.f67954b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1413a = new C1413a(dVar);
                    }
                } else {
                    c1413a = new C1413a(dVar);
                }
                Object obj2 = c1413a.f67953a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1413a.f67954b;
                if (i15 == 0) {
                    r.b(obj2);
                    d11.b bVar = (d11.b) obj;
                    if (bVar == null || (oVar = bVar.f57047d) == null || (listB0 = t.b0(oVar)) == null) {
                        listB = j53.l.b();
                    } else {
                        ArrayList arrayList = new ArrayList(y.r(listB0, 10));
                        for (n nVar : listB0) {
                            arrayList.add(new o(nVar, xy2.b.z(bVar.f57044a.b(), nVar.f156152b)));
                        }
                        listB = i53.a.j(arrayList);
                    }
                    c1413a.f67954b = 1;
                    if (this.f67952a.emit(listB, c1413a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public e(r53.i iVar) {
            this.f67951a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super i53.f<? extends o>> jVar, t13.d dVar) {
            Object objCollect = this.f67951a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public g(b bVar, a0 a0Var, v01.h hVar) {
        bVar.getClass();
        a0Var.getClass();
        hVar.getClass();
        this.f67929a = bVar;
        this.f67930b = a0Var;
        this.f67931c = hVar;
        p2 p2VarA = q2.a(null);
        this.f67932d = p2VarA;
        b2 b2VarD = s.d(p2VarA);
        this.f67933e = b2VarD;
        p2 p2VarA2 = q2.a(j53.l.b());
        this.f67934f = p2VarA2;
        b2 b2VarD2 = s.d(p2VarA2);
        this.f67935g = b2VarD2;
        p2 p2VarA3 = q2.a(c.LOADING);
        this.f67936h = p2VarA3;
        this.f67937i = s.d(p2VarA3);
        r53.u1 u1Var = new r53.u1(b2VarD, b2VarD2, new d(null));
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        this.f67939k = s.K(u1Var, aVarA, k2.a.a(aVar, 2), l0.f134950a);
        this.f67940l = s.K(new e(b2VarD), v1.a(this), k2.a.a(aVar, 2), j53.l.b());
        ge1.b.T(v1.a(this), null, null, new h(this, null), 3);
    }

    public final void x4(v01.f fVar) {
        fVar.getClass();
        p2 p2Var = this.f67934f;
        p2Var.setValue(i53.a.j(h0.y0((Iterable) p2Var.getValue(), fVar)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf11/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lf11/g$b;", "", "<init>", "()V", "a", "b", "Lf11/g$b$a;", "Lf11/g$b$b;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf11/g$b$a;", "Lf11/g$b;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f67941a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1433608555;
            }

            public final String toString() {
                return "Add";
            }
        }

        /* JADX INFO: renamed from: f11.g$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf11/g$b$b;", "Lf11/g$b;", "", "customMealId", "<init>", "(J)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1412b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f67942a;

            public C1412b(long j8) {
                super(null);
                this.f67942a = j8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1412b) && this.f67942a == ((C1412b) obj).f67942a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f67942a);
            }

            public final String toString() {
                return androidx.room.a0.f(this.f67942a, "Edit(customMealId=", ")");
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
