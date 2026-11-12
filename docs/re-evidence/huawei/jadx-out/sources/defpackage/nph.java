package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class nph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f43397a = "";

    public static String e() {
        String str = Build.MODEL;
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    public static String d(Context context) {
        String string;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "unified_device_name");
        } catch (Throwable th) {
            nox.e("TerminalInfo", "Settings.Global Exception = " + th.getClass().getSimpleName(), true);
            string = null;
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string.trim())) {
            return string;
        }
        String strQ = nom.q();
        if (!TextUtils.isEmpty(strQ)) {
            return strQ;
        }
        String str = Build.MODEL;
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }

    public static String d() {
        if (TextUtils.isEmpty(f43397a)) {
            String string = UUID.randomUUID().toString();
            f43397a = string;
            if (TextUtils.isEmpty(string)) {
                return "NULL";
            }
        }
        return f43397a;
    }

    public static String a(Context context) {
        nox.b("TerminalInfo", "generateUuid start.", true);
        String strA = nnu.a(context).a("UUID", "");
        if (TextUtils.isEmpty(strA)) {
            nox.b("TerminalInfo", "deviceId is null.", true);
            return e(context);
        }
        if (!"{{001}}".equalsIgnoreCase(SafeString.substring(strA, 0, 7))) {
            return e(context);
        }
        return SafeString.substring(strA, 7);
    }

    private static String e(Context context) {
        String str;
        String strD = d();
        if ("NULL".equalsIgnoreCase(strD)) {
            str = strD;
        } else {
            str = "{{001}}" + strD;
        }
        nnu.a(context).d("UUID", str);
        return strD;
    }
}
