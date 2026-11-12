package com.xiaomi.fitness.health.sleep.interfere;

import android.content.Context;
import android.view.View;
import com.xiaomi.fitness.baseui.utils.ViewUiUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import defpackage.c0j;
import defpackage.iji;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$initToolBar$4$1", f = "SleepInterfereReportFragment.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
public final class SleepInterfereReportFragment$initToolBar$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SleepInterfereReportFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepInterfereReportFragment$initToolBar$4$1(SleepInterfereReportFragment sleepInterfereReportFragment, Continuation<? super SleepInterfereReportFragment$initToolBar$4$1> continuation) {
        super(2, continuation);
        this.this$0 = sleepInterfereReportFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepInterfereReportFragment$initToolBar$4$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objWithTimeoutOrNull;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SleepInterfereReportFragment$initToolBar$4$1$hasOngoing$1 sleepInterfereReportFragment$initToolBar$4$1$hasOngoing$1 = new SleepInterfereReportFragment$initToolBar$4$1$hasOngoing$1(this.this$0, null);
            this.label = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(VibrateModeProgressBar.sLongToLong, sleepInterfereReportFragment$initToolBar$4$1$hasOngoing$1, this);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objWithTimeoutOrNull = obj;
        }
        Boolean bool = (Boolean) objWithTimeoutOrNull;
        if (bool == null) {
            ViewUiUtils viewUiUtils = ViewUiUtils.INSTANCE;
            View root = SleepInterfereReportFragment.access$getMBinding(this.this$0).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            String string = this.this$0.getString(c0j.common_network_error_retry_later);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ViewUiUtils.showSnackbarToast$default(viewUiUtils, root, string, 2800, Boxing.boxInt(pni.T1), 0, 0.0f, 0, 0, 0, Boxing.boxInt(pni.O2), 0, 0, 0, 0, 0, Boxing.boxInt(iji.r3), 0, null, null, 245496, null);
        } else if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
            ViewUiUtils viewUiUtils2 = ViewUiUtils.INSTANCE;
            View root2 = SleepInterfereReportFragment.access$getMBinding(this.this$0).getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            String string2 = this.this$0.getString(c0j.jg);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ViewUiUtils.showSnackbarToast$default(viewUiUtils2, root2, string2, 2800, Boxing.boxInt(pni.T1), 0, 0.0f, 0, 0, 0, Boxing.boxInt(pni.O2), 0, 0, 0, 0, 0, Boxing.boxInt(iji.r3), 0, null, null, 245496, null);
        } else {
            if (!Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                throw new NoWhenBranchMatchedException();
            }
            SleepInterfereSetFragment.Companion companion = SleepInterfereSetFragment.INSTANCE;
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            companion.launch(contextRequireContext);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepInterfereReportFragment$initToolBar$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
