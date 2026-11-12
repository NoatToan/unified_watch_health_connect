package com.xiaomi.fitness.notify.di;

import android.app.Application;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.di.NotifyModule$Companion$createBannerSettingsItem$1$ignoringBatteryOptimizations$1", f = "NotifyModule.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class NotifyModule$Companion$createBannerSettingsItem$1$ignoringBatteryOptimizations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    public NotifyModule$Companion$createBannerSettingsItem$1$ignoringBatteryOptimizations$1(Continuation<? super NotifyModule$Companion$createBannerSettingsItem$1$ignoringBatteryOptimizations$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotifyModule$Companion$createBannerSettingsItem$1$ignoringBatteryOptimizations$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NotifyModule.Companion companion = NotifyModule.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            this.label = 1;
            obj = companion.getIgnoringBatteryOptimizations(application, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((NotifyModule$Companion$createBannerSettingsItem$1$ignoringBatteryOptimizations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
