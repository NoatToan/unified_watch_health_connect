package com.xiaomi.ai.android.track;

import android.content.Context;
import com.xiaomi.ai.log.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public class e {
    private Context a;
    private String b;
    private j d;
    private ConcurrentHashMap<String, byte[]> c = new ConcurrentHashMap<>();
    private boolean e = false;

    public e(Context context, String str, j jVar) {
        this.a = context;
        this.b = str;
        this.d = jVar;
    }

    private void c(String str) {
        if (com.xiaomi.ai.android.utils.e.a(this.a, this.b, str) != null) {
            Logger.a("LimitedDiskCache", "removeSpKey and add times: " + this.b + " " + str);
            com.xiaomi.ai.android.utils.e.b(this.a, this.b, str);
            this.d.b();
        }
    }

    private String d(String str) {
        return this.b + "_" + str;
    }

    public synchronized String a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = com.xiaomi.ai.android.utils.a.a(this.c.get(d(str)), "utf-8");
        Logger.a("LimitedDiskCache", "readKeyValue Uncompress time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (!com.xiaomi.ai.b.f.a(strA)) {
            return strA;
        }
        return com.xiaomi.ai.android.utils.e.a(this.a, this.b, str);
    }

    public synchronized void a() {
        Logger.a("LimitedDiskCache", "removeAll " + this.b, this.e);
        this.c.clear();
        Map<String, ?> mapB = com.xiaomi.ai.android.utils.e.b(this.a, this.b);
        if (mapB == null || mapB.keySet().size() > 0) {
            this.d.b();
            com.xiaomi.ai.android.utils.e.a(this.a, this.b);
        }
    }

    public synchronized void a(String str, String str2) {
        if (this.d.c()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.c.put(d(str), com.xiaomi.ai.android.utils.a.a(str2, "utf-8"));
            Logger.a("LimitedDiskCache", "addToCacheMap Compress :" + this.b + " " + str + " ,Compress time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            c(str);
        } else {
            this.c.remove(d(str));
            this.d.b();
            Logger.a("LimitedDiskCache", "write SpKey and remove map: " + this.b + " " + str);
            com.xiaomi.ai.android.utils.e.a(this.a, this.b, str, str2);
        }
    }

    public synchronized void b(String str) {
        c(str);
        if (this.c.get(d(str)) != null) {
            Logger.a("LimitedDiskCache", "removeMap: " + this.b + " " + str);
            this.c.remove(d(str));
        }
    }
}
