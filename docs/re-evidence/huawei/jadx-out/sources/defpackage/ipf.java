package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StepCounterSupportUtils;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class ipf {
    public static String[] a(String[] strArr, final Activity activity) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        boolean zAh = qrs.ah(activity);
        boolean zD = lro.d(activity);
        if (arrayList.contains("android.permission.ACTIVITY_RECOGNITION") && zAh && !zD) {
            ReleaseLogUtil.e("Login_ActivityRecognitionRequestDialogUtils", "dealActivityRecognition pad true");
            arrayList.remove("android.permission.ACTIVITY_RECOGNITION");
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        if (!Utils.o() && arrayList.contains("android.permission.ACTIVITY_RECOGNITION")) {
            LogUtil.a("Login_ActivityRecognitionRequestDialogUtils", "permissionList  size ", Integer.valueOf(arrayList.size()));
            arrayList.remove("android.permission.ACTIVITY_RECOGNITION");
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            PermissionUtil.PermissionResult permissionResultD = PermissionUtil.d(activity, new String[]{"android.permission.ACTIVITY_RECOGNITION"});
            if (PermissionUtil.PermissionResult.FOREVER_DENIED.equals(permissionResultD)) {
                ReleaseLogUtil.e("Login_ActivityRecognitionRequestDialogUtils", "ACTIVITY_RECOGNITION is FOREVER_DENIED");
                d();
                return strArr;
            }
            if (PermissionUtil.PermissionResult.GRANTED.equals(permissionResultD)) {
                LogUtil.a("Login_ActivityRecognitionRequestDialogUtils", "ACTIVITY_RECOGNITION is GRANTED");
                return strArr;
            }
            HandlerExecutor.b(new Runnable() { // from class: ipo
                @Override // java.lang.Runnable
                public final void run() {
                    ipf.a(activity);
                }
            });
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Activity activity) {
        BaseDialog baseDialogB;
        if (StepCounterSupportUtils.b(BaseApplication.getContext())) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
            builder.b(R.string.IDS_home_activity_reconnition_guide).c(R.string.IDS_home_activity_reconnition_open, e(activity)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ipk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ipf.d();
                }
            });
            baseDialogB = builder.c();
        } else {
            CustomTextAlertDialog.Builder builder2 = new CustomTextAlertDialog.Builder(activity);
            builder2.a(R.string.IDS_home_activity_reconnition_title).b(R.string.IDS_home_activity_reconnition_text).a(R.string.IDS_home_activity_reconnition_open, e(activity)).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ipn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ipf.d();
                }
            });
            baseDialogB = builder2.b();
        }
        baseDialogB.setCancelable(false);
        baseDialogB.show();
    }

    private static View.OnClickListener e(final Activity activity) {
        return new View.OnClickListener() { // from class: ipm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity2 = activity;
                lsg.a(activity2, new String[]{"android.permission.ACTIVITY_RECOGNITION"}, new PermissionsResultAction() { // from class: ipf.1
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        LogUtil.a("Login_ActivityRecognitionRequestDialogUtils", "ACTIVITY_RECOGNITION onGranted");
                        Intent intent = new Intent();
                        intent.setPackage(BaseApplication.getAppPackage());
                        intent.setAction("com.huawei.health.start_step_counter");
                        activity2.sendBroadcast(intent, SecurityConstant.f5920a);
                        ipf.a(2);
                    }

                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onDenied(String str) {
                        LogUtil.a("Login_ActivityRecognitionRequestDialogUtils", "ACTIVITY_RECOGNITION onDenied");
                        ipf.d();
                    }
                });
            }
        };
    }

    public static void d() {
        SharedPreferenceManager.c(Integer.toString(10000), "HAS_APPLY_ACTIVITY_RECOGNITION", System.currentTimeMillis());
        a(1);
    }

    public static void a(int i) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("from", 2);
        map.put("click_type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HOME_DIALOG_20401108.value(), map, 0);
    }
}
