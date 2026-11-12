package com.huawei.ui.main.stories.userprofile.scroll;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class PersonalLevelProgress extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f29071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f29072c;
    private Paint e;
    private float f;
    private double g;
    private Bitmap h;
    private Paint i;
    private int j;
    private int k;
    private float m;
    private static final int d = R.color.personal_level_progress_color;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f29070a = R.mipmap.ic_me_level_point;

    public PersonalLevelProgress(Context context) {
        this(context, null);
    }

    public PersonalLevelProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PersonalLevelProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = 1;
        this.g = 0.0d;
        this.f29072c = context;
        this.f = context.getResources().getDimension(R.dimen.health_common_2dp);
        this.m = this.f29072c.getResources().getDimension(R.dimen.health_common_2dp);
        d();
    }

    public void e(int i, double d2) {
        if (this.j == i && d2 == this.g) {
            LogUtil.j("PersonalLevelProgress", "refreshProgress no need to refresh");
            return;
        }
        this.j = i;
        this.g = d2;
        this.h = getAchieveBitmap();
        invalidate();
    }

    private void d() {
        LogUtil.a("PersonalLevelProgress", "initPaint");
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setColor(this.f29072c.getResources().getColor(d));
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setColor(this.f29072c.getResources().getColor(R.color.personal_level_progress_bg_color));
        Paint paint3 = new Paint();
        this.f29071b = paint3;
        paint3.setAntiAlias(true);
        this.f29071b.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.k = getMeasuredWidth();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            LogUtil.e("PersonalLevelProgress", "canvas is null");
            return;
        }
        super.onDraw(canvas);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        if (this.h == null) {
            this.h = getAchieveBitmap();
        }
        c(canvas);
    }

    private void c(Canvas canvas) {
        float f;
        float width;
        float height = (this.h.getHeight() / 2.0f) - (this.f / 2.0f);
        float width2 = this.k;
        float height2 = (this.h.getHeight() / 2.0f) + (this.f / 2.0f);
        float f2 = (int) (((double) this.k) * this.g);
        if (f2 <= this.h.getWidth() / 2.0f) {
            f = width2;
            width = (this.h.getWidth() / 2.0f) - f2;
        } else {
            if (f2 >= this.k - (this.h.getWidth() / 2.0f)) {
                width2 = ((this.k * 2) - (this.h.getWidth() / 2.0f)) - f2;
            }
            f = width2;
            width = 0.0f;
        }
        if (LanguageUtil.ba(this.f29072c)) {
            a(canvas, width, height, f, height2);
        } else {
            c(canvas, width, height, f, height2);
        }
    }

    private void c(Canvas canvas, float f, float f2, float f3, float f4) {
        int i = (int) (((double) this.k) * this.g);
        float f5 = this.m;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.e);
        float fMax = Math.max(Math.min(this.k - (this.h.getWidth() / 2.0f), i), f);
        float f6 = this.m;
        canvas.drawRoundRect(f, f2, fMax, f4, f6, f6, this.i);
        b(canvas, i, false);
    }

    private void a(Canvas canvas, float f, float f2, float f3, float f4) {
        int i = this.k;
        int i2 = (int) (((double) i) * this.g);
        float f5 = i;
        float f6 = this.m;
        canvas.drawRoundRect(f5 - f, f2, f5 - f3, f4, f6, f6, this.e);
        float fMin = Math.min(this.k - (this.h.getWidth() / 2.0f), i2);
        float f7 = this.k;
        float fMax = Math.max(fMin, f);
        float f8 = this.m;
        canvas.drawRoundRect(f7 - f, f2, f7 - fMax, f4, f8, f8, this.i);
        b(canvas, i2, true);
    }

    private void b(Canvas canvas, int i, boolean z) {
        float width;
        float f = i;
        if (f <= this.h.getWidth() / 2.0f) {
            width = 0.0f;
        } else if (f >= this.k - (this.h.getWidth() / 2.0f)) {
            width = this.k - this.h.getWidth();
        } else {
            width = f - (this.h.getWidth() / 2.0f);
        }
        if (z) {
            Bitmap bitmap = this.h;
            canvas.drawBitmap(bitmap, (this.k - width) - bitmap.getWidth(), 0.0f, this.f29071b);
        } else {
            canvas.drawBitmap(this.h, width, 0.0f, this.f29071b);
        }
    }

    private Bitmap getAchieveBitmap() {
        return BitmapFactory.decodeResource(this.f29072c.getResources(), f29070a);
    }
}
