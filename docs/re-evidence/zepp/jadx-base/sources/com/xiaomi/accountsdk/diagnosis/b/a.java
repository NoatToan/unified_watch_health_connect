package com.xiaomi.accountsdk.diagnosis.b;

import com.huami.feedback.log.utils.ConstantsKt;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    private static final ThreadLocal<SimpleDateFormat> a = new C0765a();

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.diagnosis.b.a$a, reason: collision with other inner class name */
    public static class C0765a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd", Locale.US);
        }
    }

    private static File a() {
        String str = a.get().format(new Date());
        return new File(com.xiaomi.accountsdk.diagnosis.b.a(), str + ConstantsKt.LOG_FILE_SUFFIX);
    }

    public static void a(String str) throws Throwable {
        File fileA = a();
        File parentFile = fileA.getParentFile();
        if (parentFile.exists() || parentFile.mkdirs()) {
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileA, true));
                    try {
                        bufferedWriter2.append((CharSequence) str);
                        bufferedWriter2.newLine();
                        b(bufferedWriter2);
                    } catch (IOException e) {
                        e = e;
                        bufferedWriter = bufferedWriter2;
                        e.printStackTrace();
                        b(bufferedWriter);
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        b(bufferedWriter);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
    }

    private static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
