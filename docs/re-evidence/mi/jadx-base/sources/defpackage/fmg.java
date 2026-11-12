package defpackage;

import android.app.Application;
import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.util.ResUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.exception.NfcException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public class fmg {
    public static String a(String str) {
        return (!TextUtils.isEmpty(str) && str.contains(AppUtil.getApp().getString(o0j.M))) ? str.replace(AppUtil.getApp().getString(o0j.M), AppUtil.getApp().getString(o0j.f28616b)) : str;
    }

    public static String b(int i) {
        Application app = AppUtil.getApp();
        switch (i) {
            case 1007009:
            case 1007010:
                return app.getString(o0j.h5);
            case 1010033:
                return ResUtils.getString(app, "error_reboot");
            case 1090001:
                return ResUtils.getString(app, "error_server");
            default:
                return null;
        }
    }

    public static String c(Throwable th) {
        int i;
        String message;
        if (th instanceof AuthApiException) {
            AuthApiException authApiException = (AuthApiException) th;
            i = authApiException.mErrorCode;
            message = b(i);
            if (TextUtils.isEmpty(message)) {
                message = authApiException.mErrorMsg;
            }
        } else {
            i = 0;
            if (th instanceof TimeoutException) {
                message = AppUtil.getApp().getString(o0j.D2);
            } else {
                message = th instanceof NfcException ? th.getMessage() : null;
            }
        }
        if (TextUtils.isEmpty(message)) {
            message = th.getMessage();
        }
        if (TextUtils.isEmpty(message)) {
            message = ErrorCode.findText(AppUtil.getApp(), i);
        }
        return !TextUtils.isEmpty(message) ? a(message) : message;
    }

    public static String d(String str) {
        if (f()) {
            return AppUtil.getApp().getString(o0j.j5);
        }
        if (TextUtils.isEmpty(str)) {
            return AppUtil.getApp().getString(o0j.t2);
        }
        if (!str.contains("(02")) {
            return str;
        }
        String[] strArrSplit = str.split("\\)");
        return strArrSplit.length >= 2 ? AppUtil.getApp().getString(o0j.D, strArrSplit[0]) : AppUtil.getApp().getString(o0j.D, str);
    }

    public static String e(Throwable th) {
        return d(th.getMessage());
    }

    public static boolean f() {
        return !((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()).isDeviceConnected();
    }
}
