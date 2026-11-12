package com.huami.chart.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B<\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012'\b\u0002\u0010\u0010\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R5\u0010\u0010\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/chart/animation/ChartAnimator;", "", "Landroid/animation/ValueAnimator;", "animate", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "a", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "animatorUpdateListener", "Lkotlin/Function1;", "Landroid/animation/Animator;", "Lkotlin/ParameterName;", "name", "animation", "", "b", "Lkotlin/jvm/functions/Function1;", "onValueAnimatorEndCallBack", "<init>", "(Landroid/animation/ValueAnimator$AnimatorUpdateListener;Lkotlin/jvm/functions/Function1;)V", "Companion", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class ChartAnimator {

    @NotNull
    private static final String c = "ChartAnimator";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final ValueAnimator.AnimatorUpdateListener animatorUpdateListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Function1<Animator, Unit> onValueAnimatorEndCallBack;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onAnimationStart";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChartAnimator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChartAnimator(@Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener, @Nullable Function1<? super Animator, Unit> function1) {
        this.animatorUpdateListener = animatorUpdateListener;
        this.onValueAnimatorEndCallBack = function1;
    }

    @NotNull
    public final ValueAnimator animate() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.animatorUpdateListener;
        if (animatorUpdateListener != null) {
            valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.huami.chart.animation.ChartAnimator$animate$lambda-1$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                HMLog.debug("ChartAnimator", ChartAnimator.a.a);
                Function1 function1 = this.a.onValueAnimatorEndCallBack;
                if (function1 == null) {
                    return;
                }
                function1.invoke(animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        return valueAnimatorOfFloat;
    }

    public /* synthetic */ ChartAnimator(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : animatorUpdateListener, (i & 2) != 0 ? null : function1);
    }
}
