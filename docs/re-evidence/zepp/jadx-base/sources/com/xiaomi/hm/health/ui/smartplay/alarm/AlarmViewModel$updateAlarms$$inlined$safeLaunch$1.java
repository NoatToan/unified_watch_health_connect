package com.xiaomi.hm.health.ui.smartplay.alarm;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.alarm.AlarmViewModel$updateAlarms$$inlined$safeLaunch$1", f = "AlarmViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
public final class AlarmViewModel$updateAlarms$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ AlarmViewModel d;
    public final /* synthetic */ IAlarmCallback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmViewModel$updateAlarms$$inlined$safeLaunch$1(Continuation continuation, List list, AlarmViewModel alarmViewModel, IAlarmCallback iAlarmCallback) {
        super(2, continuation);
        this.c = list;
        this.d = alarmViewModel;
        this.e = iAlarmCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AlarmViewModel$updateAlarms$$inlined$safeLaunch$1 alarmViewModel$updateAlarms$$inlined$safeLaunch$1 = new AlarmViewModel$updateAlarms$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e);
        alarmViewModel$updateAlarms$$inlined$safeLaunch$1.b = obj;
        return alarmViewModel$updateAlarms$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AlarmViewModel$updateAlarms$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<AlarmClockExt> list = this.c;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (AlarmClockExt alarmClockExt : list) {
                    IAlarmDevice alarmDevice = this.d.getAlarmDevice();
                    boolean zBooleanValue = (alarmDevice == null || (boolBoxBoolean = Boxing.boxBoolean(alarmDevice.updateAlarm(alarmClockExt))) == null) ? false : boolBoxBoolean.booleanValue();
                    HMLog.info("AlarmViewModel", new AlarmViewModel.r(alarmClockExt, zBooleanValue));
                    if (Boxing.boxBoolean(!zBooleanValue).booleanValue()) {
                        z = true;
                        break;
                    }
                }
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AlarmViewModel.q qVar = new AlarmViewModel.q(this.e, z, null);
            this.a = 1;
            if (BuildersKt.withContext(main, qVar, this) == coroutine_suspended) {
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
