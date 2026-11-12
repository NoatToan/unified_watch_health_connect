package com.xiaomi.fitness.chart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.du3;
import defpackage.s02;
import defpackage.vfe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/chart/view/ScrollChartRecycleView;", "Lcom/xiaomi/fitness/chart/view/BaseChartRecyclerView;", "Lvfe;", "Ls02;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "getAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lvfe;", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "lastX", "F", "lastY", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class ScrollChartRecycleView extends BaseChartRecyclerView<vfe, s02> {
    private float lastX;
    private float lastY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollChartRecycleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 2) {
            float x = ev.getX();
            if (Math.abs(x - this.lastX) <= Math.abs(ev.getY() - this.lastY)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (x - this.lastX > 0.0f && !canScrollHorizontally(-1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (x - this.lastX >= 0.0f || canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.lastX = ev.getX();
        this.lastY = ev.getY();
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.xiaomi.fitness.chart.view.BaseChartRecyclerView
    @NotNull
    public vfe getAttrs(@NotNull Context context, @Nullable AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        vfe vfeVarC = du3.c(context, attrs);
        Intrinsics.checkNotNullExpressionValue(vfeVarC, "getLineChartRecyclerAttrs(...)");
        return vfeVarC;
    }
}
