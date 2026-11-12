package com.xiaomi.fitness.devicesettings.common.offlinemap;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.RegionListFragment$onViewCreated$1$1$2$1", f = "RegionListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RegionListFragment$onViewCreated$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Integer> $list;
    final /* synthetic */ DistrictData $value;
    int label;
    final /* synthetic */ RegionListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionListFragment$onViewCreated$1$1$2$1(RegionListFragment regionListFragment, List<Integer> list, DistrictData districtData, Continuation<? super RegionListFragment$onViewCreated$1$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = regionListFragment;
        this.$list = list;
        this.$value = districtData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RegionListFragment$onViewCreated$1$1$2$1(this.this$0, this.$list, this.$value, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DistrictAdapter adapter = this.this$0.getAdapter();
        List<Integer> list = this.$list;
        DistrictData districtData = this.$value;
        districtData.setDownloadStatus(DownloadStatus.STATUS_INSTALLED);
        districtData.setDownloadProgress(100);
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(districtData, "apply(...)");
        adapter.notifyItemStatus(list, districtData);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RegionListFragment$onViewCreated$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
