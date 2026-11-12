package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* JADX INFO: loaded from: classes23.dex */
public class TriangularPagerIndicator extends View implements IPagerIndicator {
    private List<PositionData> a;
    private Paint b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private float h;
    private Path i;
    private Interpolator j;
    private float k;

    public TriangularPagerIndicator(Context context) {
        super(context);
        this.i = new Path();
        this.j = new LinearInterpolator();
        a(context);
    }

    private void a(Context context) {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = UIUtil.dip2px(context, 3.0d);
        this.f = UIUtil.dip2px(context, 14.0d);
        this.e = UIUtil.dip2px(context, 8.0d);
    }

    public int getLineColor() {
        return this.d;
    }

    public int getLineHeight() {
        return this.c;
    }

    public Interpolator getStartInterpolator() {
        return this.j;
    }

    public int getTriangleHeight() {
        return this.e;
    }

    public int getTriangleWidth() {
        return this.f;
    }

    public float getYOffset() {
        return this.h;
    }

    public boolean isReverse() {
        return this.g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.b.setColor(this.d);
        if (this.g) {
            canvas.drawRect(0.0f, (getHeight() - this.h) - this.e, getWidth(), ((getHeight() - this.h) - this.e) + this.c, this.b);
        } else {
            canvas.drawRect(0.0f, (getHeight() - this.c) - this.h, getWidth(), getHeight() - this.h, this.b);
        }
        this.i.reset();
        if (this.g) {
            this.i.moveTo(this.k - (this.f / 2), (getHeight() - this.h) - this.e);
            this.i.lineTo(this.k, getHeight() - this.h);
            this.i.lineTo(this.k + (this.f / 2), (getHeight() - this.h) - this.e);
        } else {
            this.i.moveTo(this.k - (this.f / 2), getHeight() - this.h);
            this.i.lineTo(this.k, (getHeight() - this.e) - this.h);
            this.i.lineTo(this.k + (this.f / 2), getHeight() - this.h);
        }
        this.i.close();
        canvas.drawPath(this.i, this.b);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List<PositionData> list = this.a;
        if (list == null || list.isEmpty()) {
            return;
        }
        PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.a, i);
        PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.a, i + 1);
        int i3 = imitativePositionData.mLeft;
        float f2 = i3 + ((imitativePositionData.mRight - i3) / 2);
        int i4 = imitativePositionData2.mLeft;
        this.k = f2 + (((i4 + ((imitativePositionData2.mRight - i4) / 2)) - f2) * this.j.getInterpolation(f));
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.a = list;
    }

    public void setLineColor(int i) {
        this.d = i;
    }

    public void setLineHeight(int i) {
        this.c = i;
    }

    public void setReverse(boolean z) {
        this.g = z;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.j = interpolator;
        if (interpolator == null) {
            this.j = new LinearInterpolator();
        }
    }

    public void setTriangleHeight(int i) {
        this.e = i;
    }

    public void setTriangleWidth(int i) {
        this.f = i;
    }

    public void setYOffset(float f) {
        this.h = f;
    }
}
