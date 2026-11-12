package c30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc30/y0;", "", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "Lc30/g;", "getAddLapCoursePointsUseCase", "<init>", "(Lz20/r;Lc30/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z20.r f24059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f24060b;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public y0(z20.r rVar, g gVar) {
        rVar.getClass();
        gVar.getClass();
        this.f24059a = rVar;
        this.f24060b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(a50.g gVar, a50.a aVar, v13.c cVar) {
        x0 x0Var;
        a50.g gVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        ArrayList arrayList;
        List<fn0.b> listD;
        a50.a aVar2 = aVar;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f24058f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f24058f = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object obj = x0Var.f24056d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var.f24058f;
        if (i15 == 0) {
            o13.r.b(obj);
            w20.a aVar4 = gVar.f1393d;
            if ((aVar4 != null ? aVar4.f181476a : null) == null) {
                return null;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(gVar.f1393d.f181476a);
            ArrayList arrayListS = p13.y.s(aVar2.f1241b);
            d30.b.e(arrayListS, eVar2);
            boolean zC = eVar2.m().c();
            x0Var.f24053a = gVar;
            x0Var.f24054b = aVar2;
            x0Var.f24055c = eVar2;
            x0Var.f24058f = 1;
            Object objA = this.f24059a.a(arrayListS, zC, x0Var);
            if (objA == aVar3) {
                return aVar3;
            }
            gVar2 = gVar;
            eVar = eVar2;
            obj = objA;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar3 = x0Var.f24055c;
            aVar2 = x0Var.f24054b;
            a50.g gVar3 = x0Var.f24053a;
            o13.r.b(obj);
            eVar = eVar3;
            gVar2 = gVar3;
        }
        k30.u uVar = (k30.u) obj;
        List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
        if (uVar == null || (listD = uVar.d()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList = arrayList2;
        }
        return this.f24060b.a(a50.g.a(gVar2, false, null, false, new w20.a(eVar, listB, arrayList, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null), false, p13.h0.D0(gVar2.f1396g, aVar2), null, null, 0, false, false, false, false, null, null, 65463));
    }
}
