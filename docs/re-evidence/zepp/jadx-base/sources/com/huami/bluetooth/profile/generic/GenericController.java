package com.huami.bluetooth.profile.generic;

import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.bluetooth.profile.ecf.data.Sn;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericController;", "", "", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getBatteryInfoList", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "getEqualizer", "Lcom/huami/bluetooth/profile/ecf/data/Sn;", "getSnList", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "getHeadsetKnockSetting", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "getDeviceFeature", "", "type", "", "getSensorDesc", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface GenericController {
    @Nullable
    List<BatteryInfo> getBatteryInfoList();

    @Nullable
    Feature getDeviceFeature();

    @Nullable
    Equalizer getEqualizer();

    @Nullable
    HeadsetKnockSetting getHeadsetKnockSetting();

    @Nullable
    byte[] getSensorDesc(int type);

    @NotNull
    List<Sn> getSnList();
}
