package com.xiaomi.fitness.relative.base;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fitness.baseui.AbsViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016Jl\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000f\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\b\b\u0001\u0010\u0015*\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001bJ1\u0010 \u001a\u0002H\u0013\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\u0004\b\u0001\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0017H\u0004¢\u0006\u0002\u0010!R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getRepoProvider", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setRepoProvider", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "triggerFetchFitnessReport", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "T", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "R", "tClass", "Ljava/lang/Class;", "tag", "", "startTime", "", "leftOffset", "", "rightOffset", "relativeId", "getRepo", "(Ljava/lang/Class;)Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BasicRelativeDataViewModel extends AbsViewModel {
    public IRepositoryProvider repoProvider;

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
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

    public final void setRepoProvider(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.repoProvider = iRepositoryProvider;
    }

    @NotNull
    public final <T extends IRepository<R>, R extends DailyBasicReport> LiveData<CloudDataResult<List<DailyBasicReport>>> triggerFetchFitnessReport(@NotNull Class<T> tClass, @NotNull String tag, long startTime, @IntRange(from = 0) int leftOffset, @IntRange(from = 0) int rightOffset, long relativeId) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(tag, "tag");
        LiveData<CloudDataResult<List<R>>> relativeReportList = getRepo(tClass).getRelativeReportList(relativeId, tag, startTime, leftOffset, rightOffset);
        Intrinsics.checkNotNull(relativeReportList, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.xiaomi.fit.fitness.export.data.CloudDataResult<kotlin.collections.List<com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport>>>");
        return relativeReportList;
    }
}
