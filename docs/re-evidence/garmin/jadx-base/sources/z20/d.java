package z20;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz20/d;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f201889b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f201890a;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public d(d60.b bVar) {
        bVar.getClass();
        this.f201890a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, z20.d] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [p13.j0] */
    public static final Object a(d dVar, w20.a aVar, v13.c cVar) {
        a aVar2;
        ?? arrayList;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        Double d14;
        Double d15;
        ArrayList arrayList2;
        List<fn0.b> listD;
        dVar.getClass();
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i14 = aVar2.f201872d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f201872d = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar, cVar);
            }
        } else {
            aVar2 = new a(dVar, cVar);
        }
        Object obj = aVar2.f201870b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f201872d;
        if (i15 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = new com.garmin.android.apps.connectmobile.courses.model.e(aVar.f181476a);
            List list = eVar2.geoPoints;
            if (list == null) {
                list = j0.f134944a;
            }
            int i16 = 0;
            if (list.isEmpty()) {
                arrayList = j0.f134944a;
            } else {
                arrayList = new ArrayList();
                List<CourseSegmentDTO> listI = eVar2.i();
                if (listI == null) {
                    listI = j0.f134944a;
                }
                Iterator<CourseSegmentDTO> it = listI.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    Integer numberOfPoints = it.next().getNumberOfPoints();
                    int iIntValue = (numberOfPoints != null ? numberOfPoints.intValue() : 0) + i17;
                    int size = list.size();
                    if (iIntValue > size) {
                        iIntValue = size;
                    }
                    if (i17 < iIntValue) {
                        arrayList.add(h0.b1(list.subList(i17, iIntValue)));
                    }
                    i17 = iIntValue;
                }
            }
            gl.b.m(list);
            d30.b.e(list, eVar2);
            gl.b.l(eVar2);
            ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
            for (Object obj2 : arrayList) {
                int i18 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                List list2 = (List) obj2;
                CourseSegmentDTO courseSegmentDTO = new CourseSegmentDTO((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
                GeoPointDTO geoPointDTO = (GeoPointDTO) h0.n0(list2);
                double d16 = 0.0d;
                double dDoubleValue = (geoPointDTO == null || (d15 = geoPointDTO.distance) == null) ? 0.0d : d15.doubleValue();
                GeoPointDTO geoPointDTO2 = (GeoPointDTO) h0.d0(list2);
                double dDoubleValue2 = dDoubleValue - ((geoPointDTO2 == null || (d14 = geoPointDTO2.distance) == null) ? 0.0d : d14.doubleValue());
                if (dDoubleValue2 >= 0.0d) {
                    d16 = dDoubleValue2;
                }
                courseSegmentDTO.h(Double.valueOf(d16));
                courseSegmentDTO.j(Integer.valueOf(list2.size()));
                courseSegmentDTO.k(Integer.valueOf(i18));
                arrayList3.add(courseSegmentDTO);
                i16 = i18;
            }
            if (!arrayList3.isEmpty()) {
                eVar2.h0(arrayList3);
            }
            gl1.d.j(eVar2.G(), eVar2, new b30.b(eVar2, 3), new b30.b(eVar2, 4));
            aVar2.f201869a = eVar2;
            aVar2.f201872d = 1;
            Object objB = dVar.b(eVar2, aVar2);
            if (objB == aVar3) {
                return aVar3;
            }
            eVar = eVar2;
            obj = objB;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            com.garmin.android.apps.connectmobile.courses.model.e eVar3 = aVar2.f201869a;
            o13.r.b(obj);
            eVar = eVar3;
        }
        k30.u uVar = (k30.u) obj;
        List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
        if (uVar == null || (listD = uVar.d()) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList4 = new ArrayList(p13.y.r(listD, 10));
            Iterator it3 = listD.iterator();
            while (it3.hasNext()) {
                arrayList4.add(d30.b.d((fn0.b) it3.next()));
            }
            arrayList2 = arrayList4;
        }
        return new w20.a(eVar, listB, arrayList2, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(com.garmin.android.apps.connectmobile.courses.model.e eVar, v13.c cVar) {
        b bVar;
        List<GeoPointDTO> list;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f201877c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f201877c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objC = bVar.f201875a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f201877c;
        if (i15 == 0) {
            o13.r.b(objC);
            if (eVar.m().c() && (list = eVar.geoPoints) != null && !list.isEmpty()) {
                List list2 = eVar.geoPoints;
                if (list2 == null) {
                    list2 = j0.f134944a;
                }
                bVar.f201877c = 1;
                d60.b bVar2 = this.f201890a;
                objC = bVar2.C(new d60.y(list2, bVar2, null), bVar);
                if (objC == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objC);
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            return (k30.u) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return null;
    }
}
