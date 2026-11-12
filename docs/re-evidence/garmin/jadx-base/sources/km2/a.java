package km2;

import android.text.TextUtils;
import android.util.LongSparseArray;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import rd2.f;
import rd2.j;
import sd2.e;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<LongSparseArray<Set<Integer>>> f105624a = new AtomicReference<>(new LongSparseArray());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference<LongSparseArray<String>> f105625b = new AtomicReference<>(new LongSparseArray());

    public static ArrayList a(HashSet hashSet) {
        f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListE = j.e();
        ArrayList arrayList = new ArrayList();
        if (arrayListE != null && !arrayListE.isEmpty()) {
            for (sd2.f fVar : arrayListE) {
                if (d(fVar.getUnitID(), hashSet)) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    public static HashSet b() {
        HashSet hashSet = new HashSet();
        hashSet.add(41);
        hashSet.add(38);
        hashSet.add(36);
        hashSet.add(40);
        hashSet.add(37);
        hashSet.add(39);
        hashSet.add(53);
        hashSet.add(101);
        return hashSet;
    }

    public static HashSet c() {
        HashSet hashSet = new HashSet();
        hashSet.add(16);
        hashSet.add(15);
        hashSet.add(12);
        hashSet.add(14);
        hashSet.add(13);
        return hashSet;
    }

    public static boolean d(long j8, Collection<Integer> collection) {
        Set<Integer> set = f105624a.get().get(j8);
        if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            hashSet.retainAll(collection);
            if (hashSet.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(int[] iArr, long j8) {
        HashSet hashSet = new HashSet();
        for (int i14 : iArr) {
            hashSet.add(Integer.valueOf(i14));
        }
        return d(j8, hashSet);
    }

    public static boolean f(int i14) {
        return h(Collections.singleton(Integer.valueOf(i14)));
    }

    public static boolean g(int i14, List<String> list) {
        LongSparseArray<Set<Integer>> longSparseArray = f105624a.get();
        LongSparseArray<String> longSparseArray2 = f105625b.get();
        for (int i15 = 0; i15 < longSparseArray.size(); i15++) {
            long jKeyAt = longSparseArray.keyAt(i15);
            String str = longSparseArray2.get(jKeyAt);
            if ((str == null || list == null || !list.contains(str)) && d(jKeyAt, Collections.singleton(Integer.valueOf(i14)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Collection<Integer> collection) {
        LongSparseArray<Set<Integer>> longSparseArray = f105624a.get();
        for (int i14 = 0; i14 < longSparseArray.size(); i14++) {
            if (d(longSparseArray.keyAt(i14), collection)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(long j8, List list, int i14) {
        Set<Integer> set;
        String str = f105625b.get().get(j8);
        return (list == null || str == null || !list.contains(str)) && (set = f105624a.get().get(j8)) != null && set.contains(Integer.valueOf(i14));
    }

    public static void j() {
        ArrayList<e> arrayListD = ConnectDatabase.g().f().d();
        boolean zIsEmpty = arrayListD.isEmpty();
        AtomicReference<LongSparseArray<Set<Integer>>> atomicReference = f105624a;
        if (zIsEmpty) {
            atomicReference.set(new LongSparseArray<>());
            return;
        }
        LongSparseArray<Set<Integer>> longSparseArray = new LongSparseArray<>();
        LongSparseArray<String> longSparseArray2 = new LongSparseArray<>();
        for (e eVar : arrayListD) {
            j jVar = f.a().f152045a;
            long j8 = eVar.f158646a;
            jVar.getClass();
            sd2.f fVarI = j.i(j8, null);
            if (fVarI != null) {
                longSparseArray2.put(eVar.f158646a, TextUtils.isEmpty(fVarI.getPartNumber()) ? fVarI.getPartNumber() : fVarI.getProductNumber());
            }
            Set<Integer> hashSet = longSparseArray.get(eVar.f158646a);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                longSparseArray.put(eVar.f158646a, hashSet);
            }
            hashSet.addAll(new Configuration(eVar.f158648c).getCapabilityFlagsAsSet());
        }
        int size = longSparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            longSparseArray.setValueAt(i14, Collections.unmodifiableSet(longSparseArray.valueAt(i14)));
        }
        atomicReference.set(longSparseArray);
        f105625b.set(longSparseArray2);
    }
}
