package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class dv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f2399a = new File("/system/framework/amap.jar").exists();

    public static AssetManager a(Context context) {
        if (context == null) {
            return null;
        }
        AssetManager assets = context.getAssets();
        if (f2399a) {
            try {
                assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, "/system/framework/amap.jar");
                return assets;
            } catch (Throwable th) {
                jv.c(th, "ResourcesUtil", "getSelfAssets");
            }
        }
        return assets;
    }

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
