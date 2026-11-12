package com.xiaomi.hm.health.baseutil;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes11.dex */
public class RomIdentify {
    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final String KEY_VERSION_MIUI = "ro.miui.ui.version.name";
    private static final String KEY_VERSION_OPPO = "ro.build.version.opporom";
    private static final String KEY_VERSION_SMARTISAN = "ro.smartisan.version";
    private static final String KEY_VERSION_VIVO = "ro.vivo.os.version";
    private static final String ROM_EMUI = "EMUI";
    private static final String ROM_FLYME = "FLYME";
    private static final String ROM_MIUI = "MIUI";
    private static final String ROM_OPPO = "OPPO";
    private static final String ROM_QIKU = "QIKU";
    private static final String ROM_SMARTISAN = "SMARTISAN";
    private static final String ROM_UNKNOWN = "unknown";
    private static final String ROM_VIVO = "VIVO";
    private static final String TAG = "Rom";
    private static String sName;
    private static String sVersion;
    private static final String ROM_360 = "360";
    private static String[] NAMES = {"MIUI", "EMUI", "FLYME", "OPPO", "SMARTISAN", "VIVO", "QIKU", ROM_360};

    private static boolean check(String str) throws Throwable {
        String str2 = sName;
        if (str2 != null) {
            return str2.equals(str);
        }
        String prop = getProp(KEY_VERSION_MIUI);
        sVersion = prop;
        if (TextUtils.isEmpty(prop)) {
            String prop2 = getProp(KEY_VERSION_EMUI);
            sVersion = prop2;
            if (TextUtils.isEmpty(prop2)) {
                String prop3 = getProp(KEY_VERSION_OPPO);
                sVersion = prop3;
                if (TextUtils.isEmpty(prop3)) {
                    String prop4 = getProp(KEY_VERSION_VIVO);
                    sVersion = prop4;
                    if (TextUtils.isEmpty(prop4)) {
                        String prop5 = getProp(KEY_VERSION_SMARTISAN);
                        sVersion = prop5;
                        if (TextUtils.isEmpty(prop5)) {
                            String str3 = Build.DISPLAY;
                            sVersion = str3;
                            if (str3.toUpperCase().contains("FLYME")) {
                                sName = "FLYME";
                            } else {
                                sVersion = "unknown";
                                sName = Build.MANUFACTURER.toUpperCase();
                            }
                        } else {
                            sName = "SMARTISAN";
                        }
                    } else {
                        sName = "VIVO";
                    }
                } else {
                    sName = "OPPO";
                }
            } else {
                sName = "EMUI";
            }
        } else {
            sName = "MIUI";
        }
        for (String str4 : NAMES) {
            if (sName.equals(str4)) {
                return sName.equals(str);
            }
        }
        sName = "unknown";
        return sName.equals(str);
    }

    public static String getName() throws Throwable {
        if (sName == null) {
            check("");
        }
        return sName;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x003b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:11:0x003b */
    private static String getProp(String str) throws Throwable {
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
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return line;
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to read prop ");
                    sb.append(str);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
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
            if (bufferedReader3 != null) {
                bufferedReader3.close();
            }
            throw th;
        }
    }

    public static String getVersion() throws Throwable {
        if (sVersion == null) {
            check("");
        }
        return sVersion;
    }

    public static boolean is360() {
        return check("QIKU") || check(ROM_360);
    }

    public static boolean isEmui() {
        return check("EMUI");
    }

    public static boolean isFlyme() {
        return check("FLYME");
    }

    public static boolean isMiui() {
        return check("MIUI");
    }

    public static boolean isOppo() {
        return check("OPPO");
    }

    public static boolean isSmartisan() {
        return check("SMARTISAN");
    }

    public static boolean isUnknownOS() {
        return check("unknown");
    }

    public static boolean isVivo() {
        return check("VIVO");
    }
}
