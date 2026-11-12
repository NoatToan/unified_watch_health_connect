package c30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc30/b1;", "", "Lc30/e0;", "getCourseSegmentUseCase", "Lz20/l;", "getCourseElevationUseCase", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "Lc30/g;", "addLapCoursePointsUseCase", "<init>", "(Lc30/e0;Lz20/l;Lz20/r;Lc30/g;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23804e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f23805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.l f23806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z20.r f23807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f23808d;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public b1(e0 e0Var, z20.l lVar, z20.r rVar, g gVar) {
        e0Var.getClass();
        lVar.getClass();
        rVar.getClass();
        gVar.getClass();
        this.f23805a = e0Var;
        this.f23806b = lVar;
        this.f23807c = rVar;
        this.f23808d = gVar;
    }

    public static CourseSegmentDTO b(int i14, int i15) {
        CourseSegmentDTO courseSegmentDTO = new CourseSegmentDTO((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
        courseSegmentDTO.j(Integer.valueOf(i14));
        courseSegmentDTO.k(Integer.valueOf(i15));
        return courseSegmentDTO;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x020a  */
    /* JADX WARN: Code duplicated, block: B:57:0x027c  */
    /* JADX WARN: Code duplicated, block: B:61:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final Object a(a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, ArrayList arrayList, int i14, boolean z14, v13.c cVar) {
        z0 z0Var;
        e0 e0Var;
        int i15;
        com.garmin.android.library.mapsdkadapter.i.d dVar2;
        boolean z15;
        int i16;
        List list;
        List list2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        List list3;
        a50.g gVar2;
        Object objC;
        a50.g gVar3;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        List list4;
        int i17;
        List list5;
        List list6;
        boolean z16;
        int i18;
        boolean z17;
        int i19;
        List list7;
        List list8;
        Serializable serializableC;
        a50.g gVar4;
        com.garmin.android.apps.connectmobile.courses.model.e eVar4;
        List list9;
        com.garmin.android.library.mapsdkadapter.i.d dVar3;
        List list10;
        List list11;
        int i24;
        List list12;
        Object objA;
        a50.g gVar5;
        List list13;
        List list14;
        com.garmin.android.apps.connectmobile.courses.model.e eVar5;
        int i25;
        boolean z18;
        o13.p pVar;
        List list15;
        List list16;
        boolean z19;
        List list17;
        a50.g gVar6;
        List list18;
        ArrayList arrayList2;
        List<fn0.b> listD;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i26 = z0Var.f24072k;
            if ((i26 & Integer.MIN_VALUE) != 0) {
                z0Var.f24072k = i26 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        z0 z0Var2 = z0Var;
        Object objA2 = z0Var2.f24070i;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i27 = z0Var2.f24072k;
        e0 e0Var2 = this.f23805a;
        if (i27 == 0) {
            o13.r.b(objA2);
            ArrayList arrayListD1 = p13.h0.d1(gVar.b());
            ArrayList arrayListD2 = p13.h0.d1(gVar.c());
            if (i14 > 0) {
                k30.k kVar = gVar.f1397h;
                LatLng latLng = ((com.garmin.android.library.mapsdkadapter.f) arrayList.get(i14 - 1)).f50283a;
                LatLng latLng2 = ((com.garmin.android.library.mapsdkadapter.f) arrayList.get(i14)).f50283a;
                com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
                boolean z24 = gVar.f1401l;
                boolean z25 = gVar.f1402m;
                boolean z26 = gVar.f1403n;
                z0Var2.f24062a = gVar;
                z0Var2.f24063b = dVar;
                z0Var2.f24064c = eVar;
                z0Var2.f24065d = arrayList;
                z0Var2.f24066e = arrayListD1;
                z0Var2.f24067f = arrayListD2;
                z0Var2.f24068g = i14;
                z0Var2.f24069h = z14;
                z0Var2.f24072k = 1;
                e0Var = e0Var2;
                i15 = 2;
                objC = e0Var.c(kVar, dVar, latLng, latLng2, iVarM, z24, z25, z26, z0Var2);
                if (objC != aVar) {
                    gVar3 = gVar;
                    dVar2 = dVar;
                    eVar3 = eVar;
                    list4 = arrayList;
                    i17 = i14;
                    list5 = arrayListD1;
                    list6 = arrayListD2;
                    z16 = z14;
                }
            } else {
                e0Var = e0Var2;
                i15 = 2;
                dVar2 = dVar;
                z15 = z14;
                i16 = i14;
                list = arrayListD1;
                list2 = arrayListD2;
                eVar2 = eVar;
                list3 = arrayList;
                gVar2 = gVar;
                if (i16 < list3.size() - 1) {
                    k30.k kVar2 = gVar2.f1397h;
                    LatLng latLng3 = ((com.garmin.android.library.mapsdkadapter.f) list3.get(i16)).f50283a;
                    LatLng latLng4 = ((com.garmin.android.library.mapsdkadapter.f) list3.get(i16 + 1)).f50283a;
                    com.garmin.android.apps.connectmobile.courses.model.i iVarM2 = eVar2.m();
                    boolean z27 = gVar2.f1401l;
                    boolean z28 = gVar2.f1402m;
                    boolean z29 = gVar2.f1403n;
                    z0Var2.f24062a = gVar2;
                    z0Var2.f24063b = dVar2;
                    z0Var2.f24064c = eVar2;
                    z0Var2.f24065d = list3;
                    z0Var2.f24066e = list;
                    z0Var2.f24067f = list2;
                    z0Var2.f24068g = i16;
                    z0Var2.f24069h = z15;
                    z0Var2.f24072k = i15;
                    z17 = z15;
                    i19 = i16;
                    list7 = list;
                    list8 = list2;
                    serializableC = e0Var.c(kVar2, dVar2, latLng3, latLng4, iVarM2, z27, z28, z29, z0Var2);
                    if (serializableC != aVar) {
                        gVar4 = gVar2;
                        eVar4 = eVar2;
                        list9 = list3;
                        objA2 = serializableC;
                        dVar3 = dVar2;
                        list10 = list8;
                        list11 = list7;
                        i24 = i19;
                        pVar = (o13.p) objA2;
                        if (pVar != null) {
                            return null;
                        }
                        return null;
                    }
                } else {
                    i18 = i16;
                    ArrayList arrayListS = p13.y.s(list);
                    z0Var2.f24062a = gVar2;
                    z0Var2.f24063b = null;
                    z0Var2.f24064c = eVar2;
                    z0Var2.f24065d = list3;
                    z0Var2.f24066e = list;
                    z0Var2.f24067f = list2;
                    z0Var2.f24068g = i18;
                    z0Var2.f24069h = z15;
                    z0Var2.f24072k = 3;
                    objA = this.f23806b.a(eVar2, arrayListS, z0Var2);
                    if (objA != aVar) {
                        List list19 = list2;
                        gVar5 = gVar2;
                        list13 = list19;
                        list14 = list3;
                        objA2 = objA;
                        eVar5 = eVar2;
                        i25 = i18;
                        z18 = z15;
                        list16 = (List) objA2;
                        if (list16 != null) {
                            return null;
                        }
                        return null;
                    }
                }
            }
            return aVar;
        }
        if (i27 == 1) {
            boolean z34 = z0Var2.f24069h;
            i17 = z0Var2.f24068g;
            List list20 = z0Var2.f24067f;
            List list21 = z0Var2.f24066e;
            list4 = z0Var2.f24065d;
            eVar3 = z0Var2.f24064c;
            dVar2 = z0Var2.f24063b;
            gVar3 = z0Var2.f24062a;
            o13.r.b(objA2);
            z16 = z34;
            i15 = 2;
            list5 = list21;
            e0Var = e0Var2;
            objC = objA2;
            list6 = list20;
        } else {
            if (i27 == 2) {
                z17 = z0Var2.f24069h;
                i24 = z0Var2.f24068g;
                list10 = z0Var2.f24067f;
                list11 = z0Var2.f24066e;
                list9 = z0Var2.f24065d;
                eVar4 = z0Var2.f24064c;
                dVar3 = z0Var2.f24063b;
                gVar4 = z0Var2.f24062a;
                o13.r.b(objA2);
                pVar = (o13.p) objA2;
                if (pVar != null || (list15 = (List) pVar.f128594a) == null) {
                    return null;
                }
                if (list15.isEmpty()) {
                    list15 = null;
                }
                if (list15 == null) {
                    return null;
                }
                int i28 = i24 + 1;
                list10.set(i24, b(list15.size(), i28));
                list11.set(i24, list15);
                com.garmin.android.library.mapsdkadapter.i.d dVar4 = dVar3;
                list9.set(i24, new com.garmin.android.library.mapsdkadapter.f(((GeoPointDTO) p13.h0.b0(list15)).getLatitudeAsPrimitive(), ((GeoPointDTO) p13.h0.b0(list15)).getLongitudeAsPrimitive(), dVar4));
                list9.set(i28, new com.garmin.android.library.mapsdkadapter.f(((GeoPointDTO) p13.h0.m0(list15)).getLatitudeAsPrimitive(), ((GeoPointDTO) p13.h0.m0(list15)).getLongitudeAsPrimitive(), dVar4));
                com.garmin.android.apps.connectmobile.courses.model.e eVar6 = eVar4;
                list2 = list10;
                eVar2 = eVar6;
                z15 = z17;
                i18 = i24;
                list = list11;
                list3 = list9;
                gVar2 = gVar4;
                ArrayList arrayListS2 = p13.y.s(list);
                z0Var2.f24062a = gVar2;
                z0Var2.f24063b = null;
                z0Var2.f24064c = eVar2;
                z0Var2.f24065d = list3;
                z0Var2.f24066e = list;
                z0Var2.f24067f = list2;
                z0Var2.f24068g = i18;
                z0Var2.f24069h = z15;
                z0Var2.f24072k = 3;
                objA = this.f23806b.a(eVar2, arrayListS2, z0Var2);
                if (objA != aVar) {
                    List list110 = list2;
                    gVar5 = gVar2;
                    list13 = list110;
                    list14 = list3;
                    objA2 = objA;
                    eVar5 = eVar2;
                    i25 = i18;
                    z18 = z15;
                    list16 = (List) objA2;
                    if (list16 != null) {
                        return null;
                    }
                    return null;
                }
                return aVar;
            }
            if (i27 == 3) {
                z18 = z0Var2.f24069h;
                int i29 = z0Var2.f24068g;
                List list22 = z0Var2.f24067f;
                List list23 = z0Var2.f24066e;
                list14 = z0Var2.f24065d;
                com.garmin.android.apps.connectmobile.courses.model.e eVar7 = z0Var2.f24064c;
                gVar5 = z0Var2.f24062a;
                o13.r.b(objA2);
                i25 = i29;
                list13 = list22;
                list = list23;
                eVar5 = eVar7;
                list16 = (List) objA2;
                if (list16 != null || list16.isEmpty()) {
                    return null;
                }
                d30.b.a(list16, list, list13);
                d30.b.e(list16, eVar5);
                eVar5.i0(new ArrayList());
                boolean zC = eVar5.m().c();
                z0Var2.f24062a = gVar5;
                z0Var2.f24063b = null;
                z0Var2.f24064c = eVar5;
                z0Var2.f24065d = list14;
                z0Var2.f24066e = list;
                z0Var2.f24067f = list13;
                z0Var2.f24068g = i25;
                z0Var2.f24069h = z18;
                z0Var2.f24072k = 4;
                objA2 = this.f23807c.a(list16, zC, z0Var2);
                if (objA2 != aVar) {
                    z19 = z18;
                    list17 = list14;
                    gVar6 = gVar5;
                    list18 = list;
                }
                return aVar;
            }
            if (i27 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z35 = z0Var2.f24069h;
            list13 = z0Var2.f24067f;
            List list24 = z0Var2.f24066e;
            List list25 = z0Var2.f24065d;
            eVar5 = z0Var2.f24064c;
            a50.g gVar7 = z0Var2.f24062a;
            o13.r.b(objA2);
            z19 = z35;
            list18 = list24;
            list17 = list25;
            gVar6 = gVar7;
        }
        k30.u uVar = (k30.u) objA2;
        a50.a aVar2 = new a50.a(list17, list18, list13, 3L, p13.j0.f134944a, z19, null);
        List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
        if (uVar == null || (listD = uVar.d()) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList3 = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList3.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList2 = arrayList3;
        }
        return this.f23808d.a(a50.g.a(gVar6, false, null, false, new w20.a(eVar5, listB, arrayList2, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null), false, p13.h0.D0(gVar6.f1396g, aVar2), null, null, 0, false, false, false, false, null, null, 65463));
        o13.p pVar2 = (o13.p) objC;
        if (pVar2 == null || (list12 = (List) pVar2.f128594a) == null) {
            return null;
        }
        if (list12.isEmpty()) {
            list12 = null;
        }
        if (list12 == null) {
            return null;
        }
        int i30 = i17 - 1;
        list6.set(i30, b(list12.size(), i17));
        list5.set(i30, list12);
        com.garmin.android.library.mapsdkadapter.i.d dVar5 = dVar2;
        list4.set(i30, new com.garmin.android.library.mapsdkadapter.f(((GeoPointDTO) p13.h0.b0(list12)).getLatitudeAsPrimitive(), ((GeoPointDTO) p13.h0.b0(list12)).getLongitudeAsPrimitive(), dVar5));
        list4.set(i17, new com.garmin.android.library.mapsdkadapter.f(((GeoPointDTO) p13.h0.m0(list12)).getLatitudeAsPrimitive(), ((GeoPointDTO) p13.h0.m0(list12)).getLongitudeAsPrimitive(), dVar5));
        i16 = i17;
        gVar2 = gVar3;
        list = list5;
        z15 = z16;
        list2 = list6;
        list3 = list4;
        eVar2 = eVar3;
        if (i16 < list3.size() - 1) {
            k30.k kVar3 = gVar2.f1397h;
            LatLng latLng5 = ((com.garmin.android.library.mapsdkadapter.f) list3.get(i16)).f50283a;
            LatLng latLng6 = ((com.garmin.android.library.mapsdkadapter.f) list3.get(i16 + 1)).f50283a;
            com.garmin.android.apps.connectmobile.courses.model.i iVarM3 = eVar2.m();
            boolean z210 = gVar2.f1401l;
            boolean z211 = gVar2.f1402m;
            boolean z212 = gVar2.f1403n;
            z0Var2.f24062a = gVar2;
            z0Var2.f24063b = dVar2;
            z0Var2.f24064c = eVar2;
            z0Var2.f24065d = list3;
            z0Var2.f24066e = list;
            z0Var2.f24067f = list2;
            z0Var2.f24068g = i16;
            z0Var2.f24069h = z15;
            z0Var2.f24072k = i15;
            z17 = z15;
            i19 = i16;
            list7 = list;
            list8 = list2;
            serializableC = e0Var.c(kVar3, dVar2, latLng5, latLng6, iVarM3, z210, z211, z212, z0Var2);
            if (serializableC != aVar) {
                gVar4 = gVar2;
                eVar4 = eVar2;
                list9 = list3;
                objA2 = serializableC;
                dVar3 = dVar2;
                list10 = list8;
                list11 = list7;
                i24 = i19;
                pVar = (o13.p) objA2;
                if (pVar != null) {
                    return null;
                }
                return null;
            }
        } else {
            i18 = i16;
            ArrayList arrayListS3 = p13.y.s(list);
            z0Var2.f24062a = gVar2;
            z0Var2.f24063b = null;
            z0Var2.f24064c = eVar2;
            z0Var2.f24065d = list3;
            z0Var2.f24066e = list;
            z0Var2.f24067f = list2;
            z0Var2.f24068g = i18;
            z0Var2.f24069h = z15;
            z0Var2.f24072k = 3;
            objA = this.f23806b.a(eVar2, arrayListS3, z0Var2);
            if (objA != aVar) {
                List list111 = list2;
                gVar5 = gVar2;
                list13 = list111;
                list14 = list3;
                objA2 = objA;
                eVar5 = eVar2;
                i25 = i18;
                z18 = z15;
                list16 = (List) objA2;
                if (list16 != null) {
                    return null;
                }
                return null;
            }
        }
        return aVar;
    }
}
