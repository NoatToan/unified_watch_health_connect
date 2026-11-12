package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.multisimsdk.cardpartmanager.simauth.SimAuthController;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class ocj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44121b = "AuthenHandler";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f44122c = Build.VERSION.SDK_INT;
    private static HashMap<String, String> d = new HashMap<>();

    static boolean a(Context context, AuthParam authParam, Message message) {
        String str = f44121b;
        ocq.e(str, "Start Auth Method");
        if (message == null) {
            ocq.e(str, "Start Auth Method failed, message is null");
            return false;
        }
        if (!e(context, authParam, message) || !oco.a(context, message, authParam.getSlotId())) {
            return false;
        }
        if (!obm.c("android.permission.READ_PHONE_STATE", context)) {
            oco.d(message, 1010);
            ocq.e(str, "Start Authen Method failed, do not has READ_PHONE_STATE permission");
            return false;
        }
        if (2 == authParam.getAuthType()) {
            new oci(context, message).c(new SimAuthController(context).c());
            return true;
        }
        if (3 == authParam.getAuthType()) {
            ocf.a().d(authParam);
            String strE = obf.e(context, authParam.getSlotId());
            if (b(context, strE)) {
                message.obj = oco.b(context, strE, "Tag");
                message.arg1 = 1000;
                oco.a(message);
                ocq.e(str, "Auth token is exist.");
                return true;
            }
            if (!d(context, authParam, message)) {
                return false;
            }
            new ocl(context, authParam, message).startAuthLogin();
            return true;
        }
        oco.d(message, 1011);
        ocq.e(str, "Auth type is invalidate");
        return false;
    }

    private static boolean e(Context context, AuthParam authParam, Message message) {
        if (context == null) {
            oco.d(message, 1013);
            ocq.e(f44121b, "Check is valid input param and network failed, context is null");
            return false;
        }
        if (authParam == null) {
            oco.d(message, 1013);
            ocq.e(f44121b, "Auth param is invalidate");
            return false;
        }
        if (oco.d(context)) {
            return true;
        }
        oco.d(message, 1008);
        ocq.e(f44121b, "Network no Connected");
        return false;
    }

    private static boolean d(Context context, AuthParam authParam, Message message) {
        if (f44122c < 24) {
            oco.d(message, 1014);
            ocq.e(f44121b, "SDK is lower than N");
            return false;
        }
        String strE = obf.e(context, authParam.getSlotId());
        if (strE == null) {
            oco.d(message, 1013);
            ocq.e(f44121b, "getImsi result is null");
            return false;
        }
        if (authParam.getImsi() == null || c(authParam, strE)) {
            return true;
        }
        oco.d(message, 1013);
        ocq.e(f44121b, "Imsi is invalid");
        return false;
    }

    private static boolean c(AuthParam authParam, String str) {
        return str != null && str.equals(authParam.getImsi());
    }

    private static boolean b(Context context, String str) {
        return !TextUtils.isEmpty(oco.b(context, str, "authen_Token"));
    }

    static void e(String str, String str2) {
        ocq.e(f44121b, "setCmccSsoParam");
        if (d == null) {
            d = new HashMap<>();
        }
        d.clear();
        d.put("appid", str);
        d.put("appkey", str2);
    }

    public static HashMap<String, String> e() {
        return d;
    }
}
