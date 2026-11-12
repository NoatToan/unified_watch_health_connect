package c30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f3;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lc30/h;", "", "Lc30/z;", "getCleanCourseSegmentUseCase", "Lc30/e0;", "getCourseSegmentUseCase", "Lz20/l;", "getCourseElevationUseCase", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "Lc30/g;", "addLapCoursePointsUseCase", "<init>", "(Lc30/z;Lc30/e0;Lz20/l;Lz20/r;Lc30/g;)V", "a", "b", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f23876f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f23877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f23878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z20.l f23879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z20.r f23880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f23881e;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc30/h$a;", "", "La50/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "projectionDistance", "", "Lk30/j;", "routeMessages", "<init>", "(La50/g;Ljava/lang/Double;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a50.g f23882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f23883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<k30.j> f23884c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(a50.g gVar, Double d14, List<? extends k30.j> list) {
            gVar.getClass();
            this.f23882a = gVar;
            this.f23883b = d14;
            this.f23884c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23882a.equals(aVar.f23882a) && p005kotlin.jvm.internal.s.g(this.f23883b, aVar.f23883b) && p005kotlin.jvm.internal.s.g(this.f23884c, aVar.f23884c);
        }

        public final int hashCode() {
            int iHashCode = this.f23882a.hashCode() * 31;
            Double d14 = this.f23883b;
            int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
            List<k30.j> list = this.f23884c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("AddNewPointResult(state=");
            sb3.append(this.f23882a);
            sb3.append(", projectionDistance=");
            sb3.append(this.f23883b);
            sb3.append(", routeMessages=");
            return u62.z.c(sb3, this.f23884c, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc30/h$b;", "", "", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "segments", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "route", "", "projectionDistance", "Lk30/j;", "routeMessages", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<CourseSegmentDTO> f23885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<List<GeoPointDTO>> f23886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f23887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<k30.j> f23888d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<CourseSegmentDTO> list, List<? extends List<GeoPointDTO>> list2, Double d14, List<? extends k30.j> list3) {
            list.getClass();
            list2.getClass();
            this.f23885a = list;
            this.f23886b = list2;
            this.f23887c = d14;
            this.f23888d = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23885a.equals(bVar.f23885a) && this.f23886b.equals(bVar.f23886b) && p005kotlin.jvm.internal.s.g(this.f23887c, bVar.f23887c) && p005kotlin.jvm.internal.s.g(this.f23888d, bVar.f23888d);
        }

        public final int hashCode() {
            int iB = lc.u0.b(this.f23885a.hashCode() * 31, 31, this.f23886b);
            Double d14 = this.f23887c;
            int iHashCode = (iB + (d14 == null ? 0 : d14.hashCode())) * 31;
            List<k30.j> list = this.f23888d;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbK = f3.k("RouteBuildResult(segments=", ", route=", ", projectionDistance=", this.f23885a, this.f23886b);
            sbK.append(this.f23887c);
            sbK.append(", routeMessages=");
            sbK.append(this.f23888d);
            sbK.append(")");
            return sbK.toString();
        }
    }

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public h(z zVar, e0 e0Var, z20.l lVar, z20.r rVar, g gVar) {
        zVar.getClass();
        e0Var.getClass();
        lVar.getClass();
        rVar.getClass();
        gVar.getClass();
        this.f23877a = zVar;
        this.f23878b = e0Var;
        this.f23879c = lVar;
        this.f23880d = rVar;
        this.f23881e = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r40v0, types: [c30.h, java.lang.Object] */
    public static final Object a(h hVar, a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, com.garmin.android.library.mapsdkadapter.f fVar, Integer num, long j8, v13.c cVar) {
        i iVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        Integer num2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        long j14;
        a50.g gVar2;
        List<CourseSegmentDTO> list;
        k30.t tVar;
        Integer num3;
        List<List<GeoPointDTO>> list2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        List<k30.j> list3;
        Double d14;
        List list4;
        Double d15;
        List<List<GeoPointDTO>> list5;
        a50.g gVar3;
        List<CourseSegmentDTO> list6;
        Integer num4;
        ArrayList arrayList;
        List<k30.j> list7;
        ?? r14;
        List<fn0.b> listD;
        hVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f23903l;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f23903l = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(hVar, cVar);
            }
        } else {
            iVar = new i(hVar, cVar);
        }
        i iVar2 = iVar;
        Object objC = iVar2.f23901j;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar2.f23903l;
        if (i15 == 0) {
            o13.r.b(objC);
            w20.a aVar2 = gVar.f1393d;
            if (aVar2 != null && (eVar = aVar2.f181476a) != null && !gVar.d().isEmpty()) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar4 = new com.garmin.android.apps.connectmobile.courses.model.e(eVar);
                iVar2.f23892a = gVar;
                num2 = num;
                iVar2.f23893b = num2;
                iVar2.f23894c = eVar4;
                iVar2.f23900i = j8;
                iVar2.f23903l = 1;
                objC = hVar.c(gVar, dVar, fVar, eVar4, iVar2);
                if (objC != aVar) {
                    eVar2 = eVar4;
                    j14 = j8;
                    gVar2 = gVar;
                }
                return aVar;
            }
            return null;
        }
        if (i15 == 1) {
            j14 = iVar2.f23900i;
            eVar2 = iVar2.f23894c;
            num2 = iVar2.f23893b;
            gVar2 = iVar2.f23892a;
            o13.r.b(objC);
        } else {
            if (i15 == 2) {
                j14 = iVar2.f23900i;
                list3 = iVar2.f23898g;
                d14 = iVar2.f23897f;
                list2 = iVar2.f23896e;
                List<CourseSegmentDTO> list8 = iVar2.f23895d;
                com.garmin.android.apps.connectmobile.courses.model.e eVar5 = iVar2.f23894c;
                num3 = iVar2.f23893b;
                a50.g gVar4 = iVar2.f23892a;
                o13.r.b(objC);
                eVar3 = eVar5;
                tVar = null;
                list = list8;
                gVar2 = gVar4;
                list4 = (List) objC;
                if (list4 == null && !list4.isEmpty()) {
                    d30.b.a(list4, list2, list);
                    d30.b.e(list4, eVar3);
                    d30.b.f(list4, eVar3);
                    ArrayList arrayListB = d30.b.b(list2, eVar3.h());
                    z20.r rVar = hVar.f23880d;
                    boolean zC = eVar3.m().c();
                    iVar2.f23892a = gVar2;
                    iVar2.f23893b = num3;
                    iVar2.f23894c = eVar3;
                    iVar2.f23895d = list;
                    iVar2.f23896e = list2;
                    iVar2.f23897f = d14;
                    iVar2.f23898g = list3;
                    iVar2.f23899h = arrayListB;
                    iVar2.f23900i = j14;
                    List<k30.j> list9 = list3;
                    iVar2.f23903l = 3;
                    objC = rVar.a(list4, zC, iVar2);
                    if (objC != aVar) {
                        d15 = d14;
                        list5 = list2;
                        gVar3 = gVar2;
                        list6 = list;
                        num4 = num3;
                        arrayList = arrayListB;
                        list7 = list9;
                    }
                    return aVar;
                }
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = iVar2.f23900i;
            ArrayList arrayList2 = iVar2.f23899h;
            list7 = iVar2.f23898g;
            d15 = iVar2.f23897f;
            List<List<GeoPointDTO>> list10 = iVar2.f23896e;
            List<CourseSegmentDTO> list11 = iVar2.f23895d;
            com.garmin.android.apps.connectmobile.courses.model.e eVar6 = iVar2.f23894c;
            Integer num5 = iVar2.f23893b;
            gVar3 = iVar2.f23892a;
            o13.r.b(objC);
            arrayList = arrayList2;
            list5 = list10;
            list6 = list11;
            eVar3 = eVar6;
            num4 = num5;
            tVar = null;
        }
        long j15 = j14;
        k30.u uVar = (k30.u) objC;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar3.j();
        a50.a aVar3 = new a50.a(arrayList, list5, list6, j15, listJ != null ? p13.h0.b1(listJ) : tVar, eVar3.G(), num4);
        g gVar5 = hVar.f23881e;
        List<ClimbDTO> listB = uVar != null ? uVar.b() : tVar;
        if (uVar == null || (listD = uVar.d()) == null) {
            r14 = tVar;
        } else {
            ArrayList arrayList3 = new ArrayList(p13.y.r(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList3.add(d30.b.d((fn0.b) it.next()));
            }
            r14 = arrayList3;
        }
        return new a(gVar5.a(a50.g.a(gVar3, false, null, false, new w20.a(eVar3, listB, r14, uVar != null ? uVar.getUnpavedSections() : tVar, uVar != null ? uVar.getHighTrafficSections() : tVar, false, 32, null), false, p13.h0.D0(gVar3.f1396g, aVar3), null, null, 0, false, false, false, false, null, null, 65463)), d15, list7);
        b bVar = (b) objC;
        if (bVar != null) {
            list = bVar.f23885a;
            List<List<GeoPointDTO>> list12 = bVar.f23886b;
            Double d16 = bVar.f23887c;
            List<k30.j> list13 = bVar.f23888d;
            z20.l lVar = hVar.f23879c;
            tVar = null;
            ArrayList arrayListS = p13.y.s(list12);
            iVar2.f23892a = gVar2;
            iVar2.f23893b = num2;
            iVar2.f23894c = eVar2;
            iVar2.f23895d = list;
            iVar2.f23896e = list12;
            iVar2.f23897f = d16;
            iVar2.f23898g = list13;
            iVar2.f23900i = j14;
            iVar2.f23903l = 2;
            Object objA = lVar.a(eVar2, arrayListS, iVar2);
            if (objA != aVar) {
                num3 = num2;
                list2 = list12;
                eVar3 = eVar2;
                list3 = list13;
                objC = objA;
                d14 = d16;
                list4 = (List) objC;
                return list4 == null ? tVar : tVar;
            }
            return aVar;
        }
        return null;
    }

    public static CourseSegmentDTO e(int i14, int i15) {
        CourseSegmentDTO courseSegmentDTO = new CourseSegmentDTO((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
        courseSegmentDTO.j(Integer.valueOf(i14));
        courseSegmentDTO.k(Integer.valueOf(i15));
        return courseSegmentDTO;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(a50.g gVar, com.garmin.android.library.mapsdkadapter.f fVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, int i14, v13.c cVar) {
        j jVar;
        List<List<List<Double>>> listB;
        List<k30.b> listA;
        k30.b bVar;
        GeoPointDTO projection;
        Double d14;
        ArrayList arrayListD1;
        ArrayList arrayListD2;
        k30.b bVar2;
        boolean zA;
        a50.g gVar2 = gVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i15 = jVar.f23917d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                jVar.f23917d = i15 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        j jVar2 = jVar;
        Object objA = jVar2.f23915b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = jVar2.f23917d;
        if (i16 == 0) {
            o13.r.b(objA);
            List<com.garmin.android.library.mapsdkadapter.f> listD = gVar2.d();
            LatLng latLng = listD.get(p13.x.j(listD) - 1).f50283a;
            LatLng latLng2 = ((com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(listD)).f50283a;
            LatLng latLng3 = fVar.f50283a;
            String str = gVar2.f1397h.f102562a;
            if (str == null) {
                str = "";
            }
            com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
            boolean z14 = gVar2.f1401l;
            boolean z15 = gVar2.f1402m;
            boolean z16 = gVar2.f1403n;
            jVar2.f23914a = gVar2;
            jVar2.f23917d = 1;
            objA = this.f23877a.a(latLng, latLng2, latLng3, i14, str, iVarM, z14, z15, z16, jVar2);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar2 = jVar2.f23914a;
            o13.r.b(objA);
        }
        k30.d dVar = (k30.d) objA;
        Double distance = null;
        if (dVar != null && (listB = dVar.b()) != null) {
            ArrayList<List> arrayListS = p13.y.s(p13.h0.Z(listB));
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListS, 10));
            for (List list : arrayListS) {
                arrayList.add(new GeoPointDTO(((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null && (listA = dVar.a()) != null && (bVar = (k30.b) p13.h0.d0(listA)) != null && (projection = bVar.getProjection()) != null && (d14 = projection.latitude) != null) {
                double dDoubleValue = d14.doubleValue();
                Double d15 = projection.longitude;
                if (d15 != null) {
                    LatLng latLng4 = new LatLng(dDoubleValue, d15.doubleValue());
                    Iterator it = arrayList.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        GeoPointDTO geoPointDTO = (GeoPointDTO) it.next();
                        Double d16 = geoPointDTO.latitude;
                        if (d16 != null) {
                            double dDoubleValue2 = d16.doubleValue();
                            Double d17 = geoPointDTO.longitude;
                            if (d17 != null) {
                                zA = me2.z.a(-1.0f, latLng4, new LatLng(dDoubleValue2, d17.doubleValue()));
                            } else {
                                zA = false;
                            }
                        } else {
                            zA = false;
                        }
                        if (zA) {
                            break;
                        }
                        i17++;
                    }
                    if (i17 != -1) {
                        if (i17 == 0 || i17 == arrayList.size() - 1) {
                            arrayListD1 = p13.h0.d1(gVar2.c());
                            if (!arrayListD1.isEmpty()) {
                                arrayListD1.remove(arrayListD1.size() - 1);
                            }
                            arrayListD1.add(e(arrayList.size(), arrayListD1.size() + 1));
                            arrayListD2 = p13.h0.d1(gVar2.b());
                            if (!arrayListD2.isEmpty()) {
                                arrayListD2.remove(arrayListD2.size() - 1);
                            }
                            arrayListD2.add(arrayList);
                        } else {
                            int i18 = i17 + 1;
                            List listSubList = arrayList.subList(0, i18);
                            List listSubList2 = arrayList.subList(i18, arrayList.size());
                            arrayListD1 = p13.h0.d1(gVar2.c());
                            if (!arrayListD1.isEmpty()) {
                                arrayListD1.remove(arrayListD1.size() - 1);
                            }
                            arrayListD1.add(e(listSubList.size(), arrayListD1.size() + 1));
                            arrayListD1.add(e(listSubList2.size(), arrayListD1.size() + 1));
                            arrayListD2 = p13.h0.d1(gVar2.b());
                            if (!arrayListD2.isEmpty()) {
                                arrayListD2.remove(arrayListD2.size() - 1);
                            }
                            arrayListD2.add(listSubList);
                            arrayListD2.add(listSubList2);
                        }
                        List<k30.b> listA2 = dVar.a();
                        if (listA2 != null && (bVar2 = (k30.b) p13.h0.d0(listA2)) != null) {
                            distance = bVar2.getDistance();
                        }
                        return new b(arrayListD1, arrayListD2, distance, dVar.c());
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, com.garmin.android.library.mapsdkadapter.f fVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, v13.c cVar) {
        k kVar;
        int i14;
        a50.g gVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        int i15;
        com.garmin.android.library.mapsdkadapter.f fVar2;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i16 = kVar.f23925h;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                kVar.f23925h = i16 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        k kVar2 = kVar;
        Object objB = kVar2.f23923f;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i17 = kVar2.f23925h;
        if (i17 == 0) {
            o13.r.b(objB);
            a50.a aVarE = gVar.e();
            Integer num = aVarE != null ? aVarE.f1246g : null;
            if (num == null || gVar.d().size() <= 1) {
                i14 = 0;
            } else {
                k30.k kVar3 = gVar.f1397h;
                kVar3.getClass();
                dVar.getClass();
                if ((p13.x.k(k30.k.POPULARITY, k30.k.MIN_ASCENT, k30.k.FREE_FLOW).contains(kVar3) || (kVar3 == k30.k.FOLLOW_ROADS && dVar == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE)) && ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
            }
            if (i14 != 0) {
                int iIntValue = num.intValue();
                kVar2.f23918a = gVar;
                kVar2.f23919b = dVar;
                kVar2.f23920c = fVar;
                kVar2.f23921d = eVar;
                kVar2.f23922e = i14;
                kVar2.f23925h = 1;
                objB = b(gVar, fVar, eVar, iIntValue, kVar2);
                if (objB != obj) {
                    gVar2 = gVar;
                    eVar2 = eVar;
                    i15 = i14;
                    fVar2 = fVar;
                }
            } else {
                kVar2.f23918a = null;
                kVar2.f23919b = null;
                kVar2.f23920c = null;
                kVar2.f23921d = null;
                kVar2.f23922e = i14;
                kVar2.f23925h = 3;
                Object objD = d(gVar, dVar, fVar, eVar, kVar2);
                if (objD != obj) {
                    return objD;
                }
            }
        }
        if (i17 != 1) {
            if (i17 == 2) {
                o13.r.b(objB);
                return objB;
            }
            if (i17 == 3) {
                o13.r.b(objB);
                return objB;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i15 = kVar2.f23922e;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3 = kVar2.f23921d;
        com.garmin.android.library.mapsdkadapter.f fVar3 = kVar2.f23920c;
        dVar = kVar2.f23919b;
        a50.g gVar3 = kVar2.f23918a;
        o13.r.b(objB);
        fVar2 = fVar3;
        eVar2 = eVar3;
        gVar2 = gVar3;
        com.garmin.android.library.mapsdkadapter.i.d dVar2 = dVar;
        b bVar = (b) objB;
        if (bVar != null) {
            return bVar;
        }
        kVar2.f23918a = null;
        kVar2.f23919b = null;
        kVar2.f23920c = null;
        kVar2.f23921d = null;
        kVar2.f23922e = i15;
        kVar2.f23925h = 2;
        Object objD2 = d(gVar2, dVar2, fVar2, eVar2, kVar2);
        return objD2 == obj ? obj : objD2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object d(a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, com.garmin.android.library.mapsdkadapter.f fVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, v13.c cVar) {
        l lVar;
        List list;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f23937d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f23937d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object objC = lVar2.f23935b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar2.f23937d;
        if (i15 == 0) {
            o13.r.b(objC);
            k30.k kVar = gVar.f1397h;
            LatLng latLng = ((com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(gVar.d())).f50283a;
            LatLng latLng2 = fVar.f50283a;
            com.garmin.android.apps.connectmobile.courses.model.i iVarM = eVar.m();
            boolean z14 = gVar.f1401l;
            boolean z15 = gVar.f1402m;
            boolean z16 = gVar.f1403n;
            lVar2.f23934a = gVar;
            lVar2.f23937d = 1;
            objC = this.f23878b.c(kVar, dVar, latLng, latLng2, iVarM, z14, z15, z16, lVar2);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = lVar2.f23934a;
            o13.r.b(objC);
        }
        o13.p pVar = (o13.p) objC;
        if (pVar != null && (list = (List) pVar.f128594a) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayListD1 = p13.h0.d1(gVar.c());
                arrayListD1.add(e(list.size(), gVar.c().size() + 1));
                ArrayList arrayListD2 = p13.h0.d1(gVar.b());
                arrayListD2.add(list);
                return new b(arrayListD1, arrayListD2, null, (List) pVar.f128595b);
            }
        }
        return null;
    }
}
