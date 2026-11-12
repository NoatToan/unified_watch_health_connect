package androidx.paging;

import com.mi.health.course.export.data.CourseConfigModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002J1\u0010\u000f\u001a\u00020\u00102\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0012H\u0080\bø\u0001\u0000¢\u0006\u0002\b\u0015J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u001bJ\u0015\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"Landroidx/paging/MutableLoadStateCollection;", "", "()V", "append", "Landroidx/paging/LoadState;", "mediator", "Landroidx/paging/LoadStates;", "prepend", "refresh", "source", "computeHelperState", "previousState", "sourceRefreshState", "sourceState", "remoteState", "forEach", "", "op", "Lkotlin/Function3;", "Landroidx/paging/LoadType;", "", "forEach$paging_common", "get", "type", "remote", CourseConfigModel.DevCmd.CMD_ACTION_SET, "combinedLoadStates", "Landroidx/paging/CombinedLoadStates;", "sourceLoadStates", "remoteLoadStates", "state", "snapshot", "terminates", "loadType", "terminates$paging_common", "updateHelperStates", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class MutableLoadStateCollection {
    private LoadState append;
    private LoadStates mediator;
    private LoadState prepend;
    private LoadState refresh;
    private LoadStates source;

    public MutableLoadStateCollection() {
        LoadState.NotLoading.Companion companion = LoadState.NotLoading.INSTANCE;
        this.refresh = companion.getIncomplete$paging_common();
        this.prepend = companion.getIncomplete$paging_common();
        this.append = companion.getIncomplete$paging_common();
        this.source = LoadStates.INSTANCE.getIDLE();
    }

    private final LoadState computeHelperState(LoadState previousState, LoadState sourceRefreshState, LoadState sourceState, LoadState remoteState) {
        if (remoteState == null) {
            return sourceState;
        }
        return (!(previousState instanceof LoadState.Loading) || ((sourceRefreshState instanceof LoadState.NotLoading) && (remoteState instanceof LoadState.NotLoading)) || (remoteState instanceof LoadState.Error)) ? remoteState : previousState;
    }

    private final void updateHelperStates() {
        LoadState loadState = this.refresh;
        LoadState refresh = this.source.getRefresh();
        LoadState refresh2 = this.source.getRefresh();
        LoadStates loadStates = this.mediator;
        this.refresh = computeHelperState(loadState, refresh, refresh2, loadStates != null ? loadStates.getRefresh() : null);
        LoadState loadState2 = this.prepend;
        LoadState refresh3 = this.source.getRefresh();
        LoadState prepend = this.source.getPrepend();
        LoadStates loadStates2 = this.mediator;
        this.prepend = computeHelperState(loadState2, refresh3, prepend, loadStates2 != null ? loadStates2.getPrepend() : null);
        LoadState loadState3 = this.append;
        LoadState refresh4 = this.source.getRefresh();
        LoadState append = this.source.getAppend();
        LoadStates loadStates3 = this.mediator;
        this.append = computeHelperState(loadState3, refresh4, append, loadStates3 != null ? loadStates3.getAppend() : null);
    }

    public final void forEach$paging_common(@NotNull Function3<? super LoadType, ? super Boolean, ? super LoadState, Unit> op) {
        Intrinsics.checkNotNullParameter(op, "op");
        LoadStates loadStates = this.source;
        LoadType loadType = LoadType.REFRESH;
        LoadState refresh = loadStates.getRefresh();
        Boolean bool = Boolean.FALSE;
        op.invoke(loadType, bool, refresh);
        LoadType loadType2 = LoadType.PREPEND;
        op.invoke(loadType2, bool, loadStates.getPrepend());
        LoadType loadType3 = LoadType.APPEND;
        op.invoke(loadType3, bool, loadStates.getAppend());
        LoadStates loadStates2 = this.mediator;
        if (loadStates2 != null) {
            LoadState refresh2 = loadStates2.getRefresh();
            Boolean bool2 = Boolean.TRUE;
            op.invoke(loadType, bool2, refresh2);
            op.invoke(loadType2, bool2, loadStates2.getPrepend());
            op.invoke(loadType3, bool2, loadStates2.getAppend());
        }
    }

    @Nullable
    public final LoadState get(@NotNull LoadType type, boolean remote) {
        Intrinsics.checkNotNullParameter(type, "type");
        LoadStates loadStates = remote ? this.mediator : this.source;
        if (loadStates != null) {
            return loadStates.get$paging_common(type);
        }
        return null;
    }

    public final void set(@NotNull CombinedLoadStates combinedLoadStates) {
        Intrinsics.checkNotNullParameter(combinedLoadStates, "combinedLoadStates");
        this.refresh = combinedLoadStates.getRefresh();
        this.prepend = combinedLoadStates.getPrepend();
        this.append = combinedLoadStates.getAppend();
        this.source = combinedLoadStates.getSource();
        this.mediator = combinedLoadStates.getMediator();
    }

    @NotNull
    public final CombinedLoadStates snapshot() {
        return new CombinedLoadStates(this.refresh, this.prepend, this.append, this.source, this.mediator);
    }

    public final boolean terminates$paging_common(@NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        LoadState loadState = get(loadType, false);
        Intrinsics.checkNotNull(loadState);
        if (!loadState.getEndOfPaginationReached()) {
            return false;
        }
        LoadState loadState2 = get(loadType, true);
        return loadState2 == null || loadState2.getEndOfPaginationReached();
    }

    public final void set(@NotNull LoadStates sourceLoadStates, @Nullable LoadStates remoteLoadStates) {
        Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
        this.source = sourceLoadStates;
        this.mediator = remoteLoadStates;
        updateHelperStates();
    }

    public final boolean set(@NotNull LoadType type, boolean remote, @NotNull LoadState state) {
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        if (remote) {
            LoadStates loadStates = this.mediator;
            LoadStates loadStatesModifyState$paging_common = (loadStates != null ? loadStates : LoadStates.INSTANCE.getIDLE()).modifyState$paging_common(type, state);
            this.mediator = loadStatesModifyState$paging_common;
            zAreEqual = Intrinsics.areEqual(loadStatesModifyState$paging_common, loadStates);
        } else {
            LoadStates loadStates2 = this.source;
            LoadStates loadStatesModifyState$paging_common2 = loadStates2.modifyState$paging_common(type, state);
            this.source = loadStatesModifyState$paging_common2;
            zAreEqual = Intrinsics.areEqual(loadStatesModifyState$paging_common2, loadStates2);
        }
        boolean z = !zAreEqual;
        updateHelperStates();
        return z;
    }
}
