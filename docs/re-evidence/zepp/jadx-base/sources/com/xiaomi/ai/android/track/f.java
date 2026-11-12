package com.xiaomi.ai.android.track;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.xiaomi.ai.log.Logger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class f {
    private static f a;
    private j c;
    private int d = 1000;
    private volatile boolean e = false;
    private HashMap<String, e> b = new HashMap<>();

    private f() {
    }

    private e a(@NonNull Context context, @NonNull String str) {
        e eVar;
        if (!this.e) {
            this.c = new j(context, this.d, "aivs_track", "disk_cache_write_times");
            Logger.a("LimitedDiskCacheManager", "initTrackTimes", false);
            this.c.a();
            this.e = true;
        }
        synchronized (f.class) {
            eVar = this.b.get(str);
            if (eVar == null) {
                eVar = new e(context, str, this.c);
                this.b.put(str, eVar);
            }
        }
        return eVar;
    }

    public static f a() {
        if (a == null) {
            synchronized (f.class) {
                if (a == null) {
                    a = new f();
                }
            }
        }
        return a;
    }

    public String a(Context context, String str, String str2, boolean z) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return !z ? com.xiaomi.ai.android.utils.e.a(context, str, str2) : a(context, str).a(str2);
        }
        Logger.c("LimitedDiskCacheManager", "readKeyValue ERROR,illegal  parameter!", false);
        return null;
    }

    public void a(int i) {
        if (this.e) {
            Logger.b("LimitedDiskCacheManager", "setMaxDiskSaveTimes fail,has been init", false);
        } else {
            this.d = i;
        }
    }

    public void a(Context context, String str, String str2, String str3, boolean z) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Logger.c("LimitedDiskCacheManager", "writeKeyValue ERROR,illegal  parameter!", false);
        } else if (z) {
            a(context, str).a(str2, str3);
        } else {
            com.xiaomi.ai.android.utils.e.a(context, str, str2, str3);
        }
    }

    public void a(Context context, String str, boolean z) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.c("LimitedDiskCacheManager", "removeKeyValue ERROR,illegal  parameter!", false);
        } else if (z) {
            a(context, str).a();
        } else {
            com.xiaomi.ai.android.utils.e.a(context, str);
        }
    }

    public void b(Context context, String str, String str2, boolean z) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Logger.c("LimitedDiskCacheManager", "removeKeyValue ERROR,illegal  parameter!", false);
        } else if (z) {
            a(context, str).b(str2);
        } else {
            com.xiaomi.ai.android.utils.e.b(context, str, str2);
        }
    }
}
