package com.huami.femalehealth.logiclib.vo;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.paging.PagedList;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bu\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003HÆ\u0003J\u0017\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0003J\u007f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003R%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR'\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR'\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/Listing;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "component1", "Lcom/huami/android/vo/Resource;", "", "component2", "component3", "component4", "Lkotlin/Function0;", "component5", "pagedList", "loadDataEmptyState", "loadMoreFinishedState", "loadFirstPagingErrorState", "initRefresh", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Landroidx/lifecycle/LiveData;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "b", "getLoadDataEmptyState", "c", "getLoadMoreFinishedState", GoogleApiAvailabilityLight.a, "getLoadFirstPagingErrorState", "e", "Lkotlin/jvm/functions/Function0;", "getInitRefresh", "()Lkotlin/jvm/functions/Function0;", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function0;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Listing<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final LiveData<PagedList<T>> pagedList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final LiveData<Resource<Unit>> loadDataEmptyState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final LiveData<Resource<Unit>> loadMoreFinishedState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final LiveData<Resource<Unit>> loadFirstPagingErrorState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Function0<Unit> initRefresh;

    public Listing(@NotNull LiveData<PagedList<T>> liveData, @Nullable LiveData<Resource<Unit>> liveData2, @Nullable LiveData<Resource<Unit>> liveData3, @Nullable LiveData<Resource<Unit>> liveData4, @Nullable Function0<Unit> function0) {
        this.pagedList = liveData;
        this.loadDataEmptyState = liveData2;
        this.loadMoreFinishedState = liveData3;
        this.loadFirstPagingErrorState = liveData4;
        this.initRefresh = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Listing copy$default(Listing listing, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            liveData = listing.pagedList;
        }
        if ((i & 2) != 0) {
            liveData2 = listing.loadDataEmptyState;
        }
        LiveData liveData5 = liveData2;
        if ((i & 4) != 0) {
            liveData3 = listing.loadMoreFinishedState;
        }
        LiveData liveData6 = liveData3;
        if ((i & 8) != 0) {
            liveData4 = listing.loadFirstPagingErrorState;
        }
        LiveData liveData7 = liveData4;
        if ((i & 16) != 0) {
            function0 = listing.initRefresh;
        }
        return listing.copy(liveData, liveData5, liveData6, liveData7, function0);
    }

    @NotNull
    public final LiveData<PagedList<T>> component1() {
        return this.pagedList;
    }

    @Nullable
    public final LiveData<Resource<Unit>> component2() {
        return this.loadDataEmptyState;
    }

    @Nullable
    public final LiveData<Resource<Unit>> component3() {
        return this.loadMoreFinishedState;
    }

    @Nullable
    public final LiveData<Resource<Unit>> component4() {
        return this.loadFirstPagingErrorState;
    }

    @Nullable
    public final Function0<Unit> component5() {
        return this.initRefresh;
    }

    @NotNull
    public final Listing<T> copy(@NotNull LiveData<PagedList<T>> pagedList, @Nullable LiveData<Resource<Unit>> loadDataEmptyState, @Nullable LiveData<Resource<Unit>> loadMoreFinishedState, @Nullable LiveData<Resource<Unit>> loadFirstPagingErrorState, @Nullable Function0<Unit> initRefresh) {
        return new Listing<>(pagedList, loadDataEmptyState, loadMoreFinishedState, loadFirstPagingErrorState, initRefresh);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Listing)) {
            return false;
        }
        Listing listing = (Listing) other;
        return Intrinsics.areEqual(this.pagedList, listing.pagedList) && Intrinsics.areEqual(this.loadDataEmptyState, listing.loadDataEmptyState) && Intrinsics.areEqual(this.loadMoreFinishedState, listing.loadMoreFinishedState) && Intrinsics.areEqual(this.loadFirstPagingErrorState, listing.loadFirstPagingErrorState) && Intrinsics.areEqual(this.initRefresh, listing.initRefresh);
    }

    @Nullable
    public final Function0<Unit> getInitRefresh() {
        return this.initRefresh;
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
    public final LiveData<PagedList<T>> getPagedList() {
        return this.pagedList;
    }

    public int hashCode() {
        int iHashCode = this.pagedList.hashCode() * 31;
        LiveData<Resource<Unit>> liveData = this.loadDataEmptyState;
        int iHashCode2 = (iHashCode + (liveData == null ? 0 : liveData.hashCode())) * 31;
        LiveData<Resource<Unit>> liveData2 = this.loadMoreFinishedState;
        int iHashCode3 = (iHashCode2 + (liveData2 == null ? 0 : liveData2.hashCode())) * 31;
        LiveData<Resource<Unit>> liveData3 = this.loadFirstPagingErrorState;
        int iHashCode4 = (iHashCode3 + (liveData3 == null ? 0 : liveData3.hashCode())) * 31;
        Function0<Unit> function0 = this.initRefresh;
        return iHashCode4 + (function0 != null ? function0.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Listing(pagedList=" + this.pagedList + ", loadDataEmptyState=" + this.loadDataEmptyState + ", loadMoreFinishedState=" + this.loadMoreFinishedState + ", loadFirstPagingErrorState=" + this.loadFirstPagingErrorState + ", initRefresh=" + this.initRefresh + ')';
    }

    public /* synthetic */ Listing(LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(liveData, (i & 2) != 0 ? null : liveData2, (i & 4) != 0 ? null : liveData3, (i & 8) != 0 ? null : liveData4, (i & 16) != 0 ? null : function0);
    }
}
