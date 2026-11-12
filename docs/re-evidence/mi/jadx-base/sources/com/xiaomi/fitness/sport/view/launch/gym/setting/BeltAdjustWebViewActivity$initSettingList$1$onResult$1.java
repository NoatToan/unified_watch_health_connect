package com.xiaomi.fitness.sport.view.launch.gym.setting;

import android.widget.Button;
import defpackage.c1j;
import defpackage.gs9;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity$initSettingList$1$onResult$1", f = "BeltAdjustWebViewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBeltAdjustWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeltAdjustWebViewActivity.kt\ncom/xiaomi/fitness/sport/view/launch/gym/setting/BeltAdjustWebViewActivity$initSettingList$1$onResult$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,381:1\n13402#2,2:382\n*S KotlinDebug\n*F\n+ 1 BeltAdjustWebViewActivity.kt\ncom/xiaomi/fitness/sport/view/launch/gym/setting/BeltAdjustWebViewActivity$initSettingList$1$onResult$1\n*L\n144#1:382,2\n*E\n"})
public final class BeltAdjustWebViewActivity$initSettingList$1$onResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ gs9[] $result;
    int label;
    final /* synthetic */ BeltAdjustWebViewActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeltAdjustWebViewActivity$initSettingList$1$onResult$1(BeltAdjustWebViewActivity beltAdjustWebViewActivity, gs9[] gs9VarArr, Continuation<? super BeltAdjustWebViewActivity$initSettingList$1$onResult$1> continuation) {
        super(2, continuation);
        this.this$0 = beltAdjustWebViewActivity;
        this.$result = gs9VarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BeltAdjustWebViewActivity$initSettingList$1$onResult$1(this.this$0, this.$result, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.hideLoading();
        this.this$0.gymSettings = this.$result;
        gs9[] gs9VarArr = this.this$0.gymSettings;
        if (gs9VarArr != null) {
            BeltAdjustWebViewActivity beltAdjustWebViewActivity = this.this$0;
            for (gs9 gs9Var : gs9VarArr) {
                if (gs9Var.c == 3) {
                    beltAdjustWebViewActivity.gymSetting = gs9Var;
                    Button button = beltAdjustWebViewActivity.adjustBtn;
                    if (button != null) {
                        button.setText(gs9Var.d == 1 ? c1j.V4 : c1j.O4);
                    }
                    beltAdjustWebViewActivity.doingAdjust = gs9Var.d == 1;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BeltAdjustWebViewActivity$initSettingList$1$onResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
