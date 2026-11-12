package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class m3b extends de2 {
    public final o82<PointF, PointF> A;
    public inq B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f25706r;
    public final boolean s;
    public final LongSparseArray<LinearGradient> t;
    public final LongSparseArray<RadialGradient> u;
    public final RectF v;
    public final GradientType w;
    public final int x;
    public final o82<f3b, f3b> y;
    public final o82<PointF, PointF> z;

    public m3b(jte jteVar, a aVar, com.airbnb.lottie.model.content.a aVar2) {
        super(jteVar, aVar, aVar2.b().toPaintCap(), aVar2.g().toPaintJoin(), aVar2.i(), aVar2.k(), aVar2.m(), aVar2.h(), aVar2.c());
        this.t = new LongSparseArray<>();
        this.u = new LongSparseArray<>();
        this.v = new RectF();
        this.f25706r = aVar2.j();
        this.w = aVar2.f();
        this.s = aVar2.n();
        this.x = (int) (jteVar.G().d() / 32.0f);
        o82<f3b, f3b> o82VarA = aVar2.e().a();
        this.y = o82VarA;
        o82VarA.a(this);
        aVar.i(o82VarA);
        o82<PointF, PointF> o82VarA2 = aVar2.l().a();
        this.z = o82VarA2;
        o82VarA2.a(this);
        aVar.i(o82VarA2);
        o82<PointF, PointF> o82VarA3 = aVar2.d().a();
        this.A = o82VarA3;
        o82VarA3.a(this);
        aVar.i(o82VarA3);
    }

    @Override // defpackage.de2, defpackage.p57
    public void d(Canvas canvas, Matrix matrix, int i) {
        if (this.s) {
            return;
        }
        a(this.v, matrix, false);
        Shader shaderL = this.w == GradientType.LINEAR ? l() : m();
        shaderL.setLocalMatrix(matrix);
        this.i.setShader(shaderL);
        super.d(canvas, matrix, i);
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.f25706r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.de2, defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        super.h(t, yteVar);
        if (t == ste.L) {
            inq inqVar = this.B;
            if (inqVar != null) {
                this.f.G(inqVar);
            }
            if (yteVar == null) {
                this.B = null;
                return;
            }
            inq inqVar2 = new inq(yteVar);
            this.B = inqVar2;
            inqVar2.a(this);
            this.f.i(this.B);
        }
    }

    public final int[] j(int[] iArr) {
        inq inqVar = this.B;
        if (inqVar != null) {
            Integer[] numArr = (Integer[]) inqVar.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public final int k() {
        int iRound = Math.round(this.z.f() * this.x);
        int iRound2 = Math.round(this.A.f() * this.x);
        int iRound3 = Math.round(this.y.f() * this.x);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    public final LinearGradient l() {
        long jK = k();
        LinearGradient linearGradient = this.t.get(jK);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFH = this.z.h();
        PointF pointFH2 = this.A.h();
        f3b f3bVarH = this.y.h();
        LinearGradient linearGradient2 = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, j(f3bVarH.c()), f3bVarH.d(), Shader.TileMode.CLAMP);
        this.t.put(jK, linearGradient2);
        return linearGradient2;
    }

    public final RadialGradient m() {
        long jK = k();
        RadialGradient radialGradient = this.u.get(jK);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFH = this.z.h();
        PointF pointFH2 = this.A.h();
        f3b f3bVarH = this.y.h();
        int[] iArrJ = j(f3bVarH.c());
        float[] fArrD = f3bVarH.d();
        float f = pointFH.x;
        float f2 = pointFH.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot(pointFH2.x - f, pointFH2.y - f2), iArrJ, fArrD, Shader.TileMode.CLAMP);
        this.u.put(jK, radialGradient2);
        return radialGradient2;
    }
}
