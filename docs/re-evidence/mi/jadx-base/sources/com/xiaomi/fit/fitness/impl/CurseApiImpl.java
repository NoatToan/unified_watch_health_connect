package com.xiaomi.fit.fitness.impl;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.repo.curse.CurseRepo;
import com.xiaomi.fitness.repo.curse.CurseTimeItem;
import com.xiaomi.fitness.repo.curse.CurseUtilKt;
import com.xiaomi.fitness.repo.summary.SummaryPrefer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J&\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0002JV\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0016J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020\u0011H\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u0011H\u0016J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0016J\b\u0010(\u001a\u00020\u0011H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0011H\u0016J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0.H\u0016J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u0007H\u0016J\u0018\u00101\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/CurseApiImpl;", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "repo", "Lcom/xiaomi/fitness/repo/curse/CurseRepo;", "<init>", "(Lcom/xiaomi/fitness/repo/curse/CurseRepo;)V", "insert", "", "record", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "getLatestRecordByPage", "", "page", "", "pageNum", "getLatestEndedRecord", "startMills", "", "limit", "getLatestRecord", "updateRecord", "pre", "dest", "deleteSymptoms", "hasSelectedRegion", "batchActionRecord", "updateSummary", "deleteToggle", "insertToggle", "updateOri", "Lkotlin/Pair;", "getPeriod", "endMills", "getFirstAfter", "mills", "getBeforePeriod", "saveSymptom", EcgReportKey.symptom, "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "getSymptom", "getLastModifySec", "updateLastModify", "", "sec", "deleteRecord", "observerReportChange", "Lkotlinx/coroutines/flow/Flow;", "aggregateData", "force", "getCurseMaxUpdateTimeSec", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCurseApiImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseApiImpl.kt\ncom/xiaomi/fit/fitness/impl/CurseApiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n774#2:171\n865#2,2:172\n1971#2,14:174\n*S KotlinDebug\n*F\n+ 1 CurseApiImpl.kt\ncom/xiaomi/fit/fitness/impl/CurseApiImpl\n*L\n165#1:171\n165#1:172,2\n166#1:174,14\n*E\n"})
public final class CurseApiImpl implements CurseApi {

    @NotNull
    private final CurseRepo repo;

    public CurseApiImpl(@NotNull CurseRepo repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.repo = repo;
    }

    private final boolean hasSelectedRegion() {
        String currentRegion;
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        return (regionExtKt == null || (currentRegion = regionExtKt.getCurrentRegion()) == null || currentRegion.length() == 0) ? false : true;
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public void aggregateData(boolean force) {
        this.repo.aggregateData(force);
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public boolean batchActionRecord(@NotNull List<Record> updateSummary, @NotNull List<Record> deleteToggle, @NotNull List<Record> insertToggle, @Nullable Pair<Record, Record> updateOri, @NotNull List<Long> deleteSymptoms) {
        Intrinsics.checkNotNullParameter(updateSummary, "updateSummary");
        Intrinsics.checkNotNullParameter(deleteToggle, "deleteToggle");
        Intrinsics.checkNotNullParameter(insertToggle, "insertToggle");
        Intrinsics.checkNotNullParameter(deleteSymptoms, "deleteSymptoms");
        if (hasSelectedRegion()) {
            return this.repo.batchActionRecord(updateSummary, deleteToggle, insertToggle, updateOri, deleteSymptoms);
        }
        return false;
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public boolean deleteRecord(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (hasSelectedRegion()) {
            return this.repo.delete(record);
        }
        return false;
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @Nullable
    public Record getBeforePeriod(long startMills) {
        if (!hasSelectedRegion()) {
            return null;
        }
        return this.repo.getFirstBeforeRecord(FitnessDateUtils.changeToDestZeroTimeOneDay(startMills / ((long) 1000), FitnessDateUtils.getCurrentTZOffsetInSec(), 0));
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public long getCurseMaxUpdateTimeSec(long startMills, long endMills) {
        Object obj;
        if (!hasSelectedRegion()) {
            return 0L;
        }
        long j = 1000;
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(startMills / j, CurseUtilKt.getCurTZOffset(), 0);
        long jChangeToDestZeroTimeOneDay2 = FitnessDateUtils.changeToDestZeroTimeOneDay(endMills / j, CurseUtilKt.getCurTZOffset(), 0);
        List<CurseTimeItem> curseTimeItemList = this.repo.getCurseTimeItemList(jChangeToDestZeroTimeOneDay, jChangeToDestZeroTimeOneDay2);
        long jCurrentTimeMillis = System.currentTimeMillis() / j;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : curseTimeItemList) {
            if (((CurseTimeItem) obj2).getUpdateTime() <= jCurrentTimeMillis) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long updateTime = ((CurseTimeItem) next).getUpdateTime();
                do {
                    Object next2 = it.next();
                    long updateTime2 = ((CurseTimeItem) next2).getUpdateTime();
                    if (updateTime < updateTime2) {
                        next = next2;
                        updateTime = updateTime2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        CurseTimeItem curseTimeItem = (CurseTimeItem) obj;
        long updateTime3 = curseTimeItem != null ? curseTimeItem.getUpdateTime() : 0L;
        Logger.i("CurseApiImpl", "getMaxUpdateTime start" + jChangeToDestZeroTimeOneDay + ";end" + jChangeToDestZeroTimeOneDay2 + ";maxUpdate " + updateTime3 + ";items " + curseTimeItemList);
        return updateTime3;
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @Nullable
    public Record getFirstAfter(long mills) {
        if (!hasSelectedRegion()) {
            return null;
        }
        return this.repo.getFirstAfterRecord(FitnessDateUtils.changeToDestZeroTimeOneDay(mills / ((long) 1000), FitnessDateUtils.getCurrentTZOffsetInSec(), 0));
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public long getLastModifySec() {
        return SummaryPrefer.INSTANCE.getCURSE_LAST_MODIFY() / ((long) 1000);
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @NotNull
    public List<Record> getLatestEndedRecord(long startMills, int limit) {
        if (!hasSelectedRegion()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return this.repo.getLatestEnded(FitnessDateUtils.changeToDestZeroTimeOneDay(startMills / ((long) 1000), FitnessDateUtils.getCurrentTZOffsetInSec(), 0), limit);
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @NotNull
    public List<Record> getLatestRecord(long startMills, int limit) {
        if (!hasSelectedRegion()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return this.repo.getLatest(FitnessDateUtils.changeToDestZeroTimeOneDay(startMills / ((long) 1000), FitnessDateUtils.getCurrentTZOffsetInSec(), 0), limit);
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @NotNull
    public List<Record> getLatestRecordByPage(int page, int pageNum) {
        return !hasSelectedRegion() ? CollectionsKt__CollectionsKt.emptyList() : this.repo.getLatestByPage(page, pageNum);
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @NotNull
    public List<Record> getPeriod(long startMills, long endMills) {
        if (!hasSelectedRegion()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        long j = 1000;
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(startMills / j, currentTZOffsetInSec, 0);
        long jChangeToDestZeroTimeOneDay2 = FitnessDateUtils.changeToDestZeroTimeOneDay(endMills / j, currentTZOffsetInSec, 0);
        DailyRecordDaoUtils.INSTANCE.requestFromServer(HomeDataType.WOMEN_HEALTH, jChangeToDestZeroTimeOneDay, Long.valueOf(jChangeToDestZeroTimeOneDay2));
        return this.repo.getRecord(jChangeToDestZeroTimeOneDay, jChangeToDestZeroTimeOneDay2);
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @NotNull
    public WomenHealthSymptoms getSymptom(long mills) {
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(mills / ((long) 1000), CurseUtilKt.getCurTZOffset(), 0);
        if (!hasSelectedRegion()) {
            return new WomenHealthSymptoms(mills);
        }
        WomenHealthSymptoms symptom = this.repo.getSymptom(jChangeToDestZeroTimeOneDay);
        return symptom == null ? new WomenHealthSymptoms(mills) : symptom;
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public boolean insert(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (hasSelectedRegion()) {
            return this.repo.insert(record);
        }
        return false;
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @NotNull
    public Flow<Integer> observerReportChange() {
        return this.repo.observerReportChange();
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public boolean saveSymptom(@NotNull WomenHealthSymptoms symptom) {
        Intrinsics.checkNotNullParameter(symptom, "symptom");
        if (hasSelectedRegion()) {
            return this.repo.saveSymptom(symptom);
        }
        return false;
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public void updateLastModify(long sec) {
        Logger.i("CurseApiImpl", "updateLastModify " + sec);
        SummaryPrefer.INSTANCE.setCURSE_LAST_MODIFY(sec * ((long) 1000));
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    public boolean updateRecord(@NotNull Record pre, @NotNull Record dest, @NotNull List<Long> deleteSymptoms) {
        Intrinsics.checkNotNullParameter(pre, "pre");
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(deleteSymptoms, "deleteSymptoms");
        if (hasSelectedRegion()) {
            return this.repo.updateRecord(pre, dest, deleteSymptoms);
        }
        return false;
    }

    @Override // com.xiaomi.fit.fitness.export.api.CurseApi
    @NotNull
    public List<WomenHealthSymptoms> getSymptom(long startMills, long endMills) {
        if (!hasSelectedRegion()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long j = 1000;
        return this.repo.getSymptom(FitnessDateUtils.changeToDestZeroTimeOneDay(startMills / j, CurseUtilKt.getCurTZOffset(), 0), FitnessDateUtils.changeToDestZeroTimeOneDay(endMills / j, CurseUtilKt.getCurTZOffset(), 0));
    }
}
