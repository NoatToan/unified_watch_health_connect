package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.c;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.appcompat.internal.app.widget.actionbar.CollapseTitle;
import miuix.appcompat.internal.app.widget.actionbar.ExpandTitle;

/* JADX INFO: loaded from: classes3.dex */
public class de0 {

    public class a extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.i0(Button.class.getName());
        }
    }

    public static CollapseTitle c(Context context, int i, int i2) {
        CollapseTitle collapseTitle = new CollapseTitle(context, i, i2);
        collapseTitle.init();
        return collapseTitle;
    }

    public static ExpandTitle d(Context context) {
        ExpandTitle expandTitle = new ExpandTitle(context);
        expandTitle.init();
        return expandTitle;
    }

    public static View e(final Context context, ViewGroup viewGroup) {
        final int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(dmi.f15697r);
        final FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.post(new Runnable() { // from class: be0
            @Override // java.lang.Runnable
            public final void run() {
                de0.f(frameLayout, dimensionPixelOffset);
            }
        });
        frameLayout.setId(vsi.r0);
        frameLayout.setVisibility(8);
        frameLayout.setContentDescription(context.getResources().getString(z1j.c));
        c.r0(frameLayout, new a());
        frameLayout.setClipChildren(false);
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        appCompatImageView.post(new Runnable() { // from class: ce0
            @Override // java.lang.Runnable
            public final void run() {
                de0.g(appCompatImageView, context);
            }
        });
        frameLayout.addView(appCompatImageView, new FrameLayout.LayoutParams(-2, -2));
        if (viewGroup != null) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }

    public static /* synthetic */ void f(FrameLayout frameLayout, int i) {
        if (dyq.e(frameLayout)) {
            frameLayout.setPadding(i, 0, 0, 0);
        } else {
            frameLayout.setPadding(0, 0, i, 0);
        }
    }

    public static /* synthetic */ void g(AppCompatImageView appCompatImageView, Context context) {
        appCompatImageView.setImageDrawable(hm1.h(context, R.attr.homeAsUpIndicator));
        Folme.useAt(appCompatImageView).hover().setFeedbackRadius(60.0f);
        Folme.useAt(appCompatImageView).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf((View) appCompatImageView.getParent(), new AnimConfig[0]);
    }
}
