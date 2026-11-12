package com.xiaomi.fitness.sport_eco.view.launch.gym;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
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
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel$checkEcoJumpOfflineReport$1$onSuccess$1", f = "GymDeviceModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GymDeviceModel$checkEcoJumpOfflineReport$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ ft9.a $handleGymSportReportList;
    final /* synthetic */ String $localSportType;
    final /* synthetic */ boolean $showDialog;
    final /* synthetic */ WeakReference<FragmentActivity> $weak;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GymDeviceModel$checkEcoJumpOfflineReport$1$onSuccess$1(ft9.a aVar, boolean z, String str, WeakReference<FragmentActivity> weakReference, Function1<? super Boolean, Unit> function1, Continuation<? super GymDeviceModel$checkEcoJumpOfflineReport$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$handleGymSportReportList = aVar;
        this.$showDialog = z;
        this.$localSportType = str;
        this.$weak = weakReference;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymDeviceModel$checkEcoJumpOfflineReport$1$onSuccess$1(this.$handleGymSportReportList, this.$showDialog, this.$localSportType, this.$weak, this.$callback, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1<Boolean, Unit> function1;
        ft9[] ft9VarArr;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ft9.a aVar = this.$handleGymSportReportList;
        if (aVar == null || (ft9VarArr = aVar.c) == null) {
            if (!this.$showDialog) {
                ToastUtil.INSTANCE.showToast(e1j.x3);
            }
            function1 = this.$callback;
            if (function1 != null) {
                function1.invoke2(Boxing.boxBoolean(false));
            }
        } else {
            if (!(ft9VarArr.length == 0)) {
                FitnessLogUtils.i("GymDeviceModel", "checkEcoJumpOfflineReport onSuccess " + ((aVar == null || ft9VarArr == null) ? null : Boxing.boxInt(ft9VarArr.length)));
                if (this.$showDialog) {
                    GymDeviceModel.INSTANCE.showEcoJumpReportDialog(this.$localSportType, this.$weak.get(), this.$handleGymSportReportList);
                } else {
                    GymDeviceModel.INSTANCE.getEcoReportsFromGYM(this.$localSportType, this.$weak.get(), this.$handleGymSportReportList);
                }
                Function1<Boolean, Unit> function2 = this.$callback;
                if (function2 != null) {
                    function2.invoke2(Boxing.boxBoolean(true));
                }
            } else {
                if (!this.$showDialog) {
                    ToastUtil.INSTANCE.showToast(e1j.x3);
                }
                function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke2(Boxing.boxBoolean(false));
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymDeviceModel$checkEcoJumpOfflineReport$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
