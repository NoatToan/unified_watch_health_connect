package androidx.paging;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import defpackage.dvq;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r\"A\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002\"\b\b\u0000\u0010\u000e*\u00020\u0000\"\b\b\u0001\u0010\u000f*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "T", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "cachedIn", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LiveData;", "Ldvq;", "viewModel", "(Landroidx/lifecycle/LiveData;Ldvq;)Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "(Landroidx/lifecycle/LiveData;Lkotlinx/coroutines/CoroutineScope;)Landroidx/lifecycle/LiveData;", "Key", "Value", "Landroidx/paging/Pager;", "getLiveData", "(Landroidx/paging/Pager;)Landroidx/lifecycle/LiveData;", "liveData", "paging-runtime_release"}, k = 2, mv = {1, 4, 2})
@JvmName(name = "PagingLiveData")
public final class PagingLiveData {
    @NotNull
    public static final <T> LiveData<PagingData<T>> cachedIn(@NotNull LiveData<PagingData<T>> cachedIn, @NotNull dvq viewModel) {
        Intrinsics.checkNotNullParameter(cachedIn, "$this$cachedIn");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(cachedIn), ViewModelKt.getViewModelScope(viewModel)), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public static final <Key, Value> LiveData<PagingData<Value>> getLiveData(@NotNull Pager<Key, Value> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "$this$liveData");
        return FlowLiveDataConversions.asLiveData$default(liveData.getFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public static final <T> LiveData<PagingData<T>> cachedIn(@NotNull LiveData<PagingData<T>> cachedIn, @NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(cachedIn, "$this$cachedIn");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(cachedIn), LifecycleKt.getCoroutineScope(lifecycle)), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public static final <T> LiveData<PagingData<T>> cachedIn(@NotNull LiveData<PagingData<T>> cachedIn, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(cachedIn, "$this$cachedIn");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(FlowLiveDataConversions.asFlow(cachedIn), scope), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
