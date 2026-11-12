package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.fragment.TrackLineChartActivityChartFrag;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.jaq;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes10.dex */
public class TrackLineChartActivity extends BaseActivity {
    private TrackLineChartActivityChartFrag e = new TrackLineChartActivityChartFrag();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        clearBackgroundDrawable();
        setContentView(R.layout.activity_track_fragment);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.fragment_container, this.e);
        fragmentTransactionBeginTransaction.commit();
        jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
        if (jaqVar.aa() || !c()) {
            return;
        }
        jaqVar.a(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        this.e = new TrackLineChartActivityChartFrag();
        fragmentTransactionBeginTransaction.replace(R.id.fragment_container, this.e);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setRootViewBackgroundColor(View view) {
        super.setRootViewBackgroundColor(view);
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorSubBackground));
    }

    private boolean c() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Track_TrackLineChartActivity", "intent null,return");
            return true;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            LogUtil.j("Track_TrackLineChartActivity", "intent null,return");
            return true;
        }
        String str = (String) extras.getCharSequence("KEY_BASELINE");
        if (!TextUtils.isEmpty(str)) {
            return (str.equals("BASELINE_JUMP_TIME") || str.equals("BASELINE_JUMP_HEIGHT")) ? false : true;
        }
        LogUtil.j("Track_TrackLineChartActivity", "baseLine isEmpty,return");
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        LogUtil.a("Track_TrackLineChartActivity", "onConfigurationChanged");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TrackLineChartActivityChartFrag trackLineChartActivityChartFrag = this.e;
        if (trackLineChartActivityChartFrag != null) {
            trackLineChartActivityChartFrag.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setTahitiModelOrientation() {
        setRequestedOrientation(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void setDefaultOrientation() {
        setRequestedOrientation(0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        finish();
    }
}
