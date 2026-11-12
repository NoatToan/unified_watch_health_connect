package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes6.dex */
public class d67 extends d72 {
    public d67(Paint paint, s7d s7dVar) {
        super(paint, s7dVar);
    }

    public void a(Canvas canvas, gnq gnqVar, int i, int i2) {
        if (gnqVar instanceof a67) {
            a67 a67Var = (a67) gnqVar;
            int iS = this.f15166b.s();
            int iO = this.f15166b.o();
            float fL = this.f15166b.l();
            this.f15165a.setColor(iS);
            canvas.drawCircle(i, i2, fL, this.f15165a);
            this.f15165a.setColor(iO);
            if (this.f15166b.f() == Orientation.HORIZONTAL) {
                canvas.drawCircle(a67Var.c(), a67Var.a(), a67Var.b(), this.f15165a);
            } else {
                canvas.drawCircle(a67Var.a(), a67Var.c(), a67Var.b(), this.f15165a);
            }
        }
    }
}
