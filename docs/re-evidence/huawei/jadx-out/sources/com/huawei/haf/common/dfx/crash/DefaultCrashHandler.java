package com.huawei.haf.common.dfx.crash;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.security.SecurityUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class DefaultCrashHandler extends DfxBaseHandler implements CrashCallback {
    private volatile boolean d;
    private final Object e;

    protected boolean c(Throwable th, String str, String str2, StringBuilder sb) {
        return true;
    }

    protected void d(String str, String str2, String str3) {
    }

    @Override // com.huawei.haf.common.dfx.crash.CrashCallback
    public boolean isAllowRethrow() {
        return true;
    }

    @Override // com.huawei.haf.common.dfx.crash.CrashCallback
    public boolean isAllowSelfKill() {
        return true;
    }

    public DefaultCrashHandler(String str) {
        super(str, "_crashLog_%d");
        this.e = new Object();
        this.d = false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    @Override // com.huawei.haf.common.dfx.crash.CrashCallback
    public void handleCrash(Thread thread, Throwable th) throws Throwable {
        CountDownLatch countDownLatch;
        if (!(th instanceof OutOfMemoryError)) {
            countDownLatch = null;
        } else {
            if (this.d) {
                return;
            }
            this.d = true;
            countDownLatch = new CountDownLatch(1);
            if (!dumpHprofData(this.mTag, countDownLatch)) {
                countDownLatch = null;
            }
        }
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        c(thread, th, ExceptionUtils.c(th), countDownLatch2);
        try {
            countDownLatch2.await(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            LogUtil.d(this.mTag, LogUtil.c(e));
        }
        if (countDownLatch != null) {
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                LogUtil.d(this.mTag, LogUtil.c(e2));
            }
        }
    }

    private void c(Thread thread, Throwable th, String str, CountDownLatch countDownLatch) throws Throwable {
        String str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = null;
        try {
            StringBuilder sb = new StringBuilder(64);
            boolean zE = e(th, str, sb);
            String saveBaseInfo = getSaveBaseInfo(thread, th, jCurrentTimeMillis, sb.toString());
            try {
                strD = DfxUtils.d(thread, th);
                if (zE) {
                    d(str, saveBaseInfo, strD);
                }
                a(thread, th, jCurrentTimeMillis, saveBaseInfo + strD, countDownLatch);
            } catch (Throwable th2) {
                th = th2;
                str2 = strD;
                strD = saveBaseInfo;
                a(thread, th, jCurrentTimeMillis, strD + str2, countDownLatch);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = null;
        }
    }

    private boolean e(Throwable th, String str, StringBuilder sb) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return c(th, DfxUtils.d("_crash"), str, sb);
    }

    protected void a(final Thread thread, final Throwable th, final long j, final String str, final CountDownLatch countDownLatch) {
        final File saveFile = getSaveFile();
        if (saveFile == null || !saveFile.getParentFile().exists()) {
            LogUtil.e(this.mTag, "saveCrashInfo fail.");
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        if (countDownLatch == null) {
            c(thread, th, j, saveFile, str);
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.submit(new Runnable() { // from class: com.huawei.haf.common.dfx.crash.DefaultCrashHandler.1
            @Override // java.lang.Runnable
            public void run() {
                DefaultCrashHandler.this.c(thread, th, j, saveFile, str);
                countDownLatch.countDown();
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Thread thread, Throwable th, long j, File file, String str) {
        ReleaseLogUtil.c(this.mTag, "saveCrashInfo()");
        if (TextUtils.isEmpty(str)) {
            d(thread, th, j, file);
        } else {
            if (saveInfo(str, file)) {
                return;
            }
            LogUtil.e(this.mTag, "saveCrashInfo fail.");
        }
    }

    private void d(Thread thread, Throwable th, long j, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                PrintStream printStream = new PrintStream((OutputStream) fileOutputStream, false, "UTF-8");
                try {
                    printStream.append((CharSequence) getSaveBaseInfo(thread, th, j, null));
                    ExceptionUtils.d(thread, th, printStream);
                    printStream.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        printStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e) {
            LogUtil.d(this.mTag, "saveCrashInfo ex=", LogUtil.c(e));
        }
    }

    protected final boolean b(String str, String str2, String str3, StringBuilder sb) throws Throwable {
        long j;
        int i;
        if (str3.indexOf(str) < 0) {
            return true;
        }
        String strC = SecurityUtils.c(str3);
        String str4 = strC + "_crash_count";
        String str5 = strC + "_crash_time";
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(str2, 0);
        synchronized (this.e) {
            try {
                try {
                    if (str3.equals(sharedPreferences.getString(strC, ""))) {
                        i = sharedPreferences.getInt(str4, 0);
                        j = sharedPreferences.getLong(str5, 0L);
                        long jAbs = Math.abs(jCurrentTimeMillis - j);
                        if (jAbs < 86400000) {
                            if (jAbs > 5000) {
                                sharedPreferences.edit().putInt(str4, i + 1).commit();
                            }
                            return false;
                        }
                    } else {
                        j = jCurrentTimeMillis;
                        i = 0;
                    }
                    b(sb, str2, j, jCurrentTimeMillis, i + 1);
                    sharedPreferences.edit().putString(strC, str3).putInt(str4, 0).putLong(str5, jCurrentTimeMillis).commit();
                    return true;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private static void b(StringBuilder sb, String str, long j, long j2, int i) {
        sb.append(str);
        sb.append(':');
        sb.append(" From '");
        sb.append(DfxUtils.e(j));
        sb.append("' to '");
        sb.append(DfxUtils.e(j2));
        sb.append("', crash ");
        sb.append(i);
        sb.append(" times.");
    }
}
