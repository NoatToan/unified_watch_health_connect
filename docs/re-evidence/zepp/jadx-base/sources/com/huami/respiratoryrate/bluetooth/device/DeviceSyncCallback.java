package com.huami.respiratoryrate.bluetooth.device;

import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateData;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/respiratoryrate/bluetooth/device/DeviceSyncCallback;", "", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateData;", "data", "", "onFinished", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceSyncCallback {
    void onFinished(@Nullable List<BreathRateData> data);
}
