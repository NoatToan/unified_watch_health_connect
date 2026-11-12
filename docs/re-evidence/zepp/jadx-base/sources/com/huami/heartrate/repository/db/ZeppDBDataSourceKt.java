package com.huami.heartrate.repository.db;

import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.xiaomi.hm.health.databases.model.HeartRate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "Lcom/xiaomi/hm/health/databases/model/HeartRate;", "convertHeartRate", "convertHeartRateEntity", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class ZeppDBDataSourceKt {
    @NotNull
    public static final HeartRate convertHeartRate(@NotNull HeartRateEntity heartRateEntity) {
        Integer type = heartRateEntity.getType();
        Integer deviceType = heartRateEntity.getDeviceType();
        Integer deviceSource = heartRateEntity.getDeviceSource();
        long time = heartRateEntity.getTime();
        return new HeartRate(type, deviceType, deviceSource, Long.valueOf(time), heartRateEntity.getHr(), heartRateEntity.getState(), heartRateEntity.getTimeZone(), heartRateEntity.getDeviceId());
    }

    @NotNull
    public static final HeartRateEntity convertHeartRateEntity(@NotNull HeartRate heartRate) {
        return new HeartRateEntity(heartRate.getType(), heartRate.getDevice_type(), heartRate.getDevice_source(), heartRate.getTime().longValue(), heartRate.getHr(), heartRate.getState(), heartRate.getTime_zone(), heartRate.getDevice_id(), null, 256, null);
    }
}
