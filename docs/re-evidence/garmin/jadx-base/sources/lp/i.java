package lp;

import am.x0;
import am.z0;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llp/i;", "", "Lbn/a;", "historicalActivityTypesRepository", "Llp/j;", "historicalActivitiesChangedUseCase", "<init>", "(Lbn/a;Llp/j;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn.a f114115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f114116b;

    public i(bn.a aVar, j jVar) {
        aVar.getClass();
        jVar.getClass();
        this.f114115a = aVar;
        this.f114116b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable a(i iVar, x0 x0Var, boolean z14, v13.c cVar) {
        g gVar;
        iVar.getClass();
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f114101d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f114101d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(iVar, cVar);
            }
        } else {
            gVar = new g(iVar, cVar);
        }
        Object objB = gVar.f114099b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f114101d;
        if (i15 == 0) {
            r.b(objB);
            bn.a aVar2 = iVar.f114115a;
            gVar.f114098a = x0Var;
            gVar.f114101d = 1;
            objB = bn.a.b(aVar2, z14, gVar, 1);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x0Var = gVar.f114098a;
            r.b(objB);
        }
        v2 v2Var = (v2) objB;
        Map map = v2Var instanceof v2.b ? (Map) ((v2.b) v2Var).f47386a : null;
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (u.q(str, x0Var.f4358a, true)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String activityType = ((dn.b) it.next()).getActivityType();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = activityType.toLowerCase(locale);
                        lowerCase.getClass();
                        x0 x0VarM = z0.m(lowerCase);
                        if (x0VarM != null && !s.g(x0VarM.f4358a, x0Var.f4358a)) {
                            arrayList.add(x0VarM);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
