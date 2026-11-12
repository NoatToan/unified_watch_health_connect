package com.xiaomi.fit.fitness.export.api.repository;

import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J(\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J2\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\f\u001a\u00020\rH&J2\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\f\u001a\u00020\rH&JC\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0013J6\u0010\n\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u001e\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0015H&J*\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00040\u00170\u00032\u0006\u0010\u0019\u001a\u00020\u0012H&¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IHomeDataRepository;", "", "getHomeLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "triggerGetHomeData", "", "dataTypes", "", "getHomeData", "getHomeDataWithTag", CloudContract.COL_VIEW_TAG, "", "getHomeDataFlowWithTag", "Lkotlinx/coroutines/flow/StateFlow;", "getHomeDataWithTagTime", "baseZeroTimeInSec", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "dataBack", "Lkotlin/Function1;", "getRelativeHomeData", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "relativeId", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IHomeDataRepository {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ StateFlow getHomeDataFlowWithTag$default(IHomeDataRepository iHomeDataRepository, List list, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeDataFlowWithTag");
            }
            if ((i & 2) != 0) {
                str = "days";
            }
            return iHomeDataRepository.getHomeDataFlowWithTag(list, str);
        }

        public static /* synthetic */ LiveData getHomeDataWithTag$default(IHomeDataRepository iHomeDataRepository, List list, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeDataWithTag");
            }
            if ((i & 2) != 0) {
                str = "days";
            }
            return iHomeDataRepository.getHomeDataWithTag(list, str);
        }

        public static /* synthetic */ LiveData getHomeDataWithTagTime$default(IHomeDataRepository iHomeDataRepository, List list, String str, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHomeDataWithTagTime");
            }
            if ((i & 2) != 0) {
                str = "days";
            }
            if ((i & 4) != 0) {
                l = null;
            }
            return iHomeDataRepository.getHomeDataWithTagTime(list, str, l);
        }
    }

    @NotNull
    LiveData<Map<HomeDataType, Object>> getHomeData(@NotNull List<? extends HomeDataType> dataTypes);

    void getHomeData(@NotNull List<? extends HomeDataType> dataTypes, @NotNull Function1<? super Map<HomeDataType, ? extends Object>, Unit> dataBack);

    @NotNull
    StateFlow<Map<HomeDataType, Object>> getHomeDataFlowWithTag(@NotNull List<? extends HomeDataType> dataTypes, @NotNull String viewTag);

    @NotNull
    LiveData<Map<HomeDataType, Object>> getHomeDataWithTag(@NotNull List<? extends HomeDataType> dataTypes, @NotNull String viewTag);

    @NotNull
    LiveData<Map<HomeDataType, Object>> getHomeDataWithTagTime(@NotNull List<? extends HomeDataType> dataTypes, @NotNull String viewTag, @Nullable Long baseZeroTimeInSec);

    @NotNull
    LiveData<Map<HomeDataType, Object>> getHomeLiveData();

    @NotNull
    LiveData<CloudDataResult<? extends Map<HomeDataType, DailyBasicReport>>> getRelativeHomeData(long relativeId);

    void triggerGetHomeData(@NotNull List<? extends HomeDataType> dataTypes);
}
