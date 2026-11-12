package com.xiaomi.fitness.repo.healthconnect.biz.daily;

import android.text.TextUtils;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.metadata.Device;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.RepoUtils;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectExtKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/StepSyncBiz;", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/BaseSyncBiz;", "Landroidx/health/connect/client/records/StepsRecord;", "<init>", "()V", "TAG", "", "getType", "isAggregateAble", "", "generateHealthConnectRecordByTimeRange", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/GeneratedHandleRecordsInfo;", "timeRange", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/TimeRange;", "entities", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepSyncBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepSyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/daily/StepSyncBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,93:1\n1863#2,2:94\n1863#2,2:97\n216#3:96\n217#3:99\n*S KotlinDebug\n*F\n+ 1 StepSyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/daily/StepSyncBiz\n*L\n43#1:94,2\n62#1:97,2\n60#1:96\n60#1:99\n*E\n"})
public final class StepSyncBiz extends BaseSyncBiz<StepsRecord> {

    @NotNull
    private final String TAG = "StepSyncBiz";

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    @NotNull
    public GeneratedHandleRecordsInfo<StepsRecord> generateHealthConnectRecordByTimeRange(@NotNull TimeRange timeRange, @NotNull List<HealthConnectSyncDaoEntity> entities) {
        String str;
        HealthConnectSyncDaoEntity healthConnectSyncDaoEntity;
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        Intrinsics.checkNotNullParameter(entities, "entities");
        if (entities.isEmpty()) {
            Logger.i(this.TAG, timeRange.getStartTimeStamp() + "-" + timeRange.getEndTimeStamp() + " has empty records!!");
            return emptyRecordsInfo();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = entities.iterator();
        int timeZoneOffset = 0;
        String clientRecordId = "";
        loop0: while (true) {
            str = clientRecordId;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                healthConnectSyncDaoEntity = (HealthConnectSyncDaoEntity) it.next();
                if (!HealthConnectExtKt.isDeleted(healthConnectSyncDaoEntity)) {
                    StepItem stepItem = (StepItem) FitnessPersistUtils.INSTANCE.fromJson(healthConnectSyncDaoEntity.getValue(), StepItem.class);
                    if (stepItem != null) {
                        stepItem.setSid(healthConnectSyncDaoEntity.getSid());
                        arrayList2.add(stepItem);
                    }
                    if (timeZoneOffset <= 0) {
                        timeZoneOffset = healthConnectSyncDaoEntity.getTimeZoneOffset();
                    }
                    if (TextUtils.isEmpty(str)) {
                        break;
                    }
                } else if (!HealthConnectExtKt.isSynced(healthConnectSyncDaoEntity)) {
                    arrayList.add(healthConnectSyncDaoEntity);
                }
            }
            clientRecordId = healthConnectSyncDaoEntity.getClientRecordId();
        }
        Iterator<Map.Entry<String, List<DailyRecordItem>>> it2 = RepoUtils.INSTANCE.groupedBySid(arrayList2).entrySet().iterator();
        long j = 0;
        while (it2.hasNext()) {
            long steps = 0;
            for (DailyRecordItem dailyRecordItem : it2.next().getValue()) {
                Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.StepItem");
                steps += (long) ((StepItem) dailyRecordItem).getSteps();
            }
            if (j < steps) {
                j = steps;
            }
        }
        long startTimeStamp = timeRange.getStartTimeStamp();
        long endTimeStamp = timeRange.getEndTimeStamp();
        Logger.d(this.TAG, "time-range(" + startTimeStamp + "-" + endTimeStamp + ") steps:" + j);
        Instant instantOfEpochSecond = Instant.ofEpochSecond(startTimeStamp);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(endTimeStamp);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
        return new GeneratedHandleRecordsInfo<>(null, new AggregateAbleRecordsInfo(CollectionsKt__CollectionsKt.arrayListOf(new StepsRecord(instantOfEpochSecond, ZoneOffset.ofTotalSeconds(timeZoneOffset), instantOfEpochSecond2, ZoneOffset.ofTotalSeconds(timeZoneOffset), j, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, str, System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null))), null, 2, null), 1, null);
    }

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    @NotNull
    public String getType() {
        return "step";
    }

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    public boolean isAggregateAble() {
        return true;
    }
}
