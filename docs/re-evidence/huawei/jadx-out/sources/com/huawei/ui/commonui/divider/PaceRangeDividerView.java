package com.huawei.ui.commonui.divider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes43.dex */
public class PaceRangeDividerView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f23494c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private Paint h;
    private RectF i;
    private int j;
    private int l;
    private int m;

    public PaceRangeDividerView(Context context) {
        this(context, null);
    }

    public PaceRangeDividerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PaceRangeDividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        this.j = iApplyDimension;
        this.g = iApplyDimension;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.defaultCornerRadiusS);
        this.f = dimensionPixelSize;
        this.f23492a = dimensionPixelSize + dimensionPixelSize;
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        this.h.setColor(ContextCompat.getColor(context, R.color.listDivider));
        this.h.setStrokeWidth(this.j);
        this.e = LanguageUtil.ba(context);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            LogUtil.j("PaceRangeDividerView", "onDraw Canvas is null");
            return;
        }
        d();
        canvas.save();
        if (this.e) {
            canvas.rotate(180.0f, this.f23493b, this.d);
        }
        this.h.setStyle(Paint.Style.FILL_AND_STROKE);
        h(canvas);
        d(canvas);
        c(canvas);
        b(canvas);
        this.h.setStyle(Paint.Style.STROKE);
        e(canvas);
        a(canvas);
        canvas.restore();
    }

    private void d() {
        this.l = getWidth();
        int height = getHeight();
        this.m = height;
        int i = this.l / 2;
        this.f23493b = i;
        this.d = height / 2;
        int i2 = this.g;
        int i3 = this.f23492a;
        this.i = new RectF(i, i2, i + i3, i2 + i3);
        int i4 = this.f23493b;
        int i5 = this.m;
        int i6 = this.f23492a;
        int i7 = this.g;
        this.f23494c = new RectF(i4, (i5 - i6) - i7, i4 + i6, i5 - i7);
    }

    private void h(Canvas canvas) {
        float f = this.f23493b + this.f;
        float f2 = this.g;
        canvas.drawLine(f, f2, this.l, f2, this.h);
    }

    private void d(Canvas canvas) {
        float f = this.d;
        canvas.drawLine(0.0f, f, this.f23493b, f, this.h);
    }

    private void c(Canvas canvas) {
        float f = this.f23493b;
        int i = this.f;
        int i2 = this.g;
        canvas.drawLine(f, i + i2, f, (this.m - i) - i2, this.h);
    }

    private void b(Canvas canvas) {
        float f = this.f23493b + this.f;
        float f2 = this.m - this.g;
        canvas.drawLine(f, f2, this.l, f2, this.h);
    }

    private void e(Canvas canvas) {
        canvas.drawArc(this.i, 180.0f, 90.0f, false, this.h);
    }

    private void a(Canvas canvas) {
        canvas.drawArc(this.f23494c, 90.0f, 90.0f, false, this.h);
    }
}
