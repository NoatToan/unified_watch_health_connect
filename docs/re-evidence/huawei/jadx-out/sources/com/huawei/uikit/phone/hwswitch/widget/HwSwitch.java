package com.huawei.uikit.phone.hwswitch.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.huawei.uikit.hwswitch.R;

/* JADX INFO: loaded from: classes20.dex */
public class HwSwitch extends com.huawei.uikit.hwswitch.widget.HwSwitch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29857c;
    private int d;
    private Paint e;

    public HwSwitch(Context context) {
        this(context, null);
    }

    @Override // com.huawei.uikit.hwswitch.widget.HwSwitch, android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        if (isFocused() && this.f29770a != null && hasWindowFocus()) {
            Rect bounds = this.f29770a.getBounds();
            this.e.setStrokeWidth(this.d);
            int i = bounds.left;
            int i2 = this.f29857c;
            int i3 = bounds.top;
            int i4 = this.f29856b;
            RectF rectF = new RectF(i - i2, i3 - i4, bounds.right + i2, bounds.bottom + i4);
            float f = ((bounds.bottom - bounds.top) / 2) + this.f29856b;
            canvas.drawRoundRect(rectF, f, f, this.e);
        }
    }

    public HwSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwSwitchStyle);
    }

    private void e() {
        setDefaultFocusHighlightEnabled(false);
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setColor(getFocusedPathColor());
        this.f29856b = (int) getResources().getDimension(R.dimen.hwswitch_focus_status_vertical);
        this.d = (int) getResources().getDimension(R.dimen.hwswitch_focus_status_stroke_width);
        a();
    }

    public HwSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        e();
    }

    protected void a() {
        this.f29857c = (int) (getResources().getDimension(R.dimen.hwswitch_focus_status_horizontal) - (getResources().getDimension(R.dimen.hwswitch_min_width) / 24.0f));
    }
}
