package com.xiaomi.hm.health.device.setting.ui.widget;

import android.content.res.Resources;
import android.widget.TextView;
import com.facebook.internal.ServerProtocol;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/widget/BatteryLevelDisplay;", "", "Lcom/xiaomi/hm/health/device/setting/vo/DeviceConnectedVo;", "vo", "Landroid/widget/TextView;", "chargeText", "lastChargeText", "Landroid/content/res/Resources;", "resources", "", ServerProtocol.DIALOG_PARAM_DISPLAY, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface BatteryLevelDisplay {
    void display(@NotNull DeviceConnectedVo vo, @NotNull TextView chargeText, @NotNull TextView lastChargeText, @NotNull Resources resources);
}
