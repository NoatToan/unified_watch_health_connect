package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class njv {
    public static List<njj> c(Map<Integer, Float> map) {
        if (map == null) {
            LogUtil.j("Track_PaceUtil", "convertPaceMap paceMap is null");
            return null;
        }
        LogUtil.a("Track_PaceUtil", "convertPaceMap paceMap size = ", Integer.valueOf(map.size()));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            arrayList.add(new njj((iIntValue / 100000) * 10, iIntValue % 100000, entry.getValue().floatValue()));
        }
        arrayList.sort(new Comparator<njj>() { // from class: njv.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(njj njjVar, njj njjVar2) {
                return njjVar.c() < njjVar2.c() ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static List<njj> d(List<njj> list) {
        if (list == null) {
            LogUtil.j("Track_PaceUtil", "validPaceList paceList is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (njj njjVar : list) {
            int iC = njjVar.c();
            if (!arrayList.contains(Integer.valueOf(iC)) && iC % 1000 == 0) {
                arrayList.add(Integer.valueOf(iC));
                arrayList2.add(new njj(njjVar));
            }
        }
        return arrayList2;
    }

    public static Float[] b(List<njj> list) {
        float f;
        float f2 = 0.0f;
        if (njy.b(list)) {
            Iterator<njj> it = list.iterator();
            boolean z = false;
            f = 0.0f;
            while (it.hasNext()) {
                float fD = it.next().d();
                if (!z) {
                    z = true;
                    f2 = fD;
                    f = f2;
                }
                if (fD > f) {
                    f = fD;
                }
                if (fD < f2) {
                    f2 = fD;
                }
            }
        } else {
            f = 0.0f;
        }
        return new Float[]{Float.valueOf(f2), Float.valueOf(f)};
    }
}
