package com.huami.training.ui.usercourse;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.repo.UserCourseRepo;
import com.huami.training.ui.usercourse.UserCourseViewModel;
import com.huami.training.vo.Listing;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0002H\u0014R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR0\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R3\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00180\u00180\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR<\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0014*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d0\u001d0\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/training/ui/usercourse/UserCourseViewModel;", "Landroidx/lifecycle/ViewModel;", "", "e", "retry", "", "newUserId", "setUserId", "onCleared", "Lcom/huami/training/repo/UserCourseRepo;", "a", "Lcom/huami/training/repo/UserCourseRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "userId", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Listing;", "Lcom/huami/training/vo/TrainingVo;", "kotlin.jvm.PlatformType", "c", "Landroidx/lifecycle/LiveData;", "result", "Landroidx/paging/PagedList;", GoogleApiAvailabilityLight.a, "getPagedList", "()Landroidx/lifecycle/LiveData;", "pagedList", "Lcom/huami/training/vo/Resource;", "getNetworkState", "setNetworkState", "(Landroidx/lifecycle/LiveData;)V", "networkState", "<init>", "(Lcom/huami/training/repo/UserCourseRepo;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class UserCourseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UserCourseRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Listing<TrainingVo>> result;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<TrainingVo>> pagedList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Unit>> networkState;

    public UserCourseViewModel(@NotNull UserCourseRepo userCourseRepo) {
        this.repo = userCourseRepo;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.userId = mutableLiveData;
        LiveData<Listing<TrainingVo>> map = Transformations.map(mutableLiveData, new Function() { // from class: y58
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return UserCourseViewModel.h(this.a, (String) obj);
            }
        });
        this.result = map;
        this.pagedList = Transformations.switchMap(map, new Function() { // from class: a68
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return UserCourseViewModel.g((Listing) obj);
            }
        });
        this.networkState = Transformations.switchMap(map, new Function() { // from class: z58
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return UserCourseViewModel.f((Listing) obj);
            }
        });
    }

    private final void e() {
        String value = this.userId.getValue();
        if (value == null) {
            return;
        }
        this.repo.clearCoursesInProfile(value);
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
    public static final Listing h(UserCourseViewModel userCourseViewModel, String str) {
        return userCourseViewModel.repo.loadCoursesInProfile(str);
    }

    @NotNull
    public final LiveData<Resource<Unit>> getNetworkState() {
        return this.networkState;
    }

    @NotNull
    public final LiveData<PagedList<TrainingVo>> getPagedList() {
        return this.pagedList;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        e();
    }

    public final void retry() {
        Function0<Unit> retry;
        Listing<TrainingVo> value = this.result.getValue();
        if (value == null || (retry = value.getRetry()) == null) {
            return;
        }
        retry.invoke();
    }

    public final void setNetworkState(@NotNull LiveData<Resource<Unit>> liveData) {
        this.networkState = liveData;
    }

    public final void setUserId(@NotNull String newUserId) {
        if (Intrinsics.areEqual(newUserId, this.userId.getValue())) {
            return;
        }
        this.userId.setValue(newUserId);
    }
}
