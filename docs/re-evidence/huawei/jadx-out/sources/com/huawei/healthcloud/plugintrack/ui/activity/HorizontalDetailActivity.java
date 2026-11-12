package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.fragment.PaceHorizontalFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.SegmentHorizontalFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.SegmentHorizontalFragKt;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.nub;

/* JADX INFO: loaded from: classes10.dex */
public class HorizontalDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10831b = 1.0f;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
            Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 != null) {
                bundle2.putParcelable("android:support:fragments", null);
            }
        }
        if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_track_fragment);
        this.f10831b = getResources().getConfiguration().fontScale;
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Track_HorizontalDetailActivity", "intent = null");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("fragment_tag");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.j("Track_HorizontalDetailActivity", "fragmentTag = null");
            finish();
            return;
        }
        if (stringExtra.equals("pace")) {
            LogUtil.a("Track_HorizontalDetailActivity", "from PACE_TAG");
            fragmentTransactionBeginTransaction.add(R.id.fragment_container, new PaceHorizontalFrag());
        } else if (stringExtra.equals("segmentation")) {
            LogUtil.a("Track_HorizontalDetailActivity", "from segmentation");
            int intExtra = intent.getIntExtra(BleConstants.SPORT_TYPE, -1);
            if (intExtra == -1) {
                LogUtil.j("Track_HorizontalDetailActivity", "intent sportType paras error: ", Integer.valueOf(intExtra));
                return;
            } else if (nub.e(intExtra)) {
                fragmentTransactionBeginTransaction.add(R.id.fragment_container, new SegmentHorizontalFragKt());
            } else {
                fragmentTransactionBeginTransaction.add(R.id.fragment_container, new SegmentHorizontalFrag());
            }
        } else {
            LogUtil.j("Track_HorizontalDetailActivity", "mFragmentTag exception");
            finish();
            return;
        }
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setTahitiModelOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setDefaultOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        b(1.0f);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        b(this.f10831b);
    }

    private void b(float f) {
        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.fontScale = f;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        finish();
    }
}
