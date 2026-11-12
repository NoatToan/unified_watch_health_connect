package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.c;
import defpackage.u4i;
import defpackage.u8g;
import defpackage.ygi;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map<View, Integer> i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.e A(Context context, boolean z) {
        int i = z ? ygi.l : ygi.f40159k;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f8976a = u8g.d(context, i);
        eVar.f8977b = new u4i(17, 0.0f, 0.0f);
        return eVar;
    }

    public final void C(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (z) {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        c.C0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.i;
                        if (map != null && map.containsKey(childAt)) {
                            c.C0(childAt, this.i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.i = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean d(View view, View view2, boolean z, boolean z2) {
        C(view2, z);
        return super.d(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
