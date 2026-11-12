package com.google.accompanist.insets;

import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimationKt;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.accompanist.insets.SimpleImeAnimationController;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.twitter.sdk.android.tweetcomposer.g;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(30)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J;\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tH\u0002J&\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bJ=\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2%\b\u0002\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J1\u0010$\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010*R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00104\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/google/accompanist/insets/SimpleImeAnimationController;", "", "Landroid/view/WindowInsetsAnimationController;", "controller", "", "h", "i", "", "visible", "", "velocityY", "Lkotlin/Function1;", "onFinished", "b", "(ZLjava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "velocity", "friction", "e", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onRequestReady", "startControlRequest", "Lkotlin/ParameterName;", "name", "remainingVelocity", "startAndFling", "", "dy", "insetBy", "inset", "insetTo", "isInsetAnimationInProgress", "isInsetAnimationFinishing", "isInsetAnimationRequestPending", g.g, "finish", "animateToFinish", "(Ljava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "a", "Landroid/view/WindowInsetsAnimationController;", "insetsAnimationController", "Landroid/os/CancellationSignal;", "Landroid/os/CancellationSignal;", "pendingRequestCancellationSignal", "c", "Lkotlin/jvm/functions/Function1;", "pendingRequestOnReady", "Landroid/view/WindowInsetsAnimationControlListener;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "g", "()Landroid/view/WindowInsetsAnimationControlListener;", "animationControlListener", "Z", "isImeShownAtStart", "Landroidx/dynamicanimation/animation/SpringAnimation;", "f", "Landroidx/dynamicanimation/animation/SpringAnimation;", "currentSpringAnimation", "<init>", "()V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class SimpleImeAnimationController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private WindowInsetsAnimationController insetsAnimationController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private CancellationSignal pendingRequestCancellationSignal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super WindowInsetsAnimationController, Unit> pendingRequestOnReady;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy animationControlListener = LazyKt__LazyJVMKt.lazy(new Function0<SimpleImeAnimationController$animationControlListener$2.AnonymousClass1>() { // from class: com.google.accompanist.insets.SimpleImeAnimationController$animationControlListener$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.accompanist.insets.SimpleImeAnimationController$animationControlListener$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final SimpleImeAnimationController simpleImeAnimationController = this.a;
            return new WindowInsetsAnimationControlListener() { // from class: com.google.accompanist.insets.SimpleImeAnimationController$animationControlListener$2.1
                @Override // android.view.WindowInsetsAnimationControlListener
                public void onCancelled(@Nullable WindowInsetsAnimationController controller) {
                    simpleImeAnimationController.i();
                }

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onFinished(@NotNull WindowInsetsAnimationController controller) {
                    simpleImeAnimationController.i();
                }

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onReady(@NotNull WindowInsetsAnimationController controller, int types) {
                    simpleImeAnimationController.h(controller);
                }
            };
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isImeShownAtStart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private SpringAnimation currentSpringAnimation;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Float, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            SimpleImeAnimationController.this.insetTo(kotlin.math.c.roundToInt(f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Float> {
        public final /* synthetic */ WindowInsetsAnimationController a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WindowInsetsAnimationController windowInsetsAnimationController) {
            super(0);
            this.a = windowInsetsAnimationController;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
            return Float.valueOf(this.a.getCurrentInsets().bottom);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/WindowInsetsAnimationController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<WindowInsetsAnimationController, Unit> {
        public final /* synthetic */ float b;
        public final /* synthetic */ Function1<Float, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(float f, Function1<? super Float, Unit> function1) {
            super(1);
            this.b = f;
            this.c = function1;
        }

        public final void a(@NotNull WindowInsetsAnimationController windowInsetsAnimationController) {
            SimpleImeAnimationController.this.animateToFinish(Float.valueOf(this.b), this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsAnimationController windowInsetsAnimationController) {
            a(windowInsetsAnimationController);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateToFinish$default(SimpleImeAnimationController simpleImeAnimationController, Float f, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.animateToFinish(f, function1);
    }

    private final void b(boolean visible, Float velocityY, final Function1<? super Float, Unit> onFinished) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            throw new IllegalStateException("Controller should not be null");
        }
        SpringAnimation springAnimationSpringAnimationOf = DynamicAnimationKt.springAnimationOf(new a(), new b(windowInsetsAnimationController), visible ? windowInsetsAnimationController.getShownStateInsets().bottom : windowInsetsAnimationController.getHiddenStateInsets().bottom);
        if (springAnimationSpringAnimationOf.getSpring() == null) {
            springAnimationSpringAnimationOf.setSpring(new SpringForce());
        }
        SpringForce spring = springAnimationSpringAnimationOf.getSpring();
        spring.setDampingRatio(1.0f);
        spring.setStiffness(1500.0f);
        Unit unit = Unit.INSTANCE;
        if (velocityY != null) {
            springAnimationSpringAnimationOf.setStartVelocity(velocityY.floatValue());
        }
        springAnimationSpringAnimationOf.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: ju6
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                SimpleImeAnimationController.d(this.a, onFinished, dynamicAnimation, z, f, f2);
            }
        });
        springAnimationSpringAnimationOf.start();
        this.currentSpringAnimation = springAnimationSpringAnimationOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(SimpleImeAnimationController simpleImeAnimationController, boolean z, Float f, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.b(z, f, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SimpleImeAnimationController simpleImeAnimationController, Function1 function1, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        if (Intrinsics.areEqual(dynamicAnimation, simpleImeAnimationController.currentSpringAnimation)) {
            simpleImeAnimationController.currentSpringAnimation = null;
        }
        simpleImeAnimationController.finish();
        if (function1 == null) {
            return;
        }
        function1.invoke(Float.valueOf(f2));
    }

    private final float e(float velocity, float friction) {
        return velocity / (friction * (-4.2f));
    }

    public static /* synthetic */ float f(SimpleImeAnimationController simpleImeAnimationController, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return simpleImeAnimationController.e(f, f2);
    }

    private final WindowInsetsAnimationControlListener g() {
        return (WindowInsetsAnimationControlListener) this.animationControlListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(WindowInsetsAnimationController controller) {
        this.pendingRequestCancellationSignal = null;
        this.insetsAnimationController = controller;
        Function1<? super WindowInsetsAnimationController, Unit> function1 = this.pendingRequestOnReady;
        if (function1 != null) {
            function1.invoke(controller);
        }
        this.pendingRequestOnReady = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        this.insetsAnimationController = null;
        this.pendingRequestCancellationSignal = null;
        this.isImeShownAtStart = false;
        SpringAnimation springAnimation = this.currentSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        this.currentSpringAnimation = null;
        this.pendingRequestOnReady = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startAndFling$default(SimpleImeAnimationController simpleImeAnimationController, View view, float f, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.startAndFling(view, f, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startControlRequest$default(SimpleImeAnimationController simpleImeAnimationController, View view, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.startControlRequest(view, function1);
    }

    public final void animateToFinish(@Nullable Float velocityY, @Nullable Function1<? super Float, Unit> onFinished) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
            if (cancellationSignal == null) {
                return;
            }
            cancellationSignal.cancel();
            return;
        }
        int i = windowInsetsAnimationController.getCurrentInsets().bottom;
        int i2 = windowInsetsAnimationController.getShownStateInsets().bottom;
        int i3 = windowInsetsAnimationController.getHiddenStateInsets().bottom;
        if (velocityY != null && f(this, velocityY.floatValue(), 0.0f, 2, null) > Math.abs(i2 - i3)) {
            c(this, velocityY.floatValue() < 0.0f, velocityY, null, 4, null);
            return;
        }
        if (i == i2) {
            windowInsetsAnimationController.finish(true);
            if (onFinished == null) {
                return;
            }
            onFinished.invoke(Float.valueOf(0.0f));
            return;
        }
        if (i == i3) {
            windowInsetsAnimationController.finish(false);
            if (onFinished == null) {
                return;
            }
            onFinished.invoke(Float.valueOf(0.0f));
            return;
        }
        if (windowInsetsAnimationController.getCurrentFraction() >= 0.15f) {
            c(this, !this.isImeShownAtStart, null, onFinished, 2, null);
        } else {
            c(this, this.isImeShownAtStart, null, onFinished, 2, null);
        }
    }

    public final void cancel() {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(this.isImeShownAtStart);
        }
        CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        SpringAnimation springAnimation = this.currentSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        i();
    }

    public final void finish() {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
            if (cancellationSignal == null) {
                return;
            }
            cancellationSignal.cancel();
            return;
        }
        int i = windowInsetsAnimationController.getCurrentInsets().bottom;
        int i2 = windowInsetsAnimationController.getShownStateInsets().bottom;
        int i3 = windowInsetsAnimationController.getHiddenStateInsets().bottom;
        if (i == i2) {
            windowInsetsAnimationController.finish(true);
            return;
        }
        if (i == i3) {
            windowInsetsAnimationController.finish(false);
        } else if (windowInsetsAnimationController.getCurrentFraction() >= 0.15f) {
            windowInsetsAnimationController.finish(!this.isImeShownAtStart);
        } else {
            windowInsetsAnimationController.finish(this.isImeShownAtStart);
        }
    }

    public final int insetBy(int dy) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController != null) {
            return insetTo(windowInsetsAnimationController.getCurrentInsets().bottom - dy);
        }
        throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
    }

    public final int insetTo(int inset) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.insetsAnimationController;
        if (windowInsetsAnimationController == null) {
            throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
        }
        int i = windowInsetsAnimationController.getHiddenStateInsets().bottom;
        int i2 = windowInsetsAnimationController.getShownStateInsets().bottom;
        boolean z = this.isImeShownAtStart;
        int i3 = z ? i2 : i;
        int i4 = z ? i : i2;
        int iCoerceIn = e.coerceIn(inset, i, i2);
        int i5 = windowInsetsAnimationController.getCurrentInsets().bottom - iCoerceIn;
        windowInsetsAnimationController.setInsetsAndAlpha(android.graphics.Insets.of(0, 0, 0, iCoerceIn), 1.0f, (iCoerceIn - i3) / (i4 - i3));
        return i5;
    }

    public final boolean isInsetAnimationFinishing() {
        return this.currentSpringAnimation != null;
    }

    public final boolean isInsetAnimationInProgress() {
        return this.insetsAnimationController != null;
    }

    public final boolean isInsetAnimationRequestPending() {
        return this.pendingRequestCancellationSignal != null;
    }

    public final void startAndFling(@NotNull View view, float velocityY, @Nullable Function1<? super Float, Unit> onFinished) {
        startControlRequest(view, new c(velocityY, onFinished));
    }

    public final void startControlRequest(@NotNull View view, @Nullable Function1<? super WindowInsetsAnimationController, Unit> onRequestReady) {
        if (!(!isInsetAnimationInProgress())) {
            throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()".toString());
        }
        this.isImeShownAtStart = view.getRootWindowInsets().isVisible(android.view.WindowInsets.Type.ime());
        this.pendingRequestCancellationSignal = new CancellationSignal();
        this.pendingRequestOnReady = onRequestReady;
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController == null) {
            return;
        }
        windowInsetsController.controlWindowInsetsAnimation(android.view.WindowInsets.Type.ime(), -1L, SimpleImeAnimationControllerKt.b, this.pendingRequestCancellationSignal, g());
    }
}
