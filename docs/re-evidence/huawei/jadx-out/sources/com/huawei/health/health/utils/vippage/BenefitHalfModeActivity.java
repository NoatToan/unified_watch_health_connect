package com.huawei.health.health.utils.vippage;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.faw;
import defpackage.fbb;

/* JADX INFO: loaded from: classes.dex */
public class BenefitHalfModeActivity extends BaseActivity {
    private fbb e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackgroundDrawableResource(R.color.series_top_big_image_foreground);
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("BenefitHalfModeActivity", "intent is null");
            finish();
            return;
        }
        BaseDeviceBenefitInfo baseDeviceBenefitInfo = (BaseDeviceBenefitInfo) intent.getParcelableExtra("benefitInfo");
        if (baseDeviceBenefitInfo == null) {
            LogUtil.j("BenefitHalfModeActivity", "benefitInfo is null");
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("fromPage", -1);
        int intExtra2 = intent.getIntExtra("needToConcatType", 0);
        fbb fbbVar = new fbb(this, intExtra2, baseDeviceBenefitInfo, intExtra);
        this.e = fbbVar;
        fbbVar.setCancelable(true);
        this.e.show();
        this.e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: faz
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f33800b.a(dialogInterface);
            }
        });
        if (intExtra != -1) {
            faw.e(baseDeviceBenefitInfo, intExtra, intExtra2);
            LogUtil.a("BenefitHalfModeActivity", "fromPage is valid");
        }
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        LogUtil.a("BenefitHalfModeActivity", "BenefitRedemptionDialog dismiss");
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 1001) {
            this.e.d();
        }
        if (i == 10000) {
            this.e.c(intent != null ? intent.getIntExtra("shoppingResult", -1) : -1);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
