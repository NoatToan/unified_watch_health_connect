package com.huawei.agconnect.apms;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class wxy {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    public static String bcd(Context context) {
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        } catch (Throwable unused) {
        }
        if (defaultDisplay != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
            String str = displayMetrics.heightPixels + "x" + displayMetrics.widthPixels;
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        return "unknown";
    }

    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    public static String bcd() {
        byte b2;
        yza yzaVar;
        try {
            synchronized (yza.class) {
                if (yza.cde == null) {
                    yza.cde = new yza();
                }
                yzaVar = yza.cde;
            }
            if (abc()) {
                if (yzaVar.abc.containsKey("ro.build.version.magic") || yzaVar.abc.containsKey("ro.build.magic_api_level") || yzaVar.abc.containsKey("ro.magic.systemversion")) {
                    return "EMUI";
                }
            } else if (!yzaVar.abc.containsKey("ro.build.version.emui")) {
                if (!yzaVar.abc.containsKey("ro.build.hw_emui_api_level")) {
                    if (yzaVar.abc.containsKey("ro.confg.hw_systemversion")) {
                        return "EMUI";
                    }
                } else {
                    return "EMUI";
                }
            } else {
                return "EMUI";
            }
            if (!yzaVar.abc.containsKey("ro.miui.ui.version.code") && !yzaVar.abc.containsKey("ro.miui.ui.version.name") && !yzaVar.abc.containsKey("ro.miui.internal.storage")) {
                if (!yzaVar.abc.containsKey("persist.sys.use.flyme.icon") && !yzaVar.abc.containsKey("ro.meizu.setupwizard.flyme") && !yzaVar.abc.containsKey("ro.flyme.published")) {
                    if (!yzaVar.abc.containsKey("ro.build.display.id")) {
                        return "OTHER";
                    }
                    String property = yzaVar.abc.getProperty("ro.build.display.id");
                    if (TextUtils.isEmpty(property) || !property.contains("Flyme")) {
                        return "OTHER";
                    }
                    return "FLYME";
                }
                return "FLYME";
            }
            return "MIUI";
        } catch (Throwable unused) {
            String str = Build.MANUFACTURER;
            if (str == null) {
                return "OTHER";
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            lowerCase.getClass();
            lowerCase.hashCode();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1206476313) {
                if (iHashCode != -759499589) {
                    if (iHashCode == 74224812 && lowerCase.equals("Meizu")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (lowerCase.equals("xiaomi")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (lowerCase.equals("huawei")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                return "EMUI";
            }
            if (b2 == 1) {
                return "MIUI";
            }
            if (b2 != 2) {
                return "OTHER";
            }
            return "FLYME";
        }
    }

    public static Object abc(Class cls, Class[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return null;
        }
        try {
            try {
                return cls.getMethod("get", clsArr).invoke(null, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                abc.warn("failed to invoke method: " + e.getMessage());
                return null;
            }
        } catch (Throwable th) {
            def.abc(th, abc.abc("exception occurred when invoking method: "), abc);
        }
    }

    public static float abc(Context context) {
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        } catch (Throwable unused) {
        }
        if (defaultDisplay == null) {
            return 0.0f;
        }
        defaultDisplay.getRealMetrics(displayMetrics);
        try {
            return (float) Math.sqrt(((float) Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d)) + ((float) Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d)));
        } catch (Exception unused2) {
            return 0.0f;
        }
    }

    public static boolean abc() {
        return Build.MANUFACTURER.equals("HONOR") && Build.VERSION.SDK_INT >= 31;
    }
}
