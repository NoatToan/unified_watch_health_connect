package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Arrays;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.ArgbEvaluatorHolder;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* JADX INFO: loaded from: classes23.dex */
public class BezierPagerIndicator extends View implements IPagerIndicator {
    private List<PositionData> a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private Paint i;
    private Path j;
    private List<Integer> k;
    private Interpolator l;
    private Interpolator m;

    public BezierPagerIndicator(Context context) {
        super(context);
        this.j = new Path();
        this.l = new AccelerateInterpolator();
        this.m = new DecelerateInterpolator();
        b(context);
    }

    private void a(Canvas canvas) {
        this.j.reset();
        float height = (getHeight() - this.f) - this.g;
        this.j.moveTo(this.e, height);
        this.j.lineTo(this.e, height - this.d);
        Path path = this.j;
        float f = this.e;
        float f2 = this.c;
        path.quadTo(f + ((f2 - f) / 2.0f), height, f2, height - this.b);
        this.j.lineTo(this.c, this.b + height);
        Path path2 = this.j;
        float f3 = this.e;
        path2.quadTo(((this.c - f3) / 2.0f) + f3, height, f3, this.d + height);
        this.j.close();
        canvas.drawPath(this.j, this.i);
    }

    private void b(Context context) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.g = UIUtil.dip2px(context, 3.5d);
        this.h = UIUtil.dip2px(context, 2.0d);
        this.f = UIUtil.dip2px(context, 1.5d);
    }

    public float getMaxCircleRadius() {
        return this.g;
    }

    public float getMinCircleRadius() {
        return this.h;
    }

    public float getYOffset() {
        return this.f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(this.c, (getHeight() - this.f) - this.g, this.b, this.i);
        canvas.drawCircle(this.e, (getHeight() - this.f) - this.g, this.d, this.i);
        a(canvas);
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
        List<Integer> list2 = this.k;
        if (list2 != null && list2.size() > 0) {
            this.i.setColor(ArgbEvaluatorHolder.eval(f, this.k.get(Math.abs(i) % this.k.size()).intValue(), this.k.get(Math.abs(i + 1) % this.k.size()).intValue()));
        }
        PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.a, i);
        PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.a, i + 1);
        int i3 = imitativePositionData.mLeft;
        float f2 = i3 + ((imitativePositionData.mRight - i3) / 2);
        int i4 = imitativePositionData2.mLeft;
        float f3 = (i4 + ((imitativePositionData2.mRight - i4) / 2)) - f2;
        this.c = (this.l.getInterpolation(f) * f3) + f2;
        this.e = f2 + (f3 * this.m.getInterpolation(f));
        float f4 = this.g;
        this.b = f4 + ((this.h - f4) * this.m.getInterpolation(f));
        float f5 = this.h;
        this.d = f5 + ((this.g - f5) * this.l.getInterpolation(f));
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.a = list;
    }

    public void setColors(Integer... numArr) {
        this.k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.m = interpolator;
        if (interpolator == null) {
            this.m = new DecelerateInterpolator();
        }
    }

    public void setMaxCircleRadius(float f) {
        this.g = f;
    }

    public void setMinCircleRadius(float f) {
        this.h = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.l = interpolator;
        if (interpolator == null) {
            this.l = new AccelerateInterpolator();
        }
    }

    public void setYOffset(float f) {
        this.f = f;
    }
}
