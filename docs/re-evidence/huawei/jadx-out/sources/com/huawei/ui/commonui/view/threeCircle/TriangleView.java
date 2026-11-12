package com.huawei.ui.commonui.view.threeCircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qqn;

/* JADX INFO: loaded from: classes43.dex */
public class TriangleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f24018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f24019b;
    private float d;

    public TriangleView(Context context) {
        this(context, null);
    }

    public TriangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TriangleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LogUtil.a("TriangleView", "START TriangleView.");
        this.f24018a = new Paint();
        invalidate();
    }

    public void setWidth(float f) {
        this.f24019b = f;
    }

    public void setHeight(float f) {
        this.d = f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float f = this.f24019b;
        if (f <= 0.0f) {
            f = width;
        }
        float f2 = this.d;
        if (f2 <= 0.0f) {
            f2 = f / 2.0f;
        }
        LogUtil.a("TriangleView", "onDraw layoutWidth ", Float.valueOf(width), " width ", Float.valueOf(f), " height ", Float.valueOf(f2));
        this.f24018a.setColor(qqn.d(R.color.active_triangle));
        this.f24018a.setStrokeCap(Paint.Cap.ROUND);
        float f3 = width / 2.0f;
        Path path = new Path();
        path.moveTo(f3, 0.0f);
        float f4 = f / 2.0f;
        path.lineTo(f3 + f4, f2);
        path.lineTo(f3 - f4, f2);
        path.close();
        canvas.drawPath(path, this.f24018a);
    }
}
