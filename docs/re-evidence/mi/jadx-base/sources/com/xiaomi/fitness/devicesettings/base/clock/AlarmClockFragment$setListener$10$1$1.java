package com.xiaomi.fitness.devicesettings.base.clock;

import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.clock.AlarmClockFragment$setListener$10$1$1", f = "AlarmClockFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AlarmClockFragment$setListener$10$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AlarmSettingItem> $it;
    int label;
    final /* synthetic */ AlarmClockFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlarmClockFragment$setListener$10$1$1(AlarmClockFragment alarmClockFragment, List<? extends AlarmSettingItem> list, Continuation<? super AlarmClockFragment$setListener$10$1$1> continuation) {
        super(2, continuation);
        this.this$0 = alarmClockFragment;
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlarmClockFragment$setListener$10$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AlarmClockFragment.access$getMBinding(this.this$0).D.C.setEnabled(true);
        this.this$0.updateViewAfterDelete(this.$it);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AlarmClockFragment$setListener$10$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
