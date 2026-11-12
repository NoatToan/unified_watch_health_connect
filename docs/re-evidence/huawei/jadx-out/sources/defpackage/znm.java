package defpackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import lib.android.paypal.com.magnessdk.g;
import lib.android.paypal.com.magnessdk.log.a;

/* JADX INFO: loaded from: classes46.dex */
public final class znm {
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003f: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:22:0x003f */
    public static String e(File file) throws Throwable {
        BufferedReader bufferedReader;
        Closeable closeable;
        StringBuilder sb = new StringBuilder();
        Closeable closeable2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } catch (IOException e) {
                        e = e;
                        sb.append(g.d);
                        a.e((Class<?>) znm.class, 3, e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                znp.b((Class<?>) znm.class, closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            znp.b((Class<?>) znm.class, closeable2);
            throw th;
        }
        znp.b((Class<?>) znm.class, bufferedReader);
        if (sb.toString().isEmpty()) {
            return null;
        }
        return sb.toString();
    }

    public static String a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[(int) randomAccessFile.length()];
                    randomAccessFile.readFully(bArr);
                    String str = new String(bArr, "UTF-8");
                    znp.b((Class<?>) znm.class, randomAccessFile);
                    return str;
                } catch (Exception e) {
                    e = e;
                    randomAccessFile2 = randomAccessFile;
                    a.e((Class<?>) znm.class, 3, e);
                    znp.b((Class<?>) znm.class, randomAccessFile2);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    znp.b((Class<?>) znm.class, randomAccessFile);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static boolean c(String[] strArr, String str) {
        if (strArr != null && str != null) {
            boolean zIsEmpty = str.isEmpty();
            for (String str2 : strArr) {
                if ((!zIsEmpty ? new File(str2, str) : new File(str2)).exists()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes("UTF-8"));
                    znp.b((Class<?>) znm.class, fileOutputStream);
                    return true;
                } catch (Exception e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    a.e((Class<?>) znm.class, 3, e);
                    znp.b((Class<?>) znm.class, fileOutputStream2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    znp.b((Class<?>) znm.class, fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static boolean c(File file) {
        try {
            if (file.exists()) {
                a.e((Class<?>) znm.class, 0, "deleting CachedConfigDataFromDisk");
                return file.delete();
            }
        } catch (Exception e) {
            a.e((Class<?>) znm.class, 3, e);
        }
        return false;
    }

    private znm() {
    }
}
