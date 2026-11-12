package com.xiaomi.fitness.nfc.ui;

import com.miui.tsmclient.entity.BulletinResponseInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBulletDialog$1$1$1$1", f = "TransitViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TransitViewModel$loadBulletDialog$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BulletinResponseInfo.BulletinInfo> $list;
    final /* synthetic */ Function1<List<? extends BulletinResponseInfo.BulletinInfo>, Unit> $success;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransitViewModel$loadBulletDialog$1$1$1$1(Function1<? super List<? extends BulletinResponseInfo.BulletinInfo>, Unit> function1, List<BulletinResponseInfo.BulletinInfo> list, Continuation<? super TransitViewModel$loadBulletDialog$1$1$1$1> continuation) {
        super(2, continuation);
        this.$success = function1;
        this.$list = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransitViewModel$loadBulletDialog$1$1$1$1(this.$success, this.$list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<List<? extends BulletinResponseInfo.BulletinInfo>, Unit> function1 = this.$success;
        List<BulletinResponseInfo.BulletinInfo> list = this.$list;
        Intrinsics.checkNotNull(list);
        function1.invoke2(list);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransitViewModel$loadBulletDialog$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
