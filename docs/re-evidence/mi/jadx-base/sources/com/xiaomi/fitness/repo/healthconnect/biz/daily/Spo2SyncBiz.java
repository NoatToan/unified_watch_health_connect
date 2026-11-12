package com.xiaomi.fitness.repo.healthconnect.biz.daily;

import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.metadata.Device;
import androidx.health.connect.client.units.Percentage;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectExtKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/Spo2SyncBiz;", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/BaseSyncBiz;", "Landroidx/health/connect/client/records/OxygenSaturationRecord;", "<init>", "()V", "TAG", "", "getType", "isAggregateAble", "", "generateSampleRecords", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/GeneratedHandleRecordsInfo;", "entities", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpo2SyncBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spo2SyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/daily/Spo2SyncBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1863#2,2:71\n*S KotlinDebug\n*F\n+ 1 Spo2SyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/daily/Spo2SyncBiz\n*L\n38#1:71,2\n*E\n"})
public final class Spo2SyncBiz extends BaseSyncBiz<OxygenSaturationRecord> {

    @NotNull
    private final String TAG = "Spo2SyncBiz";

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    @NotNull
    public GeneratedHandleRecordsInfo<OxygenSaturationRecord> generateSampleRecords(@NotNull List<HealthConnectSyncDaoEntity> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        if (entities.isEmpty()) {
            Logger.i(this.TAG, "empty records!!");
            return emptyRecordsInfo();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (HealthConnectSyncDaoEntity healthConnectSyncDaoEntity : entities) {
            if (!HealthConnectExtKt.isDeleted(healthConnectSyncDaoEntity)) {
                Spo2Item spo2Item = (Spo2Item) FitnessPersistUtils.INSTANCE.fromJson(healthConnectSyncDaoEntity.getValue(), Spo2Item.class);
                if (spo2Item != null) {
                    Instant instantOfEpochSecond = Instant.ofEpochSecond(spo2Item.getTime());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                    Integer zoneOffsetInSec = spo2Item.getZoneOffsetInSec();
                    arrayList.add(new OxygenSaturationRecord(instantOfEpochSecond, ZoneOffset.ofTotalSeconds(zoneOffsetInSec != null ? zoneOffsetInSec.intValue() : 0), new Percentage(spo2Item.getSpo2()), new androidx.health.connect.client.records.metadata.Metadata(null, null, null, healthConnectSyncDaoEntity.getClientRecordId(), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null)));
                    arrayList2.add(healthConnectSyncDaoEntity);
                    Logger.d(this.TAG, "time(" + spo2Item.getTime() + "), spo2:" + spo2Item.getSpo2());
                }
            } else if (!HealthConnectExtKt.isSynced(healthConnectSyncDaoEntity)) {
                arrayList3.add(healthConnectSyncDaoEntity);
            }
        }
        return new GeneratedHandleRecordsInfo<>(new UnAggregateAbleRecordsInfo(arrayList, arrayList2), null, 2, null);
    }

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    @NotNull
    public String getType() {
        return "spo2";
    }

    @Override // com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz
    public boolean isAggregateAble() {
        return false;
    }
}
