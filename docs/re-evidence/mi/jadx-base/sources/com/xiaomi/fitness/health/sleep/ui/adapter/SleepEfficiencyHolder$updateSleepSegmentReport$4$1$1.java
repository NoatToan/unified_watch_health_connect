package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.content.Context;
import android.widget.TextView;
import com.xiaomi.fitness.common.extension.PageUtilExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment;
import defpackage.dih;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.adapter.SleepEfficiencyHolder$updateSleepSegmentReport$4$1$1", f = "SleepEfficiencyHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SleepEfficiencyHolder$updateSleepSegmentReport$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $assistSleepOn;
    int label;
    final /* synthetic */ SleepEfficiencyHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepEfficiencyHolder$updateSleepSegmentReport$4$1$1(boolean z, SleepEfficiencyHolder sleepEfficiencyHolder, Continuation<? super SleepEfficiencyHolder$updateSleepSegmentReport$4$1$1> continuation) {
        super(2, continuation);
        this.$assistSleepOn = z;
        this.this$0 = sleepEfficiencyHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(SleepEfficiencyHolder sleepEfficiencyHolder, TextView textView) {
        dih dihVarA = dih.a();
        if (dihVarA != null) {
            Context context = sleepEfficiencyHolder.getItemView().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            PageUtilExtKt.goCommonActivity(dihVarA, context, SleepSettingFragment.class, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepEfficiencyHolder$updateSleepSegmentReport$4$1$1(this.$assistSleepOn, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$assistSleepOn) {
            ViewExtKt.setVisible(this.this$0.validDataView, false);
            ViewExtKt.setVisible(this.this$0.entryDurationNotDetectedView, true);
            ViewExtKt.setVisible(this.this$0.highPrecisionOffView, false);
        } else {
            ViewExtKt.setVisible(this.this$0.highPrecisionOffView, true);
            TextView textView = this.this$0.goTurnOnHighPrecisionBtn;
            final SleepEfficiencyHolder sleepEfficiencyHolder = this.this$0;
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: com.xiaomi.fitness.health.sleep.ui.adapter.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SleepEfficiencyHolder$updateSleepSegmentReport$4$1$1.invokeSuspend$lambda$0(sleepEfficiencyHolder, (TextView) obj2);
                }
            }, 1, null);
            ViewExtKt.setVisible(this.this$0.validDataView, false);
            ViewExtKt.setVisible(this.this$0.entryDurationNotDetectedView, false);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepEfficiencyHolder$updateSleepSegmentReport$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
