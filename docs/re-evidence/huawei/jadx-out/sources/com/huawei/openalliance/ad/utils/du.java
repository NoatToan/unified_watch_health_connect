package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class du {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20651a = "du";

    public static boolean a(Context context, String str, String str2) {
        if (dg.b(str)) {
            hw.c(f20651a, "file path is empty");
            return false;
        }
        File fileB = ai.b(context, str, "normal");
        if ((fileB == null || !ai.d(fileB)) && (fileB = ai.b(context, str, Constants.TPLATE_CACHE)) == null) {
            return false;
        }
        return ai.a(str2, fileB);
    }

    public static boolean a(Context context, String str, long j, String str2) {
        File fileB;
        boolean zB = false;
        if (dg.b(str)) {
            hw.c(f20651a, "file path is empty");
            return false;
        }
        File fileB2 = ai.b(context, str, "normal");
        if (fileB2 != null) {
            zB = ai.b(fileB2, j);
            a(context, zB, fileB2, j, str2);
        }
        if (zB || (fileB = ai.b(context, str, Constants.TPLATE_CACHE)) == null) {
            return zB;
        }
        boolean zB2 = ai.b(fileB, j);
        a(context, zB2, fileB, j, str2);
        return zB2;
    }

    public static boolean a(Context context, String str, long j) {
        if (dg.b(str)) {
            hw.c(f20651a, "file path is empty");
            return false;
        }
        File fileB = ai.b(context, str, "normal");
        if ((fileB == null || !ai.b(fileB, j)) && (fileB = ai.b(context, str, Constants.TPLATE_CACHE)) == null) {
            return false;
        }
        return ai.b(fileB, j);
    }

    public static void a(Context context, boolean z, File file, long j, String str) {
        if (z) {
            return;
        }
        if (file != null) {
            try {
                if (file.exists()) {
                    new com.huawei.openalliance.ad.analysis.c(context).a(file.length(), j, str);
                    return;
                }
            } catch (Exception e) {
                hw.c(f20651a, "reportUnderLimitSize, err: %s", e.getClass().getSimpleName());
                return;
            }
        }
        hw.c(f20651a, "reportUnderLimitSize, file not exists");
    }
}
