package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class yee extends qkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f40095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f40096b;
    public Legend c;
    public List<com.github.mikephil.charting.components.a> d;
    public Paint.FontMetrics e;
    public Path f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40098b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[Legend.LegendForm.values().length];
            d = iArr;
            try {
                iArr[Legend.LegendForm.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[Legend.LegendForm.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[Legend.LegendForm.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[Legend.LegendForm.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[Legend.LegendForm.SQUARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[Legend.LegendForm.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Legend.LegendOrientation.values().length];
            c = iArr2;
            try {
                iArr2[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[Legend.LegendOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            f40098b = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40098b[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40098b[Legend.LegendVerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[Legend.LegendHorizontalAlignment.values().length];
            f40097a = iArr4;
            try {
                iArr4[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40097a[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40097a[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public yee(hwq hwqVar, Legend legend) {
        super(hwqVar);
        this.d = new ArrayList(16);
        this.e = new Paint.FontMetrics();
        this.f = new Path();
        this.c = legend;
        Paint paint = new Paint(1);
        this.f40095a = paint;
        paint.setTextSize(fmq.e(9.0f));
        this.f40095a.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f40096b = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    /* JADX WARN: Code duplicated, block: B:53:0x0182  */
    public void a(fu3<?> fu3Var) {
        int i;
        String label;
        fu3<?> fu3Var2;
        String str;
        fu3<?> fu3Var3 = fu3Var;
        if (!this.c.w()) {
            this.d.clear();
            int i2 = 0;
            while (i2 < fu3Var.j()) {
                erc ercVarI = fu3Var3.i(i2);
                if (ercVarI == null) {
                    fu3Var2 = fu3Var3;
                } else {
                    List<Integer> listI0 = ercVarI.i0();
                    int iO0 = ercVarI.O0();
                    if (ercVarI instanceof gpc) {
                        gpc gpcVar = (gpc) ercVarI;
                        if (gpcVar.N()) {
                            String[] strArrO = gpcVar.O();
                            int iMin = Math.min(listI0.size(), gpcVar.o());
                            for (int i3 = 0; i3 < iMin; i3++) {
                                if (strArrO.length > 0) {
                                    int i4 = i3 % iMin;
                                    str = i4 < strArrO.length ? strArrO[i4] : null;
                                } else {
                                    str = null;
                                }
                                this.d.add(new com.github.mikephil.charting.components.a(str, ercVarI.e(), ercVarI.j(), ercVarI.G(), ercVarI.C(), listI0.get(i3).intValue()));
                            }
                            if (gpcVar.getLabel() != null) {
                                this.d.add(new com.github.mikephil.charting.components.a(ercVarI.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, 1122867));
                            }
                            fu3Var2 = fu3Var3;
                        }
                    }
                    if (ercVarI instanceof cwc) {
                        cwc cwcVar = (cwc) ercVarI;
                        for (int i5 = 0; i5 < listI0.size() && i5 < iO0; i5++) {
                            this.d.add(new com.github.mikephil.charting.components.a(cwcVar.i(i5).c(), ercVarI.e(), ercVarI.j(), ercVarI.G(), ercVarI.C(), listI0.get(i5).intValue()));
                        }
                        if (cwcVar.getLabel() != null) {
                            this.d.add(new com.github.mikephil.charting.components.a(ercVarI.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, 1122867));
                        }
                    } else if (ercVarI instanceof vpc) {
                        vpc vpcVar = (vpc) ercVarI;
                        if (vpcVar.T() != 1122867) {
                            int iT = vpcVar.T();
                            int iT2 = vpcVar.t();
                            this.d.add(new com.github.mikephil.charting.components.a(null, ercVarI.e(), ercVarI.j(), ercVarI.G(), ercVarI.C(), iT));
                            this.d.add(new com.github.mikephil.charting.components.a(ercVarI.getLabel(), ercVarI.e(), ercVarI.j(), ercVarI.G(), ercVarI.C(), iT2));
                        } else {
                            for (i = 0; i < listI0.size() && i < iO0; i++) {
                                if (i < listI0.size() - 1 || i >= iO0 - 1) {
                                    label = fu3Var.i(i2).getLabel();
                                } else {
                                    label = null;
                                }
                                this.d.add(new com.github.mikephil.charting.components.a(label, ercVarI.e(), ercVarI.j(), ercVarI.G(), ercVarI.C(), listI0.get(i).intValue()));
                            }
                        }
                    } else {
                        while (i < listI0.size()) {
                            if (i < listI0.size() - 1) {
                                label = fu3Var.i(i2).getLabel();
                            } else {
                                label = fu3Var.i(i2).getLabel();
                            }
                            this.d.add(new com.github.mikephil.charting.components.a(label, ercVarI.e(), ercVarI.j(), ercVarI.G(), ercVarI.C(), listI0.get(i).intValue()));
                        }
                    }
                    fu3Var2 = fu3Var;
                }
                i2++;
                fu3Var3 = fu3Var2;
            }
            if (this.c.g() != null) {
                Collections.addAll(this.d, this.c.g());
            }
            this.c.x(this.d);
        }
        Typeface typeface = this.c.getTypeface();
        if (typeface != null) {
            this.f40095a.setTypeface(typeface);
        }
        this.f40095a.setTextSize(this.c.getTextSize());
        this.f40095a.setColor(this.c.getTextColor());
        this.c.a(this.f40095a, this.mViewPortHandler);
    }

    public void b(Canvas canvas, float f, float f2, com.github.mikephil.charting.components.a aVar, Legend legend) {
        int i = aVar.f;
        if (i == 1122868 || i == 1122867 || i == 0) {
            return;
        }
        int iSave = canvas.save();
        Legend.LegendForm legendFormH = aVar.f7796b;
        if (legendFormH == Legend.LegendForm.DEFAULT) {
            legendFormH = legend.h();
        }
        this.f40096b.setColor(aVar.f);
        float fE = fmq.e(Float.isNaN(aVar.c) ? legend.k() : aVar.c);
        float f3 = fE / 2.0f;
        int i2 = a.d[legendFormH.ordinal()];
        if (i2 == 3 || i2 == 4) {
            this.f40096b.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f + f3, f2, f3, this.f40096b);
        } else if (i2 == 5) {
            this.f40096b.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, f2 - f3, f + fE, f2 + f3, this.f40096b);
        } else if (i2 == 6) {
            float fE2 = fmq.e(Float.isNaN(aVar.d) ? legend.j() : aVar.d);
            DashPathEffect dashPathEffectI = aVar.e;
            if (dashPathEffectI == null) {
                dashPathEffectI = legend.i();
            }
            this.f40096b.setStyle(Paint.Style.STROKE);
            this.f40096b.setStrokeWidth(fE2);
            this.f40096b.setPathEffect(dashPathEffectI);
            this.f.reset();
            this.f.moveTo(f, f2);
            this.f.lineTo(f + fE, f2);
            canvas.drawPath(this.f, this.f40096b);
        }
        canvas.restoreToCount(iSave);
    }

    public void c(Canvas canvas, float f, float f2, String str) {
        canvas.drawText(str, f, f2, this.f40095a);
    }

    public Paint d() {
        return this.f40095a;
    }

    public void e(Canvas canvas) {
        float fN;
        float f;
        float f2;
        List<Boolean> list;
        List<fm8> list2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        float fJ;
        float f7;
        Legend.LegendDirection legendDirection;
        com.github.mikephil.charting.components.a aVar;
        float fD;
        if (this.c.isEnabled()) {
            Typeface typeface = this.c.getTypeface();
            if (typeface != null) {
                this.f40095a.setTypeface(typeface);
            }
            this.f40095a.setTextSize(this.c.getTextSize());
            this.f40095a.setColor(this.c.getTextColor());
            float fL = fmq.l(this.f40095a, this.e);
            float fN2 = fmq.n(this.f40095a, this.e) + fmq.e(this.c.u());
            float fA = fL - (fmq.a(this.f40095a, "ABC") / 2.0f);
            com.github.mikephil.charting.components.a[] aVarArrF = this.c.f();
            float fE = fmq.e(this.c.l());
            float fE2 = fmq.e(this.c.t());
            Legend.LegendOrientation legendOrientationQ = this.c.q();
            Legend.LegendHorizontalAlignment legendHorizontalAlignmentM = this.c.m();
            Legend.LegendVerticalAlignment legendVerticalAlignmentS = this.c.s();
            Legend.LegendDirection legendDirectionE = this.c.e();
            float fE3 = fmq.e(this.c.k());
            float fE4 = fmq.e(this.c.r());
            float yOffset = this.c.getYOffset();
            float xOffset = this.c.getXOffset();
            int i2 = a.f40097a[legendHorizontalAlignmentM.ordinal()];
            float f8 = fE4;
            float f9 = fE2;
            if (i2 == 1) {
                fL = fL;
                fN2 = fN2;
                if (legendOrientationQ != Legend.LegendOrientation.VERTICAL) {
                    xOffset += this.mViewPortHandler.h();
                }
                fN = legendDirectionE == Legend.LegendDirection.RIGHT_TO_LEFT ? xOffset + this.c.f7786r : xOffset;
            } else if (i2 == 2) {
                fL = fL;
                fN2 = fN2;
                fN = (legendOrientationQ == Legend.LegendOrientation.VERTICAL ? this.mViewPortHandler.n() : this.mViewPortHandler.i()) - xOffset;
                if (legendDirectionE == Legend.LegendDirection.LEFT_TO_RIGHT) {
                    fN -= this.c.f7786r;
                }
            } else if (i2 != 3) {
                fL = fL;
                fN2 = fN2;
                fN = 0.0f;
            } else {
                Legend.LegendOrientation legendOrientation = Legend.LegendOrientation.VERTICAL;
                float fN3 = legendOrientationQ == legendOrientation ? this.mViewPortHandler.n() / 2.0f : this.mViewPortHandler.h() + (this.mViewPortHandler.k() / 2.0f);
                Legend.LegendDirection legendDirection2 = Legend.LegendDirection.LEFT_TO_RIGHT;
                fN = fN3 + (legendDirectionE == legendDirection2 ? xOffset : -xOffset);
                if (legendOrientationQ == legendOrientation) {
                    fN = (float) (((double) fN) + (legendDirectionE == legendDirection2 ? (((double) (-this.c.f7786r)) / 2.0d) + ((double) xOffset) : (((double) this.c.f7786r) / 2.0d) - ((double) xOffset)));
                } else {
                    fL = fL;
                }
            }
            int i3 = a.c[legendOrientationQ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                int i4 = a.f40098b[legendVerticalAlignmentS.ordinal()];
                if (i4 == 1) {
                    fJ = (legendHorizontalAlignmentM == Legend.LegendHorizontalAlignment.CENTER ? 0.0f : this.mViewPortHandler.j()) + yOffset;
                } else if (i4 == 2) {
                    fJ = (legendHorizontalAlignmentM == Legend.LegendHorizontalAlignment.CENTER ? this.mViewPortHandler.m() : this.mViewPortHandler.f()) - (this.c.s + yOffset);
                } else if (i4 != 3) {
                    fJ = 0.0f;
                } else {
                    float fM = this.mViewPortHandler.m() / 2.0f;
                    Legend legend = this.c;
                    fJ = (fM - (legend.s / 2.0f)) + legend.getYOffset();
                }
                float f10 = fJ;
                float f11 = 0.0f;
                boolean z = false;
                int i5 = 0;
                while (i5 < aVarArrF.length) {
                    com.github.mikephil.charting.components.a aVar2 = aVarArrF[i5];
                    boolean z2 = aVar2.f7796b != Legend.LegendForm.NONE;
                    float fE5 = Float.isNaN(aVar2.c) ? fE3 : fmq.e(aVar2.c);
                    if (z2) {
                        Legend.LegendDirection legendDirection3 = Legend.LegendDirection.LEFT_TO_RIGHT;
                        fD = legendDirectionE == legendDirection3 ? fN + f11 : fN - (fE5 - f11);
                        f7 = fN;
                        legendDirection = legendDirectionE;
                        b(canvas, fD, f10 + fA, aVar2, this.c);
                        if (legendDirection == legendDirection3) {
                            fD += fE5;
                        }
                        aVar = aVar2;
                    } else {
                        f7 = fN;
                        legendDirection = legendDirectionE;
                        aVar = aVar2;
                        fD = f7;
                    }
                    String str = aVar.f7795a;
                    if (str != null) {
                        if (z2 && !z) {
                            fD += legendDirection == Legend.LegendDirection.LEFT_TO_RIGHT ? fE : -fE;
                        } else if (z) {
                            fD = f7;
                        }
                        if (legendDirection == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            fD -= fmq.d(this.f40095a, str);
                        }
                        float f12 = fD;
                        if (z) {
                            f10 += fL + fN2;
                            c(canvas, f12, f10 + fL, aVar.f7795a);
                        } else {
                            c(canvas, f12, f10 + fL, aVar.f7795a);
                        }
                        f10 += fL + fN2;
                        f11 = 0.0f;
                    } else {
                        f11 += fE5 + f8;
                        z = true;
                    }
                    i5++;
                    legendDirectionE = legendDirection;
                    f8 = f8;
                    fA = fA;
                    fN = f7;
                }
                return;
            }
            float f13 = fN;
            float f14 = f8;
            List<fm8> listD = this.c.d();
            List<fm8> listC = this.c.c();
            List<Boolean> listB = this.c.b();
            int i6 = a.f40098b[legendVerticalAlignmentS.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    yOffset = i6 != 3 ? 0.0f : yOffset + ((this.mViewPortHandler.m() - this.c.s) / 2.0f);
                } else {
                    yOffset = (this.mViewPortHandler.m() - yOffset) - this.c.s;
                }
            }
            int length = aVarArrF.length;
            float f15 = f13;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                float f16 = f14;
                com.github.mikephil.charting.components.a aVar3 = aVarArrF[i7];
                float f17 = f15;
                int i9 = length;
                boolean z3 = aVar3.f7796b != Legend.LegendForm.NONE;
                float fE6 = Float.isNaN(aVar3.c) ? fE3 : fmq.e(aVar3.c);
                if (i7 >= listB.size() || !listB.get(i7).booleanValue()) {
                    f = f17;
                    f2 = yOffset;
                } else {
                    f2 = yOffset + fL + fN2;
                    f = f13;
                }
                if (f == f13 && legendHorizontalAlignmentM == Legend.LegendHorizontalAlignment.CENTER && i8 < listD.size()) {
                    f += (legendDirectionE == Legend.LegendDirection.RIGHT_TO_LEFT ? listD.get(i8).c : -listD.get(i8).c) / 2.0f;
                    i8++;
                }
                int i10 = i8;
                boolean z4 = aVar3.f7795a == null;
                if (z3) {
                    if (legendDirectionE == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f -= fE6;
                    }
                    float f18 = f;
                    list2 = listD;
                    i = i7;
                    list = listB;
                    b(canvas, f18, f2 + fA, aVar3, this.c);
                    f = legendDirectionE == Legend.LegendDirection.LEFT_TO_RIGHT ? f18 + fE6 : f18;
                } else {
                    list = listB;
                    list2 = listD;
                    i = i7;
                }
                if (z4) {
                    f3 = f9;
                    if (legendDirectionE == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f4 = f16;
                        f5 = -f4;
                    } else {
                        f4 = f16;
                        f5 = f4;
                    }
                    f15 = f + f5;
                } else {
                    if (z3) {
                        f += legendDirectionE == Legend.LegendDirection.RIGHT_TO_LEFT ? -fE : fE;
                    }
                    Legend.LegendDirection legendDirection4 = Legend.LegendDirection.RIGHT_TO_LEFT;
                    if (legendDirectionE == legendDirection4) {
                        f -= listC.get(i).c;
                    }
                    c(canvas, f, f2 + fL, aVar3.f7795a);
                    if (legendDirectionE == Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f += listC.get(i).c;
                    }
                    if (legendDirectionE == legendDirection4) {
                        f3 = f9;
                        f6 = -f3;
                    } else {
                        f3 = f9;
                        f6 = f3;
                    }
                    f15 = f + f6;
                    f4 = f16;
                }
                f9 = f3;
                f14 = f4;
                i7 = i + 1;
                yOffset = f2;
                length = i9;
                i8 = i10;
                listD = list2;
                listB = list;
            }
        }
    }
}
