package com.huami.account.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u0011\u001a\u00028\u0000\"\u0006\b\u0000\u0010\r\u0018\u00012\u001f\b\b\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Input", "Output", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "input", "launchAwaitResult", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "callback", "launchWithCallback", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/account/utils/SelfReference;", "Lkotlin/ExtensionFunctionType;", "initializer", "selfReference", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class ActivityResultExtKt {

    /* JADX INFO: Add missing generic type declarations: [Output] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"Input", "Output", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<Output> extends Lambda implements Function1<Output, Unit> {
        public final /* synthetic */ CancellableContinuation<Output> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super Output> cancellableContinuation) {
            super(1);
            this.a = cancellableContinuation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Output output) {
            CancellableContinuation<Output> cancellableContinuation = this.a;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m3845constructorimpl(output));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Input] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n"}, d2 = {"Input", "Output", "Lcom/huami/account/utils/SelfReference;", "Landroidx/activity/result/ActivityResultLauncher;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<Input> extends Lambda implements Function1<SelfReference<ActivityResultLauncher<Input>>, ActivityResultLauncher<Input>> {
        public final /* synthetic */ ActivityResultRegistry a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ActivityResultContract<Input, Output> c;
        public final /* synthetic */ Function1<Output, Unit> d;
        public final /* synthetic */ Input e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract<Input, Output> activityResultContract, Function1<? super Output, Unit> function1, Input input) {
            super(1);
            this.a = activityResultRegistry;
            this.b = str;
            this.c = activityResultContract;
            this.d = function1;
            this.e = input;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function1 function1, SelfReference selfReference, Object obj) {
            function1.invoke(obj);
            ((ActivityResultLauncher) selfReference.getSelf()).unregister();
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ActivityResultLauncher<Input> invoke(@NotNull final SelfReference<ActivityResultLauncher<Input>> selfReference) {
            ActivityResultRegistry activityResultRegistry = this.a;
            String str = this.b;
            Object obj = this.c;
            final Function1<Output, Unit> function1 = this.d;
            ActivityResultLauncher<Input> activityResultLauncherRegister = activityResultRegistry.register(str, obj, new ActivityResultCallback() { // from class: com.huami.account.utils.a
                @Override // androidx.view.result.ActivityResultCallback
                public final void onActivityResult(Object obj2) {
                    ActivityResultExtKt.b.c(function1, selfReference, obj2);
                }
            });
            activityResultLauncherRegister.launch(this.e);
            return activityResultLauncherRegister;
        }
    }

    @Nullable
    public static final <Input, Output> Object launchAwaitResult(@NotNull ActivityResultContract<Input, Output> activityResultContract, @NotNull ActivityResultRegistry activityResultRegistry, Input input, @NotNull Continuation<? super Output> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        launchWithCallback(activityResultContract, activityResultRegistry, input, new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <Input, Output> void launchWithCallback(@NotNull ActivityResultContract<Input, Output> activityResultContract, @NotNull ActivityResultRegistry activityResultRegistry, Input input, @NotNull Function1<? super Output, Unit> function1) {
        new SelfReference(new b(activityResultRegistry, "Key#" + function1.hashCode(), activityResultContract, function1, input)).getSelf();
    }

    public static final /* synthetic */ <T> T selfReference(Function1<? super SelfReference<T>, ? extends T> function1) {
        return (T) new SelfReference(function1).getSelf();
    }
}
