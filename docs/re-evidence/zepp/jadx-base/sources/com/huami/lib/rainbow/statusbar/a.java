package com.huami.lib.rainbow.statusbar;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes10.dex */
class a {
    private static final String a = "MIUI";
    private static final String b = "EMUI";
    private static final String c = "FLYME";
    private static final String d = "OPPO";
    private static final String e = "SMARTISAN";
    private static final String f = "VIVO";
    private static final String g = "QIKU";
    private static final String h = "ro.miui.ui.version.name";
    private static final String i = "ro.build.version.emui";
    private static final String j = "ro.build.version.opporom";
    private static final String k = "ro.smartisan.version";
    private static final String l = "ro.vivo.os.version";
    private static String m;
    private static String n;

    private static boolean a(String str) throws Throwable {
        String str2 = m;
        if (str2 != null) {
            return str2.equals(str);
        }
        String strC = c(h);
        n = strC;
        if (TextUtils.isEmpty(strC)) {
            String strC2 = c("ro.build.version.emui");
            n = strC2;
            if (TextUtils.isEmpty(strC2)) {
                String strC3 = c(j);
                n = strC3;
                if (TextUtils.isEmpty(strC3)) {
                    String strC4 = c(l);
                    n = strC4;
                    if (TextUtils.isEmpty(strC4)) {
                        String strC5 = c(k);
                        n = strC5;
                        if (TextUtils.isEmpty(strC5)) {
                            String str3 = Build.DISPLAY;
                            n = str3;
                            if (str3.toUpperCase().contains("FLYME")) {
                                m = "FLYME";
                            } else {
                                n = "unknown";
                                m = Build.MANUFACTURER.toUpperCase();
                            }
                        } else {
                            m = "SMARTISAN";
                        }
                    } else {
                        m = "VIVO";
                    }
                } else {
                    m = "OPPO";
                }
            } else {
                m = "EMUI";
            }
        } else {
            m = "MIUI";
        }
        return m.equals(str);
    }

    public static String b() throws Throwable {
        if (m == null) {
            a("");
        }
        return m;
    }

    private static String c(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return line;
            } catch (IOException unused) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String d() throws Throwable {
        if (n == null) {
            a("");
        }
        return n;
    }

    public static boolean e() {
        return a("QIKU") || a("360");
    }

    public static boolean f() {
        return a("EMUI");
    }

    public static boolean g() {
        return a("FLYME");
    }

    public static boolean h() {
        return a("MIUI");
    }

    public static boolean i() {
        return a("OPPO");
    }

    public static boolean j() {
        return a("SMARTISAN");
    }

    public static boolean k() {
        return a("VIVO");
    }
}
