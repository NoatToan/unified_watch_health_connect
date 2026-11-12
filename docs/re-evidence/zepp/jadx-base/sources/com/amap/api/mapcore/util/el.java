package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class el {
    private static boolean a = new File("/system/framework/amap.jar").exists();

    public static AssetManager a(Context context) {
        if (context == null) {
            return null;
        }
        AssetManager assets = context.getAssets();
        if (a) {
            try {
                assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, "/system/framework/amap.jar");
            } catch (Throwable th) {
                hn.c(th, "ResourcesUtil", "getSelfAssets");
            }
        }
        return assets;
    }

    public static int b(Context context) {
        return (int) ((context.getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
    }
}
