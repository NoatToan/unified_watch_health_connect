package com.xiaomi.hm.health.firstbeat;

import com.huami.watch.dataflow.sync.bean.FirstbeatData;
import com.huami.watch.dataflow.sync.ble.BleFirstbeatSync;
import com.huami.widget.share.ShareAnalytics;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/firstbeat/SportEffectApiImpl;", "Lcom/xiaomi/hm/health/firstbeat/SportEffectApi;", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "outData", "", ShareAnalytics.ParamValue.SAVE, "", "syncStartTime", "timestamp", "saveSyncStartTime", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportEffectApiImpl implements SportEffectApi {

    @NotNull
    private static final String a = "SportEffectApiImpl";

    @Override // com.xiaomi.hm.health.firstbeat.SportEffectApi
    public void save(@NotNull BleFirstbeatData outData) {
        FirstbeatData firstbeatData = BleFirstbeatSync.parseFirstbeatData(outData);
        if (firstbeatData == null) {
            return;
        }
        FirstbeatManager.INSTANCE.save(firstbeatData);
    }

    @Override // com.xiaomi.hm.health.firstbeat.SportEffectApi
    public void saveSyncStartTime(long timestamp) {
    }

    @Override // com.xiaomi.hm.health.firstbeat.SportEffectApi
    public long syncStartTime() {
        return FirstbeatUtils.INSTANCE.getFirstbeatUpdateTime();
    }
}
