package defpackage;

import android.content.Context;
import android.os.Binder;
import com.huawei.hidatamanager.util.LogUtils;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40365a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f40366b = "PackageNameUtil";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f40367c;
    private static Map<Integer, String> e;

    static {
        ArrayList arrayList = new ArrayList();
        f40367c = arrayList;
        e = new ConcurrentHashMap();
        arrayList.add("com.huawei.health.h5.cycle-calendar");
        arrayList.add("com.huawei.health.h5.ecgce");
        arrayList.add("com.huawei.health.h5.ppg");
        arrayList.add("com.huawei.health.h5.sleeping-music");
        arrayList.add("com.huawei.health.h5.vascular-health");
        arrayList.add("com.huawei.health.h5.sleepdetection");
        arrayList.add("com.huawei.audioaccessorymanager");
        arrayList.add("com.huawei.study.hiresearch");
    }

    public static void a(Context context, String str) {
        String str2 = f40366b;
        LogUtils.i(str2, "saveCallingPackageName enter");
        if (context == null) {
            LogUtils.w(str2, "saveCallingPackageName fail: context is null");
            return;
        }
        if (str == null) {
            LogUtils.w(str2, "saveCallingPackageName fail: packageName is null");
            return;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            for (String str3 : packagesForUid) {
                if (str3.equals(str)) {
                    e.put(Integer.valueOf(Binder.getCallingPid()), str);
                    LogUtils.i(f40366b, "saveCallingPackageName successed");
                    return;
                }
            }
        }
        LogUtils.w(f40366b, "saveCallingPackageName fail");
    }

    public static String d(Context context) {
        String str = f40366b;
        LogUtils.i(str, "getCallingPackageName enter");
        if (context == null) {
            LogUtils.w(str, "getCallingPackageName fail: context is null");
            return "";
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null) {
            return "";
        }
        if (packagesForUid.length == 1) {
            return packagesForUid[0];
        }
        String str2 = e.get(Integer.valueOf(Binder.getCallingPid()));
        for (String str3 : packagesForUid) {
            if (str3.equals(str2)) {
                return str3;
            }
        }
        return "";
    }

    public static String e(String str, boolean z) {
        if ("com.huawei.health.h5.ecg".equals(str)) {
            return "com.huawei.health.ecg.collection";
        }
        return (str.startsWith("com.huawei.health.device") || f40367c.contains(str) || z) ? "com.huawei.health" : str;
    }

    public static String a(String str) {
        return (!StringUtils.g(str) && f40367c.contains(str)) ? "com.huawei.health" : str;
    }
}
