package com.huawei.haf.common.dfx;

import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileFilterUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.os.MemoryUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.common.utils.CollectionUtils;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class DfxBaseHandler {
    private static final String DFX_DUMP_LOG_EXTENSION = ".hprof";
    private static final String DFX_LOG_EXTENSION = ".txt";
    private static final int MAX_LOGFILE_LENGTH = 1048576;
    private final String mFormatFileName;
    private final int mMaxLogFileNum;
    private final int mMaxLogFileSize;
    protected final String mTag;

    public DfxBaseHandler(String str, String str2) {
        this(str, str2, 3, 1048576, false);
    }

    protected DfxBaseHandler(String str, String str2, int i) {
        this(str, str2, i, 1048576, false);
    }

    public DfxBaseHandler(String str, String str2, int i, int i2, boolean z) {
        this.mTag = str;
        String strB = DfxUtils.b(str2 + DFX_LOG_EXTENSION, z);
        this.mFormatFileName = strB;
        if (strB.indexOf(TimeModel.NUMBER_FORMAT) == -1) {
            this.mMaxLogFileNum = 1;
        } else {
            this.mMaxLogFileNum = (i <= 1 || i > 5) ? 3 : i;
        }
        this.mMaxLogFileSize = i2 <= 0 ? 1048576 : i2;
    }

    public Context getContext() {
        return BaseApplication.b();
    }

    public File getSaveFile() {
        return getLogFile(DfxUtils.c());
    }

    public static void setLogRootDir(File file) {
        DfxUtils.f5859a = file;
    }

    public static void deleteOtherAllDfxLogFile(File file) {
        FileUtils.a(file, new DfxLogDirDeleteFilter());
    }

    public static void getAllDfxLogFileToPathList(File file, List<String> list) {
        File fileD = DfxUtils.d(file);
        if (fileD.exists() && fileD.isDirectory()) {
            File[] fileArrListFiles = fileD.listFiles(new FileFilterUtils.FileExtensionCollectFilter(DFX_LOG_EXTENSION));
            if (CollectionUtils.d(fileArrListFiles)) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                list.add(file2.getPath());
            }
        }
    }

    public static boolean dumpHprofData(String str, CountDownLatch countDownLatch) {
        if (LogUtil.c()) {
            return false;
        }
        File fileD = DfxUtils.d(DfxUtils.c());
        if (!fileD.exists() && !fileD.mkdirs()) {
            LogUtil.e(str, "dumpHprofData fail. dfx log dir not exist.");
            return false;
        }
        DfxMonitorCenter.b(new DumpHprofDataRunnalbe(str, fileD, countDownLatch), 0L);
        return true;
    }

    public static void deleteHprofData() {
        FileUtils.a(DfxUtils.d(DfxUtils.c()), new FileFilterUtils.FileExtensionCollectFilter(DFX_DUMP_LOG_EXTENSION, 86400000L));
    }

    protected static String getSaveBaseInfo(Thread thread, Throwable th, long j, String str) {
        StringBuilder sb = new StringBuilder(512);
        fillSaveBaseInfo(sb, thread, th, j, str);
        return sb.toString();
    }

    protected static void fillSaveBaseInfo(StringBuilder sb, Thread thread, Throwable th, long j, String str) {
        sb.append("=====");
        sb.append(DfxUtils.e(j));
        sb.append("=====");
        sb.append(System.lineSeparator());
        sb.append("SystemInfo:");
        SystemInfo.d(sb);
        sb.append(System.lineSeparator());
        if (th instanceof OutOfMemoryError) {
            sb.append("MemoryInfo:");
            sb.append(MemoryUtils.a((Debug.MemoryInfo) null, false));
            sb.append(System.lineSeparator());
        }
        sb.append("RunningInfo:");
        sb.append("appVerName=");
        sb.append(BaseApplication.i());
        sb.append(", processName=");
        sb.append(ProcessUtil.c());
        sb.append(", pid=");
        sb.append(Process.myPid());
        if (thread != null) {
            sb.append(", threadName:");
            sb.append(thread.getName());
            sb.append(", tid=");
            sb.append(thread.getId());
        }
        if (ProcessUtil.b()) {
            sb.append(", currentActivity:");
            sb.append(BaseApplication.j());
        }
        sb.append(System.lineSeparator());
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(System.lineSeparator());
        }
        sb.append("--------------------------------");
        sb.append(System.lineSeparator());
    }

    public final boolean saveInfo(String str, File file) throws Throwable {
        boolean z = false;
        if (file != null && file.getParentFile().exists()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    PrintStream printStream = new PrintStream((OutputStream) fileOutputStream, false, "UTF-8");
                    try {
                        printStream.println(str);
                        printStream.println();
                        try {
                            printStream.close();
                            try {
                                fileOutputStream.close();
                                return true;
                            } catch (IOException e) {
                                e = e;
                                z = true;
                                LogUtil.d(this.mTag, "saveInfo ex=", LogUtil.c(e));
                                return z;
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            printStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
        return z;
    }

    protected final File getLogFile(File file) {
        boolean z = this.mMaxLogFileNum == 1;
        File fileD = DfxUtils.d(file);
        if (fileD.exists()) {
            if (z) {
                return getFile(fileD, z);
            }
            File[] logFiles = getLogFiles(fileD);
            checkAndRenameFiles(logFiles);
            return logFiles[0];
        }
        if (fileD.mkdirs() || fileD.exists()) {
            return getFile(fileD, z);
        }
        LogUtil.e(this.mTag, "log dir mkdirs fail.");
        return null;
    }

    private File[] getLogFiles(File file) {
        int i = this.mMaxLogFileNum;
        File[] fileArr = new File[i];
        for (int i2 = 0; i2 < i; i2++) {
            fileArr[i2] = new File(file, String.format(Locale.ENGLISH, this.mFormatFileName, Integer.valueOf(i2)));
        }
        return fileArr;
    }

    private File getFile(File file, boolean z) {
        if (z) {
            return new File(file, this.mFormatFileName);
        }
        return new File(file, String.format(Locale.ENGLISH, this.mFormatFileName, 0));
    }

    private boolean checkAndRenameFiles(File[] fileArr) {
        if (fileArr[0].exists() && fileArr[0].length() < this.mMaxLogFileSize) {
            return false;
        }
        for (int length = fileArr.length - 1; length > 0; length--) {
            int i = length - 1;
            if (fileArr[i].exists()) {
                LogUtil.c(this.mTag, "move to ", Integer.valueOf(length), " ret ", Boolean.valueOf(fileArr[i].renameTo(fileArr[length])));
            }
        }
        return true;
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class DumpHprofDataRunnalbe implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f5856b;
        private final File e;

        DumpHprofDataRunnalbe(String str, File file, CountDownLatch countDownLatch) {
            this.f5855a = str;
            this.e = file;
            this.f5856b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            FileUtils.a(this.e, new FileFilterUtils.FileExtensionCollectFilter(DfxBaseHandler.DFX_DUMP_LOG_EXTENSION));
            MemoryUtils.f5917c.run();
            StringBuilder sb = new StringBuilder(128);
            sb.append('_');
            sb.append(Process.myPid());
            sb.append('_');
            sb.append(DfxUtils.a("yyyy-MM-dd_HH-mm-ss.SSS", null));
            sb.append(DfxBaseHandler.DFX_DUMP_LOG_EXTENSION);
            if (!MemoryUtils.a(new File(this.e, DfxUtils.d(sb.toString())))) {
                LogUtil.b(this.f5855a, "dumpHprofData fail.");
            }
            d();
        }

        private void d() {
            CountDownLatch countDownLatch = this.f5856b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class DfxLogDirDeleteFilter implements FilenameFilter {
        private DfxLogDirDeleteFilter() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("dfx_log_") && !str.endsWith(BaseApplication.i());
        }
    }
}
