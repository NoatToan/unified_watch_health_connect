package g81;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {
    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0200  */
    /* JADX WARN: Code duplicated, block: B:88:0x0205  */
    /* JADX WARN: Code duplicated, block: B:91:0x0210  */
    /* JADX WARN: Code duplicated, block: B:92:0x0220  */
    /* JADX WARN: Code duplicated, block: B:95:0x022a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 a(n61.f fVar, l22.b bVar, n61.d dVar) {
        a0 a0Var;
        i53.c cVarB;
        Map<String, n61.g> mapG;
        Float fValueOf;
        Map<String, n61.g> mapG2;
        Float f14;
        float fFloatValue;
        float fFloatValue2;
        String str;
        Collection<n61.g> collectionValues;
        List listB1;
        Float fValueOf2;
        Collection<n61.g> collectionValues2;
        List listB2;
        t71.a aVar;
        int i14;
        n61.b bVar2;
        fVar.getClass();
        String string = bVar.getString(R.string.no_value);
        Map<String, n61.g> mapG3 = fVar.g();
        if (mapG3 != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, n61.g> entry : mapG3.entrySet()) {
                Integer groupAverage = entry.getValue().getGroupAverage();
                if (groupAverage != null) {
                    int iIntValue = groupAverage.intValue();
                    LocalDate localDateV = g22.k.v(entry.getKey(), "yyyy-MM-dd");
                    if (dVar != null) {
                        o13.p<Integer, Integer> pVar = dVar.f123845f;
                        o13.p<Integer, Integer> pVar2 = dVar.f123844e;
                        o13.p<Integer, Integer> pVar3 = dVar.f123843d;
                        o13.p<Integer, Integer> pVar4 = dVar.f123842c;
                        o13.p<Integer, Integer> pVar5 = dVar.f123841b;
                        if (new j23.l(Integer.MIN_VALUE, dVar.f123840a.f128595b.intValue()).d(groupAverage.intValue())) {
                            bVar2 = n61.b.RECREATIONAL;
                        } else if (new j23.l(pVar5.f128594a.intValue(), pVar5.f128595b.intValue()).d(groupAverage.intValue())) {
                            bVar2 = n61.b.INTERMEDIATE;
                        } else if (new j23.l(pVar4.f128594a.intValue(), pVar4.f128595b.intValue()).d(groupAverage.intValue())) {
                            bVar2 = n61.b.TRAINED;
                        } else if (new j23.l(pVar3.f128594a.intValue(), pVar3.f128595b.intValue()).d(groupAverage.intValue())) {
                            bVar2 = n61.b.WELL_TRAINED;
                        } else if (new j23.l(pVar2.f128594a.intValue(), pVar2.f128595b.intValue()).d(groupAverage.intValue())) {
                            bVar2 = n61.b.EXPERT;
                        } else {
                            bVar2 = new j23.l(pVar.f128594a.intValue(), pVar.f128595b.intValue()).d(groupAverage.intValue()) ? n61.b.SUPERIOR : n61.b.ELITE;
                        }
                        if (bVar2 != null) {
                            i14 = bVar2.f123819b;
                        }
                        aVar = new t71.a(iIntValue, localDateV, bVar.getString(i14));
                    }
                    i14 = R.string.no_value;
                    aVar = new t71.a(iIntValue, localDateV, bVar.getString(i14));
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            a0Var = null;
            cVarB = i53.a.j(arrayList);
            if (cVarB == null) {
            }
            mapG = fVar.g();
            if (mapG != null || (collectionValues2 = mapG.values()) == null || (listB2 = p13.h0.b1(collectionValues2)) == null) {
                fValueOf = a0Var;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = listB2.iterator();
                while (it.hasNext()) {
                    Integer groupAverage2 = ((n61.g) it.next()).getGroupAverage();
                    if (groupAverage2 != null) {
                        arrayList2.add(groupAverage2);
                    }
                }
                Integer num = (Integer) p13.h0.t0(arrayList2);
                if (num != null) {
                    fValueOf = Float.valueOf(num.intValue());
                } else {
                    fValueOf = a0Var;
                }
            }
            mapG2 = fVar.g();
            if (mapG2 != null || (collectionValues = mapG2.values()) == null || (listB1 = p13.h0.b1(collectionValues)) == null) {
                f14 = a0Var;
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = listB1.iterator();
                while (it3.hasNext()) {
                    Integer groupAverage3 = ((n61.g) it3.next()).getGroupAverage();
                    if (groupAverage3 != null) {
                        arrayList3.add(groupAverage3);
                    }
                }
                Integer num2 = (Integer) p13.h0.o0(arrayList3);
                if (num2 != null) {
                    fValueOf2 = Float.valueOf(num2.intValue());
                } else {
                    f14 = a0Var;
                }
            }
            if (fValueOf != 0 && f14 == 0 && cVarB.isEmpty()) {
                return a0Var;
            }
            f14 = fValueOf2;
            if (fValueOf != 0) {
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            float f15 = 500;
            float fMax = Math.max(0.0f, fFloatValue) - f15;
            if (f14 != 0) {
                fFloatValue2 = f14.floatValue();
            } else {
                fFloatValue2 = 1000.0f;
            }
            float f16 = fFloatValue2 + f15;
            if (fVar.getAvg() != null) {
                l3.f23124b.getClass();
                str = l3.f23131i.format(fVar.getAvg());
            } else {
                str = string;
            }
            str.getClass();
            if (fVar.getMax() != null) {
                l3.f23124b.getClass();
                string = l3.f23131i.format(fVar.getMax());
            }
            string.getClass();
            return new a0(str, string, new z(fMax, f16, cVarB));
        }
        a0Var = null;
        cVarB = j53.l.b();
        mapG = fVar.g();
        if (mapG != null) {
            fValueOf = a0Var;
        } else {
            fValueOf = a0Var;
        }
        mapG2 = fVar.g();
        if (mapG2 != null) {
            f14 = a0Var;
        } else {
            f14 = a0Var;
        }
        if (fValueOf != 0) {
        }
        f14 = fValueOf2;
        if (fValueOf != 0) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        float f17 = 500;
        float fMax2 = Math.max(0.0f, fFloatValue) - f17;
        if (f14 != 0) {
            fFloatValue2 = f14.floatValue();
        } else {
            fFloatValue2 = 1000.0f;
        }
        float f18 = fFloatValue2 + f17;
        if (fVar.getAvg() != null) {
            l3.f23124b.getClass();
            str = l3.f23131i.format(fVar.getAvg());
        } else {
            str = string;
        }
        str.getClass();
        if (fVar.getMax() != null) {
            l3.f23124b.getClass();
            string = l3.f23131i.format(fVar.getMax());
        }
        string.getClass();
        return new a0(str, string, new z(fMax2, f18, cVarB));
    }
}
