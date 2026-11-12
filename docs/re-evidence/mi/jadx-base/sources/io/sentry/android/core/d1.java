package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @TestOnly
    @Nullable
    public static String f21453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f21454b = Charset.forName("UTF-8");

    public static synchronized String a(@NotNull Context context) throws RuntimeException {
        try {
            if (f21453a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String strC = c(file);
                        f21453a = strC;
                        return strC;
                    }
                    f21453a = b(file);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return f21453a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @TestOnly
    @NotNull
    public static String b(@NotNull File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f21454b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @TestOnly
    @NotNull
    public static String c(@NotNull File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String string = UUID.randomUUID().toString();
            fileOutputStream.write(string.getBytes(f21454b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return string;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
