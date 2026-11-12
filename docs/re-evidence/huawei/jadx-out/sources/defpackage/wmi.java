package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.main.api.CloudAuthApi;
import com.huawei.health.main.model.AppLangItem;
import com.huawei.hihealth.api.SyncApi;
import com.huawei.hihealth.util.HealthSyncUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomButtonMenuDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider;
import com.huawei.ui.main.stories.me.activity.DeregisterServiceActivity;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wmi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f52186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CloudAuthApi f52187c;
    private Activity d;
    private wjo e;
    private View h;
    private Context i;
    private boolean j;
    private String k;
    private CommonDialog21 m;
    private boolean l = false;
    private boolean g = false;
    private Handler f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<AppLangItem> f52185a = new ArrayList(10);

    public wmi(Context context, Activity activity, IBaseResponseCallback iBaseResponseCallback) {
        this.i = context;
        this.d = activity;
        this.f52186b = iBaseResponseCallback;
        this.j = LoginInit.getInstance(context).isBrowseMode();
        m();
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public void j() {
        CustomButtonMenuDialog customButtonMenuDialogC;
        Context context = this.i;
        if (context == null) {
            LogUtil.j("HealthServiceController", "showStopServiceDialog context is null");
            return;
        }
        SharedPreferenceManager.e(context, Integer.toString(10000), "stop_hihealth_and_clean_data", "", new StorageParams());
        CustomButtonMenuDialog.Builder builder = new CustomButtonMenuDialog.Builder(this.i);
        if (this.j || Utils.k()) {
            customButtonMenuDialogC = c(builder);
        } else {
            customButtonMenuDialogC = b(builder);
        }
        if (customButtonMenuDialogC.isShowing()) {
            return;
        }
        customButtonMenuDialogC.show();
    }

    private CustomButtonMenuDialog c(CustomButtonMenuDialog.Builder builder) {
        return builder.c(R.string.IDS_deregister_service_title).a(R.string.IDS_deregister_service_dialog_content).a(R.string.IDS_hwh_privacy_stop_service, new View.OnClickListener() { // from class: wmi.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.e(wmi.this.i, Integer.toString(10000), "stop_hihealth_and_clean_data", "stop_hihealth", new StorageParams());
                wmi.this.r();
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: wmi.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HealthServiceController", "showBrowseModeDialog onClick to cancel button");
            }
        }).d();
    }

    private CustomButtonMenuDialog b(CustomButtonMenuDialog.Builder builder) {
        return builder.c(R.string.IDS_deregister_service_title).e(c(this.i)).a(R.string.IDS_hwh_privacy_stop_service, new View.OnClickListener() { // from class: wmi.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.e(wmi.this.i, Integer.toString(10000), "stop_hihealth_and_clean_data", "stop_hihealth", new StorageParams());
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put(OpAnalyticsConstants.STOP_SERVICE_CLICK, "1");
                OpAnalyticsUtil.getInstance().setEventWithReportImmediately(OperationKey.HEALTH_APP_USER_DERIGISTER_SERVICE_2129033.value(), linkedHashMap);
                wmi.this.d();
            }
        }).a(R.string.IDS_deregister_service_button, new View.OnClickListener() { // from class: wmi.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.e(wmi.this.i, Integer.toString(10000), "stop_hihealth_and_clean_data", "stop_hihealth_and_clean_data", new StorageParams());
                wmi.this.e();
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put(OpAnalyticsConstants.DERIGISTER_SERVICE_CLICK, "1");
                OpAnalyticsUtil.getInstance().setEventWithReportImmediately(OperationKey.HEALTH_APP_USER_DERIGISTER_SERVICE_2129033.value(), linkedHashMap);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: wmi.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HealthServiceController", "showAccountModeDialog onClick to cancel button");
            }
        }).d();
    }

    private SpannableString c(Context context) {
        String string = LoginInit.getInstance(this.i).isMinorAccount() ? context.getString(R.string.IDS_deregister_notice1_kid) : context.getString(R.string.IDS_deregister_notice1, n());
        SpannableString spannableString = new SpannableString(context.getString(R.string.IDS_deregister_service_dialog_content_new, string));
        int iIndexOf = spannableString.toString().indexOf(string);
        if (iIndexOf != -1) {
            b(spannableString, iIndexOf, spannableString.length());
        }
        return spannableString;
    }

    private String n() {
        int i;
        if (Utils.o()) {
            if (irz.j()) {
                i = R.string.IDS_deregister_benefits_oversea;
            } else {
                i = R.string.IDS_deregister_notice_2_detail_part_russia;
            }
        } else {
            i = R.string.IDS_deregister_benefits_china;
        }
        return this.i.getString(i);
    }

    private void b(SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new StyleSpan(1), i, i2, 18);
        spannableString.setSpan(new ForegroundColorSpan(qre.e(R.color.doctor_card_message_text_color)), i, i2, 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        SharedPreferenceManager.e(this.i, Integer.toString(10000), "agr_authorized_versions", "", new StorageParams());
        iox.e("2");
        if (Utils.o()) {
            new wmu.b(this.i, this.d).e();
        } else {
            new wms(this.d).e(this.i);
        }
    }

    public void e() {
        if (e(this.i, R.string.IDS_hw_weight_wifi_cloud_data_outh_dialog_msg)) {
            return;
        }
        LogUtil.a("HealthServiceController", "clearCloudData to enter");
        o();
    }

    public boolean e(final Context context, int i) {
        if (!ean.e()) {
            return false;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.i).a(R.string.IDS_hw_health_show_common_dialog_title).b(i).a(R.string.IDS_hw_weight_wifi_outh_dialog_unbind_buttom, new View.OnClickListener() { // from class: wmi.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                wmi.this.e(10);
                ean.e(context);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: wmi.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                wmi.this.e(11);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
        return true;
    }

    private void o() {
        int i;
        String string;
        View viewInflate = View.inflate(this.i, R.layout.dialog_clear_user_data, null);
        this.h = viewInflate;
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.hw_health_clear_cloud_data_item_two_lyt);
        LinearLayout linearLayout2 = (LinearLayout) this.h.findViewById(R.id.hw_health_clear_cloud_data_item_three_lyt);
        LinearLayout linearLayout3 = (LinearLayout) this.h.findViewById(R.id.hw_health_deregister_notice_lyt);
        HealthTextView healthTextView = (HealthTextView) this.h.findViewById(R.id.hw_health_deregister_notice);
        Context context = this.i;
        if (Utils.o()) {
            i = irz.j() ? R.string.IDS_deregister_benefits_oversea : R.string.IDS_deregister_notice_2_detail_part_russia;
        } else {
            i = R.string.IDS_deregister_benefits_china;
        }
        String string2 = context.getString(i);
        if (LoginInit.getInstance(this.i).isMinorAccount()) {
            string = this.i.getString(R.string.IDS_deregister_notice2_kid);
        } else {
            string = this.i.getString(R.string.IDS_deregister_notice2, string2);
        }
        SpannableString spannableString = new SpannableString(string);
        b(spannableString, 0, spannableString.length());
        healthTextView.setText(spannableString);
        linearLayout3.setVisibility(this.g ? 8 : 0);
        if (Utils.o()) {
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(0);
        }
        b(this.h);
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.i).b(this.i.getString(R.string.IDS_settings_restore_factory_settings_dialog_title)).a(this.h).d(R.string.IDS_device_privacy_clear, new DialogInterface.OnClickListener() { // from class: wmg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f52181b.c(dialogInterface, i2);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: wmk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.e.b(dialogInterface, i2);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        IBaseResponseCallback iBaseResponseCallback;
        if (this.g && (iBaseResponseCallback = this.f52186b) != null) {
            iBaseResponseCallback.a(12, null);
        } else {
            d();
        }
        d(AnalyticsValue.HEALTH_MINE_SETTING_PRIVACY_CLEAR_ALL_DATA_2040040.value(), "1");
        this.h = null;
    }

    /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        e(13);
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        IBaseResponseCallback iBaseResponseCallback;
        if (this.g && (iBaseResponseCallback = this.f52186b) != null) {
            iBaseResponseCallback.a(i, null);
        }
        d(AnalyticsValue.HEALTH_MINE_SETTING_PRIVACY_CLEAR_ALL_DATA_2040040.value(), "2");
    }

    private void b(View view) {
        String string = this.i.getString(this.g ? R.string.IDS_hw_privacy_item_four : R.string.IDS_deregister_privacy_item_four);
        SpannableString spannableString = new SpannableString(this.i.getString(R.string.IDS_hw_privacy_verify_content2, AppInfoUtils.a(), string));
        int iIndexOf = spannableString.toString().indexOf(string);
        if (iIndexOf == -1) {
            return;
        }
        b(spannableString, iIndexOf, spannableString.length());
        ((HealthTextView) view.findViewById(R.id.hw_health_clear_cloud_data_content)).setText(spannableString);
    }

    private void d(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.i, str, map, 0);
    }

    private void a(final boolean z) {
        q();
        LogUtil.a("HealthServiceController", "clearAllPersonalData to enter ");
        if (!z) {
            b(this.f52185a);
        }
        final wmq wmqVarA = wmq.a(this.i);
        wmqVarA.e(Boolean.valueOf(z), new IBaseResponseCallback() { // from class: wmi.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HealthServiceController", "clearAllPersonalData onResponse errorCode:", Integer.valueOf(i));
                wmi.this.h();
                if (!z) {
                    wmi.this.r();
                }
                if (i == 0) {
                    wmi.this.a(z, wmqVarA);
                } else if (i == 30008) {
                    wmi.this.a(R.string.IDS_deregister_delete_alluser_profile_error);
                } else {
                    wmi.this.k();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, wmq wmqVar) {
        IBaseResponseCallback iBaseResponseCallback;
        if (this.g && (iBaseResponseCallback = this.f52186b) != null) {
            iBaseResponseCallback.a(14, null);
        } else {
            d(wmqVar, (Utils.o() || LoginInit.getInstance(BaseApplication.getContext()).isKidAccount()) ? false : true);
        }
        i();
        if (!z) {
            HandlerExecutor.c(new Runnable() { // from class: wmm
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b();
                }
            });
            HandlerCenter.a().d(new Runnable() { // from class: wmp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52197b.c();
                }
            }, 500L);
        } else {
            a(R.string.IDS_music_management_operation_success);
        }
    }

    /* synthetic */ void b() {
        q();
        ProcessUtil.a();
    }

    private void i() {
        try {
            HealthSyncUtil.a(SyncApi.HEALTH_LIFE, true, new ResponseCallback() { // from class: wmn
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("HealthServiceController", "cleanHealthModule onComplete resultCode:", Integer.valueOf(i));
                }
            });
        } catch (IllegalArgumentException e) {
            LogUtil.e("HealthServiceController", "cleanHealthModule onResponse exception:", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: wmi$14, reason: invalid class name */
    class AnonymousClass14 implements ResponseCallback<int[]> {
        AnonymousClass14() {
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, int[] iArr) {
            ReleaseLogUtil.d("HealthServiceController", "clearAppDataAsync Complete status:", Integer.valueOf(i), " statuses:", iArr);
            HandlerExecutor.c(new Runnable() { // from class: wml
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52196a.c();
                }
            });
            SharedPreferenceManager.a("deregistered_service_and_clean_data", "deregistered_service_and_clean_data", "true");
            wmi wmiVar = wmi.this;
            wmiVar.e(wmiVar.i);
            wmi wmiVar2 = wmi.this;
            wmiVar2.b(wmiVar2.i);
        }

        /* synthetic */ void c() {
            wmi.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c() {
        xjl.c.b(new AnonymousClass14());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        a(R.string.IDS_music_management_operation_failed);
    }

    public void d(wmq wmqVar, boolean z) {
        if (wmqVar == null) {
            LogUtil.e("HealthServiceController", "setDefaultUserPrivacy is error");
            return;
        }
        wmqVar.a(2, false);
        wmqVar.a(3, false);
        wmqVar.a(6, false);
        wmqVar.a(7, false);
        wmqVar.a(202, false);
        wmqVar.a(203, false);
        wmqVar.a(10, false);
        wmqVar.a(12, z);
        wmqVar.a(16, false);
        wmqVar.a(11, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        if (this.d.isFinishing()) {
            LogUtil.j("HealthServiceController", "showToast activity is null or is not running");
        } else {
            this.d.runOnUiThread(new Runnable() { // from class: wmi.4
                @Override // java.lang.Runnable
                public void run() {
                    qpx.e(wmi.this.i, i);
                }
            });
        }
    }

    private void q() {
        if (this.m == null) {
            new CommonDialog21(this.i, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this.i);
            this.m = commonDialog21B;
            commonDialog21B.b(this.i.getString(R.string.IDS_sns_waiting));
            this.m.setCancelable(false);
        }
        Activity activity = this.d;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        LogUtil.a("HealthServiceController", "showLoadingDialog mLoadingDialog is show");
        this.m.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        CommonDialog21 commonDialog21;
        Activity activity = this.d;
        if (activity == null || activity.isFinishing() || (commonDialog21 = this.m) == null) {
            return;
        }
        commonDialog21.dismiss();
        this.m = null;
        LogUtil.a("HealthServiceController", "destroyLoadingDialog");
    }

    public void d() {
        Intent intent = new Intent();
        intent.putExtra("requestCode", SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON);
        intent.setClassName(this.i, "com.huawei.health.HuaweiLoginActivity");
        this.d.startActivityForResult(intent, 101);
    }

    public void d(int i, int i2) {
        LogUtil.a("HealthServiceController", "onActivityResult requestCode=", Integer.valueOf(i), "resultCode=", Integer.valueOf(i2));
        if (i == 101 && i2 == -1) {
            String strE = SharedPreferenceManager.e(this.i, Integer.toString(10000), "stop_hihealth_and_clean_data");
            if ("stop_hihealth".equals(strE)) {
                r();
            } else if ("stop_hihealth_and_clean_data".equals(strE)) {
                g();
            } else {
                a(true);
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(OpAnalyticsConstants.DERIGISTER_SERVICE_AUTHVERIFY, "1");
            OpAnalyticsUtil.getInstance().setEventWithReportImmediately(OperationKey.HEALTH_APP_USER_DERIGISTER_SERVICE_2129033.value(), linkedHashMap);
            return;
        }
        if (i == 102 && i2 == -1) {
            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap2.put(OpAnalyticsConstants.DERIGISTER_SERVICE_ACTION_DO, "1");
            OpAnalyticsUtil.getInstance().setEventWithReportImmediately(OperationKey.HEALTH_APP_USER_DERIGISTER_SERVICE_2129033.value(), linkedHashMap2);
            a(false);
            return;
        }
        LogUtil.j("HealthServiceController", "onActivityResult to else branch");
        LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>();
        linkedHashMap3.put(OpAnalyticsConstants.DERIGISTER_SERVICE_AUTHVERIFY, "0");
        OpAnalyticsUtil.getInstance().setEventWithReportImmediately(OperationKey.HEALTH_APP_USER_DERIGISTER_SERVICE_2129033.value(), linkedHashMap3);
    }

    public void g() {
        if (this.i == null || this.d == null) {
            LogUtil.j("HealthServiceController", "showDeregisterServiceActivity context is null");
            return;
        }
        try {
            this.d.startActivityForResult(new Intent(this.i, (Class<?>) DeregisterServiceActivity.class), 102);
            fca.b(this.i);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("HealthServiceController", "startActivity catch e:", e.getMessage());
        }
    }

    public void e(Context context) {
        LogUtil.a("HealthServiceController", "quitApplication enter");
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    public void b(Context context) {
        if (context != null) {
            Intent intent = new Intent("com.huawei.health.user.exit");
            intent.setPackage(context.getPackageName());
            BroadcastManagerUtil.e(context, intent);
        }
        LogUtil.a("HealthServiceController", "closeAll enter");
        this.f.postDelayed(new Runnable() { // from class: wmi.1
            @Override // java.lang.Runnable
            public void run() {
                Process.killProcess(Process.myPid());
            }
        }, 1000L);
    }

    private void l() {
        String lang = this.f52187c.getLang();
        LogUtil.a("HealthServiceController", "getUsetId: ", LoginInit.getInstance(this.i).getAccountInfo(1011));
        String appLangItemUrl = this.f52187c.getAppLangItemUrl(lang, "2");
        LogUtil.a("HealthServiceController", "Get appLangItemUrl : ", appLangItemUrl);
        this.f52185a = this.f52187c.getAppLangItem(this.k, "GET", appLangItemUrl);
        List<AppLangItem> appLangItem = this.f52187c.getAppLangItem(this.k, "GET", this.f52187c.getAppLangItemUrl(lang, "3"));
        if (appLangItem != null) {
            LogUtil.a("HealthServiceController", "mHealthAccountAppInfoList length: ", Integer.valueOf(appLangItem.size()));
            this.f52185a = d(this.f52185a, appLangItem);
        }
    }

    private List<AppLangItem> d(List<AppLangItem> list, List<AppLangItem> list2) {
        if (list == null) {
            return list2;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        hashSet.addAll(list2);
        return new ArrayList(hashSet);
    }

    private void m() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wmo
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        });
    }

    /* synthetic */ void a() {
        this.k = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        CloudAuthApi cloudAuthApi = (CloudAuthApi) Services.b("Main", CloudAuthApi.class);
        this.f52187c = cloudAuthApi;
        cloudAuthApi.constructInstance(BaseApplication.getContext(), this.k);
        this.e = new wjo(BaseApplication.getContext(), this.k);
        LogUtil.a("HealthServiceController", "Get UserAt in executeThirdPartyAccountTask: ", this.k);
        l();
    }

    private void b(List<AppLangItem> list) {
        LogUtil.a("HealthServiceController", "cancleHealthkitAuth enter");
        if (list == null || list.size() == 0) {
            LogUtil.j("HealthServiceController", "cancleHealthkitAuth accountAppInfoList is null.");
            return;
        }
        Iterator<AppLangItem> it = list.iterator();
        while (it.hasNext()) {
            this.e.d(this.k, ProfileRequestConstants.DELETE_TYPE, this.e.e(it.next().getAppId()));
        }
    }
}
