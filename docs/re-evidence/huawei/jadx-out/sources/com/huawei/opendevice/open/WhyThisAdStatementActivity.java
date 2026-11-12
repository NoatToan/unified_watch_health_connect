package com.huawei.opendevice.open;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.utils.as;
import defpackage.ohk;

/* JADX INFO: loaded from: classes41.dex */
public class WhyThisAdStatementActivity extends a {
    private Context d;

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void a(String str, String str2, String str3) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void b() {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void b(String str) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public String getCurrentPageUrl() {
        return null;
    }

    @Override // com.huawei.opendevice.open.a, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        this.d = applicationContext;
        boolean zB = cc.b(applicationContext);
        boolean zJ = as.j(this.d);
        if (zB && zJ) {
            as.b(this.d, Constants.WHY_THIS_AD_DEFAULT_URL);
            finish();
        }
    }

    @Override // com.huawei.opendevice.open.a, com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.opendevice.open.a
    protected int h() {
        return !cc.a(getContext()).d() ? R.string.hiad_choices_whythisad : super.h();
    }

    @Override // com.huawei.opendevice.open.a
    protected int e() {
        return R.layout.opendevice_web;
    }

    @Override // com.huawei.opendevice.open.a
    protected String d() {
        return "whyThisAdThird";
    }

    @Override // com.huawei.opendevice.open.a
    protected void a(c cVar) {
        ohk.b(this, cVar);
    }
}
