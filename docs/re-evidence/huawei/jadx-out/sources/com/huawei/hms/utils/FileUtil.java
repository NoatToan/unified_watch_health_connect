package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes34.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f16884a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ScheduledExecutorService f16885b = Executors.newSingleThreadScheduledExecutor();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f16886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f16887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16888c;

        a(File file, long j, String str) {
            this.f16886a = file;
            this.f16887b = j;
            this.f16888c = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th;
            File file = this.f16886a;
            if (file == null) {
                HMSLog.e(com.huawei.android.hicloud.sync.util.FileUtil.TAG, "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
                HMSLog.e(com.huawei.android.hicloud.sync.util.FileUtil.TAG, "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    long length = this.f16886a.length();
                    if (length > this.f16887b) {
                        String canonicalPath = this.f16886a.getCanonicalPath();
                        if (!this.f16886a.delete()) {
                            HMSLog.e(com.huawei.android.hicloud.sync.util.FileUtil.TAG, "last file delete failed.");
                        }
                        randomAccessFile2 = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        randomAccessFile = new RandomAccessFile(this.f16886a, "rw");
                        try {
                            randomAccessFile.seek(length);
                            randomAccessFile2 = randomAccessFile;
                        } catch (IOException e) {
                            e = e;
                            randomAccessFile2 = randomAccessFile;
                            HMSLog.e(com.huawei.android.hicloud.sync.util.FileUtil.TAG, "writeFile exception:", e);
                        } catch (Throwable th2) {
                            th = th2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    }
                    randomAccessFile2.writeBytes(this.f16888c + System.getProperty("line.separator"));
                } catch (Throwable th3) {
                    randomAccessFile = null;
                    th = th3;
                }
            } catch (IOException e2) {
                e = e2;
            }
            IOUtils.closeQuietly(randomAccessFile2);
        }
    }

    public static boolean verifyHash(String str, File file) throws Throwable {
        byte[] bArrDigest = SHA256.digest(file);
        return bArrDigest != null && HEX.encodeHexString(bArrDigest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j) {
        f16885b.execute(new a(file, j, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j, int i) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f16884a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.e(com.huawei.android.hicloud.sync.util.FileUtil.TAG, "file delete failed.");
                }
                f16884a = true;
            }
            writeFile(file2, str + "|" + j + "|" + i, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
