package com.huawei.openalliance.ad.activity;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.uiengine.IRemoteViewDelegate;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.pz;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.ui.commonui.base.BaseDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class TemplateStubActivity extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AdContentData f18192b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IRemoteViewDelegate f18193a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f18194c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = true;

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        hw.b("TemplateStubActivity", "onStop");
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18193a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onStop();
            }
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "onStop " + th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18193a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onStart();
            }
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "onStart " + th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        super.onResume();
        hw.b("TemplateStubActivity", "onResume, hasPause= %s", Boolean.valueOf(this.d));
        if (this.d && this.f) {
            finish();
        }
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18193a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onResume();
            }
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "onResume " + th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onRestart() {
        super.onRestart();
        hw.b("TemplateStubActivity", "onRestart, hasPause= %s", Boolean.valueOf(this.d));
        if (this.d && this.f) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onPause() {
        super.onPause();
        hw.b("TemplateStubActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        this.d = true;
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18193a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onPause();
            }
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "onPause " + th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hw.b("TemplateStubActivity", "onDestroy");
        d();
        if (this.f) {
            pz pzVarA = pz.a(getApplicationContext());
            AdContentData adContentData = f18192b;
            pzVarA.b(adContentData != null ? adContentData.f() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        if (!safeIntent.getBooleanExtra(ParamConstants.Param.TRANSLUCENT, true)) {
            setTheme(R.style.Theme.NoTitleBar);
        }
        super.onCreate(bundle);
        hw.b("TemplateStubActivity", "onCreate");
        String stringExtra = safeIntent.getStringExtra("content");
        String stringExtra2 = safeIntent.getStringExtra(ParamConstants.Param.UI_ENGINE_VIEW_TYPE);
        if (!dg.b(stringExtra2) && !stringExtra2.equals(ParamConstants.RemoteViewType.ESTER_EGG_VIDEO_VIEW)) {
            this.f = false;
        }
        a((AdContentData) bk.b(stringExtra, AdContentData.class, new Class[0]));
        if (!pz.a(getApplicationContext()).a(f18192b) && this.f) {
            hw.b("TemplateStubActivity", "content is null");
            pz.a(getApplicationContext()).a((String) null, 3);
            finish();
        }
        if (dk.b(getApplicationContext()) && this.f) {
            hw.b("TemplateStubActivity", "screen locked");
            if (!Constants.MAGEZINE_PKG_NAME.equalsIgnoreCase(getApplicationContext().getPackageName())) {
                pz pzVarA = pz.a(getApplicationContext());
                AdContentData adContentData = f18192b;
                pzVarA.a(adContentData != null ? adContentData.f() : null, 1);
                finish();
            } else if (Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true);
            } else {
                hw.c("TemplateStubActivity", "api is too low to support showWhenLocked.");
            }
        }
        IRemoteCreator iRemoteCreatorA = com.huawei.openalliance.ad.e.a(getApplicationContext());
        if (iRemoteCreatorA == null) {
            hw.b("TemplateStubActivity", "remoteCreator is null");
            if (this.f) {
                pz pzVarA2 = pz.a(getApplicationContext());
                AdContentData adContentData2 = f18192b;
                pzVarA2.a(adContentData2 != null ? adContentData2.f() : null, 2);
            }
            finish();
            return;
        }
        c(safeIntent);
        a(safeIntent);
        b(safeIntent);
        Bundle bundle2 = new Bundle();
        bundle2.putString("filePath", safeIntent.getStringExtra("filePath"));
        bundle2.putString("content", stringExtra);
        try {
            IRemoteViewDelegate iRemoteViewDelegateNewRemoteViewDelegate = iRemoteCreatorA.newRemoteViewDelegate(ObjectWrapper.wrap(this), safeIntent.getStringExtra(ParamConstants.Param.VIEW_TYPE), null);
            this.f18193a = iRemoteViewDelegateNewRemoteViewDelegate;
            iRemoteViewDelegateNewRemoteViewDelegate.onCreate(bundle2);
            this.f18193a.setCallback(new a(this));
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.TemplateStubActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TemplateStubActivity.this.c();
                    TemplateStubActivity.this.a("start", (Bundle) null);
                    dk.a(TemplateStubActivity.this.f18194c, TemplateStubActivity.this);
                    if (TemplateStubActivity.this.f) {
                        TemplateStubActivity.this.f18194c.startAnimation(AnimationUtils.loadAnimation(TemplateStubActivity.this.getApplicationContext(), com.huawei.openalliance.ad.R.anim.hiad_anim_stub_fade_in));
                    }
                }
            });
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "create remoteViewDelegate err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.f) {
            overridePendingTransition(0, com.huawei.openalliance.ad.R.anim.hiad_anim_stub_fade_out);
        }
    }

    private void d() {
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18193a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onDestroy();
            }
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "onDestroy failed: " + th.getClass().getSimpleName());
        }
    }

    private void c(Intent intent) {
        int intExtra = intent.getIntExtra(ParamConstants.Param.WINDOW_MODE, 1024);
        getWindow().setFlags(intExtra, intExtra);
        getWindow().addFlags(134217728);
        try {
            if (Build.VERSION.SDK_INT < 28 || 1 != getResources().getConfiguration().orientation) {
                return;
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        } catch (Throwable th) {
            Log.w("TemplateStubActivity", "set CutoutMode error:" + th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18193a;
            if (iRemoteViewDelegate != null) {
                View view = (View) ObjectWrapper.unwrap(iRemoteViewDelegate.getView());
                this.f18194c = view;
                setContentView(view);
            }
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "plugRemoteView " + th.getClass().getSimpleName());
        }
    }

    private void b(Intent intent) {
        try {
            setRequestedOrientation(intent.getIntExtra(ParamConstants.Param.ORIENTATION, -1));
        } catch (Throwable th) {
            hw.d("TemplateStubActivity", "setScreenOrientation err: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        finish();
        if (this.f) {
            overridePendingTransition(0, com.huawei.openalliance.ad.R.anim.hiad_anim_stub_fade_out);
        }
    }

    private static void a(AdContentData adContentData) {
        f18192b = adContentData;
    }

    private void a(Intent intent) {
        String str;
        try {
            if (intent.getBooleanExtra(ParamConstants.Param.NEED_RESET, false)) {
                Window window = getWindow();
                if (window == null) {
                    str = "window is null";
                } else {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.flags = intent.getIntExtra(ParamConstants.Param.FLAGS, window.getAttributes().flags);
                    if (!WhiteListPkgList.isHwBrowserPkgName(getPackageName())) {
                        attributes.flags |= 67108864;
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        attributes.layoutInDisplayCutoutMode = intent.getIntExtra(ParamConstants.Param.LAYOUT_IN_DISPLAY_CUTOUT_MODE, window.getAttributes().layoutInDisplayCutoutMode);
                    }
                    window.setAttributes(attributes);
                    window.setNavigationBarColor(intent.getIntExtra(ParamConstants.Param.NAVIGATION_BAR_COLOR, window.getNavigationBarColor()));
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        decorView.setSystemUiVisibility(intent.getIntExtra(ParamConstants.Param.SYSTEM_UI_VISIBILITY, decorView.getSystemUiVisibility()));
                        return;
                    }
                    str = "decorView is null";
                }
            } else {
                str = "not need reset";
            }
            hw.c("TemplateStubActivity", str);
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "inherit err: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class a extends IPPSUiEngineCallback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<TemplateStubActivity> f18196a;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:40:0x007c  */
        @Override // com.huawei.hms.ads.uiengine.IPPSUiEngineCallback
        public void onCallResult(String str, Bundle bundle) {
            byte b2;
            hw.b("TemplateStubActivity", "onCallResult method: %s", str);
            TemplateStubActivity templateStubActivity = this.f18196a.get();
            if (templateStubActivity == null) {
                return;
            }
            str.hashCode();
            switch (str) {
                case "easterEggClick":
                    b2 = 0;
                    break;
                case "complete":
                    b2 = 1;
                    break;
                case "notify_finish":
                    b2 = 2;
                    break;
                case "fail":
                    b2 = 3;
                    break;
                case "show":
                    b2 = 4;
                    break;
                case "click":
                    b2 = 5;
                    break;
                case "close":
                    b2 = 6;
                    break;
                case "dismiss":
                    b2 = 7;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    if (pz.a(templateStubActivity.getApplicationContext()).b(templateStubActivity, bundle, templateStubActivity.getClass().getSimpleName(), TemplateStubActivity.f18192b != null ? TemplateStubActivity.f18192b.f() : null)) {
                        templateStubActivity.b();
                    }
                    break;
                case 1:
                    templateStubActivity.b();
                    pz.a(templateStubActivity.getApplicationContext()).a(templateStubActivity, bundle, TemplateStubActivity.f18192b != null ? TemplateStubActivity.f18192b.f() : null);
                    break;
                case 2:
                    templateStubActivity.b();
                    break;
                case 3:
                    templateStubActivity.b();
                    pz.a(templateStubActivity.getApplicationContext()).a(templateStubActivity, TemplateStubActivity.f18192b != null ? TemplateStubActivity.f18192b.f() : null, bundle);
                    break;
                case 4:
                    pz.a(templateStubActivity.getApplicationContext()).a(templateStubActivity.getClass().getSimpleName(), TemplateStubActivity.f18192b != null ? TemplateStubActivity.f18192b.f() : null);
                    break;
                case 5:
                    templateStubActivity.e = true;
                    pz.a(templateStubActivity.getApplicationContext()).a(templateStubActivity, bundle, templateStubActivity.getClass().getSimpleName(), TemplateStubActivity.f18192b != null ? TemplateStubActivity.f18192b.f() : null);
                    break;
                case 6:
                    templateStubActivity.b();
                    pz.a(templateStubActivity.getApplicationContext()).a(bundle, TemplateStubActivity.f18192b != null ? TemplateStubActivity.f18192b.f() : null);
                    break;
                case 7:
                    templateStubActivity.b();
                    pz.a(templateStubActivity.getApplicationContext()).b(TemplateStubActivity.f18192b != null ? TemplateStubActivity.f18192b.f() : null);
                    break;
            }
        }

        public a(TemplateStubActivity templateStubActivity) {
            this.f18196a = new WeakReference<>(templateStubActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle a(String str, Bundle bundle) {
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18193a;
            if (iRemoteViewDelegate != null) {
                return iRemoteViewDelegate.sendCommand(str, bundle);
            }
            return null;
        } catch (Throwable th) {
            hw.c("TemplateStubActivity", "%s failed: %s ", str, th.getClass().getSimpleName());
            return null;
        }
    }
}
