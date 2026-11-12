package com.huawei.openalliance.ad.activity;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.views.PPSInterstitialView;
import com.huawei.openalliance.ad.views.s;
import com.huawei.ui.commonui.base.BaseDialog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class PPSInterstitialAdActivity extends e implements PPSInterstitialView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18166a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, com.huawei.openalliance.ad.inter.listeners.a> f18167b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.huawei.openalliance.ad.inter.data.d f18168c;
    private String d;
    private s e;
    private String f;
    private int g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        hw.b("PPSInterstitialAdActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        s sVar = this.e;
        if (sVar != null) {
            sVar.resumeVideoView();
        }
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onPause() {
        hw.b("PPSInterstitialAdActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        s sVar = this.e;
        if (sVar != null) {
            sVar.pauseView();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s sVar = this.e;
        if (sVar != null) {
            sVar.a();
            this.e.destroyView();
            this.e = null;
        }
    }

    class a implements com.huawei.openalliance.ad.inter.listeners.a {
        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void f() {
            com.huawei.openalliance.ad.inter.listeners.a aVar = (com.huawei.openalliance.ad.inter.listeners.a) PPSInterstitialAdActivity.f18167b.get(PPSInterstitialAdActivity.this.f);
            if (aVar != null) {
                aVar.f();
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void e() {
            com.huawei.openalliance.ad.inter.listeners.a aVar = (com.huawei.openalliance.ad.inter.listeners.a) PPSInterstitialAdActivity.f18167b.get(PPSInterstitialAdActivity.this.f);
            if (aVar != null) {
                aVar.e();
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void d() {
            com.huawei.openalliance.ad.inter.listeners.a aVar = (com.huawei.openalliance.ad.inter.listeners.a) PPSInterstitialAdActivity.f18167b.get(PPSInterstitialAdActivity.this.f);
            if (aVar != null) {
                aVar.d();
            }
            PPSInterstitialAdActivity.this.finish();
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void c() {
            com.huawei.openalliance.ad.inter.listeners.a aVar = (com.huawei.openalliance.ad.inter.listeners.a) PPSInterstitialAdActivity.f18167b.get(PPSInterstitialAdActivity.this.f);
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void b() {
            com.huawei.openalliance.ad.inter.listeners.a aVar = (com.huawei.openalliance.ad.inter.listeners.a) PPSInterstitialAdActivity.f18167b.get(PPSInterstitialAdActivity.this.f);
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void a(int i, int i2) {
            com.huawei.openalliance.ad.inter.listeners.a aVar = (com.huawei.openalliance.ad.inter.listeners.a) PPSInterstitialAdActivity.f18167b.get(PPSInterstitialAdActivity.this.f);
            if (aVar != null) {
                aVar.a(i, i2);
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.a
        public void a() {
            com.huawei.openalliance.ad.inter.listeners.a aVar = (com.huawei.openalliance.ad.inter.listeners.a) PPSInterstitialAdActivity.f18167b.get(PPSInterstitialAdActivity.this.f);
            if (aVar != null) {
                aVar.a();
            }
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hw.b("PPSInterstitialAdActivity", "onCreate");
        try {
            this.d = getIntent().getStringExtra("sdk_version");
            com.huawei.openalliance.ad.inter.data.d dVarC = df.c();
            this.f18168c = dVarC;
            if (dVarC == null) {
                finish();
                return;
            }
            this.f = dVarC.getUniqueId();
            dk.a(this, dk.k(this));
            this.e.setOnCloseListener(this);
            this.e.a(new a());
            this.e.a(this.f18168c, getResources().getConfiguration().orientation, this.d);
        } catch (IllegalStateException e) {
            hw.c("PPSInterstitialAdActivity", "init interstitial ad " + e.getClass().getSimpleName());
        } catch (Throwable th) {
            hw.b("PPSInterstitialAdActivity", "init interstitial ad fail " + th.getClass().getSimpleName());
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
        com.huawei.openalliance.ad.inter.listeners.a aVar = f18167b.get(this.f);
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSInterstitialView.b
    public void b() {
        finish();
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        int iCl = fp.b(this).cl();
        this.g = iCl;
        if (iCl != 1 && iCl != 0) {
            this.g = cc.a(this).d() ? 1 : 0;
        }
        hw.a("PPSInterstitialAdActivity", "iteAdFs %d", Integer.valueOf(this.g));
        s sVar = new s(this);
        this.e = sVar;
        setContentView(sVar);
        Window window = getWindow();
        try {
            if (this.g == 1) {
                window.getDecorView().setBackground(getResources().getDrawable(R.color.hiad_80_percent_white));
            } else {
                window.getDecorView().setBackground(getResources().getDrawable(R.color.hiad_black));
                window.getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-17));
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
        } catch (Throwable th) {
            hw.b("PPSInterstitialAdActivity", "interstitial adapterONotch error " + th.getClass().getSimpleName());
        }
    }

    public static void a(String str, com.huawei.openalliance.ad.inter.listeners.a aVar) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "registerInterstitialAdStatusListener key is null";
        } else {
            if (aVar != null) {
                synchronized (f18166a) {
                    f18167b.put(str, aVar);
                }
                return;
            }
            str2 = "registerInterstitialAdStatusListener listner is null";
        }
        hw.c("PPSInterstitialAdActivity", str2);
    }
}
