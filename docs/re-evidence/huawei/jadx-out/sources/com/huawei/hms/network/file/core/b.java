package com.huawei.hms.network.file.core;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.file.core.util.FLogger;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f15729a = new a("file_manager|filemanager_slice_threshold", 2097152, new Pair(1024, 1073741824));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f15730b = new a("file_manager|filemanager_slice_num", 2, new Pair(0, 11));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f15731c;

    public static int e() {
        return ((Integer) b(f15729a)).intValue();
    }

    public static int d() {
        return ((Integer) b(f15730b)).intValue();
    }

    public static int c() {
        return ((Integer) b(f15731c)).intValue();
    }

    private static Object b(String str) {
        return NetworkKit.getInstance().getOption(str);
    }

    private static Object b(a aVar) {
        if (aVar == null) {
            return null;
        }
        T t = aVar.f15733b;
        Object objB = b(aVar.f15732a);
        if (objB != null && (objB instanceof String)) {
            if (aVar.f15734c == null) {
                return objB;
            }
            try {
                int i = Integer.parseInt((String) objB);
                if (i > ((Integer) aVar.f15734c.first).intValue() && i < ((Integer) aVar.f15734c.second).intValue()) {
                    return Integer.valueOf(i);
                }
            } catch (NumberFormatException unused) {
                FLogger.w("DynamicConfigManager", "getNumericalConfigValue NumberFormatException", new Object[0]);
            }
        }
        return t;
    }

    public static int b() {
        Object objB = b(f15730b.f15732a);
        if (objB != null) {
            if (objB instanceof String) {
                try {
                    return Integer.parseInt((String) objB);
                } catch (NumberFormatException unused) {
                    FLogger.w("DynamicConfigManager", "getNumericalConfigValue NumberFormatException", new Object[0]);
                }
            } else if (objB instanceof Integer) {
                return ((Integer) objB).intValue();
            }
        }
        return 0;
    }

    public static boolean a(String str, boolean z) {
        return a(new a(str, Boolean.valueOf(z), new Pair(0, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(a aVar) {
        if (aVar == null) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) aVar.f15733b).booleanValue();
        Object objB = b(aVar.f15732a);
        return (objB == null || !(objB instanceof String)) ? zBooleanValue : Boolean.parseBoolean((String) objB);
    }

    public static String a(String str) {
        Object objB;
        return (TextUtils.isEmpty(str) || (objB = b(str)) == null || !(objB instanceof String)) ? "" : (String) objB;
    }

    static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f15732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        T f15733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Pair<Integer, Integer> f15734c;

        public a(String str, T t, Pair<Integer, Integer> pair) {
            this.f15732a = str;
            this.f15733b = t;
            this.f15734c = pair;
        }
    }

    public static String a() {
        return a("file_manager|ABTest_dyFrag_groupid");
    }

    static {
        new a("file_manager|filemanager_auto_slice", false, new Pair(0, 0));
        f15731c = new a("file_manager|filemanager_executor_num", -100, new Pair(0, 101));
    }
}
