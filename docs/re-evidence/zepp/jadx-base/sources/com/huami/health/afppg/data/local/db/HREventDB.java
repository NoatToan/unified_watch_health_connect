package com.huami.health.afppg.data.local.db;

import com.huami.health.afppg.data.local.IHREventDB;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.local.dao.HREventDao;
import com.tekartik.sqflite.Constant;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/health/afppg/data/local/db/HREventDB;", "Lcom/huami/health/afppg/data/local/IHREventDB;", "Lcom/huami/health/afppg/data/local/bean/HREventData;", "hrEvent", "", Constant.METHOD_INSERT, "", "dataList", "getUnsyncedData", "", "fromTime", "toTime", "subType", "queryDatas", "events", "updateSyncState", "Lcom/huami/health/afppg/data/local/dao/HREventDao;", "a", "Lcom/huami/health/afppg/data/local/dao/HREventDao;", "hrEventDao", "<init>", "(Lcom/huami/health/afppg/data/local/dao/HREventDao;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class HREventDB implements IHREventDB {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HREventDao hrEventDao;

    public HREventDB(@NotNull HREventDao hREventDao) {
        this.hrEventDao = hREventDao;
    }

    @Override // com.huami.health.afppg.data.local.IHREventDB
    @NotNull
    public List<HREventData> getUnsyncedData() {
        return this.hrEventDao.getUnsyncedData();
    }

    @Override // com.huami.health.afppg.data.local.IHREventDB
    public void insert(@NotNull HREventData hrEvent) {
        this.hrEventDao.insert(hrEvent);
    }

    @Override // com.huami.health.afppg.data.local.IHREventDB
    @NotNull
    public List<HREventData> queryDatas(@NotNull String fromTime, @NotNull String toTime, @NotNull String subType) {
        return subType.length() == 0 ? this.hrEventDao.query(fromTime, toTime) : this.hrEventDao.queryWithSubType(fromTime, toTime, subType);
    }

    @Override // com.huami.health.afppg.data.local.IHREventDB
    public void updateSyncState(@NotNull List<HREventData> events) {
        for (HREventData hREventData : events) {
            hREventData.setSynced(1);
            this.hrEventDao.updateSyncState(hREventData);
        }
    }

    @Override // com.huami.health.afppg.data.local.IHREventDB
    public void insert(@NotNull List<HREventData> dataList) {
        Iterator<T> it2 = dataList.iterator();
        while (it2.hasNext()) {
            this.hrEventDao.insert((HREventData) it2.next());
        }
    }
}
