package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.ArgbEvaluatorHolder;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* JADX INFO: loaded from: classes23.dex */
public class LinePagerIndicator extends View implements IPagerIndicator {
    public static final int MODE_EXACTLY = 2;
    public static final int MODE_MATCH_EDGE = 0;
    public static final int MODE_WRAP_CONTENT = 1;
    private int a;
    private Interpolator b;
    private Interpolator c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private Paint i;
    private List<PositionData> j;
    private List<Integer> k;
    private RectF l;

    public LinePagerIndicator(Context context) {
        super(context);
        this.b = new LinearInterpolator();
        this.c = new LinearInterpolator();
        this.l = new RectF();
        a(context);
    }

    private void a(Context context) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.e = UIUtil.dip2px(context, 3.0d);
        this.g = UIUtil.dip2px(context, 10.0d);
    }

    public List<Integer> getColors() {
        return this.k;
    }

    public Interpolator getEndInterpolator() {
        return this.c;
    }

    public float getLineHeight() {
        return this.e;
    }

    public float getLineWidth() {
        return this.g;
    }

    public int getMode() {
        return this.a;
    }

    public Paint getPaint() {
        return this.i;
    }

    public float getRoundRadius() {
        return this.h;
    }

    public Interpolator getStartInterpolator() {
        return this.b;
    }

    public float getXOffset() {
        return this.f;
    }

    public float getYOffset() {
        return this.d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.l;
        float f = this.h;
        canvas.drawRoundRect(rectF, f, f, this.i);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        float fWidth;
        float fWidth2;
        float fWidth3;
        float f2;
        float f3;
        int i3;
        List<PositionData> list = this.j;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Integer> list2 = this.k;
        if (list2 != null && list2.size() > 0) {
            this.i.setColor(ArgbEvaluatorHolder.eval(f, this.k.get(Math.abs(i) % this.k.size()).intValue(), this.k.get(Math.abs(i + 1) % this.k.size()).intValue()));
        }
        PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.j, i);
        PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.j, i + 1);
        int i4 = this.a;
        if (i4 != 0) {
            if (i4 == 1) {
                float f4 = imitativePositionData.mContentLeft;
                f3 = this.f;
                fWidth = f4 + f3;
                f2 = imitativePositionData2.mContentLeft + f3;
                fWidth2 = imitativePositionData.mContentRight - f3;
                i3 = imitativePositionData2.mContentRight;
            } else {
                fWidth = imitativePositionData.mLeft + ((imitativePositionData.width() - this.g) / 2.0f);
                float fWidth4 = imitativePositionData2.mLeft + ((imitativePositionData2.width() - this.g) / 2.0f);
                fWidth2 = ((imitativePositionData.width() + this.g) / 2.0f) + imitativePositionData.mLeft;
                fWidth3 = ((imitativePositionData2.width() + this.g) / 2.0f) + imitativePositionData2.mLeft;
                f2 = fWidth4;
            }
            this.l.left = fWidth + ((f2 - fWidth) * this.b.getInterpolation(f));
            this.l.right = fWidth2 + ((fWidth3 - fWidth2) * this.c.getInterpolation(f));
            this.l.top = (getHeight() - this.e) - this.d;
            this.l.bottom = getHeight() - this.d;
            invalidate();
        }
        float f5 = imitativePositionData.mLeft;
        f3 = this.f;
        fWidth = f5 + f3;
        f2 = imitativePositionData2.mLeft + f3;
        fWidth2 = imitativePositionData.mRight - f3;
        i3 = imitativePositionData2.mRight;
        fWidth3 = i3 - f3;
        this.l.left = fWidth + ((f2 - fWidth) * this.b.getInterpolation(f));
        this.l.right = fWidth2 + ((fWidth3 - fWidth2) * this.c.getInterpolation(f));
        this.l.top = (getHeight() - this.e) - this.d;
        this.l.bottom = getHeight() - this.d;
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.j = list;
    }

    public void setColors(Integer... numArr) {
        this.k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.c = interpolator;
        if (interpolator == null) {
            this.c = new LinearInterpolator();
        }
    }

    public void setLineHeight(float f) {
        this.e = f;
    }

    public void setLineWidth(float f) {
        this.g = f;
    }

    public void setMode(int i) {
        if (i == 2 || i == 0 || i == 1) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("mode " + i + " not supported.");
    }

    public void setRoundRadius(float f) {
        this.h = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.b = interpolator;
        if (interpolator == null) {
            this.b = new LinearInterpolator();
        }
    }

    public void setXOffset(float f) {
        this.f = f;
    }

    public void setYOffset(float f) {
        this.d = f;
    }
}
