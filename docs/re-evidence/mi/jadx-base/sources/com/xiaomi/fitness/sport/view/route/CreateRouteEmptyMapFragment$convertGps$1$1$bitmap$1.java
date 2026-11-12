package com.xiaomi.fitness.sport.view.route;

import android.graphics.Bitmap;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteEmptyMapFragment$convertGps$1$1$bitmap$1", f = "CreateRouteEmptyMapFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteEmptyMapFragment$convertGps$1$1$bitmap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ List<CommonTrackData> $trackData;
    int label;
    final /* synthetic */ CreateRouteEmptyMapFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteEmptyMapFragment$convertGps$1$1$bitmap$1(CreateRouteEmptyMapFragment createRouteEmptyMapFragment, List<CommonTrackData> list, Continuation<? super CreateRouteEmptyMapFragment$convertGps$1$1$bitmap$1> continuation) {
        super(2, continuation);
        this.this$0 = createRouteEmptyMapFragment;
        this.$trackData = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteEmptyMapFragment$convertGps$1$1$bitmap$1(this.this$0, this.$trackData, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CreateRouteActivity createRouteActivity = this.this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        return createRouteActivity.buildBitmap(this.$trackData);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((CreateRouteEmptyMapFragment$convertGps$1$1$bitmap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
