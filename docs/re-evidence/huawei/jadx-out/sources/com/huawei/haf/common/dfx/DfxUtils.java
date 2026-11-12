package com.huawei.haf.common.dfx;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import health.compact.a.ProcessUtil;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class DfxUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static File f5859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SimpleDateFormat f5860b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA);

    private DfxUtils() {
    }

    public static File c() {
        File file = f5859a;
        if (file != null) {
            return file;
        }
        File file2 = new File(AppInfoUtils.g(null), AppInfoUtils.e());
        f5859a = file2;
        return file2;
    }

    public static File d(File file) {
        return new File(file, "dfx_log_" + AppInfoUtils.i());
    }

    public static String d(String str) {
        return ProcessUtil.c().replace(':', '_') + str;
    }

    public static String b(String str, boolean z) {
        if (!z) {
            return d(str);
        }
        return AppInfoUtils.e() + str;
    }

    public static String d(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter(2048);
        PrintWriter printWriter = new PrintWriter(stringWriter);
        ExceptionUtils.d(thread, th, printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    public static String e(long j) {
        String str;
        if (j <= 0) {
            return "N/A";
        }
        SimpleDateFormat simpleDateFormat = f5860b;
        synchronized (simpleDateFormat) {
            str = simpleDateFormat.format(new Date(j));
        }
        return str;
    }

    public static String a(String str, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.CHINA);
        if (date == null) {
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }
}
