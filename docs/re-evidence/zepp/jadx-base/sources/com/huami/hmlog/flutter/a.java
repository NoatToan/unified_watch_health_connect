package com.huami.hmlog.flutter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
class a {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");

    public static void a(File file, boolean z) {
        File[] fileArrListFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                a(file2, true);
            }
        }
        if (z) {
            file.delete();
        }
    }

    public static long b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            SimpleDateFormat simpleDateFormat = a;
            return simpleDateFormat.parse(simpleDateFormat.format(new Date(jCurrentTimeMillis))).getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static String c(long j) {
        return a.format(new Date(j));
    }

    public static Integer d(Map map, String str) {
        try {
            Object obj = map.get(str);
            if (obj != null) {
                return Integer.valueOf(obj.toString());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Long e(Map map, String str) {
        try {
            Object obj = map.get(str);
            if (obj != null) {
                return Long.valueOf(obj.toString());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    public static String g(Map map, String str) {
        try {
            Object obj = map.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, String> h(Map map, String str) {
        try {
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                return null;
            }
            HashMap map3 = new HashMap();
            for (Object obj : map2.keySet()) {
                map3.put(f(obj), f(map2.get(obj)));
            }
            return map3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean i(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean j(String str) {
        return !i(str);
    }
}
