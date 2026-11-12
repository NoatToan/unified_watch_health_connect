package q21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import g01.x;
import g01.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.v;
import v01.p0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lq21/m;", "Landroidx/lifecycle/u1;", "", "dailyCaloriesGoal", "Lv01/p0;", "getMealsUseCase", "<init>", "(Ljava/lang/Integer;Lv01/p0;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f142259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f142260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f142261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f142262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f142263e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lq21/l;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.LegacyNutritionMealGoalsViewModel$uiState$1", f = "LegacyNutritionMealGoalsViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super l>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142264a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return m.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super l> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142264a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f142264a = 1;
                if (m.x4(m.this, this) == aVar) {
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

    public m(Integer num, p0 p0Var) {
        p0Var.getClass();
        this.f142259a = num;
        this.f142260b = p0Var;
        p2 p2VarA = q2.a(new l(num, null, false, false, 14, null));
        this.f142262d = p2VarA;
        v vVar = new v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f142263e = r53.s.K(vVar, aVarA, k2.a.f150706c, new l(num, null, true, false, 10, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(m mVar, v13.c cVar) {
        n nVar;
        Object value;
        Object value2;
        Object value3;
        l lVarA;
        Object next;
        p2 p2Var = mVar.f142262d;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f142268c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f142268c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(mVar, cVar);
            }
        } else {
            nVar = new n(mVar, cVar);
        }
        Object objA = nVar.f142266a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f142268c;
        if (i15 == 0) {
            o13.r.b(objA);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, l.a((l) value, null, true, 11)));
            p0 p0Var = mVar.f142260b;
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            nVar.f142268c = 1;
            objA = p0.a(p0Var, oVarD, true, nVar, 4);
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
            mVar.f142261c = zVar;
            Iterable iterable = zVar.f74294a;
            if (iterable == null) {
                iterable = j0.f134944a;
            }
            List listN0 = h0.N0(iterable, new o());
            ArrayList arrayList = new ArrayList();
            Iterator it = listN0.iterator();
            while (true) {
                int i16 = 10;
                if (!it.hasNext()) {
                    break;
                }
                x xVar = (x) it.next();
                b11.g.a aVar2 = b11.g.f14285c;
                String str = xVar.f74276c;
                if (str == null) {
                    str = "";
                }
                aVar2.getClass();
                Iterator<T> it3 = b11.g.f14291i.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!p005kotlin.jvm.internal.s.g(((b11.g) next).f14292a, str));
                b11.g gVar = (b11.g) next;
                int i17 = gVar == null ? -1 : b11.g.a.C0206a.f14294a[gVar.ordinal()];
                if (i17 == 1) {
                    i16 = 25;
                } else if (i17 == 2) {
                    i16 = 30;
                } else if (i17 == 3) {
                    i16 = 35;
                } else if (i17 != 4) {
                    i16 = 0;
                }
                o21.d dVarR = gg.b.R(xVar, i16);
                if (dVarR != null) {
                    arrayList.add(dVarR);
                }
            }
            do {
                value3 = p2Var.getValue();
                l lVar = (l) value3;
                Integer num = mVar.f142259a;
                if (num != null) {
                    int iIntValue = num.intValue();
                    ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        Integer num2 = ((o21.d) it4.next()).f128661d;
                        arrayList2.add(Double.valueOf((((double) (num2 != null ? num2.intValue() : 0)) / ((double) iIntValue)) * 100.0d));
                    }
                    v21.f.f175333a.getClass();
                    ArrayList arrayListG = v21.f.g(arrayList2);
                    ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
                    int i18 = 0;
                    for (Object obj : arrayList) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        arrayList3.add(o21.d.a((o21.d) obj, ((Number) arrayListG.get(i18)).intValue(), null, null, null, null, 123));
                        i18 = i19;
                    }
                    lVarA = l.a(lVar, arrayList3, false, 9);
                } else {
                    lVarA = l.a(lVar, arrayList, false, 9);
                }
            } while (!p2Var.b(value3, lVarA));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionMealGoalsViewModel", "fetchMeals: error retrieving meals");
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, l.a((l) value2, null, false, 3)));
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq21/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
