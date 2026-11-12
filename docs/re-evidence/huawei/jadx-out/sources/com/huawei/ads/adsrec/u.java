package com.huawei.ads.adsrec;

import android.text.TextUtils;
import defpackage.axv;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f4772a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, Map<Integer, List<String>>> f4773b = new HashMap();

    public static void a(String str, int i, List<String> list) {
        synchronized (f4772a) {
            if (!TextUtils.isEmpty(str)) {
                Map<Integer, List<String>> map = f4773b.get(str);
                if (map != null) {
                    map.put(Integer.valueOf(i), list);
                } else {
                    HashMap map2 = new HashMap();
                    map2.put(Integer.valueOf(i), list);
                    f4773b.put(str, map2);
                }
            }
        }
    }

    public static List<String> a(String str, int i) {
        Map<Integer, List<String>> map;
        synchronized (f4772a) {
            if (!TextUtils.isEmpty(str) && !axv.d(f4773b) && f4773b.containsKey(str) && (map = f4773b.get(str)) != null && map.size() != 0) {
                return map.get(Integer.valueOf(i));
            }
            return null;
        }
    }
}
