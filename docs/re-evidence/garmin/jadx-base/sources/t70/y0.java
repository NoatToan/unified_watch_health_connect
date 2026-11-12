package t70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lj70/b;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.edit.EditSecondaryStatsViewModel$getAvailableSecondaryStat$1", f = "EditSecondaryStatsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.p<v2<? extends List<? extends j70.b>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f163077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(x0 x0Var, t13.d<? super y0> dVar) {
        super(2, dVar);
        this.f163077b = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y0 y0Var = new y0(this.f163077b, dVar);
        y0Var.f163076a = obj;
        return y0Var;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends List<? extends j70.b>> v2Var, t13.d<? super Unit> dVar) {
        return ((y0) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var = (v2) this.f163076a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof v2.b;
        x0 x0Var = this.f163077b;
        if (z14) {
            ArrayList arrayListG = j70.g.g((List) ((v2.b) v2Var).f47386a, x0Var.f163048b.w0());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListG) {
                if (!p005kotlin.jvm.internal.s.g(((j70.b) obj2).getCardType(), o70.t.f130068k0.f130082a)) {
                    arrayList.add(obj2);
                }
            }
            p2 p2Var = x0Var.f163051e;
            Iterable iterable = (Iterable) x0Var.f163049c.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : iterable) {
                if (obj3 instanceof p0.d) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new j70.b(((p0.d) it.next()).f162944a));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList) {
                j70.b bVar = (j70.b) obj4;
                if (!arrayList3.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (!p005kotlin.jvm.internal.s.g(((j70.b) it3.next()).getCardType(), bVar.getCardType()));
                }
                arrayList4.add(obj4);
            }
            p2Var.k(null, arrayList4);
            String strZ4 = x0.z4("dailyStats", arrayList3);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "EditSecondaryStatsViewModel", strZ4);
            i2.a.b(a2Var, "EditSecondaryStatsViewModel", x0.z4("allAvailable", arrayList));
            i2.a.b(a2Var, "EditSecondaryStatsViewModel", x0.z4("otherAvailable", (List) p2Var.getValue()));
            x0Var.f163053g.k(null, Boolean.FALSE);
            x0Var.f163065t.k(null, Boolean.TRUE);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var2 = x0Var.f163053g;
            Boolean bool = Boolean.FALSE;
            p2Var2.k(null, bool);
            x0Var.f163065t.k(null, bool);
        }
        return Unit.INSTANCE;
    }
}
