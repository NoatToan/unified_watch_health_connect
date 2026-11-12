package com.huami.sky.ui.setting;

import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$1$1", f = "SkyPlaySettingActivity.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
public final class SkyPlaySettingActivity$initObservers$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SkyPlaySettingActivity b;
    public final /* synthetic */ Boolean c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isSmartClose: " + this.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkyPlaySettingActivity$initObservers$1$1(SkyPlaySettingActivity skyPlaySettingActivity, Boolean bool, Continuation<? super SkyPlaySettingActivity$initObservers$1$1> continuation) {
        super(2, continuation);
        this.b = skyPlaySettingActivity;
        this.c = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SkyPlaySettingActivity$initObservers$1$1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SkyPlaySettingActivity$initObservers$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> flowIsSmartClose = this.b.i().isSmartClose();
            final SkyPlaySettingActivity skyPlaySettingActivity = this.b;
            final Boolean bool = this.c;
            FlowCollector<Boolean> flowCollector = new FlowCollector<Boolean>() { // from class: com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$1$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Boolean bool2, @NotNull Continuation<? super Unit> continuation) {
                    boolean zBooleanValue = bool2.booleanValue();
                    HMLog.info("SkyPlaySettingActivity", new SkyPlaySettingActivity$initObservers$1$1.a(bool));
                    skyPlaySettingActivity.h().playStopSetting.setChecked(zBooleanValue);
                    return Unit.INSTANCE;
                }
            };
            this.a = 1;
            if (flowIsSmartClose.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
