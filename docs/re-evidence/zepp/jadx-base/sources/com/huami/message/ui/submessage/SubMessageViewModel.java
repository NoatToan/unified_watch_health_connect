package com.huami.message.ui.submessage;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.message.paging.Listing;
import com.huami.message.repo.MessageRepo;
import com.huami.message.ui.submessage.SubMessageViewModel;
import com.huami.message.vo.SubMessageItemVo;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\bJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\bJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\bJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\bJ\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\bJ\u0006\u0010\u0016\u001a\u00020\u0004R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\t0#8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R0\u0010-\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ **\n\u0012\u0004\u0012\u00020$\u0018\u00010\t0\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/huami/message/ui/submessage/SubMessageViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "", "postFollowStatus", "reqType", PointCategory.INIT, "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "networkState", "", "refreshState", "loadEmptyDataState", "loadMoreFinishedState", "loadFirstPagingErrorState", "Landroidx/paging/PagedList;", "Lcom/huami/message/vo/SubMessageItemVo;", "pagedList", "refresh", "initRefresh", "initRefreshState", "retry", "Lcom/huami/message/repo/MessageRepo;", "a", "Lcom/huami/message/repo/MessageRepo;", "messageRepo", "Lcom/huami/message/paging/Listing;", "b", "Lcom/huami/message/paging/Listing;", "result", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "followInput", "Landroidx/lifecycle/MediatorLiveData;", "", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MediatorLiveData;", "getFollowState", "()Landroidx/lifecycle/MediatorLiveData;", "followState", "kotlin.jvm.PlatformType", "e", "Landroidx/lifecycle/LiveData;", "followResult", "<init>", "(Lcom/huami/message/repo/MessageRepo;)V", "Companion", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class SubMessageViewModel extends ViewModel {

    @NotNull
    public static final String REQ_COMMENT = "Comment";

    @NotNull
    public static final String REQ_LIKES = "Likes";

    @NotNull
    public static final String TAG = "SubMessageViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MessageRepo messageRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Listing<SubMessageItemVo> result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> followInput;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Resource<Boolean>> followState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Boolean>> followResult;

    public SubMessageViewModel(@NotNull MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.followInput = mutableLiveData;
        MediatorLiveData<Resource<Boolean>> mediatorLiveData = new MediatorLiveData<>();
        this.followState = mediatorLiveData;
        LiveData liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: gi7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SubMessageViewModel.e(this.a, (String) obj);
            }
        });
        this.followResult = liveDataSwitchMap;
        mediatorLiveData.addSource(liveDataSwitchMap, new Observer() { // from class: hi7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SubMessageViewModel.c(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SubMessageViewModel subMessageViewModel, Resource resource) {
        subMessageViewModel.getFollowState().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(SubMessageViewModel subMessageViewModel, String str) {
        return subMessageViewModel.messageRepo.postFollowStatus(str);
    }

    @NotNull
    public final MediatorLiveData<Resource<Boolean>> getFollowState() {
        return this.followState;
    }

    public final void init(@NotNull String reqType) {
        this.result = TextUtils.equals("Comment", reqType) ? this.messageRepo.loadSubMessageForComment() : this.messageRepo.loadSubMessageForLikes();
    }

    public final void initRefresh() {
        Function0<Unit> initRefresh;
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null || (initRefresh = listing.getInitRefresh()) == null) {
            return;
        }
        initRefresh.invoke();
    }

    @NotNull
    public final LiveData<Resource<Integer>> initRefreshState() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getInitRefreshState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> loadEmptyDataState() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getLoadDataEmptyState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> loadFirstPagingErrorState() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getLoadFirstPagingErrorState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> loadMoreFinishedState() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getLoadMoreFinishedState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> networkState() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getNetworkState();
    }

    @NotNull
    public final LiveData<PagedList<SubMessageItemVo>> pagedList() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getPagedList();
    }

    public final void postFollowStatus(@NotNull String userId) {
        this.followState.setValue(Resource.INSTANCE.loading(null));
        this.followInput.setValue(userId);
    }

    public final void refresh() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return;
        }
        listing.getRefresh().invoke();
    }

    @NotNull
    public final LiveData<Resource<Integer>> refreshState() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getRefreshState();
    }

    public final void retry() {
        Listing<SubMessageItemVo> listing = this.result;
        if (listing == null) {
            return;
        }
        listing.getRetry().invoke();
    }
}
