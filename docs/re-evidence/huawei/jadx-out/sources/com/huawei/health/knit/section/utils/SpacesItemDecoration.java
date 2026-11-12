package com.huawei.health.knit.section.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes7.dex */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7556c;
    private int d;
    private int e;
    private int f;
    private int h;
    private int i;

    SpacesItemDecoration(int i, int i2) {
        this.f7554a = 0;
        this.h = 0;
        this.i = 0;
        this.f7555b = 0;
        this.f7556c = i;
        this.e = i2;
    }

    public SpacesItemDecoration(int i, int i2, int i3, int[] iArr) {
        this(i, i3);
        this.f = i2;
        if (iArr != null && iArr.length >= 4) {
            this.f7554a = iArr[0];
            this.h = iArr[1];
            this.i = iArr[2];
            this.f7555b = iArr[3];
        }
        int i4 = this.f7556c;
        int i5 = this.e;
        this.d = (((i4 * (i5 - 1)) + this.f7554a) + this.i) / i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView == null) {
            LogUtil.j("SpacesItemDecoration", "getItemOffsets parent is null.");
            return;
        }
        if (this.e <= 0) {
            LogUtil.j("SpacesItemDecoration", "getItemOffsets mGridNumber is zero");
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            LogUtil.j("SpacesItemDecoration", "getItemOffsets adapter is null");
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int orientation = gridLayoutManager.getOrientation();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.e;
            if (orientation == 0) {
                b(rect, recyclerView, childAdapterPosition);
            } else {
                a(rect, childAdapterPosition % i, childAdapterPosition, adapter.getItemCount(), gridLayoutManager.getSpanCount());
            }
        }
    }

    private void b(Rect rect, RecyclerView recyclerView, int i) {
        int dimensionPixelSize;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        if (i == 0) {
            dimensionPixelSize = this.f7554a;
        } else {
            dimensionPixelSize = this.i - BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        }
        int i2 = i == adapter.getItemCount() + (-1) ? this.i : 0;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            rect.left = i2;
            rect.right = dimensionPixelSize;
        } else {
            rect.left = dimensionPixelSize;
            rect.right = i2;
        }
        rect.top = this.h;
        rect.bottom = this.f7555b;
    }

    private void a(Rect rect, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.e;
        if (i6 == 1) {
            i5 = this.f7554a;
        } else if (i6 > 1) {
            int i7 = this.d;
            int i8 = this.f7554a;
            i5 = ((i * ((i7 - i8) - this.i)) / (i6 - 1)) + i8;
        } else {
            i5 = 0;
        }
        int i9 = this.d - i5;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            rect.left = i9;
            rect.right = i5;
        } else {
            rect.left = i5;
            rect.right = i9;
        }
        if (i2 < i4) {
            rect.top = this.h;
        } else {
            rect.top = 0;
        }
        if (((int) Math.ceil((i3 * 1.0f) / i4)) - 1 == i2 / i4) {
            rect.bottom = this.f7555b;
        } else {
            rect.bottom = this.f;
        }
    }
}
