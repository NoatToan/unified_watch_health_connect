package xcrash;

import android.annotation.SuppressLint;
import android.os.Process;
import android.text.TextUtils;
import defpackage.cw6;
import defpackage.dn0;
import defpackage.od1;
import defpackage.oqc;
import defpackage.tl9;
import defpackage.tlq;
import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"StaticFieldLeak"})
public class a implements Thread.UncaughtExceptionHandler {
    public static final a q = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38998b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38999k;
    public boolean l;
    public boolean m;
    public int n;
    public String[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f38997a = new Date();
    public Thread.UncaughtExceptionHandler p = null;

    public static a b() {
        return q;
    }

    public final String a(Date date, Thread thread, String str) {
        return tlq.h(this.f38997a, date, "java", this.d, this.e) + "pid: " + this.f38998b + ", tid: " + Process.myTid() + ", name: " + thread.getName() + "  >>> " + this.c + " <<<\n\njava stacktrace:\n" + str + "\n";
    }

    public final String c(Thread thread) {
        ArrayList<Pattern> arrayList;
        if (this.o != null) {
            arrayList = new ArrayList<>();
            for (String str : this.o) {
                try {
                    arrayList.add(Pattern.compile(str));
                } catch (Exception e) {
                    XCrash.f().w("xcrash", "JavaCrashHandler pattern compile failed", e);
                }
            }
        } else {
            arrayList = null;
        }
        StringBuilder sb = new StringBuilder();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (!key.getName().equals(thread.getName()) && (arrayList == null || f(arrayList, key.getName()))) {
                i2++;
                int i4 = this.n;
                if (i4 <= 0 || i < i4) {
                    sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                    sb.append("pid: ");
                    sb.append(this.f38998b);
                    sb.append(", tid: ");
                    sb.append(key.getId());
                    sb.append(", name: ");
                    sb.append(key.getName());
                    sb.append("  >>> ");
                    sb.append(this.c);
                    sb.append(" <<<\n");
                    sb.append("\n");
                    sb.append("java stacktrace:\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append("    at ");
                        sb.append(stackTraceElement.toString());
                        sb.append("\n");
                    }
                    sb.append("\n");
                    i++;
                } else {
                    i3++;
                }
            }
        }
        if (allStackTraces.size() > 1) {
            if (i == 0) {
                sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
            }
            sb.append("total JVM threads (exclude the crashed thread): ");
            sb.append(allStackTraces.size() - 1);
            sb.append("\n");
            if (arrayList != null) {
                sb.append("JVM threads matched whitelist: ");
                sb.append(i2);
                sb.append("\n");
            }
            if (this.n > 0) {
                sb.append("JVM threads ignored by max count limit: ");
                sb.append(i3);
                sb.append("\n");
            }
            sb.append("dumped JVM threads:");
            sb.append(i);
            sb.append("\n");
            sb.append("+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++\n");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void d(Thread thread, Throwable th) throws Throwable {
        File fileG;
        String string;
        String strA;
        ?? r4;
        Date date = new Date();
        NativeHandler.b().e();
        od1.a().b();
        ?? r5 = 0;
        RandomAccessFile randomAccessFile = null;
        try {
            fileG = tl9.l().g(String.format(Locale.US, "%s/%s_%020d_%s__%s%s", this.g, "tombstone", Long.valueOf(this.f38997a.getTime() * 1000), this.e, this.c, ".java.xcrash"));
        } catch (Exception e) {
            XCrash.f().e("xcrash", "JavaCrashHandler createLogFile failed", e);
            fileG = null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
            try {
                strA = a(date, thread, string);
            } catch (Exception e2) {
                e = e2;
                XCrash.f().e("xcrash", "JavaCrashHandler getEmergency failed", e);
                strA = null;
            }
        } catch (Exception e3) {
            e = e3;
            string = null;
        }
        try {
            try {
                if (fileG != null) {
                    try {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileG, "rws");
                        try {
                            randomAccessFile2.write(("backtrace feature id:\n\t" + cw6.a(string) + "\n\n").getBytes("UTF-8"));
                            StringBuilder sb = new StringBuilder();
                            sb.append("error reason:\n\t");
                            sb.append(th.toString());
                            sb.append("\n\n");
                            randomAccessFile2.write(sb.toString().getBytes("UTF-8"));
                            if (strA != null) {
                                randomAccessFile2.write(strA.getBytes("UTF-8"));
                            }
                            int i = this.j;
                            if (i > 0 || this.h > 0 || this.i > 0) {
                                r4 = sb;
                                int i2 = this.h;
                                int i3 = this.i;
                                randomAccessFile2.write(tlq.i(i, i2, i3).getBytes("UTF-8"));
                                r4 = i3;
                            }
                            r4 = sb;
                            if (this.f38999k) {
                                randomAccessFile2.write(tlq.e().getBytes("UTF-8"));
                            }
                            if (this.l) {
                                randomAccessFile2.write(tlq.l().getBytes("UTF-8"));
                            }
                            randomAccessFile2.write(tlq.k().getBytes("UTF-8"));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("foreground:\n");
                            sb2.append(dn0.d().f() ? "yes" : "no");
                            sb2.append("\n\n");
                            randomAccessFile2.write(sb2.toString().getBytes("UTF-8"));
                            if (this.m) {
                                randomAccessFile2.write(c(thread).getBytes("UTF-8"));
                            }
                            randomAccessFile2.close();
                            r5 = r4;
                        } catch (Exception e4) {
                            e = e4;
                            randomAccessFile = randomAccessFile2;
                            XCrash.f().e("xcrash", "JavaCrashHandler write log file failed", e);
                            r5 = randomAccessFile;
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                                r5 = randomAccessFile;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r5 = randomAccessFile2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused) {
            return;
        }
        if (r5 != 0) {
            try {
                r5.close();
            } catch (Exception unused2) {
            }
        }
        throw th;
    }

    public void e(int i, String str, boolean z, String str2, String str3, String str4, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, boolean z5, int i5, String[] strArr, oqc oqcVar) {
        this.f38998b = i;
        this.c = TextUtils.isEmpty(str) ? "unknown" : str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = str4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.f38999k = z3;
        this.l = z4;
        this.m = z5;
        this.n = i5;
        this.o = strArr;
        if (z) {
            return;
        }
        this.p = Thread.getDefaultUncaughtExceptionHandler();
        try {
            Thread.setDefaultUncaughtExceptionHandler(this);
        } catch (Exception e) {
            XCrash.f().e("xcrash", "JavaCrashHandler setDefaultUncaughtExceptionHandler failed", e);
        }
    }

    public final boolean f(ArrayList<Pattern> arrayList, String str) {
        Iterator<Pattern> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public void g(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.p = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.p;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        try {
            d(thread, th);
        } catch (Exception e) {
            XCrash.f().e("xcrash", "JavaCrashHandler handleException failed", e);
        }
        if (!this.f) {
            dn0.d().c();
            Process.killProcess(this.f38998b);
            System.exit(10);
        } else {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.p;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
