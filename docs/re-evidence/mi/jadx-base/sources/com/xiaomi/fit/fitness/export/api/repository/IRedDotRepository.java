package com.xiaomi.fit.fitness.export.api.repository;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.RedDotItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IRedDotRepository;", "", "getRedDotMap", "Lkotlinx/coroutines/flow/Flow;", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/RedDotItem;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", StatConstants.PARAM_START, StatConstants.PARAM_END, CloudContract.COL_VIEW_TAG, "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IRedDotRepository {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow getRedDotMap$default(IRedDotRepository iRedDotRepository, HomeDataType homeDataType, long j, long j2, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRedDotMap");
            }
            if ((i & 8) != 0) {
                str = "days";
            }
            return iRedDotRepository.getRedDotMap(homeDataType, j, j2, str);
        }
    }

    @NotNull
    Flow<Map<Long, RedDotItem>> getRedDotMap(@NotNull HomeDataType dataType, long start, long end, @NotNull String viewTag);
}
