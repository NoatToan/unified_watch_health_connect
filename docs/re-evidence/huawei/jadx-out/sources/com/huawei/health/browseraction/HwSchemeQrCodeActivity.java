package com.huawei.health.browseraction;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.NaviCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.iqq;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes26.dex */
public class HwSchemeQrCodeActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6247c = null;
    private String e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6246b = null;
    private String d = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri uriA = a();
        d(getIntent());
        if (uriA == null || !b(uriA)) {
            e();
            return;
        }
        try {
            if ("/home/main".equals(uriA.getPath())) {
                SharedPreferenceManager.e(this, Integer.toString(20002), "EXIT_APP_AT_SPORT_TAB", Boolean.toString(false), new StorageParams());
            }
            e(uriA);
            OpAnalyticsUtil.getInstance().init(BaseApplication.getContext());
            d(uriA);
        } catch (Exception e2) {
            LogUtil.e("Login_HwSchemeQrCodeActivity", "ex=", LogUtil.c(e2));
            e();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        d(intent);
    }

    private void d(Intent intent) {
        if (intent == null) {
            LogUtil.e("Login_HwSchemeQrCodeActivity", "intent == null");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.f6247c = extras.getString("pushId");
            this.e = extras.getString("serviceId");
            this.f6246b = extras.getString("notifiUri");
            this.d = extras.getString("messageContent");
            LogUtil.b("Login_HwSchemeQrCodeActivity", "mPushId = ", this.f6247c, "mServiceId =", this.e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    private boolean b(Uri uri) {
        String path = uri.getPath();
        boolean zEndsWith = false;
        if (!TextUtils.isEmpty(path)) {
            path.hashCode();
            switch (path) {
                case "/97J6mTfn5S":
                case "/1Lfn1eswP6":
                case "/messageH5/html/HwHealthQRCode.html":
                case "/a1mpQudURi":
                case "/a1jJk451Uk":
                    zEndsWith = true;
                    break;
                case "/router/startService":
                case "/HuaweiHealth/startComponent":
                case "/router/startPage":
                    break;
                default:
                    Intent intent = new Intent();
                    intent.setPackage(getPackageName());
                    intent.setData(uri);
                    ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(intent, 131072);
                    if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
                        zEndsWith = resolveInfoResolveActivity.activityInfo.name.endsWith(getClass().getSimpleName());
                        break;
                    }
                    break;
            }
        }
        if (!zEndsWith) {
            ReleaseLogUtil.d("Login_HwSchemeQrCodeActivity", "'", uri, "' is not allow or not supported.");
        }
        return zEndsWith;
    }

    private void e(Uri uri) {
        AppRouter.e(uri).a(this, new e(this));
    }

    static class e implements NaviCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<HwSchemeQrCodeActivity> f6248c;

        @Override // com.huawei.haf.router.NaviCallback
        public void onFound(Guidepost guidepost) {
        }

        e(HwSchemeQrCodeActivity hwSchemeQrCodeActivity) {
            this.f6248c = new WeakReference<>(hwSchemeQrCodeActivity);
        }

        @Override // com.huawei.haf.router.NaviCallback
        public void onLost(Guidepost guidepost) {
            HwSchemeQrCodeActivity hwSchemeQrCodeActivity = this.f6248c.get();
            if (hwSchemeQrCodeActivity != null) {
                hwSchemeQrCodeActivity.e();
            }
        }

        @Override // com.huawei.haf.router.NaviCallback
        public void onArrival(Guidepost guidepost) {
            HwSchemeQrCodeActivity hwSchemeQrCodeActivity = this.f6248c.get();
            if (hwSchemeQrCodeActivity != null) {
                hwSchemeQrCodeActivity.e();
            }
        }

        @Override // com.huawei.haf.router.NaviCallback
        public void onInterrupt(Guidepost guidepost) {
            HwSchemeQrCodeActivity hwSchemeQrCodeActivity = this.f6248c.get();
            if (hwSchemeQrCodeActivity != null) {
                hwSchemeQrCodeActivity.e();
            }
        }
    }

    private Uri a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("Login_HwSchemeQrCodeActivity", "intent == null");
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            LogUtil.e("Login_HwSchemeQrCodeActivity", "uri == null");
        }
        return data;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        setIntent(null);
        finish();
    }

    private void d(Uri uri) {
        String queryParameter = uri.getQueryParameter("from");
        iqq.c(iqq.d(queryParameter, this.f6247c, this.e, this.d, uri), queryParameter, !TextUtils.isEmpty(this.f6246b));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
