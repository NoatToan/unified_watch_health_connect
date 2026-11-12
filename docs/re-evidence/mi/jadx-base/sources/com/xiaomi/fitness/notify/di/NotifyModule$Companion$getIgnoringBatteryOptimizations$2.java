package com.xiaomi.fitness.notify.di;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.health.BackgroundRestrictionUtil;
import defpackage.d2m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.di.NotifyModule$Companion$getIgnoringBatteryOptimizations$2", f = "NotifyModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NotifyModule$Companion$getIgnoringBatteryOptimizations$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyModule$Companion$getIgnoringBatteryOptimizations$2(Context context, Continuation<? super NotifyModule$Companion$getIgnoringBatteryOptimizations$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotifyModule$Companion$getIgnoringBatteryOptimizations$2(this.$context, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z = true;
        if (AppUtil.INSTANCE.isPlayChannel() || !RomUtils.INSTANCE.isMiui()) {
            boolean zY = d2m.y(this.$context);
            Logger.i(NotifyModule.TAG, "getIgnoringBatteryOptimizations no miui = " + zY);
            if (!zY) {
                z = false;
            }
        } else {
            BackgroundRestrictionUtil backgroundRestrictionUtil = BackgroundRestrictionUtil.INSTANCE;
            Context context = this.$context;
            String packageName = ApplicationExtKt.getApplication().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            Boolean boolIsNoRestrictedLevel = backgroundRestrictionUtil.isNoRestrictedLevel(context, packageName);
            boolean zBooleanValue = boolIsNoRestrictedLevel != null ? boolIsNoRestrictedLevel.booleanValue() : false;
            Logger.i(NotifyModule.TAG, "getIgnoringBatteryOptimizations miui = " + zBooleanValue);
            if (!zBooleanValue) {
                z = false;
            }
        }
        return Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((NotifyModule$Companion$getIgnoringBatteryOptimizations$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
