package com.xiaomi.fitness.baseui.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.dhi;
import defpackage.o8p;
import defpackage.o93;
import defpackage.p93;
import defpackage.z4j;

/* JADX INFO: loaded from: classes7.dex */
public class WeekBar extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f11631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11632b;
    public Paint c;
    public o93 d;

    public WeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.w2);
        this.f11632b = typedArrayObtainStyledAttributes.getInt(z4j.H2, 300);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(z4j.P2, false);
        this.d = p93.a(context, attributeSet);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            this.f11631a = context.getResources().getStringArray(dhi.f15533b);
        } else {
            this.f11631a = context.getResources().getStringArray(dhi.f15532a);
        }
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.c.setTextAlign(Paint.Align.CENTER);
        this.c.setTextSize(this.d.U);
        this.c.setColor(this.d.T);
        int i = this.d.V;
        if (i != -1) {
            o8p.j(this.c, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = (int) this.d.m;
        int i2 = i * 2;
        int i3 = (measuredWidth - (i * 14)) / 8;
        int i4 = 0;
        while (i4 < this.f11631a.length) {
            int i5 = i4 + 1;
            int i6 = (i5 * i3) + (i4 * i2);
            int i7 = i3 + i2;
            int right = i5 * i7;
            if (AppUtil.isRTLDirection()) {
                right = getRight() - i6;
                i6 = right - i7;
            }
            Rect rect = new Rect(i6, paddingTop, right, paddingTop + measuredHeight);
            Paint.FontMetrics fontMetrics = this.c.getFontMetrics();
            int iCenterY = (int) ((rect.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
            if (this.f11632b == 301) {
                String[] strArr = this.f11631a;
                str = strArr[i5 > strArr.length + (-1) ? 0 : i5];
            } else {
                str = this.f11631a[i4];
            }
            canvas.drawText(str, rect.centerX(), iCenterY, this.c);
            i4 = i5;
        }
    }
}
