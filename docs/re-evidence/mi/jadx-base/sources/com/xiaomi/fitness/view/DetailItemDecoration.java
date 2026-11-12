package com.xiaomi.fitness.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.iji;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/view/DetailItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "initPaint", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/Paint;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DetailItemDecoration extends RecyclerView.n {

    @Nullable
    private Paint mPaint;

    public DetailItemDecoration() {
        initPaint();
    }

    private final void initPaint() {
        Paint paint = new Paint();
        this.mPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.mPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.mPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.mPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setStrokeWidth(0.75f);
        Paint paint5 = this.mPaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setColor(x44.a(iji.common_divider_bg_color));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            if (i2 % 2 == 0) {
                View childAt = parent.getChildAt(i);
                float left = childAt.getLeft();
                Path path = new Path();
                path.moveTo(left, childAt.getTop() + 18);
                path.lineTo(left, childAt.getBottom() - 16);
                Paint paint = this.mPaint;
                Intrinsics.checkNotNull(paint);
                canvas.drawPath(path, paint);
            }
            i = i2;
        }
    }
}
