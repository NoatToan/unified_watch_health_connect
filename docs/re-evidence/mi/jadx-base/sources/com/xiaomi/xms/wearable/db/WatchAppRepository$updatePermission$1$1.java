package com.xiaomi.xms.wearable.db;

import com.xiaomi.xms.wearable.db.dao.WatchAppCapabilityDao;
import com.xiaomi.xms.wearable.db.entity.WatchAppCapability;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.xms.wearable.db.WatchAppRepository$updatePermission$1$1", f = "WatchAppRepository.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class WatchAppRepository$updatePermission$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WatchAppCapability $watchAppCapability;
    int label;
    final /* synthetic */ WatchAppRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchAppRepository$updatePermission$1$1(WatchAppRepository watchAppRepository, WatchAppCapability watchAppCapability, Continuation<? super WatchAppRepository$updatePermission$1$1> continuation) {
        super(2, continuation);
        this.this$0 = watchAppRepository;
        this.$watchAppCapability = watchAppCapability;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchAppRepository$updatePermission$1$1(this.this$0, this.$watchAppCapability, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WatchAppCapabilityDao appCapabilityDao = this.this$0.getAppCapabilityDao();
            WatchAppCapability[] watchAppCapabilityArr = {this.$watchAppCapability};
            this.label = 1;
            if (appCapabilityDao.insert(watchAppCapabilityArr, this) == coroutine_suspended) {
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
        return ((WatchAppRepository$updatePermission$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
