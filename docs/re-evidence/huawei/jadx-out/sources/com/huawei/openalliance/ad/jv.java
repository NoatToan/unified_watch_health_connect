package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class jv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<Integer, String> f19403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Boolean> f19404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<String, jx> f19405c;
    private static final jx d;
    private static String e;

    public static int[] b() {
        int[] iArr = new int[1];
        if (jt.a().b()) {
            hw.b("CustMonitorFactory", "req, support mz");
            iArr[0] = 1;
        }
        e = a(iArr);
        return iArr;
    }

    private static void b(final Context context, final int i, final ContentRecord contentRecord) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.jv.2
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(context).a(i, contentRecord);
            }
        });
    }

    public static jx b(String str) {
        if (str != null) {
            ConcurrentHashMap<String, jx> concurrentHashMap = f19405c;
            if (concurrentHashMap.containsKey(str)) {
                return concurrentHashMap.get(str);
            }
        }
        return d;
    }

    public static boolean a(String str) {
        if (str == null) {
            return true;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f19404b;
        if (!concurrentHashMap.containsKey(str)) {
            return true;
        }
        hw.a("CustMonitorFactory", "checkIfDoNothing, contentId %s %s", str, concurrentHashMap.get(str));
        return Boolean.TRUE.equals(concurrentHashMap.get(str));
    }

    public static boolean a(int i, String str) {
        String strM;
        try {
            HashMap<Integer, String> map = f19403a;
            if (map.containsKey(Integer.valueOf(i)) && (strM = com.huawei.openalliance.ad.utils.dg.m(str)) != null) {
                return strM.endsWith(map.get(Integer.valueOf(i)));
            }
            return false;
        } catch (Throwable th) {
            hw.c("CustMonitorFactory", "checkUrlContainMonitor err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean a(int i) {
        if (i == 1) {
            return jt.a().b();
        }
        return false;
    }

    public static boolean a() {
        return !com.huawei.openalliance.ad.utils.dg.b(e.a()) && Integer.parseInt(e.a()) >= 30477310;
    }

    public static void a(String str, jx jxVar) {
        if (str == null || jxVar == null) {
            hw.b("CustMonitorFactory", "setContentIdToMonitor, param is null");
            return;
        }
        boolean z = jxVar instanceof jw;
        if (!z) {
            hw.b("CustMonitorFactory", "setContentIdToMonitor, contentId is %s, monitor is %s", str, jxVar.getClass().getSimpleName());
        }
        f19404b.put(str, Boolean.valueOf(z));
        if (z) {
            return;
        }
        f19405c.put(str, jxVar);
    }

    private static void a(final Context context, final int i, final ContentRecord contentRecord) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.jv.1
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(context).a(jv.e, i, contentRecord);
            }
        });
    }

    private static List<String> a(Context context, ContentRecord contentRecord, String str) {
        ArrayList arrayList = new ArrayList();
        List<Monitor> listA = contentRecord.a(context);
        if (!com.huawei.openalliance.ad.utils.bm.a(listA) && str != null) {
            for (Monitor monitor : listA) {
                if (str.equals(monitor.a())) {
                    List<String> listB = monitor.b();
                    if (!com.huawei.openalliance.ad.utils.bm.a(listB)) {
                        for (String str2 : listB) {
                            if (a(contentRecord.b(), str2)) {
                                arrayList.add(str2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static String a(int[] iArr) {
        StringBuilder sb = new StringBuilder("{");
        for (int i : iArr) {
            sb.append(i);
            sb.append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    public static jx a(Context context, boolean z, pc pcVar, ContentRecord contentRecord, boolean z2) {
        if (context == null || contentRecord == null || pcVar == null) {
            hw.b("CustMonitorFactory", "getMonitor, param is null.");
            return new jw();
        }
        int iB = contentRecord.b();
        hw.b("CustMonitorFactory", "sdkMonitor is %s", Integer.valueOf(iB));
        if (iB != 0) {
            b(context, iB, contentRecord);
        }
        return iB != 1 ? new jw() : a(context, contentRecord, pcVar, z2, z);
    }

    private static jx a(Context context, ContentRecord contentRecord, pc pcVar, boolean z, boolean z2) {
        if (!jt.INSTANCE.b()) {
            hw.b("CustMonitorFactory", "getMzMonitor, not support mz.");
            return d;
        }
        hw.b("CustMonitorFactory", "isCheckUiengine %s, isImage %s.", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z && !a()) {
            hw.c("CustMonitorFactory", "uiengine ver is too low to support mz");
            return new jw();
        }
        List<String> listA = a(context, contentRecord, "imp");
        List<String> listA2 = a(context, contentRecord, "click");
        hw.a("CustMonitorFactory", "getMzMonitor, impUrls size is %s, clickUrls size is %s", Integer.valueOf(listA.size()), Integer.valueOf(listA2.size()));
        if (!com.huawei.openalliance.ad.utils.bm.a(listA) || !com.huawei.openalliance.ad.utils.bm.a(listA2)) {
            return z2 ? new jy(listA, listA2, pcVar, contentRecord) : new jz(listA, listA2, pcVar, contentRecord);
        }
        hw.b("CustMonitorFactory", "getMzMonitor, monitor url is blank.");
        a(context, contentRecord.b(), contentRecord);
        return new jw();
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f19403a = map;
        f19404b = new ConcurrentHashMap<>();
        f19405c = new ConcurrentHashMap<>();
        d = new jw();
        map.put(1, "miaozhen.com");
    }
}
