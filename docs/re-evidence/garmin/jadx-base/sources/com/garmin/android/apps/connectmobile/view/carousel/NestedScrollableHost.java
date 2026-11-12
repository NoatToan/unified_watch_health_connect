package com.garmin.android.apps.connectmobile.view.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/carousel/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/viewpager2/widget/ViewPager2;", "getParentViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "parentViewPager", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NestedScrollableHost extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f47625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f47626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context) {
        super(context);
        context.getClass();
        this.f47624a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewPager2 getParentViewPager() {
        Object parent = getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            while (view2 != null && !(view2 instanceof ViewPager2)) {
                Object parent2 = view2.getParent();
                view2 = parent2 instanceof View ? (View) parent2 : null;
            }
            if (view2 instanceof ViewPager2) {
                return (ViewPager2) view2;
            }
            return null;
        }
    }

    public final boolean a(float f14, int i14) {
        int i15 = -((int) Math.signum(f14));
        if (i14 == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i15);
            }
            return false;
        }
        if (i14 != 1) {
            h.w();
            return false;
        }
        View child2 = getChild();
        if (child2 != null) {
            return child2.canScrollVertically(i15);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            if (a(-1.0f, orientation) || a(1.0f, orientation)) {
                if (motionEvent.getAction() == 0) {
                    this.f47625b = motionEvent.getX();
                    this.f47626c = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (motionEvent.getAction() == 2) {
                    float x14 = motionEvent.getX() - this.f47625b;
                    float y14 = motionEvent.getY() - this.f47626c;
                    boolean z14 = orientation == 0;
                    float fAbs = Math.abs(x14) * (z14 ? 0.5f : 1.0f);
                    float fAbs2 = Math.abs(y14) * (z14 ? 1.0f : 0.5f);
                    float f14 = this.f47624a;
                    if (fAbs > f14 || fAbs2 > f14) {
                        if (z14 == (fAbs2 > fAbs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            if (!z14) {
                                x14 = y14;
                            }
                            if (a(x14, orientation)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            } else {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f47624a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
