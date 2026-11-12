package ky0;

import am.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMultiDayActivityDetails$8", f = "MultiDayActivitiesDetailViewModel.kt", l = {459}, m = "invokeSuspend", v = 2)
public final class l1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(w0 w0Var, t13.d<? super l1> dVar) {
        super(2, dVar);
        this.f107414b = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l1(this.f107414b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Iterable iterableB;
        Object value;
        sy0.c cVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107413a;
        w0 w0Var = this.f107414b;
        if (i14 == 0) {
            o13.r.b(obj);
            Iterable<cy0.n> iterable = (Iterable) w0Var.M0.getValue();
            ArrayList arrayList = new ArrayList();
            for (cy0.n nVar : iterable) {
                am.x0 x0VarM = am.z0.m(nVar.getActivityTypeKey());
                am.x0 x0VarG = x0VarM != null ? am.z0.g(x0VarM) : null;
                if (x0VarG == am.x0.f4304m) {
                    x0VarG = null;
                }
                if (x0VarG == null) {
                    x0VarG = am.z0.m(nVar.getActivityTypeKey());
                }
                if (x0VarG != null) {
                    d2.f107276a.getClass();
                    iterableB = d2.b(x0VarG);
                    if (iterableB == null) {
                        iterableB = p13.j0.f134944a;
                    }
                } else {
                    iterableB = p13.j0.f134944a;
                }
                p13.d0.v(arrayList, iterableB);
            }
            Set<ls.e> setG1 = p13.h0.g1(arrayList);
            ArrayList arrayList2 = new ArrayList(p13.y.r(setG1, 10));
            for (ls.e eVar : setG1) {
                d2.f107276a.getClass();
                arrayList2.add(d2.a(eVar));
            }
            gy0.x0 x0Var = (gy0.x0) w0Var.f107622x.getValue();
            String str = w0Var.f107579b;
            String str2 = ((sy0.t) w0Var.f107605n1.f150540a.getValue()).f161283b;
            this.f107413a = 1;
            obj = x0Var.a(str, arrayList2, str2, true, this);
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
        List list = (List) obj;
        if (list != null) {
            p2 p2Var = w0Var.U0;
            do {
                value = p2Var.getValue();
                am.w0 w0Var2 = (am.w0) p13.h0.d0(list);
                if (w0Var2 != null) {
                    Map<String, Map<String, i2>> mapF = w0Var2.f();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(p13.t0.a(mapF.size()));
                    Iterator<T> it = mapF.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        linkedHashMap.put(entry.getKey(), i53.a.g((Map) entry.getValue()));
                    }
                    cVar = new sy0.c(i53.a.g(linkedHashMap));
                } else {
                    cVar = null;
                }
            } while (!p2Var.b(value, cVar));
        }
        return Unit.INSTANCE;
    }
}
