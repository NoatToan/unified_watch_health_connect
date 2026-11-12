package com.huami.health.afppg.data.local.db;

import com.huami.health.afppg.data.local.IAFibDB;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.dao.AFibDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J,\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u001e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/health/afppg/data/local/db/AFibDB;", "Lcom/huami/health/afppg/data/local/IAFibDB;", "", "userId", "", "clearData", "", "source", "", "timestamp", "deleteData", "", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "getUnsyncedData", "fromTimestamp", "toTimestamp", "getAFData", "Lkotlinx/coroutines/flow/Flow;", "getAFDataFLow", "data", "insertNewData", "updateSyncedState", "Lcom/huami/health/afppg/data/local/dao/AFibDao;", "a", "Lcom/huami/health/afppg/data/local/dao/AFibDao;", "aFibDao", "<init>", "(Lcom/huami/health/afppg/data/local/dao/AFibDao;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class AFibDB implements IAFibDB {
    private static final int b = 1;
    private static final int c = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AFibDao aFibDao;

    public AFibDB(@NotNull AFibDao aFibDao) {
        this.aFibDao = aFibDao;
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    public void clearData(@NotNull String userId) {
        this.aFibDao.clear(userId);
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    public void deleteData(@NotNull String userId, long timestamp) {
        this.aFibDao.delete(userId, timestamp);
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    @NotNull
    public List<AFibData> getAFData(@NotNull String userId, @NotNull String fromTimestamp, @NotNull String toTimestamp) {
        return this.aFibDao.getAFibData(userId, fromTimestamp, toTimestamp, 1);
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    @NotNull
    public Flow<List<AFibData>> getAFDataFLow(@NotNull String userId, @NotNull String fromTimestamp, @NotNull String toTimestamp) {
        return this.aFibDao.getAFibDataFlow(userId, fromTimestamp, toTimestamp, 1);
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    @NotNull
    public List<AFibData> getUnsyncedData(@NotNull String userId, long timestamp) {
        return this.aFibDao.queryUnsyncedData(userId, timestamp);
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    public void insertNewData(@NotNull String userId, @NotNull List<AFibData> data) {
        Iterator<T> it2 = data.iterator();
        while (it2.hasNext()) {
            this.aFibDao.insert((AFibData) it2.next());
        }
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    public void updateSyncedState(@NotNull String userId, @NotNull List<Long> timestamp) {
        if (timestamp.isEmpty()) {
            return;
        }
        Long l = (Long) CollectionsKt.minOrNull((Iterable) timestamp);
        long jLongValue = l == null ? 0L : l.longValue();
        Long l2 = (Long) CollectionsKt.maxOrNull((Iterable) timestamp);
        List<AFibData> listQueryDataByTimestamps = this.aFibDao.queryDataByTimestamps(userId, jLongValue, l2 != null ? l2.longValue() : 0L);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryDataByTimestamps, 10));
        for (AFibData aFibData : listQueryDataByTimestamps) {
            aFibData.setSynced(1);
            this.aFibDao.updateSyncedState(aFibData);
            arrayList.add(Unit.INSTANCE);
        }
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    public void clearData(@NotNull String userId, int source) {
        if (source > 0) {
            this.aFibDao.clear(userId, source);
        } else {
            this.aFibDao.clear(userId);
        }
    }

    @Override // com.huami.health.afppg.data.local.IAFibDB
    public void deleteData(@NotNull String userId, @NotNull List<Long> timestamp) {
        if (timestamp.isEmpty()) {
            return;
        }
        this.aFibDao.deleteByTimeStamp(userId, timestamp);
    }
}
