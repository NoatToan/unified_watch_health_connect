package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes6.dex */
public class rm9 extends d72 {
    public Paint c;

    public rm9(Paint paint, s7d s7dVar) {
        super(paint, s7dVar);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.c.setAntiAlias(true);
    }

    public void a(Canvas canvas, gnq gnqVar, int i, int i2, int i3) {
        if (gnqVar instanceof pm9) {
            pm9 pm9Var = (pm9) gnqVar;
            int iS = this.f15166b.s();
            float fL = this.f15166b.l();
            int iR = this.f15166b.r();
            int iP = this.f15166b.p();
            int iQ = this.f15166b.q();
            int iE = this.f15166b.e();
            if (this.f15166b.x()) {
                if (i == iQ) {
                    iS = pm9Var.a();
                    fL = pm9Var.e();
                    iR = pm9Var.g();
                } else if (i == iP) {
                    iS = pm9Var.b();
                    fL = pm9Var.f();
                    iR = pm9Var.h();
                }
            } else if (i == iP) {
                iS = pm9Var.a();
                fL = pm9Var.e();
                iR = pm9Var.g();
            } else if (i == iE) {
                iS = pm9Var.b();
                fL = pm9Var.f();
                iR = pm9Var.h();
            }
            this.c.setColor(iS);
            this.c.setStrokeWidth(this.f15166b.r());
            float f = i2;
            float f2 = i3;
            canvas.drawCircle(f, f2, this.f15166b.l(), this.c);
            this.c.setStrokeWidth(iR);
            canvas.drawCircle(f, f2, fL, this.c);
        }
    }
}
