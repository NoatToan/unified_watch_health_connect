package com.huawei.ui.commonui.recycleview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class RecyclerItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23820c;
    private final int d;
    private final int e;
    private final int i;

    public RecyclerItemDecoration(int i, int i2, ArrayList<Integer> arrayList) {
        this.f23819b = i;
        this.i = i2;
        if (njy.e(arrayList, 3)) {
            LogUtil.j("RecyclerItemDecoration", "RecyclerItemDecoration edgeSpacesList is out of bounds");
            this.f23818a = 0;
            this.d = 0;
            this.e = 0;
            this.f23820c = 0;
            return;
        }
        this.f23818a = arrayList.get(0).intValue();
        this.d = arrayList.get(1).intValue();
        this.e = arrayList.get(2).intValue();
        this.f23820c = arrayList.get(3).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            LogUtil.j("RecyclerItemDecoration", "getItemOffsets adapter is null");
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = adapter.getItemCount();
        if (layoutManager instanceof LinearLayoutManager) {
            c(rect, childAdapterPosition, itemCount, ((LinearLayoutManager) layoutManager).getOrientation());
        }
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            c(rect, childAdapterPosition, itemCount, gridLayoutManager.getOrientation(), gridLayoutManager.getSpanCount());
        }
    }

    private void c(Rect rect, int i, int i2, int i3) {
        int i4 = i2 - 1;
        if (i3 != 0) {
            if (i == 0) {
                rect.set(0, this.e, 0, this.i);
                return;
            } else if (i == i4) {
                rect.set(0, 0, 0, this.f23820c);
                return;
            } else {
                rect.set(0, 0, 0, this.i);
                return;
            }
        }
        if (LanguageUtil.ba(BaseApplication.b())) {
            if (i == 0) {
                rect.set(this.f23819b, 0, this.f23818a, 0);
                return;
            } else if (i == i4) {
                rect.set(this.d, 0, 0, 0);
                return;
            } else {
                rect.set(this.f23819b, 0, 0, 0);
                return;
            }
        }
        if (i == 0) {
            rect.set(this.f23818a, 0, this.f23819b, 0);
        } else if (i == i4) {
            rect.set(0, 0, this.d, 0);
        } else {
            rect.set(0, 0, this.f23819b, 0);
        }
    }

    private void c(Rect rect, int i, int i2, int i3, int i4) {
        if (i3 == 0) {
            a(rect, i, i2, i4);
        } else {
            b(rect, i, i2, i4);
        }
    }

    private void a(Rect rect, int i, int i2, int i3) {
        float f;
        float f2;
        int i4 = this.f23819b;
        int i5 = i3 - 1;
        int i6 = this.f23818a;
        int i7 = this.d;
        float f3 = (((i4 * i5) + i6) + i7) / i3;
        int i8 = i % i3;
        int i9 = i / i3;
        int i10 = (i2 / i3) - 1;
        float f4 = i4;
        float f5 = 0.0f;
        if (i6 == 0 || i7 == 0) {
            f = i8 * f3;
            if (i3 > 1) {
                f /= i5;
            }
            f2 = f3 - f;
            if (i10 == i9) {
                f4 = 0.0f;
            }
        } else {
            if (i < i3) {
                f5 = i6;
            } else if (i10 == i9) {
                f4 = i7;
            }
            float f6 = this.e;
            float f7 = i8 * ((f3 - f6) - this.f23820c);
            if (i3 > 1) {
                f7 /= i5;
            }
            f = f7 + f6;
            f2 = f3 - f;
        }
        rect.set((int) f5, (int) f, (int) f4, (int) f2);
    }

    private void b(Rect rect, int i, int i2, int i3) {
        float f;
        float f2;
        int i4;
        int i5 = this.f23819b;
        int i6 = i3 - 1;
        int i7 = this.f23818a;
        int i8 = this.d;
        float f3 = (((i5 * i6) + i7) + i8) / i3;
        int i9 = i % i3;
        int i10 = i / i3;
        int i11 = (i2 / i3) - 1;
        float f4 = this.i;
        int i12 = this.e;
        float f5 = 0.0f;
        if (i12 == 0 || (i4 = this.f23820c) == 0) {
            f = i9 * f3;
            if (i3 > 1) {
                f /= i6;
            }
            f2 = f3 - f;
            if (i11 == i10) {
                f4 = 0.0f;
            }
        } else {
            if (i < i3) {
                f5 = i12;
            } else if (i11 == i10) {
                f4 = i4;
            }
            float f6 = i7;
            float f7 = i9 * ((f3 - f6) - i8);
            if (i3 > 1) {
                f7 /= i6;
            }
            f = f7 + f6;
            f2 = f3 - f;
        }
        if (LanguageUtil.ba(BaseApplication.b())) {
            rect.set((int) f2, (int) f5, (int) f, (int) f4);
        } else {
            rect.set((int) f, (int) f5, (int) f2, (int) f4);
        }
    }
}
