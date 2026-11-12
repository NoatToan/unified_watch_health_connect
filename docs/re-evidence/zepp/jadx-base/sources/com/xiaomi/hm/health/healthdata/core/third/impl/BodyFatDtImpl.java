package com.xiaomi.hm.health.healthdata.core.third.impl;

import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.healthdata.core.third.ThirdDataDtApi;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/third/impl/BodyFatDtImpl;", "Lcom/xiaomi/hm/health/healthdata/core/third/ThirdDataDtApi;", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "info", "", "getItemValue", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "getDefaultType", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyFatDtImpl extends ThirdDataDtApi {
    @Override // com.xiaomi.hm.health.healthdata.core.third.ThirdDataDtApi
    @NotNull
    public HealthDataType getDefaultType() {
        return HealthDataType.BODY_FAT;
    }

    @Override // com.xiaomi.hm.health.healthdata.core.third.ThirdDataDtApi
    @NotNull
    public String getItemValue(@NotNull WeightInfos info) {
        return String.valueOf(info.getBody_fat());
    }
}
