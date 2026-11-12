package q21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import g01.x;
import g01.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.LegacyEditMealGoalsViewModel$saveMealGoals$1", f = "LegacyEditMealGoalsViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f142222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f142223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f142223c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f142223c, dVar);
        cVar.f142222b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object objO;
        Object next;
        k01.d dVarA;
        Object value3;
        Object value4;
        b0 b0Var = (b0) this.f142222b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142221a;
        b bVar = this.f142223c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = bVar.f142215f;
            p2 p2Var2 = bVar.f142215f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, a.a((a) value, null, true, false, false, false, 59)));
            z zVar = bVar.f142211b;
            if (zVar != null) {
                List<x> list = zVar.f74294a;
                if (list != null) {
                    arrayList = new ArrayList(y.r(list, 10));
                    for (x xVar : list) {
                        Iterator<T> it = ((a) p2Var2.getValue()).f142203b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            long j8 = ((o21.d) next).f128658a;
                            Long l14 = xVar.f74274a;
                            if (l14 != null && j8 == l14.longValue()) {
                                break;
                            }
                        }
                        o21.d dVar = (o21.d) next;
                        k01.d dVar2 = xVar.f74280g;
                        if (dVar2 != null) {
                            dVarA = k01.d.a(dVar2, dVar != null ? dVar.f128661d : null, dVar != null ? dVar.f128663f : null, dVar != null ? dVar.f128662e : null, dVar != null ? dVar.f128664g : null);
                        } else {
                            dVarA = null;
                        }
                        arrayList.add(x.a(xVar, null, null, dVarA, 4031));
                    }
                } else {
                    arrayList = null;
                }
                z zVarA = z.a(zVar, arrayList, null, null, null, 30);
                m01.g gVar = bVar.f142212c;
                int iB = bVar.f142214e.b();
                b63.o oVarD = g22.l.d(b63.o.INSTANCE);
                this.f142222b = b0Var;
                this.f142221a = 1;
                objO = gVar.o(iB, oVarD, zVarA, this);
                if (objO == aVar) {
                    return aVar;
                }
            } else {
                a2 a2Var = a2.NUTRITION;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "EditMealGoalsViewModel", "saveMealGoals: failed to save meals, initialMeals is null");
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, a.a((a) value2, null, false, false, true, false, 43)));
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objO = obj;
        v2 v2Var = (v2) objO;
        if (v2Var instanceof v2.b) {
            bVar.f142213d.d();
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "EditMealGoalsViewModel", "saveMealGoals: meals saved successfully");
            p2 p2Var3 = bVar.f142215f;
            do {
                value4 = p2Var3.getValue();
            } while (!p2Var3.b(value4, a.a((a) value4, null, false, true, false, false, 51)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "EditMealGoalsViewModel", "saveMealGoals: failed to save meals");
            p2 p2Var4 = bVar.f142215f;
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, a.a((a) value3, null, false, false, true, false, 43)));
        }
        return Unit.INSTANCE;
    }
}
