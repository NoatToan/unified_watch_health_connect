package com.google.android.play.core.splitinstall;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes14.dex */
public class SplitInstallHelper {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallHelper");

    private SplitInstallHelper() {
    }

    public static void loadLibrary(Context context, String str) {
        synchronized (zzn.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e4) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (!new File(str2).exists()) {
                    throw e4;
                }
                System.load(str2);
            }
        }
    }

    public static void updateAppInfo(Context context) {
    }
}
