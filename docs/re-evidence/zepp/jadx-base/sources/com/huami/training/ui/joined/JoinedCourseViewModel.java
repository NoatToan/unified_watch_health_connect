package com.huami.training.ui.joined;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.repo.JoinedCourseRepo;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.training.vo.Listing;
import com.huami.training.vo.Resource;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR.\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0015R.\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/huami/training/ui/joined/JoinedCourseViewModel;", "Landroidx/lifecycle/ViewModel;", "", "refresh", "retry", "Lcom/huami/training/vo/Listing;", "Lcom/huami/training/vo/JoinedCourseVo;", "a", "Lcom/huami/training/vo/Listing;", "result", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "b", "Landroidx/lifecycle/LiveData;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "pagedList", "Lcom/huami/training/vo/Resource;", "c", "getNetworkState", "setNetworkState", "(Landroidx/lifecycle/LiveData;)V", "networkState", GoogleApiAvailabilityLight.a, "getRefreshState", "setRefreshState", "refreshState", "Lcom/huami/training/repo/JoinedCourseRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/training/repo/JoinedCourseRepo;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class JoinedCourseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Listing<JoinedCourseVo> result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<JoinedCourseVo>> pagedList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Unit>> networkState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Unit>> refreshState;

    public JoinedCourseViewModel(@NotNull JoinedCourseRepo joinedCourseRepo) {
        Listing<JoinedCourseVo> listingLoadJoinedCourses = joinedCourseRepo.loadJoinedCourses();
        this.result = listingLoadJoinedCourses;
        this.pagedList = listingLoadJoinedCourses.getPagedList();
        this.networkState = listingLoadJoinedCourses.getNetworkState();
        this.refreshState = listingLoadJoinedCourses.getRefreshState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> getNetworkState() {
        return this.networkState;
    }

    @NotNull
    public final LiveData<PagedList<JoinedCourseVo>> getPagedList() {
        return this.pagedList;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getRefreshState() {
        return this.refreshState;
    }

    public final void refresh() {
        this.result.getRefresh().invoke();
    }

    public final void retry() {
        this.result.getRetry().invoke();
    }

    public final void setNetworkState(@NotNull LiveData<Resource<Unit>> liveData) {
        this.networkState = liveData;
    }

    public final void setRefreshState(@NotNull LiveData<Resource<Unit>> liveData) {
        this.refreshState = liveData;
    }
}
