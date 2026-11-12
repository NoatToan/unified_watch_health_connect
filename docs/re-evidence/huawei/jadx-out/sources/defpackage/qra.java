package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.KeyValDbManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public class qra {
    public static boolean a() {
        Context context = BaseApplication.getContext();
        if (!Utils.h()) {
            return false;
        }
        String strC = KeyValDbManager.d(context).c("key_profile_sync_user_info_complete_" + nio.a(""));
        LogUtil.a("ProfileUtil", "isSyncComplete value=", strC);
        return String.valueOf(true).equalsIgnoreCase(strC);
    }

    public static void c(boolean z) {
        Context context = BaseApplication.getContext();
        if (Utils.h()) {
            LogUtil.a("ProfileUtil", "setSyncComplete isComplete=", Boolean.valueOf(z));
            KeyValDbManager.d(context).c("key_profile_sync_user_info_complete_" + nio.a(""), String.valueOf(z), null);
        }
    }

    public static boolean b() {
        if (Utils.h() && !a()) {
            LogUtil.j("ProfileUtil", "canShowSettingDialog isSyncComplete false");
            return false;
        }
        if (e("key_profile_setting_dialog_show_count_") >= 2) {
            return false;
        }
        long jD = d();
        return jD == 0 || System.currentTimeMillis() - jD > 2592000000L;
    }

    public static boolean c() {
        if (Utils.h() && !a()) {
            LogUtil.j("ProfileUtil", "canShowSettingDialog isSyncComplete false");
            return false;
        }
        if (e("key_person_info_setting_dialog_show_count_") >= 2) {
            return false;
        }
        LogUtil.a("ProfileUtil", "canShowSettingDialog isSyncComplete true");
        return true;
    }

    public static int e(String str) {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c(str + nio.a(""));
        LogUtil.a("ProfileUtil", "getShowCount showCount=", strC);
        if (TextUtils.isEmpty(strC)) {
            return 0;
        }
        try {
            return Integer.parseInt(strC);
        } catch (NumberFormatException e) {
            LogUtil.e("ProfileUtil", "getShowCount e=", ExceptionUtils.c(e));
            return 0;
        }
    }

    public static long d() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("key_profile_setting_dialog_last_show_time_" + nio.a(""));
        LogUtil.a("ProfileUtil", "getLastShowTime lastShowTime=", strC);
        if (TextUtils.isEmpty(strC)) {
            return 0L;
        }
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException e) {
            LogUtil.e("ProfileUtil", "getLastShowTime e=", ExceptionUtils.c(e));
            return 0L;
        }
    }

    public static void b(Context context, IBaseResponseCallback iBaseResponseCallback) {
        c(context, true, iBaseResponseCallback);
    }

    public static void c(Context context, boolean z, IBaseResponseCallback iBaseResponseCallback, int i) {
        CustomTextAlertDialog.Builder builderC = c(context, z, iBaseResponseCallback);
        if (builderC != null) {
            builderC.c().setTextColor(i);
            builderC.a().setTextColor(i);
        }
    }

    private static CustomTextAlertDialog.Builder c(final Context context, final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        if (z && !b()) {
            LogUtil.j("ProfileUtil", "showSettingDialog canShowSettingDialog false");
            e(iBaseResponseCallback, -2);
            return null;
        }
        if (!(context instanceof Activity)) {
            LogUtil.j("ProfileUtil", "showSettingDialog not activity");
            e(iBaseResponseCallback, -3);
            return null;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        CustomTextAlertDialog.Builder builderA = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_profile_dialog_title).b(R.string.IDS_hw_health_user_profile_not_set_tips).e(R.string.IDS_profile_set_later, new View.OnClickListener() { // from class: qra.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ProfileUtil", "showSettingDialog cancel");
                qra.c(context, AnalyticsValue.WEIGHT_INPUT_DATA_2160126.value(), -1);
                if (z) {
                    qra.e();
                }
            }
        }).a(R.string.IDS_hw_health_user_profile_go_setting, new View.OnClickListener() { // from class: qra.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName(context, KakaConstants.USER_INFO_URL);
                qra.c(context, AnalyticsValue.WEIGHT_INPUT_DATA_2160126.value(), 1);
                intent.setPackage(context.getPackageName());
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    LogUtil.j("ProfileUtil", "showSettingDialog resolveActivity == null");
                    return;
                }
                atomicBoolean.set(false);
                LogUtil.a("ProfileUtil", "showSettingDialog setting");
                if (z) {
                    qra.e();
                }
                try {
                    ((Activity) context).startActivityForResult(intent, 1);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("ProfileUtil", "StartUserInfoActivity exception", e.getMessage());
                }
            }
        });
        c(context, AnalyticsValue.WEIGHT_INPUT_DATA_2160126.value(), 0);
        CustomTextAlertDialog customTextAlertDialogB = builderA.b();
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        customTextAlertDialogB.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qqx
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                qra.c(atomicBoolean, iBaseResponseCallback, dialogInterface);
            }
        });
        customTextAlertDialogB.show();
        return builderA;
    }

    static /* synthetic */ void c(AtomicBoolean atomicBoolean, IBaseResponseCallback iBaseResponseCallback, DialogInterface dialogInterface) {
        boolean z = atomicBoolean.get();
        ReleaseLogUtil.d("ProfileUtil", "isCancelDialog ", Boolean.valueOf(z));
        e(iBaseResponseCallback, z ? -1 : 0);
    }

    public static void c(Context context, String str, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(context, str, map, 0);
    }

    public static void e() {
        int i;
        Context context = BaseApplication.getContext();
        String strA = nio.a("");
        KeyValDbManager keyValDbManagerD = KeyValDbManager.d(context);
        keyValDbManagerD.c("key_profile_setting_dialog_last_show_time_" + strA, String.valueOf(System.currentTimeMillis()), null);
        String str = "key_profile_setting_dialog_show_count_" + strA;
        String strC = keyValDbManagerD.c(str);
        LogUtil.a("ProfileUtil", "updateShowCountAndTime count=", strC);
        if (TextUtils.isEmpty(strC)) {
            keyValDbManagerD.c(str, Integer.toString(1), null);
            return;
        }
        try {
            i = Integer.parseInt(strC);
        } catch (NumberFormatException e) {
            LogUtil.e("ProfileUtil", "updateShowCountAndTime e=", ExceptionUtils.c(e));
            i = 0;
        }
        keyValDbManagerD.c(str, Integer.toString(i + 1), null);
    }

    private static void e(IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, null);
        }
    }
}
