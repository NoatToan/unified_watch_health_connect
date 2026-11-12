package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import l7.f;

/* JADX INFO: loaded from: classes14.dex */
class ClickActionDelegate extends androidx.core.view.a {
    private final f.a clickAction;

    public ClickActionDelegate(Context context, int i14) {
        this.clickAction = new f.a(16, context.getString(i14));
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        fVar.b(this.clickAction);
    }
}
