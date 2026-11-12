package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;

/* JADX INFO: loaded from: classes16.dex */
public class qkw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qlc f46410c;
    private qku h;
    private qkt i;
    private Paint l = new Paint();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f46408a = new Paint();
    private int m = 40;
    private int n = HeartRateThresholdConfig.HEART_RATE_LIMIT;
    private int k = 252;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46409b = 49;
    private int d = 89;
    private int g = -16777216;
    private float f = 0.0f;
    private Paint e = new Paint();
    private Paint j = new Paint();

    public qkw(qlc qlcVar, qkt qktVar, qku qkuVar) {
        this.f46410c = qlcVar;
        this.i = qktVar;
        this.h = qkuVar;
        this.l.setColor(Color.argb(255, this.k, this.f46409b, this.d));
        this.l.setStrokeWidth(qky.c(1.0f));
        this.l.setStrokeCap(Paint.Cap.ROUND);
        this.l.setAntiAlias(true);
        this.e.setColor(-1);
        this.j.setColor(Color.argb(255, this.k, this.f46409b, this.d));
        this.j.setAntiAlias(true);
        this.j.setStyle(Paint.Style.FILL);
        this.j.setShadowLayer(qky.c(4.25f), 0.0f, 0.0f, Color.argb(255, this.k, this.f46409b, this.d));
    }

    public void b(int i, int i2) {
        this.m = i;
        this.n = i2;
    }

    public void c(int i) {
        this.g = i;
        this.l.setColor(i);
        this.j.setColor(i);
        this.j.setShadowLayer(qky.c(4.25f), 0.0f, 0.0f, i);
    }

    public void e(Canvas canvas, Bitmap bitmap) {
        float[] fArrE = this.h.e();
        RectF rectF = new RectF(0.0f, this.n, 0.0f, this.m);
        if (fArrE.length >= 2) {
            rectF = new RectF(fArrE[0], this.n, fArrE[fArrE.length - 2], this.m);
        }
        this.i.d(fArrE);
        this.i.c(rectF);
        Canvas canvas2 = new Canvas(bitmap);
        canvas2.save();
        canvas2.clipRect(rectF);
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas2.restore();
        c(fArrE, canvas2);
        canvas2.drawLines(fArrE, this.l);
        RectF[] rectFArrD = this.h.d();
        for (RectF rectF2 : rectFArrD) {
            this.i.c(rectF2);
        }
        RectF rectFA = this.f46410c.a();
        float fWidth = rectFA.left;
        for (RectF rectF3 : rectFArrD) {
            canvas.drawBitmap(bitmap, new Rect((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom), new RectF(fWidth, rectFA.top, rectF3.width() + fWidth, rectFA.top + this.f46410c.b()), this.f46408a);
            fWidth += rectF3.width();
        }
        b(fArrE, rectFA, canvas);
    }

    private void c(float[] fArr, Canvas canvas) {
        if (fArr.length >= 4) {
            Path path = new Path();
            path.moveTo(fArr[0], fArr[1]);
            int i = 4;
            while (i < fArr.length) {
                float f = fArr[i];
                i++;
                path.lineTo(f, fArr[i]);
            }
            if (fArr.length > 2) {
                path.lineTo(fArr[fArr.length - 2], fArr[fArr.length - 1]);
            }
            RectF rectFA = this.f46410c.a();
            path.lineTo(fArr[fArr.length - 2], rectFA.bottom);
            path.lineTo(fArr[0], rectFA.bottom);
            path.lineTo(fArr[0], fArr[1]);
            float[] fArr2 = {0.0f, this.m, 0.0f, this.n};
            this.i.d(fArr2);
            int iSave = canvas.save();
            canvas.clipPath(path);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{qqn.b(this.g, 0.8f), qqn.b(this.g, 0.6f), qqn.b(this.g, 0.4f)});
            gradientDrawable.setBounds(new Rect((int) Math.floor(fArr[0]), (int) fArr2[3], (int) Math.ceil(fArr[fArr.length - 2]), (int) fArr2[1]));
            gradientDrawable.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    private void b(float[] fArr, RectF rectF, Canvas canvas) {
        if (fArr.length >= 2) {
            float f = rectF.left + fArr[fArr.length - 2];
            float f2 = this.f;
            if (f < f2) {
                f = f2;
            }
            if (f > rectF.right) {
                f = rectF.right;
            }
            this.f = f;
            canvas.save();
            Path path = new Path();
            path.addCircle(f, rectF.top + fArr[fArr.length - 1], qky.c(5.5f), Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.drawCircle(f, rectF.top + fArr[fArr.length - 1], qky.c(2.75f), this.j);
            canvas.restore();
        }
    }
}
