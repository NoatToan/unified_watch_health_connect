package com.xiaomi.onetrack.api;

import android.os.Process;
import com.xiaomi.onetrack.CrashAnalysis;
import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class f implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13762a = "OneTrackExceptionHandler";
    private static final String c = "tombstone";
    private static final String d = ".java.xcrash";
    private static final String e = "backtrace feature id:\n\t";
    private static final String f = "error reason:\n\t";
    private static final long h = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f13763b;
    private final Date g = new Date();
    private int i = 50;
    private int j = 50;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13764k = 200;
    private boolean l = true;
    private boolean m = true;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        com.xiaomi.onetrack.util.p.a(f13762a);
        StringBuilder sb = new StringBuilder();
        sb.append("crash happened->stacktrace: ");
        sb.append(th.getStackTrace());
        FutureTask futureTask = new FutureTask(new g(this, thread, th), null);
        com.xiaomi.onetrack.c.b.a(futureTask);
        try {
            futureTask.get(2L, TimeUnit.SECONDS);
        } catch (Exception e2) {
            com.xiaomi.onetrack.util.p.a(f13762a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("handleException error :");
            sb2.append(e2.getMessage());
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13763b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof f) {
            return;
        }
        this.f13763b = defaultUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Removed unreachable split cross block B:67:0x014a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public void a(Thread thread, Throwable th) throws Throwable {
        File file;
        String string;
        String strA;
        Date date = new Date();
        ?? r5 = 0;
        RandomAccessFile randomAccessFile = null;
        r5 = 0;
        try {
            file = new File(String.format(Locale.US, "%s/%s_%020d_%s__%s%s", com.xiaomi.onetrack.util.k.a(), c, Long.valueOf(this.g.getTime() * 1000), com.xiaomi.onetrack.util.b.a(com.xiaomi.onetrack.f.a.b()), com.xiaomi.onetrack.f.a.e(), d));
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Exception e2) {
                e = e2;
                com.xiaomi.onetrack.util.p.b(f13762a, "JavaCrashHandler createLogFile failed", e);
            }
        } catch (Exception e3) {
            e = e3;
            file = null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
            try {
                strA = a(date, thread, string);
            } catch (Exception e4) {
                e = e4;
                com.xiaomi.onetrack.util.p.b(f13762a, "JavaCrashHandler getEmergency failed", e);
                strA = null;
            }
        } catch (Exception e5) {
            e = e5;
            string = null;
        }
        try {
            try {
                if (file != null) {
                    try {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rws");
                        try {
                            randomAccessFile2.write((e + CrashAnalysis.calculateJavaDigest(string) + "\n\n").getBytes("UTF-8"));
                            StringBuilder sb = new StringBuilder();
                            sb.append(f);
                            sb.append(th.toString());
                            sb.append("\n\n");
                            randomAccessFile2.write(sb.toString().getBytes("UTF-8"));
                            if (strA != null) {
                                randomAccessFile2.write(strA.getBytes("UTF-8"));
                            }
                            int i = this.f13764k;
                            if (i > 0 || this.i > 0 || this.j > 0) {
                                randomAccessFile2.write(com.xiaomi.onetrack.util.b.a(i, this.i, this.j).getBytes("UTF-8"));
                            }
                            if (this.l) {
                                randomAccessFile2.write(com.xiaomi.onetrack.util.b.f().getBytes("UTF-8"));
                            }
                            if (this.m) {
                                randomAccessFile2.write(com.xiaomi.onetrack.util.b.e().getBytes("UTF-8"));
                            }
                            randomAccessFile2.write(com.xiaomi.onetrack.util.b.d().getBytes("UTF-8"));
                            randomAccessFile2.write("foreground:\nyes\n\n".getBytes("UTF-8"));
                            randomAccessFile2.close();
                            r5 = sb;
                        } catch (Exception e6) {
                            e = e6;
                            randomAccessFile = randomAccessFile2;
                            com.xiaomi.onetrack.util.p.b(f13762a, "JavaCrashHandler write log file failed", e);
                            r5 = randomAccessFile;
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                r5 = randomAccessFile;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r5 = randomAccessFile2;
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                } catch (Exception e7) {
                                    com.xiaomi.onetrack.util.p.b(f13762a, "JavaCrashHandler close RandomAccessFile failed", e7);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e8) {
                        e = e8;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e9) {
            com.xiaomi.onetrack.util.p.b(f13762a, "JavaCrashHandler close RandomAccessFile failed", e9);
        }
    }

    private String a(Date date, Thread thread, String str) {
        return com.xiaomi.onetrack.util.b.a(this.g, date, "java", com.xiaomi.onetrack.f.a.e(), com.xiaomi.onetrack.util.b.a(com.xiaomi.onetrack.f.a.b())) + "pid: " + Process.myPid() + ", tid: " + Process.myTid() + ", name: " + thread.getName() + "  >>> " + com.xiaomi.onetrack.f.a.e() + " <<<\n\njava stacktrace:\n" + str + "\n";
    }
}
