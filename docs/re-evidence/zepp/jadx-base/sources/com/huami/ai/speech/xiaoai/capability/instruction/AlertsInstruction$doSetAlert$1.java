package com.huami.ai.speech.xiaoai.capability.instruction;

import com.xiaomi.ai.api.Alerts;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.ai.speech.xiaoai.capability.instruction.AlertsInstruction$doSetAlert$1", f = "AlertsInstruction.kt", i = {}, l = {101, 104, 107}, m = "invokeSuspend", n = {}, s = {})
public final class AlertsInstruction$doSetAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ Alerts.SetAlert b;
    public final /* synthetic */ AlertsInstruction c;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Alerts.AlertType.values().length];
            iArr[Alerts.AlertType.ALARM.ordinal()] = 1;
            iArr[Alerts.AlertType.TIMER.ordinal()] = 2;
            iArr[Alerts.AlertType.REMINDER.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertsInstruction$doSetAlert$1(Alerts.SetAlert setAlert, AlertsInstruction alertsInstruction, Continuation<? super AlertsInstruction$doSetAlert$1> continuation) {
        super(2, continuation);
        this.b = setAlert;
        this.c = alertsInstruction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AlertsInstruction$doSetAlert$1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
        return ((AlertsInstruction$doSetAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zG;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Alerts.AlertType type = this.b.getType();
            int i2 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i2 == 1) {
                AlertsInstruction alertsInstruction = this.c;
                Alerts.SetAlert setAlert = this.b;
                this.a = 1;
                obj = alertsInstruction.m(setAlert, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zG = ((Boolean) obj).booleanValue();
            } else if (i2 == 2) {
                AlertsInstruction alertsInstruction2 = this.c;
                Alerts.SetAlert setAlert2 = this.b;
                this.a = 2;
                obj = alertsInstruction2.o(setAlert2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zG = ((Boolean) obj).booleanValue();
            } else if (i2 != 3) {
                zG = this.c.g();
            } else {
                AlertsInstruction alertsInstruction3 = this.c;
                Alerts.SetAlert setAlert3 = this.b;
                this.a = 3;
                obj = alertsInstruction3.n(setAlert3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zG = ((Boolean) obj).booleanValue();
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            zG = ((Boolean) obj).booleanValue();
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            zG = ((Boolean) obj).booleanValue();
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            zG = ((Boolean) obj).booleanValue();
        }
        return Boxing.boxBoolean(zG);
    }
}
