package com.huami.watchfacesstore.ui.decoration;

import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes17.dex */
public class RecyclerViewCornerRadius extends RecyclerView.ItemDecoration {
    public static final String TAG = "RecyclerViewCornerRadius";
    private RectF a;
    private Path b;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ RecyclerView a;

        public a(final RecyclerView val$recyclerView) {
            this.a = val$recyclerView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerViewCornerRadius.this.a = new RectF(0.0f, 0.0f, this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
            RecyclerViewCornerRadius.this.b = new Path();
            RecyclerViewCornerRadius.this.b.reset();
            RecyclerViewCornerRadius.this.b.addRoundRect(RecyclerViewCornerRadius.this.a, new float[]{RecyclerViewCornerRadius.this.c, RecyclerViewCornerRadius.this.c, RecyclerViewCornerRadius.this.d, RecyclerViewCornerRadius.this.d, RecyclerViewCornerRadius.this.e, RecyclerViewCornerRadius.this.e, RecyclerViewCornerRadius.this.f, RecyclerViewCornerRadius.this.f}, Path.Direction.CCW);
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public RecyclerViewCornerRadius(final RecyclerView recyclerView) {
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new a(recyclerView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        c.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        c.clipRect(this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            c.clipPath(this.b);
        } else {
            c.clipPath(this.b, Region.Op.REPLACE);
        }
    }

    public void setCornerRadius(int radius) {
        this.c = radius;
        this.d = radius;
        this.e = radius;
        this.f = radius;
    }

    public void setCornerRadius(int topLeftRadius, int topRightRadius, int bottomLeftRadius, int bottomRightRadius) {
        this.c = topLeftRadius;
        this.d = topRightRadius;
        this.e = bottomLeftRadius;
        this.f = bottomRightRadius;
    }
}
