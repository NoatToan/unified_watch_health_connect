package com.xiaomi.hm.health.device.feature.sync.job.headset;

import com.huami.bluetooth.profile.gdsp.HearingHealthDayData;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/headset/IHearingInfoSyncJobHandler;", "", "", "Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "outData", "", "onDataOut", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IHearingInfoSyncJobHandler {
    void onDataOut(@NotNull List<HearingHealthDayData> outData);
}
