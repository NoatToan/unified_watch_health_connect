package com.xiaomi.fitness.base;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016Jh\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000e0\u001d\"\u000e\b\u0000\u0010\u001f*\b\u0012\u0004\u0012\u0002H!0 \"\b\b\u0001\u0010!*\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u001f0#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\r2\b\b\u0001\u0010'\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010%J1\u0010+\u001a\u0002H\u001f\"\u000e\b\u0000\u0010\u001f*\b\u0012\u0004\u0012\u0002H!0 \"\u0004\b\u0001\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u001f0#H\u0004¢\u0006\u0002\u0010,Jl\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000e0.0\u001d\"\u000e\b\u0000\u0010\u001f*\b\u0012\u0004\u0012\u0002H!0 \"\b\b\u0001\u0010!*\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u001f0#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\r2\b\b\u0001\u0010'\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020(2\u0006\u0010/\u001a\u00020\rJ\u001c\u00100\u001a\u00020\u00192\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020(H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR)\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/base/BasicDataViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getRepoProvider", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setRepoProvider", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "monthGroupRequestMap", "Landroidx/lifecycle/MutableLiveData;", "", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "getMonthGroupRequestMap", "()Landroidx/lifecycle/MutableLiveData;", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "triggerFetchFitnessReport", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "T", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "R", "tClass", "Ljava/lang/Class;", "tag", "", "startTime", "leftOffset", "", "rightOffset", "sid", "getRepo", "(Ljava/lang/Class;)Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "triggerFetchRelativeFitnessReport", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "relativeId", "requestMonthGroupData", "endTimeSecond", "limit", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BasicDataViewModel extends AbsViewModel {
    public IRepositoryProvider repoProvider;

    @NotNull
    private final MutableLiveData<Map<Long, List<DailyRecordItem>>> monthGroupRequestMap = new MutableLiveData<>();
    private boolean hasMore = true;

    public static /* synthetic */ void requestMonthGroupData$default(BasicDataViewModel basicDataViewModel, long j, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestMonthGroupData");
        }
        if ((i2 & 1) != 0) {
            j = 0;
        }
        if ((i2 & 2) != 0) {
            i = 60;
        }
        basicDataViewModel.requestMonthGroupData(j, i);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final MutableLiveData<Map<Long, List<DailyRecordItem>>> getMonthGroupRequestMap() {
        return this.monthGroupRequestMap;
    }

    @NotNull
    public final <T extends IRepository<R>, R> T getRepo(@NotNull Class<T> tClass) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        return (T) getRepoProvider().getRepository(tClass);
    }

    @NotNull
    public final IRepositoryProvider getRepoProvider() {
        IRepositoryProvider iRepositoryProvider = this.repoProvider;
        if (iRepositoryProvider != null) {
            return iRepositoryProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repoProvider");
        return null;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public void requestMonthGroupData(long endTimeSecond, int limit) {
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setRepoProvider(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.repoProvider = iRepositoryProvider;
    }

    @NotNull
    public final <T extends IRepository<R>, R extends DailyBasicReport> LiveData<List<DailyBasicReport>> triggerFetchFitnessReport(@NotNull Class<T> tClass, @NotNull String tag, long startTime, @IntRange(from = 0) int leftOffset, @IntRange(from = 0) int rightOffset, @Nullable String sid) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(tag, "tag");
        LiveData<List<DailyBasicReport>> reportList$default = IRepository.DefaultImpls.getReportList$default(getRepo(tClass), sid, tag, startTime, leftOffset, rightOffset, false, 32, null);
        Intrinsics.checkNotNull(reportList$default, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport>>");
        return reportList$default;
    }

    @NotNull
    public final <T extends IRepository<R>, R extends DailyBasicReport> LiveData<CloudDataResult<List<DailyBasicReport>>> triggerFetchRelativeFitnessReport(@NotNull Class<T> tClass, @NotNull String tag, long startTime, @IntRange(from = 0) int leftOffset, @IntRange(from = 0) int rightOffset, long relativeId) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger.d("BasicDataViewModel", "tClass:" + tClass + " startTime:" + startTime + " relativeId:" + relativeId);
        LiveData<CloudDataResult<List<R>>> relativeReportList = getRepo(tClass).getRelativeReportList(relativeId, tag, startTime, leftOffset, rightOffset);
        Intrinsics.checkNotNull(relativeReportList, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.xiaomi.fit.fitness.export.data.CloudDataResult<kotlin.collections.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport>>>");
        return relativeReportList;
    }
}
