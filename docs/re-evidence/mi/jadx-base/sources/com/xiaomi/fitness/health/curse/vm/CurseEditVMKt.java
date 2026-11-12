package com.xiaomi.fitness.health.curse.vm;

import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.DayData;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005\u001a\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\r\u001a\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"TAG_L", "", "calendarActionRecord", "", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "calendarActionEnd", "record", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "newEndMills", "actionDelete", "actionDataProvider", "", "mills", "targetType", "dealCurseMarkAction", "records", "", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCurseEditVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseEditVM.kt\ncom/xiaomi/fitness/health/curse/vm/CurseEditVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,313:1\n1#2:314\n*E\n"})
public final class CurseEditVMKt {

    @NotNull
    private static final String TAG_L = "CurseEditVM";

    public static final int actionDataProvider(long j, int i) {
        Logger.i(TAG_L, "actionDataProvider targetType " + i + ";millis " + j);
        if (i != 1 && i != 2) {
            return -1;
        }
        LinkedHashMap<Long, DayData> monthPeriod = CurseMonthVMKt.getMonthPeriod(new LocalDate(j));
        long zeroMills = CurseExtKt.getZeroMills(j);
        int iFetchOperationMode = CurseMonthVMKt.fetchOperationMode(j, monthPeriod);
        DayData dayData = monthPeriod.get(Long.valueOf(zeroMills));
        Logger.i(TAG_L, "actionDataProvider record:" + dayData + ";fetchMode:" + iFetchOperationMode);
        if (i != iFetchOperationMode) {
            return iFetchOperationMode;
        }
        if (dayData == null) {
            return -1;
        }
        dealCurseMarkAction(zeroMills, monthPeriod);
        return iFetchOperationMode;
    }

    public static final void actionDelete(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "record");
        Record beforePeriod = FitnessDataExtKt.getCurseApi().getBeforePeriod(record.getStartMills());
        if (beforePeriod != null) {
            Record firstAfter = FitnessDataExtKt.getCurseApi().getFirstAfter(record.getStartMills());
            beforePeriod.setInterval(firstAfter != null ? TimeDateUtil.getIntervalDay(beforePeriod.getStartMills(), firstAfter.getStartMills()) : CurseManager.INSTANCE.getInstance().getInterval());
            Logger.i(TAG_L, "actionDelete: before = " + beforePeriod + "; after = " + firstAfter);
            CurseApi.DefaultImpls.batchActionRecord$default(FitnessDataExtKt.getCurseApi(), CollectionsKt__CollectionsJVMKt.listOf(beforePeriod), CollectionsKt__CollectionsJVMKt.listOf(record), null, null, CurseExtKt.genSymptomKeys(record.getStartMills(), record.getEndMills()), 12, null);
        } else {
            FitnessDataExtKt.getCurseApi().deleteRecord(record);
        }
        FitnessDataExtKt.getCurseApi().updateLastModify(System.currentTimeMillis() / ((long) 1000));
        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "add_or_delete", null, 4, null);
    }

    public static final void calendarActionEnd(@NotNull Record record, long j) {
        Intrinsics.checkNotNullParameter(record, "record");
        Record recordCopy = CurseRecordKt.copy(record);
        record.setEndMills(j);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        record.setUpdateTime(jCurrentTimeMillis);
        Logger.i(TAG_L, "calendarActionEnd: " + record);
        FitnessDataExtKt.getCurseApi().updateRecord(recordCopy, record, CurseExtKt.genSymptomKeys(j + 86400000, recordCopy.getEndMills()));
        FitnessDataExtKt.getCurseApi().updateLastModify(jCurrentTimeMillis);
    }

    public static final void calendarActionRecord(long j, long j2) {
        Record record;
        Pair pair;
        Object next;
        Object next2;
        Pair pair2;
        Record recordCopy;
        Object next3;
        int interval = CurseManager.INSTANCE.getInstance().getInterval();
        long zeroMills = CurseExtKt.getZeroMills(j);
        long zeroMills2 = CurseExtKt.getZeroMills(j2);
        long j3 = zeroMills - CurseRecordKt.SPACE_MIN_MILLS;
        long j4 = zeroMills2 + CurseRecordKt.SPACE_MIN_MILLS;
        Logger.i(TAG_L, "actionRecord: startMills = " + zeroMills + "; endMills = " + zeroMills2 + ";  cycle = " + interval);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<Record> period = FitnessDataExtKt.getCurseApi().getPeriod(j3, j4);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        List<Record> list = period;
        if (list == null || list.isEmpty()) {
            Logger.d(TAG_L, "actionRecord: no conflict");
            Record firstAfter = FitnessDataExtKt.getCurseApi().getFirstAfter(zeroMills2);
            if (firstAfter != null) {
                interval = TimeDateUtil.getIntervalDay(zeroMills, firstAfter.getStartMills());
            }
            int i = interval;
            Record beforePeriod = FitnessDataExtKt.getCurseApi().getBeforePeriod(zeroMills);
            if (beforePeriod != null) {
                beforePeriod.setInterval(TimeDateUtil.getIntervalDay(beforePeriod.getStartMills(), zeroMills));
                arrayList.add(beforePeriod);
            }
            record = new Record(zeroMills, zeroMills2, jCurrentTimeMillis, i, 0, 16, null);
            pair = null;
        } else {
            List<Record> list2 = period;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Record record2 = (Record) next;
                if (record2.getEndMills() <= zeroMills && zeroMills - record2.getEndMills() <= CurseRecordKt.SPACE_MIN_MILLS) {
                    break;
                }
            }
            Record record3 = (Record) next;
            if (record3 != null) {
                recordCopy = CurseRecordKt.copy(record3);
                recordCopy.setEndMills(zeroMills);
                recordCopy.setUpdateTime(jCurrentTimeMillis);
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                    Record record4 = (Record) next3;
                    if (record4.getStartMills() >= zeroMills && record4.getStartMills() - zeroMills <= CurseRecordKt.SPACE_MIN_MILLS) {
                        break;
                    }
                }
                Record record5 = (Record) next3;
                if (record5 != null) {
                    recordCopy.setEndMills(record5.getEndMills());
                    arrayList2.add(record5);
                }
                pair2 = new Pair(record3, recordCopy);
                Logger.d(TAG_L, "actionRecord: before = " + record3 + "; after = " + record5 + ", final = " + recordCopy);
            } else {
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    Record record6 = (Record) next2;
                    if (record6.getStartMills() >= zeroMills && record6.getStartMills() - zeroMills2 <= CurseRecordKt.SPACE_MIN_MILLS) {
                        break;
                    }
                }
                Record record7 = (Record) next2;
                if (record7 != null) {
                    recordCopy = CurseRecordKt.copy(record7);
                    recordCopy.setStartMills(zeroMills);
                    recordCopy.setUpdateTime(jCurrentTimeMillis);
                    pair2 = new Pair(record7, recordCopy);
                    Logger.d(TAG_L, "actionRecord: after = " + record7 + ", final = " + recordCopy);
                } else {
                    pair2 = null;
                    recordCopy = null;
                }
            }
            if (recordCopy != null) {
                Record firstAfter2 = FitnessDataExtKt.getCurseApi().getFirstAfter(recordCopy.getEndMills());
                if (firstAfter2 != null) {
                    interval = TimeDateUtil.getIntervalDay(recordCopy.getStartMills(), firstAfter2.getStartMills());
                }
                recordCopy.setInterval(interval);
                Record beforePeriod2 = FitnessDataExtKt.getCurseApi().getBeforePeriod(recordCopy.getStartMills());
                if (beforePeriod2 != null) {
                    beforePeriod2.setInterval(TimeDateUtil.getIntervalDay(beforePeriod2.getStartMills(), recordCopy.getStartMills()));
                    arrayList.add(beforePeriod2);
                    Logger.d(TAG_L, "actionRecord: before = " + beforePeriod2);
                }
                arrayList.add(recordCopy);
                Logger.d(TAG_L, "actionRecord: finalRecord = " + recordCopy);
            }
            pair = pair2;
            record = null;
        }
        CurseApi.DefaultImpls.batchActionRecord$default(FitnessDataExtKt.getCurseApi(), arrayList, arrayList2, record != null ? CollectionsKt__CollectionsJVMKt.listOf(record) : CollectionsKt__CollectionsKt.emptyList(), pair, null, 16, null);
        FitnessDataExtKt.getCurseApi().updateLastModify(jCurrentTimeMillis);
    }

    public static final void dealCurseMarkAction(long j, @NotNull Map<Long, DayData> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        DayData dayData = records.get(Long.valueOf(CurseExtKt.getZeroMills(j)));
        if (dayData == null) {
            return;
        }
        int iFetchOperationMode = CurseMonthVMKt.fetchOperationMode(j, records);
        Logger.i(TAG_L, "dealCurseMarkAction " + j + ",mode " + iFetchOperationMode);
        long zeroMills = CurseExtKt.getZeroMills(dayData.getTime());
        if (iFetchOperationMode == 1) {
            int inDays = CurseManager.INSTANCE.getInstance().getInDays();
            Logger.i(TAG_L, "dealCurseMarkAction mark start days " + inDays);
            if (inDays <= 0) {
                inDays = 5;
            }
            calendarActionRecord(zeroMills, (((long) (inDays - 1)) * 86400000) + zeroMills);
            return;
        }
        if (iFetchOperationMode == 2) {
            if (!dayData.isIn()) {
                calendarActionRecord(zeroMills, zeroMills);
                return;
            }
            Record record = dayData.getRecord();
            Intrinsics.checkNotNull(record);
            calendarActionEnd(record, zeroMills);
            return;
        }
        if (iFetchOperationMode != 3) {
            return;
        }
        if (dayData.isFirstDay()) {
            Record record2 = dayData.getRecord();
            Intrinsics.checkNotNull(record2);
            actionDelete(record2);
        } else if (dayData.isEndDay()) {
            Record record3 = dayData.getRecord();
            Intrinsics.checkNotNull(record3);
            calendarActionEnd(record3, zeroMills - 86400000);
        }
    }
}
