package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class ia1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20927a = "ia1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f20928b;

    public static String a(Context context) {
        return b(c(context));
    }

    public static String b(Integer num) {
        return "adb reverse tcp:" + num + " tcp:" + num;
    }

    public static Integer c(Context context) {
        return Integer.valueOf(context.getResources().getInteger(iti.f22077a));
    }

    public static String d() {
        if (k()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static String e(Context context) {
        return j(f(context).intValue());
    }

    public static Integer f(Context context) {
        return Integer.valueOf(context.getResources().getInteger(iti.f22077a));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007e A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:16:0x003f, B:20:0x0045, B:39:0x0073, B:43:0x0079, B:45:0x007e, B:46:0x0081, B:36:0x006d), top: B:54:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[Catch: all -> 0x0043, SYNTHETIC, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:16:0x003f, B:20:0x0045, B:39:0x0073, B:43:0x0079, B:45:0x007e, B:46:0x0081, B:36:0x006d), top: B:54:0x0003 }] */
    public static synchronized String g() {
        BufferedReader bufferedReader;
        Throwable th;
        Process processExec;
        Exception e;
        String str = f20928b;
        if (str != null) {
            return str;
        }
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", "metro.host"});
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), Charset.forName("UTF-8")));
                String str2 = "";
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str2 = line;
                        } catch (Exception e2) {
                            e = e2;
                            cm8.D(f20927a, "Failed to query for metro.host prop:", e);
                            f20928b = "";
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (processExec != null) {
                            }
                            return f20928b;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (processExec != null) {
                            throw th;
                        }
                        processExec.destroy();
                        throw th;
                    }
                }
                f20928b = str2;
                try {
                    bufferedReader.close();
                } catch (Exception unused3) {
                }
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (processExec != null) {
                    throw th;
                }
                processExec.destroy();
                throw th;
            }
        } catch (Exception e4) {
            bufferedReader = null;
            e = e4;
            processExec = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            processExec = null;
        }
        processExec.destroy();
        return f20928b;
    }

    public static String h(Context context) {
        return j(c(context).intValue());
    }

    public static String i(Integer num) {
        return j(num.intValue());
    }

    public static String j(int i) {
        String strG = g();
        if (strG.equals("")) {
            if (k()) {
                strG = "10.0.3.2";
            } else {
                strG = l() ? "10.0.2.2" : "localhost";
            }
        }
        return String.format(Locale.US, "%s:%d", strG, Integer.valueOf(i));
    }

    public static boolean k() {
        return Build.FINGERPRINT.contains("vbox");
    }

    public static boolean l() {
        return Build.FINGERPRINT.contains("generic");
    }
}
