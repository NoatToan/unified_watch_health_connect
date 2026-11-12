package com.huami.moving.ui.view.gradient;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes5.dex */
public class GradientBaseView extends View {
    private static final String b = "GradientBaseView";
    public Paint a;

    public GradientBaseView(Context context) {
        this(context, null);
    }

    public Paint getPaint() {
        return this.a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HMLog.d(b, "onDraw", new Object[0]);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.a);
    }

    public GradientBaseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new a().a(context, attributeSet, i);
    }

    @TargetApi(21)
    public GradientBaseView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new a().a(context, attributeSet, i);
    }
}
