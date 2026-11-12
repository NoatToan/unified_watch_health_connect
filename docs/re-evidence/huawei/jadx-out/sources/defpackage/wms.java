package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.awarenessdonate.AwarenessDonateApi;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcloudmodel.https.HttpResCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.main.R;
import health.compact.a.AuthorizationUtils;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.ProcessUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class wms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private wmi f52204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f52205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomAlertDialog f52206c;
    private CommonDialog21 d;
    private Handler e;
    private float j;

    public wms(Activity activity) {
        this.f52205b = activity;
    }

    public void d(Context context) {
        if (context == null) {
            return;
        }
        CustomAlertDialog customAlertDialog = this.f52206c;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        this.f52204a = new wmi(context, this.f52205b, null);
        View viewInflate = View.inflate(context, R.layout.services_custom_view_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_all);
        healthTextView.setText(context.getString(R.string.IDS_hwh_privacy_permission_total, context.getResources().getString(R.string.IDS_hwh_privacy_permission_read)));
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_one);
        healthTextView2.setText(wvi.e());
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_six);
        healthTextView3.setText(new SpannableString(context.getString(R.string.IDS_hwh_agreement_save_area, context.getResources().getString(R.string.IDS_hwh_agreement_china))));
        HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_ele);
        wvi.c(healthTextView4);
        if (qrs.v()) {
            healthTextView.setTextSize(1, 26.0f);
            healthTextView2.setTextSize(1, 26.0f);
            healthTextView3.setTextSize(1, 26.0f);
            healthTextView3.setTextSize(1, 26.0f);
            ((HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_seven)).setTextSize(1, 26.0f);
            ((HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_eight)).setTextSize(1, 26.0f);
            ((HealthTextView) viewInflate.findViewById(R.id.hw_health_service_item_eight)).setTextSize(1, 26.0f);
            healthTextView4.setTextSize(1, 26.0f);
        }
        CustomAlertDialog customAlertDialogA = a(context, viewInflate, (HealthScrollView) viewInflate.findViewById(R.id.scrollview_dialog));
        this.f52206c = customAlertDialogA;
        customAlertDialogA.setCancelable(false);
        this.f52206c.show();
    }

    private CustomAlertDialog a(Context context, View view, HealthScrollView healthScrollView) {
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).b(context.getString(R.string.IDS_hwh_privacy_change_notice)).a(view).a(R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: wnd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).d(R.string.IDS_hwh_privacy_revoke_auth, new DialogInterface.OnClickListener() { // from class: wna
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f52220c.c(dialogInterface, i);
            }
        }).b();
        if (qrs.aa(context)) {
            i(context);
            qrs.d(context, customAlertDialogB);
            ViewGroup.LayoutParams layoutParams = healthScrollView.getLayoutParams();
            layoutParams.height = qrs.d(context, context.getResources().getConfiguration().screenHeightDp * 0.8f * this.j);
            healthScrollView.setLayoutParams(layoutParams);
        }
        return customAlertDialogB;
    }

    /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f52204a.j();
    }

    private void i(Context context) {
        float f = context.getResources().getConfiguration().screenHeightDp;
        float fE = qrs.e(context, qrs.m());
        if (f < 0.4f * fE) {
            this.j = 0.3f;
        } else if (f > fE * 0.6f) {
            this.j = 0.7f;
        } else {
            this.j = 0.55f;
        }
    }

    public boolean e() {
        CustomAlertDialog customAlertDialog = this.f52206c;
        if (customAlertDialog != null) {
            return customAlertDialog.isShowing();
        }
        return false;
    }

    public void e(final Context context) {
        if (context == null) {
            LogUtil.j("PrivacyNotice", "stopHealth context is null");
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(context, AnalyticsValue.HEALTH_CANCEL_AUTH_2040061.value(), map, 0);
        lmf.d().b(context);
        niz.c(false);
        this.e = new d(Looper.getMainLooper(), this, context);
        if (!LoginInit.getInstance(context).getIsLogined()) {
            LogUtil.a("PrivacyNotice", "stopHealth logout");
            o(context);
            return;
        }
        LogUtil.a("PrivacyNotice", "stopHealth obtainToken");
        if (!CommonUtil.ab(context)) {
            qpx.e(context, R.string.IDS_device_hygride_current_network_unavailable);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wmw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52216b.a(context);
                }
            });
        }
    }

    private void k(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    private void g(Context context) {
        if (context != null) {
            Intent intent = new Intent("com.huawei.health.user.exit");
            intent.setPackage(BaseApplication.getAppPackage());
            BroadcastManagerUtil.e(context, intent);
        }
        LogUtil.a("PrivacyNotice", "### main exit by user");
        this.e.postDelayed(new Runnable() { // from class: wms.3
            @Override // java.lang.Runnable
            public void run() {
                Process.killProcess(Process.myPid());
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context) {
        ReleaseLogUtil.d("PrivacyNotice", "enter exitAndClose");
        k(context);
        g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(final Context context) {
        String url = GRSManager.c(context).getUrl("agreementservice");
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1015);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
        arrayList.add(10009);
        wjs.b(url, accountInfo, false, arrayList, new HttpResCallBack() { // from class: wmy
            @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
            public final void onFinished(int i, String str) {
                this.e.e(context, i, str);
            }
        });
    }

    /* synthetic */ void e(Context context, int i, String str) {
        if (i != 200 || !wvi.c(str)) {
            LogUtil.a("PrivacyNotice", "cancelSignAgr_result error", Integer.valueOf(i));
            this.e.sendEmptyMessage(10004);
        } else {
            LogUtil.a("PrivacyNotice", "cancelSignAgr_result ", str);
            d();
            o(context);
        }
    }

    private void o(final Context context) {
        ReleaseLogUtil.d("R_PrivacyNotice", "revokeAuthorizeSuccess, key_wether_to_auth is false");
        StorageParams storageParams = new StorageParams();
        SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_china", "", storageParams);
        SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_query_time", "", storageParams);
        SharedPreferenceManager.e(context, Integer.toString(10000), "if_first_agr_sign", "", new StorageParams());
        KeyValDbManager.d(context).b("key_wether_to_auth", String.valueOf(false));
        SharedPreferenceManager.a(context, false);
        SharedPreferenceManager.e(context, Integer.toString(10000), "key_wether_to_auth", String.valueOf(false), new StorageParams());
        ioi.d().e(11, false, null, null);
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "hw_health_show_grant_pwd", Integer.toString(0), new StorageParams());
        SharedPreferenceManager.a(Integer.toString(10000), "is_agr_change_user", false);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("IDEQ_IndoorEquipConnectedActivity" + CommonUtil.a(context), 0).edit();
        editorEdit.putBoolean("IDEQ_IndoorEquipConnectedActivityprivacyDialogConfirm" + CommonUtil.a(context), false);
        editorEdit.apply();
        nzc.b(context, false);
        AuthorizationUtils.b();
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false);
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_agree_full_service_model", false);
        if ("stop_hihealth".equals(SharedPreferenceManager.e(context, Integer.toString(10000), "stop_hihealth_and_clean_data"))) {
            if (LoginInit.getInstance(context).isBrowseMode() || Utils.k()) {
                ReleaseLogUtil.d("PrivacyNotice", "BrowseMode or OverseaNoCloudVersion stop health");
                j(context);
            } else {
                HandlerExecutor.c(new Runnable() { // from class: wmx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.c(context);
                    }
                });
                HandlerCenter.a().d(new Runnable() { // from class: wmz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52219b.b(context);
                    }
                }, 500L);
            }
        }
    }

    /* synthetic */ void c(Context context) {
        l(context);
        ProcessUtil.a();
    }

    /* synthetic */ void b(Context context) {
        xjl.c.b(context.getApplicationContext());
        f(context);
    }

    /* JADX INFO: renamed from: wms$1, reason: invalid class name */
    class AnonymousClass1 implements ResponseCallback<int[]> {
        final /* synthetic */ Context e;

        AnonymousClass1(Context context) {
            this.e = context;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, int[] iArr) {
            ReleaseLogUtil.d("PrivacyNotice", "clearAppDataAsync Complete status:", Integer.valueOf(i), " statuses:", iArr);
            HandlerExecutor.c(new Runnable() { // from class: wne
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
            wms.this.j(this.e);
        }

        /* synthetic */ void a() {
            wms.this.a();
        }
    }

    private void f(Context context) {
        xjl.c.b(new AnonymousClass1(context));
    }

    private void l(Context context) {
        if (this.d == null) {
            new CommonDialog21(context, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(context);
            this.d = commonDialog21B;
            commonDialog21B.b(context.getString(R.string.IDS_sns_waiting));
            this.d.setCancelable(false);
        }
        Activity activity = this.f52205b;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        LogUtil.a("PrivacyNotice", "showLoadingDialog mLoadingDialog is show");
        this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CommonDialog21 commonDialog21;
        Activity activity = this.f52205b;
        if (activity == null || activity.isFinishing() || (commonDialog21 = this.d) == null) {
            return;
        }
        commonDialog21.dismiss();
        this.d = null;
        LogUtil.a("PrivacyNotice", "destroyLoadingDialog");
    }

    private void d() {
        LogUtil.a("PrivacyNotice", "enter cancelFaCardDonate");
        ThreadPoolManager.c().execute(new Runnable() { // from class: wmv
            @Override // java.lang.Runnable
            public final void run() {
                wms.b();
            }
        });
    }

    static /* synthetic */ void b() {
        AwarenessDonateApi awarenessDonateApi = (AwarenessDonateApi) Services.d("HWSmartInteractMgr", AwarenessDonateApi.class);
        if (awarenessDonateApi == null || !awarenessDonateApi.isSupportDonate()) {
            LogUtil.j("PrivacyNotice", "awarenessDonateApi is null or not support donate");
        } else {
            awarenessDonateApi.removeData();
        }
    }

    public class d extends BaseHandler<wms> {
        private Context d;

        d(Looper looper, wms wmsVar, Context context) {
            super(looper, wmsVar);
            this.d = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(wms wmsVar, Message message) {
            if (message == null) {
                LogUtil.a("PrivacyNotice", "handleMessageWhenReferenceNotNull msg is null");
            } else {
                if (message.what != 10004) {
                    return;
                }
                qpx.e(this.d, R.string.IDS_deauthorization_fail);
            }
        }
    }
}
