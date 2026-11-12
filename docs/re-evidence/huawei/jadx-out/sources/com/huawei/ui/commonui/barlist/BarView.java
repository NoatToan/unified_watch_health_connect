package com.huawei.ui.commonui.barlist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class BarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f23284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23285c;
    private int d;
    private int e;

    public BarView(Context context) {
        super(context);
        this.f23284b = new Paint();
        this.f23285c = 0;
        this.e = 0;
        e();
    }

    public BarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23284b = new Paint();
        this.f23285c = 0;
        this.e = 0;
        e();
    }

    public BarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23284b = new Paint();
        this.f23285c = 0;
        this.e = 0;
        e();
    }

    private void e() {
        this.f23284b.setStrokeCap(Paint.Cap.ROUND);
        this.f23284b.setAntiAlias(true);
        this.f23284b.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.health_bar_view_width));
        this.e = ContextCompat.getColor(getContext(), R.color.health_bar_bg_color);
    }

    public void setData(int i, int i2, int i3) {
        this.f23283a = i;
        this.d = i2;
        this.f23285c = i3;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float strokeWidth = this.f23284b.getStrokeWidth();
        canvas.rotate(180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight();
        float f = strokeWidth / 2.0f;
        this.f23284b.setColor(this.e);
        canvas.drawLine(width, 0.0f, width, height - f, this.f23284b);
        float height2 = this.f23283a != 0 ? ((getHeight() * this.f23283a) / this.d) - f : 0.0f;
        if (height2 > 0.0f) {
            this.f23284b.setColor(this.f23285c);
            canvas.drawLine(width, 0.0f, width, height2, this.f23284b);
        }
        canvas.restore();
    }
}
