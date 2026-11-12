package com.xiaomi.fit.fitness.export.api.repository;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "", "getDevicesList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IDevicesListRepository {
    @NotNull
    Flow<List<FitnessDeviceItem>> getDevicesList(@NotNull HomeDataType dataType, long start, long end);
}
