package p13;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class h0 extends f0 {
    public static ArrayList A0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return C0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        d0.v(arrayList, iterable);
        d0.v(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList B0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return D0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        d0.v(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList C0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            d0.v(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList D0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static <T> T E0(Collection<? extends T> collection, h23.c cVar) {
        collection.getClass();
        cVar.getClass();
        if (!collection.isEmpty()) {
            return (T) W(collection, cVar.c(collection.size()));
        }
        n23.j.s("Collection is empty.");
        return null;
    }

    public static void F0(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                j20.x.i(46, "null element found in ", list);
                return;
            }
        }
    }

    public static <T> List<T> G0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return b1(iterable);
        }
        List<T> listE1 = e1(iterable);
        Collections.reverse(listE1);
        return listE1;
    }

    public static <T> T H0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return (T) I0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            n23.j.s("Collection is empty.");
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        vb.h.s("Collection has more than one element.");
        return null;
    }

    public static <T> T I0(List<? extends T> list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            n23.j.s("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        vb.h.s("List has more than one element.");
        return null;
    }

    public static <T> T J0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T K0(List<? extends T> list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> boolean L(Iterable<? extends T> iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> List<T> L0(List<? extends T> list, j23.l lVar) {
        list.getClass();
        lVar.getClass();
        return lVar.isEmpty() ? j0.f134944a : b1(list.subList(lVar.f96796a, lVar.f96797b + 1));
    }

    public static g0 M(Iterable iterable) {
        iterable.getClass();
        return new g0(iterable);
    }

    public static <T extends Comparable<? super T>> List<T> M0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List<T> listE1 = e1(iterable);
            c0.t(listE1);
            return listE1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return b1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return s.c(array);
    }

    public static double N(Iterable<Double> iterable) {
        iterable.getClass();
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i14 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i14++;
            if (i14 < 0) {
                x.p();
                throw null;
            }
        }
        if (i14 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> N0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            List<T> listE1 = e1(iterable);
            c0.u(listE1, comparator);
            return listE1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return b1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List<T> listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static double O(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i14 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i14++;
            if (i14 < 0) {
                x.p();
                throw null;
            }
        }
        if (i14 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i14);
    }

    public static LinkedHashSet O0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionY = d0.y(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!collectionY.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static double P(Iterable<Integer> iterable) {
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i14 = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i14++;
            if (i14 < 0) {
                x.p();
                throw null;
            }
        }
        if (i14 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i14);
    }

    public static double P0(Iterable<Double> iterable) {
        iterable.getClass();
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    public static ArrayList Q(Iterable iterable, int i14) {
        iterable.getClass();
        return i1(iterable, i14, i14, true);
    }

    public static float Q0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        return fFloatValue;
    }

    public static <T> boolean R(Iterable<? extends T> iterable, T t7) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t7);
        }
        return f0(iterable, t7) >= 0;
    }

    public static int R0(Iterable<Integer> iterable) {
        iterable.getClass();
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static <T> int S(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            it.next();
            i14++;
            if (i14 < 0) {
                x.p();
                throw null;
            }
        }
        return i14;
    }

    public static <T> List<T> S0(Iterable<? extends T> iterable, int i14) {
        iterable.getClass();
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i14 == 0) {
            return j0.f134944a;
        }
        if (iterable instanceof Collection) {
            if (i14 >= ((Collection) iterable).size()) {
                return b1(iterable);
            }
            if (i14 == 1) {
                return w.c(a0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i14);
        Iterator<? extends T> it = iterable.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i15++;
            if (i15 == i14) {
                break;
            }
        }
        return x.n(arrayList);
    }

    public static <T> List<T> T(Iterable<? extends T> iterable) {
        iterable.getClass();
        return b1(f1(iterable));
    }

    public static List T0(int i14, List list) {
        list.getClass();
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i14 == 0) {
            return j0.f134944a;
        }
        int size = list.size();
        if (i14 >= size) {
            return b1(list);
        }
        if (i14 == 1) {
            return w.c(m0(list));
        }
        ArrayList arrayList = new ArrayList(i14);
        if (list instanceof RandomAccess) {
            for (int i15 = size - i14; i15 < size; i15++) {
                arrayList.add(list.get(i15));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i14);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static <T> List<T> U(Iterable<? extends T> iterable, int i14) {
        ArrayList arrayList;
        iterable.getClass();
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i14 == 0) {
            return b1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i14;
            if (size <= 0) {
                return j0.f134944a;
            }
            if (size == 1) {
                return w.c(l0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i14 < size2) {
                        arrayList.add(list.get(i14));
                        i14++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i14);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i15 = 0;
        for (T t7 : iterable) {
            if (i15 >= i14) {
                arrayList.add(t7);
            } else {
                i15++;
            }
        }
        return x.n(arrayList);
    }

    public static boolean[] U0(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            zArr[i14] = ((Boolean) it.next()).booleanValue();
            i14++;
        }
        return zArr;
    }

    public static List V(int i14, List list) {
        list.getClass();
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        int size = list.size() - i14;
        if (size < 0) {
            size = 0;
        }
        return S0(list, size);
    }

    public static byte[] V0(List list) {
        list.getClass();
        byte[] bArr = new byte[list.size()];
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            bArr[i14] = ((Number) it.next()).byteValue();
            i14++;
        }
        return bArr;
    }

    public static <T> T W(Iterable<? extends T> iterable, int i14) {
        iterable.getClass();
        boolean z14 = iterable instanceof List;
        if (z14) {
            return (T) ((List) iterable).get(i14);
        }
        cf.a0 a0Var = new cf.a0(i14, 6);
        if (z14) {
            List list = (List) iterable;
            if (i14 >= 0 && i14 < list.size()) {
                return (T) list.get(i14);
            }
            a0Var.invoke(Integer.valueOf(i14));
            throw null;
        }
        if (i14 < 0) {
            a0Var.invoke(Integer.valueOf(i14));
            throw null;
        }
        int i15 = 0;
        for (T t7 : iterable) {
            int i16 = i15 + 1;
            if (i14 == i15) {
                return t7;
            }
            i15 = i16;
        }
        a0Var.invoke(Integer.valueOf(i14));
        throw null;
    }

    public static void W0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static <T> T X(Iterable<? extends T> iterable, int i14) {
        iterable.getClass();
        if (iterable instanceof List) {
            return (T) e0(i14, (List) iterable);
        }
        if (i14 < 0) {
            return null;
        }
        int i15 = 0;
        for (T t7 : iterable) {
            int i16 = i15 + 1;
            if (i14 == i15) {
                return t7;
            }
            i15 = i16;
        }
        return null;
    }

    public static double[] X0(List list) {
        list.getClass();
        double[] dArr = new double[list.size()];
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            dArr[i14] = ((Number) it.next()).doubleValue();
            i14++;
        }
        return dArr;
    }

    public static ArrayList Y(Collection collection, e23.l lVar) {
        collection.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static float[] Y0(List list) {
        list.getClass();
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            fArr[i14] = ((Number) it.next()).floatValue();
            i14++;
        }
        return fArr;
    }

    public static ArrayList Z(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> HashSet<T> Z0(Iterable<? extends T> iterable) {
        iterable.getClass();
        HashSet<T> hashSet = new HashSet<>(t0.a(y.r(iterable, 12)));
        W0(iterable, hashSet);
        return hashSet;
    }

    public static <T> T a0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return (T) b0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        n23.j.s("Collection is empty.");
        return null;
    }

    public static int[] a1(Collection<Integer> collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            iArr[i14] = it.next().intValue();
            i14++;
        }
        return iArr;
    }

    public static <T> T b0(List<? extends T> list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        n23.j.s("List is empty.");
        return null;
    }

    public static <T> List<T> b1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return x.n(e1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j0.f134944a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return w.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> T c0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static long[] c1(List list) {
        list.getClass();
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            jArr[i14] = ((Number) it.next()).longValue();
            i14++;
        }
        return jArr;
    }

    public static <T> T d0(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static ArrayList d1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static Object e0(int i14, List list) {
        list.getClass();
        if (i14 < 0 || i14 >= list.size()) {
            return null;
        }
        return list.get(i14);
    }

    public static final <T> List<T> e1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        W0(iterable, arrayList);
        return arrayList;
    }

    public static <T> int f0(Iterable<? extends T> iterable, T t7) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t7);
        }
        int i14 = 0;
        for (T t14 : iterable) {
            if (i14 < 0) {
                x.q();
                throw null;
            }
            if (p005kotlin.jvm.internal.s.g(t7, t14)) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static <T> Set<T> f1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        W0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static int g0(Object obj, List list) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static <T> Set<T> g1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            W0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : a1.b(linkedHashSet.iterator().next());
            }
            return l0.f134950a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return l0.f134950a;
        }
        if (size2 == 1) {
            return a1.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(t0.a(collection.size()));
        W0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static LinkedHashSet h0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionY = d0.y(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionY.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> h1(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set<T> setF1 = f1(iterable);
        d0.v(setF1, iterable2);
        return setF1;
    }

    public static final void i0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, e23.l lVar) throws IOException {
        iterable.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        int i14 = 0;
        for (Object obj : iterable) {
            i14++;
            if (i14 > 1) {
                appendable.append(charSequence);
            }
            d53.m.a(appendable, obj, lVar);
        }
        appendable.append(charSequence3);
    }

    public static final ArrayList i1(Iterable iterable, int i14, int i15, boolean z14) {
        iterable.getClass();
        if (i14 <= 0 || i15 <= 0) {
            vb.h.x(i14 != i15 ? am.j.g(i14, i15, "Both size ", " and step ", " must be greater than zero.") : v.e0.f(i14, "size ", " must be greater than zero."));
            return null;
        }
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            Iterator itA = !it.hasNext() ? i0.f134941a : c53.n.a(new d1(i14, i15, it, false, z14, null));
            while (itA.hasNext()) {
                arrayList.add((List) itA.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i15) + (size % i15 == 0 ? 0 : 1));
        int i16 = 0;
        while (i16 >= 0 && i16 < size) {
            int i17 = size - i16;
            if (i14 <= i17) {
                i17 = i14;
            }
            if (i17 < i14 && !z14) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(i17);
            for (int i18 = 0; i18 < i17; i18++) {
                arrayList3.add(list.get(i18 + i16));
            }
            arrayList2.add(arrayList3);
            i16 += i15;
        }
        return arrayList2;
    }

    public static /* synthetic */ void j0(Iterable iterable, StringBuilder sb3, String str, String str2, String str3, e23.l lVar, int i14) throws IOException {
        if ((i14 & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i14 & 4) != 0 ? "" : str2;
        String str6 = (i14 & 8) != 0 ? "" : str3;
        String str7 = (i14 & 32) != 0 ? "..." : "";
        if ((i14 & 64) != 0) {
            lVar = null;
        }
        i0(iterable, sb3, str4, str5, str6, str7, lVar);
    }

    public static n0 j1(Iterable iterable) {
        iterable.getClass();
        return new n0(new ov1.u(iterable, 7));
    }

    public static String k0(Iterable iterable, CharSequence charSequence, String str, String str2, e23.l lVar, int i14) {
        if ((i14 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i14 & 2) != 0 ? "" : str;
        String str4 = (i14 & 4) != 0 ? "" : str2;
        if ((i14 & 32) != 0) {
            lVar = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb3 = new StringBuilder();
        i0(iterable, sb3, charSequence2, str3, str4, "...", lVar);
        return sb3.toString();
    }

    public static ArrayList k1(Iterable iterable, List list) {
        iterable.getClass();
        list.getClass();
        Iterator it = iterable.iterator();
        Iterator it3 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(y.r(iterable, 10), y.r(list, 10)));
        while (it.hasNext() && it3.hasNext()) {
            arrayList.add(new o13.p(it.next(), it3.next()));
        }
        return arrayList;
    }

    public static <T> T l0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return (T) m0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            n23.j.s("Collection is empty.");
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T m0(List<? extends T> list) {
        list.getClass();
        if (!list.isEmpty()) {
            return (T) com.airbnb.lottie.animation.keyframe.a.c(1, list);
        }
        n23.j.s("List is empty.");
        return null;
    }

    public static <T> T n0(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return (T) com.airbnb.lottie.animation.keyframe.a.c(1, list);
    }

    public static <T extends Comparable<? super T>> T o0(Iterable<? extends T> iterable) {
        iterable.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Double p0(Iterable<Double> iterable) {
        iterable.getClass();
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static Float q0(Iterable<Float> iterable) {
        iterable.getClass();
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static float r0(List list) {
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return 0.0f;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return fFloatValue;
    }

    public static <T extends Comparable<? super T>> T s0(Iterable<? extends T> iterable) {
        iterable.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T extends Comparable<? super T>> T t0(Iterable<? extends T> iterable) {
        iterable.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Double u0(Iterable<Double> iterable) {
        iterable.getClass();
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static Float v0(Iterable<Float> iterable) {
        iterable.getClass();
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static float w0(List list) {
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return 0.0f;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return fFloatValue;
    }

    public static <T extends Comparable<? super T>> T x0(Iterable<? extends T> iterable) {
        iterable.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static ArrayList y0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(y.r(iterable, 10));
        boolean z14 = false;
        for (Object obj2 : iterable) {
            boolean z15 = true;
            if (!z14 && p005kotlin.jvm.internal.s.g(obj2, obj)) {
                z14 = true;
                z15 = false;
            }
            if (z15) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static <T> List<T> z0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionY = d0.y(iterable2);
        if (collectionY.isEmpty()) {
            return b1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t7 : iterable) {
            if (!collectionY.contains(t7)) {
                arrayList.add(t7);
            }
        }
        return arrayList;
    }
}
