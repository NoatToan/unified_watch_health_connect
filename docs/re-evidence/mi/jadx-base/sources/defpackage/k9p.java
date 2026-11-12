package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes6.dex */
public class k9p extends wor {
    public k9p(Paint paint, s7d s7dVar) {
        super(paint, s7dVar);
    }

    @Override // defpackage.wor
    public void a(Canvas canvas, gnq gnqVar, int i, int i2) {
        if (gnqVar instanceof j9p) {
            j9p j9pVar = (j9p) gnqVar;
            int iB = j9pVar.b();
            int iA = j9pVar.a();
            int iE = j9pVar.e() / 2;
            int iL = this.f15166b.l();
            int iS = this.f15166b.s();
            int iO = this.f15166b.o();
            if (this.f15166b.f() == Orientation.HORIZONTAL) {
                RectF rectF = this.c;
                rectF.left = iB;
                rectF.right = iA;
                rectF.top = i2 - iE;
                rectF.bottom = iE + i2;
            } else {
                RectF rectF2 = this.c;
                rectF2.left = i - iE;
                rectF2.right = iE + i;
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
