package com.huawei.health.routeradapter;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealthservice.hmsauth.HmsAuthApi;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.operation.PluginOperation;
import com.tencent.open.SocialOperation;
import defpackage.lpu;
import defpackage.qrs;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class OAuthLoginPreTreatmentService implements PretreatmentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f8707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8709c;
    private BroadcastReceiver d;
    private String e;

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(final Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        this.f8707a = uriO;
        this.e = uriO.getQueryParameter("client_id");
        this.f8708b = this.f8707a.getQueryParameter(SocialOperation.GAME_SIGNATURE);
        this.f8709c = this.f8707a.getQueryParameter("thirdUrlScheme");
        String queryParameter = this.f8707a.getQueryParameter("scope");
        if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f8708b) || TextUtils.isEmpty(this.f8709c) || TextUtils.isEmpty(queryParameter)) {
            e(context, this.f8707a, 224);
            ReleaseLogUtil.a("Login_OAuthLoginPreTreatmentService", "onPretreatment, clientId, signature, thirdUrlScheme or scopes is empty");
            return false;
        }
        if (LoginInit.getInstance(context).getIsLogined()) {
            a(context, this.f8707a);
            return false;
        }
        b();
        LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.health.routeradapter.OAuthLoginPreTreatmentService.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                OAuthLoginPreTreatmentService.this.a(context, i);
            }
        }, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i) {
        if (i != -1) {
            if (i != 0) {
                ReleaseLogUtil.e("Login_OAuthLoginPreTreatmentService", "login failed");
                e(context, this.f8707a, 219);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClassName(context, "com.huawei.health.MainActivity");
        try {
            PendingIntent.getActivity(context, 0, intent, 201326592).send();
            LogUtil.a("OAuthLoginPreTreatmentService", "bringLoginToFront success");
        } catch (Exception unused) {
            ReleaseLogUtil.a("Login_OAuthLoginPreTreatmentService", "bringLoginToFront failed");
            e(context, this.f8707a, 219);
        }
    }

    private void b() {
        if (this.d != null) {
            return;
        }
        this.d = new b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        LocalBroadcastManager.getInstance().registerReceiver(this.d, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.d != null) {
            LogUtil.a("OAuthLoginPreTreatmentService", "unregisterBroadcastReceiver");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.d);
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final Uri uri) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: gvj
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(uri, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(Uri uri, Context context) {
        if (!lpu.c(uri)) {
            LogUtil.e("OAuthLoginPreTreatmentService", "loginToOAuth, Auth not permitted");
            e(context, uri, a.M);
            return;
        }
        if (!d()) {
            LogUtil.e("OAuthLoginPreTreatmentService", "loginToOAuth, check signature wrong");
            e(context, uri, 216);
            return;
        }
        String strB = lpu.b(uri);
        if (TextUtils.isEmpty(strB)) {
            e(context, uri, 217);
            LogUtil.e("OAuthLoginPreTreatmentService", "loginToOAuth, scopes are empty");
            return;
        }
        String strD = lpu.d(uri, strB, context);
        if (PluginOperation.getInstance(context).getAdapter() == null) {
            PluginOperationAdapterImpl pluginOperationAdapterImpl = PluginOperationAdapterImpl.getInstance(context);
            PluginOperation pluginOperation = PluginOperation.getInstance(context);
            pluginOperation.setAdapter(pluginOperationAdapterImpl);
            pluginOperation.init(context);
        }
        H5proUtil.jumpFromDeeplink(context, strD);
    }

    private boolean d() {
        LogUtil.a("OAuthLoginPreTreatmentService", "checkSignature, enter");
        boolean zIsValidRedirectUrl = ((HmsAuthApi) Services.b("HealthKit", HmsAuthApi.class)).isValidRedirectUrl(this.e, this.f8708b, this.f8709c);
        if (zIsValidRedirectUrl) {
            SharedPreferenceManager.c("HealthKit", "thirdUrlScheme", this.f8709c);
            SharedPreferenceManager.c("HealthKit", "clientId", this.e);
        }
        return zIsValidRedirectUrl;
    }

    private void e(Context context, Uri uri, int i) {
        String queryParameter = uri.getQueryParameter("state");
        Uri.Builder builderBuildUpon = Uri.parse(this.f8709c).buildUpon();
        if (!TextUtils.isEmpty(queryParameter)) {
            builderBuildUpon.appendQueryParameter("state", queryParameter);
        }
        builderBuildUpon.appendQueryParameter("errorCode", String.valueOf(i));
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(builderBuildUpon.build().toString()));
        intent.setFlags(268435456);
        if (context == null) {
            ReleaseLogUtil.e("Login_OAuthLoginPreTreatmentService", "context is null");
            return;
        }
        ReleaseLogUtil.e("Login_OAuthLoginPreTreatmentService", "jumpToThirdApp, login failed");
        qrs.b(context, intent);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.huawei.plugin.account.login".equals(intent.getAction())) {
                LogUtil.a("OAuthLoginPreTreatmentService", "receive action login success");
                OAuthLoginPreTreatmentService oAuthLoginPreTreatmentService = OAuthLoginPreTreatmentService.this;
                oAuthLoginPreTreatmentService.a(context, oAuthLoginPreTreatmentService.f8707a);
                OAuthLoginPreTreatmentService.this.c();
            }
        }
    }
}
