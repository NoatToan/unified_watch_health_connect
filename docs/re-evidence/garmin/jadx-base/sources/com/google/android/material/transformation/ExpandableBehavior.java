package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;
import java.util.WeakHashMap;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState;

    public ExpandableBehavior() {
        this.currentState = 0;
    }

    private boolean didStateChange(boolean z14) {
        int i14 = this.currentState;
        if (z14) {
            return i14 == 0 || i14 == 2;
        }
        return i14 == 1;
    }

    public static <T extends ExpandableBehavior> T from(View view2, Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            h.s("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f6350a;
        if (cVar instanceof ExpandableBehavior) {
            return cls.cast(cVar);
        }
        h.s("The view is not associated with ExpandableBehavior");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidget findExpandableWidget(CoordinatorLayout coordinatorLayout, View view2) {
        List<View> dependencies = coordinatorLayout.getDependencies(view2);
        int size = dependencies.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view3 = dependencies.get(i14);
            if (layoutDependsOn(coordinatorLayout, view2, view3)) {
                return (ExpandableWidget) view3;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view2, View view3);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view2, View view3) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view3;
        if (!didStateChange(expandableWidget.isExpanded())) {
            return false;
        }
        this.currentState = expandableWidget.isExpanded() ? 1 : 2;
        return onExpandedStateChange((View) expandableWidget, view2, expandableWidget.isExpanded(), true);
    }

    public abstract boolean onExpandedStateChange(View view2, View view3, boolean z14, boolean z15);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, final View view2, int i14) {
        final ExpandableWidget expandableWidgetFindExpandableWidget;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (view2.isLaidOut() || (expandableWidgetFindExpandableWidget = findExpandableWidget(coordinatorLayout, view2)) == null || !didStateChange(expandableWidgetFindExpandableWidget.isExpanded())) {
            return false;
        }
        final int i15 = expandableWidgetFindExpandableWidget.isExpanded() ? 1 : 2;
        this.currentState = i15;
        view2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ExpandableBehavior.this.currentState == i15) {
                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                    ExpandableWidget expandableWidget = expandableWidgetFindExpandableWidget;
                    expandableBehavior.onExpandedStateChange((View) expandableWidget, view2, expandableWidget.isExpanded(), false);
                }
                return false;
            }
        });
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentState = 0;
    }
}
