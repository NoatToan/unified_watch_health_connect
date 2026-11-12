package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class s4d extends a {
    public final Paint D;
    public final Rect E;
    public final Rect F;
    public final mte G;
    public o82<ColorFilter, ColorFilter> H;
    public o82<Bitmap, Bitmap> I;

    public s4d(jte jteVar, Layer layer) {
        super(jteVar, layer);
        this.D = new x1e(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = jteVar.M(layer.m());
    }

    public final Bitmap O() {
        Bitmap bitmapH;
        o82<Bitmap, Bitmap> o82Var = this.I;
        if (o82Var != null && (bitmapH = o82Var.h()) != null) {
            return bitmapH;
        }
        Bitmap bitmapE = this.p.E(this.q.m());
        if (bitmapE != null) {
            return bitmapE;
        }
        mte mteVar = this.G;
        if (mteVar != null) {
            return mteVar.a();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        if (this.G != null) {
            float fE = emq.e();
            rectF.set(0.0f, 0.0f, this.G.e() * fE, this.G.c() * fE);
            this.o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        super.h(t, yteVar);
        if (t == ste.K) {
            if (yteVar == null) {
                this.H = null;
                return;
            } else {
                this.H = new inq(yteVar);
                return;
            }
        }
        if (t == ste.N) {
            if (yteVar == null) {
                this.I = null;
            } else {
                this.I = new inq(yteVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapO = O();
        if (bitmapO == null || bitmapO.isRecycled() || this.G == null) {
            return;
        }
        float fE = emq.e();
        this.D.setAlpha(i);
        o82<ColorFilter, ColorFilter> o82Var = this.H;
        if (o82Var != null) {
            this.D.setColorFilter(o82Var.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.E.set(0, 0, bitmapO.getWidth(), bitmapO.getHeight());
        if (this.p.N()) {
            this.F.set(0, 0, (int) (this.G.e() * fE), (int) (this.G.c() * fE));
        } else {
            this.F.set(0, 0, (int) (bitmapO.getWidth() * fE), (int) (bitmapO.getHeight() * fE));
        }
        canvas.drawBitmap(bitmapO, this.E, this.F, this.D);
        canvas.restore();
    }
}
