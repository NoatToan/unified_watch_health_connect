package com.xiaomi.hm.health.healthdata.service;

import com.huami.health.service.HealthEntry;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "Lcom/huami/health/service/HealthEntry;", "toHealthEntry", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HealthServiceImplKt {
    @NotNull
    public static final HealthEntry toHealthEntry(@NotNull UserDataEntity userDataEntity) {
        Date uploadTime = userDataEntity.getUploadTime();
        Long lValueOf = uploadTime == null ? null : Long.valueOf(uploadTime.getTime());
        long jCurrentTimeMillis = lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        String eventValue = userDataEntity.getEventValue();
        if (eventValue == null) {
            eventValue = "";
        }
        return new HealthEntry(jCurrentTimeMillis, eventValue);
    }
}
