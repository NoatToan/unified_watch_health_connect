package com.huawei.pluginachievement.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import defpackage.ozj;
import defpackage.paq;
import defpackage.pbn;
import defpackage.qrs;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes41.dex */
public class LevelProgress extends View {
    private float ab;
    private int f;
    private Context g;
    private int h;
    private RectF i;
    private int j;
    private Paint k;
    private Paint l;
    private OnDownActionListener m;
    private int n;
    private Paint o;
    private double p;
    private Paint q;
    private int r;
    private int s;
    private Paint t;
    private Rect u;
    private Paint v;
    private String w;
    private float x;
    private float y;
    private static final Integer[] d = {Integer.valueOf(R.mipmap.level_dot_on_huo), Integer.valueOf(R.mipmap.level_dot_on_zi), Integer.valueOf(R.mipmap.level_dot_on_neng), Integer.valueOf(R.mipmap.level_dot_on_wang), Integer.valueOf(R.mipmap.level_dot_on_quan), Integer.valueOf(R.mipmap.level_dot_on_chuan), Integer.valueOf(R.mipmap.level_dot_on_wang)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Integer[] f22300c = {Integer.valueOf(R.mipmap.level_dot_real_huo), Integer.valueOf(R.mipmap.level_dot_real_zi), Integer.valueOf(R.mipmap.level_dot_real_neng), Integer.valueOf(R.mipmap.level_dot_real_wang), Integer.valueOf(R.mipmap.level_dot_real_quan), Integer.valueOf(R.mipmap.level_dot_real_chuan), Integer.valueOf(R.mipmap.level_dot_real_wang)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Integer[] f22298a = {Integer.valueOf(R.mipmap.level_rocket_huo), Integer.valueOf(R.mipmap.level_rocket_zi), Integer.valueOf(R.mipmap.level_rocket_neng), Integer.valueOf(R.mipmap.level_rocket_wang), Integer.valueOf(R.mipmap.level_rocket_quan), Integer.valueOf(R.mipmap.level_rocket_chuan), Integer.valueOf(R.mipmap.level_rocket_wang)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Integer[] f22299b = {Integer.valueOf(R.color.level_progress_huo_color), Integer.valueOf(R.color.level_progress_zi_color), Integer.valueOf(R.color.level_progress_neng_color), Integer.valueOf(R.color.level_progress_wang_color), Integer.valueOf(R.color.level_progress_quan_color), Integer.valueOf(R.color.level_progress_chuan_color), Integer.valueOf(R.color.level_progress_dian_color)};
    private static final Integer[] e = {Integer.valueOf(R.color.level_mask_huo_color), Integer.valueOf(R.color.level_mask_zi_color), Integer.valueOf(R.color.level_mask_neng_color), Integer.valueOf(R.color.level_mask_wang_color), Integer.valueOf(R.color.level_mask_quan_color), Integer.valueOf(R.color.level_mask_chuan_color), Integer.valueOf(R.color.level_mask_dian_color)};

    public interface OnDownActionListener {
        void onDown(int i, int i2);
    }

    private boolean d(int i, int i2, int i3, int i4) {
        return i == i2 || i == i3 || i == i4;
    }

    public LevelProgress(Context context) {
        this(context, null);
    }

    public LevelProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LevelProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = 0;
        this.m = null;
        this.g = context;
        c();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.h = View.MeasureSpec.getSize(i) / 2;
        this.f = qrs.d(this.g, 650.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = i / 2;
        this.f = qrs.d(this.g, 650.0f);
        float fD = qrs.d(this.g, 650.0f);
        this.ab = fD;
        float f = this.h;
        float f2 = this.f;
        this.i = new RectF(f - fD, f2 - fD, f + fD, f2 + fD);
    }

    private void h(Canvas canvas) {
        canvas.drawArc(this.i, 109.2f, -177.09999f, false, this.q);
    }

    private void a(Canvas canvas) {
        for (int i = 0; i < paq.g(this.s); i++) {
            this.k.setColor(this.g.getResources().getColor(f22299b[i].intValue()));
            if (this.j == paq.g(this.s) - 1 && i == paq.g(this.s) - 1) {
                c(canvas, i);
            } else if (i < paq.g(this.s)) {
                d(canvas, i);
            }
        }
    }

    private void c(Canvas canvas, int i) {
        if (this.r != 0) {
            e(canvas, i);
        }
    }

    private void d(Canvas canvas, int i) {
        float f = (float) this.p;
        int i2 = this.s;
        if (i2 == 20) {
            f = 2.0f;
        }
        if (i != paq.g(i2) - 1) {
            canvas.drawArc(this.i, 101.5f - ((i * 3) * 7.7f), -23.099998f, false, this.k);
            return;
        }
        int i3 = i * 3;
        canvas.drawArc(this.i, 101.5f - (i3 * 7.7f), -((((this.s - 1) - i3) * 7.7f) + (f * 7.7f)), false, this.k);
    }

    private void c(Canvas canvas) {
        if (this.j == paq.g(this.s) - 1 && this.r == 0) {
            this.k.setColor(this.g.getResources().getColor(f22299b[paq.g(this.s) - 1].intValue()));
            e(canvas, paq.g(this.s) - 1);
        }
    }

    private void b(Canvas canvas) {
        this.l.setShader(e(15.4f, 1.8499999f, ozj.c()[this.j].intValue(), R.color.common_transparent));
        canvas.drawArc(this.i, 109.2f, -16.4f, false, this.l);
        this.l.setShader(e(-2.85f, -15.4f, R.color.common_transparent, ozj.c()[this.j].intValue()));
        canvas.drawArc(this.i, 87.1f, -15.4f, false, this.l);
    }

    private void e(Canvas canvas) {
        if (this.j == paq.g(this.s) - 1 && this.r == 0) {
            this.l.setShader(e(11.549999f, 3.85f, e[this.j].intValue(), R.color.common_transparent));
            canvas.drawArc(this.i, 101.5f, -7.7f, false, this.l);
        }
    }

    private void e(Canvas canvas, int i) {
        float f = (float) this.p;
        int i2 = this.s;
        if (i2 == 20) {
            f = 2.0f;
        }
        int i3 = i * 3;
        float f2 = (((i2 - 1) - i3) * 7.7f) + (f * 7.7f);
        float f3 = this.x + 1.0f;
        this.x = f3;
        if (f3 <= f2) {
            canvas.drawArc(this.i, 101.5f - (i3 * 7.7f), -f3, false, this.k);
            postInvalidateDelayed(30L);
        } else {
            canvas.drawArc(this.i, 101.5f - (i3 * 7.7f), -f2, false, this.k);
        }
    }

    private void d(Canvas canvas) {
        for (int i = 1; i <= 20; i++) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.g.getResources(), f22300c[paq.g(i) - 1].intValue());
            if (i == 20) {
                a(canvas, 3.85f + ((-i) * 7.7f), b(i), bitmapDecodeResource, i);
            } else {
                a(canvas, 3.85f + ((2 - i) * 7.7f), b(i), bitmapDecodeResource, i);
            }
        }
    }

    private String b(int i) {
        return this.g.getResources().getString(R.string.IDS_plugin_achievement_level_value_string, Integer.valueOf(i));
    }

    private void a(Canvas canvas, float f, String str, Bitmap bitmap, int i) {
        canvas.save();
        canvas.rotate(f, this.h, this.f);
        double d2 = this.h;
        double d3 = this.ab;
        double dCos = Math.cos(Math.toRadians(90.0d));
        double d4 = this.f;
        double d5 = this.ab;
        double dSin = Math.sin(Math.toRadians(90.0d));
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.g.getResources(), R.mipmap.level_dot_off);
        Bitmap bitmapB = i <= this.s ? b(bitmap, i) : bitmapDecodeResource;
        float f2 = (float) (d2 + (d3 * dCos));
        float f3 = (float) (d4 + (d5 * dSin));
        canvas.drawBitmap(bitmapB, f2 - (bitmapB.getHeight() / 2.0f), f3 - (bitmapB.getHeight() / 2.0f), this.o);
        setTextPaintColor(i);
        canvas.drawText(str, f2 - (this.v.measureText(str) / 2.0f), (f3 - bitmapDecodeResource.getHeight()) - 10.0f, this.v);
        canvas.restore();
        if (!bitmapB.isRecycled()) {
            bitmapB.recycle();
        }
        if (bitmapDecodeResource.isRecycled()) {
            return;
        }
        bitmapDecodeResource.recycle();
    }

    private void setTextPaintColor(int i) {
        this.v.setColor(this.g.getResources().getColor(R.color.level_progress_black_30alpha));
        int iJ = paq.j(this.j + 1);
        if (d(i, iJ, iJ + 1, iJ + 2)) {
            this.v.setColor(this.g.getResources().getColor(R.color.level_progress_black_60alpha));
        }
    }

    private Bitmap b(Bitmap bitmap, int i) {
        int i2 = this.s;
        if (i2 == i) {
            int iG = paq.g(i2);
            Integer[] numArr = d;
            if (iG <= numArr.length) {
                return BitmapFactory.decodeResource(this.g.getResources(), numArr[iG - 1].intValue());
            }
        }
        return bitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            LogUtil.e("LevelProgress", "canvas is null");
            return;
        }
        super.onDraw(canvas);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.save();
        canvas.rotate(this.y, this.h, this.f);
        h(canvas);
        a(canvas);
        canvas.restore();
        b(canvas);
        canvas.save();
        canvas.rotate(this.y, this.h, this.f);
        c(canvas);
        canvas.restore();
        e(canvas);
        canvas.save();
        canvas.rotate(this.y, this.h, this.f);
        d(canvas);
        canvas.restore();
        if ("1".equals(this.w)) {
            canvas.save();
            canvas.rotate(this.y, this.h, this.f);
            g(canvas);
            canvas.restore();
            Rect rocketRect = getRocketRect();
            this.u = rocketRect;
            canvas.drawRect(rocketRect, this.t);
        }
    }

    private Rect getRocketRect() {
        int i = this.s % 3;
        int iCos = (int) (((double) this.h) + (((double) this.ab) * Math.cos(Math.toRadians(101.55f - ((((i != 0 ? i : 3) - 1) * 7.7f) + (((float) this.p) * 7.7f))))));
        return new Rect(iCos - 50, 0, iCos, getHeight());
    }

    private void g(Canvas canvas) {
        float fG;
        float f = (float) this.p;
        int i = this.s;
        if (i == 20) {
            f = 2.0f;
        }
        float fG2 = (((i - 1) - ((paq.g(i) - 1) * 3)) * 7.7f) + (f * 7.7f);
        if (this.x <= fG2) {
            fG = ((1 - ((paq.g(this.s) - 1) * 3)) * 7.7f) + 3.85f;
            fG2 = this.x;
        } else {
            fG = ((1 - ((paq.g(this.s) - 1) * 3)) * 7.7f) + 3.85f;
        }
        canvas.save();
        canvas.rotate(fG - fG2, this.h, this.f);
        double d2 = this.h;
        double d3 = this.ab;
        double dCos = Math.cos(Math.toRadians(90.0d));
        double d4 = this.f;
        double d5 = this.ab;
        double dSin = Math.sin(Math.toRadians(90.0d));
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.g.getResources(), f22298a[paq.g(this.s) - 1].intValue());
        canvas.drawBitmap(bitmapDecodeResource, (((float) (d2 + (d3 * dCos))) - bitmapDecodeResource.getWidth()) + 6.0f, ((float) (d4 + (d5 * dSin))) - (bitmapDecodeResource.getHeight() / 2.0f), this.o);
        canvas.restore();
    }

    public void d(int i, double d2, int i2) {
        this.s = i;
        this.p = d2;
        this.j = i2;
        LogUtil.a("LevelProgress", "refreshProgress mCurrentPage ", Integer.valueOf(i2));
        invalidate();
    }

    public void setRotate(float f, int i, int i2, int i3, double d2) {
        int i4;
        this.s = i3;
        this.p = d2;
        this.j = i2;
        this.r = i;
        LogUtil.a("LevelProgress", "setRotate newState ", Integer.valueOf(i), " mCurrentPage ", Integer.valueOf(i2));
        float fG = (f * 23.099998f) / (pbn.g(this.g) / 2.0f);
        if (fG == 0.0f && (i4 = this.n) == 0) {
            this.y += this.j * 7.7f * 3.0f;
            this.n = i4 + 1;
        } else {
            this.y += fG;
        }
        invalidate();
    }

    private void c() {
        LogUtil.a("LevelProgress", "initPaint");
        Paint paint = new Paint();
        this.k = paint;
        paint.setAntiAlias(true);
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(6.0f);
        Paint paint2 = new Paint();
        this.l = paint2;
        paint2.setAntiAlias(true);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth(7.0f);
        this.l.setColor(this.g.getResources().getColor(R.color.common_color_white));
        Paint paint3 = new Paint();
        this.o = paint3;
        paint3.setAntiAlias(true);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(1.0f);
        Paint paint4 = new Paint();
        this.q = paint4;
        paint4.setAntiAlias(true);
        this.q.setStyle(Paint.Style.STROKE);
        this.q.setStrokeWidth(5.5f);
        this.q.setColor(this.g.getResources().getColor(R.color.common_color_white));
        Paint paint5 = new Paint();
        this.v = paint5;
        paint5.setAntiAlias(true);
        this.v.setTextSize(this.g.getResources().getDimension(R.dimen.textSizeCaption));
        this.v.setColor(this.g.getResources().getColor(R.color.textColorSecondary));
        this.v.setTextAlign(Paint.Align.LEFT);
        this.v.setTypeface(Typeface.create(this.g.getResources().getString(R.string.emui_text_font_family_regular), 0));
        Paint paint6 = new Paint();
        this.t = paint6;
        paint6.setAntiAlias(true);
        this.t.setColor(this.g.getResources().getColor(R.color.common_transparent));
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "MAIN_VIP_KEY");
        this.w = strE;
        LogUtil.a("LevelProgress", "initPaint vip status = :", strE);
    }

    private LinearGradient e(float f, float f2, int i, int i2) {
        double d2 = f + 90.0f;
        double d3 = f2 + 90.0f;
        return new LinearGradient((float) (((double) this.h) + (((double) this.ab) * Math.cos(Math.toRadians(d2)))), (float) (((double) this.f) + (((double) this.ab) * Math.sin(Math.toRadians(d2)))), (float) (((double) this.h) + (((double) this.ab) * Math.cos(Math.toRadians(d3)))), (float) ((((double) this.ab) * Math.sin(Math.toRadians(d3))) + ((double) this.f)), this.g.getResources().getColor(i), this.g.getResources().getColor(i2), Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void e(MotionEvent motionEvent) {
        Rect rect;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.m == null || (rect = this.u) == null || !rect.contains(x, y) || this.j != paq.g(this.s) - 1) {
            return;
        }
        this.m.onDown((int) motionEvent.getRawX(), y);
    }

    public void setOnDownActionListener(OnDownActionListener onDownActionListener) {
        this.m = onDownActionListener;
    }
}
