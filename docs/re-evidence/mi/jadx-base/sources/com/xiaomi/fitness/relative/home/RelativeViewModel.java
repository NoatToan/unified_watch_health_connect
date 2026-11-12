package com.xiaomi.fitness.relative.home;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.banner.BannerRequest;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.homepage.HealthModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a0\u00192\u0006\u0010\u001e\u001a\u00020\u001fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/relative/home/RelativeViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/homepage/HealthModel;", "<init>", "()V", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getRepoProvider", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setRepoProvider", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "bannerRequest", "Lcom/xiaomi/fitness/banner/BannerRequest;", "getBannerRequest", "()Lcom/xiaomi/fitness/banner/BannerRequest;", "setBannerRequest", "(Lcom/xiaomi/fitness/banner/BannerRequest;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "getRelativeDataList", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "relativeId", "", "connectionStatusLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getConnectionStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeViewModel extends BaseViewModel<HealthModel> {
    public BannerRequest bannerRequest;

    @NotNull
    private final MutableLiveData<Boolean> connectionStatusLiveData = new MutableLiveData<>(Boolean.FALSE);
    public IRepositoryProvider repoProvider;

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final BannerRequest getBannerRequest() {
        BannerRequest bannerRequest = this.bannerRequest;
        if (bannerRequest != null) {
            return bannerRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bannerRequest");
        return null;
    }

    @NotNull
    public final MutableLiveData<Boolean> getConnectionStatusLiveData() {
        return this.connectionStatusLiveData;
    }

    @NotNull
    public final LiveData<CloudDataResult<? extends Map<HomeDataType, DailyBasicReport>>> getRelativeDataList(long relativeId) {
        return FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().getRelativeHomeData(relativeId);
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        setBannerRequest(new BannerRequest());
    }

    public final void setBannerRequest(@NotNull BannerRequest bannerRequest) {
        Intrinsics.checkNotNullParameter(bannerRequest, "<set-?>");
        this.bannerRequest = bannerRequest;
    }

    public final void setRepoProvider(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.repoProvider = iRepositoryProvider;
    }
}
