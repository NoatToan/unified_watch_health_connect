package com.huami.training.ui.course;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.repo.ConfigRepo;
import com.huami.training.repo.TrainingFilterListRepo;
import com.huami.training.ui.course.TrainingFilterViewModel;
import com.huami.training.vo.FilterInfo;
import com.huami.training.vo.FilterModeVo;
import com.huami.training.vo.Listing;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR+\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u001b*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00190\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R3\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u001b*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e0\u001e0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R<\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r0\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010%R<\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u001b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r0\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010%R%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0013¨\u00062"}, d2 = {"Lcom/huami/training/ui/course/TrainingFilterViewModel;", "Landroidx/lifecycle/ViewModel;", "", "refresh", "retry", "Lcom/huami/training/vo/FilterInfo;", "newFilterInfo", "setFilterInfo", "Lcom/huami/training/repo/TrainingFilterListRepo;", "a", "Lcom/huami/training/repo/TrainingFilterListRepo;", "repository", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/FilterModeVo;", "b", "Landroidx/lifecycle/LiveData;", "getFilterModeResult", "()Landroidx/lifecycle/LiveData;", "filterModeResult", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "filterInfo", "Lcom/huami/training/vo/Listing;", "Lcom/huami/training/vo/TrainingVo;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "result", "Landroidx/paging/PagedList;", "e", "getPagedList", "pagedList", "f", "getNetworkState", "setNetworkState", "(Landroidx/lifecycle/LiveData;)V", "networkState", "g", "getRefreshState", "setRefreshState", "refreshState", "h", "getConfigLoadTrigger", "configLoadTrigger", "Lcom/huami/training/repo/ConfigRepo;", "configRepo", "<init>", "(Lcom/huami/training/repo/TrainingFilterListRepo;Lcom/huami/training/repo/ConfigRepo;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingFilterViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TrainingFilterListRepo repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<FilterModeVo>>> filterModeResult;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<FilterInfo> filterInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Listing<TrainingVo>> result;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<TrainingVo>> pagedList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Unit>> networkState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Unit>> refreshState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> configLoadTrigger;

    public TrainingFilterViewModel(@NotNull TrainingFilterListRepo trainingFilterListRepo, @NotNull ConfigRepo configRepo) {
        this.repository = trainingFilterListRepo;
        this.filterModeResult = trainingFilterListRepo.loadFilterMode();
        MutableLiveData<FilterInfo> mutableLiveData = new MutableLiveData<>();
        this.filterInfo = mutableLiveData;
        LiveData<Listing<TrainingVo>> map = Transformations.map(mutableLiveData, new Function() { // from class: qv7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TrainingFilterViewModel.i(this.a, (FilterInfo) obj);
            }
        });
        this.result = map;
        this.pagedList = Transformations.switchMap(map, new Function() { // from class: rv7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TrainingFilterViewModel.g((Listing) obj);
            }
        });
        this.networkState = Transformations.switchMap(map, new Function() { // from class: sv7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TrainingFilterViewModel.f((Listing) obj);
            }
        });
        this.refreshState = Transformations.switchMap(map, new Function() { // from class: tv7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TrainingFilterViewModel.h((Listing) obj);
            }
        });
        this.configLoadTrigger = configRepo.loadConfigurationsOnActive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData f(Listing listing) {
        return listing.getNetworkState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData g(Listing listing) {
        return listing.getPagedList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData h(Listing listing) {
        return listing.getRefreshState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Listing i(TrainingFilterViewModel trainingFilterViewModel, FilterInfo filterInfo) {
        return trainingFilterViewModel.repository.loadTrainingFilterCourses(filterInfo);
    }

    @NotNull
    public final LiveData<Resource<Unit>> getConfigLoadTrigger() {
        return this.configLoadTrigger;
    }

    @NotNull
    public final LiveData<Resource<List<FilterModeVo>>> getFilterModeResult() {
        return this.filterModeResult;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getNetworkState() {
        return this.networkState;
    }

    @NotNull
    public final LiveData<PagedList<TrainingVo>> getPagedList() {
        return this.pagedList;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getRefreshState() {
        return this.refreshState;
    }

    public final void refresh() {
        Function0<Unit> refresh;
        Listing<TrainingVo> value = this.result.getValue();
        if (value == null || (refresh = value.getRefresh()) == null) {
            return;
        }
        refresh.invoke();
    }

    public final void retry() {
        Function0<Unit> retry;
        Listing<TrainingVo> value = this.result.getValue();
        if (value == null || (retry = value.getRetry()) == null) {
            return;
        }
        retry.invoke();
    }

    public final void setFilterInfo(@NotNull FilterInfo newFilterInfo) {
        if (Intrinsics.areEqual(newFilterInfo, this.filterInfo.getValue())) {
            return;
        }
        this.filterInfo.setValue(newFilterInfo);
    }

    public final void setNetworkState(@NotNull LiveData<Resource<Unit>> liveData) {
        this.networkState = liveData;
    }

    public final void setRefreshState(@NotNull LiveData<Resource<Unit>> liveData) {
        this.refreshState = liveData;
    }
}
