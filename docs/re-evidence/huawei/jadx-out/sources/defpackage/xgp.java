package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.huawei.uikit.hwviewpager.R;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;

/* JADX INFO: loaded from: classes20.dex */
public class xgp extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f52894c;
    private HwViewPager d;
    private Paint e;
    private int f;
    private int h;
    private int i;
    private int j;

    public xgp(int i, HwViewPager hwViewPager) {
        this.d = hwViewPager;
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(i);
        this.e.setMaskFilter(new BlurMaskFilter(107.0f, BlurMaskFilter.Blur.NORMAL));
        this.e.setAntiAlias(true);
        Context context = hwViewPager.getContext();
        if (context != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.hwviewpager_shadow_width);
            this.h = dimensionPixelSize;
            this.f = dimensionPixelSize / 2;
        }
        this.f52894c = Bitmap.createBitmap(this.h, this.d.getHeight(), Bitmap.Config.RGB_565);
        this.i = this.d.getTop();
        this.j = this.d.getBottom();
    }

    private void d(Canvas canvas, int i) {
        canvas.clipRect(i, this.i, canvas.getWidth() - this.f52892a, this.j);
        canvas.drawBitmap(this.f52894c, (canvas.getWidth() - this.f52892a) - this.f, this.i, this.e);
    }

    private void e(Canvas canvas, int i) {
        canvas.clipRect(this.f52892a, this.i, i, this.j);
        canvas.drawBitmap(this.f52894c, this.f52892a - this.f, this.i, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        HwPagerAdapter adapter = this.d.getAdapter();
        if (adapter == null) {
            return;
        }
        if (this.d.isSupportLoop() || this.f52893b != adapter.getCount() - 1) {
            if (!this.d.getReverseDrawingOrder()) {
                if (this.d.isRtlLayout()) {
                    e(canvas, this.f52892a - 300);
                    return;
                } else {
                    d(canvas, (canvas.getWidth() - this.f52892a) + 300);
                    return;
                }
            }
            if (this.f52892a > 0) {
                if (this.d.isRtlLayout()) {
                    e(canvas, this.f52892a + 300);
                } else {
                    d(canvas, (canvas.getWidth() - this.f52892a) - 300);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f52894c = Bitmap.createBitmap(this.h, this.d.getHeight(), Bitmap.Config.RGB_565);
        this.i = this.d.getTop();
        this.j = this.d.getBottom();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public void b(int i, int i2) {
        this.f52893b = i;
        if (this.d.getReverseDrawingOrder() && i2 < 0) {
            this.f52892a = this.d.getWidth() + i2;
        } else {
            this.f52892a = i2;
        }
        invalidateSelf();
    }
}
