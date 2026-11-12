package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.android.volley.RequestQueue;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class Volley {
    private static final String a = "volley";

    public static RequestQueue newRequestQueue(Context context, HttpStack httpStack) {
        File file = new File(context.getCacheDir(), a);
        String str = "volley/1.0.5";
        try {
            String packageName = context.getPackageName();
            str = "volley/1.0.5" + packageName + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (httpStack == null) {
            httpStack = Build.VERSION.SDK_INT >= 9 ? new HurlStack() : new HttpClientStack(AndroidHttpClient.newInstance(str));
        }
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(file), new BasicNetwork(httpStack));
        requestQueue.start();
        return requestQueue;
    }

    public static RequestQueue newRequestQueue(Context context) {
        return newRequestQueue(context, null);
    }
}
