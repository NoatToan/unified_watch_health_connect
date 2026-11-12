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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc30/m0;", "", "Lz20/l;", "getCourseElevationUseCase", "Lz20/r;", "getOnCourseRouteFeaturesUseCase", "<init>", "(Lz20/l;Lz20/r;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f23953c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z20.l f23954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.r f23955b;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public m0(z20.l lVar, z20.r rVar) {
        lVar.getClass();
        rVar.getClass();
        this.f23954a = lVar;
        this.f23955b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0226  */
    /* JADX WARN: Code duplicated, block: B:107:0x0242  */
    /* JADX WARN: Code duplicated, block: B:110:0x0252  */
    /* JADX WARN: Code duplicated, block: B:111:0x0259  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[LOOP:0: B:64:0x0191->B:117:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01db  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x0217  */
    /* JADX WARN: Code duplicated, block: B:97:0x021d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(com.garmin.android.apps.connectmobile.courses.model.e eVar, List list, v13.c cVar) {
        k0 k0Var;
        List listC;
        List listC2;
        List list2;
        List list3;
        List list4;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        List list5;
        k30.u uVar;
        GeoPointDTO geoPointDTO;
        GeoPointDTO geoPointDTO2;
        long j8;
        List<ClimbDTO> listB;
        ArrayList arrayList;
        k30.x unpavedSections;
        k30.t highTrafficSections;
        String str;
        boolean z14;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        List listB1;
        List<fn0.b> listD;
        com.garmin.android.library.mapsdkadapter.f fVar;
        com.garmin.android.library.mapsdkadapter.f fVar2;
        int size;
        ArrayList arrayListK1;
        Iterator it;
        o13.p pVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3 = eVar;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f23933h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f23933h = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object obj = k0Var.f23931f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f23933h;
        if (i15 == 0) {
            o13.r.b(obj);
            GeoPointDTO geoPointDTO3 = (GeoPointDTO) p13.h0.b0(list);
            GeoPointDTO geoPointDTO4 = (GeoPointDTO) p13.h0.m0(list);
            if (geoPointDTO3.b() && geoPointDTO4.b()) {
                Double d14 = geoPointDTO3.latitude;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                Double d15 = geoPointDTO3.longitude;
                double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                com.garmin.android.library.mapsdkadapter.i.b bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                com.garmin.android.library.mapsdkadapter.f fVar3 = new com.garmin.android.library.mapsdkadapter.f(dDoubleValue, dDoubleValue2, bVar);
                Double d16 = geoPointDTO4.latitude;
                double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
                Double d17 = geoPointDTO4.longitude;
                List listK = p13.x.k(fVar3, new com.garmin.android.library.mapsdkadapter.f(dDoubleValue3, d17 != null ? d17.doubleValue() : 0.0d, bVar));
                listC = p13.w.c(list);
                int size2 = list.size();
                CourseSegmentDTO courseSegmentDTO = new CourseSegmentDTO((String) null, (String) null, (Double) null, (String) null, (String) null, (Double) null, (Integer) null, (List) null, (Integer) null, 511, (p005kotlin.jvm.internal.j) null);
                courseSegmentDTO.j(Integer.valueOf(size2));
                courseSegmentDTO.k(1);
                listC2 = p13.w.c(courseSegmentDTO);
                ArrayList arrayListS = p13.y.s(listC);
                k0Var.f23926a = eVar3;
                k0Var.f23927b = listK;
                k0Var.f23928c = listC;
                k0Var.f23929d = listC2;
                k0Var.f23933h = 1;
                Object objA = this.f23954a.a(eVar3, arrayListS, k0Var);
                if (objA != aVar) {
                    list2 = listK;
                    obj = objA;
                }
                return aVar;
            }
            return null;
        }
        if (i15 == 1) {
            List list6 = k0Var.f23929d;
            listC = k0Var.f23928c;
            List list7 = k0Var.f23927b;
            com.garmin.android.apps.connectmobile.courses.model.e eVar4 = k0Var.f23926a;
            o13.r.b(obj);
            listC2 = list6;
            eVar3 = eVar4;
            list2 = list7;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list5 = k0Var.f23930e;
            list3 = k0Var.f23929d;
            listC = k0Var.f23928c;
            list4 = k0Var.f23927b;
            com.garmin.android.apps.connectmobile.courses.model.e eVar5 = k0Var.f23926a;
            o13.r.b(obj);
            eVar2 = eVar5;
        }
        uVar = (k30.u) obj;
        if (list4.isEmpty()) {
            if (list5 != null) {
                geoPointDTO = (GeoPointDTO) p13.h0.d0(list5);
            } else {
                geoPointDTO = null;
            }
            if (list5 != null) {
                geoPointDTO2 = (GeoPointDTO) p13.h0.n0(list5);
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
            fVar = (com.garmin.android.library.mapsdkadapter.f) p13.h0.b0(list4);
            fVar2 = (com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(list4);
            if ((!p005kotlin.jvm.internal.s.g(fVar, fVar2) || fVar.d(fVar2, 0.0f)) && (size = list4.size()) > 1 && size % 2 != 0) {
                int i16 = size / 2;
                arrayListK1 = p13.h0.k1(list4.subList(0, i16), p13.e0.J(list4.subList(i16 + 1, size)));
                if (!arrayListK1.isEmpty()) {
                    it = arrayListK1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            pVar = (o13.p) it.next();
                            if (!p005kotlin.jvm.internal.s.g((com.garmin.android.library.mapsdkadapter.f) pVar.f128594a, (com.garmin.android.library.mapsdkadapter.f) pVar.f128595b)) {
                                if (list5 != null) {
                                    geoPointDTO = (GeoPointDTO) p13.h0.d0(list5);
                                } else {
                                    geoPointDTO = null;
                                }
                                if (list5 != null) {
                                    geoPointDTO2 = (GeoPointDTO) p13.h0.n0(list5);
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
                if (list5 != null) {
                    geoPointDTO = (GeoPointDTO) p13.h0.d0(list5);
                } else {
                    geoPointDTO = null;
                }
                if (list5 != null) {
                    geoPointDTO2 = (GeoPointDTO) p13.h0.n0(list5);
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
        long j14 = j8;
        if (uVar != null) {
            listB = uVar.b();
        } else {
            listB = null;
        }
        if (uVar != null || (listD = uVar.d()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(p13.y.r(listD, 10));
            Iterator<T> it3 = listD.iterator();
            while (it3.hasNext()) {
                arrayList2.add(d30.b.d((fn0.b) it3.next()));
            }
            arrayList = arrayList2;
        }
        if (uVar != null) {
            unpavedSections = uVar.getUnpavedSections();
        } else {
            unpavedSections = null;
        }
        if (uVar != null) {
            highTrafficSections = uVar.getHighTrafficSections();
        } else {
            highTrafficSections = null;
        }
        w20.a aVar2 = new w20.a(eVar2, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null);
        str = eVar2.courseId;
        if (str != null || str.length() == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean zD = g22.n.d(eVar2.courseName);
        listJ = eVar2.j();
        if (listJ != null) {
            listB1 = p13.h0.b1(listJ);
        } else {
            listB1 = null;
        }
        List listC3 = p13.w.c(new a50.a(list4, listC, list3, j14, listB1, eVar2.G(), null));
        a50.g.f1388s.getClass();
        return new a50.g(false, null, false, aVar2, z14, zD, listC3, a50.g.f1389t, null, 0, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, false, false, null, null, 64263, null);
        List list8 = (List) obj;
        if (list8 != null && !list8.isEmpty()) {
            d30.b.a(list8, listC, listC2);
            d30.b.e(list8, eVar3);
            com.garmin.android.library.mapsdkadapter.i.b bVar2 = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
            eVar3.g0(bVar2);
            eVar3.L0(bVar2);
            eVar3.x0(bVar2);
            boolean zC = eVar3.m().c();
            k0Var.f23926a = eVar3;
            k0Var.f23927b = list2;
            k0Var.f23928c = listC;
            k0Var.f23929d = listC2;
            k0Var.f23930e = list8;
            k0Var.f23933h = 2;
            Object objA2 = this.f23955b.a(list8, zC, k0Var);
            if (objA2 != aVar) {
                list3 = listC2;
                list4 = list2;
                eVar2 = eVar3;
                list5 = list8;
                obj = objA2;
                uVar = (k30.u) obj;
                if (list4.isEmpty()) {
                    if (list5 != null) {
                        geoPointDTO = (GeoPointDTO) p13.h0.d0(list5);
                    } else {
                        geoPointDTO = null;
                    }
                    if (list5 != null) {
                        geoPointDTO2 = (GeoPointDTO) p13.h0.n0(list5);
                    } else {
                        geoPointDTO2 = null;
                    }
                    if (geoPointDTO != null) {
                        j8 = -1;
                    } else {
                        j8 = -1;
                    }
                } else {
                    fVar = (com.garmin.android.library.mapsdkadapter.f) p13.h0.b0(list4);
                    fVar2 = (com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(list4);
                    if (p005kotlin.jvm.internal.s.g(fVar, fVar2)) {
                        int i17 = size / 2;
                        arrayListK1 = p13.h0.k1(list4.subList(0, i17), p13.e0.J(list4.subList(i17 + 1, size)));
                        if (!arrayListK1.isEmpty()) {
                            it = arrayListK1.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    pVar = (o13.p) it.next();
                                    if (!p005kotlin.jvm.internal.s.g((com.garmin.android.library.mapsdkadapter.f) pVar.f128594a, (com.garmin.android.library.mapsdkadapter.f) pVar.f128595b)) {
                                        if (list5 != null) {
                                            geoPointDTO = (GeoPointDTO) p13.h0.d0(list5);
                                        } else {
                                            geoPointDTO = null;
                                        }
                                        if (list5 != null) {
                                            geoPointDTO2 = (GeoPointDTO) p13.h0.n0(list5);
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
                        int i18 = size / 2;
                        arrayListK1 = p13.h0.k1(list4.subList(0, i18), p13.e0.J(list4.subList(i18 + 1, size)));
                        if (!arrayListK1.isEmpty()) {
                            it = arrayListK1.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    pVar = (o13.p) it.next();
                                    if (!p005kotlin.jvm.internal.s.g((com.garmin.android.library.mapsdkadapter.f) pVar.f128594a, (com.garmin.android.library.mapsdkadapter.f) pVar.f128595b)) {
                                        if (list5 != null) {
                                            geoPointDTO = (GeoPointDTO) p13.h0.d0(list5);
                                        } else {
                                            geoPointDTO = null;
                                        }
                                        if (list5 != null) {
                                            geoPointDTO2 = (GeoPointDTO) p13.h0.n0(list5);
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
                    }
                }
                long j15 = j8;
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
                if (uVar != null) {
                    highTrafficSections = uVar.getHighTrafficSections();
                } else {
                    highTrafficSections = null;
                }
                w20.a aVar3 = new w20.a(eVar2, listB, arrayList, unpavedSections, highTrafficSections, false, 32, null);
                str = eVar2.courseId;
                if (str != null) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                boolean zD2 = g22.n.d(eVar2.courseName);
                listJ = eVar2.j();
                if (listJ != null) {
                    listB1 = p13.h0.b1(listJ);
                } else {
                    listB1 = null;
                }
                List listC4 = p13.w.c(new a50.a(list4, listC, list3, j15, listB1, eVar2.G(), null));
                a50.g.f1388s.getClass();
                return new a50.g(false, null, false, aVar3, z14, zD2, listC4, a50.g.f1389t, null, 0, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, false, false, null, null, 64263, null);
            }
            return aVar;
        }
        return null;
    }
}
