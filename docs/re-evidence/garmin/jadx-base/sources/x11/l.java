package x11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b11.v;
import b21.o4;
import b63.o;
import b63.u;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g21.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.u0;
import p13.x;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import s21.n;
import v01.g0;
import v62.s6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx11/l;", "Landroidx/lifecycle/u1;", "Lb21/o4;", "mode", "Lb63/u;", "dateTime", "Lb11/m;", "mealViewNavArgs", "Lv01/g0;", "getDailySummaryUseCase", "Ls01/f;", "nutritionSettingsConfigProvider", "Li53/c;", "Lb11/v;", "scannedItems", "<init>", "(Lb21/o4;Lb63/u;Lb11/m;Lv01/g0;Ls01/f;Li53/c;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f188434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f188435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b11.m f188436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f188437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s01.f f188438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v11.b.e f188439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f188440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g21.h f188441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f188442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f188443j;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188444a;

        static {
            int[] iArr = new int[o4.values().length];
            try {
                iArr[o4.LOG_FOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o4.CREATE_MEAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o4.CREATE_RECIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f188444a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lx11/k;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.viewmodel.ImageRecognitionResultsViewModel$uiState$1", f = "ImageRecognitionResultsViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<r53.j<? super k>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f188445a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super k> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f188445a;
            if (i14 == 0) {
                r.b(obj);
                this.f188445a = 1;
                if (l.x4(l.this, this) == aVar) {
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
        new a(null);
    }

    public l(o4 o4Var, u uVar, b11.m mVar, g0 g0Var, s01.f fVar, i53.c<? extends v> cVar) {
        o4Var.getClass();
        uVar.getClass();
        mVar.getClass();
        g0Var.getClass();
        fVar.getClass();
        cVar.getClass();
        this.f188434a = o4Var;
        this.f188435b = uVar;
        this.f188436c = mVar;
        this.f188437d = g0Var;
        this.f188438e = fVar;
        o13.p pVar = new o13.p(v11.c.ADDED, j0.f134944a);
        v11.c cVar2 = v11.c.RESULT;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        int i14 = 0;
        for (v vVar : cVar) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            arrayList.add(z4(this, i14, vVar, v11.c.RESULT));
            i14 = i15;
        }
        this.f188440g = u0.f(pVar, new o13.p(cVar2, arrayList));
        p2 p2VarA = q2.a(new k(this.f188434a, false, B4(), j53.l.b(), 2, null));
        this.f188442i = p2VarA;
        r53.v vVar2 = new r53.v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f188443j = s.K(vVar2, aVarA, k2.a.f150706c, new k(this.f188434a, false, B4(), j53.l.b(), 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(l lVar, v13.c cVar) {
        m mVar;
        Object value;
        Object value2;
        p2 p2Var = lVar.f188442i;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f188449c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f188449c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(lVar, cVar);
            }
        } else {
            mVar = new m(lVar, cVar);
        }
        Object objA = mVar.f188447a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f188449c;
        if (i15 == 0) {
            r.b(objA);
            if (lVar.f188434a == o4.LOG_FOOD) {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, k.a((k) value, true, false, null, 13)));
                g0 g0Var = lVar.f188437d;
                o oVarB = lVar.f188435b.b();
                mVar.f188449c = 1;
                objA = g0Var.a(oVarB, true, mVar);
                if (objA == aVar) {
                    return aVar;
                }
            }
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, k.a((k) value2, false, false, lVar.y4(), 5)));
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objA);
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            lVar.f188441h = ((k01.b) ((v2.b) v2Var).f47386a).a();
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            lVar.f188441h = null;
        }
        do {
            value2 = p2Var.getValue();
        } while (!p2Var.b(value2, k.a((k) value2, false, false, lVar.y4(), 5)));
        return Unit.INSTANCE;
    }

    public static v11.b.e z4(l lVar, int i14, v vVar, v11.c cVar) {
        lVar.getClass();
        return new v11.b.e(vVar, true, cVar, i14 + "_" + cVar + "_" + vVar.getF14238e().f14253a);
    }

    public final ArrayList A4() {
        ArrayList arrayListS = y.s(this.f188440g.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListS) {
            if (((v11.b.e) obj).f174677b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((v11.b.e) it.next()).f174676a);
        }
        return arrayList2;
    }

    public final boolean B4() {
        ArrayList arrayListS = y.s(this.f188440g.values());
        if (arrayListS.isEmpty()) {
            return false;
        }
        Iterator it = arrayListS.iterator();
        while (it.hasNext()) {
            if (((v11.b.e) it.next()).f174677b) {
                return true;
            }
        }
        return false;
    }

    public final i53.c<v11.b> y4() {
        v11.d dVar;
        g21.p next;
        g21.p pVar;
        i53.c cVarB;
        g21.h hVar;
        s21.o oVar;
        List<n> listB0;
        ArrayList arrayList = new ArrayList();
        v11.c cVar = v11.c.ADDED;
        LinkedHashMap linkedHashMap = this.f188440g;
        Collection collection = (List) linkedHashMap.get(cVar);
        if (collection == null) {
            collection = j0.f134944a;
        }
        Collection collection2 = (List) linkedHashMap.get(v11.c.RESULT);
        if (collection2 == null) {
            collection2 = j0.f134944a;
        }
        int[] iArr = b.f188444a;
        o4 o4Var = this.f188434a;
        int i14 = iArr[o4Var.ordinal()];
        if (i14 == 1) {
            dVar = new v11.d(c22.i.b(R.string.lbl_image_recognition_results_subtitle), null, 2, null);
        } else if (i14 == 2) {
            dVar = new v11.d(c22.i.b(R.string.lbl_select_items_add_meal), null, 2, null);
        } else {
            if (i14 != 3) {
                lc.u0.r();
                return null;
            }
            x0.f23314a.getClass();
            dVar = new v11.d(g2.b(x0.Ie), null, 2, null);
        }
        arrayList.add(new v11.b.C3248b(dVar));
        o4 o4Var2 = o4.LOG_FOOD;
        if (o4Var == o4Var2) {
            v11.d dVar2 = new v11.d(c22.i.b(R.string.calories_edit_button), null, 2, null);
            s62.a.f157643a.getClass();
            arrayList.add(new v11.b.a(dVar2, s6.a(t62.b.f162798a)));
        }
        if (!collection.isEmpty()) {
            arrayList.add(new v11.b.d(new v11.d(c22.i.b(R.string.lbl_added_items), i53.a.a(String.valueOf(collection.size())))));
            arrayList.addAll(collection);
        }
        if (!collection2.isEmpty()) {
            arrayList.add(new v11.b.d(new v11.d(c22.i.b(R.string.lbl_results), null, 2, null)));
            arrayList.addAll(collection2);
        }
        g21.h hVar2 = this.f188441h;
        if (hVar2 != null && o4Var == o4Var2) {
            ArrayList<v> arrayListA4 = A4();
            b11.f fVar = new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
            for (v vVar : arrayListA4) {
                fVar = fVar.d(vVar.E().f(vVar.getF14235b()));
            }
            b11.m mVar = this.f188436c;
            boolean z14 = mVar.f14338a;
            b63.v vVarC = this.f188435b.c();
            b11.k kVar = mVar.f14339b;
            s01.f fVar2 = this.f188438e;
            boolean zA = fVar2.a();
            i53.c<g21.p> cVar2 = hVar2.f75430g;
            ArrayList arrayList2 = new ArrayList(y.r(cVar2, 10));
            Iterator<g21.p> it = cVar2.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f75473a);
            }
            b11.l lVarL = zf.b.L(arrayList2, z14, vVarC, kVar, zA);
            if (lVarL == null) {
                pVar = null;
            } else {
                Iterator<g21.p> it3 = cVar2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!next.f75473a.equals(lVarL));
                pVar = next;
            }
            f0 f0VarG = fVar.g();
            if (!fVar2.e() || (hVar = this.f188441h) == null || (oVar = hVar.f75432i) == null || (listB0 = t.b0(oVar)) == null) {
                cVarB = j53.l.b();
            } else {
                g21.h hVar3 = this.f188441h;
                b11.f fVar3 = hVar3 != null ? hVar3.f75429f : null;
                ArrayList arrayList3 = new ArrayList(y.r(listB0, 10));
                for (n nVar : listB0) {
                    arrayList3.add(new b11.o(nVar, zf.b.F(fVar3 != null ? xy2.b.z(fVar3, nVar.f156152b) : null, xy2.b.z(fVar, nVar.f156152b))));
                }
                cVarB = i53.a.j(arrayList3);
            }
            arrayList.add(new v11.b.c(hVar2, pVar, f0VarG, cVarB));
        }
        return i53.a.e(arrayList);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx11/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
