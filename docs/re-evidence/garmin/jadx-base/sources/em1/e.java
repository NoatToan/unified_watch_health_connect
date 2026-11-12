package em1;

import java.util.Iterator;
import java.util.List;
import rl1.i;
import rm1.h;
import rm1.j;
import rm1.k;
import rm1.m;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64625a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.MOVEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.BREATHING_VARIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.AWAKE_RESTLESSNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.RESTING_HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i.BODY_BATTERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i.SKIN_TEMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i.PULSE_OX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[i.RESPIRATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[i.RESPIRATION_AVERAGES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[i.OVERNIGHT_HRV.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f64625a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    public static final boolean a(j jVar, i iVar) {
        List<rm1.i> list;
        List<rm1.a> list2;
        int iIntValue;
        h hVar;
        List<rm1.i> list3;
        List<k> list4;
        List<k> list5;
        List<k> list6;
        List<rm1.f> list7;
        List<m> list8;
        h hVar2;
        List<rm1.d> list9;
        h hVar3;
        List<rm1.c> list10;
        List<k> list11;
        iVar.getClass();
        switch (a.f64625a[iVar.ordinal()]) {
            case 1:
                if (jVar == null || (list = jVar.f153586b) == null || list.isEmpty()) {
                    return false;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (c(Double.valueOf(((rm1.i) it.next()).f153582a))) {
                    }
                }
                return false;
            case 2:
                if (jVar == null || (list2 = jVar.f153588d) == null || list2.isEmpty()) {
                    return false;
                }
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    Integer num = ((rm1.a) it3.next()).f153531c;
                    if (num == null || (iIntValue = num.intValue()) < 0 || iIntValue == vl1.a.UNMEASURABLE.f178704a) {
                        num = null;
                    }
                    if (num != null) {
                    }
                }
                return false;
            case 3:
                return (jVar == null || (hVar = jVar.f153585a) == null || !b(hVar) || (list3 = jVar.f153587c) == null || list3.isEmpty() || (list4 = jVar.f153589e) == null || list4.isEmpty()) ? false : true;
            case 4:
                if (jVar == null || (list5 = jVar.f153600p) == null || list5.isEmpty()) {
                    return false;
                }
                Iterator<T> it4 = list5.iterator();
                while (it4.hasNext()) {
                    if (c(Double.valueOf(((k) it4.next()).f153611a))) {
                    }
                }
                return false;
            case 5:
                if (jVar == null || (list6 = jVar.f153601q) == null || list6.isEmpty()) {
                    return false;
                }
                Iterator<T> it5 = list6.iterator();
                while (it5.hasNext()) {
                    if (c(Double.valueOf(((k) it5.next()).f153611a))) {
                    }
                }
                return false;
            case 6:
                if (jVar == null || (list7 = jVar.f153597m) == null || list7.isEmpty()) {
                    return false;
                }
                for (rm1.f fVar : list7) {
                    if (fVar != null) {
                        em1.a aVar = em1.a.f64616a;
                        Double d14 = fVar.f153557c;
                        aVar.getClass();
                        if (!em1.a.a(d14) || !em1.a.b(fVar.f153558d)) {
                            fVar = null;
                        }
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                    }
                }
                return false;
            case 7:
                if (jVar == null || jVar.f153590f == null || (list8 = jVar.f153591g) == null || list8.isEmpty()) {
                    return false;
                }
                Iterator<T> it6 = list8.iterator();
                while (it6.hasNext()) {
                    if (c(Double.valueOf(((m) it6.next()).f153627b))) {
                    }
                }
                return false;
            case 8:
                if (jVar == null || (hVar2 = jVar.f153585a) == null || !b(hVar2) || (list9 = jVar.f153592h) == null || list9.isEmpty()) {
                    return false;
                }
                Iterator<T> it7 = list9.iterator();
                while (it7.hasNext()) {
                    if (c(((rm1.d) it7.next()).f153543b)) {
                    }
                }
                return false;
            case 9:
                if (jVar == null || (hVar3 = jVar.f153585a) == null || !b(hVar3) || (list10 = jVar.f153593i) == null || list10.isEmpty()) {
                    return false;
                }
                Iterator<T> it8 = list10.iterator();
                while (it8.hasNext()) {
                    if (c(((rm1.c) it8.next()).f153539b)) {
                    }
                }
                return false;
            case 10:
                if (jVar == null || (list11 = jVar.f153603s) == null || list11.isEmpty()) {
                    return false;
                }
                Iterator<T> it9 = list11.iterator();
                while (it9.hasNext()) {
                    if (c(Double.valueOf(((k) it9.next()).f153611a))) {
                    }
                }
                return false;
            default:
                return false;
        }
    }

    public static final boolean b(h hVar) {
        return hVar != null && hVar.f153569d > 0 && hVar.f153571f > 0;
    }

    public static final boolean c(Double d14) {
        if (d14 == null || d14.doubleValue() <= 0.0d) {
            d14 = null;
        }
        return d14 != null;
    }
}
