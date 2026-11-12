package c30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lc30/a;", "", "Lc30/e0;", "getCourseSegmentUseCase", "Lz20/l;", "getCourseElevationUseCase", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "Lc30/g;", "addLapCoursePointsUseCase", "<init>", "(Lc30/e0;Lz20/l;Lz20/r;Lc30/g;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23771e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f23772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.l f23773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z20.r f23774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f23775d;

    /* JADX INFO: renamed from: c30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc30/a$a;", "", "", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "segments", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "route", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0347a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<CourseSegmentDTO> f23776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<List<GeoPointDTO>> f23777b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0347a(List<CourseSegmentDTO> list, List<? extends List<GeoPointDTO>> list2) {
            list.getClass();
            list2.getClass();
            this.f23776a = list;
            this.f23777b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0347a)) {
                return false;
            }
            C0347a c0347a = (C0347a) obj;
            return this.f23776a.equals(c0347a.f23776a) && this.f23777b.equals(c0347a.f23777b);
        }

        public final int hashCode() {
            return this.f23777b.hashCode() + (this.f23776a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.f("RouteBuildResult(segments=", ", route=", ")", this.f23776a, this.f23777b);
        }
    }

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public a(e0 e0Var, z20.l lVar, z20.r rVar, g gVar) {
        e0Var.getClass();
        lVar.getClass();
        rVar.getClass();
        gVar.getClass();
        this.f23772a = e0Var;
        this.f23773b = lVar;
        this.f23774c = rVar;
        this.f23775d = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:56:0x0122  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static final Object a(a aVar, a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, List list, v13.c cVar) {
        b bVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        a50.g gVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        List<CourseSegmentDTO> list2;
        List<List<GeoPointDTO>> list3;
        a50.g gVar3;
        List list4;
        ArrayList arrayListB;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        a50.g gVar4;
        ArrayList arrayList;
        k30.u uVar;
        a50.a aVarE;
        long j8;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        List listB1;
        List<ClimbDTO> listB;
        ArrayList arrayList2;
        k30.x unpavedSections;
        List<fn0.b> listD;
        aVar.getClass();
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f23796h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f23796h = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar, cVar);
            }
        } else {
            bVar = new b(aVar, cVar);
        }
        b bVar2 = bVar;
        Object objB = bVar2.f23794f;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f23796h;
        if (i15 == 0) {
            o13.r.b(objB);
            w20.a aVar2 = gVar.f1393d;
            if (aVar2 != null && (eVar = aVar2.f181476a) != null) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar4 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
                bVar2.f23789a = gVar;
                bVar2.f23790b = eVar4;
                bVar2.f23796h = 1;
                objB = aVar.b(gVar, dVar, list, eVar4, bVar2);
                if (objB != obj) {
                    gVar2 = gVar;
                    eVar2 = eVar4;
                }
                return obj;
            }
            return null;
        }
        if (i15 == 1) {
            eVar2 = bVar2.f23790b;
            gVar2 = bVar2.f23789a;
            o13.r.b(objB);
        } else {
            if (i15 == 2) {
                List<List<GeoPointDTO>> list5 = bVar2.f23792d;
                List<CourseSegmentDTO> list6 = bVar2.f23791c;
                com.garmin.android.apps.connectmobile.courses.model.e eVar5 = bVar2.f23790b;
                gVar3 = bVar2.f23789a;
                o13.r.b(objB);
                list3 = list5;
                eVar2 = eVar5;
                list2 = list6;
                list4 = (List) objB;
                if (list4 != null && !list4.isEmpty()) {
                    d30.b.a(list4, list3, list2);
                    d30.b.e(list4, eVar2);
                    d30.b.f(list4, eVar2);
                    arrayListB = d30.b.b(list3, eVar2.h());
                    z20.r rVar = aVar.f23774c;
                    boolean zC = eVar2.m().c();
                    bVar2.f23789a = gVar3;
                    bVar2.f23790b = eVar2;
                    bVar2.f23791c = list2;
                    bVar2.f23792d = list3;
                    bVar2.f23793e = arrayListB;
                    bVar2.f23796h = 3;
                    objB = rVar.a(list4, zC, bVar2);
                    if (objB != obj) {
                        eVar3 = eVar2;
                        gVar4 = gVar3;
                        arrayList = arrayListB;
                    }
                    return obj;
                }
                return null;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList3 = bVar2.f23793e;
            list3 = bVar2.f23792d;
            list2 = bVar2.f23791c;
            eVar3 = bVar2.f23790b;
            gVar4 = bVar2.f23789a;
            o13.r.b(objB);
            arrayList = arrayList3;
        }
        List<List<GeoPointDTO>> list7 = list3;
        List<CourseSegmentDTO> list8 = list2;
        uVar = (k30.u) objB;
        aVarE = gVar4.e();
        if (aVarE != null) {
            j8 = aVarE.f1243d;
        } else {
            j8 = -1;
        }
        long j14 = j8;
        listJ = eVar3.j();
        if (listJ != null) {
            listB1 = p13.h0.b1(listJ);
        } else {
            listB1 = null;
        }
        a50.a aVar3 = new a50.a(arrayList, list7, list8, j14, listB1, eVar3.G(), null);
        g gVar5 = aVar.f23775d;
        if (uVar != null) {
            listB = uVar.b();
        } else {
            listB = null;
        }
        if (uVar != null || (listD = uVar.d()) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList4 = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList4.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList2 = arrayList4;
        }
        if (uVar != null) {
            unpavedSections = uVar.getUnpavedSections();
        } else {
            unpavedSections = null;
        }
        return gVar5.a(a50.g.a(gVar4, false, null, false, new w20.a(eVar3, listB, arrayList2, unpavedSections, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null), false, p13.h0.D0(gVar4.f1396g, aVar3), null, null, 0, false, false, false, false, null, null, 65463));
        C0347a c0347a = (C0347a) objB;
        if (c0347a != null) {
            list2 = c0347a.f23776a;
            List<List<GeoPointDTO>> list9 = c0347a.f23777b;
            z20.l lVar = aVar.f23773b;
            ArrayList arrayListS = p13.y.s(list9);
            bVar2.f23789a = gVar2;
            bVar2.f23790b = eVar2;
            bVar2.f23791c = list2;
            bVar2.f23792d = list9;
            bVar2.f23796h = 2;
            Object objA = lVar.a(eVar2, arrayListS, bVar2);
            if (objA != obj) {
                a50.g gVar6 = gVar2;
                list3 = list9;
                objB = objA;
                gVar3 = gVar6;
                list4 = (List) objB;
                if (list4 != null) {
                    d30.b.a(list4, list3, list2);
                    d30.b.e(list4, eVar2);
                    d30.b.f(list4, eVar2);
                    arrayListB = d30.b.b(list3, eVar2.h());
                    z20.r rVar2 = aVar.f23774c;
                    boolean zC2 = eVar2.m().c();
                    bVar2.f23789a = gVar3;
                    bVar2.f23790b = eVar2;
                    bVar2.f23791c = list2;
                    bVar2.f23792d = list3;
                    bVar2.f23793e = arrayListB;
                    bVar2.f23796h = 3;
                    objB = rVar2.a(list4, zC2, bVar2);
                    if (objB != obj) {
                        eVar3 = eVar2;
                        gVar4 = gVar3;
                        arrayList = arrayListB;
                        List<List<GeoPointDTO>> list10 = list3;
                        List<CourseSegmentDTO> list11 = list2;
                        uVar = (k30.u) objB;
                        aVarE = gVar4.e();
                        if (aVarE != null) {
                            j8 = aVarE.f1243d;
                        } else {
                            j8 = -1;
                        }
                        long j15 = j8;
                        listJ = eVar3.j();
                        if (listJ != null) {
                            listB1 = p13.h0.b1(listJ);
                        } else {
                            listB1 = null;
                        }
                        a50.a aVar4 = new a50.a(arrayList, list10, list11, j15, listB1, eVar3.G(), null);
                        g gVar7 = aVar.f23775d;
                        if (uVar != null) {
                            listB = uVar.b();
                        } else {
                            listB = null;
                        }
                        if (uVar != null) {
                            arrayList2 = null;
                        } else {
                            arrayList2 = null;
                        }
                        if (uVar != null) {
                            unpavedSections = uVar.getUnpavedSections();
                        } else {
                            unpavedSections = null;
                        }
                        return gVar7.a(a50.g.a(gVar4, false, null, false, new w20.a(eVar3, listB, arrayList2, unpavedSections, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null), false, p13.h0.D0(gVar4.f1396g, aVar4), null, null, 0, false, false, false, false, null, null, 65463));
                    }
                }
            }
            return obj;
        }
        return null;
    }

    public static CourseSegmentDTO c(int i14, int i15) {
        CourseSegmentDTO courseSegmentDTO = new CourseSegmentDTO((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
        courseSegmentDTO.j(Integer.valueOf(i14));
        courseSegmentDTO.k(Integer.valueOf(i15));
        return courseSegmentDTO;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, List list, com.garmin.android.apps.connectmobile.courses.model.e eVar, v13.c cVar) {
        c cVar2;
        ArrayList arrayListD1;
        ArrayList arrayListD2;
        List list2;
        Double d14;
        Object objC;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list3;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f23814f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f23814f = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object obj = cVar3.f23812d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f23814f;
        if (i15 == 0) {
            o13.r.b(obj);
            arrayListD1 = p13.h0.d1(gVar.c());
            arrayListD2 = p13.h0.d1(gVar.b());
            if (!gVar.d().isEmpty()) {
                GeoPointDTO geoPointDTO = (GeoPointDTO) p13.h0.d0(list);
                if (geoPointDTO != null && (d14 = geoPointDTO.latitude) != null) {
                    double dDoubleValue = d14.doubleValue();
                    Double d15 = geoPointDTO.longitude;
                    if (d15 != null) {
                        LatLng latLng = new LatLng(dDoubleValue, d15.doubleValue());
                        k30.k kVar = gVar.f1397h;
                        LatLng latLng2 = ((com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(gVar.d())).f50283a;
                        com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
                        boolean z14 = gVar.f1401l;
                        boolean z15 = gVar.f1402m;
                        boolean z16 = gVar.f1403n;
                        list2 = list;
                        cVar3.f23809a = list2;
                        cVar3.f23810b = arrayListD1;
                        cVar3.f23811c = arrayListD2;
                        cVar3.f23814f = 1;
                        objC = this.f23772a.c(kVar, dVar, latLng2, latLng, iVarM, z14, z15, z16, cVar3);
                        if (objC == aVar) {
                            return aVar;
                        }
                        arrayList = arrayListD1;
                        arrayList2 = arrayListD2;
                    }
                }
                return null;
            }
            list2 = list;
            arrayListD2.add(list2);
            arrayListD1.add(c(list2.size(), arrayListD1.size() + 1));
            return new C0347a(arrayListD1, arrayListD2);
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList3 = cVar3.f23811c;
        arrayList = cVar3.f23810b;
        List list4 = cVar3.f23809a;
        o13.r.b(obj);
        arrayList2 = arrayList3;
        list2 = list4;
        objC = obj;
        o13.p pVar = (o13.p) objC;
        if (pVar != null && (list3 = (List) pVar.f128594a) != null) {
            if (list3.isEmpty()) {
                list3 = null;
            }
            if (list3 != null) {
                arrayList2.add(list3);
                arrayList.add(c(list3.size(), arrayList.size() + 1));
                arrayListD2 = arrayList2;
                arrayListD1 = arrayList;
                arrayListD2.add(list2);
                arrayListD1.add(c(list2.size(), arrayListD1.size() + 1));
                return new C0347a(arrayListD1, arrayListD2);
            }
        }
        return null;
    }
}
