package c30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lc30/c1;", "", "Lc30/e0;", "getCourseSegmentUseCase", "Lz20/l;", "getCourseElevationUseCase", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "Lc30/g;", "addLapCoursePointsUseCase", "<init>", "(Lc30/e0;Lz20/l;Lz20/r;Lc30/g;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23820e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f23821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.l f23822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z20.r f23823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f23824d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc30/c1$a;", "", "", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "segments", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "route", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<CourseSegmentDTO> f23825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<List<GeoPointDTO>> f23826b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<CourseSegmentDTO> list, List<? extends List<GeoPointDTO>> list2) {
            list.getClass();
            list2.getClass();
            this.f23825a = list;
            this.f23826b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23825a.equals(aVar.f23825a) && this.f23826b.equals(aVar.f23826b);
        }

        public final int hashCode() {
            return this.f23826b.hashCode() + (this.f23825a.hashCode() * 31);
        }

        public final String toString() {
            return c22.t.f("RouteBuildResult(segments=", ", route=", ")", this.f23825a, this.f23826b);
        }
    }

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public c1(e0 e0Var, z20.l lVar, z20.r rVar, g gVar) {
        e0Var.getClass();
        lVar.getClass();
        rVar.getClass();
        gVar.getClass();
        this.f23821a = e0Var;
        this.f23822b = lVar;
        this.f23823c = rVar;
        this.f23824d = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(a50.g gVar, com.garmin.android.library.mapsdkadapter.i.d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, List list, boolean z14, v13.c cVar) throws Throwable {
        d1 d1Var;
        boolean z15;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        List list2;
        a50.g gVar2;
        a50.g gVar3;
        List list3;
        List<List<GeoPointDTO>> list4;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        List<CourseSegmentDTO> list5;
        boolean z16;
        List list6;
        a50.g gVar4;
        k30.u uVar;
        List<ClimbDTO> listB;
        ArrayList arrayList;
        k30.x unpavedSections;
        List<fn0.b> listD;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i14 = d1Var.f23843i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d1Var.f23843i = i14 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar);
            }
        } else {
            d1Var = new d1(this, cVar);
        }
        d1 d1Var2 = d1Var;
        Object objB = d1Var2.f23841g;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = d1Var2.f23843i;
        if (i15 == 0) {
            o13.r.b(objB);
            boolean z17 = gVar.f1401l;
            boolean z18 = gVar.f1402m;
            boolean z19 = gVar.f1403n;
            d1Var2.f23835a = gVar;
            d1Var2.f23836b = eVar;
            d1Var2.f23837c = list;
            z15 = z14;
            d1Var2.f23840f = z15;
            d1Var2.f23843i = 1;
            objB = b(dVar, z17, z18, z19, eVar, list, d1Var2);
            if (objB != obj) {
                eVar2 = eVar;
                list2 = list;
                gVar2 = gVar;
            }
            return obj;
        }
        if (i15 == 1) {
            boolean z24 = d1Var2.f23840f;
            list2 = d1Var2.f23837c;
            eVar2 = d1Var2.f23836b;
            gVar2 = d1Var2.f23835a;
            o13.r.b(objB);
            z15 = z24;
        } else {
            if (i15 == 2) {
                z16 = d1Var2.f23840f;
                list4 = d1Var2.f23839e;
                list5 = d1Var2.f23838d;
                list3 = d1Var2.f23837c;
                eVar3 = d1Var2.f23836b;
                gVar3 = d1Var2.f23835a;
                o13.r.b(objB);
                list6 = (List) objB;
                if (list6 != null && !list6.isEmpty()) {
                    d30.b.a(list6, list4, list5);
                    d30.b.e(list6, eVar3);
                    eVar3.i0(new ArrayList());
                    boolean zC = eVar3.m().c();
                    d1Var2.f23835a = gVar3;
                    d1Var2.f23836b = eVar3;
                    d1Var2.f23837c = list3;
                    d1Var2.f23838d = list5;
                    d1Var2.f23839e = list4;
                    d1Var2.f23840f = z16;
                    d1Var2.f23843i = 3;
                    objB = this.f23823c.a(list6, zC, d1Var2);
                    if (objB != obj) {
                        gVar4 = gVar3;
                    }
                    return obj;
                }
                return null;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z16 = d1Var2.f23840f;
            list4 = d1Var2.f23839e;
            list5 = d1Var2.f23838d;
            list3 = d1Var2.f23837c;
            eVar3 = d1Var2.f23836b;
            a50.g gVar5 = d1Var2.f23835a;
            o13.r.b(objB);
            gVar4 = gVar5;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar4 = eVar3;
        uVar = (k30.u) objB;
        a50.a aVar = new a50.a(list3, list4, list5, 3L, p13.j0.f134944a, z16, null);
        if (uVar != null) {
            listB = uVar.b();
        } else {
            listB = null;
        }
        if (uVar != null || (listD = uVar.d()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList2.add(d30.b.d((fn0.b) it.next()));
            }
            arrayList = arrayList2;
        }
        if (uVar != null) {
            unpavedSections = uVar.getUnpavedSections();
        } else {
            unpavedSections = null;
        }
        return this.f23824d.a(a50.g.a(gVar4, false, null, false, new w20.a(eVar4, listB, arrayList, unpavedSections, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null), false, p13.h0.D0(gVar4.f1396g, aVar), null, null, 0, false, false, false, false, null, null, 65463));
        a aVar2 = (a) objB;
        if (aVar2 != null) {
            List<CourseSegmentDTO> list7 = aVar2.f23825a;
            List<List<GeoPointDTO>> list8 = aVar2.f23826b;
            ArrayList arrayListS = p13.y.s(list8);
            d1Var2.f23835a = gVar2;
            d1Var2.f23836b = eVar2;
            d1Var2.f23837c = list2;
            d1Var2.f23838d = list7;
            d1Var2.f23839e = list8;
            d1Var2.f23840f = z15;
            d1Var2.f23843i = 2;
            Object objA = this.f23822b.a(eVar2, arrayListS, d1Var2);
            if (objA != obj) {
                gVar3 = gVar2;
                list3 = list2;
                list4 = list8;
                objB = objA;
                eVar3 = eVar2;
                list5 = list7;
                z16 = z15;
                list6 = (List) objB;
                if (list6 != null) {
                    d30.b.a(list6, list4, list5);
                    d30.b.e(list6, eVar3);
                    eVar3.i0(new ArrayList());
                    boolean zC2 = eVar3.m().c();
                    d1Var2.f23835a = gVar3;
                    d1Var2.f23836b = eVar3;
                    d1Var2.f23837c = list3;
                    d1Var2.f23838d = list5;
                    d1Var2.f23839e = list4;
                    d1Var2.f23840f = z16;
                    d1Var2.f23843i = 3;
                    objB = this.f23823c.a(list6, zC2, d1Var2);
                    if (objB != obj) {
                        gVar4 = gVar3;
                        com.garmin.android.apps.connectmobile.courses.model.e eVar5 = eVar3;
                        uVar = (k30.u) objB;
                        a50.a aVar3 = new a50.a(list3, list4, list5, 3L, p13.j0.f134944a, z16, null);
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
                        return this.f23824d.a(a50.g.a(gVar4, false, null, false, new w20.a(eVar5, listB, arrayList, unpavedSections, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null), false, p13.h0.D0(gVar4.f1396g, aVar3), null, null, 0, false, false, false, false, null, null, 65463));
                    }
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ea -> B:25:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015e -> B:37:0x016c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(com.garmin.android.library.mapsdkadapter.i.d r37, boolean r38, boolean r39, boolean r40, com.garmin.android.apps.connectmobile.courses.model.e r41, java.util.List r42, v13.c r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.c1.b(com.garmin.android.library.mapsdkadapter.i$d, boolean, boolean, boolean, com.garmin.android.apps.connectmobile.courses.model.e, java.util.List, v13.c):java.lang.Object");
    }
}
