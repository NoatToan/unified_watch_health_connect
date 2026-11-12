package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes30.dex */
public class gri {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f35958c = new Object();
    private static volatile gri d;

    public static gri b() {
        if (d == null) {
            synchronized (f35958c) {
                if (d == null) {
                    d = new gri();
                }
            }
        }
        return d;
    }

    public grh e(List<String> list) {
        grn.d("AgnssManager", "getAgnssRequest start");
        grh grhVar = new grh();
        grhVar.b(true);
        grhVar.a(true);
        grhVar.a(1);
        grhVar.c(2);
        grhVar.d("getAgnssPluginUrl");
        List<String> listA = gre.a(list);
        HashMap map = new HashMap();
        Iterator<String> it = listA.iterator();
        while (it.hasNext()) {
            map.put(it.next(), "HW_AGNSS");
        }
        grhVar.c(map);
        HashMap map2 = new HashMap();
        map2.put("X-Request-ID", UUID.randomUUID().toString());
        map2.put("Content-Type", "application/json");
        map2.put("X-Device-Type", "SportsHealth");
        grhVar.e(map2);
        grn.d("AgnssManager", "getAgnssRequest end");
        return grhVar;
    }

    public Map<String, String> b(grg grgVar) throws Throwable {
        grn.d("AgnssManager", "getAgnssResponse start");
        HashMap map = new HashMap();
        byte[] bArrA = grf.a(grgVar.d());
        if (bArrA == null || bArrA.length == 0) {
            grn.e("AgnssManager", "getAgnssResponse get originData fail");
            return map;
        }
        byte[] bArrB = grb.b(bArrA);
        if (bArrB == null || bArrB.length == 0) {
            grn.e("AgnssManager", "getAgnssResponse get decompress fail");
            return map;
        }
        File file = new File(grgVar.a(), grf.b(grgVar.b() + "HW_AGNSS_RTCM_33"));
        if (file.exists()) {
            grn.d("AgnssManager", "getAgnssResponse delete file, isDeleted: " + file.delete());
        }
        if (grf.a(file.getPath(), bArrB, bArrB.length)) {
            grn.d("AgnssManager", "write file succeed, len: " + file.length());
            map.put(file.getPath(), "HW_AGNSS_RTCM_33");
        } else {
            grn.e("AgnssManager", "write file fail");
        }
        grn.d("AgnssManager", "getAgnssResponse end");
        return map;
    }
}
