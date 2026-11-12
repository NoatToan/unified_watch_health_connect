package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import defpackage.p14;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiTodoSyncDeviceManager$syncMiuiTodoListToDeviceIfNeed$1$onSuccess$1", f = "MiuiTodoSyncDeviceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MiuiTodoSyncDeviceManager$syncMiuiTodoListToDeviceIfNeed$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ p14[] $deviceRemindList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuiTodoSyncDeviceManager$syncMiuiTodoListToDeviceIfNeed$1$onSuccess$1(p14[] p14VarArr, Continuation<? super MiuiTodoSyncDeviceManager$syncMiuiTodoListToDeviceIfNeed$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$deviceRemindList = p14VarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiuiTodoSyncDeviceManager$syncMiuiTodoListToDeviceIfNeed$1$onSuccess$1(this.$deviceRemindList, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MiuiTodoSyncDeviceManager miuiTodoSyncDeviceManager = MiuiTodoSyncDeviceManager.INSTANCE;
        p14[] p14VarArr = this.$deviceRemindList;
        miuiTodoSyncDeviceManager.mergeAndSyncMiuiTodoList(p14VarArr != null ? ArraysKt___ArraysKt.toList(p14VarArr) : null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MiuiTodoSyncDeviceManager$syncMiuiTodoListToDeviceIfNeed$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
