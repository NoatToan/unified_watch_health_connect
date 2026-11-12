package com.xiaomi.hm.health.device.firmware;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwUpgradeLowBatteryActivity extends BaseTitleActivity {
    private static final int A = 1;
    private static final int B = 2;
    private static final String x = "key_low_battery_type";
    private static final String y = "key_device_type";
    private static final int z = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        finish();
    }

    public static void showEarbudHelper(Context context) {
        Intent intent = new Intent(context, (Class<?>) HMFwUpgradeLowBatteryActivity.class);
        intent.putExtra(x, 2);
        intent.putExtra(y, HMDeviceType.EARBUD);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void showMiliHelper(Context context) {
        Intent intent = new Intent(context, (Class<?>) HMFwUpgradeLowBatteryActivity.class);
        intent.putExtra(x, 0);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void showNormandyHelper(Context context) {
        Intent intent = new Intent(context, (Class<?>) HMFwUpgradeLowBatteryActivity.class);
        intent.putExtra(x, 1);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void showOtherHelper(Context context, HMDeviceType hMDeviceType) {
        Intent intent = new Intent(context, (Class<?>) HMFwUpgradeLowBatteryActivity.class);
        intent.putExtra(x, 1);
        intent.putExtra(y, hMDeviceType.getValue());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_fw_low_battery);
        TextView textView = (TextView) findViewById(R.id.low_battery_title);
        TextView textView2 = (TextView) findViewById(R.id.low_battery_tips);
        int intExtra = getIntent().getIntExtra(x, 0);
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(getIntent().getIntExtra(y, HMDeviceType.VDevice.getValue()));
        if (intExtra == 1) {
            if (hMDeviceTypeFromValue == HMDeviceType.HEADSET) {
                textView.setText(R.string.mili_low_battery_title_headset);
                textView2.setText(R.string.mili_low_battery_tips_headset);
            } else {
                int i = R.string.normandy_low_battery_fw_title;
                int i2 = R.string.chip_device_name;
                textView.setText(getString(i, new Object[]{getString(i2)}));
                textView2.setText(getString(R.string.normandy_low_battery_fw_tips, new Object[]{getString(i2)}));
            }
        } else if (intExtra == 0) {
            if (HMDeviceConfig.hasBoundWatch()) {
                textView.setText(R.string.mili_low_battery_title_watch);
                textView2.setText(R.string.mili_low_battery_tips_watch);
            }
        } else if (intExtra == 2) {
            textView.setText(R.string.earbud_low_battery_title);
            textView2.setText(R.string.earbud_low_battery_tips);
        }
        UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
        findViewById(R.id.low_battery_ok_btn).setOnClickListener(new View.OnClickListener() { // from class: dw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
    }
}
