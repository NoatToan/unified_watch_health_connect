package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ino;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class ino {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserProfileMgrApi f37870a = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f37871b = false;

    public static void b(int i, Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("SercurityDataCheck", "showUserInfoDialog callback is null");
            return;
        }
        if (!Utils.h()) {
            iBaseResponseCallback.a(0, null);
            return;
        }
        if (context == null) {
            LogUtil.j("SercurityDataCheck", "context is null");
            iBaseResponseCallback.a(0, null);
            return;
        }
        String strA = a(2);
        LogUtil.a("SercurityDataCheck", "showUserInfoDialog data = ", strA);
        if ("true".equals(strA)) {
            iBaseResponseCallback.a(0, null);
            return;
        }
        iog popOutWindowInfo = f37870a.getPopOutWindowInfo(context, "privacy_base_info_");
        int iE = popOutWindowInfo.e();
        long jA = popOutWindowInfo.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE < 3 && jCurrentTimeMillis - jA > Constants.ANALYSIS_EVENT_KEEP_TIME) {
            f37870a.setPopOutWindowInfo(context, "privacy_base_info_");
            if (CommonUtil.ca()) {
                return;
            }
            a(i, context, iBaseResponseCallback);
            return;
        }
        iBaseResponseCallback.a(0, null);
    }

    private static void a(final int i, final Context context, final IBaseResponseCallback iBaseResponseCallback) {
        View viewInflate = View.inflate(context, R.layout.securyty_notify_custom_view_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_two);
        b(LoginInit.getInstance(context).getAccountInfo(1009), (HealthTextView) viewInflate.findViewById(R.id.hw_health_sync_service_desc));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.hw_health_layout_data_sleep);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.hw_health_layout_data_health);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        healthTextView.setText(context.getString(R.string.IDS_hwh_personal_profile_agreement));
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).b(context.getString(R.string.IDS_service_area_notice_title)).a(viewInflate).a(R.string.IDS_common_disagree, new DialogInterface.OnClickListener() { // from class: inu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ino.b(iBaseResponseCallback, i, context, dialogInterface, i2);
            }
        }).d(R.string.IDS_hw_show_agree, new DialogInterface.OnClickListener() { // from class: int
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ino.d(iBaseResponseCallback, context, dialogInterface, i2);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    static /* synthetic */ void b(IBaseResponseCallback iBaseResponseCallback, int i, Context context, DialogInterface dialogInterface, int i2) {
        d(2, false);
        d(300, false);
        iBaseResponseCallback.a(0, null);
        if (i == 2 || i == 3) {
            qpx.b(context, R.string.IDS_hw_me_userinfo_huawei_cloud_data_sync);
        }
        e(context, AnalyticsValue.HEALTH_PER_INFO_DATA_SWITCH_2040052.value(), "0");
    }

    static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, Context context, DialogInterface dialogInterface, int i) {
        d(2, true);
        d(300, true);
        iBaseResponseCallback.a(0, null);
        e(context, AnalyticsValue.HEALTH_PER_INFO_DATA_SWITCH_2040052.value(), "1");
    }

    public static void b(Context context) {
        if (Utils.h()) {
            if (context == null) {
                LogUtil.j("SercurityDataCheck", "context is null");
                return;
            }
            boolean[] zArrD = d(context);
            if (zArrD[1]) {
                SharedPreferenceManager.e(context, Integer.toString(10006), "health_data_record_health_agree", "false", new StorageParams());
            } else {
                SharedPreferenceManager.e(context, Integer.toString(10006), "health_data_record_health_agree", "true", new StorageParams());
            }
            if (zArrD[0] && zArrD[1]) {
                return;
            }
            iog popOutWindowInfo = f37870a.getPopOutWindowInfo(context, "privacy_sport_data_");
            int iE = popOutWindowInfo.e();
            long jA = popOutWindowInfo.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            iog popOutWindowInfo2 = f37870a.getPopOutWindowInfo(context, "privacy_health_data_");
            int iE2 = popOutWindowInfo2.e();
            long jA2 = popOutWindowInfo2.a();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            boolean z = !zArrD[0] && iE < 3 && jCurrentTimeMillis - jA > Constants.ANALYSIS_EVENT_KEEP_TIME;
            boolean z2 = !zArrD[1] && iE2 < 3 && jCurrentTimeMillis2 - jA2 > Constants.ANALYSIS_EVENT_KEEP_TIME;
            if (z || z2) {
                View viewInflate = View.inflate(context, R.layout.securyty_notify_custom_view_dialog, null);
                b(context, viewInflate, z, z2);
                e(context, zArrD, viewInflate, z, z2);
            }
        }
    }

    private static void b(Context context, View view, boolean z, boolean z2) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.hw_health_layout_data_sport);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.hw_health_layout_data_sleep);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.hw_health_layout_data_health);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.hw_health_sync_service_desc);
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1009);
        b(accountInfo, healthTextView);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_four);
        linearLayout.setVisibility(z ? 0 : 8);
        linearLayout2.setVisibility(8);
        linearLayout3.setVisibility(z2 ? 0 : 8);
        if (linearLayout.getVisibility() == 0) {
            c(context, accountInfo, (HealthTextView) linearLayout.findViewById(R.id.hw_health_service_item_two));
            f37870a.setPopOutWindowInfo(context, "privacy_sport_data_");
        }
        if (linearLayout3.getVisibility() == 0) {
            a(context, accountInfo, healthTextView2);
            f37870a.setPopOutWindowInfo(context, "privacy_health_data_");
        }
    }

    private static void e(final Context context, final boolean[] zArr, View view, final boolean z, final boolean z2) {
        f37871b = true;
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).a(view).a(R.string.IDS_common_disagree, new DialogInterface.OnClickListener() { // from class: inm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ino.d(zArr, z, z2, context, dialogInterface, i);
            }
        }).d(R.string.IDS_hw_show_agree, new DialogInterface.OnClickListener() { // from class: inn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ino.e(zArr, z, z2, context, dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return;
        }
        customAlertDialogB.show();
    }

    static /* synthetic */ void d(boolean[] zArr, boolean z, boolean z2, Context context, DialogInterface dialogInterface, int i) {
        f37871b = false;
        if (!zArr[0] && z) {
            d(3, false);
        }
        if (!zArr[1] && z2) {
            d(7, false);
        }
        d(301, false);
        e(context, AnalyticsValue.HEALTH_SPORT_SYNC_DATA_SWITCH_2040051.value(), "0");
    }

    static /* synthetic */ void e(boolean[] zArr, boolean z, boolean z2, Context context, DialogInterface dialogInterface, int i) {
        f37871b = false;
        if (!zArr[0] && z) {
            d(3, true);
        }
        if (!zArr[1] && z2) {
            d(7, true);
        }
        d(301, true);
        e(context, AnalyticsValue.HEALTH_SPORT_SYNC_DATA_SWITCH_2040051.value(), "1");
    }

    public static void e(Context context) {
        if (LoginInit.getInstance(context).isBrowseMode()) {
            LogUtil.a("SercurityDataCheck", "showHealthDataSyncPrivacyDialog LoginInit isBrowseMode");
            return;
        }
        if (!Utils.h()) {
            LogUtil.a("SercurityDataCheck", "showHealthDataSyncPrivacyDialog Utils.ifAllowLogin false");
            return;
        }
        if (context == null) {
            LogUtil.j("SercurityDataCheck", "context == null");
            return;
        }
        if ("true".equals(SharedPreferenceManager.e(context, Integer.toString(10006), "health_data_record_health_agree"))) {
            LogUtil.a("SercurityDataCheck", "showHealthDataSyncPrivacyDialog health_data_record_health_agree is true");
            return;
        }
        if ("true".equals(SharedPreferenceManager.e(context, Integer.toString(10025), "privacy_data_already_show_agree"))) {
            LogUtil.a("SercurityDataCheck", "showHealthDataSyncPrivacyDialog privacy_data_already_show_agree is true");
            return;
        }
        if (d(context)[1]) {
            LogUtil.a("SercurityDataCheck", "showHealthDataSyncPrivacyDialog isStatus is true");
            return;
        }
        c(context);
        if (CommonUtil.ca()) {
            return;
        }
        a(context);
    }

    private static void c(Context context) {
        iog popOutWindowInfo = f37870a.getPopOutWindowInfo(context, "privacy_health_data_");
        int iE = popOutWindowInfo.e();
        long jA = popOutWindowInfo.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE < 3 && jCurrentTimeMillis - jA > Constants.ANALYSIS_EVENT_KEEP_TIME) {
            f37870a.setPopOutWindowInfo(context, "privacy_health_data_");
        } else {
            LogUtil.j("SercurityDataCheck", "setPopOutWindowTimesMgr times is over or timestamp is too short");
        }
    }

    private static void a(final Context context) {
        View viewInflate = View.inflate(context, R.layout.securyty_notify_custom_view_dialog, null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.hw_health_layout_data_sport);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.hw_health_layout_data_health);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.hw_health_layout_data_sleep);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_four);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_sync_service_desc);
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1009);
        b(accountInfo, healthTextView2);
        linearLayout.setVisibility(8);
        linearLayout3.setVisibility(8);
        linearLayout2.setVisibility(0);
        a(context, accountInfo, healthTextView);
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).b(context.getString(R.string.IDS_service_area_notice_title)).a(viewInflate).a(R.string.IDS_common_disagree, new DialogInterface.OnClickListener() { // from class: com.huawei.health.userprofile.privacy.SercurityDataCheck$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ino.b(context, dialogInterface, i);
            }
        }).d(R.string.IDS_hw_show_agree, new DialogInterface.OnClickListener() { // from class: com.huawei.health.userprofile.privacy.SercurityDataCheck$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ino.e(context, dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public static /* synthetic */ void b(Context context, DialogInterface dialogInterface, int i) {
        SharedPreferenceManager.e(context, Integer.toString(10025), "privacy_data_already_show_agree", "true", new StorageParams());
        d(301, false);
        LogUtil.a("SercurityDataCheck", "showHealthDataSyncPrivacyCustomDialog Disagree");
    }

    public static /* synthetic */ void e(Context context, DialogInterface dialogInterface, int i) {
        SharedPreferenceManager.e(context, Integer.toString(10025), "privacy_data_already_show_agree", "true", new StorageParams());
        d(7, true);
        d(301, true);
        LogUtil.a("SercurityDataCheck", "showHealthDataSyncPrivacyCustomDialog Agree");
    }

    public static void c(Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (!Utils.h()) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
                return;
            }
            return;
        }
        if (context == null) {
            LogUtil.j("SercurityDataCheck", "context == null");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
                return;
            }
            return;
        }
        if (d(context)[1]) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, null);
                return;
            }
            return;
        }
        iog popOutWindowInfo = f37870a.getPopOutWindowInfo(context, "privacy_health_data_");
        int iE = popOutWindowInfo.e();
        long jA = popOutWindowInfo.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE < 3 && jCurrentTimeMillis - jA > Constants.ANALYSIS_EVENT_KEEP_TIME) {
            f37870a.setPopOutWindowInfo(context, "privacy_health_data_");
            a(context, iBaseResponseCallback);
        } else if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, null);
        }
    }

    private static void a(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        View viewInflate = View.inflate(context, R.layout.securyty_notify_custom_view_dialog, null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.hw_health_layout_data_sport);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.hw_health_layout_data_health);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.hw_health_layout_data_sleep);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_four);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_sync_service_desc);
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1009);
        b(accountInfo, healthTextView2);
        linearLayout.setVisibility(8);
        linearLayout3.setVisibility(8);
        linearLayout2.setVisibility(0);
        a(context, accountInfo, healthTextView);
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).b(context.getString(R.string.IDS_service_area_notice_title)).a(viewInflate).a(R.string.IDS_common_disagree, new DialogInterface.OnClickListener() { // from class: inp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ino.a(iBaseResponseCallback, dialogInterface, i);
            }
        }).d(R.string.IDS_hw_show_agree, new DialogInterface.OnClickListener() { // from class: inq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ino.c(iBaseResponseCallback, dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, DialogInterface dialogInterface, int i) {
        d(301, false);
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, null);
        }
    }

    static /* synthetic */ void c(IBaseResponseCallback iBaseResponseCallback, DialogInterface dialogInterface, int i) {
        d(7, true);
        d(301, true);
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, null);
        }
    }

    private static boolean[] d(Context context) {
        String strA = a(3);
        String strA2 = a(7);
        LogUtil.a("SercurityDataCheck", "readPersonalPrivacySettingValue 01 is", strA, " 03 status", strA2);
        return new boolean[]{"true".equals(strA), "true".equals(strA2)};
    }

    private static void e(Context context, String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("agree", str2);
        }
        lmf.d().c(context, str, map, 0);
    }

    private static String a(int i) {
        ioi ioiVarD = ioi.d();
        if (i == 6) {
            return ioiVarD.c(7);
        }
        return ioiVarD.c(i);
    }

    private static void d(int i, boolean z) {
        LogUtil.a("SercurityDataCheck", "setPersonalPrivacySettingValue... privacyId = ", Integer.valueOf(i), ", isOpen = ", Boolean.valueOf(z));
        ioi.d().e(i, z, String.valueOf(i), new IBaseResponseCallback() { // from class: ino.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == 0) {
                    LogUtil.a("SercurityDataCheck", "onResponse setUserPrivacy success");
                } else {
                    LogUtil.e("SercurityDataCheck", "onResponse setUserPrivacy failure");
                }
            }
        });
    }

    private static void b(String str, HealthTextView healthTextView) {
        if (String.valueOf(7).equals(str)) {
            healthTextView.setVisibility(0);
        }
    }

    private static void a(Context context, String str, HealthTextView healthTextView) {
        if (String.valueOf(7).equals(str)) {
            healthTextView.setText(context.getString(R.string.IDS_hwh_privacy_dialog_health_privacy_desc));
        } else if (!Utils.o()) {
            healthTextView.setText(context.getString(R.string.IDS_hwh_user_health_agreement_china));
        } else {
            healthTextView.setText(context.getString(R.string.IDS_hwh_user_health_agreement_oversea_blood_oxygen));
        }
    }

    private static void c(Context context, String str, HealthTextView healthTextView) {
        if (String.valueOf(7).equals(str)) {
            healthTextView.setText(context.getString(R.string.IDS_hwh_privacy_dialog_fitness_privacy_desc));
        } else {
            healthTextView.setText(context.getString(R.string.IDS_hwh_user_fitness_agreement));
        }
    }
}
