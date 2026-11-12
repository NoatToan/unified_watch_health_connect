package com.xiaomi.fitness.sport.viewmodel;

import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_export.data.StrategyRouteInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$RouteData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel$aiRouteDataFlow$1$1$1", f = "CreateRouteViewModel.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteViewModel$aiRouteDataFlow$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CreateRouteViewModel.RouteData>, Object> {
    final /* synthetic */ StrategyRouteInfo $routeInfo;
    int label;
    final /* synthetic */ CreateRouteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteViewModel$aiRouteDataFlow$1$1$1(CreateRouteViewModel createRouteViewModel, StrategyRouteInfo strategyRouteInfo, Continuation<? super CreateRouteViewModel$aiRouteDataFlow$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = createRouteViewModel;
        this.$routeInfo = strategyRouteInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteViewModel$aiRouteDataFlow$1$1$1(this.this$0, this.$routeInfo, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        List list;
        CommonTrackData commonTrackData;
        CommonTrackData commonTrackData2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreateRouteViewModel createRouteViewModel = this.this$0;
            String kmlFile = this.$routeInfo.getKmlFile();
            String name = this.$routeInfo.getName();
            this.label = 1;
            obj = RouteBaseViewModel.getTraceRawDataDirectly$default(createRouteViewModel, kmlFile, name, null, this, 4, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) obj;
        Logger.i(CreateRouteViewModel.TAG, "parsedData " + pair);
        if (pair == null || (list = (List) pair.getFirst()) == null || !(!list.isEmpty())) {
            str = "";
        } else {
            List list2 = (List) pair.getFirst();
            Double dBoxDouble = (list2 == null || (commonTrackData2 = (CommonTrackData) CollectionsKt___CollectionsKt.first(list2)) == null) ? null : Boxing.boxDouble(commonTrackData2.getLongitude());
            List list3 = (List) pair.getFirst();
            str = dBoxDouble + "," + ((list3 == null || (commonTrackData = (CommonTrackData) CollectionsKt___CollectionsKt.first(list3)) == null) ? null : Boxing.boxDouble(commonTrackData.getLatitude()));
        }
        return new CreateRouteViewModel.RouteData(this.$routeInfo.getIcon(), pair != null ? (List) pair.getFirst() : null, this.$routeInfo.getRotateAngle(), pair != null ? (String) pair.getSecond() : null, this.$routeInfo.getLength(), this.$routeInfo.getRouteStyle(), str, this.$routeInfo.getIdentify());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CreateRouteViewModel.RouteData> continuation) {
        return ((CreateRouteViewModel$aiRouteDataFlow$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
