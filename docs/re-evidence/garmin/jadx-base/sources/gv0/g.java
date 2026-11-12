package gv0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.e1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$checkLteSubscriptionStatus$1", f = "LiveTrackSettingsViewModel.kt", l = {821}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f79266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f79268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f79268c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f79268c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<ou0.c> list;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79267b;
        d dVar = this.f79268c;
        if (i14 == 0) {
            o13.r.b(obj);
            List list2 = (List) dVar.L0.getValue();
            Object obj2 = null;
            if (list2 != null) {
                for (Object obj3 : list2) {
                    ou0.c cVar = (ou0.c) obj3;
                    if (cVar.f133973j && cVar.f133971h) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (ou0.c) obj2;
            }
            if (obj2 != null) {
                e1 e1VarF = dVar.f79184b.getF104144a();
                this.f79266a = list2;
                this.f79267b = 1;
                Object objD = e1VarF.d(this);
                if (objD == aVar) {
                    return aVar;
                }
                list = list2;
                obj = objD;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = this.f79266a;
        o13.r.b(obj);
        List list3 = (List) obj;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (ou0.c cVarA : list) {
            if (list3 != null && !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    Long lJ = d53.t.j((String) it.next());
                    long j8 = cVarA.f133964a;
                    if (lJ != null && lJ.longValue() == j8) {
                        cVarA = ou0.c.a(cVarA, null, false, false, false, false, 767);
                        break;
                    }
                }
            }
            arrayList.add(cVarA);
        }
        p2 p2Var = dVar.L0;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, arrayList));
        return Unit.INSTANCE;
    }
}
