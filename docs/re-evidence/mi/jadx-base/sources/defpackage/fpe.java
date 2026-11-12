package defpackage;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.miui.tsmclient.util.ILogger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class fpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f18056a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f18057b = true;
    public static ExecutorService c;
    public static final String d = System.getProperty("line.separator");
    public static final Format e = new SimpleDateFormat("MM-dd HH:mm:ss.SSS ");
    public static final String f = System.getProperty("file.separator");
    public static final b g = new b(null);
    public static ILogger h;

    public class a implements Callable<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18059b;

        public a(String str, String str2) {
            this.f18058a = str;
            this.f18059b = str2;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            BufferedWriter bufferedWriter;
            Throwable th;
            IOException e;
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(this.f18058a, true));
                try {
                    try {
                        bufferedWriter.write(this.f18059b);
                        Boolean bool = Boolean.TRUE;
                        try {
                            bufferedWriter.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return bool;
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        Boolean bool2 = Boolean.FALSE;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return bool2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                bufferedWriter = null;
                e = e6;
            } catch (Throwable th3) {
                bufferedWriter = null;
                th = th3;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                throw th;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18061b;
        public String c;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            this.c = "log";
            if (this.f18060a != null) {
                return;
            }
            if (!"mounted".equals(Environment.getExternalStorageState()) || com.service.mi.common.util.a.a().getExternalCacheDir() == null) {
                this.f18060a = com.service.mi.common.util.a.a().getCacheDir() + fpe.f + "log" + fpe.f;
                return;
            }
            this.f18060a = com.service.mi.common.util.a.a().getExternalCacheDir() + fpe.f + "log" + fpe.f;
        }
    }

    public static boolean b(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    public static boolean c(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!b(file.getParentFile())) {
            return false;
        }
        try {
            boolean zCreateNewFile = file.createNewFile();
            if (zCreateNewFile) {
                k(str);
            }
            return zCreateNewFile;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void d(String str) {
        e("LogUtil", str);
    }

    public static void e(String str, String str2) {
        if (!f18056a || TextUtils.isEmpty(str2)) {
            return;
        }
        l(str + ".d." + str2);
        if (f18057b) {
            h(str2);
        }
    }

    public static void f(String str) {
        g("LogUtil", str);
    }

    public static void g(String str, String str2) {
        if (!f18056a || TextUtils.isEmpty(str2)) {
            return;
        }
        l(str + ".e." + str2);
        if (f18057b) {
            h(str2);
        }
    }

    public static void h(String str) {
        j("LogUtil", str);
    }

    public static void i(String str, String str2) {
        if (c == null) {
            c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        try {
            ((Boolean) c.submit(new a(str2, str)).get()).booleanValue();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        } catch (ExecutionException e3) {
            e3.printStackTrace();
        }
    }

    public static void j(String str, String str2) {
        String str3 = e.format(new Date(System.currentTimeMillis()));
        String strSubstring = str3.substring(0, 5);
        String strSubstring2 = str3.substring(6);
        StringBuilder sb = new StringBuilder();
        b bVar = g;
        sb.append(bVar.f18061b == null ? bVar.f18060a : bVar.f18061b);
        sb.append(bVar.c);
        sb.append("-");
        sb.append(strSubstring);
        sb.append(".txt");
        String string = sb.toString();
        if (c(string)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strSubstring2);
            sb2.append("\t");
            sb2.append(str + "\t");
            sb2.append(str2);
            sb2.append(d);
            i(sb2.toString(), string);
        }
    }

    public static void k(String str) {
        String strA = li1.a();
        long jB = li1.b();
        i("************* Log Head ****************\nDate of Log        : " + str.substring(str.length() - 9, str.length() - 4) + "\nDevice Manufacturer: " + Build.MANUFACTURER + "\nDevice Model       : " + Build.MODEL + "\nAndroid Version    : " + Build.VERSION.RELEASE + "\nAndroid SDK        : " + Build.VERSION.SDK_INT + "\nApp VersionName    : " + strA + "\nApp VersionCode    : " + jB + "\n************* Log Head ****************\n\n", str);
    }

    public static void l(String str) {
        ILogger iLogger = h;
        if (iLogger != null) {
            iLogger.sendLog(str);
        }
    }

    public static void m(ILogger iLogger) {
        h = iLogger;
    }
}
