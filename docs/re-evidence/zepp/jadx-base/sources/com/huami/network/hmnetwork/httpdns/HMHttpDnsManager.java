package com.huami.network.hmnetwork.httpdns;

import android.text.TextUtils;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class HMHttpDnsManager {
    private static final String a = "HMHttpDnsManager";
    private static final String b = "https://";
    private static final String c = "http://";
    private static final String d = "/";
    private static final Map<String, List<a>> e = new ConcurrentHashMap();
    private static final Map<String, String> f = new ConcurrentHashMap();

    private static List<a> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    if (c(str)) {
                        arrayList.add(new a(f(str), true));
                    } else {
                        arrayList.add(new a(f(str), false));
                    }
                }
            }
        }
        return arrayList;
    }

    private static String b(String str) {
        try {
            return URI.create(str).getHost();
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean c(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static void clear() {
        e.clear();
        f.clear();
    }

    private static boolean d(String str, List<String> list, List<String> list2) {
        int i;
        List<a> list3 = e.get(f(str));
        if (list3 == null) {
            return true;
        }
        if (list != null) {
            i = 0;
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    i++;
                    if (!list3.contains(new a(f(str2)))) {
                        return true;
                    }
                }
            }
        } else {
            i = 0;
        }
        if (list2 != null) {
            for (String str3 : list2) {
                if (!TextUtils.isEmpty(str3)) {
                    i++;
                    if (!list3.contains(new a(f(str3)))) {
                        return true;
                    }
                }
            }
        }
        return i != list3.size();
    }

    private static void e(String str) {
        List<a> list;
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        String strF = f(strB);
        Map<String, List<a>> map = e;
        if (map.containsKey(strF) && (list = map.get(strF)) != null) {
            boolean z = false;
            for (a aVar : list) {
                if (aVar.b) {
                    f.put(strF, aVar.a);
                    z = true;
                    break;
                }
            }
            if (z) {
                return;
            }
            f.put(strF, strF);
        }
    }

    private static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.startsWith(b) && !str.startsWith(c)) {
            str = b + str;
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    public static String getHttpDnsUrlBySrc(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Map<String, String> map = f;
        if (map.containsKey(str)) {
            String str2 = map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return str;
    }

    public static String getHttpDnsUrls() {
        return stitching(HMServerDef.getOriHost(), HMServerDef.getOriWatchHost());
    }

    public static String getSrcByHttpDnsUrl(String str) {
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            return str;
        }
        String strF = f(strB);
        try {
            for (String str2 : f.keySet()) {
                if (strF.equals(f.get(str2))) {
                    return str2;
                }
            }
        } catch (Exception e2) {
            HMLog.e(a, e2.toString(), new Object[0]);
        }
        return str;
    }

    public static void invalidUrl(String str) {
        String next;
        List<a> list;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<String> it2 = e.keySet().iterator();
        while (it2.hasNext() && (list = e.get((next = it2.next()))) != null) {
            for (a aVar : list) {
                if (str.startsWith(aVar.a)) {
                    aVar.b = false;
                    e(next);
                    return;
                }
            }
        }
    }

    public static void refreshHttpDns(String str, List<String> list, List<String> list2) {
        if (!TextUtils.isEmpty(str) && d(str, list, list2)) {
            String strF = f(str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a(list));
            arrayList.addAll(a(list2));
            e.put(strF, arrayList);
            e(strF);
        }
    }

    public static String stitching(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            String strB = b(str2);
            if (!TextUtils.isEmpty(strB)) {
                str = TextUtils.isEmpty(str) ? strB : str + "," + strB;
            }
        }
        return str;
    }

    public static class a {
        private String a;
        private boolean b;

        public a(String str) {
            this.a = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }
}
