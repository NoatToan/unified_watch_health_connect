package com.huawei.hms.ads.uiengineloader;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes33.dex */
public final class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12917a = "DexClassLoaderStrategy";

    @Override // com.huawei.hms.ads.uiengineloader.j
    public final ClassLoader a(Context context, String str, int i, PackageInfo packageInfo) {
        af.b(f12917a, "The android version is below android 5, use dexClassLoader.");
        return new com.huawei.hms.ads.dynamicloader.c(i.a(context, str, packageInfo), ad.a(context.getFilesDir()), i.b(context, str, packageInfo), context.getClassLoader());
    }
}
