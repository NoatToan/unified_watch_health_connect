package com.huawei.uikit.hwrecyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes44.dex */
public class HwLinearLayoutManager extends HwLinearLayoutManagerEx {
    private LayoutCallback h;

    public static abstract class LayoutCallback {
        public abstract void onLayoutFinished(View view, RecyclerView recyclerView);
    }

    public HwLinearLayoutManager(Context context, LayoutCallback layoutCallback) {
        super(context, 1, false);
        this.h = layoutCallback;
    }

    private void i() {
        if (this.h == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt.getParent() instanceof RecyclerView)) {
                this.h.onLayoutFinished(childAt, (RecyclerView) childAt.getParent());
            }
        }
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwLinearLayoutManagerEx
    protected void e(RecyclerView.State state, int[] iArr) {
        super.e(state, iArr);
        iArr[0] = iArr[0] + c()[0];
        iArr[1] = iArr[1] + c()[1];
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwLinearLayoutManagerEx, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        if (getChildCount() == 0) {
            return;
        }
        i();
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwLinearLayoutManagerEx, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iScrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        i();
        return iScrollVerticallyBy;
    }

    public HwLinearLayoutManager(Context context) {
        this(context, HwDeviceAdapter.b(context).d(context));
    }

    public HwLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
