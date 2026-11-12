package com.huawei.hihealth.dictionary;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.dictionary.config.ConfigureManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictStat;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.model.HiHealthDictionary;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes.dex */
public class HiHealthDictManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f12264a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f12265c = false;
    private static volatile HiHealthDictManager e;
    private Context d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f12266b = new AtomicInteger(-1);
    private Map<Integer, HiHealthDictionary> j = new ConcurrentHashMap();

    private HiHealthDictManager(Context context) {
        this.d = context;
    }

    public static HiHealthDictManager a(Context context) {
        if (e == null) {
            synchronized (f12264a) {
                if (e == null) {
                    e = new HiHealthDictManager(context);
                }
            }
        }
        return e;
    }

    public HiHealthDictionary c() {
        return this.j.get(Integer.valueOf(this.f12266b.get()));
    }

    public List<Integer> d() {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            return new ArrayList();
        }
        return hiHealthDictionaryC.b();
    }

    public List<Integer> e() {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            return new ArrayList();
        }
        return hiHealthDictionaryC.c();
    }

    public List<Integer> a() {
        List<Integer> listD = d();
        ArrayList arrayList = new ArrayList(listD.size() + 1);
        for (Integer num : listD) {
            HiHealthDictType hiHealthDictTypeA = a(num.intValue());
            if (hiHealthDictTypeA != null && hiHealthDictTypeA.i() == 0 && hiHealthDictTypeA.c() != 3) {
                arrayList.add(num);
            }
        }
        arrayList.add(30001);
        return arrayList;
    }

    public List<Integer> b() {
        HiHealthDictType hiHealthDictTypeA;
        List<Integer> listD = d();
        ArrayList arrayList = new ArrayList();
        for (Integer num : listD) {
            int iIntValue = num.intValue();
            if (iIntValue != DicDataTypeUtil.DataType.ACTIVE_HOUR.value() && iIntValue != DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value() && (hiHealthDictTypeA = a(iIntValue)) != null && hiHealthDictTypeA.c() == 0) {
                Iterator<HiHealthDictField> it = hiHealthDictTypeA.h().iterator();
                while (it.hasNext()) {
                    if (!it.next().j().isEmpty()) {
                        arrayList.add(num);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean l(int i) {
        HiHealthDictField hiHealthDictFieldJ = j(i);
        if (hiHealthDictFieldJ == null) {
            return false;
        }
        return hiHealthDictFieldJ.h();
    }

    public List<String> o(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<HiHealthDictField> it = h(i).iterator();
        while (it.hasNext()) {
            Iterator<HiHealthDictStat> it2 = it.next().j().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().a());
            }
        }
        return arrayList;
    }

    public int c(int i, String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            Iterator<HiHealthDictField> it = h(i).iterator();
            while (it.hasNext()) {
                for (HiHealthDictStat hiHealthDictStat : it.next().j()) {
                    if (str.equals(hiHealthDictStat.a())) {
                        return hiHealthDictStat.c();
                    }
                }
            }
        }
        return i2;
    }

    public int a(int i, int i2, String str, int i3) {
        if (!TextUtils.isEmpty(str)) {
            for (HiHealthDictField hiHealthDictField : h(i)) {
                if (hiHealthDictField.e() == i2) {
                    for (HiHealthDictStat hiHealthDictStat : hiHealthDictField.j()) {
                        if (str.equals(hiHealthDictStat.a())) {
                            return hiHealthDictStat.c();
                        }
                    }
                }
            }
        }
        return i3;
    }

    public int b(int i, String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            for (HiHealthDictField hiHealthDictField : h(i)) {
                Iterator<HiHealthDictStat> it = hiHealthDictField.j().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().a())) {
                        return hiHealthDictField.e();
                    }
                }
            }
        }
        return i2;
    }

    public int e(int i) {
        if (i(i) != null) {
            return 0;
        }
        return g(i) != null ? 2 : -1;
    }

    public HiHealthDictType a(int i) {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
            return null;
        }
        return hiHealthDictionaryC.c(i);
    }

    public boolean a(int i, int i2) {
        if (30001 == i && i2 != 0) {
            return k(i + i2);
        }
        return k(i);
    }

    public boolean k(int i) {
        return (a(i) == null && i(i) == null && g(i) == null) ? false : true;
    }

    public boolean n(int i) {
        HiHealthDictType hiHealthDictTypeA = a(i);
        if (hiHealthDictTypeA == null) {
            return false;
        }
        Iterator<HiHealthDictField> it = hiHealthDictTypeA.h().iterator();
        while (it.hasNext()) {
            if (!it.next().j().isEmpty()) {
                return true;
            }
        }
        return hiHealthDictTypeA.i() != 0;
    }

    public List<Integer> f(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<HiHealthDictField> it = h(i).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().e()));
        }
        return arrayList;
    }

    public List<Integer> m(int i) {
        ArrayList arrayList = new ArrayList();
        List<HiHealthDictField> listH = h(i);
        if (!CollectionUtils.a(listH)) {
            Iterator<HiHealthDictField> it = listH.iterator();
            while (it.hasNext()) {
                List<HiHealthDictStat> listJ = it.next().j();
                if (!CollectionUtils.a(listJ)) {
                    List list = (List) listJ.stream().map(new Function() { // from class: com.huawei.hihealth.dictionary.HiHealthDictManager$$ExternalSyntheticLambda0
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(((HiHealthDictStat) obj).c());
                        }
                    }).filter(new Predicate() { // from class: com.huawei.hihealth.dictionary.HiHealthDictManager$$ExternalSyntheticLambda1
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return HiHealthDictManager.c((Integer) obj);
                        }
                    }).collect(Collectors.toList());
                    if (!CollectionUtils.a(list)) {
                        arrayList.addAll(list);
                    }
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ boolean c(Integer num) {
        return num.intValue() > 0;
    }

    public List<String> d(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator<HiHealthDictField> it = h(i).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }

    public List<HiHealthDictField> h(int i) {
        ArrayList arrayList = new ArrayList();
        HiHealthDictType hiHealthDictTypeA = a(i);
        return hiHealthDictTypeA == null ? arrayList : hiHealthDictTypeA.h();
    }

    public HiHealthDictField e(int i, String str) {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
            return null;
        }
        HiHealthDictType hiHealthDictTypeC = hiHealthDictionaryC.c(i);
        if (hiHealthDictTypeC == null) {
            return null;
        }
        return hiHealthDictTypeC.e(str);
    }

    public HiHealthDictType g(int i) {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
            return null;
        }
        return hiHealthDictionaryC.d(i);
    }

    public HiHealthDictField j(int i) {
        HiHealthDictType hiHealthDictTypeG = g(i);
        if (hiHealthDictTypeG == null) {
            return null;
        }
        for (HiHealthDictField hiHealthDictField : hiHealthDictTypeG.h()) {
            Iterator<HiHealthDictStat> it = hiHealthDictField.j().iterator();
            while (it.hasNext()) {
                if (i == it.next().c()) {
                    return hiHealthDictField;
                }
            }
        }
        return null;
    }

    public int c(int i, String str, String str2) {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
            return -1;
        }
        HiHealthDictType hiHealthDictTypeC = hiHealthDictionaryC.c(i);
        if (hiHealthDictTypeC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictType is null, typeId is ", Integer.valueOf(i));
            return -1;
        }
        HiHealthDictField hiHealthDictFieldE = hiHealthDictTypeC.e(str);
        if (hiHealthDictFieldE == null || hiHealthDictFieldE.j() == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictType is null or no stat policy, typeId is ", Integer.valueOf(i), ", filed Name is ", str);
            return -1;
        }
        for (HiHealthDictStat hiHealthDictStat : hiHealthDictFieldE.j()) {
            if (str2.equals(hiHealthDictStat.e())) {
                return hiHealthDictStat.c();
            }
        }
        LogUtil.d("HiH_HiHealthDictManager", "This field not contains the stat policy ", str2);
        return -1;
    }

    public int d(int i, String str, double d) {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
            return -1;
        }
        HiHealthDictType hiHealthDictTypeC = hiHealthDictionaryC.c(i);
        if (hiHealthDictTypeC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictType is null, typeId is ", Integer.valueOf(i));
            return -1;
        }
        HiHealthDictField hiHealthDictFieldE = hiHealthDictTypeC.e(str);
        if (hiHealthDictFieldE == null || hiHealthDictFieldE.j() == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictType is null or no stat policy, typeId is ", Integer.valueOf(i), ", filed Name is ", str);
            return -1;
        }
        for (HiHealthDictStat hiHealthDictStat : hiHealthDictFieldE.j()) {
            if (hiHealthDictStat.b() != null && Double.compare(d, hiHealthDictStat.b().doubleValue()) == 0) {
                return hiHealthDictStat.c();
            }
        }
        LogUtil.d("HiH_HiHealthDictManager", "This field not contains the stat value ", Double.valueOf(d));
        return -1;
    }

    public HiHealthDictType i(int i) {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
            return null;
        }
        return hiHealthDictionaryC.e(i);
    }

    public HiHealthDictField c(int i) {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
            return null;
        }
        return hiHealthDictionaryC.b(i);
    }

    public HiHealthDictStat b(int i) {
        HiHealthDictionary hiHealthDictionaryC = c();
        if (hiHealthDictionaryC == null) {
            LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
            return null;
        }
        return hiHealthDictionaryC.a(i);
    }

    public void c(boolean z) {
        synchronized (this) {
            if (!f12265c || z) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<HiHealthDictionary> listB = ConfigureManager.a().b(this.d);
                if (listB.isEmpty()) {
                    LogUtil.c("HiH_HiHealthDictManager", "dictionary is not available.");
                    return;
                }
                Collections.sort(listB, new Comparator<HiHealthDictionary>() { // from class: com.huawei.hihealth.dictionary.HiHealthDictManager.1
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public int compare(HiHealthDictionary hiHealthDictionary, HiHealthDictionary hiHealthDictionary2) {
                        return hiHealthDictionary2.h() - hiHealthDictionary.h();
                    }
                });
                HiHealthDictionary hiHealthDictionary = null;
                for (HiHealthDictionary hiHealthDictionary2 : listB) {
                    if (hiHealthDictionary == null) {
                        hiHealthDictionary = hiHealthDictionary2;
                    } else {
                        hiHealthDictionary.merge(hiHealthDictionary2);
                    }
                }
                int iH = listB.get(0).h();
                hiHealthDictionary.i(iH);
                this.j.put(Integer.valueOf(iH), hiHealthDictionary);
                this.f12266b.set(iH);
                LogUtil.a("HiH_HiHealthDictManager", "finish reload dictionary time is", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                f12265c = true;
            }
        }
    }
}
