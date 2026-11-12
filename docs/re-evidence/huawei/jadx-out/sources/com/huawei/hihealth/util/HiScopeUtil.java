package com.huawei.hihealth.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import health.compact.a.HiCommonUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HiScopeUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f12338c;

    static {
        ArrayList arrayList = new ArrayList(20);
        f12338c = arrayList;
        arrayList.add("com.huawei.android.hms.health.profile");
        arrayList.add("com.huawei.android.hms.health.profile.readonly");
        arrayList.add("com.huawei.android.hms.health.sport");
        arrayList.add("com.huawei.android.hms.health.sport.readonly");
        arrayList.add("com.huawei.android.hms.health.health.wgt");
        arrayList.add("com.huawei.android.hms.health.health.wgt.readonly");
        arrayList.add("com.huawei.android.hms.health.health.slp");
        arrayList.add("com.huawei.android.hms.health.health.slp.readonly");
        arrayList.add("com.huawei.android.hms.health.health.hr");
        arrayList.add("com.huawei.android.hms.health.health.hr.readonly");
        arrayList.add("com.huawei.android.hms.health.health.ecg");
        arrayList.add("com.huawei.android.hms.health.health.ecg.readonly");
        arrayList.add("com.huawei.android.hms.health.health.bg");
        arrayList.add("com.huawei.android.hms.health.health.bg.readonly");
        arrayList.add("com.huawei.android.hms.health.health.bf");
        arrayList.add("com.huawei.android.hms.health.health.bf.readonly");
        arrayList.add("com.huawei.android.hms.health.motionpath");
        arrayList.add("com.huawei.android.hms.health.motionpath.readonly");
    }

    public static boolean e(String str) {
        return !HiCommonUtil.a(str) && f12338c.contains(str);
    }

    public static String a(Context context) {
        Object obj;
        if (context == null) {
            LogUtil.a("Debug_HiScopeUtil", "context is null");
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        LogUtil.a("Debug_HiScopeUtil", "pm = ", packageManager);
        if (packageManager == null) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null && (obj = applicationInfo.metaData.get("com.huawei.hms.client.appid")) != null) {
                LogUtil.a("Debug_HiScopeUtil", "appId = ", String.valueOf(obj));
                return String.valueOf(obj);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }

    public static String b(Context context, String str) {
        Object obj;
        LogUtil.e("Debug_HiScopeUtil", "getThirdMetaDataAppId...");
        if (context == null) {
            LogUtil.c("Debug_HiScopeUtil", "getThirdMetaDataAppId:context is null.");
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.c("Debug_HiScopeUtil", "getThirdMetaDataAppId:packageManager is null.");
            return "";
        }
        LogUtil.e("Debug_HiScopeUtil", "getThirdMetaDataAppId:packageName is ", str);
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("com.huawei.hms.client.appid")) == null) {
                return "";
            }
            String strValueOf = String.valueOf(obj);
            LogUtil.a("Debug_HiScopeUtil", "appId = ", strValueOf);
            return (strValueOf == null || !strValueOf.startsWith("appid=")) ? strValueOf : strValueOf.substring(6);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.c("Debug_HiScopeUtil", "getThirdMetaDataAppId:NameNotFoundException");
            return "";
        }
    }

    public static List<String> c(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            String strO = o(it.next().getType());
            if (e(strO) && !arrayList.contains(strO)) {
                arrayList.add(strO);
            }
        }
        return arrayList;
    }

    public static List<String> b(int[] iArr) {
        if (HiCommonUtil.e(iArr)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            String strO = o(i);
            if (e(strO) && !arrayList.contains(strO)) {
                arrayList.add(strO);
            }
        }
        return arrayList;
    }

    public static List<String> c(int[] iArr) {
        if (HiCommonUtil.e(iArr)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            String strA = a(i);
            if (e(strA) && !arrayList.contains(strA)) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    public static List<String> d(int[] iArr) {
        return b(iArr);
    }

    private static String o(int i) {
        if (i == -1) {
            return "com.huawei.android.hms.health.profile";
        }
        switch (AnonymousClass1.f12339c[HiHealthDataType.d(i).ordinal()]) {
            case 1:
                return c(i);
            case 2:
                return m(i);
            case 3:
                return j(i);
            case 4:
                return g(i);
            case 5:
                return e(i);
            case 6:
                return n(i);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hihealth.util.HiScopeUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f12339c;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f12339c = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12339c[HiHealthDataType.Category.SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12339c[HiHealthDataType.Category.SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12339c[HiHealthDataType.Category.SEQUENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12339c[HiHealthDataType.Category.REALTIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12339c[HiHealthDataType.Category.STAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static String a(int i) {
        if (i == -1) {
            return "com.huawei.android.hms.health.profile.readonly";
        }
        switch (AnonymousClass1.f12339c[HiHealthDataType.d(i).ordinal()]) {
            case 1:
                return b(i);
            case 2:
                return f(i);
            case 3:
                return i(i);
            case 4:
                return h(i);
            case 5:
                return d(i);
            case 6:
                return k(i);
            default:
                return null;
        }
    }

    private static String c(int i) {
        if (i < 1000) {
            return "com.huawei.android.hms.health.sport";
        }
        if (i == 2001) {
            return "com.huawei.android.hms.health.health.wgt";
        }
        if (i == 2002) {
            return "com.huawei.android.hms.health.health.hr";
        }
        if (i == 2004) {
            return "com.huawei.android.hms.health.health.wgt";
        }
        if (i == 2018 || i == 2105) {
            return "com.huawei.android.hms.health.health.hr";
        }
        if (i != 2106) {
            switch (i) {
                case 2006:
                case 2007:
                    return "com.huawei.android.hms.health.health.bf";
                case 2008:
                case 2009:
                case 2010:
                case 2011:
                case 2012:
                case 2013:
                case 2014:
                case 2015:
                    return "com.huawei.android.hms.health.health.bg";
                default:
                    return null;
            }
        }
        return "com.huawei.android.hms.health.health.bg";
    }

    private static String b(int i) {
        if (i < 1000) {
            return "com.huawei.android.hms.health.sport.readonly";
        }
        if (i == 2001) {
            return "com.huawei.android.hms.health.health.wgt.readonly";
        }
        if (i == 2002) {
            return "com.huawei.android.hms.health.health.hr.readonly";
        }
        if (i == 2004) {
            return "com.huawei.android.hms.health.health.wgt.readonly";
        }
        if (i == 2018 || i == 2105) {
            return "com.huawei.android.hms.health.health.hr.readonly";
        }
        if (i != 2106) {
            switch (i) {
                case 2006:
                case 2007:
                    return "com.huawei.android.hms.health.health.bf.readonly";
                case 2008:
                case 2009:
                case 2010:
                case 2011:
                case 2012:
                case 2013:
                case 2014:
                case 2015:
                    return "com.huawei.android.hms.health.health.bg.readonly";
                default:
                    return null;
            }
        }
        return "com.huawei.android.hms.health.health.bg.readonly";
    }

    private static String m(int i) {
        if (i == 10001) {
            return "com.huawei.android.hms.health.health.bg";
        }
        if (i == 10002) {
            return "com.huawei.android.hms.health.health.bf";
        }
        if (i != 10006) {
            return null;
        }
        return "com.huawei.android.hms.health.health.wgt";
    }

    private static String f(int i) {
        if (i == 10001) {
            return "com.huawei.android.hms.health.health.bg.readonly";
        }
        if (i == 10002) {
            return "com.huawei.android.hms.health.health.bf.readonly";
        }
        if (i != 10006) {
            return null;
        }
        return "com.huawei.android.hms.health.health.wgt.readonly";
    }

    private static String j(int i) {
        if (i <= 21000) {
            return "com.huawei.android.hms.health.sport";
        }
        if (i <= 22199) {
            return "com.huawei.android.hms.health.health.slp";
        }
        return null;
    }

    private static String i(int i) {
        if (i <= 21000) {
            return "com.huawei.android.hms.health.sport.readonly";
        }
        if (i <= 22199) {
            return "com.huawei.android.hms.health.health.slp.readonly";
        }
        return null;
    }

    private static String g(int i) {
        if (i <= 30999) {
            return "com.huawei.android.hms.health.motionpath";
        }
        return null;
    }

    private static String h(int i) {
        if (i <= 30999) {
            return "com.huawei.android.hms.health.motionpath.readonly";
        }
        return null;
    }

    private static String e(int i) {
        if (i != 50001) {
            return null;
        }
        return "com.huawei.android.hms.health.health.hr";
    }

    private static String d(int i) {
        if (i != 50001) {
            return null;
        }
        return "com.huawei.android.hms.health.health.hr.readonly";
    }

    private static String n(int i) {
        if (i <= 41000) {
            return "com.huawei.android.hms.health.sport";
        }
        if (i <= 43900) {
            return "com.huawei.android.hms.health.motionpath";
        }
        if (i <= 44099 || i <= 44299) {
            return "com.huawei.android.hms.health.health.slp";
        }
        if (i > 46010 && i > 47000) {
            return null;
        }
        return "com.huawei.android.hms.health.health.hr";
    }

    private static String k(int i) {
        if (i <= 41000) {
            return "com.huawei.android.hms.health.sport.readonly";
        }
        if (i <= 43900) {
            return "com.huawei.android.hms.health.motionpath.readonly";
        }
        if (i <= 44099 || i <= 44299) {
            return "com.huawei.android.hms.health.health.slp.readonly";
        }
        if (i > 46010 && i > 47000) {
            return null;
        }
        return "com.huawei.android.hms.health.health.hr.readonly";
    }
}
