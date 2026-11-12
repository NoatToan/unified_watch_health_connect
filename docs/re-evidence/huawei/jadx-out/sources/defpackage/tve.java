package defpackage;

import com.huawei.hihealth.HiHealthData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class tve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final tuy f49705a = new tva();
    private static final tuy e = new tvd();

    public static void b(List<Integer> list) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.addAll(list);
        f49705a.c(arrayList);
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.addAll(list);
        e.c(arrayList2);
    }

    public static HiHealthData d(HiHealthData hiHealthData, HiHealthData hiHealthData2, List<HiHealthData> list, boolean z, boolean z2) {
        tuy tuyVar;
        if (z) {
            tuyVar = f49705a;
        } else {
            tuyVar = e;
        }
        return tuyVar.d(hiHealthData, hiHealthData2, list, z2);
    }
}
