package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class GCMLeftSquareBracketView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f47794a;

    public GCMLeftSquareBracketView(Context context) {
        super(context);
        this.f47794a = new Paint();
        a();
    }

    public final void a() {
        Paint paint = this.f47794a;
        paint.setColor(-7829368);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(6.0f);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        float f14 = paddingLeft;
        float f15 = paddingTop;
        float f16 = measuredWidth;
        canvas.drawLine(f14, f15, f16, f15, this.f47794a);
        float f17 = measuredHeight;
        canvas.drawLine(f14, f15, f14, f17, this.f47794a);
        canvas.drawLine(f14, f17, f16, f17, this.f47794a);
    }

    public GCMLeftSquareBracketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47794a = new Paint();
        a();
    }

    public GCMLeftSquareBracketView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f47794a = new Paint();
        a();
    }
}
