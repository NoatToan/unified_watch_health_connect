package wq0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.presentation.edit.EditInsightsViewModel$saveInsightsPreferences$1", f = "EditInsightsViewModel.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f186615b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(l lVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f186615b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f186615b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186614a;
        l lVar = this.f186615b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = lVar.f186610d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, z.a((z) value, true, null, null, false, false, false, 62)));
            List<a0> listB = ((z) lVar.f186610d.getValue()).b();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listB) {
                if (obj2 instanceof a0.b) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a0.b) it.next()).f186582b);
            }
            ar0.a aVar2 = lVar.f186607a;
            this.f186614a = 1;
            aVar2.getClass();
            obj = f0.J(aVar2, new ar0.e(aVar2, arrayList2, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        p2 p2Var2 = lVar.f186610d;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, z.a((z) value2, false, null, null, v2Var instanceof v2.a, false, v2Var instanceof v2.b, 22)));
        return Unit.INSTANCE;
    }
}
