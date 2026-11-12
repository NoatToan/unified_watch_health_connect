package com.xiaomi.accountsdk.diagnosis.e;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class c {
    private static final ThreadLocal<SimpleDateFormat> a = new a();

    public static class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        }
    }

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
        String str = a.get().format(new Date());
        return new File(com.xiaomi.accountsdk.diagnosis.b.b(), str + ".logcat");
    }
}
