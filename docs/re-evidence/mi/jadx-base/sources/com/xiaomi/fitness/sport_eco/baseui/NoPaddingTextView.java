package com.xiaomi.fitness.sport_eco.baseui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.feedback.util.RTLUtilKt;

/* JADX INFO: loaded from: classes10.dex */
public class NoPaddingTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f13045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f13046b;
    public Paint c;
    public Rect d;
    public Boolean e;
    public TextView f;
    public Context g;
    public float h;
    public float i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13047k;

    public NoPaddingTextView(Context context) {
        super(context);
        this.f13045a = getPaint();
        this.f13046b = new Rect();
        this.e = Boolean.TRUE;
        this.h = DisplayUtil.dip2px(3.0f);
        this.i = DisplayUtil.dip2px(28.0f);
        this.j = -16777216;
    }

    private String d() {
        String string = getText().toString();
        int length = string.length();
        this.f13045a.getTextBounds(string, 0, length, this.f13046b);
        if (length == 0) {
            Rect rect = this.f13046b;
            rect.right = rect.left;
        }
        return string;
    }

    private void f(Canvas canvas) {
        String strD = d();
        Rect rect = this.f13046b;
        int i = rect.left;
        int i2 = rect.bottom;
        rect.offset(-i, -rect.top);
        this.f13045a.setAntiAlias(true);
        this.f13045a.setColor(getCurrentTextColor());
        if (!RTLUtilKt.isRTL(this.g)) {
            canvas.drawText(strD, -i, this.f13046b.bottom - i2, this.f13045a);
            TextView textView = this.f;
            if (textView == null || this.d == null || this.c == null) {
                return;
            }
            String string = textView.getText().toString();
            Rect rect2 = this.f13046b;
            float f = rect2.right;
            float f2 = this.h;
            canvas.drawText(string, f + f2, (rect2.bottom - i2) - f2, this.c);
            return;
        }
        float f3 = this.f13047k;
        Rect rect3 = this.f13046b;
        canvas.drawText(strD, (f3 - (rect3.right - rect3.left)) - (this.h * 2.0f), rect3.bottom - i2, this.f13045a);
        TextView textView2 = this.f;
        if (textView2 == null || this.d == null || this.c == null) {
            return;
        }
        String string2 = textView2.getText().toString();
        float f4 = this.f13047k;
        Rect rect4 = this.f13046b;
        float f5 = f4 - (rect4.right - rect4.left);
        Rect rect5 = this.d;
        float f6 = f5 - (rect5.right - rect5.left);
        float f7 = this.h;
        canvas.drawText(string2, f6 - (2.0f * f7), (rect4.bottom - i2) - f7, this.c);
    }

    private void g(Context context, AttributeSet attributeSet) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        f(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.e.booleanValue()) {
            d();
            Rect rect = this.f13046b;
            setMeasuredDimension(rect.right - rect.left, (-rect.top) + rect.bottom);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setColor(int i) {
        this.j = i;
        Paint paint = this.c;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setUnitMargin(float f) {
        this.h = f;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f13047k = i;
        invalidate();
    }

    public NoPaddingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13045a = getPaint();
        this.f13046b = new Rect();
        this.e = Boolean.TRUE;
        this.h = DisplayUtil.dip2px(3.0f);
        this.i = DisplayUtil.dip2px(28.0f);
        this.j = -16777216;
        this.g = context;
        g(context, attributeSet);
    }

    public NoPaddingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13045a = getPaint();
        this.f13046b = new Rect();
        this.e = Boolean.TRUE;
        this.h = DisplayUtil.dip2px(3.0f);
        this.i = DisplayUtil.dip2px(28.0f);
        this.j = -16777216;
        g(context, attributeSet);
    }
}
