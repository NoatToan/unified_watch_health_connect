package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.android.hms.push.R;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.push.t;

/* JADX INFO: loaded from: classes34.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hwpush_trans_activity);
        getWindow().addFlags(67108864);
        t.a(this, getIntent());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
