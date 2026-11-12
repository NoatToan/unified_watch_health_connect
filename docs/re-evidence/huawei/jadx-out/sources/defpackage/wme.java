package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
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
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.main.R;
import health.compact.a.AuthorizationUtils;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CloudImpl;
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

/* JADX INFO: loaded from: classes19.dex */
public class wme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CommonDialog21 f52177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f52178b;
    private Activity e;

    public wme(Activity activity) {
        this.e = activity;
        this.f52178b = new b(this, Looper.getMainLooper(), this, activity, null);
    }

    public void b(final Context context) {
        String url = GRSManager.c(context).getUrl("agreementservice");
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1015);
        if (TextUtils.isEmpty(accountInfo) || TextUtils.isEmpty(url) || context == null) {
            LogUtil.j("CancelAuthInteractors", "cancelSignAgreement token or url is empty, context is null");
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE));
        arrayList.add(10009);
        final String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "stop_hihealth_and_clean_data");
        wjs.b(url, accountInfo, false, arrayList, new HttpResCallBack() { // from class: wmh
            @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
            public final void onFinished(int i, String str) {
                this.f52184c.d(context, strE, i, str);
            }
        });
    }

    /* synthetic */ void d(Context context, String str, int i, String str2) {
        if (i == 200 && wvi.c(str2)) {
            e(context, str);
        } else {
            b(i);
        }
    }

    private void e(final Context context, String str) {
        LogUtil.a("CancelAuthInteractors", "cancelSignAgreement_result ");
        c();
        d(context);
        g(context);
        if ("stop_hihealth".equals(str)) {
            HandlerExecutor.c(new Runnable() { // from class: wmf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52180c.e(context);
                }
            });
            HandlerCenter.a().d(new Runnable() { // from class: wmc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52175b.c(context);
                }
            }, 500L);
        }
    }

    /* synthetic */ void e(Context context) {
        i(context);
        ProcessUtil.a();
    }

    /* synthetic */ void c(Context context) {
        xjl.c.b(context.getApplicationContext());
        f(context);
    }

    /* JADX INFO: renamed from: wme$3, reason: invalid class name */
    class AnonymousClass3 implements ResponseCallback<int[]> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f52179b;

        AnonymousClass3(Context context) {
            this.f52179b = context;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, int[] iArr) {
            ReleaseLogUtil.d("CancelAuthInteractors", "clearAppDataAsync Complete status:", Integer.valueOf(i), " statuses:", iArr);
            HandlerExecutor.c(new Runnable() { // from class: wmj
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            });
            wme.this.j(this.f52179b);
        }

        /* synthetic */ void b() {
            wme.this.a();
        }
    }

    private void f(Context context) {
        xjl.c.b(new AnonymousClass3(context));
    }

    private void i(Context context) {
        if (this.f52177a == null) {
            new CommonDialog21(context, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(context);
            this.f52177a = commonDialog21B;
            commonDialog21B.b(context.getString(R.string.IDS_sns_waiting));
            this.f52177a.setCancelable(false);
        }
        Activity activity = this.e;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        LogUtil.a("CancelAuthInteractors", "showLoadingDialog mLoadingDialog is show");
        this.f52177a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CommonDialog21 commonDialog21;
        Activity activity = this.e;
        if (activity == null || activity.isFinishing() || (commonDialog21 = this.f52177a) == null) {
            return;
        }
        commonDialog21.dismiss();
        this.f52177a = null;
        LogUtil.a("CancelAuthInteractors", "destroyLoadingDialog");
    }

    private void b(int i) {
        LogUtil.a("CancelAuthInteractors", "cancelSignAgreement_result resultCode ", Integer.valueOf(i));
        this.f52178b.sendEmptyMessage(10004);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context) {
        ReleaseLogUtil.d("CancelAuthInteractors", "enter exitAndClose");
        h(context);
        a(context);
    }

    public void h(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    public void a(Context context) {
        if (context != null) {
            Intent intent = new Intent("com.huawei.health.user.exit");
            intent.setPackage(context.getPackageName());
            BroadcastManagerUtil.e(context, intent);
        }
        LogUtil.a("CancelAuthInteractors", "overseas main exit by user");
        this.f52178b.postDelayed(new Runnable() { // from class: wme.1
            @Override // java.lang.Runnable
            public void run() {
                Process.killProcess(Process.myPid());
            }
        }, 1000L);
    }

    public void d(Context context) {
        SharedPreferenceManager.e(context, Integer.toString(10000), "agr_if_agree_authorize", "2", new StorageParams());
        wsp.e();
        if (Utils.k()) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_no_cloud", "", null);
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(context);
        int iJ = CommonUtil.j(loginInit.getAccountInfo(1009));
        if (!loginInit.getIsLogined() || LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            iJ = CloudImpl.e(context).getSiteIdByCountry(SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country"));
            ReleaseLogUtil.d("CancelAuthInteractors", "clearTermsAuthMessage siteId = " + iJ);
        }
        if (iJ == 1) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_china", "", null);
            return;
        }
        if (iJ == 8) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_russia", "", null);
            return;
        }
        if (iJ == 5) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_hong_kong", "", null);
        } else if (iJ == 7) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_europe", "", null);
        } else {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_no_cloud", "", null);
        }
    }

    public void g(Context context) {
        ReleaseLogUtil.d("R_CancelAuthInteractors", "setTermsTag, key_wether_to_auth is false");
        KeyValDbManager.d(context).b("key_wether_to_auth", String.valueOf(false));
        SharedPreferenceManager.a(context, false);
        SharedPreferenceManager.e(context, Integer.toString(10000), "key_wether_to_auth", String.valueOf(false), null);
        SharedPreferenceManager.e(context, Integer.toString(10000), "agr_last_query_time", "", null);
        SharedPreferenceManager.e(context, Integer.toString(10000), "if_first_agr_sign", "", null);
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "hw_health_show_grant_pwd", Integer.toString(0), null);
        SharedPreferenceManager.a(Integer.toString(10000), "is_agr_change_user", false);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("IDEQ_IndoorEquipConnectedActivity" + CommonUtil.a(context), 0).edit();
        editorEdit.putBoolean("IDEQ_IndoorEquipConnectedActivityprivacyDialogConfirm" + CommonUtil.a(context), false);
        editorEdit.apply();
        nzc.b(context, false);
        AuthorizationUtils.b();
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false);
        SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_agree_full_service_model", false);
    }

    private void c() {
        LogUtil.a("CancelAuthInteractors", "enter cancelFaCardDonate");
        ThreadPoolManager.c().execute(new Runnable() { // from class: wmb
            @Override // java.lang.Runnable
            public final void run() {
                wme.b();
            }
        });
    }

    static /* synthetic */ void b() {
        AwarenessDonateApi awarenessDonateApi = (AwarenessDonateApi) Services.d("HWSmartInteractMgr", AwarenessDonateApi.class);
        if (awarenessDonateApi == null || !awarenessDonateApi.isSupportDonate()) {
            LogUtil.j("CancelAuthInteractors", "awarenessDonateApi is null or not support donate");
        } else {
            awarenessDonateApi.removeData();
        }
    }

    class b extends BaseHandler<wme> {
        private Context e;

        /* synthetic */ b(wme wmeVar, Looper looper, wme wmeVar2, Context context, AnonymousClass3 anonymousClass3) {
            this(looper, wmeVar2, context);
        }

        private b(Looper looper, wme wmeVar, Context context) {
            super(looper, wmeVar);
            this.e = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(wme wmeVar, Message message) {
            if (message == null) {
                LogUtil.j("CancelAuthInteractors", "handleMessageWhenReferenceNotNull msg is null");
            } else {
                if (message.what != 10004) {
                    return;
                }
                qpx.e(this.e, R.string.IDS_deauthorization_fail);
            }
        }
    }
}
