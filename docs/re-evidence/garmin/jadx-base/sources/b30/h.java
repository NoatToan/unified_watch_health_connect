package b30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb30/h;", "", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "<init>", "(Lz20/r;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z20.r f15518a;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public h(z20.r rVar) {
        rVar.getClass();
        this.f15518a = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object a(h hVar, w20.a aVar, n30.e eVar, v13.c cVar) {
        f fVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        n30.e eVar4;
        w20.a aVar2;
        List list;
        ArrayList arrayList;
        List<fn0.b> listD;
        hVar.getClass();
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f15511e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f15511e = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(hVar, cVar);
            }
        } else {
            fVar = new f(hVar, cVar);
        }
        Object obj = fVar.f15509c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f15511e;
        if (i15 == 0) {
            o13.r.b(obj);
            eVar2 = aVar.f181476a;
            if (aVar.f181481f) {
                aVar2 = aVar;
                eVar4 = eVar;
            } else {
                List<GeoPointDTO> list2 = eVar2.geoPoints;
                boolean zC = eVar2.m().c();
                z20.r rVar = hVar.f15518a;
                fVar.f15507a = eVar;
                fVar.f15508b = eVar2;
                fVar.f15511e = 1;
                Object objA = rVar.a(list2, zC, fVar);
                if (objA == aVar3) {
                    return aVar3;
                }
                eVar3 = eVar2;
                eVar4 = eVar;
                obj = objA;
            }
            list = eVar2.geoPoints;
            if (list == null) {
                list = j0.f134944a;
            }
            return new n30.f(false, null, false, aVar2, false, p13.w.c(new n30.g(list, eVar2.j(), eVar2.G(), eVar4)), null, 0, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), null, null, 1751, null);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar5 = fVar.f15508b;
        eVar4 = fVar.f15507a;
        o13.r.b(obj);
        eVar3 = eVar5;
        k30.u uVar = (k30.u) obj;
        List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
        if (uVar == null || (listD = uVar.d()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList = arrayList2;
        }
        aVar2 = new w20.a(eVar3, listB, arrayList, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
        eVar2 = eVar3;
        list = eVar2.geoPoints;
        if (list == null) {
            list = j0.f134944a;
        }
        return new n30.f(false, null, false, aVar2, false, p13.w.c(new n30.g(list, eVar2.j(), eVar2.G(), eVar4)), null, 0, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), null, null, 1751, null);
    }
}
