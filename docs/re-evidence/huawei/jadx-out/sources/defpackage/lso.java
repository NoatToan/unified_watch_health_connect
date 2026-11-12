package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lso {
    public static void d(Context context, boolean z, e eVar) {
        if (context == null) {
            LogUtil.j("PhoneStateUtils", "setPhoneStateListener context is null");
            return;
        }
        if (eVar == null) {
            LogUtil.j("PhoneStateUtils", "setPhoneStateListener listener is null");
            return;
        }
        LogUtil.a("PhoneStateUtils", "setPhoneStateListener isListen = ", Boolean.valueOf(z));
        Object systemService = context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            if (z) {
                d(context, telephonyManager, eVar);
            } else {
                telephonyManager.listen(eVar, 0);
            }
        }
    }

    private static void d(Context context, final TelephonyManager telephonyManager, final e eVar) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31) {
            telephonyManager.listen(eVar, 32);
            return;
        }
        if (PermissionUtil.b(context, new String[]{"android.permission.READ_PHONE_STATE"})) {
            telephonyManager.listen(eVar, 32);
            return;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = BaseApplication.getActivity();
        }
        eVar.b();
        PermissionUtil.a(activity, new String[]{"android.permission.READ_PHONE_STATE"}, new PermissionsResultAction() { // from class: lso.2
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("R_PhoneStateUtils", "setTelephonyListen onGranted");
                telephonyManager.listen(eVar, 32);
                eVar.e();
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("R_PhoneStateUtils", "setTelephonyListen onDenied");
                eVar.e();
            }
        });
    }

    public static class e extends PhoneStateListener {
        public void b() {
        }

        public void e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
        }
    }
}
