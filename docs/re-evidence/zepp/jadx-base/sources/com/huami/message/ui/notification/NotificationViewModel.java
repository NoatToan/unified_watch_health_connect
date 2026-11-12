package com.huami.message.ui.notification;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.huami.android.vo.Resource;
import com.huami.message.paging.Listing;
import com.huami.message.repo.NotificationRepo;
import com.huami.message.vo.NotificationItemVo;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0004J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0004J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0004J\u0006\u0010\u0012\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/message/ui/notification/NotificationViewModel;", "Landroidx/lifecycle/ViewModel;", "", PointCategory.INIT, "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "networkState", "", "refreshState", "loadEmptyDataState", "loadMoreFinishedState", "loadFirstPagingErrorState", "Landroidx/paging/PagedList;", "Lcom/huami/message/vo/NotificationItemVo;", "pagedList", "refresh", "initRefresh", "initRefreshState", "retry", "Lcom/huami/message/repo/NotificationRepo;", "a", "Lcom/huami/message/repo/NotificationRepo;", "messageRepo", "Lcom/huami/message/paging/Listing;", "b", "Lcom/huami/message/paging/Listing;", "result", "<init>", "(Lcom/huami/message/repo/NotificationRepo;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NotificationRepo messageRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Listing<NotificationItemVo> result;

    public NotificationViewModel(@NotNull NotificationRepo notificationRepo) {
        this.messageRepo = notificationRepo;
    }

    public final void init() {
        this.result = this.messageRepo.loadNotification();
    }

    public final void initRefresh() {
        Function0<Unit> initRefresh;
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null || (initRefresh = listing.getInitRefresh()) == null) {
            return;
        }
        initRefresh.invoke();
    }

    @NotNull
    public final LiveData<Resource<Integer>> initRefreshState() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getInitRefreshState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> loadEmptyDataState() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getLoadDataEmptyState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> loadFirstPagingErrorState() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getLoadFirstPagingErrorState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> loadMoreFinishedState() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getLoadMoreFinishedState();
    }

    @NotNull
    public final LiveData<Resource<Unit>> networkState() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getNetworkState();
    }

    @NotNull
    public final LiveData<PagedList<NotificationItemVo>> pagedList() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getPagedList();
    }

    public final void refresh() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return;
        }
        listing.getRefresh().invoke();
    }

    @NotNull
    public final LiveData<Resource<Integer>> refreshState() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return null;
        }
        return listing.getRefreshState();
    }

    public final void retry() {
        Listing<NotificationItemVo> listing = this.result;
        if (listing == null) {
            return;
        }
        listing.getRetry().invoke();
    }
}
