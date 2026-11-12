package com.xiaomi.fitness.devicesettings.common.offlinemap;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.RegionListFragment$onViewCreated$2$1", f = "RegionListFragment.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRegionListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionListFragment.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/RegionListFragment$onViewCreated$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1863#2,2:139\n*S KotlinDebug\n*F\n+ 1 RegionListFragment.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/RegionListFragment$onViewCreated$2$1\n*L\n84#1:139,2\n*E\n"})
public final class RegionListFragment$onViewCreated$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Collection<DistrictData> $districts;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RegionListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionListFragment$onViewCreated$2$1(Collection<DistrictData> collection, RegionListFragment regionListFragment, Continuation<? super RegionListFragment$onViewCreated$2$1> continuation) {
        super(2, continuation);
        this.$districts = collection;
        this.this$0 = regionListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RegionListFragment$onViewCreated$2$1(this.$districts, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RegionListFragment regionListFragment;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Collection<DistrictData> collection = this.$districts;
            regionListFragment = this.this$0;
            it = collection.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            regionListFragment = (RegionListFragment) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            DistrictData districtData = (DistrictData) it.next();
            String adcode = districtData.getAdcode();
            List list = regionListFragment.districtList;
            if (list == null) {
                Intrinsics.throwUninitializedPropertyAccessException("districtList");
                list = null;
            }
            List listFindAdcodeIndex$default = OfflineMapExKt.findAdcodeIndex$default(adcode, list, null, 4, null);
            FitnessLogUtils.i(RegionListFragment.TAG, "installing findAdcodeIndex adcode:" + districtData + ",list:" + listFindAdcodeIndex$default);
            if (!listFindAdcodeIndex$default.isEmpty()) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                RegionListFragment$onViewCreated$2$1$1$1 regionListFragment$onViewCreated$2$1$1$1 = new RegionListFragment$onViewCreated$2$1$1$1(regionListFragment, listFindAdcodeIndex$default, districtData, null);
                this.L$0 = regionListFragment;
                this.L$1 = it;
                this.label = 1;
                if (BuildersKt.withContext(main, regionListFragment$onViewCreated$2$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RegionListFragment$onViewCreated$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
