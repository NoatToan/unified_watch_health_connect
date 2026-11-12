package defpackage;

import android.app.ActionBar;
import com.huawei.android.app.ActionBarEx;
import com.huawei.hms.framework.common.EmuiUtil;

/* JADX INFO: loaded from: classes3.dex */
public class nos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f43383a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f43384c = -1;
    private static int d;

    public static boolean f() {
        return true;
    }

    public static boolean j() {
        return true;
    }

    static {
        h();
    }

    public static boolean e() {
        return d >= 21;
    }

    public static boolean b() {
        return d >= 17;
    }

    public static boolean d() {
        return f43384c == 50;
    }

    public static boolean c() {
        return f43384c == 60;
    }

    public static boolean a() {
        return f43384c == 81;
    }

    private static void i() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.version.emui");
            if (str != null) {
                if (str.contains("EmotionUI_3.0")) {
                    f43384c = 30;
                    return;
                }
                if (str.contains("EmotionUI_3.1")) {
                    f43384c = 31;
                    return;
                }
                if (str.contains("EmotionUI_4.0")) {
                    f43384c = 40;
                    return;
                }
                if (str.contains("EmotionUI_4.1")) {
                    f43384c = 41;
                } else if (str.contains("EmotionUI_5.0")) {
                    f43384c = 50;
                } else if (str.contains("EmotionUI_6.0")) {
                    f43384c = 60;
                }
            }
        } catch (RuntimeException unused) {
            nox.a("EmuiUtil", "RuntimeException getEmuiType.", true);
        } catch (Exception unused2) {
            nox.a("EmuiUtil", "getEmuiType Exception.", true);
        }
    }

    private static void h() {
        d = g();
        nox.b("EmuiUtil", "getEmuiType emuiVersionCode=" + d, true);
        int i = d;
        if (i >= 15) {
            f43384c = 81;
        } else if (i >= 14) {
            f43384c = 60;
        } else if (i >= 11) {
            f43384c = 50;
        } else if (i >= 10) {
            f43384c = 41;
        } else if (i >= 9) {
            f43384c = 40;
        } else if (i >= 8) {
            f43384c = 31;
        } else if (i >= 7) {
            f43384c = 30;
        }
        if (f43384c == -1) {
            i();
        }
        f43383a = o();
        nox.c("EmuiUtil", " init emui version is" + f43384c + ", hasActionBarEx=" + f43383a, true);
    }

    private static int g() {
        int iIntValue;
        Object objE = npc.e(EmuiUtil.BUILDEX_VERSION, EmuiUtil.EMUI_SDK_INT);
        if (objE != null) {
            try {
                iIntValue = ((Integer) objE).intValue();
            } catch (ClassCastException unused) {
                nox.a("EmuiUtil", "getEMUIVersionCode is not a number", true);
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        nox.b("EmuiUtil", "the emui version code is::" + iIntValue, true);
        return iIntValue;
    }

    private static boolean o() {
        try {
            if (f43384c == -1) {
                return false;
            }
            ActionBarEx.getDragAnimationStage((ActionBar) null);
            return true;
        } catch (Exception unused) {
            nox.a("EmuiUtil", "ActionBarEx class not found: ", true);
            return false;
        }
    }
}
