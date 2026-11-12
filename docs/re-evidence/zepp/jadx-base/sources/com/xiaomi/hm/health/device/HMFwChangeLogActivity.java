package com.xiaomi.hm.health.device;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.firmware.FwUpgradeFeature;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeActivity;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwChangeLogActivity extends BaseTitleActivity {
    private String x = null;

    private void initView() {
        ((TextView) findViewById(R.id.fw_change_log_content)).setText(this.x);
    }

    private String l() {
        return getString(FwUpgradeFeature.supportSilentUpgrade(HMDeviceType.MILI) ? R.string.system_update_log : R.string.fw_upgrade_log_title);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fw_change_log);
        UnifyTitleBarStyle.setUnifyTitleStyle(this, l());
        setBaseTitleColor(ContextCompat.getColor(this, R.color.black70));
        Intent intent = getIntent();
        if (intent != null) {
            this.x = intent.getStringExtra(HMFwUpgradeActivity.FW_UPGRADE_CHANGE_LOG);
        }
        EventBus.getDefault().register(this);
        initView();
    }

    public void onEventMainThread(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        if (hMDeviceFwUpgradeEvent.isStop()) {
            finish();
        }
    }
}
