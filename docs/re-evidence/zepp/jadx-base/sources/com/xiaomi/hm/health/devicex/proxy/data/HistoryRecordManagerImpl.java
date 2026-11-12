package com.xiaomi.hm.health.devicex.proxy.data;

import com.huami.devicex.injection.data.HistoryRecordManagerApi;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/HistoryRecordManagerImpl;", "Lcom/huami/devicex/injection/data/HistoryRecordManagerApi;", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "trackRecords", "", "updateTrackRecordsToStatData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HistoryRecordManagerImpl implements HistoryRecordManagerApi {
    @Override // com.huami.devicex.injection.data.HistoryRecordManagerApi
    public void updateTrackRecordsToStatData(@NotNull List<? extends Trackrecord> trackRecords) {
        HistoryRecordManager.getInstance().updateTrackRecordsToStatData(trackRecords);
    }
}
