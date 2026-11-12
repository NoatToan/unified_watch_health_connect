package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function0;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel$updateTimeDisplayStyle$1$onSaveFn$1", f = "DeviceFeatureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceFeatureViewModel$updateTimeDisplayStyle$1$onSaveFn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Function0<? extends Unit>>, Object> {
    public int a;
    public final /* synthetic */ HMDisplayType b;
    public final /* synthetic */ HMMiliConfig c;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDisplayType.values().length];
            iArr[HMDisplayType.ONLY_TIME.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<no name provided>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMMiliConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMMiliConfig hMMiliConfig) {
            super(0);
            this.a = hMMiliConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setTimePanelType(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<no name provided>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMMiliConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMMiliConfig hMMiliConfig) {
            super(0);
            this.a = hMMiliConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setTimePanelType(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeatureViewModel$updateTimeDisplayStyle$1$onSaveFn$1(HMDisplayType hMDisplayType, HMMiliConfig hMMiliConfig, Continuation<? super DeviceFeatureViewModel$updateTimeDisplayStyle$1$onSaveFn$1> continuation) {
        super(2, continuation);
        this.b = hMDisplayType;
        this.c = hMMiliConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DeviceFeatureViewModel$updateTimeDisplayStyle$1$onSaveFn$1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Function0<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Function0<Unit>>) continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Function0<Unit>> continuation) {
        return ((DeviceFeatureViewModel$updateTimeDisplayStyle$1$onSaveFn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()] == 1 ? new a(this.c) : new b(this.c);
    }
}
