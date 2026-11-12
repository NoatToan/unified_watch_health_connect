package com.xiaomi.passport.ui.utils;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes11.dex */
public class OsHelper {
    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final String KEY_VERSION_MIUI = "ro.miui.ui.version.name";
    private static final String KEY_VERSION_MI_OS = "ro.mi.os.version.name";
    private static final String KEY_VERSION_OPPO = "ro.build.version.opporom";
    private static final String KEY_VERSION_SMARTISAN = "ro.smartisan.version";
    private static final String KEY_VERSION_VIVO = "ro.vivo.os.version";
    public static final String ROM_EMUI = "EMUI";
    public static final String ROM_FLYME = "FLYME";
    public static final String ROM_MIUI = "MIUI";
    public static final String ROM_OPPO = "OPPO";
    public static final String ROM_QIKU = "QIKU";
    public static final String ROM_SMARTISAN = "SMARTISAN";
    public static final String ROM_VIVO = "VIVO";
    private static String sName;
    private static String sVersion;

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    public static boolean check(String str) throws Throwable {
        String str2 = sName;
        if (str2 != null) {
            return str2.equals(str);
        }
        String prop = getProp(KEY_VERSION_MIUI);
        sVersion = prop;
        if (TextUtils.isEmpty(prop)) {
            String prop2 = getProp(KEY_VERSION_MI_OS);
            sVersion = prop2;
            if (TextUtils.isEmpty(prop2)) {
                String prop3 = getProp(KEY_VERSION_EMUI);
                sVersion = prop3;
                if (TextUtils.isEmpty(prop3)) {
                    String prop4 = getProp(KEY_VERSION_OPPO);
                    sVersion = prop4;
                    if (TextUtils.isEmpty(prop4)) {
                        String prop5 = getProp(KEY_VERSION_VIVO);
                        sVersion = prop5;
                        if (TextUtils.isEmpty(prop5)) {
                            String prop6 = getProp(KEY_VERSION_SMARTISAN);
                            sVersion = prop6;
                            if (TextUtils.isEmpty(prop6)) {
                                String str3 = Build.DISPLAY;
                                sVersion = str3;
                                if (str3.toUpperCase().contains(ROM_FLYME)) {
                                    sName = ROM_FLYME;
                                } else {
                                    sVersion = "unknown";
                                    sName = Build.MANUFACTURER.toUpperCase();
                                }
                            } else {
                                sName = ROM_SMARTISAN;
                            }
                        } else {
                            sName = ROM_VIVO;
                        }
                    } else {
                        sName = ROM_OPPO;
                    }
                } else {
                    sName = ROM_EMUI;
                }
            } else {
                sName = ROM_MIUI;
            }
        } else {
            sName = ROM_MIUI;
        }
        return sName.equals(str);
    }

    public static String getName() throws Throwable {
        if (sName == null) {
            check("");
        }
        return sName;
    }

    public static String getProp(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return line;
            } catch (IOException unused) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
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

    public static String getVersion() throws Throwable {
        if (sVersion == null) {
            check("");
        }
        return sVersion;
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
        return check(ROM_OPPO);
    }

    public static boolean isSmartisan() {
        return check(ROM_SMARTISAN);
    }

    public static boolean isVivo() {
        return check(ROM_VIVO);
    }
}
