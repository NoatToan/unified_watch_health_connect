package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f46670a = BaseApplication.getContext();

    public static boolean e() {
        return b() != null && c(BaseApplication.getContext()) >= 761701558;
    }

    private static int c(Context context) {
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo("com.google.android.wearable.app.cn", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("CassiniPairUpdateApp", "getVersionError, NameNotFoundException");
        }
        LogUtil.a("CassiniPairUpdateApp", "wear os version is: ", Integer.valueOf(i));
        return i;
    }

    public static PackageInfo b() {
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        try {
            return packageManager.getPackageInfo("com.google.android.wearable.app.cn", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("CassiniPairUpdateApp", "onClick() androidWearNameCn, error NameNotFoundException.");
            try {
                return packageManager.getPackageInfo("com.google.android.wearable.app", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                LogUtil.e("CassiniPairUpdateApp", "onClick() androidWearName, error NameNotFoundException.");
                return null;
            }
        }
    }

    public static void a(Context context, View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        LogUtil.a("CassiniPairUpdateApp", "Enter installShowDialog.");
        if (context == null) {
            LogUtil.j("CassiniPairUpdateApp", "context is null.");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(BaseApplication.getContext().getResources().getString(R.string.IDS_qrcode_update_experience));
        builder.a(BaseApplication.getContext().getResources().getString(R.string.IDS_qrcode_wear_os_upgrade_content));
        builder.a(BaseApplication.getContext().getResources().getString(R.string.IDS_qrcode_continue_pair), onClickListener);
        builder.b(BaseApplication.getContext().getResources().getString(R.string.IDS_device_to_intelligent_home_linkage_go_to_download), new View.OnClickListener() { // from class: qql.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("CassiniPairUpdateApp", "Enter PositiveButton OK.");
                if (CommonUtil.ab(BaseApplication.getContext())) {
                    if (loj.c(55)) {
                        LogUtil.a("CassiniPairUpdateApp", "Enter gotoChinese");
                        qql.e(qql.f46670a);
                    } else {
                        LogUtil.a("CassiniPairUpdateApp", "Enter gotoOverSea");
                        qql.b(qql.f46670a);
                    }
                } else {
                    qpx.b(BaseApplication.getContext(), BaseApplication.getContext().getString(R.string.CS_network_connect_error));
                }
                View.OnClickListener onClickListener3 = onClickListener2;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                }
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public static void b(Context context, View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        LogUtil.a("CassiniPairUpdateApp", "Enter uninstallShowDialog.");
        if (context == null) {
            LogUtil.j("CassiniPairUpdateApp", "context is null.");
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(BaseApplication.getContext().getResources().getString(R.string.IDS_qrcode_wear_os_down_title));
        builder.a(BaseApplication.getContext().getResources().getString(R.string.IDS_qrcode_wear_os_down_content));
        builder.a(BaseApplication.getContext().getResources().getString(R.string.IDS_settings_button_cancal), onClickListener);
        builder.b(BaseApplication.getContext().getResources().getString(R.string.IDS_device_to_intelligent_home_linkage_go_to_download), new View.OnClickListener() { // from class: qql.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("CassiniPairUpdateApp", "Enter PositiveButton OK.");
                if (CommonUtil.ab(BaseApplication.getContext())) {
                    if (loj.c(55)) {
                        LogUtil.a("CassiniPairUpdateApp", "Enter gotoChinese ");
                        qql.e(qql.f46670a);
                    } else {
                        LogUtil.a("CassiniPairUpdateApp", "Enter gotoOverSea ");
                        qql.b(qql.f46670a);
                    }
                    view.setTag("network_connected");
                } else {
                    view.setTag("network_disconnected");
                    qpx.b(BaseApplication.getContext(), BaseApplication.getContext().getString(R.string.CS_network_connect_error));
                }
                View.OnClickListener onClickListener3 = onClickListener2;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                }
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public static void e(Context context) {
        LogUtil.a("CassiniPairUpdateApp", "enterAppStoreChina():");
        if (context == null) {
            LogUtil.j("CassiniPairUpdateApp", "enterAppStoreChina, mContext is null.");
            return;
        }
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            LogUtil.j("CassiniPairUpdateApp", "enterAppStoreChina, Network is not Connected!");
            qpx.b(context, R.string.CS_network_connect_error);
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.google.android.wearable.app.cn"));
            intent.addFlags(268435456);
            BaseApplication.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("CassiniPairUpdateApp", "EnterAppStoreChina start Wear Os install error.");
            qpx.b(BaseApplication.getContext(), BaseApplication.getContext().getString(R.string.IDS_device_hauwei_watch_download_android_wear_tips));
        }
    }

    public static void b(Context context) {
        LogUtil.a("CassiniPairUpdateApp", "enterAppStoreOversea():");
        if (context == null) {
            LogUtil.j("CassiniPairUpdateApp", "enterAppStoreOversea, mContext is null.");
            return;
        }
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            LogUtil.j("CassiniPairUpdateApp", "enterAppStoreOversea, Network is not Connected!");
            qpx.b(context, R.string.CS_network_connect_error);
            return;
        }
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.google.android.wearable.app"));
            intent.addFlags(268435456);
            BaseApplication.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("CassiniPairUpdateApp", "EnterAppStoreOversea start Wear Os install error.");
            qpx.b(BaseApplication.getContext(), BaseApplication.getContext().getString(R.string.IDS_device_hauwei_watch_download_android_wear_tips));
        }
    }

    public static boolean a(Activity activity) {
        PackageInfo packageInfoB = b();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        if (packageInfoB != null) {
            intent.setPackage(packageInfoB.packageName);
        }
        ResolveInfo next = BaseApplication.getContext().getPackageManager().queryIntentActivities(intent, 0).iterator().next();
        if (next == null) {
            return false;
        }
        String str = next.activityInfo.packageName;
        String str2 = next.activityInfo.name;
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setComponent(new ComponentName(str, str2));
        intent2.setAction("com.android.setupwizard.PARTNER_SETUP");
        if (activity == null) {
            return true;
        }
        try {
            activity.startActivity(intent2);
            return true;
        } catch (ActivityNotFoundException e) {
            LogUtil.e("CassiniPairUpdateApp", "wearOsIntent exception", e.getMessage());
            return true;
        }
    }
}
