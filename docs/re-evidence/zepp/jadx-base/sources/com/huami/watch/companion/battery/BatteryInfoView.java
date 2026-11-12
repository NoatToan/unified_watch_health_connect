package com.huami.watch.companion.battery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.battery.bean.BatteryInfo;
import com.huami.watch.companion.device.DeviceManager;

/* JADX INFO: loaded from: classes16.dex */
public class BatteryInfoView extends RelativeLayout {
    private View a;
    private TextView b;
    private TextView c;
    private TextView d;
    private ImageView e;

    public BatteryInfoView(Context context) {
        super(context);
    }

    public void checkShowHideState(Context context) {
        if (DeviceManager.getManager(context).hasBoundDevice()) {
            show();
        } else {
            hide();
        }
    }

    public void hide() {
        setVisibility(8);
    }

    public void onDeviceConnected() {
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        this.b.setText(getContext().getString(R.string.battery_info_loading));
        this.e.setImageResource(R.drawable.battery_level_icon);
        this.e.getDrawable().setLevel(0);
    }

    public void onDeviceDisconnected() {
        this.b.setText(getContext().getString(R.string.battery_info_load_failed));
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        this.e.setImageResource(R.drawable.ic_title_icon_power_none);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.available_battery_info);
        this.a = findViewById(R.id.battery_info_area);
        this.d = (TextView) findViewById(R.id.last_charging_days_counter);
        this.b = (TextView) findViewById(R.id.battery_info_tips);
        this.e = (ImageView) findViewById(R.id.battery_icon);
    }

    public void show() {
        setVisibility(0);
    }

    public void updateBatteryViews(Context context, BatteryInfo batteryInfo) {
        if (DeviceManager.getManager(context).getCurrentDevice() != null) {
            int batteryLevel = batteryInfo.getBatteryLevel();
            this.b.setVisibility(8);
            this.a.setVisibility(0);
            this.c.setText(context.getString(R.string.battery_available, String.valueOf(batteryLevel)) + "%");
            if (batteryInfo.isBatteryCharging()) {
                this.d.setText(context.getString(R.string.charging));
                this.e.setImageResource(R.drawable.ic_title_icon_charge);
            } else {
                this.d.setText(BatteryInfoHelper.formatBatteryIntervalText(context, batteryInfo.getBatteryIntervalDay(), batteryInfo.getBatteryChargingTime()));
                this.e.setImageResource(R.drawable.battery_level_icon);
                this.e.getDrawable().setLevel(batteryLevel);
            }
        }
    }

    public BatteryInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BatteryInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
