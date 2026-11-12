package com.huami.ecg.chart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes8.dex */
public class EcgView extends FrameLayout {
    private static final String k = "EcgView";
    private boolean a;
    private boolean b;
    private int c;
    private int d;
    private Paint e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    public EcgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = true;
        this.h = 125;
        this.i = 50;
        setupAttrs(attributeSet);
        setWillNotDraw(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.graphics.Paint] */
    private void setupAttrs(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.EcgView, 0, 0);
        try {
            try {
                this.a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.EcgView_showGird, true);
                this.b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.EcgView_showStandard, true);
                int i = R.styleable.EcgView_girdColor;
                Context context = getContext();
                int i2 = R.color.s4;
                this.c = typedArrayObtainStyledAttributes.getColor(i, ContextCompat.getColor(context, i2));
                this.d = typedArrayObtainStyledAttributes.getColor(R.styleable.EcgView_girdWideLingColor, ContextCompat.getColor(getContext(), i2));
                this.f = typedArrayObtainStyledAttributes.getInteger(R.styleable.EcgView_girdLineWidth, 1);
                this.g = typedArrayObtainStyledAttributes.getInteger(R.styleable.EcgView_girdWideLineWidth, 2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = new Paint();
            this.e = typedArrayObtainStyledAttributes;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int getGirdLineColor() {
        return this.c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a) {
            float height = getHeight();
            float width = getWidth();
            int i = this.i;
            int i2 = this.h;
            float f = height / i;
            float f2 = width / i2;
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setColor(this.c);
            for (int i3 = 0; i3 <= i; i3++) {
                if (i3 % 5 == 0) {
                    this.e.setStrokeWidth(this.g);
                    if ((i3 == 0 || i3 == i) && this.j) {
                        this.e.setStrokeWidth(this.g + 4);
                    }
                    this.e.setColor(this.d);
                } else {
                    this.e.setStrokeWidth(this.f);
                    this.e.setColor(this.c);
                }
                float f3 = i3 * f;
                canvas.drawLine(0.0f, f3, width, f3, this.e);
            }
            for (int i4 = 0; i4 <= i2; i4++) {
                if (i4 % 5 == 0) {
                    this.e.setStrokeWidth(this.g);
                    if ((i4 == 0 || i4 == i2) && this.j) {
                        this.e.setStrokeWidth(this.g + 4);
                    }
                    this.e.setColor(this.d);
                } else {
                    this.e.setStrokeWidth(this.f);
                    this.e.setColor(this.c);
                }
                float f4 = i4 * f2;
                canvas.drawLine(f4, 0.0f, f4, height, this.e);
            }
            if (this.b) {
                this.e.setStrokeWidth(3.0f);
                this.e.setColor(ContextCompat.getColor(getContext(), R.color.ecg_chart_black));
                float f5 = 3.0f * f2;
                Path path = new Path();
                float f6 = (10.0f * f2) + f2;
                path.moveTo(f5, f6);
                float f7 = (2.0f * f2) + f5;
                path.lineTo(f7, f6);
                path.lineTo(f7, f2);
                float f8 = (6.0f * f2) + f5;
                path.lineTo(f8, f2);
                path.lineTo(f8, f6);
                path.lineTo(f5 + (f2 * 8.0f), f6);
                canvas.drawPath(path, this.e);
            }
        }
    }

    public void setGirdLineColor(int i) {
        this.c = i;
        invalidate();
        requestLayout();
    }

    public void setXY(int i, int i2) {
        this.h = i * 5;
        this.i = i2 * 5;
    }

    public void showFrame() {
        this.j = true;
    }

    public EcgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.b = true;
        this.h = 125;
        this.i = 50;
        setupAttrs(attributeSet);
        setWillNotDraw(false);
    }

    public EcgView(Context context) {
        super(context);
        this.a = true;
        this.b = true;
        this.h = 125;
        this.i = 50;
        setWillNotDraw(false);
    }
}
