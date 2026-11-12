package com.xiaomi.hm.health.ui.smartplay.alarm;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmVersionInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
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
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.alarm.AlarmViewModel$queryVersion$$inlined$safeLaunch$1", f = "AlarmViewModel.kt", i = {}, l = {64, 65}, m = "invokeSuspend", n = {}, s = {})
public final class AlarmViewModel$queryVersion$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ AlarmViewModel c;
    public final /* synthetic */ IAlarmCallback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmViewModel$queryVersion$$inlined$safeLaunch$1(Continuation continuation, AlarmViewModel alarmViewModel, IAlarmCallback iAlarmCallback) {
        super(2, continuation);
        this.c = alarmViewModel;
        this.d = iAlarmCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AlarmViewModel$queryVersion$$inlined$safeLaunch$1 alarmViewModel$queryVersion$$inlined$safeLaunch$1 = new AlarmViewModel$queryVersion$$inlined$safeLaunch$1(continuation, this.c, this.d);
        alarmViewModel$queryVersion$$inlined$safeLaunch$1.b = obj;
        return alarmViewModel$queryVersion$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AlarmViewModel$queryVersion$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AlarmVersionInfo alarmVersionInfo;
        MainCoroutineDispatcher main;
        AlarmViewModel.l lVar;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        IAlarmDevice alarmDevice = this.c.getAlarmDevice();
        if (alarmDevice == null) {
            alarmVersionInfo = null;
        } else {
            this.a = 1;
            obj = alarmDevice.queryVersion(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        main = Dispatchers.getMain();
        lVar = new AlarmViewModel.l(this.d, alarmVersionInfo, null);
        this.a = 2;
        if (BuildersKt.withContext(main, lVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        alarmVersionInfo = (AlarmVersionInfo) obj;
        main = Dispatchers.getMain();
        lVar = new AlarmViewModel.l(this.d, alarmVersionInfo, null);
        this.a = 2;
        if (BuildersKt.withContext(main, lVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
