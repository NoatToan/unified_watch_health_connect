package com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel$syncActiveDetection$1$1", f = "HuamiHrSettingViewModel.kt", i = {1}, l = {SportReportBaseParser.ReportType.oxygenPartialPressureThreshold, 200}, m = "invokeSuspend", n = {"success"}, s = {"Z$0"})
public final class HuamiHrSettingViewModel$syncActiveDetection$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ boolean $checked;
    boolean Z$0;
    int label;
    final /* synthetic */ HuamiHrSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HuamiHrSettingViewModel$syncActiveDetection$1$1(HuamiHrSettingViewModel huamiHrSettingViewModel, boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super HuamiHrSettingViewModel$syncActiveDetection$1$1> continuation) {
        super(2, continuation);
        this.this$0 = huamiHrSettingViewModel;
        this.$checked = z;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HuamiHrSettingViewModel$syncActiveDetection$1$1(this.this$0, this.$checked, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
            }
            zBooleanValue = z;
            Logger.i(this.this$0.getTAG(), "syncActiveDetection success:" + zBooleanValue);
            this.$callback.invoke2(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineDispatcher io2 = Dispatchers.getIO();
        HuamiHrSettingViewModel$syncActiveDetection$1$1$success$1 huamiHrSettingViewModel$syncActiveDetection$1$1$success$1 = new HuamiHrSettingViewModel$syncActiveDetection$1$1$success$1(this.this$0, this.$checked, null);
        this.label = 1;
        obj = BuildersKt.withContext(io2, huamiHrSettingViewModel$syncActiveDetection$1$1$success$1, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            this.this$0.getMConfig().setActiveEnable(this.$checked);
            HuamiHrSettingViewModel huamiHrSettingViewModel = this.this$0;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            if (huamiHrSettingViewModel.syncRemote(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zBooleanValue;
            zBooleanValue = z;
        }
        Logger.i(this.this$0.getTAG(), "syncActiveDetection success:" + zBooleanValue);
        this.$callback.invoke2(Boxing.boxBoolean(zBooleanValue));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HuamiHrSettingViewModel$syncActiveDetection$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
