package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.skill.AlertSkill;
import com.xiaomi.ai.api.Alerts;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.ai.speech.xiaoai.capability.instruction.AlertsInstruction$doDeleteAlert$1", f = "AlertsInstruction.kt", i = {}, l = {155, 156, 157}, m = "invokeSuspend", n = {}, s = {})
public final class AlertsInstruction$doDeleteAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ Alerts.AlertType b;
    public final /* synthetic */ AlertsInstruction c;
    public final /* synthetic */ List<String> d;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Alerts.AlertType.values().length];
            iArr[Alerts.AlertType.ALARM.ordinal()] = 1;
            iArr[Alerts.AlertType.REMINDER.ordinal()] = 2;
            iArr[Alerts.AlertType.TIMER.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertsInstruction$doDeleteAlert$1(Alerts.AlertType alertType, AlertsInstruction alertsInstruction, List<String> list, Continuation<? super AlertsInstruction$doDeleteAlert$1> continuation) {
        super(2, continuation);
        this.b = alertType;
        this.c = alertsInstruction;
        this.d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AlertsInstruction$doDeleteAlert$1(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
        return ((AlertsInstruction$doDeleteAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zG;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i2 == 1) {
                AlertSkill alertSkill = this.c.alertSkill;
                List<String> list = this.d;
                this.a = 1;
                obj = alertSkill.deleteAlarm(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zG = ((Boolean) obj).booleanValue();
            } else if (i2 == 2) {
                AlertSkill alertSkill2 = this.c.alertSkill;
                List<String> list2 = this.d;
                this.a = 2;
                obj = alertSkill2.deleteReminder(list2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zG = ((Boolean) obj).booleanValue();
            } else if (i2 != 3) {
                zG = this.c.g();
            } else {
                AlertSkill alertSkill3 = this.c.alertSkill;
                List<String> list3 = this.d;
                this.a = 3;
                obj = alertSkill3.deleteTimer(list3, this);
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
