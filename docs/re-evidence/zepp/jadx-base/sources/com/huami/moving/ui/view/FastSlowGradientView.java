package com.huami.moving.ui.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.ui.view.gradient.GradientBaseView;

/* JADX INFO: loaded from: classes5.dex */
public class FastSlowGradientView extends GradientBaseView {
    private static final String f = "FastSlowGradientView";
    public float c;
    public float d;
    private RectF e;

    public FastSlowGradientView(Context context) {
        super(context);
        this.c = 4.0f;
        this.d = 4.0f;
        this.e = new RectF();
    }

    @Override // com.huami.moving.ui.view.gradient.GradientBaseView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.e;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getMeasuredWidth();
        this.e.bottom = getMeasuredHeight();
        canvas.drawRoundRect(this.e, this.c, this.d, getPaint());
    }

    public FastSlowGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 4.0f;
        this.d = 4.0f;
        this.e = new RectF();
    }

    public FastSlowGradientView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 4.0f;
        this.d = 4.0f;
        this.e = new RectF();
        this.c = ViewUtils.dp2px(context, 1.3f);
        this.d = ViewUtils.dp2px(context, 1.3f);
    }

    @TargetApi(21)
    public FastSlowGradientView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = 4.0f;
        this.d = 4.0f;
        this.e = new RectF();
        this.c = ViewUtils.dp2px(context, 1.3f);
        this.d = ViewUtils.dp2px(context, 1.3f);
    }
}
