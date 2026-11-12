package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiSubscribeType;
import health.compact.a.HiCommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lkg {
    public static List<Integer> e(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            int iD = HiSubscribeType.d(it.next().getType());
            if (HiSubscribeType.b(iD) && !arrayList.contains(Integer.valueOf(iD))) {
                arrayList.add(Integer.valueOf(iD));
            }
        }
        return arrayList;
    }

    public static List<Integer> e(int[] iArr) {
        ArrayList arrayList = new ArrayList(10);
        for (int i : iArr) {
            int iD = HiSubscribeType.d(i);
            if (HiSubscribeType.b(iD) && !arrayList.contains(Integer.valueOf(iD))) {
                arrayList.add(Integer.valueOf(iD));
            }
        }
        return arrayList;
    }
}
