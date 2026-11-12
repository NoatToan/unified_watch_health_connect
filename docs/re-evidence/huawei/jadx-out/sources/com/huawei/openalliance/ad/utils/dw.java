package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class dw {
    public static boolean a(View view, boolean z) {
        int i = z ? 0 : 8;
        if (view == null || view.getVisibility() == i) {
            return false;
        }
        view.setVisibility(i);
        return true;
    }

    public static boolean a(View view, int i, int i2, int i3) {
        if (view == null || view.getVisibility() == i) {
            return false;
        }
        view.setVisibility(i);
        boolean z = i == 0;
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(i2);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        if (i3 > 0) {
            alphaAnimation.setStartOffset(i3);
        }
        view.startAnimation(alphaAnimation);
        return true;
    }

    public static boolean a(int i, int i2, float f, float f2) {
        hw.a("ViewUtil", "checkSwipe, diffX: %s, diffY: %s, limitSwipePx: %s, swipeDirection: %s.", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i));
        if (i != 0 || f2 < i2 || f2 < Math.abs(f)) {
            return 1 == i && Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) i2);
        }
        return true;
    }

    public static void a(ProgressBar progressBar, int i) {
        if (progressBar != null) {
            if (i == 100) {
                progressBar.setVisibility(8);
                return;
            }
            if (progressBar.getVisibility() == 8) {
                progressBar.setVisibility(0);
            }
            progressBar.setProgress(i);
        }
    }

    public static void a(ViewGroup viewGroup) {
        boolean z;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt.getVisibility() == 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z && viewGroup.getVisibility() != 0) {
            viewGroup.setVisibility(0);
        } else {
            if (z || viewGroup.getVisibility() == 8) {
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    public static void a(Context context, int i, int i2, boolean z, int i3, int i4, RelativeLayout.LayoutParams layoutParams) {
        int iF;
        layoutParams.addRule(10);
        layoutParams.addRule(21);
        layoutParams.rightMargin = i3;
        layoutParams.setMarginEnd(i3);
        layoutParams.topMargin = i4;
        if (i2 != 0) {
            layoutParams.topMargin += i;
            return;
        }
        if (!z) {
            layoutParams.setMarginEnd(layoutParams.rightMargin + i);
            layoutParams.rightMargin += i;
        }
        if (com.huawei.openalliance.ad.cc.b(context)) {
            layoutParams.setMarginEnd(layoutParams.rightMargin + dk.f(context));
            iF = layoutParams.rightMargin + dk.f(context);
        } else {
            layoutParams.setMarginEnd(dk.f(context));
            iF = dk.f(context);
        }
        layoutParams.rightMargin = iF;
        layoutParams.topMargin += as.a(context, 12.0f);
    }
}
