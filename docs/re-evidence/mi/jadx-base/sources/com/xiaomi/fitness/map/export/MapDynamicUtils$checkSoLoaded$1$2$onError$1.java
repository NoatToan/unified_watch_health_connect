package com.xiaomi.fitness.map.export;

import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.net.downloadV2.DownloadException;
import defpackage.i0j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.map.export.MapDynamicUtils$checkSoLoaded$1$2$onError$1", f = "MapDynamicUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MapDynamicUtils$checkSoLoaded$1$2$onError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, Exception, Unit> $callback;
    final /* synthetic */ DownloadException $e;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapDynamicUtils$checkSoLoaded$1$2$onError$1(Function2<? super Boolean, ? super Exception, Unit> function2, DownloadException downloadException, Continuation<? super MapDynamicUtils$checkSoLoaded$1$2$onError$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
        this.$e = downloadException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapDynamicUtils$checkSoLoaded$1$2$onError$1(this.$callback, this.$e, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MapDynamicUtils.INSTANCE.hideLoading();
        ToastUtil.INSTANCE.showToast(i0j.common_network_connection_failed_please_retry);
        this.$callback.invoke(Boxing.boxBoolean(false), this.$e);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapDynamicUtils$checkSoLoaded$1$2$onError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
