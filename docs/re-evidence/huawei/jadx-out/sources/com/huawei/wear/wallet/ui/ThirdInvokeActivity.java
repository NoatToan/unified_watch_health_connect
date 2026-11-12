package com.huawei.wear.wallet.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.wallet.proxy.InitWalletProxy;
import defpackage.xnd;
import defpackage.xxz;
import defpackage.xyc;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes46.dex */
public class ThirdInvokeActivity extends FragmentActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakHashMap<String, String> f30717c;
    private SafeIntent d;
    private String e = "";

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xyc.c("ThirdInvokeActivity", getApplicationContext());
        try {
            InitWalletProxy.e();
            xnd.d("ThirdInvokeActivity", "plugin is available");
            if (!xyc.b(this)) {
                xnd.a("ThirdInvokeActivity", "onCreate, agreement is not accepted");
                finish();
                return;
            }
            if (c()) {
                finish();
                return;
            }
            a();
            if (TextUtils.isEmpty(this.e) || !this.f30717c.containsKey(this.e)) {
                return;
            }
            xnd.d("ThirdInvokeActivity", "action enter");
            SafeIntent safeIntent = new SafeIntent(new Intent());
            safeIntent.putExtra("thirdInvoke", true);
            safeIntent.putExtra("cardType", this.d.getStringExtra("cardType"));
            safeIntent.putExtra("passTypeId", this.d.getStringExtra("passTypeId"));
            safeIntent.putExtra("passId", this.d.getStringExtra("passId"));
            safeIntent.putExtra("passGroup", this.d.getStringExtra("passGroup"));
            safeIntent.putExtra("productId", this.d.getStringExtra("productId"));
            safeIntent.setClassName(getPackageName(), this.f30717c.get(this.e));
            safeIntent.setFlags(268468224);
            xxz.e(this, safeIntent);
            finish();
        } catch (ClassNotFoundException unused) {
            xnd.a("ThirdInvokeActivity", "onCreate, not PluginAvailable");
            finish();
        }
    }

    private boolean c() {
        Uri data = new SafeIntent(getIntent()).getData();
        if (data == null) {
            return false;
        }
        String scheme = data.getScheme();
        String host = data.getHost();
        if (!TextUtils.isEmpty(host) && !host.contains("@")) {
            String path = data.getPath();
            if (TextUtils.equals(scheme, "wallet") && TextUtils.equals(host, "com.huawei.health") && TextUtils.equals(path, "/financeclient/token2")) {
                SafeIntent safeIntent = new SafeIntent(new Intent());
                safeIntent.setData(data);
                safeIntent.setClassName(getPackageName(), ComponentInfo.PluginPay_A_100);
                xxz.e(this, safeIntent);
                finish();
                return true;
            }
        }
        return false;
    }

    private void a() {
        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();
        this.f30717c = weakHashMap;
        weakHashMap.put(ComponentInfo.PluginPay_A_258, ComponentInfo.PluginPay_A_47);
        this.f30717c.put("com.huawei.wear.wallet.action.HOUSEHOLD_MATCH", ComponentInfo.PluginPay_A_262);
        this.f30717c.put("com.huawei.wear.wallet.action.ADD_CARD", ComponentInfo.PluginPay_A_48);
        SafeIntent safeIntent = new SafeIntent(getIntent());
        this.d = safeIntent;
        this.e = safeIntent.getAction();
        xnd.b("ThirdInvokeActivity", "initParams action=" + this.e, false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
