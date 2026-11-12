package com.huami.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.huami.account.AccountExternalsKt;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.event.EventAccountStatus;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginToken;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MutexLoginActivity extends Activity implements View.OnClickListener {
    public static final String MUTEX_TIME = "MUTEX_TIME";
    private static long e;
    private static HashSet<Long> f = new HashSet<>();
    private TextView a;
    private TextView b;
    private TextView c;
    private b d = new b(this);
    public LoadingDialog mLoadingDialog;

    public class a implements LoadingDialog.OnAnimEndListener {
        public a() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            MutexLoginActivity.this.finish();
            EventBus.getDefault().post(new EventAccountStatus(2));
        }
    }

    public static class b implements IAccount.Callback<LoginToken, ErrorCode> {
        private WeakReference<MutexLoginActivity> a;

        public b(MutexLoginActivity mutexLoginActivity) {
            this.a = new WeakReference<>(mutexLoginActivity);
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(ErrorCode errorCode) {
            MutexLoginActivity mutexLoginActivity = this.a.get();
            if (mutexLoginActivity == null || mutexLoginActivity.isFinishing()) {
                return;
            }
            mutexLoginActivity.f();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(LoginToken loginToken) {
            MutexLoginActivity mutexLoginActivity = this.a.get();
            if (mutexLoginActivity == null || mutexLoginActivity.isFinishing()) {
                return;
            }
            new c(false).execute(new Void[0]);
        }
    }

    public static class c extends AsyncTask<Void, Integer, Boolean> {
        private WeakReference<MutexLoginActivity> a;
        private boolean b;

        public class a extends IHMSimpleHttpResponseHandler {
            public final /* synthetic */ WebResponse a;

            public a(WebResponse webResponse) {
                this.a = webResponse;
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(HMHttpResponseData hMHttpResponseData) {
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
                if (hMHttpResponseData.isSuccess() && webResponse.success() && c.this.d(webResponse)) {
                    this.a.code = 1;
                }
            }
        }

        private c(MutexLoginActivity mutexLoginActivity, boolean z) {
            this.a = new WeakReference<>(mutexLoginActivity);
            this.b = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(WebResponse webResponse) {
            try {
                JSONObject jSONObject = new JSONObject(webResponse.data);
                String strOptString = jSONObject.optString("userid", "");
                String strOptString2 = jSONObject.optString("security", "");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    HMAccountKeeper.INSTANCE.keepLoginData(null, strOptString, strOptString2);
                    return true;
                }
            } catch (JSONException unused) {
            }
            return false;
        }

        private boolean e() {
            WebResponse webResponse = new WebResponse();
            HMAccountWebAPI.reLogin(new a(webResponse));
            return webResponse.success();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            if (this.b) {
                if (!e()) {
                    return Boolean.FALSE;
                }
                HMLoginManager.oldAccount2HuamiAccount();
                if (!HMLoginManager.isHuamiSDKLogin()) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.valueOf(HMProcessLoginDataManager.process(3).isSuccess());
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            MutexLoginActivity mutexLoginActivity = this.a.get();
            if (mutexLoginActivity == null || mutexLoginActivity.isFinishing()) {
                return;
            }
            if (!bool.booleanValue()) {
                mutexLoginActivity.f();
                return;
            }
            AccountExternalsKt.getAccountDelegate().initData();
            HMLogoutManager.setIsMutexLogin(false);
            mutexLoginActivity.updateSuccessUI();
        }
    }

    private static void b(long j) {
        e = j;
        f.add(Long.valueOf(j));
    }

    private void c() {
        this.a = (TextView) findViewById(R.id.mutex_login_logout);
        this.b = (TextView) findViewById(R.id.mutex_login_relogin);
        this.c = (TextView) findViewById(R.id.mutex_login_content);
    }

    public static void clear() {
        e = 0L;
        f.clear();
    }

    public static boolean contains(long j) {
        return f.contains(Long.valueOf(j));
    }

    private void d() {
        this.a.setOnClickListener(this);
        this.b.setOnClickListener(this);
        this.c.setText(getString(R.string.account_ui_mutex_login_content_with_time, new Object[]{new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(e))}));
    }

    private void e() {
        if (e == 0) {
            e = HMAccountKeeper.INSTANCE.getMutexTime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.mLoadingDialog.dismiss();
        HMLogoutManager.logout(3);
    }

    public LoadingDialog createDialog() {
        return LoadingDialog.showDialog(this, getString(R.string.account_ui_logining));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.mutex_login_logout) {
            HMLogoutManager.logout(3);
            Analytics.event(this, "Logout_Out", "Logout");
        } else if (id == R.id.mutex_login_relogin) {
            reLogin();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b(getIntent().getLongExtra(MUTEX_TIME, 0L));
        e();
        if (AccountExternalsKt.getConfigDelegate().isAutoMutexLogin()) {
            return;
        }
        setContentView(R.layout.account_ui_mutex_login);
        c();
        d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.mLoadingDialog.dismiss();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            b(intent.getLongExtra(MUTEX_TIME, 0L));
        }
    }

    public void reLogin() {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.account_ui_no_network_connection));
            HMLogoutManager.logout(3);
            return;
        }
        LoadingDialog loadingDialogCreateDialog = createDialog();
        this.mLoadingDialog = loadingDialogCreateDialog;
        loadingDialogCreateDialog.setCancelable(false);
        if (HMLoginManager.isOldAccount()) {
            new c(true).execute(new Void[0]);
            Analytics.event(this, "Logout_Out", "ReLogin");
        } else if (!HMLoginManager.isHuamiSDKLogin()) {
            f();
        } else {
            AccountManager.getDefault(this).relogin(this.d);
            Analytics.event(this, "Logout_Out", "ReLogin");
        }
    }

    public void updateSuccessUI() {
        this.mLoadingDialog.setSuccess(getString(R.string.account_ui_login_success), new a());
    }
}
