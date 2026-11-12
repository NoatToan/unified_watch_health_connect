package c30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lc30/n;", "", "Lc30/e0;", "getCourseSegmentUseCase", "Lz20/l;", "getCourseElevationUseCase", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "Lc30/g;", "addLapCoursePointsUseCase", "<init>", "(Lc30/e0;Lz20/l;Lz20/r;Lc30/g;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23956e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f23957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.l f23958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z20.r f23959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f23960d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc30/n$a;", "", "", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "segments", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "route", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<CourseSegmentDTO> f23961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<List<GeoPointDTO>> f23962b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<CourseSegmentDTO> list, List<? extends List<GeoPointDTO>> list2) {
            list.getClass();
            list2.getClass();
            this.f23961a = list;
            this.f23962b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23961a.equals(aVar.f23961a) && this.f23962b.equals(aVar.f23962b);
        }

        public final int hashCode() {
            return this.f23962b.hashCode() + (this.f23961a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.f("RouteBuildResult(segments=", ", route=", ")", this.f23961a, this.f23962b);
        }
    }

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public n(e0 e0Var, z20.l lVar, z20.r rVar, g gVar) {
        e0Var.getClass();
        lVar.getClass();
        rVar.getClass();
        gVar.getClass();
        this.f23957a = e0Var;
        this.f23958b = lVar;
        this.f23959c = rVar;
        this.f23960d = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0231  */
    /* JADX WARN: Code duplicated, block: B:102:0x0235  */
    /* JADX WARN: Code duplicated, block: B:116:0x02da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0226  */
    /* JADX WARN: Code duplicated, block: B:99:0x022a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [k30.t] */
    /* JADX WARN: Type inference failed for: r34v0, types: [c30.n] */
    public static final Object a(n nVar, a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, PointOfInterestDTO pointOfInterestDTO, String str, v13.c cVar) {
        o oVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.f fVar;
        String str2;
        List listC;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        String str3;
        a50.g gVar2;
        String str4;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        String str5;
        a aVar;
        List<CourseSegmentDTO> list;
        List<List<GeoPointDTO>> list2;
        Object objA;
        List<List<GeoPointDTO>> list3;
        String str6;
        List<CourseSegmentDTO> list4;
        com.garmin.android.apps.connectmobile.courses.model.e eVar4;
        a50.g gVar3;
        List list5;
        GeoPointDTO geoPointDTO;
        ArrayList arrayListB;
        a50.g gVar4;
        k30.u uVar;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        List listB1;
        List<ClimbDTO> listB;
        ArrayList arrayList;
        k30.x unpavedSections;
        List<fn0.b> listD;
        List list6;
        List list7;
        GeoPointDTO geoPointDTO2;
        a50.g gVar5 = gVar;
        z20.l lVar = nVar.f23958b;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f23972j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f23972j = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(nVar, cVar);
            }
        } else {
            oVar = new o(nVar, cVar);
        }
        o oVar2 = oVar;
        Object objA2 = oVar2.f23970h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar2.f23972j;
        if (i15 == 0) {
            o13.r.b(objA2);
            w20.a aVar3 = gVar5.f1393d;
            if (aVar3 != null && (eVar = aVar3.f181476a) != null) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar5 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
                com.garmin.android.apps.connectmobile.courses.model.h hVar = pointOfInterestDTO.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                if (hVar != null) {
                    switch (k30.i.f102551a[hVar.ordinal()]) {
                        case 1:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.CONVENIENCE;
                            break;
                        case 2:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.TOILET;
                            break;
                        case 3:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.WATER;
                            break;
                        case 4:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.COFFEE_SHOP;
                            break;
                        case 5:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.BIKE_SHOP_AND_REPAIR;
                            break;
                        case 6:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.PARK;
                            break;
                        case 7:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.WINERY_OR_BREWERY;
                            break;
                        case 8:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.BANK_OR_ATM;
                            break;
                        case 9:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.RESTAURANT;
                            break;
                        case 10:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.EMERGENCY;
                            break;
                        case 11:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.RECREATION;
                            break;
                        case 12:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.ATTRACTION;
                            break;
                        case 13:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.LODGING;
                            break;
                        case 14:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.TRANSPORT;
                            break;
                        case 15:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.SHOPPING;
                            break;
                        case 16:
                            fVar = com.garmin.android.apps.connectmobile.courses.model.f.COMMUNITY;
                            break;
                        default:
                            lc.u0.r();
                            return null;
                    }
                    if (fVar == null) {
                        fVar = com.garmin.android.apps.connectmobile.courses.model.f.GENERIC;
                    }
                } else {
                    fVar = com.garmin.android.apps.connectmobile.courses.model.f.GENERIC;
                }
                str2 = fVar.f32922a;
                LatLng latLng = new LatLng(pointOfInterestDTO.getLatitude(), pointOfInterestDTO.getLongitude());
                dVar.getClass();
                com.garmin.android.library.mapsdkadapter.f fVar2 = new com.garmin.android.library.mapsdkadapter.f(latLng, dVar);
                if (gVar5.d().isEmpty()) {
                    listC = p13.w.c(fVar2);
                    List listC2 = p13.w.c(new GeoPointDTO(pointOfInterestDTO.getLatitude(), pointOfInterestDTO.getLongitude()));
                    oVar2.f23963a = gVar5;
                    oVar2.f23964b = str;
                    oVar2.f23965c = eVar5;
                    oVar2.f23966d = str2;
                    oVar2.f23967e = listC;
                    oVar2.f23972j = 4;
                    objA2 = lVar.a(eVar5, listC2, oVar2);
                    if (objA2 != aVar2) {
                        eVar2 = eVar5;
                        str3 = str;
                        gVar2 = gVar5;
                        str4 = str2;
                        list6 = listC;
                        list7 = (List) objA2;
                        if (list7 != null) {
                            com.garmin.android.apps.connectmobile.courses.model.g gVar6 = new com.garmin.android.apps.connectmobile.courses.model.g();
                            gVar6.name = str3;
                            gVar6.m(str4);
                            gVar6.lat = geoPointDTO2.latitude;
                            gVar6.lon = geoPointDTO2.longitude;
                            gVar6.o(geoPointDTO2.distance);
                            gVar6.derivedElevation = geoPointDTO2.elevation;
                            eVar2.b(gVar6);
                            p13.j0 j0Var = p13.j0.f134944a;
                            List<com.garmin.android.apps.connectmobile.courses.model.g> listJ2 = eVar2.j();
                            return a50.g.a(gVar2, false, null, false, w20.a.b(gVar2.f1393d, eVar2, null, null, null, null, 62), false, p13.h0.D0(gVar2.f1396g, new a50.a(list6, j0Var, j0Var, -1L, listJ2 != null ? p13.h0.b1(listJ2) : null, false, null)), null, null, 0, false, false, false, false, null, null, 65463);
                        }
                    }
                } else if (gVar5.d().size() == 1 || !fVar2.equals(p13.h0.m0(gVar5.d()))) {
                    oVar2.f23963a = gVar5;
                    oVar2.f23964b = str;
                    oVar2.f23965c = eVar5;
                    oVar2.f23966d = str2;
                    oVar2.f23972j = 1;
                    objA2 = nVar.b(gVar5, dVar, fVar2, eVar5, oVar2);
                    if (objA2 != aVar2) {
                        eVar3 = eVar5;
                        str5 = str;
                        aVar = (a) objA2;
                        if (aVar != null) {
                            list = aVar.f23961a;
                            list2 = aVar.f23962b;
                            ArrayList arrayListS = p13.y.s(list2);
                            oVar2.f23963a = gVar5;
                            oVar2.f23964b = str5;
                            oVar2.f23965c = eVar3;
                            oVar2.f23966d = str2;
                            oVar2.f23967e = list;
                            oVar2.f23968f = list2;
                            oVar2.f23972j = 2;
                            objA = lVar.a(eVar3, arrayListS, oVar2);
                            if (objA != aVar2) {
                                com.garmin.android.apps.connectmobile.courses.model.e eVar6 = eVar3;
                                list3 = list2;
                                objA2 = objA;
                                str6 = str5;
                                list4 = list;
                                eVar4 = eVar6;
                                gVar3 = gVar5;
                                list5 = (List) objA2;
                                if (list5 != null) {
                                    d30.b.a(list5, list3, list4);
                                    d30.b.e(list5, eVar4);
                                    d30.b.f(list5, eVar4);
                                    geoPointDTO = (GeoPointDTO) p13.h0.n0(list5);
                                    if (geoPointDTO != null) {
                                        com.garmin.android.apps.connectmobile.courses.model.g gVar7 = new com.garmin.android.apps.connectmobile.courses.model.g();
                                        gVar7.name = str6;
                                        gVar7.m(str2);
                                        gVar7.lat = geoPointDTO.latitude;
                                        gVar7.lon = geoPointDTO.longitude;
                                        gVar7.o(geoPointDTO.distance);
                                        gVar7.derivedElevation = geoPointDTO.elevation;
                                        eVar4.b(gVar7);
                                        arrayListB = d30.b.b(list3, eVar4.h());
                                        z20.r rVar = nVar.f23959c;
                                        boolean zC = eVar4.m().c();
                                        oVar2.f23963a = gVar3;
                                        oVar2.f23964b = null;
                                        oVar2.f23965c = eVar4;
                                        oVar2.f23966d = null;
                                        oVar2.f23967e = list4;
                                        oVar2.f23968f = list3;
                                        oVar2.f23969g = arrayListB;
                                        oVar2.f23972j = 3;
                                        objA2 = rVar.a(list5, zC, oVar2);
                                        if (objA2 != aVar2) {
                                            gVar4 = gVar3;
                                            ArrayList arrayList2 = arrayListB;
                                            List<List<GeoPointDTO>> list8 = list3;
                                            List<CourseSegmentDTO> list9 = list4;
                                            uVar = (k30.u) objA2;
                                            listJ = eVar4.j();
                                            if (listJ != null) {
                                                listB1 = p13.h0.b1(listJ);
                                            } else {
                                                listB1 = null;
                                            }
                                            a50.a aVar4 = new a50.a(arrayList2, list8, list9, -1L, listB1, eVar4.G(), null);
                                            g gVar8 = nVar.f23960d;
                                            if (uVar != null) {
                                                listB = uVar.b();
                                            } else {
                                                listB = null;
                                            }
                                            if (uVar != null) {
                                                arrayList = null;
                                            } else {
                                                arrayList = null;
                                            }
                                            if (uVar != null) {
                                                unpavedSections = uVar.getUnpavedSections();
                                            } else {
                                                unpavedSections = null;
                                            }
                                            return gVar8.a(a50.g.a(gVar4, false, null, false, new w20.a(eVar4, listB, arrayList, unpavedSections, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null), false, p13.h0.D0(gVar4.f1396g, aVar4), null, null, 0, false, false, false, false, null, null, 65463));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar2;
            }
            return null;
        }
        if (i15 == 1) {
            String str7 = oVar2.f23966d;
            eVar3 = oVar2.f23965c;
            str5 = oVar2.f23964b;
            a50.g gVar9 = oVar2.f23963a;
            o13.r.b(objA2);
            str2 = str7;
            gVar5 = gVar9;
            aVar = (a) objA2;
            if (aVar != null) {
                list = aVar.f23961a;
                list2 = aVar.f23962b;
                ArrayList arrayListS2 = p13.y.s(list2);
                oVar2.f23963a = gVar5;
                oVar2.f23964b = str5;
                oVar2.f23965c = eVar3;
                oVar2.f23966d = str2;
                oVar2.f23967e = list;
                oVar2.f23968f = list2;
                oVar2.f23972j = 2;
                objA = lVar.a(eVar3, arrayListS2, oVar2);
                if (objA != aVar2) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVar7 = eVar3;
                    list3 = list2;
                    objA2 = objA;
                    str6 = str5;
                    list4 = list;
                    eVar4 = eVar7;
                    gVar3 = gVar5;
                    list5 = (List) objA2;
                    if (list5 != null) {
                        d30.b.a(list5, list3, list4);
                        d30.b.e(list5, eVar4);
                        d30.b.f(list5, eVar4);
                        geoPointDTO = (GeoPointDTO) p13.h0.n0(list5);
                        if (geoPointDTO != null) {
                            com.garmin.android.apps.connectmobile.courses.model.g gVar10 = new com.garmin.android.apps.connectmobile.courses.model.g();
                            gVar10.name = str6;
                            gVar10.m(str2);
                            gVar10.lat = geoPointDTO.latitude;
                            gVar10.lon = geoPointDTO.longitude;
                            gVar10.o(geoPointDTO.distance);
                            gVar10.derivedElevation = geoPointDTO.elevation;
                            eVar4.b(gVar10);
                            arrayListB = d30.b.b(list3, eVar4.h());
                            z20.r rVar2 = nVar.f23959c;
                            boolean zC2 = eVar4.m().c();
                            oVar2.f23963a = gVar3;
                            oVar2.f23964b = null;
                            oVar2.f23965c = eVar4;
                            oVar2.f23966d = null;
                            oVar2.f23967e = list4;
                            oVar2.f23968f = list3;
                            oVar2.f23969g = arrayListB;
                            oVar2.f23972j = 3;
                            objA2 = rVar2.a(list5, zC2, oVar2);
                            if (objA2 != aVar2) {
                                gVar4 = gVar3;
                            }
                        }
                    }
                }
                return aVar2;
            }
            return null;
        }
        if (i15 == 2) {
            List<List<GeoPointDTO>> list10 = oVar2.f23968f;
            List<CourseSegmentDTO> list11 = oVar2.f23967e;
            String str8 = oVar2.f23966d;
            eVar4 = oVar2.f23965c;
            str6 = oVar2.f23964b;
            gVar3 = oVar2.f23963a;
            o13.r.b(objA2);
            str2 = str8;
            list4 = list11;
            list3 = list10;
            list5 = (List) objA2;
            if (list5 != null && !list5.isEmpty()) {
                d30.b.a(list5, list3, list4);
                d30.b.e(list5, eVar4);
                d30.b.f(list5, eVar4);
                geoPointDTO = (GeoPointDTO) p13.h0.n0(list5);
                if (geoPointDTO != null) {
                    com.garmin.android.apps.connectmobile.courses.model.g gVar11 = new com.garmin.android.apps.connectmobile.courses.model.g();
                    gVar11.name = str6;
                    gVar11.m(str2);
                    gVar11.lat = geoPointDTO.latitude;
                    gVar11.lon = geoPointDTO.longitude;
                    gVar11.o(geoPointDTO.distance);
                    gVar11.derivedElevation = geoPointDTO.elevation;
                    eVar4.b(gVar11);
                    arrayListB = d30.b.b(list3, eVar4.h());
                    z20.r rVar3 = nVar.f23959c;
                    boolean zC3 = eVar4.m().c();
                    oVar2.f23963a = gVar3;
                    oVar2.f23964b = null;
                    oVar2.f23965c = eVar4;
                    oVar2.f23966d = null;
                    oVar2.f23967e = list4;
                    oVar2.f23968f = list3;
                    oVar2.f23969g = arrayListB;
                    oVar2.f23972j = 3;
                    objA2 = rVar3.a(list5, zC3, oVar2);
                    if (objA2 != aVar2) {
                        gVar4 = gVar3;
                    }
                    return aVar2;
                }
            }
            return null;
        }
        if (i15 != 3) {
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            listC = oVar2.f23967e;
            str4 = oVar2.f23966d;
            com.garmin.android.apps.connectmobile.courses.model.e eVar8 = oVar2.f23965c;
            str3 = oVar2.f23964b;
            a50.g gVar12 = oVar2.f23963a;
            o13.r.b(objA2);
            eVar2 = eVar8;
            gVar2 = gVar12;
            list6 = listC;
            list7 = (List) objA2;
            if (list7 != null && (geoPointDTO2 = (GeoPointDTO) p13.h0.n0(list7)) != null) {
                com.garmin.android.apps.connectmobile.courses.model.g gVar13 = new com.garmin.android.apps.connectmobile.courses.model.g();
                gVar13.name = str3;
                gVar13.m(str4);
                gVar13.lat = geoPointDTO2.latitude;
                gVar13.lon = geoPointDTO2.longitude;
                gVar13.o(geoPointDTO2.distance);
                gVar13.derivedElevation = geoPointDTO2.elevation;
                eVar2.b(gVar13);
                p13.j0 j0Var2 = p13.j0.f134944a;
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ3 = eVar2.j();
                return a50.g.a(gVar2, false, null, false, w20.a.b(gVar2.f1393d, eVar2, null, null, null, null, 62), false, p13.h0.D0(gVar2.f1396g, new a50.a(list6, j0Var2, j0Var2, -1L, listJ3 != null ? p13.h0.b1(listJ3) : null, false, null)), null, null, 0, false, false, false, false, null, null, 65463);
            }
            return null;
        }
        arrayListB = oVar2.f23969g;
        list3 = oVar2.f23968f;
        list4 = oVar2.f23967e;
        eVar4 = oVar2.f23965c;
        gVar4 = oVar2.f23963a;
        o13.r.b(objA2);
        ArrayList arrayList3 = arrayListB;
        List<List<GeoPointDTO>> list12 = list3;
        List<CourseSegmentDTO> list13 = list4;
        uVar = (k30.u) objA2;
        listJ = eVar4.j();
        if (listJ != null) {
            listB1 = p13.h0.b1(listJ);
        } else {
            listB1 = null;
        }
        a50.a aVar5 = new a50.a(arrayList3, list12, list13, -1L, listB1, eVar4.G(), null);
        g gVar14 = nVar.f23960d;
        if (uVar != null) {
            listB = uVar.b();
        } else {
            listB = null;
        }
        if (uVar != null || (listD = uVar.d()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList4 = new ArrayList(p13.y.r(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList4.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList = arrayList4;
        }
        if (uVar != null) {
            unpavedSections = uVar.getUnpavedSections();
        } else {
            unpavedSections = null;
        }
        return gVar14.a(a50.g.a(gVar4, false, null, false, new w20.a(eVar4, listB, arrayList, unpavedSections, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null), false, p13.h0.D0(gVar4.f1396g, aVar5), null, null, 0, false, false, false, false, null, null, 65463));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, com.garmin.android.library.mapsdkadapter.f fVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, v13.c cVar) {
        p pVar;
        List list;
        a50.g gVar2 = gVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f23980d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f23980d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        p pVar2 = pVar;
        Object objC = pVar2.f23978b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar2.f23980d;
        if (i15 == 0) {
            o13.r.b(objC);
            k30.k kVar = gVar2.f1397h;
            LatLng latLng = ((com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(gVar2.d())).f50283a;
            LatLng latLng2 = fVar.f50283a;
            com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
            boolean z14 = gVar2.f1401l;
            boolean z15 = gVar2.f1402m;
            boolean z16 = gVar2.f1403n;
            pVar2.f23977a = gVar2;
            pVar2.f23980d = 1;
            objC = this.f23957a.c(kVar, dVar, latLng, latLng2, iVarM, z14, z15, z16, pVar2);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar2 = pVar2.f23977a;
            o13.r.b(objC);
        }
        o13.p pVar3 = (o13.p) objC;
        if (pVar3 != null && (list = (List) pVar3.f128594a) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayListD1 = p13.h0.d1(gVar2.c());
                int size = list.size();
                int size2 = gVar2.c().size() + 1;
                CourseSegmentDTO courseSegmentDTO = new CourseSegmentDTO((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
                courseSegmentDTO.j(Integer.valueOf(size));
                courseSegmentDTO.k(Integer.valueOf(size2));
                arrayListD1.add(courseSegmentDTO);
                ArrayList arrayListD2 = p13.h0.d1(gVar2.b());
                arrayListD2.add(list);
                return new a(arrayListD1, arrayListD2);
            }
        }
        return null;
    }
}
