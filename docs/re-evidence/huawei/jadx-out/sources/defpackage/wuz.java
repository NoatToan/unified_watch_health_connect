package defpackage;

import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wuz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f52524a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile wuz f52525b;

    private wuz() {
    }

    public static wuz d() {
        wuz wuzVar;
        synchronized (f52524a) {
            if (f52525b == null) {
                f52525b = new wuz();
            }
            wuzVar = f52525b;
        }
        return wuzVar;
    }

    private ArrayList<dxy> g() {
        ArrayList<dxy> arrayListJ = lvl.j();
        return njy.e(arrayListJ) ? new ArrayList<>(0) : arrayListJ;
    }

    private HashMap<String, Integer> c() {
        HashMap<String, Integer> mapB = edg.b();
        return mapB.isEmpty() ? new HashMap<>(0) : mapB;
    }

    private List<String> a() {
        ArrayList<dxy> arrayListG = g();
        LogUtil.a("RemoveNoUsePluginUtils", "localDeviceInfo size: ", Integer.valueOf(arrayListG.size()));
        HashMap<String, Integer> mapC = c();
        LogUtil.a("RemoveNoUsePluginUtils", "cloudDeviceInfo size: ", Integer.valueOf(mapC.size()));
        ArrayList arrayList = new ArrayList(16);
        Iterator<dxy> it = arrayListG.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().g()));
        }
        ArrayList arrayList2 = new ArrayList(16);
        for (Map.Entry<String, Integer> entry : mapC.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            value.intValue();
            if (!arrayList.contains(value)) {
                arrayList2.add(key);
                LogUtil.d("RemoveNoUsePluginUtils", "not used deviceInfo size: ", Integer.valueOf(arrayList2.size()));
            }
        }
        return arrayList2;
    }

    private List<String> f() {
        List<String> listA = a();
        ArrayList arrayList = new ArrayList(16);
        for (String str : listA) {
            arrayList.add(pig.c().e(str) + File.separator + str + File.separator + "img");
        }
        return arrayList;
    }

    public void b() {
        for (String str : f()) {
            LogUtil.d("RemoveNoUsePluginUtils", "getPathPath: ", str, "isSuccess: ", Boolean.valueOf(pee.b(str)));
        }
    }

    public long e() {
        Iterator<String> it = f().iterator();
        long jI = 0;
        while (it.hasNext()) {
            jI += FileUtils.i(new File(it.next()));
        }
        LogUtil.a("RemoveNoUsePluginUtils", "totalSize: ", Long.valueOf(jI));
        return jI;
    }
}
