package com.garmin.android.apps.connectmobile.activities.stats;

import a7.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import hb2.f;

/* JADX INFO: loaded from: classes7.dex */
public class ColorShapeRectangleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f29760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f29761b;

    public ColorShapeRectangleView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        int iA = f.a(20, getContext());
        this.f29760a = new Rect(0, 0, iA, iA);
        this.f29761b = new Paint();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(this.f29760a, this.f29761b);
    }

    public void setRectangleColor(int i14) {
        this.f29761b.setColor(b.getColor(getContext(), i14));
        invalidate();
    }

    public ColorShapeRectangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ColorShapeRectangleView(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, -1);
    }

    public ColorShapeRectangleView(Context context) {
        this(context, null);
    }
}
