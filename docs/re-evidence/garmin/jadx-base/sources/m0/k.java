package m0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.n1;
import b0.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f115506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rational f115509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f115510e;

    public k(k0 k0Var, Size size) {
        Rational rational;
        this.f115506a = k0Var;
        this.f115507b = k0Var.h();
        this.f115508c = k0Var.b();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List<Size> supportedResolutions = k0Var.getSupportedResolutions(256);
            if (supportedResolutions.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(supportedResolutions, new j0.e());
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f115509d = rational;
        this.f115510e = new l(k0Var, rational);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j0.a.f95902a);
        arrayList.add(j0.a.f95904c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                } while (!j0.a.a(size, (Rational) it3.next(), q0.c.f141973c));
            }
        }
        return arrayList;
    }

    public static Rational c(int i14, boolean z14) {
        if (i14 == 0) {
            return z14 ? j0.a.f95902a : j0.a.f95903b;
        }
        if (i14 != 1) {
            return null;
        }
        return z14 ? j0.a.f95904c : j0.a.f95905d;
    }

    public static HashMap d(List list) {
        HashMap map = new HashMap();
        Iterator it = a(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            for (Rational rational : map.keySet()) {
                if (j0.a.a(size, rational, q0.c.f141973c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static ArrayList e(u0.c cVar, List list, Size size, int i14, Rational rational, int i15, int i16) {
        u0.a aVar = cVar.f167324a;
        HashMap mapD = d(list);
        boolean z14 = rational == null || rational.getNumerator() >= rational.getDenominator();
        Rational rationalC = c(aVar.f167322a, z14);
        if (aVar.f167323b == 0) {
            Rational rationalC2 = c(aVar.f167322a, z14);
            for (Rational rational2 : new ArrayList(mapD.keySet())) {
                if (!rational2.equals(rationalC2)) {
                    mapD.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(mapD.keySet());
        Collections.sort(arrayList, new j0.a.C1835a(rationalC, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, (List) mapD.get(rational3));
        }
        if (size != null) {
            Size size2 = q0.c.f141971a;
            int height = size.getHeight() * size.getWidth();
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (q0.c.a(size3) <= height) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        u0.d dVar = cVar.f167325b;
        if (dVar != null) {
            Iterator it3 = linkedHashMap.keySet().iterator();
            while (it3.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it3.next());
                if (!list3.isEmpty()) {
                    int i17 = dVar.f167334b;
                    if (!dVar.equals(u0.d.f167332c)) {
                        Size size4 = dVar.f167333a;
                        if (i17 == 0) {
                            boolean zContains = list3.contains(size4);
                            list3.clear();
                            if (zContains) {
                                list3.add(size4);
                            }
                        } else if (i17 == 1) {
                            f(list3, size4, true);
                        } else if (i17 == 2) {
                            f(list3, size4, false);
                        } else if (i17 == 3) {
                            g(list3, size4, true);
                        } else if (i17 == 4) {
                            g(list3, size4, false);
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            for (Size size5 : (List) it4.next()) {
                if (!arrayList3.contains(size5)) {
                    arrayList3.add(size5);
                }
            }
        }
        u0.b bVar = cVar.f167326c;
        if (bVar == null) {
            return arrayList3;
        }
        j0.c.a(j0.c.b(i14), i15, i16 == 1);
        ArrayList arrayList4 = new ArrayList(arrayList3);
        Size size6 = (Size) ((a73.j) bVar).f1851b;
        g0.d dVar2 = g0.A;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        if (arrayList5.contains(size6)) {
            arrayList5.remove(size6);
            arrayList5.add(0, size6);
        }
        if (arrayList3.containsAll(arrayList5)) {
            return arrayList5;
        }
        vb.h.s("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
        return null;
    }

    public static void f(List<Size> list, Size size, boolean z14) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z14) {
            list.addAll(arrayList);
        }
    }

    public static void g(List<Size> list, Size size, boolean z14) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            Size size2 = list.get(i14);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z14) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[LOOP:5: B:58:0x011b->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d A[LOOP:2: B:75:0x0167->B:77:0x016d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1  */
    public final List<Size> b(b3<?> b3Var) {
        Size[] sizeArr;
        Size size;
        Size size2;
        Size sizeA;
        Iterator it;
        Rational rational;
        ArrayList arrayList;
        HashMap mapD;
        Iterator it3;
        Iterator it4;
        n1 n1Var = (n1) b3Var;
        ArrayList arrayListP = n1Var.p();
        if (arrayListP != null) {
            return arrayListP;
        }
        u0.c cVarR = n1Var.r();
        List listK = n1Var.K();
        int iZ = b3Var.z();
        Rational rational2 = null;
        if (listK == null) {
            sizeArr = null;
            break;
        }
        Iterator it5 = listK.iterator();
        while (true) {
            if (!it5.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it5.next();
            if (((Integer) pair.first).intValue() == iZ) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List<Size> listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        k0 k0Var = this.f115506a;
        if (listAsList == null) {
            listAsList = k0Var.getSupportedResolutions(iZ);
        }
        ArrayList arrayList2 = new ArrayList(listAsList);
        Collections.sort(arrayList2, new j0.e(true));
        arrayList2.isEmpty();
        if (cVarR != null) {
            Size sizeM = ((n1) b3Var).m();
            int iD = n1Var.D(0);
            if (!b3Var.A()) {
                int iZ2 = b3Var.z();
                if (cVarR.f167327d == 1) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(k0Var.v(iZ2));
                    Collections.sort(arrayList3, new j0.e(true));
                    arrayList2 = arrayList3;
                }
            }
            ArrayList arrayList4 = arrayList2;
            b3Var.toString();
            arrayList4.toString();
            return e(n1Var.B(), arrayList4, sizeM, iD, this.f115509d, this.f115507b, this.f115508c);
        }
        l lVar = this.f115510e;
        lVar.getClass();
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList<Size> arrayList5 = new ArrayList(arrayList2);
        Collections.sort(arrayList5, new j0.e(true));
        ArrayList arrayList6 = new ArrayList();
        n1 n1Var2 = (n1) b3Var;
        Size sizeM2 = n1Var2.m();
        Size size3 = (Size) arrayList5.get(0);
        if (sizeM2 == null) {
            size = size3;
        } else if (q0.c.a(size3) < sizeM2.getHeight() * sizeM2.getWidth()) {
            size = size3;
        } else {
            size = sizeM2;
        }
        Size sizeA2 = lVar.a(n1Var2);
        Size size4 = q0.c.f141973c;
        int iA = q0.c.a(size4);
        if (q0.c.a(size) >= iA) {
            if (sizeA2 != null) {
                if (sizeA2.getHeight() * sizeA2.getWidth() < iA) {
                    size2 = sizeA2;
                }
            }
            for (Size size5 : arrayList5) {
                if (q0.c.a(size5) <= size.getHeight() * size.getWidth()) {
                    if (size5.getHeight() * size5.getWidth() < q0.c.a(size2) && !arrayList6.contains(size5)) {
                        arrayList6.add(size5);
                    }
                }
            }
            if (!arrayList6.isEmpty()) {
                com.google.firebase.messaging.l.k(size2, "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ", "\nmaxSize = ", size, "\ninitial size list: ", arrayList5);
                return null;
            }
            if (n1Var2.N()) {
                sizeA = lVar.a(n1Var2);
                if (sizeA != null) {
                    it = a(arrayList6).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            rational2 = new Rational(sizeA.getWidth(), sizeA.getHeight());
                            break;
                        }
                        rational = (Rational) it.next();
                        if (j0.a.a(sizeA, rational, q0.c.f141973c)) {
                            rational2 = rational;
                            break;
                        }
                    }
                }
            } else {
                rational2 = c(n1Var2.u(), lVar.f115514d);
            }
            if (sizeA2 == null) {
                sizeA2 = n1Var2.L();
            }
            arrayList = new ArrayList();
            new HashMap();
            if (rational2 == null) {
                arrayList.addAll(arrayList6);
                if (sizeA2 != null) {
                    f(arrayList, sizeA2, true);
                    return arrayList;
                }
            } else {
                mapD = d(arrayList6);
                if (sizeA2 != null) {
                    it4 = mapD.keySet().iterator();
                    while (it4.hasNext()) {
                        f((List) mapD.get((Rational) it4.next()), sizeA2, true);
                    }
                }
                ArrayList arrayList7 = new ArrayList(mapD.keySet());
                Collections.sort(arrayList7, new j0.a.C1835a(rational2, lVar.f115513c));
                it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    for (Size size6 : (List) mapD.get((Rational) it3.next())) {
                        if (!arrayList.contains(size6)) {
                            arrayList.add(size6);
                        }
                    }
                }
            }
            return arrayList;
        }
        size4 = q0.c.f141971a;
        size2 = size4;
        while (r3.hasNext()) {
            if (q0.c.a(size5) <= size.getHeight() * size.getWidth()) {
                if (size5.getHeight() * size5.getWidth() < q0.c.a(size2)) {
                }
            }
        }
        if (!arrayList6.isEmpty()) {
            com.google.firebase.messaging.l.k(size2, "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ", "\nmaxSize = ", size, "\ninitial size list: ", arrayList5);
            return null;
        }
        if (n1Var2.N()) {
            sizeA = lVar.a(n1Var2);
            if (sizeA != null) {
                it = a(arrayList6).iterator();
                while (true) {
                    if (it.hasNext()) {
                        rational2 = new Rational(sizeA.getWidth(), sizeA.getHeight());
                        break;
                    }
                    rational = (Rational) it.next();
                    if (j0.a.a(sizeA, rational, q0.c.f141973c)) {
                        rational2 = rational;
                        break;
                    }
                }
            }
        } else {
            rational2 = c(n1Var2.u(), lVar.f115514d);
        }
        if (sizeA2 == null) {
            sizeA2 = n1Var2.L();
        }
        arrayList = new ArrayList();
        new HashMap();
        if (rational2 == null) {
            arrayList.addAll(arrayList6);
            if (sizeA2 != null) {
                f(arrayList, sizeA2, true);
                return arrayList;
            }
        } else {
            mapD = d(arrayList6);
            if (sizeA2 != null) {
                it4 = mapD.keySet().iterator();
                while (it4.hasNext()) {
                    f((List) mapD.get((Rational) it4.next()), sizeA2, true);
                }
            }
            ArrayList arrayList8 = new ArrayList(mapD.keySet());
            Collections.sort(arrayList8, new j0.a.C1835a(rational2, lVar.f115513c));
            it3 = arrayList8.iterator();
            while (it3.hasNext()) {
                while (r2.hasNext()) {
                    if (!arrayList.contains(size6)) {
                        arrayList.add(size6);
                    }
                }
            }
        }
        return arrayList;
    }
}
