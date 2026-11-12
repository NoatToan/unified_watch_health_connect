package com.garmin.android.apps.connectmobile.activities.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.utils.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class CenterOffsetView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f28930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f28931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f28934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28935f;

    public CenterOffsetView(Context context) {
        super(context);
        this.f28934e = new Rect();
        this.f28935f = 0;
        setupOffsetMarkerPaint(context);
    }

    private void setupOffsetMarkerPaint(Context context) {
        this.f28933d = context.getString(R.string.lbl_mm);
        Paint paint = new Paint();
        this.f28930a = paint;
        paint.setColor(-65536);
        this.f28930a.setStyle(Paint.Style.STROKE);
        this.f28930a.setStrokeWidth(6.0f);
        Paint paint2 = new Paint(1);
        this.f28931b = paint2;
        paint2.setColor(-65536);
        this.f28931b.setTextAlign(Paint.Align.CENTER);
        Utils.init(context);
        this.f28931b.setTextSize(Utils.convertDpToPixel(14.0f));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        double d14 = (((double) this.f28932c) * ((((double) width) * 46.0d) / 100.0d)) / 60.0d;
        float f14 = (width / 2) + (this.f28935f == 0 ? ((int) d14) * (-1) : (int) d14);
        float f15 = height;
        canvas.drawLine(f14, 0.0f, f14, f15, this.f28930a);
        int i14 = this.f28932c;
        String str = String.format(i14 > 0 ? "+%d %s" : "%d %s", Integer.valueOf(i14), this.f28933d);
        Paint paint = this.f28931b;
        int length = str.length();
        Rect rect = this.f28934e;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, f14, (rect.height() / 2.0f) + f15 + rect.height(), this.f28931b);
    }

    public CenterOffsetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28934e = new Rect();
        this.f28935f = 0;
        setupOffsetMarkerPaint(context);
    }

    public CenterOffsetView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f28934e = new Rect();
        this.f28935f = 0;
        setupOffsetMarkerPaint(context);
    }

    public CenterOffsetView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14);
        this.f28934e = new Rect();
        this.f28935f = 0;
        setupOffsetMarkerPaint(context);
    }
}
