package com.xiaomi.fitness.sport_eco.view.config;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.MaxHertRateFragment;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.mcn;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.config.SportRemindConfigFragment$initHeartRateSection$1$1", f = "SportRemindConfigFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SportRemindConfigFragment$initHeartRateSection$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $it;
    int label;
    final /* synthetic */ SportRemindConfigFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRemindConfigFragment$initHeartRateSection$1$1(Boolean bool, SportRemindConfigFragment sportRemindConfigFragment, Continuation<? super SportRemindConfigFragment$initHeartRateSection$1$1> continuation) {
        super(2, continuation);
        this.$it = bool;
        this.this$0 = sportRemindConfigFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(SportRemindConfigFragment sportRemindConfigFragment, View view) {
        Bundle bundle = new Bundle();
        mcn sportConfigObject = sportRemindConfigFragment.getSportConfigObject();
        bundle.putBoolean("isRemindHr", sportConfigObject != null ? sportConfigObject.c : false);
        mcn sportConfigObject2 = sportRemindConfigFragment.getSportConfigObject();
        bundle.putInt("heartRate", sportConfigObject2 != null ? sportConfigObject2.d : 0);
        mcn sportConfigObject3 = sportRemindConfigFragment.getSportConfigObject();
        bundle.putString("heartRateRange", sportConfigObject3 != null ? sportConfigObject3.l : null);
        mcn sportConfigObject4 = sportRemindConfigFragment.getSportConfigObject();
        bundle.putBoolean("heartRateRangeSwitch", sportConfigObject4 != null ? sportConfigObject4.n : false);
        BaseFragmentExKt.gotoPageForResult(sportRemindConfigFragment, (Class<?>) MaxHertRateFragment.class, bundle, 1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportRemindConfigFragment$initHeartRateSection$1$1(this.$it, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$it.booleanValue()) {
            RightArrowTwoLineTextView rightArrowTwoLineTextView = this.this$0.heartRateRemindView;
            if (rightArrowTwoLineTextView != null) {
                ViewExtKt.visible(rightArrowTwoLineTextView);
            }
            RightArrowTwoLineTextView rightArrowTwoLineTextView2 = this.this$0.heartRateRemindView;
            if (rightArrowTwoLineTextView2 != null) {
                final SportRemindConfigFragment sportRemindConfigFragment = this.this$0;
                rightArrowTwoLineTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport_eco.view.config.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SportRemindConfigFragment$initHeartRateSection$1$1.invokeSuspend$lambda$0(sportRemindConfigFragment, view);
                    }
                });
            }
        } else {
            RightArrowTwoLineTextView rightArrowTwoLineTextView3 = this.this$0.heartRateRemindView;
            if (rightArrowTwoLineTextView3 != null) {
                ViewExtKt.gone(rightArrowTwoLineTextView3);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportRemindConfigFragment$initHeartRateSection$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
