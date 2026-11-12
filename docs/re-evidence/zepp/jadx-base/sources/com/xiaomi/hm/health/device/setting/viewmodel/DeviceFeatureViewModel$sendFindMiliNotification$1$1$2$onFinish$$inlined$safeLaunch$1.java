package com.xiaomi.hm.health.device.setting.viewmodel;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1(Continuation continuation, Function1 function1, boolean z) {
        super(2, continuation);
        this.c = function1;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1 deviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1 = new DeviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1(continuation, this.c, this.d);
        deviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1.b = obj;
        return deviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceFeatureViewModel$sendFindMiliNotification$1$1$2$onFinish$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            DeviceFeatureViewModel$sendFindMiliNotification$1$1.AnonymousClass2.b bVar = new DeviceFeatureViewModel$sendFindMiliNotification$1$1.AnonymousClass2.b(this.c, this.d, null);
            this.a = 1;
            if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
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
}
