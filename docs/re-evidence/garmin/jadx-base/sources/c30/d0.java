package c30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc30/d0;", "", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "<init>", "(Lz20/r;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z20.r f23834a;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public d0(z20.r rVar) {
        rVar.getClass();
        this.f23834a = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:83:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x0188  */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(d0 d0Var, com.garmin.android.apps.connectmobile.courses.model.e eVar, v13.c cVar) {
        b0 b0Var;
        ArrayList arrayListX;
        GeoPointDTO geoPointDTO;
        GeoPointDTO geoPointDTO2;
        long j8;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        ArrayList arrayList;
        long j14;
        int size;
        Double d14;
        Double d15;
        ArrayList arrayList2;
        List<fn0.b> listD;
        d0Var.getClass();
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f23803g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f23803g = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(d0Var, cVar);
            }
        } else {
            b0Var = new b0(d0Var, cVar);
        }
        Object obj = b0Var.f23801e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f23803g;
        if (i15 == 0) {
            arrayListX = v.h.x(obj);
            ArrayList arrayList3 = new ArrayList();
            List<GeoPointDTO> list = eVar.geoPoints;
            ArrayList arrayListZ = list != null ? p13.h0.Z(list) : null;
            if (arrayListZ != null && !arrayListZ.isEmpty()) {
                GeoPointDTO geoPointDTO3 = (GeoPointDTO) arrayListZ.get(0);
                Double d16 = geoPointDTO3.latitude;
                double dDoubleValue = d16 != null ? d16.doubleValue() : 0.0d;
                Double d17 = geoPointDTO3.longitude;
                arrayListX.add(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, d17 != null ? d17.doubleValue() : 0.0d, eVar.h()));
                List<CourseSegmentDTO> listI = eVar.i();
                if (listI == null) {
                    listI = p13.j0.f134944a;
                }
                int i16 = 0;
                for (CourseSegmentDTO courseSegmentDTO : listI) {
                    ArrayList arrayList4 = new ArrayList();
                    Integer numberOfPoints = courseSegmentDTO.getNumberOfPoints();
                    int iIntValue = (numberOfPoints != null ? numberOfPoints.intValue() : 0) + i16;
                    if (iIntValue > arrayListZ.size()) {
                        iIntValue = arrayListZ.size();
                    }
                    if (i16 < iIntValue) {
                        Iterator it = arrayListZ.subList(i16, iIntValue).iterator();
                        while (it.hasNext()) {
                            arrayList4.add((GeoPointDTO) it.next());
                        }
                        GeoPointDTO geoPointDTO4 = (GeoPointDTO) p13.h0.n0(arrayList4);
                        double dDoubleValue2 = (geoPointDTO4 == null || (d15 = geoPointDTO4.latitude) == null) ? 0.0d : d15.doubleValue();
                        GeoPointDTO geoPointDTO5 = (GeoPointDTO) p13.h0.n0(arrayList4);
                        arrayListX.add(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue2, (geoPointDTO5 == null || (d14 = geoPointDTO5.longitude) == null) ? 0.0d : d14.doubleValue(), eVar.h()));
                        arrayList3.add(arrayList4);
                    }
                    i16 = iIntValue;
                }
            }
            if (arrayListX.isEmpty()) {
                if (arrayListZ != null) {
                    geoPointDTO = (GeoPointDTO) p13.h0.d0(arrayListZ);
                } else {
                    geoPointDTO = null;
                }
                if (arrayListZ != null) {
                    geoPointDTO2 = (GeoPointDTO) p13.h0.n0(arrayListZ);
                } else {
                    geoPointDTO2 = null;
                }
                if (geoPointDTO != null || geoPointDTO2 == null) {
                    j8 = -1;
                } else {
                    GeoPointDTO.INSTANCE.getClass();
                    if (GeoPointDTO.Companion.b(geoPointDTO, geoPointDTO2) < 10.0d) {
                        j8 = 2;
                    } else {
                        j8 = -1;
                    }
                }
            } else {
                com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) p13.h0.b0(arrayListX);
                com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(arrayListX);
                if ((p005kotlin.jvm.internal.s.g(fVar, fVar2) || fVar.d(fVar2, 0.0f)) && (size = arrayListX.size()) > 1 && size % 2 != 0) {
                    int i17 = size / 2;
                    ArrayList arrayListK1 = p13.h0.k1(arrayListX.subList(0, i17), p13.e0.J(arrayListX.subList(i17 + 1, size)));
                    if (!arrayListK1.isEmpty()) {
                        Iterator it3 = arrayListK1.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                o13.p pVar = (o13.p) it3.next();
                                if (!p005kotlin.jvm.internal.s.g((com.garmin.android.library.mapsdkadapter.f) pVar.f128594a, (com.garmin.android.library.mapsdkadapter.f) pVar.f128595b)) {
                                    if (arrayListZ != null) {
                                        geoPointDTO = (GeoPointDTO) p13.h0.d0(arrayListZ);
                                    } else {
                                        geoPointDTO = null;
                                    }
                                    if (arrayListZ != null) {
                                        geoPointDTO2 = (GeoPointDTO) p13.h0.n0(arrayListZ);
                                    } else {
                                        geoPointDTO2 = null;
                                    }
                                    if (geoPointDTO != null) {
                                        j8 = -1;
                                    } else {
                                        j8 = -1;
                                    }
                                }
                            }
                        }
                    }
                    j8 = 1;
                } else {
                    if (arrayListZ != null) {
                        geoPointDTO = (GeoPointDTO) p13.h0.d0(arrayListZ);
                    } else {
                        geoPointDTO = null;
                    }
                    if (arrayListZ != null) {
                        geoPointDTO2 = (GeoPointDTO) p13.h0.n0(arrayListZ);
                    } else {
                        geoPointDTO2 = null;
                    }
                    if (geoPointDTO != null) {
                        j8 = -1;
                    } else {
                        j8 = -1;
                    }
                }
            }
            z20.r rVar = d0Var.f23834a;
            boolean zC = eVar.m().c();
            b0Var.f23797a = eVar;
            b0Var.f23798b = arrayListX;
            b0Var.f23799c = arrayList3;
            b0Var.f23800d = j8;
            b0Var.f23803g = 1;
            Object objA = rVar.a(arrayListZ, zC, b0Var);
            if (objA == aVar) {
                return aVar;
            }
            eVar2 = eVar;
            arrayList = arrayList3;
            obj = objA;
            j14 = j8;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = b0Var.f23800d;
            arrayList = b0Var.f23799c;
            arrayListX = b0Var.f23798b;
            com.garmin.android.apps.connectmobile.courses.model.e eVar3 = b0Var.f23797a;
            o13.r.b(obj);
            eVar2 = eVar3;
        }
        k30.u uVar = (k30.u) obj;
        List<ClimbDTO> listB = uVar != null ? uVar.b() : null;
        if (uVar == null || (listD = uVar.d()) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList5 = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it4 = listD.iterator();
            while (it4.hasNext()) {
                arrayList5.add(d30.b.d((fn0.b) it4.next()));
            }
            arrayList2 = arrayList5;
        }
        w20.a aVar2 = new w20.a(eVar2, listB, arrayList2, uVar != null ? uVar.getUnpavedSections() : null, uVar != null ? uVar.getHighTrafficSections() : null, false, 32, null);
        String str = eVar2.courseId;
        boolean z14 = str == null || str.length() == 0;
        boolean zD = g22.n.d(eVar2.courseName);
        List<CourseSegmentDTO> listI2 = eVar2.i();
        if (listI2 == null) {
            listI2 = p13.j0.f134944a;
        }
        List<CourseSegmentDTO> list2 = listI2;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar2.j();
        List listC = p13.w.c(new a50.a(arrayListX, arrayList, list2, j14, listJ != null ? p13.h0.b1(listJ) : null, eVar2.G(), null));
        a50.g.f1388s.getClass();
        return new a50.g(false, null, false, aVar2, z14, zD, listC, a50.g.f1389t, null, 0, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, false, false, null, null, 64263, null);
    }
}
