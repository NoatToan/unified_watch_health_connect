package com.xiaomi.push;

import android.util.Pair;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
public class bb {
    private static Vector<Pair<String, Long>> a = new Vector<>();
    private static ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();

    public static String a() {
        StringBuilder sb = new StringBuilder();
        synchronized (a) {
            for (int i = 0; i < a.size(); i++) {
                Pair<String, Long> pairElementAt = a.elementAt(i);
                sb.append((String) pairElementAt.first);
                sb.append(":");
                sb.append(pairElementAt.second);
                if (i < a.size() - 1) {
                    sb.append(";");
                }
            }
            a.clear();
        }
        return sb.toString();
    }
}
