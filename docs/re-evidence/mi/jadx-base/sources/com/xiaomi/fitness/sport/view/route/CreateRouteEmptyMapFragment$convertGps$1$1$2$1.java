package com.xiaomi.fitness.sport.view.route;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwnerKt;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.sport.route.detail.model.AddressInfo;
import com.xiaomi.fitness.sport.route.detail.model.EmptyMapData;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import com.xiaomi.fitness.sport.viewmodel.RouteBaseViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1$1$2$1", f = "CreateRouteEmptyMapFragment.kt", i = {}, l = {ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteEmptyMapFragment$convertGps$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ EmptyMapData $data;
    final /* synthetic */ float $distance;
    final /* synthetic */ String $filePath;
    final /* synthetic */ AddressInfo $it;
    final /* synthetic */ List<CommonTrackData> $trackData;
    int label;
    final /* synthetic */ CreateRouteEmptyMapFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteEmptyMapFragment$convertGps$1$1$2$1(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, EmptyMapData emptyMapData, String str, AddressInfo addressInfo, float f, Bitmap bitmap, List<CommonTrackData> list, Continuation<? super CreateRouteEmptyMapFragment$convertGps$1$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = createRouteEmptyMapFragment;
        this.$data = emptyMapData;
        this.$filePath = str;
        this.$it = addressInfo;
        this.$distance = f;
        this.$bitmap = bitmap;
        this.$trackData = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, EmptyMapData emptyMapData, String str, int i, int i2) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(createRouteEmptyMapFragment), null, null, new CreateRouteEmptyMapFragment$convertGps$1$1$2$1$1$1(createRouteEmptyMapFragment, i, emptyMapData, str, i2, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteEmptyMapFragment$convertGps$1$1$2$1(this.this$0, this.$data, this.$filePath, this.$it, this.$distance, this.$bitmap, this.$trackData, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreateRouteViewModel createRouteViewModel = this.this$0.createRouteViewModel;
            if (createRouteViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                createRouteViewModel = null;
            }
            int strategyId = this.$data.getStrategyId();
            String str = this.$filePath;
            String title = this.$it.getTitle();
            String strValueOf = String.valueOf(this.$distance);
            Bitmap bitmap = this.$bitmap;
            Integer numBoxInt = Boxing.boxInt(4);
            String str2 = ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) this.$trackData)).getLongitude() + "," + ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) this.$trackData)).getLatitude();
            final CreateRouteEmptyMapFragment createRouteEmptyMapFragment = this.this$0;
            final EmptyMapData emptyMapData = this.$data;
            final String str3 = this.$filePath;
            Function2 function2 = new Function2() { // from class: com.xiaomi.fitness.sport.view.route.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CreateRouteEmptyMapFragment$convertGps$1$1$2$1.invokeSuspend$lambda$0(createRouteEmptyMapFragment, emptyMapData, str3, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                }
            };
            this.label = 1;
            if (RouteBaseViewModel.uploadTrackLibs$default(createRouteViewModel, strategyId, str, title, strValueOf, bitmap, 0, numBoxInt, str2, null, function2, this, 288, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateRouteEmptyMapFragment$convertGps$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
