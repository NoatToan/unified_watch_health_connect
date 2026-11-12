package o4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo4/j;", "Lo4/f1;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f128869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f128870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f128871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f128872e;

    public /* synthetic */ j(Path path, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new Path() : path);
    }

    @Override // o4.f1
    public final void a(float f14, float f15) {
        this.f128869b.moveTo(f14, f15);
    }

    @Override // o4.f1
    public final void b(float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f128869b.cubicTo(f14, f15, f16, f17, f18, f19);
    }

    @Override // o4.f1
    public final void c(float f14, float f15) {
        this.f128869b.lineTo(f14, f15);
    }

    @Override // o4.f1
    public final void close() {
        this.f128869b.close();
    }

    @Override // o4.f1
    public final void d(float f14, float f15, float f16, float f17) {
        this.f128869b.rQuadTo(f14, f15, f16, f17);
    }

    @Override // o4.f1
    public final void e(long j8) {
        Matrix matrix = this.f128872e;
        if (matrix == null) {
            this.f128872e = new Matrix();
        } else {
            matrix.getClass();
            matrix.reset();
        }
        Matrix matrix2 = this.f128872e;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
        Matrix matrix3 = this.f128872e;
        matrix3.getClass();
        this.f128869b.transform(matrix3);
    }

    @Override // o4.f1
    public final void f(float f14, float f15, float f16, float f17) {
        this.f128869b.rQuadTo(f14, f15, f16, f17);
    }

    @Override // o4.f1
    public final int g() {
        if (this.f128869b.getFillType() == Path.FillType.EVEN_ODD) {
            h1.f128863b.getClass();
            return h1.f128864c;
        }
        h1.f128863b.getClass();
        return 0;
    }

    @Override // o4.f1
    public final n4.d getBounds() {
        if (this.f128870c == null) {
            this.f128870c = new RectF();
        }
        RectF rectF = this.f128870c;
        rectF.getClass();
        this.f128869b.computeBounds(rectF, true);
        return new n4.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // o4.f1
    public final boolean h() {
        return this.f128869b.isConvex();
    }

    @Override // o4.f1
    public final void i(float f14, float f15, float f16, float f17) {
        this.f128869b.quadTo(f14, f15, f16, f17);
    }

    @Override // o4.f1
    public final void j(int i14) {
        h1.f128863b.getClass();
        this.f128869b.setFillType(i14 == h1.f128864c ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // o4.f1
    public final void k(n4.e eVar, f1.b bVar) {
        if (this.f128870c == null) {
            this.f128870c = new RectF();
        }
        RectF rectF = this.f128870c;
        rectF.getClass();
        float f14 = eVar.f123551a;
        long j8 = eVar.f123558h;
        long j14 = eVar.f123557g;
        long j15 = eVar.f123556f;
        long j16 = eVar.f123555e;
        rectF.set(f14, eVar.f123552b, eVar.f123553c, eVar.f123554d);
        if (this.f128871d == null) {
            this.f128871d = new float[8];
        }
        float[] fArr = this.f128871d;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j16 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j16 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j15 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j15 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j14 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j14 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j8 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j8 & 4294967295L));
        RectF rectF2 = this.f128870c;
        rectF2.getClass();
        float[] fArr2 = this.f128871d;
        fArr2.getClass();
        this.f128869b.addRoundRect(rectF2, fArr2, m.b(bVar));
    }

    @Override // o4.f1
    public final void n(float f14, float f15) {
        this.f128869b.rLineTo(f14, f15);
    }

    @Override // o4.f1
    public final void o(float f14, float f15) {
        this.f128869b.rMoveTo(f14, f15);
    }

    @Override // o4.f1
    public final void p(float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f128869b.rCubicTo(f14, f15, f16, f17, f18, f19);
    }

    @Override // o4.f1
    public final void q(n4.d dVar, f1.b bVar) {
        float f14 = dVar.f123547a;
        float f15 = dVar.f123550d;
        float f16 = dVar.f123549c;
        float f17 = dVar.f123548b;
        if (Float.isNaN(f14) || Float.isNaN(f17) || Float.isNaN(f16) || Float.isNaN(f15)) {
            m.c("Invalid rectangle, make sure no value is NaN");
        }
        if (this.f128870c == null) {
            this.f128870c = new RectF();
        }
        RectF rectF = this.f128870c;
        rectF.getClass();
        rectF.set(dVar.f123547a, f17, f16, f15);
        RectF rectF2 = this.f128870c;
        rectF2.getClass();
        this.f128869b.addRect(rectF2, m.b(bVar));
    }

    @Override // o4.f1
    public final void r(float f14, float f15, float f16, float f17) {
        this.f128869b.quadTo(f14, f15, f16, f17);
    }

    @Override // o4.f1
    public final void reset() {
        this.f128869b.reset();
    }

    @Override // o4.f1
    public final void rewind() {
        this.f128869b.rewind();
    }

    @Override // o4.f1
    public final boolean s(f1 f1Var, f1 f1Var2, int i14) {
        Path.Op op3;
        j1.f128873b.getClass();
        if (i14 == 0) {
            op3 = Path.Op.DIFFERENCE;
        } else if (i14 == j1.f128874c) {
            op3 = Path.Op.INTERSECT;
        } else if (i14 == j1.f128877f) {
            op3 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op3 = i14 == j1.f128875d ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(f1Var instanceof j)) {
            org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((j) f1Var).f128869b;
        if (f1Var2 instanceof j) {
            return this.f128869b.op(path, ((j) f1Var2).f128869b, op3);
        }
        org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
        return false;
    }

    public j(Path path) {
        this.f128869b = path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
