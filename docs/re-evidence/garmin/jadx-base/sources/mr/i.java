package mr;

import am.x0;
import am.z0;
import c22.s3;
import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import ps.a1;
import ps.m1;
import ps.o1;
import ps.q1;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/i;", "Lmr/c;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements c {
    /* JADX WARN: Code duplicated, block: B:131:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:189:0x0262  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:249:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:276:0x034f  */
    /* JADX WARN: Code duplicated, block: B:507:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    @Override // mr.c
    public final ArrayList a(jr.d dVar, ps.r rVar, nr.v vVar, boolean z14, boolean z15, ps.s0 s0Var, nr.a aVar, nr.j0 j0Var) {
        Object next;
        jr.i itemDetails;
        List<jr.o> listE;
        a1 metadataDTO;
        List<Long> listM;
        ps.p pVar;
        a1 metadataDTO2;
        ps.k0 diveInfoDTO;
        ps.k0 diveInfoDTO2;
        q1 summaryDTO;
        q1 summaryDTO2;
        boolean z16;
        boolean z17;
        List<ps.j> listD;
        ps.m mVar;
        List<ps.r0> listD2;
        boolean z18;
        boolean z19;
        List<String> list;
        a1 metadataDTO3;
        boolean z24;
        a1 metadataDTO4;
        a1 metadataDTO5;
        a1 metadataDTO6;
        Long matchedCuratedCourseId;
        a1 metadataDTO7;
        boolean z25;
        Long matchedCuratedCourseId2;
        a1 metadataDTO8;
        Long curatedCourseId;
        a1 metadataDTO9;
        a1 metadataDTO10;
        List<r80.b> list2;
        r80.b bVar;
        a1 metadataDTO11;
        List<Long> listS;
        boolean z26;
        List<ps.r0> listD3;
        boolean z27;
        a1 metadataDTO12;
        a1 metadataDTO13;
        a1 metadataDTO14;
        Iterator<T> it = dVar.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((jr.u) next).d() != jr.v.OVERVIEW);
        jr.u uVar = (jr.u) next;
        List<jr.f> listA = uVar != null ? uVar.a() : null;
        if (listA == null) {
            return null;
        }
        ArrayList<jr.f> arrayList = new ArrayList();
        for (Object obj : listA) {
            jr.k kVarC = ((jr.f) obj).c();
            boolean zD = false;
            switch (kVarC == null ? -1 : j.f120276a[kVarC.ordinal()]) {
                case 1:
                case 3:
                case 15:
                case 19:
                case 22:
                case 24:
                case 25:
                case 28:
                case 32:
                case 33:
                case 34:
                case 39:
                    zD = true;
                    break;
                case 2:
                    if (rVar != null && (metadataDTO = rVar.getMetadataDTO()) != null && (listM = metadataDTO.m()) != null && (!listM.isEmpty())) {
                        zD = true;
                    }
                    break;
                case 4:
                    cq.y.a aVar2 = cq.y.f55115a;
                    List<x1> listI = (aVar == null || (pVar = aVar.f126977d) == null) ? null : pVar.i();
                    aVar2.getClass();
                    if (!cq.y.a.a(listI).isEmpty()) {
                        zD = true;
                    }
                    break;
                case 5:
                    if ((vVar != null ? vVar.f127380c : null) != null) {
                        zD = true;
                    }
                    break;
                case 6:
                    List<ps.c0> list3 = vVar != null ? vVar.f127379b : null;
                    if (!(list3 == null || list3.isEmpty())) {
                        zD = true;
                    }
                    break;
                case 7:
                    List<ps.c0> list4 = vVar != null ? vVar.f127379b : null;
                    boolean z28 = list4 == null || list4.isEmpty();
                    boolean z29 = (vVar != null ? vVar.f127380c : null) != null;
                    boolean zB = s3.b();
                    boolean zG = (rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null) ? false : p005kotlin.jvm.internal.s.g(metadataDTO2.getIsManualActivity(), Boolean.TRUE);
                    boolean z34 = rVar != null && oe2.f.J(rVar);
                    if (rVar != null && z34 && !zB && z28 && !zG && !z29) {
                        zD = true;
                    }
                    break;
                case 9:
                    if (rVar != null) {
                        List<r80.b> list5 = vVar != null ? vVar.f127378a : null;
                        if (!(list5 == null || list5.isEmpty())) {
                            if ((vVar != null ? vVar.f127380c : null) == null) {
                                zD = true;
                            }
                        }
                    }
                    break;
                case 10:
                    zD = g22.n.d((rVar == null || (diveInfoDTO = rVar.getDiveInfoDTO()) == null) ? null : diveInfoDTO.getBuddy());
                    break;
                case 11:
                    zD = g22.n.d((rVar == null || (diveInfoDTO2 = rVar.getDiveInfoDTO()) == null) ? null : diveInfoDTO2.getEquipment());
                    break;
                case 12:
                    if ((rVar != null ? rVar.getDiveInfoDTO() : null) != null) {
                        zD = true;
                    }
                    break;
                case 13:
                    if (rVar != null && oe2.f.J(rVar)) {
                        zD = true;
                    }
                    break;
                case 14:
                    zD = oe2.f.B(rVar);
                    break;
                case 16:
                    if (rVar != null) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (k1.f37122a.q()) {
                            zD = true;
                        }
                    }
                    break;
                case 17:
                    Double startLatitude = (rVar == null || (summaryDTO2 = rVar.getSummaryDTO()) == null) ? null : summaryDTO2.getStartLatitude();
                    Double startLongitude = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null) ? null : summaryDTO.getStartLongitude();
                    if (startLatitude != null && !Double.isNaN(startLatitude.doubleValue()) && startLongitude != null && !Double.isNaN(startLongitude.doubleValue())) {
                        zD = true;
                    }
                    break;
                case 18:
                    if ((j0Var != null ? j0Var.f127215h : null) != null) {
                        z16 = true;
                    } else if (((j0Var == null || (mVar = j0Var.f127208a) == null) ? null : mVar.getEncodedSamples()) != null) {
                        z16 = true;
                    } else if ((j0Var != null ? j0Var.f127213f : null) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVar != null) {
                        a1 metadataDTO15 = rVar.getMetadataDTO();
                        q1 summaryDTO3 = rVar.getSummaryDTO();
                        boolean z35 = zf.b.D(summaryDTO3 != null ? summaryDTO3.getStartLatitude() : null) && zf.b.D(summaryDTO3.getStartLongitude());
                        boolean z36 = zf.b.D(summaryDTO3 != null ? summaryDTO3.getEndLatitude() : null) && zf.b.D(summaryDTO3.getEndLongitude());
                        String str = rVar.h().f4358a;
                        z0 z0Var = z0.f4390a;
                        if (!z0.b(x0.D, str)) {
                            if (!z16) {
                                if (!(metadataDTO15 != null ? p005kotlin.jvm.internal.s.g(metadataDTO15.getHasPolyline(), Boolean.TRUE) : false)) {
                                    if (!(metadataDTO15 != null ? p005kotlin.jvm.internal.s.g(metadataDTO15.getHasHeatmap(), Boolean.TRUE) : false)) {
                                        z17 = false;
                                    }
                                }
                            }
                            z17 = true;
                        } else if (z35 || z36) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((metadataDTO15 == null || (listD = metadataDTO15.d()) == null || !(listD.isEmpty() ^ true)) ? false : true) {
                            zD = true;
                        } else {
                            String videoUrl = metadataDTO15 != null ? metadataDTO15.getVideoUrl() : null;
                            if (!(videoUrl == null || videoUrl.length() == 0) || z17) {
                                zD = true;
                            }
                        }
                    }
                    break;
                case 20:
                    if (s0Var != null && (listD2 = s0Var.d()) != null) {
                        if (listD2.isEmpty()) {
                            z19 = false;
                        } else {
                            Iterator<T> it3 = listD2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    ps.r0 r0Var = (ps.r0) it3.next();
                                    if (w02.b0.r(r0Var)) {
                                        List<String> list6 = r0Var.f140203j;
                                        if (((list6 == null || list6.isEmpty()) && ((list = r0Var.f140204k) == null || list.isEmpty())) ? false : true) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = false;
                                    }
                                    if (z18) {
                                        z19 = true;
                                    }
                                } else {
                                    z19 = false;
                                }
                            }
                        }
                        if (z19) {
                            zD = true;
                        }
                    }
                    break;
                case 21:
                    if (z15) {
                        if (rVar != null && oe2.f.J(rVar)) {
                            zD = true;
                        }
                    }
                    break;
                case 23:
                    if (rVar != null && (metadataDTO3 = rVar.getMetadataDTO()) != null) {
                        zD = p005kotlin.jvm.internal.s.g(metadataDTO3.getIsAtpActivity(), Boolean.TRUE);
                    }
                    break;
                case 26:
                    if (rVar != null && oe2.f.J(rVar)) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        k1.f37122a.getClass();
                        s3.f23252a.getClass();
                        if (s3.a("ROLE_MBTESTER")) {
                            z24 = true;
                        } else {
                            com.garmin.android.apps.connectmobile.l.g().getClass();
                            if (gh2.i.f77458c.a().f77477b.c("archery_x_enabled")) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                        }
                        if (z24) {
                            zD = true;
                        }
                    }
                    break;
                case 27:
                    if (((rVar == null || (metadataDTO4 = rVar.getMetadataDTO()) == null) ? null : metadataDTO4.getCalendarEventInfo()) != null) {
                        zD = true;
                    }
                    break;
                case 29:
                    if (((rVar == null || (metadataDTO5 = rVar.getMetadataDTO()) == null) ? null : metadataDTO5.getGroupRideUUID()) != null) {
                        zD = true;
                    }
                    break;
                case 30:
                    List<m1> listN0 = (rVar == null || (metadataDTO6 = rVar.getMetadataDTO()) == null) ? null : metadataDTO6.n0();
                    zD = !(listN0 == null || listN0.isEmpty());
                    break;
                case 31:
                    if ((rVar != null ? rVar.getParentId() : null) == null) {
                        zD = true;
                    }
                    break;
                case 35:
                    if (((rVar == null || (metadataDTO9 = rVar.getMetadataDTO()) == null) ? null : metadataDTO9.getCuratedCourseId()) == null) {
                        if (rVar != null || (metadataDTO8 = rVar.getMetadataDTO()) == null) {
                            matchedCuratedCourseId = null;
                        } else {
                            matchedCuratedCourseId = metadataDTO8.getMatchedCuratedCourseId();
                        }
                        if (matchedCuratedCourseId != null) {
                            metadataDTO7 = rVar.getMetadataDTO();
                            if (metadataDTO7 == null && (matchedCuratedCourseId2 = metadataDTO7.getMatchedCuratedCourseId()) != null && matchedCuratedCourseId2.longValue() == -1) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if (!z25) {
                                zD = true;
                            }
                        }
                    } else {
                        a1 metadataDTO16 = rVar.getMetadataDTO();
                        if ((metadataDTO16 == null || (curatedCourseId = metadataDTO16.getCuratedCourseId()) == null || curatedCourseId.longValue() != -1) ? false : true) {
                            if (rVar != null) {
                                matchedCuratedCourseId = null;
                            } else {
                                matchedCuratedCourseId = null;
                            }
                            if (matchedCuratedCourseId != null) {
                                metadataDTO7 = rVar.getMetadataDTO();
                                if (metadataDTO7 == null) {
                                    z25 = false;
                                } else {
                                    z25 = false;
                                }
                                if (!z25) {
                                    zD = true;
                                }
                            }
                        } else {
                            zD = true;
                        }
                    }
                    break;
                case 36:
                    if (!z15) {
                        zD = true;
                    }
                    break;
                case 37:
                    if (z14 && oe2.f.J(rVar)) {
                        zD = true;
                    }
                    break;
                case 38:
                    ss.n.a aVar3 = ss.n.f160608a;
                    Boolean boolValueOf = (vVar == null || (list2 = vVar.f127378a) == null || (bVar = (r80.b) p13.h0.d0(list2)) == null) ? null : Boolean.valueOf(bVar.g());
                    qs.d.a aVar4 = qs.d.f147044b;
                    String manufacturer = (rVar == null || (metadataDTO10 = rVar.getMetadataDTO()) == null) ? null : metadataDTO10.getManufacturer();
                    aVar4.getClass();
                    qs.d dVarA = qs.d.a.a(manufacturer);
                    aVar3.getClass();
                    zD = ss.n.a.b(boolValueOf, dVarA);
                    break;
                case 40:
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    if (k1.f37122a.H0() && !s3.b()) {
                        if ((rVar == null || (metadataDTO11 = rVar.getMetadataDTO()) == null || (listS = metadataDTO11.s()) == null || !(listS.isEmpty() ^ true)) ? false : true) {
                            zD = true;
                        }
                    }
                    break;
                case 41:
                case 42:
                case 43:
                case 44:
                    if (oe2.f.J(rVar)) {
                        zD = true;
                    } else {
                        if (s0Var == null || (listD3 = s0Var.d()) == null) {
                            z26 = false;
                        } else {
                            if (listD3.isEmpty()) {
                                z27 = false;
                            } else {
                                Iterator<T> it4 = listD3.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        z27 = false;
                                    } else if (((ps.r0) it4.next()).j() == qs.i.ACTIVE) {
                                        z27 = true;
                                    }
                                }
                            }
                            if (z27) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                        }
                        if (z26) {
                            zD = true;
                        }
                    }
                    break;
                case 45:
                    if (((rVar == null || (metadataDTO12 = rVar.getMetadataDTO()) == null) ? null : metadataDTO12.getCuratedCourseId()) != null) {
                        a1 metadataDTO17 = rVar.getMetadataDTO();
                        if (metadataDTO17 != null ? p005kotlin.jvm.internal.s.g(metadataDTO17.getHasTimeInGearData(), Boolean.TRUE) : false) {
                            zD = true;
                        }
                    }
                    break;
                case 46:
                    if (oe2.f.J(rVar)) {
                        if ((rVar == null || (metadataDTO13 = rVar.getMetadataDTO()) == null || !metadataDTO13.E0()) ? false : true) {
                            zD = true;
                        }
                    }
                    break;
                case 47:
                    if ((rVar == null || (metadataDTO14 = rVar.getMetadataDTO()) == null) ? false : p005kotlin.jvm.internal.s.g(metadataDTO14.getHasMultiDayActivities(), Boolean.TRUE)) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (k1.f37122a.y()) {
                            zD = true;
                        }
                    }
                    break;
            }
            if (zD) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (jr.f fVarA : arrayList) {
            o1 o1VarC = ss.l.c(rVar != null ? rVar.t() : null, qs.x.CLIMB_ACTIVE);
            String mode = o1VarC != null ? o1VarC.getMode() : null;
            fVarA.getClass();
            if (p005kotlin.jvm.internal.s.g(mode, to.i.SIMPLE.f165805a)) {
                Set setB = p13.a1.b(jr.p.CLIMB_SENDS);
                if (!setB.isEmpty() && (itemDetails = fVarA.getItemDetails()) != null && (listE = itemDetails.e()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listE) {
                        if (!p13.h0.R(setB, ((jr.o) obj2).b())) {
                            arrayList3.add(obj2);
                        }
                    }
                    fVarA = jr.f.a(fVarA, jr.i.a(fVarA.getItemDetails(), arrayList3));
                }
            }
            arrayList2.add(fVarA);
        }
        return arrayList2;
    }
}
