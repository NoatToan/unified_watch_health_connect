package retrofit2;

import defpackage.etk;
import defpackage.ka3;
import defpackage.prk;
import defpackage.xa3;
import defpackage.yhd;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Letk;", "create", "(Letk;)Ljava/lang/Object;", "", "Lka3;", "await", "(Lka3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "Lprk;", "awaitResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "KotlinExtensions")
public final class KotlinExtensions {

    /* JADX INFO: renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@"}, d2 = {"suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    @Nullable
    public static final <T> Object await(@NotNull final ka3<T> ka3Var, @NotNull Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                ka3Var.cancel();
            }
        });
        ka3Var.E(new xa3<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // defpackage.xa3
            public void onFailure(@NotNull ka3<T> call, @NotNull Throwable t) {
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(t)));
            }

            @Override // defpackage.xa3
            public void onResponse(@NotNull ka3<T> call, @NotNull prk<T> response) {
                if (!response.e()) {
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    HttpException httpException = new HttpException(response);
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(httpException)));
                    return;
                }
                T tA = response.a();
                if (tA != null) {
                    cancellableContinuationImpl.resumeWith(Result.m886constructorimpl(tA));
                    return;
                }
                Object objTag = call.request().tag(yhd.class);
                if (objTag == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(objTag, "call.request().tag(Invocation::class.java)!!");
                Method method = ((yhd) objTag).b();
                StringBuilder sb = new StringBuilder();
                sb.append("Response from ");
                Intrinsics.checkExpressionValueIsNotNull(method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
                sb.append(declaringClass.getName());
                sb.append('.');
                sb.append(method.getName());
                sb.append(" was null but response body type was declared as non-null");
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                CancellableContinuation cancellableContinuation2 = cancellableContinuationImpl;
                Result.Companion companion2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @JvmName(name = "awaitNullable")
    @Nullable
    public static final <T> Object awaitNullable(@NotNull final ka3<T> ka3Var, @NotNull Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                ka3Var.cancel();
            }
        });
        ka3Var.E(new xa3<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // defpackage.xa3
            public void onFailure(@NotNull ka3<T> call, @NotNull Throwable t) {
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(t)));
            }

            @Override // defpackage.xa3
            public void onResponse(@NotNull ka3<T> call, @NotNull prk<T> response) {
                if (response.e()) {
                    cancellableContinuationImpl.resumeWith(Result.m886constructorimpl(response.a()));
                    return;
                }
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                HttpException httpException = new HttpException(response);
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(httpException)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public static final <T> Object awaitResponse(@NotNull final ka3<T> ka3Var, @NotNull Continuation<? super prk<T>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                ka3Var.cancel();
            }
        });
        ka3Var.E(new xa3<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // defpackage.xa3
            public void onFailure(@NotNull ka3<T> call, @NotNull Throwable t) {
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(t)));
            }

            @Override // defpackage.xa3
            public void onResponse(@NotNull ka3<T> call, @NotNull prk<T> response) {
                cancellableContinuationImpl.resumeWith(Result.m886constructorimpl(response));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final /* synthetic */ <T> T create(@NotNull etk etkVar) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) etkVar.b(Object.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object suspendAndThrow(@NotNull final Exception exc, @NotNull Continuation<?> continuation) {
        final AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = exc;
            anonymousClass1.label = 1;
            Dispatchers.getDefault().mo2442dispatch(anonymousClass1.getContext(), new Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(anonymousClass1);
                    Exception exc2 = exc;
                    Result.Companion companion = Result.Companion;
                    continuationIntercepted.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(exc2)));
                }
            });
            Object coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(anonymousClass1);
            }
            if (coroutine_suspended2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
