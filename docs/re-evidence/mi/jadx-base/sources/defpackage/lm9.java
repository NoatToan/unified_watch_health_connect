package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
public class lm9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f25215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f25216b;
    public static final File[] c;
    public static final Charset d;

    static {
        BigInteger bigIntegerMultiply = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(LockFreeTaskQueueCore.FROZEN_MASK));
        f25215a = bigIntegerMultiply;
        f25216b = bigIntegerMultiply.multiply(BigInteger.valueOf(LockFreeTaskQueueCore.FROZEN_MASK));
        c = new File[0];
        d = Charset.forName("UTF-8");
    }

    public static boolean a(File file, long j) {
        if (file != null) {
            return file.exists() && file.lastModified() > j;
        }
        throw new IllegalArgumentException("No specified file");
    }

    public static FileInputStream b(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        throw new IOException("File '" + file + "' cannot be read");
    }

    public static String c(File file, String str) throws Throwable {
        FileInputStream fileInputStreamB;
        try {
            fileInputStreamB = b(file);
            try {
                String strH = dvc.h(fileInputStreamB, str);
                dvc.b(fileInputStreamB);
                return strH;
            } catch (Throwable th) {
                th = th;
                dvc.b(fileInputStreamB);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStreamB = null;
        }
    }

    public static long d(File file) {
        if (file.exists()) {
            return file.isDirectory() ? e(file) : file.length();
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    public static long e(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] fileArrListFiles = file.listFiles();
        long jD = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jD += d(file2);
        }
        return jD;
    }
}
