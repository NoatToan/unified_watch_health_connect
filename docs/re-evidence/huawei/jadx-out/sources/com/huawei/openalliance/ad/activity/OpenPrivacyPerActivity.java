package com.huawei.openalliance.ad.activity;

import android.content.res.Configuration;
import android.view.MenuItem;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.views.interfaces.q;

/* JADX INFO: loaded from: classes12.dex */
public class OpenPrivacyPerActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f18133a;

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q qVar = this.f18133a;
        if (qVar != null) {
            qVar.d();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        hw.b("PriPerActivity", "initLayout");
        setContentView(R.layout.pure_web_activity_layout);
        String stringExtra = new SafeIntent(getIntent()).getStringExtra("url");
        this.f18133a = (q) findViewById(R.id.webview);
        if (dg.b(stringExtra)) {
            hw.d("PriPerActivity", "param err");
        } else {
            this.f18133a.a(stringExtra);
        }
    }
}
