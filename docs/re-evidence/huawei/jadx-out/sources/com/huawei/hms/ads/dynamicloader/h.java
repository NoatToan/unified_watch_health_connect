package com.huawei.hms.ads.dynamicloader;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.uiengineloader.aa;
import com.huawei.hms.ads.uiengineloader.af;
import com.huawei.hms.ads.uiengineloader.p;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12793a = "h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f12794b = {"b4ec5c5bc95f125d5d586b54a5a40abd38b44201fe8fe3cd295cb3c64f422c3c"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile h f12795c;
    private final Context d;

    private static boolean a(Context context, String str) {
        return aa.a((List<String>) Arrays.asList(f12794b), aa.a(context, str));
    }

    public static h a(Context context) {
        h hVar;
        if (f12795c != null) {
            return f12795c;
        }
        synchronized (h.class) {
            if (f12795c == null) {
                f12795c = new h(context);
            }
            hVar = f12795c;
        }
        return hVar;
    }

    public static Context a(Context context, Bundle bundle) {
        try {
            if (bundle == null) {
                af.d(f12793a, "Failed to read query result");
                return null;
            }
            String str = f12793a;
            af.b(str, "createModuleContext");
            String string = bundle.getString("module_path");
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                if (!aa.a((List<String>) Arrays.asList(f12794b), aa.a(context, string))) {
                    af.c(str, "uiengine apk is invalid.");
                    return null;
                }
                new p();
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                String string2 = bundle.getString("loader_version_type", "v1");
                af.b(str, "loaderType :  ".concat(String.valueOf(string2)));
                int i = bundle.getInt("armeabiType");
                Context iVar = "v2".equals(string2) ? new i(context, string, i) : new e(context, string, i);
                try {
                    iVar.getClassLoader().loadClass("com.huawei.hms.ads.DynamicModuleInitializer").getDeclaredMethod("initializeModule", Context.class).invoke(null, iVar);
                    return iVar;
                } catch (Exception e) {
                    af.b(p.f12922a, "failed to init Module " + e.getClass().getSimpleName());
                    return iVar;
                }
            }
            af.c(str, "The module path is invalid.");
            return null;
        } catch (Throwable th) {
            af.c(f12793a, "createModuleContext err: %s" + th.getClass().getSimpleName());
            return null;
        }
    }

    private h(Context context) {
        this.d = context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }
}
