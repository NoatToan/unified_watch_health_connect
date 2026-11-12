package com.xiaomi.fitness.health.curse;

import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.view.CurseNoticeCardView;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import defpackage.ls9;
import defpackage.pu9;
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
@DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseMainActivity$initPredictNoticeCards$6$1", f = "CurseMainActivity.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
public final class CurseMainActivity$initPredictNoticeCards$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CurseMainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurseMainActivity$initPredictNoticeCards$6$1(CurseMainActivity curseMainActivity, Continuation<? super CurseMainActivity$initPredictNoticeCards$6$1> continuation) {
        super(2, continuation);
        this.this$0 = curseMainActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CurseMainActivity curseMainActivity, boolean z) {
        curseMainActivity.hrNTempMonitorClose = !z;
        CurseNoticeCardView openHrAndTempMonitorView = CurseMainActivity.access$getMBinding(curseMainActivity).H;
        Intrinsics.checkNotNullExpressionValue(openHrAndTempMonitorView, "openHrAndTempMonitorView");
        ViewExtKt.setVisible(openHrAndTempMonitorView, !z);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurseMainActivity$initPredictNoticeCards$6$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CurseMainVM curseMainVMAccess$getMViewModel = CurseMainActivity.access$getMViewModel(this.this$0);
            int typeMonitor = this.this$0.getTypeMonitor();
            pu9 temperatureMonitor = this.this$0.getTemperatureMonitor();
            ls9 heartRateMonitor = this.this$0.getHeartRateMonitor();
            final CurseMainActivity curseMainActivity = this.this$0;
            Function1<? super Boolean, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.health.curse.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return CurseMainActivity$initPredictNoticeCards$6$1.invokeSuspend$lambda$0(curseMainActivity, ((Boolean) obj2).booleanValue());
                }
            };
            this.label = 1;
            if (curseMainVMAccess$getMViewModel.openHrNTempMonitorSwitch(typeMonitor, temperatureMonitor, heartRateMonitor, function1, this) == coroutine_suspended) {
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
        return ((CurseMainActivity$initPredictNoticeCards$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
