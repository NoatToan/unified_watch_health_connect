package x01;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b21.fb;
import b21.l4;
import b63.o;
import b63.q;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import e23.p;
import g01.x;
import g01.z;
import java.io.Serializable;
import java.util.Iterator;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.b2;
import r53.c2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v01.p0;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lx01/k;", "Landroidx/lifecycle/u1;", "Lzd0/j1;", "subscriptionProvider", "Lm01/g;", "nutritionRepository", "Lx01/i;", "stateProvider", "Ls01/e;", "nutritionEventProvider", "Le01/a;", "nutritionPreferences", "Ld01/c;", "nutritionStore", "Lb21/l4;", "startDestination", "", "fromSearch", "Lv01/p0;", "getMealsUseCase", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lzd0/j1;Lm01/g;Lx01/i;Ls01/e;Le01/a;Ld01/c;Lb21/l4;ZLv01/p0;Ls01/f;)V", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f188287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m01.g f188288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f188289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s01.e f188290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e01.a f188291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d01.c f188292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l4 f188293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f188294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p0 f188295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s01.f f188296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f188297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f188298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f188299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f188300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f188301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f188302p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionViewModel$1", f = "NutritionViewModel.kt", l = {89}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f188303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f188304b;

        /* JADX INFO: renamed from: x01.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionViewModel$1$1", f = "NutritionViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
        public static final class C3504a extends v13.i implements p<r53.j<? super Object>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f188306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f188307b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f188308c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3504a(k kVar, t13.d<? super C3504a> dVar) {
                super(2, dVar);
                this.f188308c = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3504a c3504a = new C3504a(this.f188308c, dVar);
                c3504a.f188307b = obj;
                return c3504a;
            }

            @Override // e23.p
            public final Object invoke(r53.j<? super Object> jVar, t13.d<? super Unit> dVar) {
                return ((C3504a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                r53.j jVar = (r53.j) this.f188307b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f188306a;
                if (i14 == 0) {
                    r.b(obj);
                    k kVar = this.f188308c;
                    s53.l lVarE = s.E(kVar.f188287a.b(), kVar.f188290d.a());
                    this.f188307b = null;
                    this.f188306a = 1;
                    if (s.v(jVar, lVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b0 f188309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f188310b;

            public b(b0 b0Var, k kVar) {
                this.f188309a = b0Var;
                this.f188310b = kVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d<? super Unit> dVar) {
                a2 a2Var = a2.NUTRITION;
                String strF = org.apache.commons.lang3.e.f("Received subscription or nutrition event ", ", refreshing nutrition settings", obj);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "NutritionViewModel", strF);
                k kVar = this.f188310b;
                k.x4(kVar, kVar.f188294h, g22.l.d(o.INSTANCE));
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = k.this.new a(dVar);
            aVar.f188304b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f188304b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f188303a;
            if (i14 == 0) {
                r.b(obj);
                k kVar = k.this;
                c2 c2Var = new c2(new C3504a(kVar, null));
                b bVar = new b(b0Var, kVar);
                this.f188304b = null;
                this.f188303a = 1;
                if (c2Var.collect(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lx01/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionViewModel$uiState$1", f = "NutritionViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<r53.j<? super j>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f188311a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionViewModel$uiState$1$1", f = "NutritionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f188313a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f188313a = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f188313a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                k kVar = this.f188313a;
                k.x4(kVar, kVar.f188294h, g22.l.d(o.INSTANCE));
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super j> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f188311a;
            if (i14 == 0) {
                r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(k.this, null);
                this.f188311a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(j1 j1Var, m01.g gVar, i iVar, s01.e eVar, e01.a aVar, d01.c cVar, l4 l4Var, boolean z14, p0 p0Var, s01.f fVar) {
        j1Var.getClass();
        gVar.getClass();
        iVar.getClass();
        eVar.getClass();
        aVar.getClass();
        cVar.getClass();
        p0Var.getClass();
        fVar.getClass();
        this.f188287a = j1Var;
        this.f188288b = gVar;
        this.f188289c = iVar;
        this.f188290d = eVar;
        this.f188291e = aVar;
        this.f188292f = cVar;
        this.f188293g = l4Var;
        this.f188294h = z14;
        this.f188295i = p0Var;
        this.f188296j = fVar;
        p2 p2VarA = q2.a(new j(true, null, null, false, null, 30, null));
        this.f188297k = p2VarA;
        Object[] objArr = 0 == true ? 1 : 0;
        this.f188298l = s.K(new v(new c(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new j(true, null, objArr, false, null, 30, null));
        Boolean bool = Boolean.FALSE;
        p2 p2VarA2 = q2.a(bool);
        this.f188299m = p2VarA2;
        this.f188300n = p2VarA2;
        p2 p2VarA3 = q2.a(bool);
        this.f188301o = p2VarA3;
        this.f188302p = s.d(p2VarA3);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    public static final void x4(k kVar, boolean z14, o oVar) {
        Object value;
        kVar.getClass();
        if (!z14) {
            ge1.b.T(v1.a(kVar), null, null, new l(kVar, oVar, null), 3);
        } else {
            if (!z14) {
                u0.r();
                return;
            }
            p2 p2Var = kVar.f188297k;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, j.a((j) value, false, null, kVar.f188293g, null, 26)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable y4(k kVar, String str, v13.c cVar) {
        m mVar;
        o oVarD;
        Object obj;
        b63.v vVar;
        Object next;
        b63.v vVar2;
        kVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f188326f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f188326f = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(kVar, cVar);
            }
        } else {
            mVar = new m(kVar, cVar);
        }
        Object obj2 = mVar.f188324d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f188326f;
        if (i15 == 0) {
            r.b(obj2);
            oVarD = g22.l.d(o.INSTANCE);
            b63.v vVarF = g22.l.f(b63.v.INSTANCE);
            p0 p0Var = kVar.f188295i;
            mVar.f188321a = str;
            mVar.f188322b = oVarD;
            mVar.f188323c = vVarF;
            mVar.f188326f = 1;
            Object objA = p0.a(p0Var, oVarD, true, mVar, 4);
            if (objA == aVar) {
                return aVar;
            }
            obj = objA;
            vVar = vVarF;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vVar = mVar.f188323c;
            o oVar = mVar.f188322b;
            String str2 = mVar.f188321a;
            r.b(obj2);
            oVarD = oVar;
            str = str2;
            obj = obj2;
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new o13.p(fb.c.INSTANCE, null);
            }
            u0.r();
            return null;
        }
        z zVar = (z) ((v2.b) v2Var).f47386a;
        Iterable iterable = zVar.f74294a;
        if (iterable == null) {
            iterable = j0.f134944a;
        }
        Iterator it = iterable.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u.q(((x) next).f74284k, str, true));
        x xVar = (x) next;
        boolean z14 = zVar.f74298e == l01.e.TIMELINE;
        if (xVar == null) {
            return new o13.p(fb.b.INSTANCE, null);
        }
        b63.u uVarA = (!z14 || (vVar2 = xVar.f74278e) == null) ? q.a(oVarD, vVar) : q.a(oVarD, vVar2);
        m21.b.e eVar = m21.b.e.INSTANCE;
        b11.l lVarB = xVar.b();
        return new o13.p(null, new l4.m((m21.b) eVar, uVarA, lVarB != null ? zf.b.S(lVarB) : null, false, 8, (p005kotlin.jvm.internal.j) null));
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        d01.c cVar = this.f188292f;
        cVar.a();
        cVar.d();
        cVar.k();
        cVar.f();
    }

    public final void z4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f188301o;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.valueOf(z14)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx01/k$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ k(j1 j1Var, m01.g gVar, i iVar, s01.e eVar, e01.a aVar, d01.c cVar, l4 l4Var, boolean z14, p0 p0Var, s01.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j1Var, gVar, iVar, eVar, aVar, cVar, (i14 & 64) != 0 ? null : l4Var, (i14 & 128) != 0 ? false : z14, p0Var, fVar);
    }
}
