package com.xiaomi.fitness.sport_eco.ftp.ui;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity$addObserver$9$1", f = "FtpActivity.kt", i = {}, l = {469}, m = "invokeSuspend", n = {}, s = {})
public final class FtpActivity$addObserver$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FtpActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FtpActivity$addObserver$9$1(FtpActivity ftpActivity, Continuation<? super FtpActivity$addObserver$9$1> continuation) {
        super(2, continuation);
        this.this$0 = ftpActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FtpActivity$addObserver$9$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(VibrateModeProgressBar.sLongToLong, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.dismissDialog();
        FtpActivity.access$getMViewModel(this.this$0).disconnectOperate();
        this.this$0.finish();
        FitnessLogUtils.d("FtpActivity", "结束ftp运动");
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FtpActivity$addObserver$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
