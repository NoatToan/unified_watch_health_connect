package com.huawei.openalliance.ad.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.uiengine.IPPSUiEngineCallback;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.uiengine.IRemoteViewDelegate;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.ui.commonui.base.BaseDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes41.dex */
public class UiengineStubActivity extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AdContentData f18197c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IRemoteViewDelegate f18198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f18199b;
    private boolean d = false;

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        hw.b("UiengineStubActivity", "onStop");
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18198a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onStop();
            }
        } catch (Throwable th) {
            hw.c("UiengineStubActivity", "onStop " + th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18198a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onStart();
            }
        } catch (Throwable th) {
            hw.c("UiengineStubActivity", "onStart " + th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        super.onResume();
        hw.b("UiengineStubActivity", "onResume, hasPause= %s", Boolean.valueOf(this.d));
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18198a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onResume();
            }
        } catch (Throwable th) {
            hw.c("UiengineStubActivity", "onResume " + th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onRestart() {
        super.onRestart();
        hw.b("UiengineStubActivity", "onRestart, hasPause= %s", Boolean.valueOf(this.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onPause() {
        super.onPause();
        hw.b("UiengineStubActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        this.d = true;
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18198a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onPause();
            }
        } catch (Throwable th) {
            hw.c("UiengineStubActivity", "onPause " + th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hw.b("UiengineStubActivity", "onDestroy");
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        super.onCreate(bundle);
        hw.b("UiengineStubActivity", "onCreate");
        String stringExtra = safeIntent.getStringExtra("content");
        a((AdContentData) bk.b(stringExtra, AdContentData.class, new Class[0]));
        IRemoteCreator iRemoteCreatorA = com.huawei.openalliance.ad.e.a(getApplicationContext());
        if (iRemoteCreatorA == null) {
            hw.b("UiengineStubActivity", "remoteCreator is null");
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
            this.f18198a = iRemoteViewDelegateNewRemoteViewDelegate;
            iRemoteViewDelegateNewRemoteViewDelegate.onCreate(bundle2);
            this.f18198a.setCallback(new a(this));
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.UiengineStubActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    UiengineStubActivity.this.a();
                    dk.a(UiengineStubActivity.this.f18199b, UiengineStubActivity.this);
                }
            });
        } catch (Throwable th) {
            hw.c("UiengineStubActivity", "create remoteViewDelegate err: %s", th.getClass().getSimpleName());
            finish();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
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
            Log.w("UiengineStubActivity", "set CutoutMode error:" + th.getClass().getSimpleName());
        }
    }

    private void b(Intent intent) {
        try {
            setRequestedOrientation(intent.getIntExtra(ParamConstants.Param.ORIENTATION, -1));
        } catch (Throwable th) {
            hw.d("UiengineStubActivity", "setScreenOrientation err: %s", th.getClass().getSimpleName());
        }
    }

    private void b() {
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18198a;
            if (iRemoteViewDelegate != null) {
                iRemoteViewDelegate.onDestroy();
            }
        } catch (Throwable th) {
            hw.c("UiengineStubActivity", "onDestroy failed: " + th.getClass().getSimpleName());
        }
    }

    private static void a(AdContentData adContentData) {
        f18197c = adContentData;
    }

    static class a extends IPPSUiEngineCallback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<UiengineStubActivity> f18201a;

        @Override // com.huawei.hms.ads.uiengine.IPPSUiEngineCallback
        public void onCallResult(String str, Bundle bundle) {
            hw.b("UiengineStubActivity", "onCallResult method: %s", str);
            UiengineStubActivity uiengineStubActivity = this.f18201a.get();
            if (uiengineStubActivity == null) {
                return;
            }
            str.hashCode();
            if (str.equals(ParamConstants.CallbackMethod.NOTIFY_FINISH)) {
                uiengineStubActivity.finish();
            }
        }

        public a(UiengineStubActivity uiengineStubActivity) {
            this.f18201a = new WeakReference<>(uiengineStubActivity);
        }
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
            hw.c("UiengineStubActivity", str);
        } catch (Throwable th) {
            hw.c("UiengineStubActivity", "inherit err: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            IRemoteViewDelegate iRemoteViewDelegate = this.f18198a;
            if (iRemoteViewDelegate != null) {
                View view = (View) ObjectWrapper.unwrap(iRemoteViewDelegate.getView());
                this.f18199b = view;
                setContentView(view);
            }
        } catch (Throwable th) {
            hw.c("UiengineStubActivity", "plugRemoteView " + th.getClass().getSimpleName());
        }
    }
}
