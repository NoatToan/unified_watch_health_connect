package com.huawei.health.health.utils.vippage.dataauthority;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.fck;
import defpackage.fcl;

/* JADX INFO: loaded from: classes28.dex */
public class HealthDataAuthorityActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fck f7111b;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackgroundDrawableResource(R.color.series_top_big_image_foreground);
        final Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("HealthDataAuthorityActivity", "intent is null");
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("fromPage", -1);
        if (intExtra != -1) {
            fcl.b();
        }
        fck fckVar = new fck(this, intExtra);
        this.f7111b = fckVar;
        fckVar.setCancelable(true);
        this.f7111b.show();
        this.f7111b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fcm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.d.d(intent, dialogInterface);
            }
        });
    }

    public /* synthetic */ void d(Intent intent, DialogInterface dialogInterface) {
        LogUtil.a("HealthDataAuthorityActivity", "HealthDataAuthorityActivity dismiss");
        setResult(-1, intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        fck fckVar = this.f7111b;
        if (fckVar != null) {
            fckVar.b();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
