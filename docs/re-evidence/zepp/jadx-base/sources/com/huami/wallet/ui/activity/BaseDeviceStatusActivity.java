package com.huami.wallet.ui.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.huami.components.devicestatus.DeviceStatusFragment;
import com.huami.components.devicestatus.EnableChangeListener;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.WalletUI;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseDeviceStatusActivity extends AppCompatActivity {
    private FrameLayout a;
    private View b;
    public RainbowTitleBar mTitleBar;

    private void d() {
        DeviceStatusFragment deviceStatusFragment = new DeviceStatusFragment();
        deviceStatusFragment.setEnableChangeListener(new EnableChangeListener() { // from class: yp
            @Override // com.huami.components.devicestatus.EnableChangeListener
            public final void onEnableChange(boolean z) {
                this.a.e(z);
            }
        });
        deviceStatusFragment.setNavigator(WalletUI.getInstance().getDeviceStatusNavigator());
        deviceStatusFragment.setStringProvider(WalletUI.getInstance().getDeviceStatusStringProvider());
        getSupportFragmentManager().beginTransaction().replace(R.id.wl_header, deviceStatusFragment, DeviceStatusFragment.class.getName()).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(boolean z) {
        this.a.setForeground(z ? null : new ColorDrawable(ContextCompat.getColor(this, R.color.wl_disabled_mask)));
        this.b.setVisibility(z ? 8 : 0);
        this.b.setClickable(!z);
    }

    private void findViews() {
        this.a = (FrameLayout) findViewById(R.id.wl_content);
        this.b = findViewById(R.id.disabled_mask);
        this.mTitleBar = (RainbowTitleBar) findViewById(R.id.title_bar);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.a.addView(view, layoutParams);
    }

    public int getContentViewId() {
        return R.id.wl_content;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        setTheme(R.style.Theme_App);
        super.onCreate(bundle);
        super.setContentView(R.layout.wl_bus_base_title_content);
        findViews();
        d();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        this.a.removeAllViews();
        this.a.addView(view);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        this.a.removeAllViews();
        View.inflate(this, i, this.a);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.a.removeAllViews();
        this.a.addView(view, layoutParams);
    }
}
