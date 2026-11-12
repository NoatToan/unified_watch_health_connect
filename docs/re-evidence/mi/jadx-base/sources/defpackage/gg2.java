package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.rd.animation.type.AnimationType;

/* JADX INFO: loaded from: classes6.dex */
public class gg2 extends d72 {
    public Paint c;

    public gg2(Paint paint, s7d s7dVar) {
        super(paint, s7dVar);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.c.setAntiAlias(true);
        this.c.setStrokeWidth(s7dVar.r());
    }

    public void a(Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float fL = this.f15166b.l();
        int iR = this.f15166b.r();
        float fN = this.f15166b.n();
        int iO = this.f15166b.o();
        int iS = this.f15166b.s();
        int iP = this.f15166b.p();
        AnimationType animationTypeB = this.f15166b.b();
        if ((animationTypeB == AnimationType.SCALE && !z) || (animationTypeB == AnimationType.SCALE_DOWN && z)) {
            fL *= fN;
        }
        if (i != iP) {
            iO = iS;
        }
        if (animationTypeB != AnimationType.FILL || i == iP) {
            paint = this.f15165a;
        } else {
            paint = this.c;
            paint.setStrokeWidth(iR);
        }
        paint.setColor(iO);
        canvas.drawCircle(i2, i3, fL, paint);
    }
}
