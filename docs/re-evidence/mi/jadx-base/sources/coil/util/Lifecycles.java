package coil.util;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.nfe;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: coil.util.-Lifecycles, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "awaitStarted", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnfe;", "observer", "removeAndAddObserver", "(Landroidx/lifecycle/Lifecycle;Lnfe;)V", "coil-base_release"}, k = 2, mv = {1, 7, 1})
@JvmName(name = "-Lifecycles")
public final class Lifecycles {

    /* JADX INFO: renamed from: coil.util.-Lifecycles$awaitStarted$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", i = {0, 0}, l = {44}, m = "awaitStarted", n = {"$this$awaitStarted", "observer"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Lifecycles.awaitStarted(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$awaitStarted$2$1, java.lang.Object] */
    @Nullable
    public static final Object awaitStarted(@NotNull Lifecycle lifecycle, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Lifecycle lifecycle2;
        Ref.ObjectRef objectRef;
        Throwable th;
        nfe nfeVar;
        nfe nfeVar2;
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
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) anonymousClass1.L$1;
            lifecycle2 = (Lifecycle) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                nfeVar2 = (nfe) objectRef.element;
                if (nfeVar2 != null) {
                    lifecycle2.removeObserver(nfeVar2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                nfeVar = (nfe) objectRef.element;
                if (nfeVar != null) {
                    lifecycle2.removeObserver(nfeVar);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            return Unit.INSTANCE;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            anonymousClass1.L$0 = lifecycle;
            anonymousClass1.L$1 = objectRef2;
            anonymousClass1.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(anonymousClass1), 1);
            cancellableContinuationImpl.initCancellability();
            ?? r3 = new DefaultLifecycleObserver() { // from class: coil.util.-Lifecycles$awaitStarted$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(@NotNull LifecycleOwner owner) {
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m886constructorimpl(Unit.INSTANCE));
                }
            };
            objectRef2.element = r3;
            Intrinsics.checkNotNull(r3);
            lifecycle.addObserver((nfe) r3);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(anonymousClass1);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            nfeVar2 = (nfe) objectRef.element;
            if (nfeVar2 != null) {
                lifecycle2.removeObserver(nfeVar2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            th = th3;
            nfeVar = (nfe) objectRef.element;
            if (nfeVar != null) {
                lifecycle2.removeObserver(nfeVar);
            }
            throw th;
        }
    }

    public static final void removeAndAddObserver(@NotNull Lifecycle lifecycle, @NotNull nfe nfeVar) {
        lifecycle.removeObserver(nfeVar);
        lifecycle.addObserver(nfeVar);
    }
}
