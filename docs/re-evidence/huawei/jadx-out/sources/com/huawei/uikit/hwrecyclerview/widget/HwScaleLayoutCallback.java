package com.huawei.uikit.hwrecyclerview.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes44.dex */
public class HwScaleLayoutCallback extends HwLinearLayoutManager.LayoutCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f29672a = 0.25f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f29673b;

    class a implements Runnable {
        final /* synthetic */ RecyclerView d;

        a(RecyclerView recyclerView) {
            this.d = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.requestLayout();
        }
    }

    public HwScaleLayoutCallback(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = (f <= 0.0f ? 3.0f : f) * 85.0f;
        this.f29673b = (-0.34f) / (f2 * f2);
    }

    private void d(View view, float f) {
        int layerType = view.getLayerType();
        if (Float.compare(f, 0.0f) == 0 && layerType != 0) {
            view.setLayerType(0, null);
        } else {
            if (Float.compare(f, 0.0f) <= 0 || layerType == 2) {
                return;
            }
            view.setLayerType(2, null);
        }
    }

    private float e(float f) {
        return (float) (1.0d - Math.pow(1.0f - f, 3.0d));
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwLinearLayoutManager.LayoutCallback
    public void onLayoutFinished(View view, RecyclerView recyclerView) {
        int height = recyclerView.getHeight();
        if (height == 0) {
            recyclerView.post(new a(recyclerView));
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if ((adapter.getItemViewType(childAdapterPosition) & 268435456) != 0) {
            return;
        }
        float y = (view.getY() + (view.getHeight() / 2.0f)) - (height / 2.0f);
        float fAbs = Math.abs(y);
        float fMax = Math.max((this.f29673b * fAbs * fAbs) + 1.08f, 0.38f);
        b(view, fMax);
        if ((adapter.getItemViewType(childAdapterPosition) & 16777216) != 0) {
            view.setPivotX(view.getWidth() / 2.0f);
            float fMin = Math.min(fAbs / (recyclerView.getHeight() / 2.0f), 1.0f);
            view.setPivotY((view.getHeight() / 2.0f) - (((Math.signum(y) * view.getHeight()) * e(fMin)) * this.f29672a));
        }
        view.setScaleX(fMax);
        view.setScaleY(fMax);
    }

    private void b(View view, float f) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    b(childAt, f);
                } else if (childAt instanceof TextView) {
                    d(childAt, f);
                }
            }
        }
    }
}
