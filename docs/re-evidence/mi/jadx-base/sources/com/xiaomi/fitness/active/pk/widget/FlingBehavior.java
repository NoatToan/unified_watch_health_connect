package com.xiaomi.fitness.active.pk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes7.dex */
public class FlingBehavior extends AppBarLayout.Behavior {
    public boolean q;

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        if ((f2 > 0.0f && !this.q) || (f2 < 0.0f && this.q)) {
            f2 *= -1.0f;
        }
        float f3 = f2;
        if ((view instanceof RecyclerView) && f3 < 0.0f) {
            RecyclerView recyclerView = (RecyclerView) view;
            z = false;
            if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0)) > 3) {
                z = true;
            }
        }
        return super.onNestedFling(coordinatorLayout, appBarLayout, view, f, f3, z);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr) {
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr);
        this.q = i2 > 0;
    }
}
