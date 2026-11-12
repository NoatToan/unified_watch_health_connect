package com.huawei.health.sport.configuredpage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes8.dex */
public class ConfiguredPageItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8795c;
    private int d;
    private int e;
    private int h;
    private int i;
    private int j;

    public ConfiguredPageItemDecoration(int i, int i2) {
        this.f8794b = 0;
        this.j = 0;
        this.i = 0;
        this.e = 0;
        this.d = i;
        this.f8795c = i2;
    }

    public ConfiguredPageItemDecoration(int i, int i2, int i3, int[] iArr) {
        this(i, i3);
        this.h = i2;
        if (iArr != null && iArr.length >= 4) {
            this.f8794b = iArr[0];
            this.j = iArr[1];
            this.i = iArr[2];
            this.e = iArr[3];
        }
        int i4 = this.d;
        int i5 = this.f8795c;
        this.f8793a = (((i4 * (i5 - 1)) + this.f8794b) + this.i) / i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageItemDecoration", "getItemOffsets parent is null.");
            return;
        }
        if (this.f8795c <= 0) {
            LogUtil.j("ConfiguredPage_ConfiguredPageItemDecoration", "getItemOffsets mGridNumber is zero");
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            LogUtil.j("ConfiguredPage_ConfiguredPageItemDecoration", "getItemOffsets adapter is null");
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int orientation = gridLayoutManager.getOrientation();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.f8795c;
            if (orientation == 0) {
                d(rect, recyclerView, childAdapterPosition);
            } else {
                d(rect, childAdapterPosition % i, childAdapterPosition, adapter.getItemCount(), gridLayoutManager.getSpanCount());
            }
        }
    }

    private void d(Rect rect, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.f8795c;
        if (i6 == 1) {
            i5 = this.f8794b;
        } else if (i6 > 1) {
            int i7 = this.f8793a;
            int i8 = this.f8794b;
            i5 = ((i * ((i7 - i8) - this.i)) / (i6 - 1)) + i8;
        } else {
            i5 = 0;
        }
        int i9 = this.f8793a - i5;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            rect.left = i9;
            rect.right = i5;
        } else {
            rect.left = i5;
            rect.right = i9;
        }
        if (i2 < i4) {
            rect.top = this.j;
        } else {
            rect.top = 0;
        }
        if (((int) ((((i3 * 1.0f) / i4) + 0.5f) - 1.0f)) == i2 / i4) {
            rect.bottom = this.e;
        } else {
            rect.bottom = this.h;
        }
    }

    private void d(Rect rect, RecyclerView recyclerView, int i) {
        int i2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        if (i == 0) {
            i2 = this.f8794b;
        } else {
            i2 = this.d;
        }
        int i3 = i == adapter.getItemCount() + (-1) ? this.i : 0;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            rect.left = i3;
            rect.right = i2;
        } else {
            rect.left = i2;
            rect.right = i3;
        }
        rect.top = this.j;
        rect.bottom = this.e;
    }
}
