package com.google.accompanist.insets;

import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@ExperimentalAnimatedInsets
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0003X\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u0016\u0010!\u001a\u00020\u00158C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lcom/google/accompanist/insets/ImeNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroid/view/View;", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "b", "Z", "scrollImeOffScreenWhenVisible", "c", "scrollImeOnScreenWhenNotVisible", "Lcom/google/accompanist/insets/SimpleImeAnimationController;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/google/accompanist/insets/SimpleImeAnimationController;", "imeAnimController", "()Z", "imeVisible", "<init>", "(Landroid/view/View;ZZ)V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class ImeNestedScrollConnection implements NestedScrollConnection {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean scrollImeOffScreenWhenVisible;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean scrollImeOnScreenWhenNotVisible;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @RequiresApi(30)
    @NotNull
    private final Lazy imeAnimController = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<SimpleImeAnimationController> {
        public static final a a = new a();

        public a() {
            super(0, SimpleImeAnimationController.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleImeAnimationController invoke() {
            return new SimpleImeAnimationController();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "remainingVelocity", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Float, Unit> {
        public final /* synthetic */ CancellableContinuation<Velocity> a;
        public final /* synthetic */ ImeNestedScrollConnection b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Throwable, Unit> {
            public final /* synthetic */ ImeNestedScrollConnection a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ImeNestedScrollConnection imeNestedScrollConnection) {
                super(1);
                this.a = imeNestedScrollConnection;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.a.a().finish();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(CancellableContinuation<? super Velocity> cancellableContinuation, ImeNestedScrollConnection imeNestedScrollConnection) {
            super(1);
            this.a = cancellableContinuation;
            this.b = imeNestedScrollConnection;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            this.a.resume(Velocity.m3141boximpl(VelocityKt.Velocity(0.0f, f)), new a(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Throwable, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            ImeNestedScrollConnection.this.a().cancel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "remainingVelocity", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Float, Unit> {
        public final /* synthetic */ CancellableContinuation<Velocity> a;
        public final /* synthetic */ ImeNestedScrollConnection b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Throwable, Unit> {
            public final /* synthetic */ ImeNestedScrollConnection a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ImeNestedScrollConnection imeNestedScrollConnection) {
                super(1);
                this.a = imeNestedScrollConnection;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.a.a().finish();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(CancellableContinuation<? super Velocity> cancellableContinuation, ImeNestedScrollConnection imeNestedScrollConnection) {
            super(1);
            this.a = cancellableContinuation;
            this.b = imeNestedScrollConnection;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            this.a.resume(Velocity.m3141boximpl(VelocityKt.Velocity(0.0f, f)), new a(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Throwable, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            ImeNestedScrollConnection.this.a().cancel();
        }
    }

    public ImeNestedScrollConnection(@NotNull View view, boolean z, boolean z2) {
        this.view = view;
        this.scrollImeOffScreenWhenVisible = z;
        this.scrollImeOnScreenWhenNotVisible = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleImeAnimationController a() {
        return (SimpleImeAnimationController) this.imeAnimController.getValue();
    }

    @RequiresApi(30)
    private final boolean b() {
        return this.view.getRootWindowInsets().isVisible(android.view.WindowInsets.Type.ime());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo197onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        if (Build.VERSION.SDK_INT < 30) {
            return Velocity.m3141boximpl(Velocity.INSTANCE.m3161getZero9UxMQ8M());
        }
        if (a().isInsetAnimationInProgress()) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            a().animateToFinish(Boxing.boxFloat(Velocity.m3151getYimpl(j2)), new b(cancellableContinuationImpl, this));
            cancellableContinuationImpl.invokeOnCancellation(new c());
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
        if (this.scrollImeOnScreenWhenNotVisible) {
            if ((Velocity.m3151getYimpl(j2) > 0.0f) == b()) {
                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
                cancellableContinuationImpl2.initCancellability();
                a().startAndFling(this.view, Velocity.m3151getYimpl(j2), new d(cancellableContinuationImpl2, this));
                cancellableContinuationImpl2.invokeOnCancellation(new e());
                Object result2 = cancellableContinuationImpl2.getResult();
                if (result2 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result2;
            }
        }
        return Velocity.m3141boximpl(Velocity.INSTANCE.m3161getZero9UxMQ8M());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo198onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (Build.VERSION.SDK_INT < 30) {
            return Offset.INSTANCE.m999getZeroF1C5BW0();
        }
        if (Offset.m984getYimpl(available) < 0.0f) {
            if (a().isInsetAnimationInProgress()) {
                return OffsetKt.Offset(0.0f, a().insetBy(kotlin.math.c.roundToInt(Offset.m984getYimpl(available))));
            }
            if (this.scrollImeOnScreenWhenNotVisible && !a().isInsetAnimationRequestPending() && !b()) {
                SimpleImeAnimationController.startControlRequest$default(a(), this.view, null, 2, null);
                return available;
            }
        }
        return Offset.INSTANCE.m999getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo199onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        return NestedScrollConnection.DefaultImpls.m2339onPreFlingQWom1Mo(this, j, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo200onPreScrollOzD1aCk(long available, int source) {
        if (Build.VERSION.SDK_INT < 30) {
            return Offset.INSTANCE.m999getZeroF1C5BW0();
        }
        if (a().isInsetAnimationRequestPending()) {
            return available;
        }
        if (Offset.m984getYimpl(available) > 0.0f) {
            if (a().isInsetAnimationInProgress()) {
                return OffsetKt.Offset(0.0f, a().insetBy(kotlin.math.c.roundToInt(Offset.m984getYimpl(available))));
            }
            if (this.scrollImeOffScreenWhenVisible && b()) {
                SimpleImeAnimationController.startControlRequest$default(a(), this.view, null, 2, null);
                return available;
            }
        }
        return Offset.INSTANCE.m999getZeroF1C5BW0();
    }
}
