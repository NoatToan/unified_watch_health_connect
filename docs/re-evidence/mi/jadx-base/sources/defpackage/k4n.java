package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class k4n extends a {
    public final RectF D;
    public final Paint E;
    public final float[] F;
    public final Path G;
    public final Layer H;
    public o82<ColorFilter, ColorFilter> I;

    public k4n(jte jteVar, Layer layer) {
        super(jteVar, layer);
        this.D = new RectF();
        x1e x1eVar = new x1e();
        this.E = x1eVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = layer;
        x1eVar.setAlpha(0);
        x1eVar.setStyle(Paint.Style.FILL);
        x1eVar.setColor(layer.o());
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.D.set(0.0f, 0.0f, this.H.q(), this.H.p());
        this.o.mapRect(this.D);
        rectF.set(this.D);
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        super.h(t, yteVar);
        if (t == ste.K) {
            if (yteVar == null) {
                this.I = null;
            } else {
                this.I = new inq(yteVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.H.o());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.x.h() == null ? 100 : this.x.h().h().intValue())) / 100.0f) * 255.0f);
        this.E.setAlpha(iIntValue);
        o82<ColorFilter, ColorFilter> o82Var = this.I;
        if (o82Var != null) {
            this.E.setColorFilter(o82Var.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.H.q();
            float[] fArr2 = this.F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.H.q();
            this.F[5] = this.H.p();
            float[] fArr3 = this.F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.H.p();
            matrix.mapPoints(this.F);
            this.G.reset();
            Path path = this.G;
            float[] fArr4 = this.F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.G;
            float[] fArr5 = this.F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.G;
            float[] fArr6 = this.F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.G;
            float[] fArr7 = this.F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.G;
            float[] fArr8 = this.F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.G.close();
            canvas.drawPath(this.G, this.E);
        }
    }
}
