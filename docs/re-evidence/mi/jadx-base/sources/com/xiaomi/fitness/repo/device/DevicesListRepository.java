package com.xiaomi.fitness.repo.device;

import com.xiaomi.fit.fitness.export.api.repository.IDevicesListRepository;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDevicesListProxy;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/repo/device/DevicesListRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "<init>", "()V", "getDevicesList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DevicesListRepository implements IDevicesListRepository {
    @Override // com.xiaomi.fit.fitness.export.api.repository.IDevicesListRepository
    @NotNull
    public Flow<List<FitnessDeviceItem>> getDevicesList(@NotNull HomeDataType dataType, long start, long end) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return FitnessDevicesListProxy.INSTANCE.getDevicesList(dataType, start, end);
    }
}
