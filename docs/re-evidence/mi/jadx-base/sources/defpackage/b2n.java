package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes6.dex */
public class b2n extends d72 {
    public b2n(Paint paint, s7d s7dVar) {
        super(paint, s7dVar);
    }

    public void a(Canvas canvas, gnq gnqVar, int i, int i2) {
        if (gnqVar instanceof a2n) {
            int iA = ((a2n) gnqVar).a();
            int iS = this.f15166b.s();
            int iO = this.f15166b.o();
            int iL = this.f15166b.l();
            this.f15165a.setColor(iS);
            float f = i;
            float f2 = i2;
            float f3 = iL;
            canvas.drawCircle(f, f2, f3, this.f15165a);
            this.f15165a.setColor(iO);
            if (this.f15166b.f() == Orientation.HORIZONTAL) {
                canvas.drawCircle(iA, f2, f3, this.f15165a);
            } else {
                canvas.drawCircle(f, iA, f3, this.f15165a);
            }
        }
    }
}
