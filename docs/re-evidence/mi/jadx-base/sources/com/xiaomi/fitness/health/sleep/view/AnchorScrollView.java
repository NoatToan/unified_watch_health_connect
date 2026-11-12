package com.xiaomi.fitness.health.sleep.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class AnchorScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f12279b;
    public Map<Integer, Integer> c;
    public Map<Integer, Integer> d;

    public AnchorScrollView(Context context) {
        this(context, null);
    }

    private void d() {
        setFillViewport(true);
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public void a(int i) {
        Integer num;
        c((!this.c.containsKey(Integer.valueOf(i)) || (num = this.c.get(Integer.valueOf(i))) == null) ? 0 : num.intValue());
    }

    public final void b() {
        ViewGroup viewGroup = this.f12279b;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = this.f12279b.getChildAt(i);
            i++;
            this.c.put(Integer.valueOf(i), Integer.valueOf(childAt.getTop()));
            this.d.put(Integer.valueOf(childAt.getId()), Integer.valueOf(i));
        }
    }

    public final void c(int i) {
        NestedScrollView nestedScrollView = null;
        ScrollView scrollView = null;
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof NestedScrollView) {
                nestedScrollView = (NestedScrollView) parent;
            } else if (parent instanceof ScrollView) {
                scrollView = (ScrollView) parent;
            }
        }
        if (nestedScrollView != null) {
            nestedScrollView.smoothScrollTo(0, i);
        } else if (scrollView != null) {
            scrollView.scrollTo(0, i);
        } else {
            smoothScrollTo(0, i);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof ViewGroup) {
                this.f12279b = (ViewGroup) childAt;
                b();
            }
        }
    }

    public AnchorScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnchorScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }
}
