package com.huami.healthlabel.ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.healthlabel.R;
import com.huami.healthlabel.utils.ext.NumberExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/healthlabel/ui/custom/ClickLabelAnimation;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "a", "Landroid/view/View;", "lottieView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"InflateParams"})
final class ClickLabelAnimation extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private View lottieView;

    public ClickLabelAnimation(@NotNull Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.health_label_animation, (ViewGroup) null);
        this.lottieView = viewInflate;
        setContentView(viewInflate);
        setWidth(NumberExtKt.dp(73));
        setHeight(NumberExtKt.dp(65));
        setBackgroundDrawable(new ColorDrawable(0));
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) this.lottieView;
        lottieAnimationView.setAnimation("label_click_animation.json");
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.huami.healthlabel.ui.custom.ClickLabelAnimation$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                super.onAnimationEnd(animation);
                lottieAnimationView.setVisibility(8);
                this.dismiss();
            }
        });
    }

    public final void a(@NotNull View view) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.lottieView;
        lottieAnimationView.setVisibility(0);
        if (lottieAnimationView.isAnimating()) {
            lottieAnimationView.cancelAnimation();
        }
        lottieAnimationView.playAnimation();
        showAsDropDown(view, NumberExtKt.dp(17.5f), NumberExtKt.dp(-32.5f) - (view.getHeight() / 2), GravityCompat.END);
    }
}
