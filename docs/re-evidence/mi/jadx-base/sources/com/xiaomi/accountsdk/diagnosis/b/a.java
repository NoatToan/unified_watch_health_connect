package com.xiaomi.accountsdk.diagnosis.b;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f10836a = new ThreadLocal<SimpleDateFormat>() { // from class: com.xiaomi.accountsdk.diagnosis.b.a.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd", Locale.US);
        }
    };

    private static File a() {
        String str = f10836a.get().format(new Date());
        return new File(com.xiaomi.accountsdk.diagnosis.b.a(), str + ".log");
    }

    private static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
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
                        a(bufferedWriter2);
                    } catch (IOException e) {
                        e = e;
                        bufferedWriter = bufferedWriter2;
                        e.printStackTrace();
                        a(bufferedWriter);
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        a(bufferedWriter);
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
}
