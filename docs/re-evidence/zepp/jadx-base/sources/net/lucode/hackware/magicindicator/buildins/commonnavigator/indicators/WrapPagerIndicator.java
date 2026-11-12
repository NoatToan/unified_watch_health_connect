package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* JADX INFO: loaded from: classes23.dex */
public class WrapPagerIndicator extends View implements IPagerIndicator {
    private int a;
    private int b;
    private int c;
    private float d;
    private Interpolator e;
    private Interpolator f;
    private List<PositionData> g;
    private Paint h;
    private RectF i;
    private boolean j;

    public WrapPagerIndicator(Context context) {
        super(context);
        this.e = new LinearInterpolator();
        this.f = new LinearInterpolator();
        this.i = new RectF();
        a(context);
    }

    private void a(Context context) {
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.FILL);
        this.a = UIUtil.dip2px(context, 6.0d);
        this.b = UIUtil.dip2px(context, 10.0d);
    }

    public Interpolator getEndInterpolator() {
        return this.f;
    }

    public int getFillColor() {
        return this.c;
    }

    public int getHorizontalPadding() {
        return this.b;
    }

    public Paint getPaint() {
        return this.h;
    }

    public float getRoundRadius() {
        return this.d;
    }

    public Interpolator getStartInterpolator() {
        return this.e;
    }

    public int getVerticalPadding() {
        return this.a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.h.setColor(this.c);
        RectF rectF = this.i;
        float f = this.d;
        canvas.drawRoundRect(rectF, f, f, this.h);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List<PositionData> list = this.g;
        if (list == null || list.isEmpty()) {
            return;
        }
        PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.g, i);
        PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.g, i + 1);
        RectF rectF = this.i;
        int i3 = imitativePositionData.mContentLeft;
        rectF.left = (i3 - this.b) + ((imitativePositionData2.mContentLeft - i3) * this.f.getInterpolation(f));
        RectF rectF2 = this.i;
        rectF2.top = imitativePositionData.mContentTop - this.a;
        int i4 = imitativePositionData.mContentRight;
        rectF2.right = this.b + i4 + ((imitativePositionData2.mContentRight - i4) * this.e.getInterpolation(f));
        RectF rectF3 = this.i;
        rectF3.bottom = imitativePositionData.mContentBottom + this.a;
        if (!this.j) {
            this.d = rectF3.height() / 2.0f;
        }
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.g = list;
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f = interpolator;
        if (interpolator == null) {
            this.f = new LinearInterpolator();
        }
    }

    public void setFillColor(int i) {
        this.c = i;
    }

    public void setHorizontalPadding(int i) {
        this.b = i;
    }

    public void setRoundRadius(float f) {
        this.d = f;
        this.j = true;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.e = interpolator;
        if (interpolator == null) {
            this.e = new LinearInterpolator();
        }
    }

    public void setVerticalPadding(int i) {
        this.a = i;
    }
}
