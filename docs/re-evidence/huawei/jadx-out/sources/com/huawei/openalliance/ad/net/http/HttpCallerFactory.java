package com.huawei.openalliance.ad.net.http;

import android.content.Context;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;

/* JADX INFO: loaded from: classes12.dex */
public abstract class HttpCallerFactory {
    public static i a() {
        try {
            if (as.d()) {
                return new d();
            }
            return null;
        } catch (Throwable th) {
            hw.c("HttpCallerFactory", "create http listener exception: " + th.getClass().getSimpleName());
            return null;
        }
    }

    static h a(Context context, int i) {
        h hVarA;
        if (i == 2) {
            hVarA = new k(context);
        } else {
            hVarA = i == 1 ? a(context) : null;
        }
        if (hVarA != null) {
            return hVarA;
        }
        hw.b("HttpCallerFactory", "create HttpUrlConnectionCaller");
        return new g(context);
    }

    private static h a(Context context) {
        StringBuilder sb;
        try {
            if (!as.d()) {
                return null;
            }
            hw.b("HttpCallerFactory", "create OkHttpCaller");
            return new OkHttpCaller(context);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("createOkHttpCaller RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("HttpCallerFactory", sb.toString());
            return null;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("createOkHttpCaller Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("HttpCallerFactory", sb.toString());
            return null;
        }
    }
}
