package com.xiaomi.accountsdk.diagnosis.e;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f10845a = new ThreadLocal<SimpleDateFormat>() { // from class: com.xiaomi.accountsdk.diagnosis.e.c.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        }
    };

    public static File a() {
        File fileB = b();
        File parentFile = fileB.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return null;
        }
        try {
            Runtime.getRuntime().exec("logcat -d -f " + fileB.getAbsolutePath()).waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return fileB;
    }

    private static File b() {
        String str = f10845a.get().format(new Date());
        return new File(com.xiaomi.accountsdk.diagnosis.b.b(), str + ".logcat");
    }
}
