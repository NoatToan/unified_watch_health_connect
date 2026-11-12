package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.core.view.t;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/FixNestedScrollViewAppBarLayoutBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FixNestedScrollViewAppBarLayoutBehavior extends AppBarLayout.Behavior {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixNestedScrollViewAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i14, AppBarLayout appBarLayout, View view2, int i15) {
        if (i15 == 1) {
            int topAndBottomOffset = getTopAndBottomOffset();
            if ((i14 >= 0 || topAndBottomOffset != 0) && (i14 <= 0 || topAndBottomOffset != (-appBarLayout.getTotalScrollRange()))) {
                return;
            }
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (view2 instanceof t) {
                ((t) view2).stopNestedScroll(1);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view2, int i14, int i15, int[] iArr, int i16) {
        coordinatorLayout.getClass();
        appBarLayout.getClass();
        view2.getClass();
        iArr.getClass();
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view2, i14, i15, iArr, i16);
        a(i15, appBarLayout, view2, i16);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view2, View view3, int i14, int i15, int i16, int i17, int i18) {
        AppBarLayout appBarLayout = (AppBarLayout) view2;
        coordinatorLayout.getClass();
        appBarLayout.getClass();
        view3.getClass();
        super.onNestedScroll(coordinatorLayout, appBarLayout, view3, i14, i15, i16, i17, i18);
        a(i17, appBarLayout, view3, i18);
    }
}
