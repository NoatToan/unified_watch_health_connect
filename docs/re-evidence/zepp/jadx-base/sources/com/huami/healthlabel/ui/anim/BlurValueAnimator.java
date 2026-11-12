package com.huami.healthlabel.ui.anim;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.healthlabel.ui.anim.BlurValueAnimator;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/healthlabel/ui/anim/BlurValueAnimator;", "Landroid/animation/ValueAnimator;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "targetView", "<init>", "(Landroid/view/View;Landroid/view/View;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class BlurValueAnimator extends ValueAnimator {
    public BlurValueAnimator(@NotNull final View view, @NotNull final View view2) {
        ValueAnimator.ofFloat(0.0f, 25.0f);
        setDuration(500L);
        final Bitmap bitmapViewToBitmap = LabelAnimationKt.viewToBitmap(view);
        addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BlurValueAnimator.b(view, bitmapViewToBitmap, view2, valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view, Bitmap bitmap, View view2, ValueAnimator valueAnimator) {
        Resources resources = view.getResources();
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view2.setBackground(new BitmapDrawable(resources, LabelAnimationKt.blur(bitmap, ((Float) animatedValue).floatValue())));
    }
}
