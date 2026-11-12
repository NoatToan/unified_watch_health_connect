package com.xiaomi.fitness.repo.healthconnect.biz.daily;

import android.text.TextUtils;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.metadata.Device;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectExtKt;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.SleepSyncBiz;
import com.xiaomi.fitness.repo.sleep.utils.SleepAggregateUtils;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/SleepSyncBiz;", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/BaseSyncBiz;", "Landroidx/health/connect/client/records/SleepSessionRecord;", "<init>", "()V", "TAG", "", "getType", "isAggregateAble", "", "generateHealthConnectRecordByTimeRange", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/GeneratedHandleRecordsInfo;", "timeRange", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/TimeRange;", "entities", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "buildSleepSessionRecords", "sleepSegments", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "clientRecordId", "buildSleepSessionRecord", "report", "getSleepStage", "", "sleepState", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepSyncBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepSyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/daily/SleepSyncBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1863#2,2:143\n1863#2,2:145\n1863#2,2:147\n*S KotlinDebug\n*F\n+ 1 SleepSyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/daily/SleepSyncBiz\n*L\n49#1:143,2\n84#1:145,2\n93#1:147,2\n*E\n"})
public final class SleepSyncBiz extends BaseSyncBiz<SleepSessionRecord> {

    @NotNull
    private final String TAG = "SleepSyncBiz";

    private final SleepSessionRecord buildSleepSessionRecord(SleepSegmentReport report, String clientRecordId) {
        ArrayList arrayList = new ArrayList();
        if (report.getSleepItems() != null) {
            List<SleepStateItem> sleepItems = report.getSleepItems();
            if (sleepItems != null) {
                for (SleepStateItem sleepStateItem : sleepItems) {
                    Instant instantOfEpochSecond = Instant.ofEpochSecond(sleepStateItem.getStartTime());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                    Instant instantOfEpochSecond2 = Instant.ofEpochSecond(sleepStateItem.getEndTime());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
                    arrayList.add(new SleepSessionRecord.Stage(instantOfEpochSecond, instantOfEpochSecond2, getSleepStage(sleepStateItem.getSleepState())));
                }
            }
        } else {
            Instant instantOfEpochSecond3 = Instant.ofEpochSecond(report.getBedTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond3, "ofEpochSecond(...)");
            Instant instantOfEpochSecond4 = Instant.ofEpochSecond(report.getWakeupTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond4, "ofEpochSecond(...)");
            arrayList.add(new SleepSessionRecord.Stage(instantOfEpochSecond3, instantOfEpochSecond4, 0));
            Logger.d(this.TAG, "sleep-none-state-range(" + report.getBedTime() + "-" + report.getWakeupTime() + ")");
        }
        final Function2 function2 = new Function2() { // from class: a0n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepSyncBiz.buildSleepSessionRecord$lambda$5((SleepSessionRecord.Stage) obj, (SleepSessionRecord.Stage) obj2));
            }
        };
        CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: b0n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepSyncBiz.buildSleepSessionRecord$lambda$6(function2, obj, obj2);
            }
        });
        int tzOffsetInSecBy15min = FitnessDateUtils.getTzOffsetInSecBy15min(report.getTzIn15Min());
        Instant instantOfEpochSecond5 = Instant.ofEpochSecond(report.getBedTime());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond5, "ofEpochSecond(...)");
        Instant instantOfEpochSecond6 = Instant.ofEpochSecond(report.getWakeupTime());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond6, "ofEpochSecond(...)");
        return new SleepSessionRecord(instantOfEpochSecond5, ZoneOffset.ofTotalSeconds(tzOffsetInSecBy15min), instantOfEpochSecond6, ZoneOffset.ofTotalSeconds(tzOffsetInSecBy15min), null, null, arrayList, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, clientRecordId, System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null), 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildSleepSessionRecord$lambda$5(SleepSessionRecord.Stage stage, SleepSessionRecord.Stage stage2) {
        Instant startTime;
        Instant startTime2;
        long epochSecond = 0;
        long epochSecond2 = (stage == null || (startTime2 = stage.getStartTime()) == null) ? 0L : startTime2.getEpochSecond();
        if (stage2 != null && (startTime = stage2.getStartTime()) != null) {
            epochSecond = startTime.getEpochSecond();
        }
        return (int) (epochSecond2 - epochSecond);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildSleepSessionRecord$lambda$6(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final List<SleepSessionRecord> buildSleepSessionRecords(List<SleepSegmentReport> sleepSegments, String clientRecordId) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sleepSegments.iterator();
        while (it.hasNext()) {
            arrayList.add(buildSleepSessionRecord((SleepSegmentReport) it.next(), clientRecordId));
        }
        return arrayList;
    }

    private final int getSleepStage(int sleepState) {
        if (sleepState == 2) {
            return 5;
        }
        if (sleepState == 3) {
            return 4;
        }
        if (sleepState != 4) {
            return sleepState != 5 ? 0 : 1;
        }
        return 6;
    }

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    @NotNull
    public GeneratedHandleRecordsInfo<SleepSessionRecord> generateHealthConnectRecordByTimeRange(@NotNull TimeRange timeRange, @NotNull List<HealthConnectSyncDaoEntity> entities) {
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        Intrinsics.checkNotNullParameter(entities, "entities");
        if (entities.isEmpty()) {
            Logger.i(this.TAG, timeRange.getStartTimeStamp() + "-" + timeRange.getEndTimeStamp() + " has empty records!!");
            return emptyRecordsInfo();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int timeZoneOffset = 0;
        String clientRecordId = "";
        for (HealthConnectSyncDaoEntity healthConnectSyncDaoEntity : entities) {
            if (!HealthConnectExtKt.isDeleted(healthConnectSyncDaoEntity)) {
                SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) FitnessPersistUtils.INSTANCE.fromJson(healthConnectSyncDaoEntity.getValue(), SleepSegmentReport.class);
                if (sleepSegmentReport != null) {
                    arrayList2.add(sleepSegmentReport);
                } else {
                    Logger.e(this.TAG, "sleep segment empty!!");
                }
                if (timeZoneOffset <= 0) {
                    timeZoneOffset = healthConnectSyncDaoEntity.getTimeZoneOffset();
                }
                if (TextUtils.isEmpty(clientRecordId)) {
                    clientRecordId = healthConnectSyncDaoEntity.getClientRecordId();
                }
            } else if (!HealthConnectExtKt.isSynced(healthConnectSyncDaoEntity)) {
                arrayList.add(healthConnectSyncDaoEntity);
            }
        }
        List<SleepSegmentReport> listAggregateDaySleep = SleepAggregateUtils.INSTANCE.aggregateDaySleep(arrayList2);
        Logger.d(this.TAG, "time-range(" + timeRange.getStartTimeStamp() + "-" + timeRange.getEndTimeStamp() + ") segment-size:" + listAggregateDaySleep.size());
        return new GeneratedHandleRecordsInfo<>(null, new AggregateAbleRecordsInfo(buildSleepSessionRecords(listAggregateDaySleep, clientRecordId != null ? clientRecordId : ""), null, 2, null), 1, null);
    }

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    @NotNull
    public String getType() {
        return "sleep";
    }

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    public boolean isAggregateAble() {
        return true;
    }
}
