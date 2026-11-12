package com.huawei.hwcommonmodel.accessibility;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import defpackage.lrn;
import health.compact.a.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ChartTouchHelper extends ExploreByTouchHelper {
    private final String d;
    private lrn e;

    public ChartTouchHelper(View view, Class<? extends AbstractTouchNode> cls) {
        super(view);
        this.d = "ChartTouchHelper";
        this.e = new lrn(cls);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(List<Integer> list) {
        for (int i = 0; i < this.e.d(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float f, float f2) {
        return this.e.c((int) f, (int) f2);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (i == -1) {
            ReleaseLogUtil.d("ChartTouchHelper", "virtualViewId is invalid_index");
        } else {
            this.e.a(i).onPopulateNodeForVirtualView(accessibilityNodeInfoCompat);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        if (i == -1) {
            ReleaseLogUtil.d("ChartTouchHelper", "virtualViewId is invalid_index");
            return false;
        }
        return this.e.a(i).onPerformActionForVirtualView(i2, bundle);
    }

    public lrn a() {
        return this.e;
    }
}
