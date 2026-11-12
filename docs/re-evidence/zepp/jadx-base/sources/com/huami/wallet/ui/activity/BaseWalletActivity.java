package com.huami.wallet.ui.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.helper.WalletPageHelper;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseWalletActivity extends BaseDeviceStatusActivity {
    @Override // com.huami.wallet.ui.activity.BaseDeviceStatusActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        super.setContentView(R.layout.wl_bus_base_title_content);
        WalletPageHelper.getInstance().onActivityCreated(this, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WalletPageHelper.getInstance().onActivityDestroyed(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        WalletPageHelper.getInstance().onActivityPaused(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        WalletPageHelper.getInstance().onActivityResumed(this);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        WalletPageHelper.getInstance().onActivitySaveInstanceState(this, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        WalletPageHelper.getInstance().onActivityStarted(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        WalletPageHelper.getInstance().onActivityStopped(this);
    }
}
