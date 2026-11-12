package qy1;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqy1/k;", "", "<init>", "()V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {
    /* JADX WARN: Code duplicated, block: B:50:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0141  */
    /* JADX WARN: Code duplicated, block: B:53:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, v13.c cVar) {
        j jVar;
        v2 v2Var;
        v2 v2Var2;
        Object next;
        long j14 = j8;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f148585e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f148585e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f148583c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f148585e;
        if (i15 == 0) {
            r.b(objJ);
            zf0.d dVarA = zf0.d.a.a(zf0.d.f204343b);
            jVar.f148581a = j14;
            jVar.f148585e = 1;
            objJ = f0.J(dVarA, new zf0.l(dVarA, j14, null), jVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            j14 = jVar.f148581a;
            r.b(objJ);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = jVar.f148582b;
            r.b(objJ);
        }
        v2Var2 = (v2) objJ;
        if ((v2Var instanceof v2.b) || !(v2Var2 instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            if (v2Var2 instanceof v2.a) {
                return v2Var2;
            }
            return new v2.a(new Exception("Error fetching running event strategy data."), null, null, 6, null);
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        s20.d dVar = s20.d.f156005a;
        List<GeoPointDTO> list = eVar.geoPoints;
        dVar.getClass();
        eVar.intervalMarkers = s20.d.f(list, zY);
        v2.b bVar = (v2.b) v2Var2;
        Iterable<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> iterable = (Iterable) bVar.f47386a;
        ArrayList arrayList = new ArrayList(y.r(iterable, 10));
        for (com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2 : iterable) {
            t41.i.Companion aVar2 = t41.i.INSTANCE;
            t41.i iVar = bVar2.f39768e;
            String str = iVar != null ? iVar.f162321a : null;
            aVar2.getClass();
            t41.i iVarA = t41.i.Companion.a(str);
            t41.a.Companion companion = t41.a.INSTANCE;
            t41.a aVar3 = bVar2.f39769f;
            String str2 = aVar3 != null ? aVar3.f162272a : null;
            companion.getClass();
            Iterator<T> it = t41.a.f162271f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((t41.a) next).f162272a, str2));
            arrayList.add(com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar2, null, null, iVarA, (t41.a) next, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 262095));
        }
        return new v2.b(new my1.f(arrayList, eVar), bVar.f47387b, bVar.f47388c, bVar.f47389d);
        v2 v2Var3 = (v2) objJ;
        r41.a.f150289c.getClass();
        r41.a aVarA = r41.a.C2825a.a();
        Long l14 = new Long(j14);
        jVar.f148582b = v2Var3;
        jVar.f148581a = j14;
        jVar.f148585e = 2;
        Object objJ2 = f0.J(aVarA, new r41.e(aVarA, l14, null), jVar);
        if (objJ2 != aVar) {
            objJ = objJ2;
            v2Var = v2Var3;
            v2Var2 = (v2) objJ;
            if (v2Var instanceof v2.b) {
            }
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            if (v2Var2 instanceof v2.a) {
                return v2Var2;
            }
            return new v2.a(new Exception("Error fetching running event strategy data."), null, null, 6, null);
        }
        return aVar;
    }
}
