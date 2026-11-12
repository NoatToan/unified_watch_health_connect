package com.huami.watch.dataflow.chart;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import com.huami.watch.companionlib.R;
import com.huami.watch.dataflow.chart.base.PieChart;
import com.huami.watch.dataflow.chart.util.ChartUtil;

/* JADX INFO: loaded from: classes16.dex */
public class LinePieChart extends PieChart {
    private static final String r = "LinePieChart";
    private static final float s = 1.33f;
    private static final float t = 16.33f;
    private final int a;
    private int b;
    private final Paint c;
    private SweepGradient d;
    private boolean e;
    private int f;
    private Bitmap g;
    private Bitmap h;
    private Paint i;
    private Paint j;
    private float k;
    private Paint l;
    private Paint m;
    private RectF n;
    private boolean o;
    private int p;
    private int q;

    public LinePieChart(Context context) {
        super(context);
        this.b = 0;
        this.q = 1000;
        this.g = ((BitmapDrawable) context.getResources().getDrawable(R.drawable.ic_small_mili)).getBitmap();
        this.i = new Paint(1);
        this.j = new Paint(1);
        this.i.setColor(Color.parseColor("#e8edf3"));
        this.i.setStrokeWidth(this.mDensity * s);
        this.i.setStyle(Paint.Style.STROKE);
        this.j.setColor(Color.parseColor("#33e8edf3"));
        this.j.setStrokeWidth(this.mDensity * s);
        this.j.setStyle(Paint.Style.STROKE);
        this.k = this.mDensity * t;
        Paint paint = new Paint(1);
        this.l = paint;
        paint.setColor(Color.parseColor("#4Cffffff"));
        this.l.setStrokeWidth(4.0f);
        this.l.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.m = paint2;
        paint2.setColor(Color.parseColor("#BBffffff"));
        this.m.setStrokeWidth(4.0f);
        this.m.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.c = paint3;
        paint3.setStrokeWidth(4.0f);
        paint3.setStyle(Paint.Style.STROKE);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.draw_weight_icon_round);
    }

    private void a(Canvas canvas, RectF rectF) {
        canvas.drawArc(rectF, -90.0f, (this.p / this.q) * 360.0f, false, this.m);
        canvas.drawArc(rectF, -90.0f, 360.0f, false, this.l);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0200  */
    /* JADX WARN: Code duplicated, block: B:76:0x022c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0231  */
    /* JADX WARN: Code duplicated, block: B:84:0x0257  */
    /* JADX WARN: Code duplicated, block: B:86:0x0261  */
    /* JADX WARN: Code duplicated, block: B:92:0x0291  */
    /* JADX WARN: Code duplicated, block: B:94:0x0298  */
    private void b(Canvas canvas, RectF rectF) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i = this.a;
        canvas.drawRoundRect(rectF, i, i, this.l);
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        Path path = new Path();
        float f12 = (this.p / this.q) * 360.0f;
        float fWidth = rectF.width() / 2.0f;
        float f13 = this.a;
        float f14 = fWidth - f13;
        float fAtan = (float) ((Math.atan(f14 / fWidth) / 6.283185307179586d) * 360.0d);
        double d = fWidth;
        float fTan = (float) (Math.tan(Math.toRadians(f12)) * d);
        path.setLastPoint(fCenterX, rectF.top);
        if (f12 < fAtan) {
            path.rLineTo(fTan, 0.0f);
        } else {
            path.rLineTo(f14, 0.0f);
        }
        RectF rectF2 = new RectF(rectF);
        rectF2.set(fCenterX - f13, fCenterY - f13, fCenterX + f13, fCenterY + f13);
        float f15 = -f14;
        rectF2.offset(f14, f15);
        float f16 = 90.0f - fAtan;
        if (f12 < f16 && f12 >= fAtan) {
            path.addArc(rectF2, -90.0f, ((f12 - fAtan) / (90.0f - (fAtan * 2.0f))) * 90.0f);
        } else if (f12 > f16) {
            path.addArc(rectF2, -90.0f, 90.0f);
        }
        if (f12 >= f16 && f12 < 90.0f) {
            float fTan2 = f14 - (((float) Math.tan(Math.toRadians(90.0f - f12))) * fWidth);
            path.moveTo(fCenterX + fWidth, fCenterY - f14);
            path.rLineTo(0.0f, fTan2);
        } else if (f12 > 90.0f) {
            path.moveTo(fCenterX + fWidth, fCenterY - f14);
            path.rLineTo(0.0f, f14);
        }
        float f17 = fAtan + 90.0f;
        float f18 = 180.0f - fAtan;
        if (f12 <= 90.0f || f12 >= f17) {
            f = 0.0f;
            if (f12 >= f17) {
                path.rLineTo(0.0f, f14);
            }
        } else {
            f = 0.0f;
            path.rLineTo(0.0f, (float) (Math.tan(Math.toRadians(f12 - 90.0f)) * d));
        }
        if (f12 <= f17 || f12 >= f18) {
            f2 = 90.0f;
            if (f12 > f18) {
                rectF2.offset(0.0f, f14 * 2.0f);
                path.addArc(rectF2, 0.0f, 90.0f);
            }
        } else {
            rectF2.offset(f, f14 * 2.0f);
            f2 = 90.0f;
            path.addArc(rectF2, f, (((f12 - 90.0f) - fAtan) / (90.0f - (fAtan * 2.0f))) * 90.0f);
        }
        if (f12 < f18 || f12 >= 180.0f) {
            f3 = 180.0f;
            if (f12 >= 180.0f) {
                path.moveTo(fCenterX + f14, fCenterY + fWidth);
                path.rLineTo(f15, 0.0f);
            }
        } else {
            float fTan3 = f14 - (((float) Math.tan(Math.toRadians(f2 - (f12 - f2)))) * fWidth);
            path.moveTo(fCenterX + f14, fCenterY + fWidth);
            path.rLineTo(-fTan3, 0.0f);
            f3 = 180.0f;
        }
        float f19 = fAtan + f3;
        float f20 = 270.0f - fAtan;
        if (f12 <= f3 || f12 >= f19) {
            f4 = f15;
            f5 = 0.0f;
            if (f12 >= f19) {
                path.rLineTo(f4, 0.0f);
            }
        } else {
            float f21 = f12 - f3;
            f4 = f15;
            f5 = 0.0f;
            path.rLineTo(-((float) (Math.tan(Math.toRadians(f21)) * d)), 0.0f);
        }
        if (f12 < f19 || f12 >= f20) {
            if (f12 > f20) {
                f6 = 90.0f;
                rectF2.offset(f4 * 2.0f, 0.0f);
                path.addArc(rectF2, 90.0f, 90.0f);
            }
            if (f12 >= f20 || f12 >= 270.0f) {
                f7 = 270.0f;
                if (f12 >= 270.0f) {
                    path.moveTo(fCenterX - fWidth, fCenterY + f14);
                    path.rLineTo(0.0f, f4);
                }
            } else {
                float fTan4 = f14 - (((float) Math.tan(Math.toRadians(f6 - (f12 - 180.0f)))) * fWidth);
                path.moveTo(fCenterX - fWidth, fCenterY + f14);
                path.rLineTo(0.0f, -fTan4);
                f7 = 270.0f;
            }
            f8 = fAtan + f7;
            f9 = 360.0f - fAtan;
            if (f12 > f7 || f12 >= f8) {
                f10 = 0.0f;
                if (f12 >= f8) {
                    path.rLineTo(0.0f, f4);
                }
            } else {
                float f22 = -((float) (Math.tan(Math.toRadians(f12 - f7)) * d));
                f10 = 0.0f;
                path.rLineTo(0.0f, f22);
            }
            if (f12 >= f8 || f12 >= f9) {
                f11 = 90.0f;
                if (f12 > f9) {
                    rectF2.offset(0.0f, f4 * 2.0f);
                    path.addArc(rectF2, 180.0f, 90.0f);
                }
            } else {
                rectF2.offset(f10, f4 * 2.0f);
                f11 = 90.0f;
                path.addArc(rectF2, 180.0f, (((f12 - 270.0f) - fAtan) / (90.0f - (fAtan * 2.0f))) * 90.0f);
            }
            if (f12 < f9 && f12 < 360.0f) {
                float fTan5 = f14 - (((float) Math.tan(Math.toRadians(f11 - (f12 - 270.0f)))) * fWidth);
                path.moveTo(fCenterX - f14, fCenterY - fWidth);
                path.rLineTo(fTan5, 0.0f);
            } else if (f12 >= 360.0f) {
                path.moveTo(fCenterX - f14, fCenterY - fWidth);
                path.rLineTo(f14, 0.0f);
            }
            canvas.drawPath(path, this.m);
        }
        rectF2.offset(f4 * 2.0f, f5);
        path.addArc(rectF2, 90.0f, (((f12 - 180.0f) - fAtan) / (90.0f - (fAtan * 2.0f))) * 90.0f);
        f6 = 90.0f;
        if (f12 >= f20) {
            f7 = 270.0f;
            if (f12 >= 270.0f) {
                path.moveTo(fCenterX - fWidth, fCenterY + f14);
                path.rLineTo(0.0f, f4);
            }
        } else {
            f7 = 270.0f;
            if (f12 >= 270.0f) {
                path.moveTo(fCenterX - fWidth, fCenterY + f14);
                path.rLineTo(0.0f, f4);
            }
        }
        f8 = fAtan + f7;
        f9 = 360.0f - fAtan;
        if (f12 > f7) {
            f10 = 0.0f;
            if (f12 >= f8) {
                path.rLineTo(0.0f, f4);
            }
        } else {
            f10 = 0.0f;
            if (f12 >= f8) {
                path.rLineTo(0.0f, f4);
            }
        }
        if (f12 >= f8) {
            f11 = 90.0f;
            if (f12 > f9) {
                rectF2.offset(0.0f, f4 * 2.0f);
                path.addArc(rectF2, 180.0f, 90.0f);
            }
        } else {
            f11 = 90.0f;
            if (f12 > f9) {
                rectF2.offset(0.0f, f4 * 2.0f);
                path.addArc(rectF2, 180.0f, 90.0f);
            }
        }
        if (f12 < f9) {
            if (f12 >= 360.0f) {
                path.moveTo(fCenterX - f14, fCenterY - fWidth);
                path.rLineTo(f14, 0.0f);
            }
        } else if (f12 >= 360.0f) {
            path.moveTo(fCenterX - f14, fCenterY - fWidth);
            path.rLineTo(f14, 0.0f);
        }
        canvas.drawPath(path, this.m);
    }

    public void dismissLoading() {
        Log.i(r, "dismissLoading.");
        this.e = false;
        this.o = false;
    }

    @Override // com.huami.watch.dataflow.chart.base.PieChart
    public void drawPie(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, float f5) {
        float strokeWidth = (f3 - (this.l.getStrokeWidth() / 2.0f)) - this.k;
        RectF rectF2 = new RectF(f - strokeWidth, f2 - strokeWidth, f + strokeWidth, strokeWidth + f2);
        if (!this.o) {
            if (this.e) {
                SweepGradient sweepGradient = new SweepGradient(f, f2, new int[]{1157627903, -1}, (float[]) null);
                this.d = sweepGradient;
                this.c.setShader(sweepGradient);
            }
            this.o = true;
        }
        if (this.e) {
            float f6 = this.mRotate * 360.0f;
            Matrix matrix = new Matrix();
            matrix.setRotate(f6, f, f2);
            this.d.setLocalMatrix(matrix);
        }
        switch (this.f) {
            case 0:
                if (!this.e) {
                    this.b = 0;
                    canvas.drawArc(rectF2, (0 / 2) + 270, 360 - 0, false, this.l);
                } else {
                    canvas.drawArc(rectF2, 270.0f, 360.0f, false, this.c);
                }
                break;
            case 1:
                float f7 = 1.0f - f4;
                ChartUtil.drawBitmapCenter(canvas, this.n.centerX(), this.n.centerY(), this.mDensityScale, this.g, null);
                this.b = 18;
                canvas.drawArc(rectF2, (18 / 2) + 270, 360 - 18, false, this.l);
                int i = this.b;
                canvas.drawArc(rectF2, (i / 2) + 270, (360 - i) * f7, false, this.m);
                break;
            case 2:
                if (this.e) {
                    canvas.drawArc(rectF2, 270.0f, 360.0f, false, this.c);
                }
                break;
            case 3:
                int i2 = this.a;
                canvas.drawRoundRect(rectF2, i2, i2, this.l);
                break;
            case 4:
                int i3 = this.a;
                canvas.drawRoundRect(rectF2, i3, i3, this.c);
                break;
            case 5:
                b(canvas, rectF2);
                break;
            case 6:
                a(canvas, rectF2);
                break;
        }
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            canvas.drawBitmap(this.h, f - (bitmap.getWidth() / 2), f2 - (this.h.getHeight() / 2), (Paint) null);
        }
    }

    public int getMaxProgress() {
        return this.q;
    }

    public int getProgress() {
        return this.p;
    }

    @Override // com.huami.watch.dataflow.chart.base.PieChart, com.huami.watch.dataflow.chart.base.BaseChart
    public void onRectChanged(RectF rectF) {
        super.onRectChanged(rectF);
        RectF rectF2 = new RectF();
        this.n = rectF2;
        float fCenterX = rectF.centerX();
        float f = this.mDensity;
        rectF2.left = fCenterX - (15.5f * f);
        RectF rectF3 = this.n;
        float f2 = rectF.top + (2.0f * f);
        rectF3.top = f2;
        rectF3.right = rectF3.left + (f * 31.0f);
        rectF3.bottom = f2 + (f * 31.0f);
        Log.i(r, "onRectChanged:" + rectF);
    }

    public void setCenterBmp(Bitmap bitmap) {
        this.h = bitmap;
    }

    public void setMaxProgress(int i) {
        this.q = i;
    }

    public void setMode(int i) {
        this.f = i;
        this.o = false;
    }

    public void setProgress(int i) {
        this.p = i;
    }

    public void showLoading() {
        this.e = true;
        this.o = false;
    }
}
