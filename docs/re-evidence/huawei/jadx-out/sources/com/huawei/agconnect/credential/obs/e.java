package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, d> f5002a = new HashMap();

    static c a(Context context, f fVar) {
        String str;
        synchronized (e.class) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                str = "init must be called in the main thread";
            } else if (context == null) {
                str = "context cannot be null to init HiAnalyticsInstanceEx.";
            } else if (TextUtils.isEmpty(fVar.f5003a) || fVar.f5003a.length() > 256) {
                str = "serviceTag check failed";
            } else {
                if (!TextUtils.isEmpty(fVar.f5004b) && fVar.f5004b.length() <= 256) {
                    Map<String, d> map = f5002a;
                    d dVar = map.get(fVar.f5003a);
                    if (dVar == null) {
                        d dVar2 = new d(context, fVar);
                        map.put(fVar.f5003a, dVar2);
                        return dVar2;
                    }
                    if (fVar.f5005c.equals(dVar.f4999b.f5005c)) {
                        return dVar;
                    }
                    dVar.a(context, fVar);
                    return dVar;
                }
                str = "httpheader check failed";
            }
            Log.e("HAInstanceManager", str);
            return null;
        }
    }
}
