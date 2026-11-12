package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class ifs {
    public static String a() {
        return Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL;
    }

    public static String b(Context context) {
        String strC = tfs.b(context).c("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        String strA = qcs.a(20);
        tfs.b(context).e("sp_client_report_status", "sp_client_report_key", strA);
        return strA;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    public static void c(Context context, String str, String str2) throws Throwable {
        File file;
        RandomAccessFile randomAccessFile;
        Exception e;
        if (context == null || str == null || str2 == null) {
            return;
        }
        File file2 = new File(context.getFilesDir(), str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(context.getFilesDir(), str);
        if (!file3.exists()) {
            file3.mkdirs();
            return;
        }
        File[] fileArrListFiles = file3.listFiles(new mfs());
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        FileLock fileLockLock = null;
        File file4 = null;
        RandomAccessFile randomAccessFile2 = null;
        for (File file5 : fileArrListFiles) {
            if (file5 != null) {
                try {
                    if (TextUtils.isEmpty(file5.getAbsolutePath())) {
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e2) {
                                x9s.s(e2);
                            }
                        }
                        mgt.b(randomAccessFile2);
                        if (file4 != null) {
                            file4.delete();
                        }
                    } else {
                        file = new File(file5.getAbsolutePath() + ".lock");
                        try {
                            mgt.f(file);
                            randomAccessFile = new RandomAccessFile(file, "rw");
                            try {
                                try {
                                    fileLockLock = randomAccessFile.getChannel().lock();
                                    File file6 = new File(file2.getAbsolutePath() + File.separator + file5.getName() + jCurrentTimeMillis);
                                    try {
                                        mgt.i(file5, file6);
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                        file5.delete();
                                        file6.delete();
                                    }
                                    file5.delete();
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e4) {
                                            x9s.s(e4);
                                        }
                                    }
                                    mgt.b(randomAccessFile);
                                } catch (Throwable th) {
                                    th = th;
                                    randomAccessFile2 = randomAccessFile;
                                    file4 = file;
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e5) {
                                            x9s.s(e5);
                                        }
                                    }
                                    mgt.b(randomAccessFile2);
                                    if (file4 == null) {
                                        throw th;
                                    }
                                    file4.delete();
                                    throw th;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                x9s.s(e);
                                if (fileLockLock != null) {
                                    try {
                                        fileLockLock.release();
                                    } catch (IOException e7) {
                                        x9s.s(e7);
                                    }
                                }
                                mgt.b(randomAccessFile);
                                if (file != null) {
                                }
                                randomAccessFile2 = randomAccessFile;
                                file4 = file;
                            }
                        } catch (Exception e8) {
                            randomAccessFile = randomAccessFile2;
                            e = e8;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        file.delete();
                        randomAccessFile2 = randomAccessFile;
                        file4 = file;
                    }
                } catch (Exception e9) {
                    file = file4;
                    randomAccessFile = randomAccessFile2;
                    e = e9;
                } catch (Throwable th3) {
                    th = th3;
                }
                x9s.s(e);
                if (fileLockLock != null && fileLockLock.isValid()) {
                    fileLockLock.release();
                }
                mgt.b(randomAccessFile);
                if (file != null) {
                    file.delete();
                }
                randomAccessFile2 = randomAccessFile;
                file4 = file;
            } else {
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                mgt.b(randomAccessFile2);
                if (file4 != null) {
                    file4.delete();
                }
            }
        }
    }

    public static boolean d(Context context, String str) {
        File file = new File(str);
        long jD = h3s.e(context).c().d();
        if (!file.exists()) {
            mgt.f(file);
            return true;
        }
        try {
            if (file.length() <= jD) {
                return true;
            }
        } catch (Exception e) {
            x9s.s(e);
        }
        return false;
    }

    @TargetApi(9)
    public static byte[] e(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(ecs.b(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }

    public static File[] f(Context context, String str) {
        return new File(context.getFilesDir(), str).listFiles(new pfs());
    }
}
