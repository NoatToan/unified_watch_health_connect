package com.huawei.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.DaoManager;
import com.huawei.hianalytics.util.HwSfpPolicyUtils;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static i e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11547a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11548b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f11549c = new ConcurrentHashMap();
    public long d;

    public i(Context context) {
        if (context == null || TextUtils.isEmpty("haformal_event.db")) {
            throw new IllegalArgumentException("context is null, or dbName is empty");
        }
        try {
            DaoManager.getInstance().init(b0.a(context).getWritableDatabase());
            String str = context.isDeviceProtectedStorage() ? "S1" : "S2";
            HiLog.d("DBController", "db label value: ".concat(str));
            File databasePath = context.getDatabasePath("haformal_event.db");
            if (databasePath == null || !databasePath.exists()) {
                HiLog.e("HWPU", "file does not exist");
            } else {
                HwSfpPolicyUtils.a(context, databasePath.getPath(), str, 0);
            }
            this.d = System.currentTimeMillis();
        } catch (Exception unused) {
            HiLog.w("DBController", "Exception");
            throw new IllegalStateException("database init error");
        }
    }

    public static i a(Context context) {
        if (e == null) {
            synchronized (i.class) {
                if (e == null) {
                    e = new i(context);
                }
            }
        }
        return e;
    }

    public final AtomicLong b(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        if (System.currentTimeMillis() - this.d > 3600000) {
            this.f11548b.clear();
            this.f11549c.clear();
            this.d = System.currentTimeMillis();
        }
        if ("oper".equals(str2)) {
            concurrentHashMap = this.f11548b;
        } else {
            if (!"maint".equals(str2)) {
                HiLog.w("DBController", "unknown event type: " + str2);
                return null;
            }
            concurrentHashMap = this.f11549c;
        }
        return (AtomicLong) concurrentHashMap.get(str);
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f11548b.clear();
            this.f11549c.clear();
        } else if (TextUtils.isEmpty(str2)) {
            this.f11548b.remove(str);
            this.f11549c.remove(str);
        } else if ("oper".equals(str2)) {
            this.f11548b.remove(str);
        } else if ("maint".equals(str2)) {
            this.f11549c.remove(str);
        }
    }
}
