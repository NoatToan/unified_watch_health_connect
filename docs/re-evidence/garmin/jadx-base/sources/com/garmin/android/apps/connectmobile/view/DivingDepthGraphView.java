package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class DivingDepthGraphView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f47396a;

    public DivingDepthGraphView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f47396a = paint;
        paint.setAntiAlias(true);
        this.f47396a.setColor(a7.b.getColor(context, R.color.gds_data_viz_neutral_primary));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f14 = width / 6;
        this.f47396a.setStrokeWidth(15.0f);
        canvas.drawLine(0.0f, 0.0f, f14, 0.0f, this.f47396a);
        this.f47396a.setStrokeWidth(8.0f);
        float f15 = f14 * 2.0f;
        canvas.drawLine(f14, 0.0f, f15, height, this.f47396a);
        this.f47396a.setStrokeWidth(15.0f);
        float f16 = f14 * 4.0f;
        canvas.drawLine(f15, height, f16, height, this.f47396a);
        this.f47396a.setStrokeWidth(8.0f);
        float f17 = f14 * 5.0f;
        canvas.drawLine(f16, height, f17, 0.0f, this.f47396a);
        this.f47396a.setStrokeWidth(15.0f);
        canvas.drawLine(f17, 0.0f, f14 * 6.0f, 0.0f, this.f47396a);
    }

    public DivingDepthGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DivingDepthGraphView(Context context) {
        this(context, null);
    }
}
