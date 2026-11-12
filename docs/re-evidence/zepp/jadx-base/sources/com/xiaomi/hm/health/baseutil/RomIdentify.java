package com.xiaomi.hm.health.baseutil;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes19.dex */
public class RomIdentify {
    private static final String a = "Rom";
    private static final String b = "MIUI";
    private static final String c = "EMUI";
    private static final String d = "FLYME";
    private static final String e = "OPPO";
    private static final String f = "SMARTISAN";
    private static final String g = "VIVO";
    private static final String h = "QIKU";
    private static final String j = "unknown";
    private static final String l = "ro.miui.ui.version.name";
    private static final String m = "ro.build.version.emui";
    private static final String n = "ro.build.version.opporom";
    private static final String o = "ro.smartisan.version";
    private static final String p = "ro.vivo.os.version";
    private static String q;
    private static String r;
    private static final String i = "360";
    private static String[] k = {"MIUI", "EMUI", "FLYME", "OPPO", "SMARTISAN", "VIVO", "QIKU", i};

    private static boolean a(String str) throws Throwable {
        String str2 = q;
        if (str2 != null) {
            return str2.equals(str);
        }
        String strB = b(l);
        r = strB;
        if (TextUtils.isEmpty(strB)) {
            String strB2 = b("ro.build.version.emui");
            r = strB2;
            if (TextUtils.isEmpty(strB2)) {
                String strB3 = b(n);
                r = strB3;
                if (TextUtils.isEmpty(strB3)) {
                    String strB4 = b(p);
                    r = strB4;
                    if (TextUtils.isEmpty(strB4)) {
                        String strB5 = b(o);
                        r = strB5;
                        if (TextUtils.isEmpty(strB5)) {
                            String str3 = Build.DISPLAY;
                            r = str3;
                            if (str3.toUpperCase().contains("FLYME")) {
                                q = "FLYME";
                            } else {
                                r = "unknown";
                                q = Build.MANUFACTURER.toUpperCase();
                            }
                        } else {
                            q = "SMARTISAN";
                        }
                    } else {
                        q = "VIVO";
                    }
                } else {
                    q = "OPPO";
                }
            } else {
                q = "EMUI";
            }
        } else {
            q = "MIUI";
        }
        String[] strArr = k;
        int length = strArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = true;
                break;
            }
            if (q.equals(strArr[i2])) {
                break;
            }
            i2++;
        }
        if (z) {
            q = "unknown";
        }
        return q.equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0062: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:24:0x0062 */
    private static String b(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3 = null;
        try {
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
                } catch (IOException e3) {
                    e = e3;
                    Log.e(a, "Unable to read prop " + str, e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader3 = bufferedReader2;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader3 != null) {
                bufferedReader3.close();
            }
            throw th;
        }
    }

    public static String getName() throws Throwable {
        if (q == null) {
            a("");
        }
        return q;
    }

    public static String getVersion() throws Throwable {
        if (r == null) {
            a("");
        }
        return r;
    }

    public static boolean is360() {
        return a("QIKU") || a(i);
    }

    public static boolean isEmui() {
        return a("EMUI");
    }

    public static boolean isFlyme() {
        return a("FLYME");
    }

    public static boolean isMiui() {
        return a("MIUI");
    }

    public static boolean isOppo() {
        return a("OPPO");
    }

    public static boolean isSmartisan() {
        return a("SMARTISAN");
    }

    public static boolean isUnknownOS() {
        return a("unknown");
    }

    public static boolean isVivo() {
        return a("VIVO");
    }
}
