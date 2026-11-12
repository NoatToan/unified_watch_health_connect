package com.huawei.health.marketing.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ColumnLayoutItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8178c;
    private int d;
    private int e;
    private int g;
    private int h;
    private int i;
    private int j;

    public ColumnLayoutItemDecoration(int i, int i2, int i3, int[] iArr) {
        this.j = 0;
        this.g = 0;
        this.h = 0;
        this.f8178c = 0;
        if (i3 == 0) {
            LogUtil.j("ColumnLayoutItemDecoration", "gridNumber is zero.");
            return;
        }
        this.f8176a = i;
        this.e = i3;
        this.i = i2;
        if (iArr != null && iArr.length >= 4) {
            this.j = iArr[0];
            this.g = iArr[1];
            this.h = iArr[2];
            this.f8178c = iArr[3];
        }
        this.f8177b = (((i * (i3 - 1)) + this.j) + this.h) / i3;
    }

    public ColumnLayoutItemDecoration(int i, int i2, int i3, int[] iArr, int i4) {
        this(i, i2, i3, iArr);
        this.d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView == null) {
            LogUtil.j("ColumnLayoutItemDecoration", "getItemOffsets parent is null.");
            return;
        }
        if (this.e <= 0) {
            LogUtil.j("ColumnLayoutItemDecoration", "getItemOffsets mGridNumber is zero");
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            LogUtil.j("ColumnLayoutItemDecoration", "getItemOffsets adapter is null");
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int orientation = ((LinearLayoutManager) layoutManager).getOrientation();
            int spanCount = layoutManager instanceof GridLayoutManager ? ((GridLayoutManager) layoutManager).getSpanCount() : 1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.e;
            if (orientation == 0) {
                d(rect, recyclerView, childAdapterPosition);
                return;
            }
            e(rect, childAdapterPosition % i, childAdapterPosition, adapter.getItemCount(), spanCount);
            if (e(view)) {
                rect.top = 0;
            }
        }
    }

    private boolean d(int i, int i2, int i3) {
        return (i3 - 1) / i2 == i / i2;
    }

    private void e(Rect rect, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.e;
        if (i6 == 1) {
            i5 = this.j;
        } else if (i6 > 1) {
            int i7 = this.f8177b;
            int i8 = this.j;
            i5 = ((i * ((i7 - i8) - this.h)) / (i6 - 1)) + i8;
        } else {
            i5 = 0;
        }
        int i9 = this.f8177b - i5;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            rect.left = i9;
            rect.right = i5;
        } else {
            rect.left = i5;
            rect.right = i9;
        }
        if (i2 < i4) {
            rect.top = this.g;
        } else {
            rect.top = this.i;
        }
        if (d(i2, i4, i3)) {
            rect.bottom = this.f8178c;
        }
    }

    private void d(Rect rect, RecyclerView recyclerView, int i) {
        int i2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        if (i == 0 || (i == 1 && this.d == 59)) {
            i2 = this.j;
        } else {
            i2 = this.f8176a;
        }
        int i3 = (i == adapter.getItemCount() - 1 || (i == adapter.getItemCount() + (-2) && this.d == 59)) ? this.h : 0;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            rect.left = i3;
            rect.right = i2;
        } else {
            rect.left = i2;
            rect.right = i3;
        }
        if (this.d == 116) {
            rect.left = 0;
            rect.right = 0;
        }
        rect.top = this.g;
        if (this.d == 59 && i % 2 != 0) {
            rect.top = this.i;
        }
        rect.bottom = this.f8178c;
    }

    private boolean e(View view) {
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        if (view instanceof HealthSubHeader) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof HealthSubHeader) {
                return ((HealthSubHeader) childAt).getVisibility() != 8;
            }
            z = z || e(childAt);
            if (z) {
                return z;
            }
        }
        return z;
    }
}
