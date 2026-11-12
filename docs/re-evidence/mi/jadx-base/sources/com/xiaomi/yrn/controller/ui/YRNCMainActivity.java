package com.xiaomi.yrn.controller.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import com.xiaomi.yrn.view.base.YRNBaseFragmentActivity;
import defpackage.aje;
import defpackage.avr;
import defpackage.fvr;
import defpackage.hvr;
import defpackage.jvr;
import defpackage.lvr;
import defpackage.lwr;
import defpackage.ovr;
import defpackage.ssi;
import defpackage.vgi;
import defpackage.vvr;
import defpackage.yvi;
import defpackage.zxr;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class YRNCMainActivity extends YRNBaseFragmentActivity {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    private static final String TAG = "YRNCMainActivity";
    protected WeakReference<Activity> mActReference;
    protected String mAppName;
    protected Configuration mConfiguration;
    protected FrameLayout mContainer;
    protected Fragment mFragment;
    protected ImageView mIvGaussLeft;
    protected ImageView mIvGaussRight;
    protected String mModuleName;
    protected final BroadcastReceiver mReceiver = new a();
    protected String mUrl;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !"rn_force_fsg_nav_bar".equals(intent.getAction())) {
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("has_bottom_bar", false);
            String stringExtra = intent.getStringExtra("rn_background_color");
            YRNCMainActivity yRNCMainActivity = YRNCMainActivity.this;
            vvr.e(yRNCMainActivity, yRNCMainActivity.mContainer, booleanExtra, stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initFragment$0() {
        if (isDestroyed() || isFinishing() || this.mContainer == null) {
            return;
        }
        k kVarO = getSupportFragmentManager().o();
        zxr.a(TAG, "initFragment: " + this.mUrl);
        Fragment fragmentNewYRNFragment = lwr.b().newYRNFragment(this.mUrl, null);
        this.mFragment = fragmentNewYRNFragment;
        kVarO.w(ssi.f33949a, fragmentNewYRNFragment);
        kVarO.m();
    }

    public void attachYrnModule() {
        this.mModuleName = lwr.b().getRNModuleByUrl(this.mUrl);
        String rNAppNameByUrl = lwr.b().getRNAppNameByUrl(this.mUrl);
        this.mAppName = rNAppNameByUrl;
        attachModule(rNAppNameByUrl, this.mModuleName);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(vgi.f36877a, vgi.d);
    }

    public int getInstanceId() {
        YRNCRootView rootView;
        Fragment fragment = this.mFragment;
        if (!(fragment instanceof YRNCFragment) || (rootView = ((YRNCFragment) fragment).getRootView()) == null) {
            return -1;
        }
        return rootView.getInstanceId();
    }

    public void handleIntent(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("url");
        if (TextUtils.isEmpty(stringExtra) && getIntent().getData() != null) {
            stringExtra = getIntent().getData().toString();
        }
        if (bundle != null && stringExtra == null) {
            String string = bundle.getString("url");
            if (!TextUtils.isEmpty(string)) {
                stringExtra = string;
            }
        }
        if (TextUtils.isEmpty(stringExtra)) {
            this.mUrl = lwr.b().getInfoProvider() != null ? lwr.b().getInfoProvider().getDefaultUrlWhenEmpty() : "";
        } else {
            this.mUrl = stringExtra;
        }
    }

    public void initFragment() {
        this.mContainer.post(new Runnable() { // from class: kvr
            @Override // java.lang.Runnable
            public final void run() {
                this.f24352a.lambda$initFragment$0();
            }
        });
    }

    public void initGaussViews() {
        this.mIvGaussLeft = (ImageView) findViewById(ssi.f33950b);
        this.mIvGaussRight = (ImageView) findViewById(ssi.c);
        fvr.c().h(this, this.mUrl, this.mIvGaussLeft, this.mIvGaussRight, this.mContainer);
    }

    public void initListener() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("rn_force_fsg_nav_bar");
        aje.b(getApplicationContext()).c(this.mReceiver, intentFilter);
    }

    public void initView() {
        this.mContainer = (FrameLayout) findViewById(ssi.f33949a);
        initGaussViews();
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = this.mConfiguration;
        if (configuration2 == null || (configuration2.updateFrom(configuration) & 2048) == 0) {
            return;
        }
        fvr.c().h(this, this.mUrl, this.mIvGaussLeft, this.mIvGaussRight, this.mContainer);
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove(FRAGMENTS_TAG);
        }
        super.onCreate(bundle);
        vvr.b(this);
        handleIntent(bundle);
        lvr.b(this, this.mUrl);
        attachYrnModule();
        if (bundle != null) {
            getIntent().putExtras(bundle);
        }
        WeakReference<Activity> weakReference = new WeakReference<>(this);
        this.mActReference = weakReference;
        ovr.a(weakReference, this.mUrl);
        setContentView(yvi.f40614a);
        avr.b(this);
        this.mConfiguration = new Configuration(getResources().getConfiguration());
        initView();
        initFragment();
        initListener();
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (getWindow() != null && getWindow().getDecorView() != null && getWindow().getDecorView().getHandler() != null) {
            getWindow().getDecorView().getHandler().removeCallbacksAndMessages(null);
        }
        jvr.a(this);
        fvr.c().i();
        ovr.d(this.mActReference);
        if (this.mReceiver != null) {
            aje.b(getApplicationContext()).e(this.mReceiver);
        }
        super.onDestroy();
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        hvr.o(z);
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        lwr.b().setResumeActivity(new WeakReference<>(this));
    }

    @Override // androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (TextUtils.isEmpty(this.mUrl)) {
            return;
        }
        bundle.putString("url", this.mUrl);
    }

    public void reloadUrl(String str) {
        this.mUrl = str;
        initFragment();
    }
}
