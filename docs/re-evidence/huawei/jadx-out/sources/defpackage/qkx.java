package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes16.dex */
class qkx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qlc f46411b;
    private Path e;
    private Paint d = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f46412c = new Paint();

    qkx(qlc qlcVar) {
        this.f46411b = qlcVar;
        this.d.setColor(Color.argb(51, 255, 255, 255));
        this.f46412c.setColor(Color.argb(25, 255, 255, 255));
        this.f46412c.setStyle(Paint.Style.STROKE);
        this.f46412c.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        float fC = qky.c(0.25f);
        this.d.setStrokeWidth(fC < 1.0f ? 1.0f : fC);
        this.e = new Path();
    }

    public void e(Canvas canvas) {
        float[] fArr = new float[5];
        RectF rectFA = this.f46411b.a();
        for (int i = 0; i < 5; i++) {
            fArr[i] = rectFA.top + (((rectFA.bottom - rectFA.top) / 4) * i);
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (i2 == 0 || 4 == i2) {
                canvas.drawLine(rectFA.left, fArr[i2], rectFA.right, fArr[i2], this.d);
            } else {
                this.e.reset();
                this.e.moveTo(rectFA.left, fArr[i2]);
                this.e.lineTo(rectFA.right, fArr[i2]);
                canvas.drawPath(this.e, this.f46412c);
            }
        }
    }
}
