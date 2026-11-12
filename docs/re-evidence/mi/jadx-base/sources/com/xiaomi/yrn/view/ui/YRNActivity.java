package com.xiaomi.yrn.view.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.k;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.yrn.view.base.YRNBaseFragmentActivity;
import defpackage.iur;
import defpackage.jzr;
import defpackage.sk1;
import defpackage.tsi;
import defpackage.zvi;

/* JADX INFO: loaded from: classes2.dex */
public class YRNActivity extends YRNBaseFragmentActivity {
    public String h;
    public String i;
    public FrameLayout j;

    public final void l() {
        sk1.d(getIntent(), "getIntent() can not be null!");
        this.h = getIntent().getStringExtra("appName");
        String stringExtra = getIntent().getStringExtra(RnReportConst.ApiReport.PARAM_MODULE);
        this.i = stringExtra;
        iur.b(this.h, stringExtra);
        attachModule(this.h, this.i);
    }

    public final void m(final Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) findViewById(tsi.f34997b);
        this.j = frameLayout;
        frameLayout.post(new Runnable() { // from class: eur
            @Override // java.lang.Runnable
            public final void run() {
                this.f17084a.n(bundle);
            }
        });
    }

    public final /* synthetic */ void n(Bundle bundle) {
        if (isDestroyed() || isFinishing() || this.j == null) {
            return;
        }
        k kVarO = getSupportFragmentManager().o();
        kVarO.w(tsi.f34997b, jzr.e().h(this.h, this.i, bundle));
        kVarO.m();
    }

    @Override // com.xiaomi.yrn.view.base.YRNBaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        l();
        if (bundle != null) {
            getIntent().putExtras(bundle);
        }
        setContentView(zvi.f41716a);
        m(getIntent().getBundleExtra(SdkContants.KEY_BUNDLE));
    }

    @Override // androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.h)) {
            bundle.putString("appName", this.h);
        }
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        bundle.putString(RnReportConst.ApiReport.PARAM_MODULE, this.i);
    }
}
