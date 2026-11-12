package com.huawei.pluginsocialshare.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class ClipImageMaskView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22544c;
    private int f;
    private int g;
    private Paint h;
    private static final int e = Color.parseColor("#4D4D4D");
    private static final int d = Color.parseColor("#AA000000");

    public ClipImageMaskView(Context context) {
        this(context, null);
    }

    public ClipImageMaskView(b bVar) {
        this(bVar.f22546c);
        this.f22543b = bVar.f22546c;
        this.f = bVar.d;
        this.f22544c = bVar.e;
        this.g = bVar.f22545b;
    }

    public ClipImageMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipImageMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22542a = 1;
        this.f = 1;
        this.f22544c = 1;
        this.f22542a = (int) TypedValue.applyDimension(1, 1, getResources().getDisplayMetrics());
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        int i = (height - (((width - (this.g * 2)) * this.f22544c) / this.f)) / 2;
        this.h.setColor(d);
        this.h.setStyle(Paint.Style.FILL);
        float f = height;
        canvas.drawRect(0.0f, 0.0f, this.g, f, this.h);
        canvas.drawRect(width - this.g, 0.0f, width, f, this.h);
        int i2 = this.g;
        float f2 = i2;
        float f3 = width - i2;
        float f4 = i;
        canvas.drawRect(f2, 0.0f, f3, f4, this.h);
        int i3 = this.g;
        float f5 = height - i;
        canvas.drawRect(i3, f5, width - i3, f, this.h);
        this.h.setColor(e);
        this.h.setStrokeWidth(this.f22542a);
        this.h.setStyle(Paint.Style.STROKE);
        int i4 = this.g;
        canvas.drawRect(i4, f4, width - i4, f5, this.h);
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f22546c;
        private int d = 1;
        private int e = 1;

        public b(Context context, int i) {
            this.f22545b = i;
            this.f22546c = context;
        }

        public b d(int i) {
            if (i < 0) {
                return this;
            }
            this.f22545b = i;
            return this;
        }

        public b e(int i) {
            if (i < 0) {
                return this;
            }
            this.d = i;
            return this;
        }

        public b b(int i) {
            if (i < 0) {
                return this;
            }
            this.e = i;
            return this;
        }

        public ClipImageMaskView c() {
            return new ClipImageMaskView(this);
        }
    }
}
