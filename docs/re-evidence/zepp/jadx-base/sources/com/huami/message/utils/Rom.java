package com.huami.message.utils;

import android.os.Build;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes11.dex */
public class Rom {
    public static final String ROM_EMUI = "EMUI";
    public static final String ROM_FLYME = "FLYME";
    public static final String ROM_MIUI = "MIUI";
    public static final String ROM_OPPO = "OPPO";
    public static final String ROM_QIKU = "QIKU";
    public static final String ROM_SMARTISAN = "SMARTISAN";
    public static final String ROM_VIVO = "VIVO";
    private static final String a = "Rom";
    private static final String b = "ro.miui.ui.version.name";
    private static final String c = "ro.build.version.emui";
    private static final String d = "ro.build.version.opporom";
    private static final String e = "ro.smartisan.version";
    private static final String f = "ro.vivo.os.version";
    private static String g;
    private static String h;

    public static boolean check(String str) throws Throwable {
        String str2 = g;
        if (str2 != null) {
            return str2.equals(str);
        }
        String prop = getProp(b);
        h = prop;
        if (TextUtils.isEmpty(prop)) {
            String prop2 = getProp("ro.build.version.emui");
            h = prop2;
            if (TextUtils.isEmpty(prop2)) {
                String prop3 = getProp(d);
                h = prop3;
                if (TextUtils.isEmpty(prop3)) {
                    String prop4 = getProp(f);
                    h = prop4;
                    if (TextUtils.isEmpty(prop4)) {
                        String prop5 = getProp(e);
                        h = prop5;
                        if (TextUtils.isEmpty(prop5)) {
                            String str3 = Build.DISPLAY;
                            h = str3;
                            if (str3.toUpperCase().contains(ROM_FLYME)) {
                                g = ROM_FLYME;
                            } else {
                                h = "unknown";
                                g = Build.MANUFACTURER.toUpperCase();
                            }
                        } else {
                            g = ROM_SMARTISAN;
                        }
                    } else {
                        g = "VIVO";
                    }
                } else {
                    g = "OPPO";
                }
            } else {
                g = ROM_EMUI;
            }
        } else {
            g = ROM_MIUI;
        }
        return g.equals(str);
    }

    public static String getName() throws Throwable {
        if (g == null) {
            check("");
        }
        return g;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String getProp(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
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
                    HMLog.e(a, "Unable to read prop " + str, e);
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
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
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
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public static String getVersion() throws Throwable {
        if (h == null) {
            check("");
        }
        return h;
    }

    public static boolean is360() {
        return check(ROM_QIKU) || check("360");
    }

    public static boolean isEmui() {
        return check(ROM_EMUI);
    }

    public static boolean isFlyme() {
        return check(ROM_FLYME);
    }

    public static boolean isMiui() {
        return check(ROM_MIUI);
    }

    public static boolean isOppo() {
        return check("OPPO");
    }

    public static boolean isSmartisan() {
        return check(ROM_SMARTISAN);
    }

    public static boolean isVivo() {
        return check("VIVO");
    }
}
