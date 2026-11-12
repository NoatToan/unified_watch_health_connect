package com.huami.healthlabel.ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.healthlabel.ui.custom.ExpandHelperKt;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0006"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "Landroid/animation/AnimatorListenerAdapter;", "viewHolderAnimatorListener", "Landroid/animation/Animator;", "changeItemViewHeightAnimator", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class ExpandHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(RecyclerView.ViewHolder viewHolder, ValueAnimator valueAnimator) {
        View view = viewHolder.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    @NotNull
    public static final Animator changeItemViewHeightAnimator(@NotNull final RecyclerView.ViewHolder viewHolder) {
        View view = (View) viewHolder.itemView.getParent();
        if (view == null) {
            throw new IllegalStateException("Cannot animate the layout of a view that has no parent");
        }
        int measuredHeight = viewHolder.itemView.getMeasuredHeight();
        viewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(measuredHeight, viewHolder.itemView.getMeasuredHeight());
        valueAnimatorOfInt.setDuration(ExpandHelper.INSTANCE.getAnimalDuration());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bx1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandHelperKt.b(viewHolder, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(viewHolderAnimatorListener(viewHolder));
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: com.huami.healthlabel.ui.custom.ExpandHelperKt$changeItemViewHeightAnimator$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -2;
                viewHolder.itemView.setLayoutParams(layoutParams);
            }
        });
        return valueAnimatorOfInt;
    }

    @NotNull
    public static final AnimatorListenerAdapter viewHolderAnimatorListener(@NotNull final RecyclerView.ViewHolder viewHolder) {
        return new AnimatorListenerAdapter() { // from class: com.huami.healthlabel.ui.custom.ExpandHelperKt.viewHolderAnimatorListener.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
                viewHolder.setIsRecyclable(true);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                viewHolder.setIsRecyclable(true);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
                viewHolder.setIsRecyclable(false);
            }
        };
    }
}
