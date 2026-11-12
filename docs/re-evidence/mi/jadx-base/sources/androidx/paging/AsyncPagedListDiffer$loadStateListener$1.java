package androidx.paging;

import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "T", "", GlobalDynamicSettingConst.COUNTRY_DOMAIN_PV, "Landroidx/paging/LoadType;", "Lkotlin/ParameterName;", "name", "type", "p2", "Landroidx/paging/LoadState;", "state", "invoke"}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements Function2<LoadType, LoadState, Unit> {
    public AsyncPagedListDiffer$loadStateListener$1(PagedList.LoadStateManager loadStateManager) {
        super(2, loadStateManager, PagedList.LoadStateManager.class, "onStateChanged", "onStateChanged(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LoadType loadType, LoadState loadState) {
        invoke2(loadType, loadState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LoadType p1, @NotNull LoadState p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((PagedList.LoadStateManager) this.receiver).onStateChanged(p1, p2);
    }
}
