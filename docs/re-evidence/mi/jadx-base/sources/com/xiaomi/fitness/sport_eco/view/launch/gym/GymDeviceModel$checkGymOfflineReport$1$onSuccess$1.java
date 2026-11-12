package com.xiaomi.fitness.sport_eco.view.launch.gym;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.utils.ToastUtil;
import defpackage.e1j;
import defpackage.ft9;
import java.lang.ref.WeakReference;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel$checkGymOfflineReport$1$onSuccess$1", f = "GymDeviceModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GymDeviceModel$checkGymOfflineReport$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ ft9.a $handleGymSportReportList;
    final /* synthetic */ boolean $showDialog;
    final /* synthetic */ WeakReference<FragmentActivity> $weak;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GymDeviceModel$checkGymOfflineReport$1$onSuccess$1(ft9.a aVar, boolean z, WeakReference<FragmentActivity> weakReference, Function1<? super Boolean, Unit> function1, Continuation<? super GymDeviceModel$checkGymOfflineReport$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$handleGymSportReportList = aVar;
        this.$showDialog = z;
        this.$weak = weakReference;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymDeviceModel$checkGymOfflineReport$1$onSuccess$1(this.$handleGymSportReportList, this.$showDialog, this.$weak, this.$callback, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ft9[] ft9VarArr;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ft9.a aVar = this.$handleGymSportReportList;
        if (aVar != null && (ft9VarArr = aVar.c) != null) {
            if (!(ft9VarArr.length == 0)) {
                if (this.$showDialog) {
                    GymDeviceModel.INSTANCE.showReportDialog(this.$weak.get(), this.$handleGymSportReportList);
                } else {
                    GymDeviceModel.INSTANCE.getReportsFromGYM(this.$weak.get(), this.$handleGymSportReportList);
                }
            } else if (!this.$showDialog) {
                ToastUtil.INSTANCE.showToast(e1j.t2);
            }
        } else if (!this.$showDialog) {
            ToastUtil.INSTANCE.showToast(e1j.t2);
        }
        Function1<Boolean, Unit> function1 = this.$callback;
        if (function1 != null) {
            function1.invoke2(Boxing.boxBoolean(true));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymDeviceModel$checkGymOfflineReport$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
