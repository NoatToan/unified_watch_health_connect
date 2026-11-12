package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f41446a = new File("/system/framework/amap.jar").exists();

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static AssetManager b(Context context) {
        if (context == null) {
            return null;
        }
        AssetManager assets = context.getAssets();
        if (f41446a) {
            try {
                assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, "/system/framework/amap.jar");
            } catch (Throwable th) {
                m2t.r(th, "ResourcesUtil", "getSelfAssets");
            }
        }
        return assets;
    }
}
