package pr;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.newmodel.a0;
import com.garmin.android.library.mapsdkadapter.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ls.c;
import nr.j0;
import o13.p;
import o53.f0;
import p13.h0;
import ps.a1;
import ps.b2;
import ps.c1;
import ps.d1;
import ps.i;
import ps.j;
import ps.m;
import ps.q1;
import ps.r;
import ps.x1;
import wg0.d;
import wg0.e;
import wg0.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:101:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0140  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0153  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x015c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160  */
    /* JADX WARN: Code duplicated, block: B:83:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x0169  */
    /* JADX WARN: Code duplicated, block: B:86:0x016e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0172  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:91:0x017b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:97:0x0193  */
    /* JADX WARN: Code duplicated, block: B:98:0x0198  */
    public static final l a(r rVar, j0 j0Var, os.a aVar, boolean z14) {
        f fVar;
        f fVar2;
        c1 c1Var;
        b2 b2Var;
        List<c> list;
        List<x1> list2;
        List<a0> list3;
        List<i> list4;
        List<d1> list5;
        d dVar;
        a1 metadataDTO;
        List<j> listD;
        Long activityId;
        long jLongValue;
        Number number;
        Number number2;
        Double dPrevious;
        Double dPrevious2;
        aVar.getClass();
        boolean zV2 = aVar.V2();
        c1 c1VarC = j0Var != null ? j0Var.f127210c : null;
        m mVar = j0Var != null ? j0Var.f127208a : null;
        if (!zV2 || c1VarC == null) {
            if (zV2 && mVar != null && e.b(mVar)) {
                c1VarC = e.c(mVar);
                p<f, f> pVarA = e.a(mVar);
                fVar = pVarA.f128594a;
                fVar2 = pVarA.f128595b;
            } else {
                q1 summaryDTO = rVar.getSummaryDTO();
                Double startLatitude = summaryDTO != null ? summaryDTO.getStartLatitude() : null;
                q1 summaryDTO2 = rVar.getSummaryDTO();
                Double startLongitude = summaryDTO2 != null ? summaryDTO2.getStartLongitude() : null;
                if (startLatitude == null || startLongitude == null) {
                    fVar = null;
                } else {
                    fVar = new f(startLatitude.doubleValue(), startLongitude.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                }
                q1 summaryDTO3 = rVar.getSummaryDTO();
                Double endLatitude = summaryDTO3 != null ? summaryDTO3.getEndLatitude() : null;
                q1 summaryDTO4 = rVar.getSummaryDTO();
                Double endLongitude = summaryDTO4 != null ? summaryDTO4.getEndLongitude() : null;
                if (endLatitude == null || endLongitude == null) {
                    fVar2 = null;
                    c1Var = null;
                } else {
                    fVar2 = new f(endLatitude.doubleValue(), endLongitude.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                    c1Var = null;
                }
            }
            if (c1Var != null && fVar == null && fVar2 == null) {
                if ((j0Var != null ? j0Var.f127215h : null) == null) {
                    dVar = null;
                } else {
                    x0 x0VarH = rVar.h();
                    f fVar3 = fVar;
                    f fVar4 = fVar2;
                    if (j0Var != null) {
                        b2Var = j0Var.f127209b;
                    } else {
                        b2Var = null;
                    }
                    if (j0Var != null) {
                        list = j0Var.f127211d;
                    } else {
                        list = null;
                    }
                    if (j0Var != null) {
                        list2 = j0Var.f127212e;
                    } else {
                        list2 = null;
                    }
                    if (j0Var != null) {
                        list3 = j0Var.f127213f;
                    } else {
                        list3 = null;
                    }
                    if (j0Var != null) {
                        list4 = j0Var.f127215h;
                    } else {
                        list4 = null;
                    }
                    if (j0Var != null) {
                        list5 = j0Var.f127214g;
                    } else {
                        list5 = null;
                    }
                    dVar = new d(x0VarH, c1Var, fVar3, fVar4, b2Var, list, list2, list3, list4, list5, aVar, z14);
                }
            } else {
                x0 x0VarH2 = rVar.h();
                f fVar5 = fVar;
                f fVar6 = fVar2;
                if (j0Var != null) {
                    b2Var = j0Var.f127209b;
                } else {
                    b2Var = null;
                }
                if (j0Var != null) {
                    list = j0Var.f127211d;
                } else {
                    list = null;
                }
                if (j0Var != null) {
                    list2 = j0Var.f127212e;
                } else {
                    list2 = null;
                }
                if (j0Var != null) {
                    list3 = j0Var.f127213f;
                } else {
                    list3 = null;
                }
                if (j0Var != null) {
                    list4 = j0Var.f127215h;
                } else {
                    list4 = null;
                }
                if (j0Var != null) {
                    list5 = j0Var.f127214g;
                } else {
                    list5 = null;
                }
                dVar = new d(x0VarH2, c1Var, fVar5, fVar6, b2Var, list, list2, list3, list4, list5, aVar, z14);
            }
            metadataDTO = rVar.getMetadataDTO();
            if (metadataDTO != null) {
                listD = metadataDTO.d();
            } else {
                listD = null;
            }
            ArrayList arrayListD1 = h0.d1(f0.K(listD));
            activityId = rVar.getActivityId();
            if (activityId != null) {
                jLongValue = activityId.longValue();
            } else {
                jLongValue = -1;
            }
            a1 metadataDTO2 = rVar.getMetadataDTO();
            return new l(dVar, arrayListD1, f0.s(jLongValue, metadataDTO2 != null ? metadataDTO2.getVideoUrl() : null), null, 0, 16, null);
        }
        List<Double> list6 = c1VarC.f139765b;
        List<Double> list7 = c1VarC.f139764a;
        Iterator<T> it = list7.iterator();
        do {
            if (it.hasNext()) {
                number = (Number) it.next();
            }
            n23.j.s("Collection contains no element matching the predicate.");
            return null;
        } while (Double.isNaN(number.doubleValue()));
        double dDoubleValue = number.doubleValue();
        Iterator<T> it3 = list6.iterator();
        do {
            if (!it3.hasNext()) {
                n23.j.s("Collection contains no element matching the predicate.");
                return null;
            }
            number2 = (Number) it3.next();
        } while (Double.isNaN(number2.doubleValue()));
        fVar = new f(dDoubleValue, number2.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        ListIterator<Double> listIterator = list7.listIterator(list7.size());
        do {
            if (listIterator.hasPrevious()) {
                dPrevious = listIterator.previous();
            }
            n23.j.s("List contains no element matching the predicate.");
            return null;
        } while (Double.isNaN(dPrevious.doubleValue()));
        double dDoubleValue2 = dPrevious.doubleValue();
        ListIterator<Double> listIterator2 = list6.listIterator(list6.size());
        do {
            if (!listIterator2.hasPrevious()) {
                n23.j.s("List contains no element matching the predicate.");
                return null;
            }
            dPrevious2 = listIterator2.previous();
        } while (Double.isNaN(dPrevious2.doubleValue()));
        fVar2 = new f(dDoubleValue2, dPrevious2.doubleValue(), com.garmin.android.library.mapsdkadapter.i.b.WGS84);
        c1Var = c1VarC;
        if (c1Var != null) {
            x0 x0VarH3 = rVar.h();
            f fVar7 = fVar;
            f fVar8 = fVar2;
            if (j0Var != null) {
                b2Var = j0Var.f127209b;
            } else {
                b2Var = null;
            }
            if (j0Var != null) {
                list = j0Var.f127211d;
            } else {
                list = null;
            }
            if (j0Var != null) {
                list2 = j0Var.f127212e;
            } else {
                list2 = null;
            }
            if (j0Var != null) {
                list3 = j0Var.f127213f;
            } else {
                list3 = null;
            }
            if (j0Var != null) {
                list4 = j0Var.f127215h;
            } else {
                list4 = null;
            }
            if (j0Var != null) {
                list5 = j0Var.f127214g;
            } else {
                list5 = null;
            }
            dVar = new d(x0VarH3, c1Var, fVar7, fVar8, b2Var, list, list2, list3, list4, list5, aVar, z14);
        } else {
            x0 x0VarH4 = rVar.h();
            f fVar9 = fVar;
            f fVar10 = fVar2;
            if (j0Var != null) {
                b2Var = j0Var.f127209b;
            } else {
                b2Var = null;
            }
            if (j0Var != null) {
                list = j0Var.f127211d;
            } else {
                list = null;
            }
            if (j0Var != null) {
                list2 = j0Var.f127212e;
            } else {
                list2 = null;
            }
            if (j0Var != null) {
                list3 = j0Var.f127213f;
            } else {
                list3 = null;
            }
            if (j0Var != null) {
                list4 = j0Var.f127215h;
            } else {
                list4 = null;
            }
            if (j0Var != null) {
                list5 = j0Var.f127214g;
            } else {
                list5 = null;
            }
            dVar = new d(x0VarH4, c1Var, fVar9, fVar10, b2Var, list, list2, list3, list4, list5, aVar, z14);
        }
        metadataDTO = rVar.getMetadataDTO();
        if (metadataDTO != null) {
            listD = metadataDTO.d();
        } else {
            listD = null;
        }
        ArrayList arrayListD2 = h0.d1(f0.K(listD));
        activityId = rVar.getActivityId();
        if (activityId != null) {
            jLongValue = activityId.longValue();
        } else {
            jLongValue = -1;
        }
        a1 metadataDTO3 = rVar.getMetadataDTO();
        return new l(dVar, arrayListD2, f0.s(jLongValue, metadataDTO3 != null ? metadataDTO3.getVideoUrl() : null), null, 0, 16, null);
    }
}
