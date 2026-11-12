package com.xiaomi.ai.android.track;

import android.content.Context;
import android.text.TextUtils;
import defpackage.wpe;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static volatile f e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f10980b;
    private int c = 1000;
    private volatile boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, e> f10979a = new HashMap<>();

    private f() {
    }

    private e a(Context context, String str) {
        e eVar;
        if (!this.d) {
            this.f10980b = new g(context, this.c, "aivs_track", "disk_cache_write_times");
            wpe.f("LimitedDiskCacheManager", "initTrackTimes", false);
            this.f10980b.b();
            this.d = true;
        }
        synchronized (f.class) {
            try {
                eVar = this.f10979a.get(str);
                if (eVar == null) {
                    eVar = new e(context, str, this.f10980b);
                    this.f10979a.put(str, eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public void b(Context context, String str, String str2, boolean z) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            wpe.c("LimitedDiskCacheManager", "removeKeyValue ERROR,illegal  parameter!", false);
        } else if (z) {
            a(context, str).c(str2);
        } else {
            com.xiaomi.ai.android.utils.d.b(context, str, str2);
        }
    }

    public static f a() {
        if (e == null) {
            synchronized (f.class) {
                try {
                    if (e == null) {
                        e = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public String a(Context context, String str, String str2, boolean z) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return !z ? com.xiaomi.ai.android.utils.d.a(context, str, str2) : a(context, str).b(str2);
        }
        wpe.c("LimitedDiskCacheManager", "readKeyValue ERROR,illegal  parameter!", false);
        return null;
    }

    public void a(int i) {
        if (this.d) {
            wpe.i("LimitedDiskCacheManager", "setMaxDiskSaveTimes fail,has been init", false);
        } else {
            this.c = i;
        }
    }

    public void a(Context context, String str, String str2, String str3, boolean z) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            wpe.c("LimitedDiskCacheManager", "writeKeyValue ERROR,illegal  parameter!", false);
        } else if (z) {
            a(context, str).a(str2, str3);
        } else {
            com.xiaomi.ai.android.utils.d.a(context, str, str2, str3);
        }
    }

    public void a(Context context, String str, boolean z) {
        if (context == null || TextUtils.isEmpty(str)) {
            wpe.c("LimitedDiskCacheManager", "removeKeyValue ERROR,illegal  parameter!", false);
        } else if (z) {
            a(context, str).a();
        } else {
            com.xiaomi.ai.android.utils.d.a(context, str);
        }
    }
}
