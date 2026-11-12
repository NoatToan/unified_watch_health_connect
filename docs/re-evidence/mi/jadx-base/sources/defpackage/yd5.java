package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class yd5 extends age {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f40062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public YAxis f40063b;
    public XAxis c;
    public hwq d;
    public xd5 e;
    public String f;
    public boolean g;
    public float[] h;
    public int[] i;
    public HashMap<erc, b> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f40064k;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40065a;

        static {
            int[] iArr = new int[LineDataSet.Mode.values().length];
            f40065a = iArr;
            try {
                iArr[LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40065a[LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40065a[LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40065a[LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Path f40066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap[] f40067b;

        public void a(ktc ktcVar, boolean z, boolean z2) {
            int iX = ktcVar.x();
            float fB0 = ktcVar.B0();
            float fS = ktcVar.S();
            for (int i = 0; i < iX; i++) {
                int i2 = (int) (((double) fB0) * 2.1d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.f40067b[i] = bitmapCreateBitmap;
                yd5.this.mRenderPaint.setColor(ktcVar.P(i));
                if (z2) {
                    this.f40066a.reset();
                    this.f40066a.addCircle(fB0, fB0, fB0, Path.Direction.CW);
                    this.f40066a.addCircle(fB0, fB0, fS, Path.Direction.CCW);
                    canvas.drawPath(this.f40066a, yd5.this.mRenderPaint);
                } else {
                    canvas.drawCircle(fB0, fB0, fB0, yd5.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(fB0, fB0, fS, yd5.this.mCirclePaintInner);
                    }
                }
            }
        }

        public Bitmap b(int i) {
            Bitmap[] bitmapArr = this.f40067b;
            return bitmapArr[i % bitmapArr.length];
        }

        public boolean c(ktc ktcVar) {
            int iX = ktcVar.x();
            Bitmap[] bitmapArr = this.f40067b;
            if (bitmapArr == null) {
                this.f40067b = new Bitmap[iX];
                return true;
            }
            if (bitmapArr.length == iX) {
                return false;
            }
            this.f40067b = new Bitmap[iX];
            return true;
        }

        public b() {
            this.f40066a = new Path();
        }
    }

    public yd5(cge cgeVar, cu3 cu3Var, hwq hwqVar, YAxis yAxis, XAxis xAxis, xd5 xd5Var) {
        super(cgeVar, cu3Var, hwqVar);
        this.f40062a = new float[4];
        this.g = false;
        this.j = new HashMap<>();
        this.f40064k = new float[2];
        this.f40063b = yAxis;
        this.c = xAxis;
        this.d = hwqVar;
        this.e = xd5Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.age
    public void drawCircles(Canvas canvas) {
        b bVar;
        Bitmap bitmapB;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float fI = this.mAnimator.i();
        float[] fArr = this.f40064k;
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
                if (this.j.containsKey(ktcVar)) {
                    bVar = this.j.get(ktcVar);
                } else {
                    b bVar2 = new b();
                    this.j.put(ktcVar, bVar2);
                    bVar = bVar2;
                }
                if (bVar.c(ktcVar)) {
                    bVar.a(ktcVar, z, z2);
                }
                d12.a aVar = this.mXBounds;
                int i2 = aVar.c;
                int i3 = aVar.f14945a;
                int i4 = i2 + i3;
                while (i3 <= i4) {
                    ?? I = ktcVar.i(i3);
                    if (I == 0) {
                        break;
                    }
                    this.f40064k[c] = I.getX();
                    this.f40064k[1] = I.getY() * fI;
                    if (!this.e.x || I.getY() != f) {
                        transformer.k(this.f40064k);
                        float fI2 = (AppUtil.isRTLDirection() && this.e.B) ? (this.d.i() + this.d.I()) - this.f40064k[c] : this.f40064k[c];
                        if (AppUtil.isRTLDirection() && this.e.B) {
                            if (!this.d.B(fI2)) {
                                break;
                            }
                            if (this.d.C(fI2) && this.d.F(this.f40064k[1])) {
                                bitmapB = bVar.b(i3);
                                if (bitmapB != null) {
                                    canvas.drawBitmap(bitmapB, fI2 - fB0, this.f40064k[1] - fB0, (Paint) null);
                                }
                            }
                        } else {
                            if (!this.d.C(fI2)) {
                                break;
                            }
                            if (this.d.B(fI2) && this.d.F(this.f40064k[1])) {
                                bitmapB = bVar.b(i3);
                                if (bitmapB != null) {
                                    canvas.drawBitmap(bitmapB, fI2 - fB0, this.f40064k[1] - fB0, (Paint) null);
                                }
                            }
                        }
                    }
                    i3++;
                    c = 0;
                    f = 0.0f;
                }
            }
            i++;
            c = 0;
            f = 0.0f;
        }
    }

    @Override // defpackage.age
    public void drawDataSet(Canvas canvas, ktc ktcVar) {
        cge cgeVar = this.mChart;
        if ((cgeVar instanceof CustomLineChart) && ((CustomLineChart) cgeVar).getMLineChartAttr().h != 0) {
            f(canvas);
            return;
        }
        if (ktcVar.O0() < 1) {
            return;
        }
        this.mRenderPaint.setStrokeWidth(DisplayUtil.dip2px(this.e.o));
        this.mRenderPaint.setPathEffect(ktcVar.F());
        int i = a.f40065a[ktcVar.getMode().ordinal()];
        if (i == 3) {
            e(canvas, ktcVar);
        } else if (i != 4) {
            drawLinear(canvas, ktcVar);
        } else {
            drawHorizontalBezier(ktcVar);
        }
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0234  */
    /* JADX WARN: Code duplicated, block: B:103:0x0246 A[PHI: r5
      0x0246: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v13 int), (r5v14 int), (r5v18 int), (r5v19 int), (r5v2 int) binds: [B:81:0x01c3, B:82:0x01c5, B:123:0x02dd, B:122:0x02c9, B:104:0x0249, B:102:0x0234, B:89:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0249  */
    /* JADX WARN: Code duplicated, block: B:105:0x025e  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:127:0x030f  */
    /* JADX WARN: Code duplicated, block: B:130:0x032c  */
    /* JADX WARN: Code duplicated, block: B:131:0x033f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0354  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0204  */
    /* JADX WARN: Code duplicated, block: B:99:0x0217  */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.github.mikephil.charting.data.Entry, j72] */
    /* JADX WARN: Type inference failed for: r3v35, types: [com.github.mikephil.charting.data.Entry, j72] */
    @Override // defpackage.age
    public void drawLinear(Canvas canvas, ktc ktcVar) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        int iO0 = ktcVar.O0();
        int i4 = ktcVar.o0() ? 4 : 2;
        ryp transformer = this.mChart.getTransformer(ktcVar.m0());
        float fI = this.mAnimator.i();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = ktcVar.d() ? this.mBitmapCanvas : canvas;
        this.mXBounds.a(this.mChart, ktcVar);
        if (ktcVar.C0() && iO0 > 0) {
            drawLinearFill(canvas, ktcVar, transformer, this.mXBounds);
        }
        float f = 0.0f;
        if (ktcVar.i0().size() > 1) {
            int i5 = i4 * 2;
            if (this.f40062a.length <= i5) {
                this.f40062a = new float[i4 * 4];
            }
            int i6 = this.mXBounds.f14945a;
            while (true) {
                d12.a aVar = this.mXBounds;
                if (i6 > aVar.c + aVar.f14945a) {
                    break;
                }
                ?? I = ktcVar.i(i6);
                if (I != 0 && (!this.e.x || I.getY() != f)) {
                    this.f40062a[0] = I.getX();
                    this.f40062a[1] = I.getY() * fI;
                    if (i6 < this.mXBounds.f14946b) {
                        ?? I2 = ktcVar.i(i6 + 1);
                        if (I2 == 0) {
                            break;
                        }
                        this.f40062a[2] = I2.getX();
                        this.f40062a[3] = I2.getY() * fI;
                    } else {
                        float[] fArr2 = this.f40062a;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.k(this.f40062a);
                    int i7 = 0;
                    while (true) {
                        fArr = this.f40062a;
                        if (i7 >= fArr.length) {
                            break;
                        }
                        if (i7 % 2 == 0) {
                            fArr[i7] = (AppUtil.isRTLDirection() && this.e.B) ? (this.d.i() + this.d.I()) - this.f40062a[i7] : this.f40062a[i7];
                        }
                        i7++;
                    }
                    float f2 = fArr[0];
                    float f3 = fArr[2];
                    if (!this.d.C(f2)) {
                        break;
                    }
                    if (this.d.B(f3) && (this.d.D(this.f40062a[1]) || this.d.A(this.f40062a[3]))) {
                        if (i6 < this.mXBounds.f14946b) {
                            Paint paint = this.mRenderPaint;
                            float[] fArr3 = this.f40062a;
                            paint.setShader(new LinearGradient(f2, fArr3[1], f3, fArr3[3], ktcVar.E0(i6), ktcVar.E0(i6 + 1), Shader.TileMode.MIRROR));
                        } else {
                            this.mRenderPaint.setColor(ktcVar.E0(i6));
                        }
                        this.mRenderPaint.setStrokeCap(Paint.Cap.ROUND);
                        if (this.e.q) {
                            canvas2.drawLines(this.f40062a, 0, i5, this.mRenderPaint);
                        }
                    }
                }
                i6++;
                f = 0.0f;
            }
            i(canvas2, ktcVar);
        } else {
            int i8 = iO0 * i4;
            if (this.f40062a.length < Math.max(i8, i4) * 2) {
                this.f40062a = new float[Math.max(i8, i4) * 4];
            }
            if (ktcVar.i(this.mXBounds.f14945a) != 0) {
                float axisMaximum = this.f40063b.getAxisMaximum() - this.f40063b.getAxisMinimum();
                int i9 = this.mXBounds.f14945a;
                int i10 = 0;
                while (true) {
                    d12.a aVar2 = this.mXBounds;
                    if (i9 > aVar2.c + aVar2.f14945a) {
                        break;
                    }
                    Entry entryI = ktcVar.i(i9 == 0 ? 0 : i9 - 1);
                    Entry entryI2 = ktcVar.i(i9);
                    if (entryI != null && entryI2 != null) {
                        if (this.e.x) {
                            if (entryI.getY() != 0.0f) {
                                if (entryI2.getY() != 0.0f) {
                                    if (this.e.y) {
                                        this.f40062a[i10] = entryI.getX();
                                        this.f40062a[i10 + 1] = l(entryI);
                                        int i11 = i10 + 3;
                                        this.f40062a[i10 + 2] = entryI2.getX();
                                        i10 += 4;
                                        this.f40062a[i11] = l(entryI2);
                                    } else if (entryI2.getX() - entryI.getX() == 1.0f) {
                                        if (entryI.getY() < 0.0f) {
                                            int i12 = i10 + 1;
                                            this.f40062a[i10] = entryI.getX();
                                            i3 = i10 + 2;
                                            this.f40062a[i12] = (-axisMaximum) / 100.0f;
                                        } else {
                                            int i13 = i10 + 1;
                                            this.f40062a[i10] = entryI.getX();
                                            i3 = i10 + 2;
                                            this.f40062a[i13] = l(entryI);
                                        }
                                        if (entryI2.getY() < 0.0f) {
                                            int i14 = i3 + 1;
                                            this.f40062a[i3] = entryI.getX();
                                            i10 = i3 + 2;
                                            this.f40062a[i14] = (-axisMaximum) / 100.0f;
                                        } else {
                                            int i15 = i3 + 1;
                                            this.f40062a[i3] = entryI.getX();
                                            i10 = i3 + 2;
                                            this.f40062a[i15] = l(entryI2);
                                        }
                                    } else {
                                        if (entryI2.getY() == entryI.getY()) {
                                        }
                                        if (entryI.getY() < 0.0f) {
                                            int i16 = i10 + 1;
                                            this.f40062a[i10] = entryI.getX();
                                            i = i10 + 2;
                                            this.f40062a[i16] = (-axisMaximum) / 100.0f;
                                        } else {
                                            int i17 = i10 + 1;
                                            this.f40062a[i10] = entryI.getX();
                                            i = i10 + 2;
                                            this.f40062a[i17] = l(entryI);
                                        }
                                        if (entryI2.getY() < 0.0f) {
                                            int i18 = i + 1;
                                            this.f40062a[i] = entryI2.getX();
                                            i10 = i + 2;
                                            this.f40062a[i18] = (-axisMaximum) / 100.0f;
                                        } else {
                                            int i19 = i + 1;
                                            this.f40062a[i] = entryI2.getX();
                                            i10 = i + 2;
                                            this.f40062a[i19] = l(entryI2);
                                        }
                                    }
                                }
                            }
                        } else if (this.e.y) {
                            this.f40062a[i10] = entryI.getX();
                            this.f40062a[i10 + 1] = l(entryI);
                            int i110 = i10 + 3;
                            this.f40062a[i10 + 2] = entryI2.getX();
                            i10 += 4;
                            this.f40062a[i110] = l(entryI2);
                        } else if (entryI2.getX() - entryI.getX() == 1.0f) {
                            if (entryI.getY() < 0.0f) {
                                int i111 = i10 + 1;
                                this.f40062a[i10] = entryI.getX();
                                i3 = i10 + 2;
                                this.f40062a[i111] = (-axisMaximum) / 100.0f;
                            } else {
                                int i112 = i10 + 1;
                                this.f40062a[i10] = entryI.getX();
                                i3 = i10 + 2;
                                this.f40062a[i112] = l(entryI);
                            }
                            if (entryI2.getY() < 0.0f) {
                                int i113 = i3 + 1;
                                this.f40062a[i3] = entryI.getX();
                                i10 = i3 + 2;
                                this.f40062a[i113] = (-axisMaximum) / 100.0f;
                            } else {
                                int i114 = i3 + 1;
                                this.f40062a[i3] = entryI.getX();
                                i10 = i3 + 2;
                                this.f40062a[i114] = l(entryI2);
                            }
                        } else if (entryI2.getY() == entryI.getY() || entryI2.getX() == 1.0f) {
                            if (entryI.getY() < 0.0f) {
                                int i115 = i10 + 1;
                                this.f40062a[i10] = entryI.getX();
                                i = i10 + 2;
                                this.f40062a[i115] = (-axisMaximum) / 100.0f;
                            } else {
                                int i116 = i10 + 1;
                                this.f40062a[i10] = entryI.getX();
                                i = i10 + 2;
                                this.f40062a[i116] = l(entryI);
                            }
                            if (entryI2.getY() < 0.0f) {
                                int i117 = i + 1;
                                this.f40062a[i] = entryI2.getX();
                                i10 = i + 2;
                                this.f40062a[i117] = (-axisMaximum) / 100.0f;
                            } else {
                                int i118 = i + 1;
                                this.f40062a[i] = entryI2.getX();
                                i10 = i + 2;
                                this.f40062a[i118] = l(entryI2);
                            }
                        } else {
                            if (entryI.getY() < 0.0f) {
                                float[] fArr4 = this.f40062a;
                                int i20 = i10 + 1;
                                float x = entryI.getX() - 1.0f;
                                float x2 = entryI.getX();
                                if (x > 0.0f) {
                                    x2 -= 1.0f;
                                }
                                fArr4[i10] = x2;
                                i2 = i10 + 2;
                                this.f40062a[i20] = (-axisMaximum) / 100.0f;
                            } else {
                                int i21 = i10 + 1;
                                this.f40062a[i10] = entryI.getX() - 1.0f > 0.0f ? entryI.getX() - 1.0f : entryI.getX();
                                i2 = i10 + 2;
                                this.f40062a[i21] = l(entryI);
                            }
                            if (entryI2.getY() < 0.0f) {
                                int i22 = i2 + 1;
                                this.f40062a[i2] = entryI2.getX();
                                i10 = i2 + 2;
                                this.f40062a[i22] = (-axisMaximum) / 100.0f;
                            } else {
                                int i23 = i2 + 1;
                                this.f40062a[i2] = entryI2.getX();
                                i10 = i2 + 2;
                                this.f40062a[i23] = l(entryI2);
                            }
                        }
                    }
                    i9++;
                }
                if (i10 > 0) {
                    transformer.k(this.f40062a);
                    int i24 = 0;
                    while (true) {
                        float[] fArr5 = this.f40062a;
                        if (i24 >= fArr5.length) {
                            break;
                        }
                        if (i24 % 2 == 0) {
                            fArr5[i24] = (AppUtil.isRTLDirection() && this.e.B) ? (this.d.i() + this.d.I()) - this.f40062a[i24] : this.f40062a[i24];
                        }
                        i24++;
                    }
                    Math.max((this.mXBounds.c + 1) * i4, i4);
                    this.mRenderPaint.setColor(ktcVar.n0());
                    this.mRenderPaint.setStrokeWidth(DisplayUtil.dip2px(this.e.o));
                    this.mRenderPaint.setStrokeCap(Paint.Cap.ROUND);
                    if (this.g) {
                        this.mRenderPaint.setShader(new LinearGradient(0.0f, this.d.p().top, 0.0f, this.d.p().bottom, this.i, this.h, Shader.TileMode.CLAMP));
                    }
                    if (this.e.q) {
                        canvas2.drawLines(this.f40062a, 0, i10, this.mRenderPaint);
                    }
                }
                i(canvas2, ktcVar);
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    @Override // defpackage.age
    public void drawLinearFill(Canvas canvas, ktc ktcVar, ryp rypVar, d12.a aVar) {
        if (AppUtil.isRTLDirection() && this.e.B) {
            h(canvas, ktcVar, rypVar, aVar);
        } else {
            g(canvas, ktcVar, rypVar, aVar);
        }
    }

    public void e(Canvas canvas, ktc ktcVar) {
        Math.max(0.0f, Math.min(1.0f, this.mAnimator.h()));
        float fI = this.mAnimator.i();
        ryp transformer = this.mChart.getTransformer(ktcVar.m0());
        this.mXBounds.a(this.mChart, ktcVar);
        float fC0 = ktcVar.c0();
        this.cubicPath.reset();
        d12.a aVar = this.mXBounds;
        int i = 1;
        if (aVar.c >= 1) {
            int i2 = aVar.f14945a;
            Entry entryI = ktcVar.i(Math.max(i2 - 1, 0));
            Entry entryI2 = ktcVar.i(Math.max(i2, 0));
            if (entryI2 != null) {
                this.cubicPath.moveTo(entryI2.getX(), l(entryI2));
                float f = fC0;
                int i3 = this.mXBounds.f14945a + 1;
                int i4 = -1;
                Entry entry = entryI2;
                while (true) {
                    d12.a aVar2 = this.mXBounds;
                    if (i3 > aVar2.c + aVar2.f14945a) {
                        break;
                    }
                    if (i4 != i3) {
                        entryI2 = ktcVar.i(i3);
                    }
                    int i5 = i3 + 1;
                    if (i5 < ktcVar.O0()) {
                        i3 = i5;
                    }
                    Entry entryI3 = ktcVar.i(i3);
                    if (entryI2 instanceof RecyclerBarEntry) {
                        int i6 = ((RecyclerBarEntry) entryI2).isMinMax;
                        f = (i6 == i || i6 == -2 || i6 == -1 || i6 == 2) ? 0.01f : fC0;
                    }
                    this.cubicPath.cubicTo(entry.getX() + ((entryI2.getX() - entryI.getX()) * f), (l(entry) + ((l(entryI2) - l(entryI)) * f)) * fI, entryI2.getX() - ((entryI3.getX() - entry.getX()) * f), (l(entryI2) - ((l(entryI3) - l(entry)) * f)) * fI, entryI2.getX(), l(entryI2) * fI);
                    entryI = entry;
                    i = 1;
                    entry = entryI2;
                    entryI2 = entryI3;
                    i4 = i3;
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
        this.mRenderPaint.setStrokeWidth(DisplayUtil.dip2px(this.e.o));
        transformer.i(this.cubicPath);
        canvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
        i(canvas, ktcVar);
    }

    public void f(Canvas canvas) {
        this.mRenderPaint.setColor(x44.a(aji.u));
        canvas.drawRoundRect(new RectF(this.d.h(), this.d.j(), this.d.i(), this.d.f()), DisplayUtil.dip2px(1.0f), DisplayUtil.dip2px(1.0f), this.mRenderPaint);
    }

    public final void g(Canvas canvas, ktc ktcVar, ryp rypVar, d12.a aVar) {
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

    public final void generateFilledPath(ktc ktcVar, int i, int i2, Path path) {
        float fA = ktcVar.B().a(ktcVar, this.mChart);
        float fMax = this.e.A ? Math.max(fA, this.f40063b.getAxisMaximum()) : Math.min(fA, this.f40063b.getAxisMinimum());
        this.mAnimator.i();
        ktcVar.getMode();
        LineDataSet.Mode mode = LineDataSet.Mode.LINEAR;
        path.reset();
        Entry entryI = ktcVar.i(i);
        float axisMaximum = (AppUtil.isRTLDirection() && this.e.B) ? this.c.getAxisMaximum() - entryI.getX() : entryI.getX();
        path.moveTo(axisMaximum, fMax);
        path.lineTo(axisMaximum, l(entryI));
        int i3 = i + 1;
        Entry entryI2 = null;
        while (i3 <= i2) {
            entryI2 = ktcVar.i(i3);
            float axisMaximum2 = (AppUtil.isRTLDirection() && this.e.B) ? this.c.getAxisMaximum() - entryI2.getX() : entryI2.getX();
            if (AppUtil.isRTLDirection() && this.e.B) {
                this.c.getAxisMaximum();
            }
            entryI.getX();
            if (this.e.y && entryI2.getX() - entryI.getX() == 1.0f) {
                if (this.e.x && (entryI.getY() == 0.0f || entryI2.getY() == 0.0f)) {
                    path.lineTo(entryI.getX(), fMax);
                } else {
                    path.lineTo(entryI.getX(), l(entryI2));
                }
            } else if (!this.e.x) {
                path.lineTo(axisMaximum2, l(entryI2));
            } else if (entryI.getY() == 0.0f || entryI2.getY() == 0.0f) {
                path.lineTo(axisMaximum2, fMax);
            } else {
                path.lineTo(axisMaximum2, l(entryI2));
            }
            i3++;
            entryI = entryI2;
        }
        if (entryI2 != null) {
            path.lineTo((AppUtil.isRTLDirection() && this.e.B) ? this.c.getAxisMaximum() - entryI2.getX() : entryI2.getX(), fMax);
        }
        path.close();
    }

    public final void h(Canvas canvas, ktc ktcVar, ryp rypVar, d12.a aVar) {
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

    public final void i(Canvas canvas, ktc ktcVar) {
        RecyclerBarEntry recyclerBarEntry;
        int i;
        this.mXBounds.a(this.mChart, ktcVar);
        if (this.mXBounds.c < 1) {
            return;
        }
        ryp transformer = this.mChart.getTransformer(ktcVar.m0());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        int i2 = this.mXBounds.f14945a;
        while (true) {
            d12.a aVar = this.mXBounds;
            if (i2 > aVar.c + aVar.f14945a) {
                return;
            }
            Entry entryI = ktcVar.i(i2);
            if ((entryI instanceof RecyclerBarEntry) && ((i = (recyclerBarEntry = (RecyclerBarEntry) entryI).isMinMax) == 1 || i == -1)) {
                vye vyeVarE = transformer.e(entryI.getX(), l(entryI));
                int color = paint.getColor();
                float fDip2px = (float) vyeVarE.c;
                if (AppUtil.isRTLDirection() && this.e.B) {
                    fDip2px = (this.d.i() + this.d.I()) - fDip2px;
                }
                float f = (float) vyeVarE.d;
                Paint.Style style = paint.getStyle();
                paint.setColor(x44.a(aji.w));
                paint.setStrokeWidth(10.0f);
                paint.setStyle(Paint.Style.STROKE);
                int iN0 = ktcVar.n0();
                if (ktcVar.i0().size() > 0) {
                    iN0 = ktcVar.E0(i2);
                }
                if (recyclerBarEntry.isMinMax == 1) {
                    d12.a aVar2 = this.mXBounds;
                    int i3 = aVar2.c;
                    int i4 = aVar2.f14945a;
                    if (i2 == i3 + i4) {
                        fDip2px -= DisplayUtil.dip2px(5.0f);
                    } else if (i2 == i4) {
                        fDip2px += DisplayUtil.dip2px(5.0f);
                    }
                    if (this.e.t) {
                        canvas.drawCircle(fDip2px, f, DisplayUtil.dip2px(5.0f), paint);
                        paint.setColor(iN0);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawCircle(fDip2px, f, DisplayUtil.dip2px(3.5f), paint);
                        j(canvas, fDip2px, f, paint);
                    }
                } else if (this.e.u) {
                    canvas.drawCircle(fDip2px, f, DisplayUtil.dip2px(5.0f), paint);
                    paint.setColor(iN0);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(fDip2px, f, DisplayUtil.dip2px(3.5f), paint);
                    if (this.f40063b.o()) {
                        j(canvas, fDip2px, f, paint);
                    }
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
            i2++;
        }
    }

    public final void j(Canvas canvas, float f, float f2, Paint paint) {
        if (TextUtils.isEmpty(this.f) || !this.e.s) {
            return;
        }
        RectF rectF = new RectF();
        paint.setTextSize(DisplayUtil.sp2px(12.0f));
        int iDip2px = DisplayUtil.dip2px(12.0f);
        int iDip2px2 = DisplayUtil.dip2px(5.0f);
        float fMeasureText = paint.measureText(this.f) + (iDip2px * 2);
        float fI = o8p.i(paint) + (iDip2px2 * 2);
        float f3 = fMeasureText / 2.0f;
        float fH = f - f3;
        float fI2 = f + f3;
        if (fH <= this.d.h()) {
            fH = this.d.h() + DisplayUtil.dip2px(2.0f);
            fI2 = fH + fMeasureText;
        } else if (fI2 >= this.d.i()) {
            fI2 = this.d.i() - DisplayUtil.dip2px(2.0f);
            fH = fI2 - fMeasureText;
        }
        float fDip2px = f2 - DisplayUtil.dip2px(8.0f);
        rectF.set(fH, fDip2px - fI, fI2, fDip2px);
        float fDip2px2 = DisplayUtil.dip2px(13.0f);
        canvas.drawRoundRect(rectF, fDip2px2, fDip2px2, paint);
        paint.setColor(x44.a(aji.common_white));
        canvas.drawText(this.f, fH + iDip2px, o8p.h(rectF, paint), paint);
    }

    public void k(Canvas canvas, ktc ktcVar) {
        int iO0 = ktcVar.O0();
        if (!this.e.z || iO0 <= 0) {
            return;
        }
        this.mXBounds.a(this.mChart, ktcVar);
        d12.a aVar = this.mXBounds;
        int i = aVar.f14945a;
        int i2 = aVar.f14946b;
        if (i < 0 || i2 < 0 || i == i2) {
            return;
        }
        ryp transformer = this.mChart.getTransformer(ktcVar.m0());
        Entry entryI = ktcVar.i(i);
        Entry entryI2 = ktcVar.i(i2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.e.f39009k);
        if (entryI instanceof RecyclerBarEntry) {
            vye vyeVarE = transformer.e(entryI.getX(), l(entryI));
            float f = (float) vyeVarE.c;
            float f2 = (float) vyeVarE.d;
            paint.setColor(-1);
            canvas.drawCircle(f, f2, DisplayUtil.dip2px(5.0f), paint);
            paint.setColor(this.e.f39009k);
            canvas.drawCircle(f, f2, DisplayUtil.dip2px(3.3f), paint);
        }
        if (entryI2 instanceof RecyclerBarEntry) {
            vye vyeVarE2 = transformer.e(entryI2.getX(), l(entryI2));
            float f3 = (float) vyeVarE2.c;
            float f4 = (float) vyeVarE2.d;
            paint.setColor(-1);
            canvas.drawCircle(f3, f4, DisplayUtil.dip2px(5.0f), paint);
            paint.setColor(this.e.f39009k);
            canvas.drawCircle(f3, f4, DisplayUtil.dip2px(3.3f), paint);
        }
    }

    public final float l(Entry entry) {
        float fI = this.mAnimator.i();
        float axisMaximum = this.f40063b.getAxisMaximum();
        if (this.f40063b.o() && entry.getY() >= this.f40063b.getAxisMinimum()) {
            return ((axisMaximum - entry.getY()) + this.f40063b.getAxisMinimum()) * fI;
        }
        float y = entry.getY();
        return y * fI;
    }

    public void m(xd5 xd5Var) {
        this.e = xd5Var;
    }

    public void n(String str) {
        this.f = str;
    }

    public void setHeartLine(boolean z, List<Float> list, List<Integer> list2) {
        this.g = z;
        int size = list.size() + 1;
        float[] fArr = new float[size];
        float axisMaximum = ((LineChart) this.mChart).getAxisLeft().getAxisMaximum();
        float axisMinimum = axisMaximum - ((LineChart) this.mChart).getAxisLeft().getAxisMinimum();
        int size2 = list.size() - 1;
        for (int i = size2; i >= 0; i--) {
            int i2 = size2 - i;
            if (i != size2) {
                fArr[i2] = ((list.get(i + 1).floatValue() - list.get(i).floatValue()) / axisMinimum) + fArr[i2 - 1];
            } else {
                fArr[i2] = (axisMaximum - list.get(i).floatValue()) / axisMinimum;
            }
        }
        this.h = new float[size * 2];
        this.i = new int[list2.size() * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int size3 = (list2.size() - i4) - 1;
            this.i[i3] = list2.get(size3).intValue();
            int i5 = i3 + 1;
            this.i[i5] = list2.get(size3).intValue();
            if (i4 == 0) {
                this.h[i3] = 0.0f;
            } else {
                this.h[i3] = fArr[i4 - 1];
            }
            this.h[i5] = fArr[i4];
            i3 += 2;
        }
    }
}
