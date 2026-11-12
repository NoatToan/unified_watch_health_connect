package f11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import b63.v;
import e23.q;
import e23.r;
import g21.f0;
import g21.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import s21.n;
import v01.d1;
import v01.n1;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lf11/j;", "Landroidx/lifecycle/u1;", "Lb63/o;", "date", "Lb11/m;", "mealViewNavArgs", "", "originalLogId", "Lb63/v;", "originalTime", "Lv01/d1;", "getDataUseCase", "Lv01/n1;", "logFoodUseCase", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lb63/o;Lb11/m;Ljava/lang/String;Lb63/v;Lv01/d1;Lv01/n1;Ls01/f;)V", "b", "c", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f67964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b11.m f67965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f67967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f67968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f67969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s01.f f67970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f67971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f67972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f67973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f67974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f67975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f67976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f67977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f67978o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f67979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2 f67980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f67981r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf11/j$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        LOADED,
        LOAD_FAILED,
        LOADING,
        INVALID_CALORIES,
        ERROR,
        SAVED
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf11/j$b;", "data", "Lb11/i$c;", "originalFood", "Lb11/l;", "selectedMeal", "Lb11/f;", "<anonymous>", "(Lf11/j$b;Lb11/i$c;Lb11/l;)Lb11/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.QuickAddViewModel$adjustedDailyNutritionContent$1", f = "QuickAddViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements r<b, b11.i.c, b11.l, t13.d<? super b11.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f67995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.i.c f67996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ b11.l f67997c;

        public d(t13.d<? super d> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(b bVar, b11.i.c cVar, b11.l lVar, t13.d<? super b11.f> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f67995a = bVar;
            dVar2.f67996b = cVar;
            dVar2.f67997c = lVar;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g21.h hVar;
            b bVar = this.f67995a;
            b11.i.c cVar = this.f67996b;
            b11.l lVar = this.f67997c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (bVar == null || (hVar = bVar.f67983b) == null) {
                return null;
            }
            return b11.r.a(hVar.f75429f, cVar, lVar != null ? new Long(lVar.f14331a) : null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf11/j$b;", "data", "Lb11/i$c;", "originalFood", "Lb11/l;", "selectedMeal", "Lg21/f0;", "<anonymous>", "(Lf11/j$b;Lb11/i$c;Lb11/l;)Lg21/f0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.QuickAddViewModel$adjustedMealNutritionContent$1", f = "QuickAddViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements r<b, b11.i.c, b11.l, t13.d<? super f0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f67998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.i.c f67999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ b11.l f68000c;

        public e(t13.d<? super e> dVar) {
            super(4, dVar);
        }

        @Override // e23.r
        public final Object invoke(b bVar, b11.i.c cVar, b11.l lVar, t13.d<? super f0> dVar) {
            e eVar = new e(dVar);
            eVar.f67998a = bVar;
            eVar.f67999b = cVar;
            eVar.f68000c = lVar;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g21.h hVar;
            p next;
            b bVar = this.f67998a;
            b11.i.c cVar = this.f67999b;
            b11.l lVar = this.f68000c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (bVar == null || (hVar = bVar.f67983b) == null) {
                return null;
            }
            Iterator<p> it = hVar.f75430g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                p pVar = next;
                if (lVar != null && pVar.f75473a.f14331a == lVar.f14331a) {
                    break;
                }
            }
            p pVar2 = next;
            if (pVar2 != null) {
                return b11.r.b(pVar2.f75474b, cVar, lVar != null ? new Long(lVar.f14331a) : null);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf11/j$b;", "details", "Lb11/l;", "selectedMeal", "Lg21/p;", "<anonymous>", "(Lf11/j$b;Lb11/l;)Lg21/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.QuickAddViewModel$mealDetails$1", f = "QuickAddViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements q<b, b11.l, t13.d<? super p>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f68001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.l f68002b;

        public f(t13.d<? super f> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(b bVar, b11.l lVar, t13.d<? super p> dVar) {
            f fVar = new f(dVar);
            fVar.f68001a = bVar;
            fVar.f68002b = lVar;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g21.h hVar;
            b bVar = this.f68001a;
            b11.l lVar = this.f68002b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p pVar = null;
            if (bVar == null || (hVar = bVar.f67983b) == null) {
                return null;
            }
            for (p pVar2 : hVar.f75430g) {
                p pVar3 = pVar2;
                if (lVar != null && pVar3.f75473a.f14331a == lVar.f14331a) {
                    pVar = pVar2;
                    break;
                }
            }
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf11/j$b;", "data", "Lb11/f;", "adjustedDaily", "Li53/f;", "Lb11/o;", "<anonymous>", "(Lf11/j$b;Lb11/f;)Li53/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.create.viewmodel.QuickAddViewModel$micronutrientGoalEntries$1", f = "QuickAddViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements q<b, b11.f, t13.d<? super i53.f<? extends b11.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ b f68003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ b11.f f68004b;

        public g(t13.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(b bVar, b11.f fVar, t13.d<? super i53.f<? extends b11.o>> dVar) {
            g gVar = j.this.new g(dVar);
            gVar.f68003a = bVar;
            gVar.f68004b = fVar;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            s21.o oVar;
            List<n> list;
            b bVar = this.f68003a;
            b11.f fVar = this.f68004b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (!j.this.f67970g.e()) {
                return j53.l.b();
            }
            if (bVar == null || (oVar = bVar.f67987f) == null || (list = t.c0(oVar).f156160b) == null) {
                return j53.l.b();
            }
            if (fVar == null) {
                fVar = bVar.f67983b.f75429f;
            }
            b11.f fVar2 = bVar.f67982a.f14319e;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (n nVar : list) {
                arrayList.add(new b11.o(n.b(nVar, false, nVar.f156154d, 0, 55), zf.b.F(xy2.b.z(fVar, nVar.f156152b), xy2.b.z(fVar2, nVar.f156152b))));
            }
            return i53.a.j(arrayList);
        }
    }

    static {
        new a(null);
    }

    public j(o oVar, b11.m mVar, String str, v vVar, d1 d1Var, n1 n1Var, s01.f fVar) {
        oVar.getClass();
        mVar.getClass();
        vVar.getClass();
        d1Var.getClass();
        n1Var.getClass();
        fVar.getClass();
        this.f67964a = oVar;
        this.f67965b = mVar;
        this.f67966c = str;
        this.f67967d = vVar;
        this.f67968e = d1Var;
        this.f67969f = n1Var;
        this.f67970g = fVar;
        p2 p2VarA = q2.a(null);
        this.f67971h = p2VarA;
        p2 p2VarA2 = q2.a(null);
        this.f67972i = p2VarA2;
        b2 b2VarD = s.d(p2VarA2);
        this.f67973j = b2VarD;
        p2 p2VarA3 = q2.a(c.LOADING);
        this.f67974k = p2VarA3;
        this.f67975l = s.d(p2VarA3);
        p2 p2VarA4 = q2.a(null);
        this.f67976m = p2VarA4;
        b2 b2VarD2 = s.d(p2VarA4);
        this.f67977n = b2VarD2;
        r53.u1 u1Var = new r53.u1(b2VarD, b2VarD2, new f(null));
        w9.a aVarA = v1.a(this);
        k2.a aVar = k2.f150703a;
        this.f67978o = s.K(u1Var, aVarA, k2.a.a(aVar, 2), null);
        b2 b2VarK = s.K(s.l(p2VarA2, p2VarA, b2VarD2, new d(null)), v1.a(this), k2.a.a(aVar, 2), null);
        this.f67979p = b2VarK;
        this.f67980q = s.K(s.l(p2VarA2, p2VarA, b2VarD2, new e(null)), v1.a(this), k2.a.a(aVar, 2), null);
        this.f67981r = s.K(new r53.u1(p2VarA2, b2VarK, new g(null)), v1.a(this), k2.a.a(aVar, 2), j53.l.b());
        ge1.b.T(v1.a(this), null, null, new k(this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf11/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf11/j$b;", "", "Lb11/i$c;", "quickAddFood", "Lg21/h;", "dailySummary", "Li53/c;", "Lb11/l;", "meals", "", "isTimelineView", "showMealSelectionError", "Ls21/o;", "micronutrientsSettings", "<init>", "(Lb11/i$c;Lg21/h;Li53/c;ZZLs21/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b11.i.c f67982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g21.h f67983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i53.c<b11.l> f67984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f67985d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f67986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final s21.o f67987f;

        public b(b11.i.c cVar, g21.h hVar, i53.c<b11.l> cVar2, boolean z14, boolean z15, s21.o oVar) {
            cVar.getClass();
            hVar.getClass();
            cVar2.getClass();
            this.f67982a = cVar;
            this.f67983b = hVar;
            this.f67984c = cVar2;
            this.f67985d = z14;
            this.f67986e = z15;
            this.f67987f = oVar;
        }

        public static b a(b bVar, b11.i.c cVar, boolean z14, int i14) {
            if ((i14 & 1) != 0) {
                cVar = bVar.f67982a;
            }
            b11.i.c cVar2 = cVar;
            g21.h hVar = bVar.f67983b;
            i53.c<b11.l> cVar3 = bVar.f67984c;
            boolean z15 = bVar.f67985d;
            if ((i14 & 16) != 0) {
                z14 = bVar.f67986e;
            }
            s21.o oVar = bVar.f67987f;
            cVar2.getClass();
            hVar.getClass();
            cVar3.getClass();
            return new b(cVar2, hVar, cVar3, z15, z14, oVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f67982a, bVar.f67982a) && p005kotlin.jvm.internal.s.g(this.f67983b, bVar.f67983b) && p005kotlin.jvm.internal.s.g(this.f67984c, bVar.f67984c) && this.f67985d == bVar.f67985d && this.f67986e == bVar.f67986e && p005kotlin.jvm.internal.s.g(this.f67987f, bVar.f67987f);
        }

        public final int hashCode() {
            int iG = q6.f.g(q6.f.g(l2.a(this.f67984c, (this.f67983b.hashCode() + (this.f67982a.hashCode() * 31)) * 31, 31), 31, this.f67985d), 31, this.f67986e);
            s21.o oVar = this.f67987f;
            return iG + (oVar == null ? 0 : oVar.hashCode());
        }

        public final String toString() {
            return "QuickAddDetailsData(quickAddFood=" + this.f67982a + ", dailySummary=" + this.f67983b + ", meals=" + this.f67984c + ", isTimelineView=" + this.f67985d + ", showMealSelectionError=" + this.f67986e + ", micronutrientsSettings=" + this.f67987f + ")";
        }

        public /* synthetic */ b(b11.i.c cVar, g21.h hVar, i53.c cVar2, boolean z14, boolean z15, s21.o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(cVar, hVar, cVar2, z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? null : oVar);
        }
    }
}
