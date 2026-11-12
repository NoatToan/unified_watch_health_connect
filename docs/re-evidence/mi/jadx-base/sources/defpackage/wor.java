package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes6.dex */
public class wor extends d72 {
    public RectF c;

    public wor(Paint paint, s7d s7dVar) {
        super(paint, s7dVar);
        this.c = new RectF();
    }

    public void a(Canvas canvas, gnq gnqVar, int i, int i2) {
        if (gnqVar instanceof vor) {
            vor vorVar = (vor) gnqVar;
            int iB = vorVar.b();
            int iA = vorVar.a();
            int iL = this.f15166b.l();
            int iS = this.f15166b.s();
            int iO = this.f15166b.o();
            if (this.f15166b.f() == Orientation.HORIZONTAL) {
                RectF rectF = this.c;
                rectF.left = iB;
                rectF.right = iA;
                rectF.top = i2 - iL;
                rectF.bottom = i2 + iL;
            } else {
                RectF rectF2 = this.c;
                rectF2.left = i - iL;
                rectF2.right = i + iL;
                rectF2.top = iB;
                rectF2.bottom = iA;
            }
            this.f15165a.setColor(iS);
            float f = i;
            float f2 = i2;
            float f3 = iL;
            canvas.drawCircle(f, f2, f3, this.f15165a);
            this.f15165a.setColor(iO);
            canvas.drawRoundRect(this.c, f3, f3, this.f15165a);
        }
    }
}
