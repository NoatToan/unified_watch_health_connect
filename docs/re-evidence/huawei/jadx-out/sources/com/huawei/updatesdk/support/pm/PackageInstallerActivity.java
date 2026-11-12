package com.huawei.updatesdk.support.pm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.updatesdk.fileprovider.UpdateSdkFileProvider;
import com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a;
import com.huawei.updatesdk.sdk.foundation.utils.d;
import com.huawei.updatesdk.sdk.foundation.utils.device.c;
import com.huawei.updatesdk.sdk.service.secure.b;
import com.huawei.updatesdk.service.download.e;
import java.io.File;

/* JADX INFO: loaded from: classes20.dex */
public class PackageInstallerActivity extends Activity {
    @Override // android.app.Activity
    protected void onDestroy() {
        finishActivity(1000);
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        requestWindowFeature(1);
        c.c().a(getWindow());
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            str = "PackageInstallerActivity error intent";
        } else {
            b bVarA = b.a(intent);
            String strA = bVarA.a("install_path");
            String strA2 = bVarA.a("install_packagename");
            if (!a(strA, bVarA.a("apk_sha256"))) {
                try {
                    Intent intentA = a(this, strA);
                    intentA.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                    intentA.putExtra("android.intent.extra.RETURN_RESULT", true);
                    a.c("PackageInstallerActivity", " onCreate filePath:" + strA + ",packageName:" + strA2 + ",taskId:" + getTaskId());
                    startActivityForResult(intentA, 1000);
                    return;
                } catch (Exception unused) {
                    a.b("PackageInstallerActivity", "can not start install action");
                    e.a(4, -2);
                    finish();
                    return;
                }
            }
            e.a(4, -3);
            finish();
            str = "PackageInstallerActivity can not find filePath.";
        }
        a.b("PackageInstallerActivity", str);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1000 == i) {
            if (i2 == 0) {
                e.a(7, 0);
            } else {
                int iA = intent != null ? b.a(intent).a("android.intent.extra.INSTALL_RESULT", -10004) : -10004;
                if (iA != 0 && iA != 1) {
                    e.a(4, iA);
                }
            }
        }
        finish();
    }

    private boolean a(String str, String str2) {
        return d.d(str) || TextUtils.isEmpty(str2) || !str2.equalsIgnoreCase(d.a(str, "SHA-256"));
    }

    private Intent a(Context context, String str) {
        if (d.d(str)) {
            throw new IllegalArgumentException("getNormalInstallIntent: Not a standard path");
        }
        File file = new File(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.INSTALL_PACKAGE");
        intent.addFlags(1);
        String str2 = context.getApplicationContext().getPackageName() + UpdateSdkFileProvider.AUTHORITIES_SUFFIX;
        if (!d.d(str2)) {
            intent.setData(UpdateSdkFileProvider.getUriForFile(context, str2, file));
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }
}
