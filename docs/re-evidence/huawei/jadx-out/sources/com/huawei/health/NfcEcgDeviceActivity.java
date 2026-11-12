package com.huawei.health;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.sty;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes23.dex */
public class NfcEcgDeviceActivity extends Activity {
    private Bundle d;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        this.d = intent.getExtras();
        String stringExtra = intent.getStringExtra("PAYLOAD_FROM_NFC");
        LogUtil.a("NfcEcgDeviceActivity", stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        a(stringExtra);
    }

    private void a(String str) {
        String query;
        String str2;
        String[] strArrSplit;
        try {
            query = new URL("https://url.cloud.huawei.com/1Lfn1eswP6?a=d&" + str.substring(0, str.length() - 1)).getQuery();
        } catch (MalformedURLException e) {
            LogUtil.e("NfcEcgDeviceActivity", e.getClass().getSimpleName());
            query = null;
        }
        if (TextUtils.isEmpty(query) || (strArrSplit = (str2 = query.split("&")[0]).split("=")) == null || strArrSplit.length < 1) {
            return;
        }
        sty.e().e(strArrSplit[1], query.replace(str2, ""), this.d, this);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
