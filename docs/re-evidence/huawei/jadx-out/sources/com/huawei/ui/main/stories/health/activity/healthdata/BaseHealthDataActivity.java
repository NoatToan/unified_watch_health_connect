package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.vng;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class BaseHealthDataActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelMarginAdaptation();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.common_transparent);
        }
        vng.e((Bundle) null);
        String strD = DfxUtils.d(Thread.currentThread(), null);
        ReleaseLogUtil.d("HealthWeight_BaseHealthDataActivity", "onCreate window ", window, " stackTraceInfo ", strD);
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("HealthWeight_BaseHealthDataActivity", strD);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
