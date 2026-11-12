package com.huami.message.ui.message;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.message.dto.MessageStatus;
import com.huami.message.paging.Listing;
import com.huami.message.repo.MessageRepo;
import com.huami.message.vo.PrivateMessageItemVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0002J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00180\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR'\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR'\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR'\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lcom/huami/message/ui/message/MessageViewModel;", "Landroidx/lifecycle/ViewModel;", "", "refresh", "retry", "Lcom/huami/message/vo/PrivateMessageItemVo;", b.r, "updatePrivateMsgStatus", "Lcom/huami/message/dto/MessageStatus;", "messageStatus", "updateAllMessageStatus", "initRefresh", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "initRefreshState", "Lcom/huami/message/repo/MessageRepo;", "a", "Lcom/huami/message/repo/MessageRepo;", "messageRepo", "Lcom/huami/message/paging/Listing;", "b", "Lcom/huami/message/paging/Listing;", "result", "Landroidx/paging/PagedList;", "c", "Landroidx/lifecycle/LiveData;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "pagedList", GoogleApiAvailabilityLight.a, "getNetworkState", "networkState", "e", "getRefreshState", "refreshState", "f", "getLoadEmptyDataState", "loadEmptyDataState", "g", "getLoadMoreFinishedState", "loadMoreFinishedState", "h", "getLoadFirstPagingErrorState", "loadFirstPagingErrorState", "<init>", "(Lcom/huami/message/repo/MessageRepo;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class MessageViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MessageRepo messageRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Listing<PrivateMessageItemVo> result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<PrivateMessageItemVo>> pagedList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> networkState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Integer>> refreshState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final LiveData<Resource<Unit>> loadEmptyDataState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final LiveData<Resource<Unit>> loadMoreFinishedState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final LiveData<Resource<Unit>> loadFirstPagingErrorState;

    public MessageViewModel(@NotNull MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
        Listing<PrivateMessageItemVo> listingLoadPrivateMessageList = messageRepo.loadPrivateMessageList();
        this.result = listingLoadPrivateMessageList;
        this.pagedList = listingLoadPrivateMessageList.getPagedList();
        this.networkState = this.result.getNetworkState();
        this.refreshState = this.result.getRefreshState();
        this.loadEmptyDataState = this.result.getLoadDataEmptyState();
        this.loadMoreFinishedState = this.result.getLoadMoreFinishedState();
        this.loadFirstPagingErrorState = this.result.getLoadFirstPagingErrorState();
    }

    @Nullable
    public final LiveData<Resource<Unit>> getLoadEmptyDataState() {
        return this.loadEmptyDataState;
    }

    @Nullable
    public final LiveData<Resource<Unit>> getLoadFirstPagingErrorState() {
        return this.loadFirstPagingErrorState;
    }

    @Nullable
    public final LiveData<Resource<Unit>> getLoadMoreFinishedState() {
        return this.loadMoreFinishedState;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getNetworkState() {
        return this.networkState;
    }

    @NotNull
    public final LiveData<PagedList<PrivateMessageItemVo>> getPagedList() {
        return this.pagedList;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getRefreshState() {
        return this.refreshState;
    }

    public final void initRefresh() {
        Function0<Unit> initRefresh = this.result.getInitRefresh();
        if (initRefresh == null) {
            return;
        }
        initRefresh.invoke();
    }

    @NotNull
    public final LiveData<Resource<Integer>> initRefreshState() {
        return this.result.getInitRefreshState();
    }

    public final void refresh() {
        this.result.getRefresh().invoke();
    }

    public final void retry() {
        this.result.getRetry().invoke();
    }

    public final void updateAllMessageStatus(@NotNull MessageStatus messageStatus) {
        this.messageRepo.updateAllMessageStatus(messageStatus);
    }

    public final void updatePrivateMsgStatus(@NotNull PrivateMessageItemVo p) {
        this.messageRepo.updatePrivateMsgStatus(p, MessageStatus.READ);
    }
}
