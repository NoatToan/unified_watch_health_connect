package com.xiaomi.hm.health.device.setting.ui.widget;

import android.content.res.Resources;
import android.widget.TextView;
import com.facebook.internal.ServerProtocol;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/widget/DefaultBatteryLevelDisplayImpl;", "Lcom/xiaomi/hm/health/device/setting/ui/widget/BatteryLevelDisplay;", "Lcom/xiaomi/hm/health/device/setting/vo/DeviceConnectedVo;", "vo", "Landroid/widget/TextView;", "chargeText", "lastChargeText", "Landroid/content/res/Resources;", "resources", "", ServerProtocol.DIALOG_PARAM_DISPLAY, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultBatteryLevelDisplayImpl implements BatteryLevelDisplay {
    @Override // com.xiaomi.hm.health.device.setting.ui.widget.BatteryLevelDisplay
    public void display(@NotNull DeviceConnectedVo vo, @NotNull TextView chargeText, @NotNull TextView lastChargeText, @NotNull Resources resources) {
        String string;
        if (vo.getBatteryLevel() == -1) {
            return;
        }
        if (vo.isCharge()) {
            if (vo.getBatteryLevel() >= 100) {
                chargeText.setCompoundDrawablesRelative(null, null, null, null);
                chargeText.setText(R.string.mili_setting_charge_full);
                return;
            } else {
                chargeText.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_device_charge, 0, 0, 0);
                chargeText.postInvalidate();
                chargeText.setText(R.string.mili_setting_charging);
                return;
            }
        }
        if (vo.getLastChargeTime() != null && vo.getEarliestBoundTime() != null && vo.getLastChargeTime().get(1) != 1970) {
            if (vo.getLastChargeTime().after(vo.getEarliestBoundTime())) {
                string = resources.getQuantityString(R.plurals.mili_setting_last_charge, vo.getDeltaDay(), Integer.valueOf(vo.getDeltaDay()));
                if (vo.getDeltaDay() == 0) {
                    string = resources.getString(R.string.mili_setting_last_charge_today);
                } else if (vo.getDeltaDay() == 1) {
                    string = resources.getString(R.string.mili_setting_last_charge_yestoday);
                }
            } else {
                string = resources.getString(R.string.mili_setting_no_charge_after_bound);
            }
            lastChargeText.setText(string);
        }
        if (vo.getBatteryLevel() <= 10) {
            lastChargeText.setText(R.string.mili_setting_low_battery);
        }
    }
}
