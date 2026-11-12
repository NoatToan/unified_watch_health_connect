package com.huawei.phoneservice.faq.base.util;

import android.content.Context;
import defpackage.zcp;
import java.io.File;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21581c = new b();

    @JvmStatic
    public static final File d(Context context) {
        zcp.c(context, "");
        b bVar = f21581c;
        return bVar.c(bVar.a(context));
    }

    @JvmStatic
    public static final String e(Context context) {
        zcp.c(context, "");
        b bVar = f21581c;
        return bVar.b(bVar.a(context));
    }

    private final File c(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        File file2 = new File(file, "Download" + File.separator + "FeedbackDownload");
        if (file2.isDirectory() || file2.mkdirs()) {
            return file2;
        }
        return null;
    }

    private final String b(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        File file2 = new File(file.toString() + File.separator + "picCache");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getAbsolutePath();
    }

    private final File a(Context context) {
        return context.getCacheDir();
    }

    private b() {
    }
}
