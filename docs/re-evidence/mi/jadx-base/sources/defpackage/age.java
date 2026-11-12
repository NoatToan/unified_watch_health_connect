package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.LineDataSet;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class age extends fge {
    protected Path cubicFillPath;
    protected Path cubicPath;
    protected Canvas mBitmapCanvas;
    protected Bitmap.Config mBitmapConfig;
    protected cge mChart;
    protected Paint mCirclePaintInner;
    private float[] mCirclesBuffer;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mGenerateFilledPathBuffer;
    private HashMap<erc, b> mImageCaches;
    private float[] mLineBuffer;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f983a;

        static {
            int[] iArr = new int[LineDataSet.Mode.values().length];
            f983a = iArr;
            try {
                iArr[LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f983a[LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f983a[LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f983a[LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public age(cge cgeVar, cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.mBitmapConfig = Bitmap.Config.ARGB_8888;
        this.cubicPath = new Path();
        this.cubicFillPath = new Path();
        this.mLineBuffer = new float[4];
        this.mGenerateFilledPathBuffer = new Path();
        this.mImageCaches = new HashMap<>();
        this.mCirclesBuffer = new float[2];
        this.mChart = cgeVar;
        Paint paint = new Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r3v2, types: [j72] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r4v4 */
    private void generateFilledPath(ktc ktcVar, int i, int i2, Path path) {
        float fA = ktcVar.B().a(ktcVar, this.mChart);
        float fI = this.mAnimator.i();
        boolean z = ktcVar.getMode() == LineDataSet.Mode.STEPPED;
        path.reset();
        ?? I = ktcVar.i(i);
        path.moveTo(I.getX(), fA);
        path.lineTo(I.getX(), I.getY() * fI);
        int i3 = i + 1;
        ?? r4 = 0;
        ?? r3 = I;
        while (i3 <= i2) {
            ?? I2 = ktcVar.i(i3);
            if (z) {
                path.lineTo(I2.getX(), r3.getY() * fI);
            }
            path.lineTo(I2.getX(), I2.getY() * fI);
            i3++;
            r3 = I2;
            r4 = I2;
        }
        if (r4 != 0) {
            path.lineTo(r4.getX(), fA);
        }
        path.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.github.mikephil.charting.data.Entry, j72] */
    public void drawCircles(Canvas canvas) {
        b bVar;
        Bitmap bitmapB;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float fI = this.mAnimator.i();
        float[] fArr = this.mCirclesBuffer;
        char c = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List<T> listL = this.mChart.getLineData().l();
        int i = 0;
        while (i < listL.size()) {
            ktc ktcVar = (ktc) listL.get(i);
            if (ktcVar.isVisible() && ktcVar.Q() && ktcVar.O0() != 0) {
                this.mCirclePaintInner.setColor(ktcVar.f());
                ryp transformer = this.mChart.getTransformer(ktcVar.m0());
                this.mXBounds.a(this.mChart, ktcVar);
                float fB0 = ktcVar.B0();
                float fS = ktcVar.S();
                boolean z = (!ktcVar.R0() || fS >= fB0 || fS <= f) ? c : 1;
                boolean z2 = (z == 0 || ktcVar.f() != 1122867) ? c : 1;
                a aVar = null;
                if (this.mImageCaches.containsKey(ktcVar)) {
                    bVar = this.mImageCaches.get(ktcVar);
                } else {
                    b bVar2 = new b(this, aVar);
                    this.mImageCaches.put(ktcVar, bVar2);
                    bVar = bVar2;
                }
                if (bVar.c(ktcVar)) {
                    bVar.a(ktcVar, z, z2);
                }
                d12.a aVar2 = this.mXBounds;
                int i2 = aVar2.c;
                int i3 = aVar2.f14945a;
                int i4 = i2 + i3;
                while (i3 <= i4) {
                    ?? I = ktcVar.i(i3);
                    if (I == 0) {
                        break;
                    }
                    this.mCirclesBuffer[c] = I.getX();
                    this.mCirclesBuffer[1] = I.getY() * fI;
                    transformer.k(this.mCirclesBuffer);
                    if (!this.mViewPortHandler.C(this.mCirclesBuffer[c])) {
                        break;
                    }
                    if (this.mViewPortHandler.B(this.mCirclesBuffer[c]) && this.mViewPortHandler.F(this.mCirclesBuffer[1]) && (bitmapB = bVar.b(i3)) != null) {
                        float[] fArr2 = this.mCirclesBuffer;
                        canvas.drawBitmap(bitmapB, fArr2[c] - fB0, fArr2[1] - fB0, (Paint) null);
                    }
                    i3++;
                    c = 0;
                }
            }
            i++;
            c = 0;
            f = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public void drawCubicBezier(ktc ktcVar) {
        float fI = this.mAnimator.i();
        ryp transformer = this.mChart.getTransformer(ktcVar.m0());
        this.mXBounds.a(this.mChart, ktcVar);
        float fC0 = ktcVar.c0();
        this.cubicPath.reset();
        d12.a aVar = this.mXBounds;
        if (aVar.c >= 1) {
            int i = aVar.f14945a;
            Object objI = ktcVar.i(Math.max(i - 1, 0));
            ?? I = ktcVar.i(Math.max(i, 0));
            if (I != 0) {
                this.cubicPath.moveTo(I.getX(), I.getY() * fI);
                int i2 = this.mXBounds.f14945a + 1;
                int i3 = -1;
                ?? r4 = I;
                ?? r2 = I;
                ?? r3 = objI;
                while (true) {
                    d12.a aVar2 = this.mXBounds;
                    ?? I2 = r2;
                    if (i2 > aVar2.c + aVar2.f14945a) {
                        break;
                    }
                    if (i3 != i2) {
                        I2 = ktcVar.i(i2);
                    }
                    int i4 = i2 + 1;
                    if (i4 < ktcVar.O0()) {
                        i2 = i4;
                    }
                    ?? I3 = ktcVar.i(i2);
                    this.cubicPath.cubicTo(r4.getX() + ((I2.getX() - r3.getX()) * fC0), (r4.getY() + ((I2.getY() - r3.getY()) * fC0)) * fI, I2.getX() - ((I3.getX() - r4.getX()) * fC0), (I2.getY() - ((I3.getY() - r4.getY()) * fC0)) * fI, I2.getX(), I2.getY() * fI);
                    r3 = r4;
                    r4 = I2;
                    r2 = I3;
                    int i5 = i2;
                    i2 = i4;
                    i3 = i5;
                }
            } else {
                return;
            }
        }
        if (ktcVar.C0()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, ktcVar, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(ktcVar.n0());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.i(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    public void drawCubicFill(Canvas canvas, ktc ktcVar, Path path, ryp rypVar, d12.a aVar) {
        float fA = ktcVar.B().a(ktcVar, this.mChart);
        path.lineTo(ktcVar.i(aVar.f14945a + aVar.c).getX(), fA);
        path.lineTo(ktcVar.i(aVar.f14945a).getX(), fA);
        path.close();
        rypVar.i(path);
        Drawable drawableG = ktcVar.g();
        if (drawableG != null) {
            drawFilledPath(canvas, path, drawableG);
        } else {
            drawFilledPath(canvas, path, ktcVar.y(), ktcVar.U());
        }
    }

    @Override // defpackage.dn5
    public void drawData(Canvas canvas) {
        int iN = (int) this.mViewPortHandler.n();
        int iM = (int) this.mViewPortHandler.m();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != iN || bitmapCreateBitmap.getHeight() != iM) {
            if (iN <= 0 || iM <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(iN, iM, this.mBitmapConfig);
            this.mDrawBitmap = new WeakReference<>(bitmapCreateBitmap);
            this.mBitmapCanvas = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (T t : this.mChart.getLineData().l()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.mRenderPaint);
    }

    public void drawDataSet(Canvas canvas, ktc ktcVar) {
        if (ktcVar.O0() < 1) {
            return;
        }
        this.mRenderPaint.setStrokeWidth(ktcVar.X());
        this.mRenderPaint.setPathEffect(ktcVar.F());
        int i = a.f983a[ktcVar.getMode().ordinal()];
        if (i == 3) {
            drawCubicBezier(ktcVar);
        } else if (i != 4) {
            drawLinear(canvas, ktcVar);
        } else {
            drawHorizontalBezier(ktcVar);
        }
        this.mRenderPaint.setPathEffect(null);
    }

    @Override // defpackage.dn5
    public void drawExtras(Canvas canvas) {
        drawCircles(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.dn5
    public void drawHighlighted(Canvas canvas, r7c[] r7cVarArr) {
        bge lineData = this.mChart.getLineData();
        for (r7c r7cVar : r7cVarArr) {
            ktc ktcVar = (ktc) lineData.i(r7cVar.d());
            if (ktcVar != null && ktcVar.R()) {
                ?? V0 = ktcVar.v0(r7cVar.h(), r7cVar.j());
                if (isInBoundsX(V0, ktcVar)) {
                    vye vyeVarE = this.mChart.getTransformer(ktcVar.m0()).e(V0.getX(), V0.getY() * this.mAnimator.i());
                    r7cVar.m((float) vyeVarE.c, (float) vyeVarE.d);
                    drawHighlightLines(canvas, (float) vyeVarE.c, (float) vyeVarE.d, ktcVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.github.mikephil.charting.data.Entry, j72] */
    public void drawHorizontalBezier(ktc ktcVar) {
        float fI = this.mAnimator.i();
        ryp transformer = this.mChart.getTransformer(ktcVar.m0());
        this.mXBounds.a(this.mChart, ktcVar);
        this.cubicPath.reset();
        d12.a aVar = this.mXBounds;
        if (aVar.c >= 1) {
            ?? I = ktcVar.i(aVar.f14945a);
            this.cubicPath.moveTo(I.getX(), I.getY() * fI);
            int i = this.mXBounds.f14945a + 1;
            ?? r2 = I;
            while (true) {
                d12.a aVar2 = this.mXBounds;
                if (i > aVar2.c + aVar2.f14945a) {
                    break;
                }
                ?? I2 = ktcVar.i(i);
                float x = r2.getX() + ((I2.getX() - r2.getX()) / 2.0f);
                this.cubicPath.cubicTo(x, r2.getY() * fI, x, I2.getY() * fI, I2.getX(), I2.getY() * fI);
                i++;
                r2 = I2;
            }
        }
        if (ktcVar.C0()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, ktcVar, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(ktcVar.n0());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.i(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r13v20, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.github.mikephil.charting.data.Entry, j72] */
    public void drawLinear(Canvas canvas, ktc ktcVar) {
        int iO0 = ktcVar.O0();
        boolean zO0 = ktcVar.o0();
        char c = 4;
        int i = zO0 ? 4 : 2;
        ryp transformer = this.mChart.getTransformer(ktcVar.m0());
        float fI = this.mAnimator.i();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = ktcVar.d() ? this.mBitmapCanvas : canvas;
        this.mXBounds.a(this.mChart, ktcVar);
        if (ktcVar.C0() && iO0 > 0) {
            drawLinearFill(canvas, ktcVar, transformer, this.mXBounds);
        }
        char c2 = 1;
        if (ktcVar.i0().size() > 1) {
            int i2 = i * 2;
            if (this.mLineBuffer.length <= i2) {
                this.mLineBuffer = new float[i * 4];
            }
            d12.a aVar = this.mXBounds;
            int i3 = aVar.f14945a;
            int i4 = aVar.c + i3;
            while (i3 < i4) {
                ?? I = ktcVar.i(i3);
                if (I != 0) {
                    this.mLineBuffer[0] = I.getX();
                    this.mLineBuffer[c2] = I.getY() * fI;
                    if (i3 < this.mXBounds.f14946b) {
                        ?? I2 = ktcVar.i(i3 + 1);
                        if (I2 == 0) {
                            break;
                        }
                        if (zO0) {
                            this.mLineBuffer[2] = I2.getX();
                            float[] fArr = this.mLineBuffer;
                            float f = fArr[c2];
                            fArr[3] = f;
                            fArr[c] = fArr[2];
                            fArr[5] = f;
                            fArr[6] = I2.getX();
                            this.mLineBuffer[7] = I2.getY() * fI;
                        } else {
                            this.mLineBuffer[2] = I2.getX();
                            this.mLineBuffer[3] = I2.getY() * fI;
                        }
                    } else {
                        float[] fArr2 = this.mLineBuffer;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[c2];
                    }
                    float[] fArr3 = this.mLineBuffer;
                    float f2 = fArr3[0];
                    float f3 = fArr3[c2];
                    float f4 = fArr3[i2 - 2];
                    float f5 = fArr3[i2 - 1];
                    if (f2 != f4 || f3 != f5) {
                        transformer.k(fArr3);
                        if (!this.mViewPortHandler.C(f2)) {
                            break;
                        }
                        if (this.mViewPortHandler.B(f4) && this.mViewPortHandler.D(Math.max(f3, f5)) && this.mViewPortHandler.A(Math.min(f3, f5))) {
                            this.mRenderPaint.setColor(ktcVar.E0(i3));
                            canvas2.drawLines(this.mLineBuffer, 0, i2, this.mRenderPaint);
                        }
                    }
                }
                i3++;
                c = 4;
                c2 = 1;
            }
        } else {
            int i5 = iO0 * i;
            if (this.mLineBuffer.length < Math.max(i5, i) * 2) {
                this.mLineBuffer = new float[Math.max(i5, i) * 4];
            }
            if (ktcVar.i(this.mXBounds.f14945a) != 0) {
                int i6 = this.mXBounds.f14945a;
                int i7 = 0;
                while (true) {
                    d12.a aVar2 = this.mXBounds;
                    if (i6 > aVar2.c + aVar2.f14945a) {
                        break;
                    }
                    ?? I3 = ktcVar.i(i6 == 0 ? 0 : i6 - 1);
                    ?? I4 = ktcVar.i(i6);
                    if (I3 != 0 && I4 != 0) {
                        this.mLineBuffer[i7] = I3.getX();
                        int i8 = i7 + 2;
                        this.mLineBuffer[i7 + 1] = I3.getY() * fI;
                        if (zO0) {
                            this.mLineBuffer[i8] = I4.getX();
                            this.mLineBuffer[i7 + 3] = I3.getY() * fI;
                            this.mLineBuffer[i7 + 4] = I4.getX();
                            i8 = i7 + 6;
                            this.mLineBuffer[i7 + 5] = I3.getY() * fI;
                        }
                        this.mLineBuffer[i8] = I4.getX();
                        this.mLineBuffer[i8 + 1] = I4.getY() * fI;
                        i7 = i8 + 2;
                    }
                    i6++;
                }
                if (i7 > 0) {
                    transformer.k(this.mLineBuffer);
                    int iMax = Math.max((this.mXBounds.c + 1) * i, i) * 2;
                    this.mRenderPaint.setColor(ktcVar.n0());
                    canvas2.drawLines(this.mLineBuffer, 0, iMax, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    public void drawLinearFill(Canvas canvas, ktc ktcVar, ryp rypVar, d12.a aVar) {
        int i;
        int i2;
        Path path = this.mGenerateFilledPathBuffer;
        int i3 = aVar.f14945a;
        int i4 = aVar.c + i3;
        int i5 = 0;
        do {
            i = (i5 * 128) + i3;
            i2 = i + 128;
            if (i2 > i4) {
                i2 = i4;
            }
            if (i <= i2) {
                generateFilledPath(ktcVar, i, i2, path);
                rypVar.i(path);
                Drawable drawableG = ktcVar.g();
                if (drawableG != null) {
                    drawFilledPath(canvas, path, drawableG);
                } else {
                    drawFilledPath(canvas, path, ktcVar.y(), ktcVar.U());
                }
            }
            i5++;
        } while (i <= i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.dn5
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<T> listL = this.mChart.getLineData().l();
            for (int i = 0; i < listL.size(); i++) {
                ktc ktcVar = (ktc) listL.get(i);
                if (shouldDrawValues(ktcVar) && ktcVar.O0() >= 1) {
                    applyValueTextStyle(ktcVar);
                    ryp transformer = this.mChart.getTransformer(ktcVar.m0());
                    int iB0 = (int) (ktcVar.B0() * 1.75f);
                    if (!ktcVar.Q()) {
                        iB0 /= 2;
                    }
                    int i2 = iB0;
                    this.mXBounds.a(this.mChart, ktcVar);
                    float fH = this.mAnimator.h();
                    float fI = this.mAnimator.i();
                    d12.a aVar = this.mXBounds;
                    float[] fArrC = transformer.c(ktcVar, fH, fI, aVar.f14945a, aVar.f14946b);
                    wye wyeVarD = wye.d(ktcVar.P0());
                    wyeVarD.c = fmq.e(wyeVarD.c);
                    wyeVarD.d = fmq.e(wyeVarD.d);
                    int i3 = 0;
                    while (i3 < fArrC.length) {
                        float f = fArrC[i3];
                        float f2 = fArrC[i3 + 1];
                        if (!this.mViewPortHandler.C(f)) {
                            break;
                        }
                        if (this.mViewPortHandler.B(f) && this.mViewPortHandler.F(f2)) {
                            int i4 = i3 / 2;
                            ?? I = ktcVar.i(this.mXBounds.f14945a + i4);
                            if (ktcVar.l0()) {
                                drawValue(canvas, ktcVar.d0(), I.getY(), I, i, f, f2 - i2, ktcVar.n(i4));
                            }
                            if (I.getIcon() != null && ktcVar.D()) {
                                Drawable icon = I.getIcon();
                                fmq.f(canvas, icon, (int) (f + wyeVarD.c), (int) (f2 + wyeVarD.d), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i3 = i3;
                            wyeVarD = wyeVarD;
                        }
                        i3 += 2;
                        wyeVarD = wyeVarD;
                    }
                    wye.f(wyeVarD);
                }
            }
        }
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    @Override // defpackage.dn5
    public void initBuffers() {
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        releaseBitmap();
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Path f984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap[] f985b;

        public b() {
            this.f984a = new Path();
        }

        public void a(ktc ktcVar, boolean z, boolean z2) {
            int iX = ktcVar.x();
            float fB0 = ktcVar.B0();
            float fS = ktcVar.S();
            for (int i = 0; i < iX; i++) {
                int i2 = (int) (((double) fB0) * 2.1d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.f985b[i] = bitmapCreateBitmap;
                age.this.mRenderPaint.setColor(ktcVar.P(i));
                if (z2) {
                    this.f984a.reset();
                    this.f984a.addCircle(fB0, fB0, fB0, Path.Direction.CW);
                    this.f984a.addCircle(fB0, fB0, fS, Path.Direction.CCW);
                    canvas.drawPath(this.f984a, age.this.mRenderPaint);
                } else {
                    canvas.drawCircle(fB0, fB0, fB0, age.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(fB0, fB0, fS, age.this.mCirclePaintInner);
                    }
                }
            }
        }

        public Bitmap b(int i) {
            Bitmap[] bitmapArr = this.f985b;
            return bitmapArr[i % bitmapArr.length];
        }

        public boolean c(ktc ktcVar) {
            int iX = ktcVar.x();
            Bitmap[] bitmapArr = this.f985b;
            if (bitmapArr == null) {
                this.f985b = new Bitmap[iX];
                return true;
            }
            if (bitmapArr.length == iX) {
                return false;
            }
            this.f985b = new Bitmap[iX];
            return true;
        }

        public /* synthetic */ b(age ageVar, a aVar) {
            this();
        }
    }
}
