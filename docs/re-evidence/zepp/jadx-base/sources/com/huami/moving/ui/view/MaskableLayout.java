package com.huami.moving.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes5.dex */
public class MaskableLayout extends RelativeLayout {
    private final Path a;
    private float b;
    private float c;
    private float d;

    public MaskableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Path();
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    private void a() {
        this.a.reset();
        Path path = this.a;
        float f = this.c;
        float f2 = this.b;
        float f3 = this.d;
        path.addOval(new RectF(f - f2, f3 - f2, f + f2, f3 + f2), Path.Direction.CCW);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        a();
        canvas.clipPath(this.a, Region.Op.DIFFERENCE);
        super.dispatchDraw(canvas);
    }

    public void setOvalMask(float f, float f2, float f3) {
        this.c = f;
        this.d = f2;
        this.b = f3;
        invalidate();
    }
}
