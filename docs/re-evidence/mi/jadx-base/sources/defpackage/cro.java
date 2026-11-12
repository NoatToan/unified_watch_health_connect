package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes6.dex */
public class cro extends d72 {
    public cro(Paint paint, s7d s7dVar) {
        super(paint, s7dVar);
    }

    public void a(Canvas canvas, gnq gnqVar, int i, int i2, int i3) {
        if (gnqVar instanceof bro) {
            bro broVar = (bro) gnqVar;
            int iO = this.f15166b.o();
            int iS = this.f15166b.s();
            int iL = this.f15166b.l();
            int iP = this.f15166b.p();
            int iQ = this.f15166b.q();
            int iE = this.f15166b.e();
            int iA = broVar.a();
            if (this.f15166b.x()) {
                if (i == iQ) {
                    iA = broVar.a();
                } else {
                    if (i == iP) {
                        iA = broVar.b();
                    }
                    iO = iS;
                }
            } else if (i == iE) {
                iA = broVar.a();
            } else {
                if (i == iP) {
                    iA = broVar.b();
                }
                iO = iS;
            }
            this.f15165a.setColor(iO);
            if (this.f15166b.f() == Orientation.HORIZONTAL) {
                canvas.drawCircle(iA, i3, iL, this.f15165a);
            } else {
                canvas.drawCircle(i2, iA, iL, this.f15165a);
            }
        }
    }
}
