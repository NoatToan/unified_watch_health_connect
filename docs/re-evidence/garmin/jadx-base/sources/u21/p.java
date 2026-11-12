package u21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.k2;
import r53.p2;
import r53.q2;
import v01.b2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lu21/p;", "Landroidx/lifecycle/u1;", "", "dailyCaloriesGoal", "Ls21/e;", "dailyMacroGoals", "", "Lq01/e;", "allMeals", "Lb63/v;", "dailyTimelineStartTime", "dailyTimelineEndTime", "Ls21/c;", "dailyViewType", "Lv01/p0;", "getMealsUseCase", "Lv01/b2;", "saveMealSettingsUseCase", "<init>", "(Ljava/lang/Integer;Ls21/e;Ljava/util/List;Lb63/v;Lb63/v;Ls21/c;Lv01/p0;Lv01/b2;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f168081n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f168082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s21.e f168083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<q01.e> f168084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.v f168085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.v f168086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s21.c f168087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v01.p0 f168088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f168089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g01.z f168090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f168091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f168092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r53.b2 f168093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b11.j f168094m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lu21/o;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MealCalorieGoalsViewModel$uiState$1", f = "MealCalorieGoalsViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super o>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f168095a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super o> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objY4;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f168095a;
            if (i14 == 0) {
                o13.r.b(obj);
                p pVar = p.this;
                List<q01.e> list = pVar.f168084c;
                this.f168095a = 1;
                if (list == null) {
                    objY4 = pVar.y4(this);
                    if (objY4 != aVar) {
                        objY4 = Unit.INSTANCE;
                    }
                } else {
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(og2.k.P((q01.e) it.next()));
                    }
                    b63.v vVar = pVar.f168085d;
                    b63.v vVar2 = pVar.f168086e;
                    s21.c cVar = pVar.f168087f;
                    pVar.f168090i = new g01.z(arrayList, (Boolean) null, vVar, vVar2, cVar != null ? cVar.b() : null, 2, (p005kotlin.jvm.internal.j) null);
                    ArrayList<q01.e> arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((q01.e) obj2).f141997e) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                    for (q01.e eVar : arrayList2) {
                        int i15 = eVar.f141993a;
                        String str = eVar.f141995c;
                        boolean z14 = eVar.f141998f;
                        int i16 = eVar.f142003k;
                        k01.d dVar = eVar.f142002j;
                        arrayList3.add(new s21.j(i15, str, z14, i16, dVar != null ? dVar.f102022a : null, dVar != null ? dVar.f102025d : null, dVar != null ? dVar.f102024c : null, dVar != null ? dVar.f102026e : null));
                    }
                    pVar.f168091j = arrayList3;
                    pVar.z4(arrayList3);
                    objY4 = Unit.INSTANCE;
                }
                if (objY4 == aVar) {
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

    static {
        new a(null);
    }

    public p(Integer num, s21.e eVar, List<q01.e> list, b63.v vVar, b63.v vVar2, s21.c cVar, v01.p0 p0Var, b2 b2Var) {
        p0Var.getClass();
        b2Var.getClass();
        this.f168082a = num;
        this.f168083b = eVar;
        this.f168084c = list;
        this.f168085d = vVar;
        this.f168086e = vVar2;
        this.f168087f = cVar;
        this.f168088g = p0Var;
        this.f168089h = b2Var;
        p13.j0 j0Var = p13.j0.f134944a;
        this.f168091j = j0Var;
        p2 p2VarA = q2.a(new o(num, j0Var, true, false, false, false, null, 120, null));
        this.f168092k = p2VarA;
        r53.v vVar3 = new r53.v(new b(null), r53.s.d(p2VarA));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f168093l = r53.s.K(vVar3, aVarA, k2.a.f150706c, new o(num, j0Var, true, false, false, false, null, 120, null));
        this.f168094m = new b11.j(0, 0, 0, 7, null);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void A4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168092k;
            value = p2Var.getValue();
        } while (!p2Var.b(value, o.a((o) value, this.f168091j, false, false, false, false, null, 93)));
    }

    public final void B4(int i14, int i15) {
        p2 p2Var;
        Object value;
        o oVarA;
        do {
            p2Var = this.f168092k;
            value = p2Var.getValue();
            oVarA = (o) value;
            Integer num = oVarA.f168047a;
            if (num != null) {
                List<s21.j> list = oVarA.f168048b;
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                for (s21.j jVarA : list) {
                    if (jVarA.f156129a == i14) {
                        jVarA = s21.j.a(jVarA, i15, null, null, null, null, 247);
                    }
                    arrayList.add(jVarA);
                }
                v21.c cVar = v21.c.f175296a;
                b11.j jVar = this.f168094m;
                cVar.getClass();
                List listA = v21.c.a(arrayList, num, jVar, this.f168083b);
                oVarA = o.a(oVarA, listA, false, false, false, !listA.equals(this.f168091j), null, 93);
            }
        } while (!p2Var.b(value, oVarA));
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168092k;
            value = p2Var.getValue();
        } while (!p2Var.b(value, o.a((o) value, null, false, false, false, false, null, 103)));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y4(v13.c cVar) throws Throwable {
        q qVar;
        Object value;
        Object value2;
        Map mapL;
        s21.j jVar;
        Integer num;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f168102c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f168102c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objE0 = qVar.f168100a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f168102c;
        p2 p2Var = this.f168092k;
        if (i15 == 0) {
            o13.r.b(objE0);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, o.a((o) value, null, true, false, false, false, null, 123)));
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            qVar.f168102c = 1;
            v01.p0 p0Var = this.f168088g;
            objE0 = ge1.b.e0(p0Var.f174501d, new v01.o0(true, p0Var, oVarD, false, null), qVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            g01.z zVar = (g01.z) ((v2.b) v2Var).f47386a;
            this.f168090i = zVar;
            List<g01.x> list = zVar != null ? zVar.f74294a : null;
            if (list == null) {
                list = p13.j0.f134944a;
            }
            ArrayList<g01.x> arrayList = new ArrayList();
            for (Object obj : list) {
                if (p005kotlin.jvm.internal.s.g(((g01.x) obj).f74281h, Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            v21.c.f175296a.getClass();
            Integer num2 = this.f168082a;
            if (num2 == null) {
                mapL = p13.k0.f134949a;
                mapL.getClass();
            } else {
                if (num2.intValue() <= 0) {
                    num2 = null;
                }
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        k01.d dVar = ((g01.x) it.next()).f74280g;
                        arrayList2.add(Double.valueOf((((double) ((dVar == null || (num = dVar.f102022a) == null) ? 0 : num.intValue())) / ((double) iIntValue)) * 100.0d));
                    }
                    v21.f.f175333a.getClass();
                    ArrayList arrayListG = v21.f.g(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int i16 = 0;
                    for (Object obj2 : arrayList) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        Integer num3 = ((g01.x) obj2).f74275b;
                        o13.p pVar = num3 != null ? new o13.p(Integer.valueOf(num3.intValue()), arrayListG.get(i16)) : null;
                        if (pVar != null) {
                            arrayList3.add(pVar);
                        }
                        i16 = i17;
                    }
                    mapL = p13.u0.l(arrayList3);
                } else {
                    mapL = p13.k0.f134949a;
                    mapL.getClass();
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (g01.x xVar : arrayList) {
                Integer num4 = xVar.f74275b;
                if (num4 != null) {
                    int iIntValue2 = ((Number) mapL.getOrDefault(num4, 0)).intValue();
                    Integer num5 = xVar.f74275b;
                    if (num5 != null) {
                        int iIntValue3 = num5.intValue();
                        String str = xVar.f74276c;
                        if (str == null) {
                            jVar = null;
                        } else {
                            Boolean bool = xVar.f74283j;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            k01.d dVar2 = xVar.f74280g;
                            jVar = new s21.j(iIntValue3, str, zBooleanValue, iIntValue2, dVar2 != null ? dVar2.f102022a : null, dVar2 != null ? dVar2.f102025d : null, dVar2 != null ? dVar2.f102024c : null, dVar2 != null ? dVar2.f102026e : null);
                        }
                    } else {
                        jVar = null;
                    }
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    arrayList4.add(jVar);
                }
            }
            this.f168091j = arrayList4;
            z4(arrayList4);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "MealCalorieGoalsViewModel", "fetchMeals: error retrieving meals");
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, o.a((o) value2, null, false, false, true, false, null, 107)));
        }
        return Unit.INSTANCE;
    }

    public final void z4(ArrayList arrayList) {
        v21.c.f175296a.getClass();
        this.f168094m = v21.c.b(this.f168083b);
        while (true) {
            p2 p2Var = this.f168092k;
            Object value = p2Var.getValue();
            ArrayList arrayList2 = arrayList;
            if (p2Var.b(value, o.a((o) value, arrayList2, false, false, false, false, null, 121))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu21/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
