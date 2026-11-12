package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes6.dex */
public class nal extends d72 {
    public nal(Paint paint, s7d s7dVar) {
        super(paint, s7dVar);
    }

    public void a(Canvas canvas, gnq gnqVar, int i, int i2, int i3) {
        if (gnqVar instanceof lal) {
            lal lalVar = (lal) gnqVar;
            float fL = this.f15166b.l();
            int iO = this.f15166b.o();
            int iP = this.f15166b.p();
            int iQ = this.f15166b.q();
            int iE = this.f15166b.e();
            if (this.f15166b.x()) {
                if (i == iQ) {
                    fL = lalVar.e();
                    iO = lalVar.a();
                } else if (i == iP) {
                    fL = lalVar.f();
                    iO = lalVar.b();
                }
            } else if (i == iP) {
                fL = lalVar.e();
                iO = lalVar.a();
            } else if (i == iE) {
                fL = lalVar.f();
                iO = lalVar.b();
            }
            this.f15165a.setColor(iO);
            canvas.drawCircle(i2, i3, fL, this.f15165a);
        }
    }
}
