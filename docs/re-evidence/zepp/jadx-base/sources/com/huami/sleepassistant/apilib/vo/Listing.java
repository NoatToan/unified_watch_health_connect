package com.huami.sleepassistant.apilib.vo;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import com.huami.android.vo.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B§\u0001\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003¢\u0006\u0004\b,\u0010-J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003HÆ\u0003J\u0015\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003HÆ\u0003J\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0003J¹\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00032\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00032\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00032\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003R%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"R%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b#\u0010\"R%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b$\u0010\"R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b(\u0010'R'\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b)\u0010\"R'\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b*\u0010\"R'\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b+\u0010\"¨\u0006."}, d2 = {"Lcom/huami/sleepassistant/apilib/vo/Listing;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "component1", "Lcom/huami/android/vo/Resource;", "", "component2", "", "component3", "Lkotlin/Function0;", "component4", "component5", "component6", "component7", "component8", "pagedList", "networkState", "refreshState", "refresh", "retry", "loadDataEmptyState", "loadMoreFinishedState", "loadFirstPagingErrorState", "copy", "", "toString", "hashCode", "other", "", "equals", "Landroidx/lifecycle/LiveData;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "getNetworkState", "getRefreshState", "Lkotlin/jvm/functions/Function0;", "getRefresh", "()Lkotlin/jvm/functions/Function0;", "getRetry", "getLoadDataEmptyState", "getLoadMoreFinishedState", "getLoadFirstPagingErrorState", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Listing<T> {

    @Nullable
    private final LiveData<Resource<Unit>> loadDataEmptyState;

    @Nullable
    private final LiveData<Resource<Unit>> loadFirstPagingErrorState;

    @Nullable
    private final LiveData<Resource<Unit>> loadMoreFinishedState;

    @NotNull
    private final LiveData<Resource<Unit>> networkState;

    @NotNull
    private final LiveData<PagedList<T>> pagedList;

    @NotNull
    private final Function0<Unit> refresh;

    @NotNull
    private final LiveData<Resource<Integer>> refreshState;

    @NotNull
    private final Function0<Unit> retry;

    public Listing(@NotNull LiveData<PagedList<T>> liveData, @NotNull LiveData<Resource<Unit>> liveData2, @NotNull LiveData<Resource<Integer>> liveData3, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1, @Nullable LiveData<Resource<Unit>> liveData4, @Nullable LiveData<Resource<Unit>> liveData5, @Nullable LiveData<Resource<Unit>> liveData6) {
        this.pagedList = liveData;
        this.networkState = liveData2;
        this.refreshState = liveData3;
        this.refresh = function0;
        this.retry = function1;
        this.loadDataEmptyState = liveData4;
        this.loadMoreFinishedState = liveData5;
        this.loadFirstPagingErrorState = liveData6;
    }

    @NotNull
    public final LiveData<PagedList<T>> component1() {
        return this.pagedList;
    }

    @NotNull
    public final LiveData<Resource<Unit>> component2() {
        return this.networkState;
    }

    @NotNull
    public final LiveData<Resource<Integer>> component3() {
        return this.refreshState;
    }

    @NotNull
    public final Function0<Unit> component4() {
        return this.refresh;
    }

    @NotNull
    public final Function0<Unit> component5() {
        return this.retry;
    }

    @Nullable
    public final LiveData<Resource<Unit>> component6() {
        return this.loadDataEmptyState;
    }

    @Nullable
    public final LiveData<Resource<Unit>> component7() {
        return this.loadMoreFinishedState;
    }

    @Nullable
    public final LiveData<Resource<Unit>> component8() {
        return this.loadFirstPagingErrorState;
    }

    @NotNull
    public final Listing<T> copy(@NotNull LiveData<PagedList<T>> pagedList, @NotNull LiveData<Resource<Unit>> networkState, @NotNull LiveData<Resource<Integer>> refreshState, @NotNull Function0<Unit> refresh, @NotNull Function0<Unit> retry, @Nullable LiveData<Resource<Unit>> loadDataEmptyState, @Nullable LiveData<Resource<Unit>> loadMoreFinishedState, @Nullable LiveData<Resource<Unit>> loadFirstPagingErrorState) {
        return new Listing<>(pagedList, networkState, refreshState, refresh, retry, loadDataEmptyState, loadMoreFinishedState, loadFirstPagingErrorState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Listing)) {
            return false;
        }
        Listing listing = (Listing) other;
        return Intrinsics.areEqual(this.pagedList, listing.pagedList) && Intrinsics.areEqual(this.networkState, listing.networkState) && Intrinsics.areEqual(this.refreshState, listing.refreshState) && Intrinsics.areEqual(this.refresh, listing.refresh) && Intrinsics.areEqual(this.retry, listing.retry) && Intrinsics.areEqual(this.loadDataEmptyState, listing.loadDataEmptyState) && Intrinsics.areEqual(this.loadMoreFinishedState, listing.loadMoreFinishedState) && Intrinsics.areEqual(this.loadFirstPagingErrorState, listing.loadFirstPagingErrorState);
    }

    @Nullable
    public final LiveData<Resource<Unit>> getLoadDataEmptyState() {
        return this.loadDataEmptyState;
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
    public final LiveData<PagedList<T>> getPagedList() {
        return this.pagedList;
    }

    @NotNull
    public final Function0<Unit> getRefresh() {
        return this.refresh;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getRefreshState() {
        return this.refreshState;
    }

    @NotNull
    public final Function0<Unit> getRetry() {
        return this.retry;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.pagedList.hashCode() * 31) + this.networkState.hashCode()) * 31) + this.refreshState.hashCode()) * 31) + this.refresh.hashCode()) * 31) + this.retry.hashCode()) * 31;
        LiveData<Resource<Unit>> liveData = this.loadDataEmptyState;
        int iHashCode2 = (iHashCode + (liveData == null ? 0 : liveData.hashCode())) * 31;
        LiveData<Resource<Unit>> liveData2 = this.loadMoreFinishedState;
        int iHashCode3 = (iHashCode2 + (liveData2 == null ? 0 : liveData2.hashCode())) * 31;
        LiveData<Resource<Unit>> liveData3 = this.loadFirstPagingErrorState;
        return iHashCode3 + (liveData3 != null ? liveData3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Listing(pagedList=" + this.pagedList + ", networkState=" + this.networkState + ", refreshState=" + this.refreshState + ", refresh=" + this.refresh + ", retry=" + this.retry + ", loadDataEmptyState=" + this.loadDataEmptyState + ", loadMoreFinishedState=" + this.loadMoreFinishedState + ", loadFirstPagingErrorState=" + this.loadFirstPagingErrorState + ')';
    }

    public /* synthetic */ Listing(LiveData liveData, LiveData liveData2, LiveData liveData3, Function0 function0, Function0 function1, LiveData liveData4, LiveData liveData5, LiveData liveData6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(liveData, liveData2, liveData3, function0, function1, (i & 32) != 0 ? null : liveData4, (i & 64) != 0 ? null : liveData5, (i & 128) != 0 ? null : liveData6);
    }
}
