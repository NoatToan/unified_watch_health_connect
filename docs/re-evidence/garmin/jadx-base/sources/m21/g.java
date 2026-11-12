package m21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.c3;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import g01.x;
import g01.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o53.b0;
import o53.c2;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.v0;
import p13.h0;
import p13.j0;
import p13.t0;
import p13.u0;
import p13.y;
import r53.b2;
import r53.k2;
import r53.m2;
import r53.p2;
import r53.q2;
import r53.z1;
import v01.n1;
import v01.p0;
import yc.h3;
import yc.t2;
import yc.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lm21/g;", "Landroidx/lifecycle/u1;", "Lm21/b;", "mode", "Lb63/u;", "dateTime", "Lb11/k;", "initialMeal", "Lm01/g;", "nutritionRepository", "Lv01/p0;", "getMealsUseCase", "Lv01/n1;", "logFoodUseCase", "Lv01/u;", "deleteCustomFoodUseCase", "Lv01/w;", "deleteRecipeUseCase", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lm21/b;Lb63/u;Lb11/k;Lm01/g;Lv01/p0;Lv01/n1;Lv01/u;Lv01/w;Ls01/f;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f116107v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m21.b f116108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.u f116109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b11.k f116110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m01.g f116111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f116112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f116113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v01.u f116114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v01.w f116115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s01.f f116116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f116117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f116118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<x> f116119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c2 f116120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f116121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f116122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f116123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f116124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f116125r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f116126t;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f116128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f116129c;

        static {
            int[] iArr = new int[k21.a.values().length];
            try {
                iArr[k21.a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k21.a.FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k21.a.MY_FOODS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k21.a.MY_MEALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k21.a.MY_RECIPES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f116127a = iArr;
            int[] iArr2 = new int[d11.h.values().length];
            try {
                iArr2[d11.h.FoodAdded.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[d11.h.RecipeAdded.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[d11.h.Updated.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[d11.h.LimitReached.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f116128b = iArr2;
            int[] iArr3 = new int[b11.b.values().length];
            try {
                iArr3[b11.b.FOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[b11.b.RECIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[b11.b.MEAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f116129c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$getSuggestionsWithDebounce$2", f = "FoodSearchViewModel.kt", l = {282, 283}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116130a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f116132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f116132c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new c(this.f116132c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (m21.g.z4(r5.f116131b, r5.f116132c, r5) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f116130a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f116130a = 1;
                if (m0.b(500L, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            this.f116130a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lm21/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$uiState$1", f = "FoodSearchViewModel.kt", l = {171, TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<r53.j<? super e>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116133a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super e> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        
            if (m21.g.x4(r4, r5) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f116133a;
            g gVar = g.this;
            if (i14 == 0) {
                o13.r.b(obj);
                b63.o oVarB = gVar.f116109b.b();
                this.f116133a = 1;
                if (g.y4(gVar, oVarB, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            g.O4(gVar, null, 3);
            return Unit.INSTANCE;
            this.f116133a = 2;
        }
    }

    static {
        new a(null);
    }

    public g(m21.b bVar, b63.u uVar, b11.k kVar, m01.g gVar, p0 p0Var, n1 n1Var, v01.u uVar2, v01.w wVar, s01.f fVar) {
        bVar.getClass();
        uVar.getClass();
        gVar.getClass();
        p0Var.getClass();
        n1Var.getClass();
        uVar2.getClass();
        wVar.getClass();
        fVar.getClass();
        this.f116108a = bVar;
        this.f116109b = uVar;
        this.f116110c = kVar;
        this.f116111d = gVar;
        this.f116112e = p0Var;
        this.f116113f = n1Var;
        this.f116114g = uVar2;
        this.f116115h = wVar;
        this.f116116i = fVar;
        this.f116119l = j0.f134944a;
        this.f116121n = "";
        w13.c cVar = k21.a.f102452h;
        int iA = t0.a(y.r(cVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        p13.c.b bVar2 = new p13.c.b();
        while (bVar2.hasNext()) {
            Object next = bVar2.next();
            linkedHashMap.put(next, q2.a(j0.f134944a));
        }
        this.f116122o = linkedHashMap;
        this.f116123p = new LinkedHashMap();
        i53.f fVarB = this.f116108a.b(this.f116116i.e());
        m21.b bVar3 = this.f116108a;
        i53.f fVarF4 = F4();
        s01.f fVar2 = this.f116116i;
        p2 p2VarA = q2.a(new e(null, false, false, null, bVar3, null, false, fVarF4, fVarB, null, null, false, false, null, null, false, null, null, null, fVar2.e() && fVar2.c(), 523887, null));
        this.f116124q = p2VarA;
        r53.v vVar = new r53.v(new d(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        i53.f fVarB2 = this.f116108a.b(this.f116116i.e());
        m21.b bVar4 = this.f116108a;
        i53.f fVarF5 = F4();
        s01.f fVar3 = this.f116116i;
        this.f116126t = r53.s.K(vVar, aVarA, m2Var, new e(null, false, true, null, bVar4, null, false, fVarF5, fVarB2, null, null, false, false, null, null, false, null, null, null, fVar3.e() && fVar3.c(), 523883, null));
    }

    public static final void A4(g gVar) {
        Object value;
        p2 p2Var = gVar.f116124q;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, null, false, false, null, new m21.d(new b11.u.a(c22.i.b(R.string.generic_error_message), null, 2, null), null, 2, null), false, null, null, false, false, null, null, false, null, null, null, 1048539)));
    }

    public static void O4(g gVar, f01.j jVar, int i14) {
        String str = gVar.f116121n;
        f01.j jVar2 = (i14 & 2) != 0 ? ((e) gVar.f116126t.f150540a.getValue()).f116087d : jVar;
        p2 p2Var = gVar.f116124q;
        p2Var.k(null, e.a((e) p2Var.getValue(), null, false, false, null, null, false, null, null, false, false, null, u0.i(((e) p2Var.getValue()).f116098o, new o13.p(k21.a.ALL, str.length() > 0 ? gVar.E4(k21.a.ALL, ((e) p2Var.getValue()).f116084a, new u2(50, 0, false, 50, 0, 0, 54, null), new kk1.a(gVar, 16, str, jVar2)) : gVar.E4(k21.a.ALL, ((e) p2Var.getValue()).f116084a, new u2(50, 0, false, 50, 0, 0, 54, null), new l21.f(gVar, 7)))), false, null, null, null, 1032191));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(g gVar, v13.c cVar) {
        r rVar;
        Object value;
        s01.f fVar = gVar.f116116i;
        b63.u uVar = gVar.f116109b;
        p2 p2Var = gVar.f116124q;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f116166c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f116166c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(gVar, cVar);
            }
        } else {
            rVar = new r(gVar, cVar);
        }
        Object objA = rVar.f116164a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f116166c;
        if (i15 == 0) {
            o13.r.b(objA);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, e.a((e) value, null, false, true, null, null, false, null, null, false, false, null, null, false, null, null, null, 1048571)));
            p0 p0Var = gVar.f116112e;
            b63.o oVarB = uVar.b();
            rVar.f116166c = 1;
            objA = p0.a(p0Var, oVarB, false, rVar, 4);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            z zVar = (z) ((v2.b) v2Var).f47386a;
            List<x> list = zVar.f74294a;
            if (list == null) {
                list = j0.f134944a;
            }
            gVar.f116119l = list;
            s21.c.a aVar2 = s21.c.f156079a;
            l01.e eVar = zVar.f74298e;
            boolean zE = fVar.e();
            aVar2.getClass();
            boolean z14 = s21.c.a.a(eVar, zE) == s21.c.TIMELINE;
            List<x> list2 = gVar.f116119l;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                b11.l lVarB = ((x) it.next()).b();
                if (lVarB != null) {
                    arrayList.add(lVarB);
                }
            }
            b11.l lVarL = zf.b.L(arrayList, z14, uVar.c(), gVar.f116110c, fVar.a());
            if (lVarL == null) {
                lVarL = (b11.l) h0.d0(arrayList);
            }
            b11.l lVar = lVarL;
            while (true) {
                Object value2 = p2Var.getValue();
                ArrayList arrayList2 = arrayList;
                if (p2Var.b(value2, e.a((e) value2, null, false, false, null, null, false, null, null, false, false, null, null, false, arrayList2, lVar, lVar != null ? zf.b.S(lVar) : null, 589819))) {
                    break;
                }
                arrayList = arrayList2;
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FoodSearchViewModel", "getMealsUseCase: error retrieving meal");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y4(g gVar, b63.o oVar, v13.c cVar) {
        s sVar;
        Object value;
        Object value2;
        Object value3;
        e eVar;
        l01.e eVar2;
        boolean zE;
        p2 p2Var = gVar.f116124q;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f116169c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f116169c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(gVar, cVar);
            }
        } else {
            sVar = new s(gVar, cVar);
        }
        Object objY = sVar.f116167a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f116169c;
        if (i15 == 0) {
            o13.r.b(objY);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, e.a((e) value, null, false, true, null, null, false, null, null, false, false, null, null, false, null, null, null, 1048571)));
            m01.g gVar2 = gVar.f116111d;
            sVar.f116169c = 1;
            objY = gVar2.Y(oVar, sVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        v2 v2Var = (v2) objY;
        if (v2Var instanceof v2.b) {
            l01.k kVar = (l01.k) ((v2.b) v2Var).f47386a;
            gVar.f116117j = kVar.f107888k;
            gVar.f116118k = kVar.f107889l;
            do {
                value3 = p2Var.getValue();
                eVar = (e) value3;
                s21.c.a aVar2 = s21.c.f156079a;
                eVar2 = kVar.f107894q;
                zE = gVar.f116116i.e();
                aVar2.getClass();
            } while (!p2Var.b(value3, e.a(eVar, null, false, false, null, null, false, null, null, false, false, null, null, s21.c.a.a(eVar2, zE) == s21.c.TIMELINE, null, null, null, 1015807)));
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FoodSearchViewModel", "fetchNutritionSettings: success retrieving nutrition settings");
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "FoodSearchViewModel", "fetchNutritionSettings: error retrieving nutrition settings");
        }
        do {
            value2 = p2Var.getValue();
        } while (!p2Var.b(value2, e.a((e) value2, null, false, false, null, null, false, null, null, false, false, null, null, false, null, null, null, 1048571)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z4(g gVar, String str, v13.c cVar) {
        t tVar;
        Object value;
        Object value2;
        Object value3;
        e eVar;
        List list;
        p2 p2Var = gVar.f116124q;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f116172c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f116172c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(gVar, cVar);
            }
        } else {
            tVar = new t(gVar, cVar);
        }
        Object objT0 = tVar.f116170a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f116172c;
        if (i15 == 0) {
            o13.r.b(objT0);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, e.a((e) value, null, false, false, null, null, false, null, null, true, true, null, null, false, null, null, null, 1042431)));
            m01.g gVar2 = gVar.f116111d;
            String country = gVar.f116117j;
            if (country == null) {
                country = Locale.US.getCountry();
            }
            country.getClass();
            String language = gVar.f116118k;
            if (language == null) {
                language = Locale.ENGLISH.getLanguage();
            }
            language.getClass();
            tVar.f116172c = 1;
            objT0 = gVar2.T0(str, country, language, tVar);
            if (objT0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objT0);
        }
        v2 v2Var = (v2) objT0;
        if (v2Var instanceof v2.b) {
            do {
                value3 = p2Var.getValue();
                eVar = (e) value3;
                list = ((g01.h) ((v2.b) v2Var).f47386a).f74192a;
                if (list == null) {
                    list = j0.f134944a;
                }
            } while (!p2Var.b(value3, e.a(eVar, null, false, false, null, null, false, null, list, false, false, null, null, false, null, null, null, 1047551)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FoodSearchViewModel", "fetchSuggestions: error retrieving search autocomplete suggestions");
        }
        do {
            value2 = p2Var.getValue();
        } while (!p2Var.b(value2, e.a((e) value2, null, false, false, null, null, false, null, null, false, false, null, null, false, null, null, null, 1046527)));
        return Unit.INSTANCE;
    }

    public final void B4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f116124q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, null, false, false, null, null, false, null, null, false, false, null, null, false, null, null, null, 1048511)));
    }

    public final void C4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f116124q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, null, false, false, null, null, false, null, null, false, false, null, null, false, null, null, null, 1048543)));
    }

    public final void D4(m21.a aVar) {
        Object value;
        e eVar;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Object value2;
        Object value3;
        p2 p2Var = this.f116124q;
        k21.a aVar2 = ((e) p2Var.getValue()).f116093j;
        LinkedHashMap linkedHashMap3 = this.f116122o;
        z1 z1Var = (z1) linkedHashMap3.get(aVar2);
        if (z1Var != null) {
            do {
                value3 = z1Var.getValue();
            } while (!z1Var.b(value3, h0.D0((List) value3, aVar)));
        }
        do {
            value = p2Var.getValue();
            eVar = (e) value;
            Map<k21.a, r53.i<yc.v2<g01.n>>> map = eVar.f116098o;
            linkedHashMap = new LinkedHashMap(t0.a(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getKey() == aVar2 ? (r53.i) entry.getValue() : null);
            }
            Map<k21.a, Boolean> map2 = eVar.f116097n;
            linkedHashMap2 = new LinkedHashMap(t0.a(map2.size()));
            Iterator<T> it3 = map2.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(entry2.getKey() != eVar.f116093j));
            }
        } while (!p2Var.b(value, e.a(eVar, null, false, false, null, null, false, null, null, false, false, linkedHashMap2, linkedHashMap, false, null, null, null, 1023999)));
        w13.c cVar = k21.a.f102452h;
        ArrayList<k21.a> arrayList = new ArrayList();
        for (Object obj : cVar) {
            if (((k21.a) obj) != aVar2) {
                arrayList.add(obj);
            }
        }
        for (k21.a aVar3 : arrayList) {
            this.f116123p.remove(aVar3);
            z1 z1Var2 = (z1) linkedHashMap3.get(aVar3);
            if (z1Var2 != null) {
                do {
                    value2 = z1Var2.getValue();
                } while (!z1Var2.b(value2, j0.f134944a));
            }
        }
    }

    public final r53.a2 E4(k21.a aVar, String str, u2 u2Var, e23.a aVar2) {
        r53.i<yc.v2<g01.n>> iVar;
        boolean z14 = !d53.w.J(str);
        LinkedHashMap linkedHashMap = this.f116123p;
        Map map = (Map) linkedHashMap.get(aVar);
        w wVar = map != null ? (w) map.get(Boolean.valueOf(z14)) : null;
        if (wVar == null || !wVar.f116197a.equals(str)) {
            n01.n nVar = new n01.n(aVar2);
            r53.a2 a2VarA = yc.o.a(new t2(u2Var, null, new v0(nVar, 19), 2, null).f196485a, v1.a(this));
            Object linkedHashMap2 = linkedHashMap.get(aVar);
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap.put(aVar, linkedHashMap2);
            }
            ((Map) linkedHashMap2).put(Boolean.valueOf(z14), new w(str, a2VarA, nVar));
            iVar = a2VarA;
        } else {
            iVar = wVar.f116198b;
        }
        return yc.o.a(new r53.u1(iVar, (r53.i) this.f116122o.getOrDefault(aVar, q2.a(j0.f134944a)), new u(this, null)), v1.a(this));
    }

    public final i53.f F4() {
        if (!(this.f116108a instanceof m21.b.e)) {
            return j53.l.b();
        }
        List listK = p13.x.k(m21.c.MENU_ITEM_QUICK_ADD, m21.c.MENU_ITEM_CREATE_FOOD, m21.c.MENU_ITEM_CREATE_RECIPE, m21.c.MENU_ITEM_CREATE_MEAL);
        if (!this.f116116i.e()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                if (((m21.c) obj) != m21.c.MENU_ITEM_CREATE_RECIPE) {
                    arrayList.add(obj);
                }
            }
            listK = arrayList;
        }
        return i53.a.j(listK);
    }

    public final void G4(String str) {
        p2 p2Var;
        Object value;
        c2 c2Var = this.f116120m;
        if (c2Var != null) {
            c2Var.c(null);
        }
        if (!d53.w.J(str) && str.length() > 2) {
            this.f116120m = ge1.b.T(v1.a(this), null, null, new c(str, null), 3);
            return;
        }
        do {
            p2Var = this.f116124q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, null, false, false, null, null, false, null, j0.f134944a, false, false, null, null, false, null, null, null, 1041407)));
    }

    public final void H4(b11.a aVar) {
        c3 c3VarB;
        p2 p2Var;
        Object value;
        aVar.getClass();
        if (aVar instanceof b11.a.c) {
            x0.f23314a.getClass();
            c3VarB = g2.b(x0.Jf);
        } else {
            c3VarB = c22.i.b(R.string.food_added_to_meal);
        }
        m21.d dVar = new m21.d(new b11.u.a(c3VarB, null, 2, null), null, 2, null);
        do {
            p2Var = this.f116124q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, null, false, false, null, dVar, false, null, null, false, false, null, null, false, null, null, null, 1048539)));
    }

    public final void I4(b11.a aVar, boolean z14) {
        c3 c3VarB;
        p2 p2Var;
        Object value;
        String str;
        aVar.getClass();
        if ((aVar instanceof b11.a.C0202a) || (aVar instanceof b11.a.b)) {
            if (z14) {
                x0.f23314a.getClass();
                c3VarB = g2.b(x0.f23647tf);
            } else {
                c3VarB = c22.i.b(R.string.food_added_to_photo);
            }
        } else {
            if (!(aVar instanceof b11.a.c)) {
                lc.u0.r();
                return;
            }
            if (z14) {
                x0.f23314a.getClass();
                str = x0.Mf;
            } else {
                x0.f23314a.getClass();
                str = x0.Kf;
            }
            c3VarB = g2.b(str);
        }
        m21.d dVar = new m21.d(new b11.u.a(c3VarB, null, 2, null), null, 2, null);
        do {
            p2Var = this.f116124q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, null, false, false, null, dVar, false, null, null, false, false, null, null, false, null, null, null, 1048539)));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    public final void J4(Long l14, b11.b bVar) {
        Object next;
        Object aVar;
        c3 c3VarB;
        p2 p2Var;
        Object value;
        bVar.getClass();
        b2 b2Var = this.f116126t;
        Iterator<T> it = ((e) b2Var.f150540a.getValue()).f116100q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long j8 = ((b11.l) next).f14331a;
            if (l14 != null && j8 == l14.longValue()) {
                break;
            }
        }
        b11.l lVar = (b11.l) next;
        if (lVar == null) {
            lVar = ((e) b2Var.f150540a.getValue()).f116101r;
        }
        if (lVar != null && lVar.f14333c) {
            aVar = new b11.u.b(lVar.f14332b);
        } else if (lVar != null) {
            String str = lVar.f14332b;
            if (lVar.f14333c) {
                aVar = new b11.u.a(c22.i.b(b11.c.SNACKS.f14251b), null, 2, null);
            } else {
                b11.c.f14245d.getClass();
                c3 c3VarA = b11.c.a.a(str);
                aVar = c3VarA != null ? new b11.u.a(c3VarA, null, 2, null) : new b11.u.b(str);
            }
        } else {
            aVar = new b11.u.a(c22.i.b(b11.c.SNACKS.f14251b), null, 2, null);
        }
        int i14 = b.f116129c[bVar.ordinal()];
        if (i14 == 1) {
            c3VarB = c22.i.b(R.string.food_logged_to_meal);
        } else if (i14 == 2) {
            x0.f23314a.getClass();
            c3VarB = g2.b(x0.Of);
        } else {
            if (i14 != 3) {
                lc.u0.r();
                return;
            }
            c3VarB = c22.i.b(R.string.meal_logged_to_meal);
        }
        m21.d dVar = new m21.d(new b11.u.a(c3VarB, null, 2, null), p13.w.c(aVar));
        do {
            p2Var = this.f116124q;
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, null, false, false, null, dVar, false, null, null, false, false, null, null, false, null, null, null, 1048539)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4 A[LOOP:0: B:21:0x006f->B:28:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final void K4(d11.h hVar) {
        o13.p pVar;
        o13.p pVar2;
        g2 g2Var;
        String str;
        boolean zBooleanValue;
        p2 p2Var;
        Object value;
        e eVar;
        m21.d dVar;
        int i14 = b.f116128b[hVar.ordinal()];
        int i15 = 2;
        ?? r14 = 0;
        if (i14 == 1) {
            x0.f23314a.getClass();
            pVar = new o13.p(g2.b(x0.f23631sf), Boolean.FALSE);
        } else if (i14 != 2) {
            if (i14 == 3) {
                x0.f23314a.getClass();
                pVar = new o13.p(g2.b(x0.f23679vf), Boolean.FALSE);
            } else {
                if (i14 != 4) {
                    lc.u0.r();
                    return;
                }
                pVar2 = new o13.p(null, Boolean.TRUE);
            }
            g2Var = (g2) pVar2.f128594a;
            if (g2Var != null) {
                str = g2Var.f23059a;
            } else {
                str = null;
            }
            zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
            while (true) {
                p2Var = this.f116124q;
                value = p2Var.getValue();
                eVar = (e) value;
                if (str != null) {
                    dVar = new m21.d(new b11.u.a(g2.b(str), r14, i15, r14), r14, i15, r14);
                } else {
                    dVar = r14;
                }
                if (p2Var.b(value, e.a(eVar, null, false, false, null, dVar, zBooleanValue, null, null, false, false, null, null, false, null, null, null, 1048475))) {
                    return;
                }
                i15 = 2;
                r14 = 0;
            }
        } else {
            x0.f23314a.getClass();
            pVar = new o13.p(g2.b(x0.Lf), Boolean.FALSE);
        }
        pVar2 = pVar;
        g2Var = (g2) pVar2.f128594a;
        if (g2Var != null) {
            str = g2Var.f23059a;
        } else {
            str = null;
        }
        zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
        while (true) {
            p2Var = this.f116124q;
            value = p2Var.getValue();
            eVar = (e) value;
            if (str != null) {
                dVar = new m21.d(new b11.u.a(g2.b(str), r14, i15, r14), r14, i15, r14);
            } else {
                dVar = r14;
            }
            if (p2Var.b(value, e.a(eVar, null, false, false, null, dVar, zBooleanValue, null, null, false, false, null, null, false, null, null, null, 1048475))) {
                return;
            }
            i15 = 2;
            r14 = 0;
        }
    }

    public final void L4(k21.a aVar) {
        p2 p2Var;
        Object value;
        e eVar;
        Object value2;
        aVar.getClass();
        do {
            p2Var = this.f116124q;
            value = p2Var.getValue();
            eVar = (e) value;
        } while (!p2Var.b(value, e.a(eVar, null, false, false, null, null, false, null, null, false, false, u0.i(eVar.f116097n, new o13.p(aVar, Boolean.FALSE)), null, false, null, null, null, 1040383)));
        z1 z1Var = (z1) this.f116122o.get(aVar);
        if (z1Var != null) {
            do {
                value2 = z1Var.getValue();
            } while (!z1Var.b(value2, j0.f134944a));
        }
    }

    public final void M4() {
        p2 p2Var;
        Object value;
        e eVar;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        this.f116123p.clear();
        Iterator it = this.f116122o.values().iterator();
        while (it.hasNext()) {
            ((z1) it.next()).setValue(j0.f134944a);
        }
        do {
            p2Var = this.f116124q;
            value = p2Var.getValue();
            eVar = (e) value;
            Map<k21.a, r53.i<yc.v2<g01.n>>> map = eVar.f116098o;
            k21.a aVar = eVar.f116093j;
            linkedHashMap = new LinkedHashMap(t0.a(map.size()));
            Iterator<T> it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                linkedHashMap.put(entry.getKey(), entry.getKey() == aVar ? (r53.i) entry.getValue() : null);
            }
            Map<k21.a, Boolean> map2 = eVar.f116097n;
            linkedHashMap2 = new LinkedHashMap(t0.a(map2.size()));
            Iterator<T> it4 = map2.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it4.next();
                linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(entry2.getKey() == aVar));
            }
        } while (!p2Var.b(value, e.a(eVar, null, false, false, null, null, false, null, null, false, false, linkedHashMap2, linkedHashMap, false, null, null, null, 1023999)));
    }

    public final void N4(String str, k21.a aVar) {
        str.getClass();
        aVar.getClass();
        c2 c2Var = this.f116120m;
        if (c2Var != null) {
            c2Var.c(null);
        }
        String str2 = str;
        this.f116121n = str2;
        while (true) {
            p2 p2Var = this.f116124q;
            Object value = p2Var.getValue();
            if (p2Var.b(value, e.a((e) value, str2, true, false, null, null, false, null, j0.f134944a, false, false, null, null, false, null, null, null, 1041404))) {
                S4(aVar);
                return;
            }
            str2 = str;
        }
    }

    public final void P4(b11.l lVar) {
        Object value;
        lVar.getClass();
        p2 p2Var = this.f116124q;
        if (lVar.equals(((e) p2Var.getValue()).f116101r)) {
            return;
        }
        this.f116123p.put(k21.a.ALL, new LinkedHashMap());
        O4(this, null, 3);
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, null, false, false, null, null, false, null, null, false, false, null, null, false, null, lVar, zf.b.S(lVar), 655359)));
    }

    public final void Q4(k21.a aVar) {
        boolean z14 = !d53.w.J(((e) this.f116124q.getValue()).f116084a);
        Map map = (Map) this.f116123p.get(aVar);
        w wVar = map != null ? (w) map.get(Boolean.valueOf(z14)) : null;
        if (wVar != null) {
            h3<Integer, g01.n> h3Var = wVar.f116199c.f122149b;
            n01.g gVar = h3Var instanceof n01.g ? (n01.g) h3Var : null;
            if (gVar != null) {
                gVar.f122127b++;
            }
        }
    }

    public final void R4(f01.j jVar) {
        p2 p2Var = this.f116124q;
        if (jVar == ((e) p2Var.getValue()).f116087d) {
            return;
        }
        while (true) {
            Object value = p2Var.getValue();
            p2 p2Var2 = p2Var;
            if (p2Var2.b(value, e.a((e) value, null, false, false, jVar, null, false, null, null, false, false, null, null, false, null, null, null, 1048567))) {
                this.f116123p.put(k21.a.ALL, new LinkedHashMap());
                O4(this, jVar, 1);
                return;
            }
            p2Var = p2Var2;
        }
    }

    public final void S4(k21.a aVar) {
        int i14 = b.f116127a[aVar.ordinal()];
        p2 p2Var = this.f116124q;
        boolean z14 = true;
        if (i14 == 1) {
            if (((e) p2Var.getValue()).f116084a.length() == 0 && this.f116125r) {
                while (true) {
                    Object value = p2Var.getValue();
                    e eVar = (e) value;
                    Map<k21.a, Boolean> map = eVar.f116097n;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(map.size()));
                    Iterator<T> it = map.entrySet().iterator();
                    while (true) {
                        boolean z15 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        if (entry.getKey() == k21.a.ALL) {
                            z15 = z14;
                        }
                        linkedHashMap.put(key, Boolean.valueOf(z15));
                    }
                    if (p2Var.b(value, e.a(eVar, null, false, false, null, null, false, null, null, false, false, linkedHashMap, null, false, null, null, null, 1040383))) {
                        break;
                    } else {
                        z14 = true;
                    }
                }
                this.f116125r = false;
            }
            O4(this, null, 3);
            return;
        }
        if (i14 == 2) {
            final String str = this.f116121n;
            k21.a aVar2 = k21.a.FAVORITES;
            final int i15 = 1;
            p2Var.k(null, e.a((e) p2Var.getValue(), null, false, false, null, null, false, null, null, false, false, null, u0.i(((e) p2Var.getValue()).f116098o, new o13.p(aVar2, E4(aVar2, str, new u2(50, 0, false, 50, 0, 0, 54, null), new e23.a(this) { // from class: m21.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f116105b;

                {
                    this.f116105b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    String str2 = str;
                    g gVar = this.f116105b;
                    switch (i16) {
                        case 0:
                            int i17 = g.f116107v;
                            return new n01.a(gVar.f116111d, str2);
                        case 1:
                            int i18 = g.f116107v;
                            return new n01.e(gVar.f116111d, gVar.f116108a, str2);
                        case 2:
                            int i19 = g.f116107v;
                            return new n01.o(gVar.f116111d, str2, gVar.f116108a);
                        default:
                            int i24 = g.f116107v;
                            return new n01.c(gVar.f116111d, str2, gVar.f116108a);
                    }
                }
            }))), false, null, null, null, 1032191));
            return;
        }
        if (i14 == 3) {
            final String str2 = this.f116121n;
            if (str2.length() <= 0) {
                str2 = null;
            }
            k21.a aVar3 = k21.a.MY_FOODS;
            final int i16 = 0;
            p2Var.k(null, e.a((e) p2Var.getValue(), null, false, false, null, null, false, null, null, false, false, null, u0.i(((e) p2Var.getValue()).f116098o, new o13.p(aVar3, E4(aVar3, str2 != null ? str2 : "", new u2(20, 0, false, 20, 0, 0, 54, null), new e23.a(this) { // from class: m21.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f116105b;

                {
                    this.f116105b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    String str3 = str2;
                    g gVar = this.f116105b;
                    switch (i17) {
                        case 0:
                            int i18 = g.f116107v;
                            return new n01.a(gVar.f116111d, str3);
                        case 1:
                            int i19 = g.f116107v;
                            return new n01.e(gVar.f116111d, gVar.f116108a, str3);
                        case 2:
                            int i110 = g.f116107v;
                            return new n01.o(gVar.f116111d, str3, gVar.f116108a);
                        default:
                            int i24 = g.f116107v;
                            return new n01.c(gVar.f116111d, str3, gVar.f116108a);
                    }
                }
            }))), false, null, null, null, 1032191));
            return;
        }
        if (i14 == 4) {
            final String str3 = this.f116121n;
            if (str3.length() <= 0) {
                str3 = null;
            }
            k21.a aVar4 = k21.a.MY_MEALS;
            final int i17 = 3;
            p2Var.k(null, e.a((e) p2Var.getValue(), null, false, false, null, null, false, null, null, false, false, null, u0.i(((e) p2Var.getValue()).f116098o, new o13.p(aVar4, E4(aVar4, str3 != null ? str3 : "", new u2(20, 0, false, 20, 0, 0, 54, null), new e23.a(this) { // from class: m21.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f116105b;

                {
                    this.f116105b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i18 = i17;
                    String str4 = str3;
                    g gVar = this.f116105b;
                    switch (i18) {
                        case 0:
                            int i19 = g.f116107v;
                            return new n01.a(gVar.f116111d, str4);
                        case 1:
                            int i110 = g.f116107v;
                            return new n01.e(gVar.f116111d, gVar.f116108a, str4);
                        case 2:
                            int i111 = g.f116107v;
                            return new n01.o(gVar.f116111d, str4, gVar.f116108a);
                        default:
                            int i24 = g.f116107v;
                            return new n01.c(gVar.f116111d, str4, gVar.f116108a);
                    }
                }
            }))), false, null, null, null, 1032191));
            return;
        }
        if (i14 != 5) {
            lc.u0.r();
            return;
        }
        final String str4 = this.f116121n;
        if (str4.length() <= 0) {
            str4 = null;
        }
        k21.a aVar5 = k21.a.MY_RECIPES;
        final int i18 = 2;
        p2Var.k(null, e.a((e) p2Var.getValue(), null, false, false, null, null, false, null, null, false, false, null, u0.i(((e) p2Var.getValue()).f116098o, new o13.p(aVar5, E4(aVar5, str4 != null ? str4 : "", new u2(20, 0, false, 20, 0, 0, 54, null), new e23.a(this) { // from class: m21.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f116105b;

            {
                this.f116105b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                String str5 = str4;
                g gVar = this.f116105b;
                switch (i19) {
                    case 0:
                        int i110 = g.f116107v;
                        return new n01.a(gVar.f116111d, str5);
                    case 1:
                        int i111 = g.f116107v;
                        return new n01.e(gVar.f116111d, gVar.f116108a, str5);
                    case 2:
                        int i112 = g.f116107v;
                        return new n01.o(gVar.f116111d, str5, gVar.f116108a);
                    default:
                        int i24 = g.f116107v;
                        return new n01.c(gVar.f116111d, str5, gVar.f116108a);
                }
            }
        }))), false, null, null, null, 1032191));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm21/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
