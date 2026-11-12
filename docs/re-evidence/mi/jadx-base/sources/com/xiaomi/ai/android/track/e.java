package com.xiaomi.ai.android.track;

import android.content.Context;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.wpe;
import defpackage.yrs;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10978b;
    private g d;
    private ConcurrentHashMap<String, byte[]> c = new ConcurrentHashMap<>();
    private boolean e = false;

    public e(Context context, String str, g gVar) {
        this.f10977a = context;
        this.f10978b = str;
        this.d = gVar;
    }

    private String a(String str) {
        return this.f10978b + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str;
    }

    private void d(String str) {
        if (com.xiaomi.ai.android.utils.d.a(this.f10977a, this.f10978b, str) != null) {
            wpe.b("LimitedDiskCache", "removeSpKey and add times: " + this.f10978b + " " + str);
            com.xiaomi.ai.android.utils.d.b(this.f10977a, this.f10978b, str);
            this.d.a();
        }
    }

    public synchronized String b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = com.xiaomi.ai.android.utils.a.a(this.c.get(a(str)), "utf-8");
        wpe.b("LimitedDiskCache", "readKeyValue Uncompress time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (!yrs.b(strA)) {
            return strA;
        }
        return com.xiaomi.ai.android.utils.d.a(this.f10977a, this.f10978b, str);
    }

    public synchronized void c(String str) {
        d(str);
        if (this.c.get(a(str)) != null) {
            wpe.b("LimitedDiskCache", "removeMap: " + this.f10978b + " " + str);
            this.c.remove(a(str));
        }
    }

    public synchronized void a() {
        try {
            wpe.f("LimitedDiskCache", "removeAll " + this.f10978b, this.e);
            this.c.clear();
            Map<String, ?> mapB = com.xiaomi.ai.android.utils.d.b(this.f10977a, this.f10978b);
            if (mapB == null || mapB.keySet().size() > 0) {
                this.d.a();
                com.xiaomi.ai.android.utils.d.a(this.f10977a, this.f10978b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(String str, String str2) {
        try {
            if (this.d.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.c.put(a(str), com.xiaomi.ai.android.utils.a.a(str2, "utf-8"));
                wpe.b("LimitedDiskCache", "addToCacheMap Compress :" + this.f10978b + " " + str + " ,Compress time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                d(str);
            } else {
                this.c.remove(a(str));
                this.d.a();
                wpe.b("LimitedDiskCache", "write SpKey and remove map: " + this.f10978b + " " + str);
                com.xiaomi.ai.android.utils.d.a(this.f10977a, this.f10978b, str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
