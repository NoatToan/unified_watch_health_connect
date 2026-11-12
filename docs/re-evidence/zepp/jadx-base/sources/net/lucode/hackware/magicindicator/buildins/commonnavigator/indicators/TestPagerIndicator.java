package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import java.util.List;
import net.lucode.hackware.magicindicator.FragmentContainerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* JADX INFO: loaded from: classes23.dex */
public class TestPagerIndicator extends View implements IPagerIndicator {
    private Paint a;
    private int b;
    private int c;
    private RectF d;
    private RectF e;
    private List<PositionData> f;

    public TestPagerIndicator(Context context) {
        super(context);
        this.d = new RectF();
        this.e = new RectF();
        a(context);
    }

    private void a(Context context) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.b = SupportMenu.CATEGORY_MASK;
        this.c = -16711936;
    }

    public int getInnerRectColor() {
        return this.c;
    }

    public int getOutRectColor() {
        return this.b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.a.setColor(this.b);
        canvas.drawRect(this.d, this.a);
        this.a.setColor(this.c);
        canvas.drawRect(this.e, this.a);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        List<PositionData> list = this.f;
        if (list == null || list.isEmpty()) {
            return;
        }
        PositionData imitativePositionData = FragmentContainerHelper.getImitativePositionData(this.f, i);
        PositionData imitativePositionData2 = FragmentContainerHelper.getImitativePositionData(this.f, i + 1);
        RectF rectF = this.d;
        int i3 = imitativePositionData.mLeft;
        rectF.left = i3 + ((imitativePositionData2.mLeft - i3) * f);
        int i4 = imitativePositionData.mTop;
        rectF.top = i4 + ((imitativePositionData2.mTop - i4) * f);
        int i5 = imitativePositionData.mRight;
        rectF.right = i5 + ((imitativePositionData2.mRight - i5) * f);
        int i6 = imitativePositionData.mBottom;
        rectF.bottom = i6 + ((imitativePositionData2.mBottom - i6) * f);
        RectF rectF2 = this.e;
        int i7 = imitativePositionData.mContentLeft;
        rectF2.left = i7 + ((imitativePositionData2.mContentLeft - i7) * f);
        int i8 = imitativePositionData.mContentTop;
        rectF2.top = i8 + ((imitativePositionData2.mContentTop - i8) * f);
        int i9 = imitativePositionData.mContentRight;
        rectF2.right = i9 + ((imitativePositionData2.mContentRight - i9) * f);
        int i10 = imitativePositionData.mContentBottom;
        rectF2.bottom = i10 + ((imitativePositionData2.mContentBottom - i10) * f);
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPageSelected(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
    public void onPositionDataProvide(List<PositionData> list) {
        this.f = list;
    }

    public void setInnerRectColor(int i) {
        this.c = i;
    }

    public void setOutRectColor(int i) {
        this.b = i;
    }
}
