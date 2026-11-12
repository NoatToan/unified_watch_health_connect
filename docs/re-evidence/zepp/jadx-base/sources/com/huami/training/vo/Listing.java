package com.huami.training.vo;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B_\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003HÆ\u0003J\u0015\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003HÆ\u0003J\u0015\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003Jq\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003R%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00038\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006*"}, d2 = {"Lcom/huami/training/vo/Listing;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "component1", "Lcom/huami/training/vo/Resource;", "", "component2", "component3", "Lkotlin/Function0;", "component4", "component5", "pagedList", "networkState", "refreshState", "refresh", "retry", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Landroidx/lifecycle/LiveData;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "b", "getNetworkState", "c", "getRefreshState", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function0;", "getRefresh", "()Lkotlin/jvm/functions/Function0;", "e", "getRetry", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Listing<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final LiveData<PagedList<T>> pagedList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final LiveData<Resource<Unit>> networkState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final LiveData<Resource<Unit>> refreshState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Unit> refresh;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Unit> retry;

    public Listing(@NotNull LiveData<PagedList<T>> liveData, @NotNull LiveData<Resource<Unit>> liveData2, @NotNull LiveData<Resource<Unit>> liveData3, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1) {
        this.pagedList = liveData;
        this.networkState = liveData2;
        this.refreshState = liveData3;
        this.refresh = function0;
        this.retry = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Listing copy$default(Listing listing, LiveData liveData, LiveData liveData2, LiveData liveData3, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            liveData = listing.pagedList;
        }
        if ((i & 2) != 0) {
            liveData2 = listing.networkState;
        }
        LiveData liveData4 = liveData2;
        if ((i & 4) != 0) {
            liveData3 = listing.refreshState;
        }
        LiveData liveData5 = liveData3;
        if ((i & 8) != 0) {
            function0 = listing.refresh;
        }
        Function0 function2 = function0;
        if ((i & 16) != 0) {
            function1 = listing.retry;
        }
        return listing.copy(liveData, liveData4, liveData5, function2, function1);
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
    public final LiveData<Resource<Unit>> component3() {
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

    @NotNull
    public final Listing<T> copy(@NotNull LiveData<PagedList<T>> pagedList, @NotNull LiveData<Resource<Unit>> networkState, @NotNull LiveData<Resource<Unit>> refreshState, @NotNull Function0<Unit> refresh, @NotNull Function0<Unit> retry) {
        return new Listing<>(pagedList, networkState, refreshState, refresh, retry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Listing)) {
            return false;
        }
        Listing listing = (Listing) other;
        return Intrinsics.areEqual(this.pagedList, listing.pagedList) && Intrinsics.areEqual(this.networkState, listing.networkState) && Intrinsics.areEqual(this.refreshState, listing.refreshState) && Intrinsics.areEqual(this.refresh, listing.refresh) && Intrinsics.areEqual(this.retry, listing.retry);
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
    public final LiveData<Resource<Unit>> getRefreshState() {
        return this.refreshState;
    }

    @NotNull
    public final Function0<Unit> getRetry() {
        return this.retry;
    }

    public int hashCode() {
        return (((((((this.pagedList.hashCode() * 31) + this.networkState.hashCode()) * 31) + this.refreshState.hashCode()) * 31) + this.refresh.hashCode()) * 31) + this.retry.hashCode();
    }

    @NotNull
    public String toString() {
        return "Listing(pagedList=" + this.pagedList + ", networkState=" + this.networkState + ", refreshState=" + this.refreshState + ", refresh=" + this.refresh + ", retry=" + this.retry + ')';
    }
}
