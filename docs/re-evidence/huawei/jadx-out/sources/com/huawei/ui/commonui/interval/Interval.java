package com.huawei.ui.commonui.interval;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.ui.commonui.R;
import defpackage.qlm;
import defpackage.qlq;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class Interval extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23567a;
    private int aa;
    private int ab;
    private String ac;
    private final SparseArray<RectF> ad;
    private float ae;
    private final SparseArray<RectF> af;
    private final SparseArray<Paint> ag;
    private float ah;
    private final SparseArray<RectF> ai;
    private float aj;
    private int ak;
    private float al;
    private float am;
    private final SparseArray<TextPaint> an;
    private int ao;
    private float ap;
    private float aq;
    private float ar;
    private final SparseArray<Pair<Float, Float>> as;
    private float au;
    private int ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<Drawable> f23568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23569c;
    private final SparseArray<CharSequence> d;
    private Drawable e;
    private float f;
    private final List<IntervalData> g;
    private float h;
    private float i;
    private final SparseArray<Rect> j;
    private float k;
    private boolean l;
    private float m;
    private float n;
    private boolean o;
    private final PaintFlagsDrawFilter p;
    private float q;
    private final SparseArray<Map<IntervalData.RoundCornerType, RectF>> r;
    private final List<RectF> s;
    private final List<Paint> t;
    private int u;
    private int v;
    private float w;
    private final List<RectF> x;
    private final List<Paint> y;
    private float z;

    private float a(float f, float f2) {
        return f == 0.0f ? f2 : f;
    }

    private int b(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    private Drawable e(Drawable drawable, Drawable drawable2) {
        return drawable == null ? drawable2 : drawable;
    }

    public Interval(Context context) {
        super(context);
        this.p = new PaintFlagsDrawFilter(0, 3);
        this.g = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.j = new SparseArray<>();
        this.f23568b = new SparseArray<>();
        this.d = new SparseArray<>();
        this.an = new SparseArray<>();
        this.as = new SparseArray<>();
        this.ag = new SparseArray<>();
        this.ai = new SparseArray<>();
        this.af = new SparseArray<>();
        this.ad = new SparseArray<>();
        this.r = new SparseArray<>();
        e(context, (AttributeSet) null);
    }

    public Interval(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new PaintFlagsDrawFilter(0, 3);
        this.g = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.j = new SparseArray<>();
        this.f23568b = new SparseArray<>();
        this.d = new SparseArray<>();
        this.an = new SparseArray<>();
        this.as = new SparseArray<>();
        this.ag = new SparseArray<>();
        this.ai = new SparseArray<>();
        this.af = new SparseArray<>();
        this.ad = new SparseArray<>();
        this.r = new SparseArray<>();
        e(context, attributeSet);
    }

    public Interval(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new PaintFlagsDrawFilter(0, 3);
        this.g = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.j = new SparseArray<>();
        this.f23568b = new SparseArray<>();
        this.d = new SparseArray<>();
        this.an = new SparseArray<>();
        this.as = new SparseArray<>();
        this.ag = new SparseArray<>();
        this.ai = new SparseArray<>();
        this.af = new SparseArray<>();
        this.ad = new SparseArray<>();
        this.r = new SparseArray<>();
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            ReleaseLogUtil.d("Interval", "initTypedArray context ", context, " attributeSet ", attributeSet);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Interval);
        this.aa = typedArrayObtainStyledAttributes.getInteger(R.styleable.Interval_shadowVertical, 0);
        this.l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Interval_isShowIntervalShadow, true);
        this.o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Interval_isCursorOutBounds, true);
        this.f23567a = typedArrayObtainStyledAttributes.getFloat(R.styleable.Interval_intervalAlpha, 1.0f);
        this.f23569c = typedArrayObtainStyledAttributes.getColor(R.styleable.Interval_intervalColor, 0);
        this.u = typedArrayObtainStyledAttributes.getColor(R.styleable.Interval_intervalShadowStartColor, 0);
        this.v = typedArrayObtainStyledAttributes.getColor(R.styleable.Interval_intervalShadowEndColor, 0);
        this.z = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalSpace, 0.0f);
        this.au = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalWidth, 0.0f);
        this.i = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalHeight, 0.0f);
        this.w = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalShadowHeight, 0.0f);
        this.q = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalRoundCornerRadius, 0.0f);
        this.e = typedArrayObtainStyledAttributes.getDrawable(R.styleable.Interval_intervalCursor);
        this.f = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalCursorVerticalOffset, 0.0f);
        this.ac = typedArrayObtainStyledAttributes.getString(R.styleable.Interval_intervalText);
        this.ak = typedArrayObtainStyledAttributes.getColor(R.styleable.Interval_intervalTextColor, 0);
        this.aq = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalTextSize, 0.0f);
        this.ar = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalTextVerticalOffset, 0.0f);
        this.aj = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalTextEdgeStartOffset, 0.0f);
        this.am = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalTextEdgeEndOffset, 0.0f);
        this.ab = typedArrayObtainStyledAttributes.getColor(R.styleable.Interval_intervalTextBackgroundColor, 0);
        this.ae = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalTextBackgroundHeight, 0.0f);
        this.al = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalTextBackgroundVerticalOffset, 0.0f);
        this.ah = typedArrayObtainStyledAttributes.getDimension(R.styleable.Interval_intervalTextBackgroundRoundCornerRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private CharSequence a(CharSequence charSequence, String str) {
        return TextUtils.isEmpty(charSequence) ? str : charSequence;
    }

    private float a(Context context, qlq qlqVar) {
        TextPaint textPaintB = b(context, qlqVar);
        Paint.FontMetrics fontMetrics = textPaintB.getFontMetrics();
        if (fontMetrics == null) {
            return textPaintB.getTextSize();
        }
        return fontMetrics.descent - fontMetrics.ascent;
    }

    private Paint getPaint() {
        Paint paint = new Paint(1);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        return paint;
    }

    private Paint d(int i) {
        Paint paint = getPaint();
        paint.setColor(i);
        return paint;
    }

    private TextPaint b(Context context, qlq qlqVar) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setDither(true);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        int iB = b(qlqVar.d(context), this.ak);
        if (iB != 0) {
            textPaint.setColor(iB);
        }
        float fA = a(qlqVar.f(), this.aq);
        if (fA > 0.0f) {
            textPaint.setTextSize(fA);
        }
        Typeface typefaceG = qlqVar.g();
        if (typefaceG != null) {
            textPaint.setTypeface(typefaceG);
        }
        return textPaint;
    }

    public void setIntervalAlpha(float f) {
        this.f23567a = f;
        postInvalidate();
    }

    public void setIntervalDataList(List<IntervalData> list) {
        setIntervalDataList(BaseApplication.b(), list);
    }

    public void setIntervalDataList(Context context, List<IntervalData> list) {
        if (list == null) {
            ReleaseLogUtil.d("R_Interval", "setIntervalDataList list is null");
            return;
        }
        this.g.clear();
        this.g.addAll(list);
        if (context == null) {
            context = BaseApplication.b();
        }
        b(context);
    }

    private void b(Context context) {
        d();
        e(context);
        c(context);
        setDataList(context);
        if (this.n == this.ap && this.m == this.ax && this.k == this.ao) {
            postInvalidate();
            return;
        }
        requestLayout();
        this.n = this.ap;
        this.m = this.ax;
        this.k = this.ao;
    }

    private void e(Context context) {
        qlq qlqVarF;
        float fAbs;
        if (CollectionUtils.a(this.g)) {
            ReleaseLogUtil.d("Interval", "refreshTopOffset mIntervalDataList ", this.g);
            return;
        }
        float fMax = 0.0f;
        for (IntervalData intervalData : this.g) {
            if (intervalData != null && (qlqVarF = intervalData.f()) != null && !qlqVarF.i()) {
                float fA = a(qlqVarF.a(), this.ae);
                if (fA > 0.0f) {
                    fAbs = Math.abs(a(qlqVarF.b(), this.al)) + fA;
                } else {
                    fAbs = Math.abs(a(qlqVarF.h(), this.ar) + a(context, qlqVarF));
                }
                qlm qlmVarB = intervalData.b();
                if (qlmVarB != null) {
                    fAbs += Math.abs(a(qlmVarB.b(), this.f));
                }
                fMax = Math.max(fMax, fAbs);
            }
        }
        this.ap = fMax;
    }

    private void c(Context context) {
        float fA;
        float intrinsicHeight;
        float fAbs;
        Drawable drawableE;
        if (CollectionUtils.a(this.g)) {
            ReleaseLogUtil.d("Interval", "refreshWidthAndHeight mIntervalDataList ", this.g);
            return;
        }
        float fA2 = 0.0f;
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (IntervalData intervalData : this.g) {
            if (intervalData != null) {
                fA2 += a(intervalData.i(), this.au);
                float fA3 = a(intervalData.e(), this.w);
                int i = this.aa;
                if (i == 1) {
                    fA3 += a(intervalData.a(), this.i);
                } else if (i != 2) {
                    fA3 += a(intervalData.a(), this.i) / 2.0f;
                }
                qlm qlmVarB = intervalData.b();
                if (qlmVarB == null || (drawableE = e(qlmVarB.a(), this.e)) == null) {
                    fA = 0.0f;
                    intrinsicHeight = 0.0f;
                } else {
                    if (this.o) {
                        fMax = Math.max(fMax, drawableE.getIntrinsicWidth());
                    }
                    intrinsicHeight = drawableE.getIntrinsicHeight();
                    fA = a(qlmVarB.b(), this.f);
                }
                qlq qlqVarF = intervalData.f();
                if (qlqVarF == null || !qlqVarF.i()) {
                    fMax2 = Math.max(fMax2, fA3);
                } else {
                    float fA4 = a(qlqVarF.a(), this.ae);
                    if (fA4 > 0.0f) {
                        fAbs = Math.abs(fA) + intrinsicHeight + Math.abs(a(qlqVarF.b(), this.al)) + fA4;
                    } else {
                        fAbs = Math.abs(fA) + intrinsicHeight + Math.abs(a(qlqVarF.h(), this.ar)) + a(context, qlqVarF);
                    }
                    fMax2 = Math.max(fMax2, Math.max(fA3, fAbs));
                }
            }
        }
        this.ax = (int) UnitUtil.d(fA2 + (this.z * (this.g.size() - 1)) + fMax, 0);
        this.ao = (int) UnitUtil.d(fMax2 + this.ap, 0);
        this.h = fMax / 2.0f;
    }

    private void setDataList(Context context) {
        int i;
        if (CollectionUtils.a(this.g)) {
            ReleaseLogUtil.d("Interval", "setDataList mIntervalDataList ", this.g);
            return;
        }
        int size = this.g.size();
        float f = 0.0f;
        int i2 = 0;
        while (i2 < size) {
            IntervalData intervalData = this.g.get(i2);
            if (intervalData == null) {
                ReleaseLogUtil.d("Interval", "setDataList data is null");
                i = size;
            } else {
                this.t.add(d(b(intervalData.d(context), this.f23569c)));
                float fA = a(intervalData.i(), this.au);
                float fA2 = a(intervalData.a(), this.i);
                float f2 = f + (i2 == 0 ? this.h : this.z);
                float f3 = fA + f2;
                b(context, intervalData, fA2, f2, f3);
                float f4 = this.ap;
                float f5 = fA2 + f4;
                IntervalData.RoundCornerType roundCornerTypeD = intervalData.d();
                if (roundCornerTypeD != null) {
                    float fA3 = a(intervalData.c(), this.q);
                    HashMap map = new HashMap(2);
                    float f6 = 2.0f * fA3;
                    int i3 = AnonymousClass1.f23570c[roundCornerTypeD.ordinal()];
                    i = size;
                    if (i3 == 1) {
                        map.put(roundCornerTypeD, new RectF(f2, f4, f6 + f2, f5));
                        f2 += fA3;
                    } else if (i3 == 2) {
                        map.put(roundCornerTypeD, new RectF(f3 - f6, f4, f3, f5));
                        f3 -= fA3;
                    } else {
                        ReleaseLogUtil.d("Interval", "setDataList default type ", roundCornerTypeD);
                    }
                    if (!CollectionUtils.c(map)) {
                        this.r.append(i2, map);
                    }
                } else {
                    i = size;
                }
                this.s.add(new RectF(f2, f4, f3, f5));
                a(intervalData.b(), i2);
                b(context, intervalData.f(), i2);
                f = f3;
            }
            i2++;
            size = i;
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.commonui.interval.Interval$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f23570c;

        static {
            int[] iArr = new int[IntervalData.RoundCornerType.values().length];
            f23570c = iArr;
            try {
                iArr[IntervalData.RoundCornerType.EDGE_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23570c[IntervalData.RoundCornerType.EDGE_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void d() {
        this.s.clear();
        this.t.clear();
        this.x.clear();
        this.y.clear();
        this.j.clear();
        this.f23568b.clear();
        this.d.clear();
        this.an.clear();
        this.as.clear();
        this.ag.clear();
        this.ai.clear();
        this.af.clear();
        this.ad.clear();
        this.r.clear();
    }

    private void b(Context context, IntervalData intervalData, float f, float f2, float f3) {
        if (this.l) {
            int i = this.aa;
            if (i != 1) {
                f = i != 2 ? f / 2.0f : 0.0f;
            }
            float f4 = f + this.ap;
            float fA = a(intervalData.e(), this.w) + this.ap;
            int iB = b(intervalData.c(context), this.u);
            int iB2 = b(intervalData.b(context), this.v);
            Paint paint = getPaint();
            paint.setShader(new LinearGradient(0.0f, f4, 0.0f, fA, new int[]{iB, iB2}, (float[]) null, Shader.TileMode.CLAMP));
            this.y.add(paint);
            this.x.add(new RectF(f2, f4, f3, fA));
        }
    }

    private void a(qlm qlmVar, int i) {
        float f;
        boolean z;
        float fMin;
        float f2;
        boolean z2;
        if (qlmVar == null || !qlmVar.d() || qlmVar.c() <= 0.0f) {
            return;
        }
        Drawable drawableE = e(qlmVar.a(), this.e);
        if (drawableE == null) {
            ReleaseLogUtil.d("Interval", "initCursor drawable is null");
            return;
        }
        int intrinsicWidth = drawableE.getIntrinsicWidth();
        int intrinsicHeight = drawableE.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            ReleaseLogUtil.d("Interval", "initCursor width ", Integer.valueOf(intrinsicWidth), " height ", Integer.valueOf(intrinsicHeight));
            return;
        }
        if (CollectionUtils.d(this.s, i)) {
            ReleaseLogUtil.d("Interval", "initCursor index ", Integer.valueOf(i), " mRectList ", this.s);
            return;
        }
        RectF rectF = this.s.get(i);
        if (rectF == null) {
            ReleaseLogUtil.d("Interval", "initCursor rect is null");
            return;
        }
        Map<IntervalData.RoundCornerType, RectF> map = this.r.get(i);
        float f3 = -1.0f;
        if (map != null) {
            RectF rectF2 = map.get(IntervalData.RoundCornerType.EDGE_START);
            z = true;
            if (rectF2 != null) {
                f2 = rectF2.left;
                z2 = true;
            } else {
                f2 = -1.0f;
                z2 = false;
            }
            RectF rectF3 = map.get(IntervalData.RoundCornerType.EDGE_END);
            if (rectF3 != null) {
                f = rectF3.right;
                f3 = f2;
            } else {
                f = -1.0f;
                f3 = f2;
                z = z2;
            }
        } else {
            f = -1.0f;
            z = false;
        }
        if (f3 < 0.0f) {
            f3 = rectF.left;
        }
        if (f < 0.0f) {
            f = rectF.right;
        }
        if (f3 < 0.0f || f < 0.0f) {
            ReleaseLogUtil.d("Interval", "initCursor left ", Float.valueOf(f3), " right ", Float.valueOf(f));
            return;
        }
        float f4 = f - f3;
        float fMin2 = Math.min(Math.max(qlmVar.e(), 0.0f), 1.0f);
        if (!z || this.h > 0.0f) {
            float f5 = intrinsicWidth / 2.0f;
            fMin = Math.min(Math.max((fMin2 * f4) - f5, -f5), f4 - f5);
        } else {
            fMin = (f4 - intrinsicWidth) * fMin2;
        }
        float f6 = f3 + fMin;
        Rect rect = new Rect();
        rect.left = (int) UnitUtil.d(f6, 0);
        rect.right = (int) UnitUtil.d(intrinsicWidth + f6, 0);
        rect.top = (int) UnitUtil.d(rectF.top + a(qlmVar.b(), this.f), 0);
        rect.bottom = rect.top + intrinsicHeight;
        this.j.put(i, rect);
        this.f23568b.put(i, drawableE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c3 A[PHI: r11 r12
      0x00c3: PHI (r11v7 float) = (r11v6 float), (r11v12 float) binds: [B:25:0x00b2, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r12v2 float) = (r12v1 float), (r12v7 float) binds: [B:25:0x00b2, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(Context context, qlq qlqVar, int i) {
        float f;
        float textSize;
        float fA;
        float fA2;
        float fA3;
        float fA4;
        float f2;
        if (qlqVar == null || qlqVar.d() <= 0.0f) {
            return;
        }
        CharSequence charSequenceA = a(qlqVar.c(), this.ac);
        if (TextUtils.isEmpty(charSequenceA)) {
            ReleaseLogUtil.d("Interval", "initText sourceCharSequence ", charSequenceA);
            return;
        }
        Rect rect = this.j.get(i);
        if (rect == null) {
            ReleaseLogUtil.d("Interval", "initText cursorRect is null index ", Integer.valueOf(i));
            return;
        }
        TextPaint textPaintB = b(context, qlqVar);
        Paint.FontMetrics fontMetrics = textPaintB.getFontMetrics();
        if (fontMetrics == null) {
            textSize = textPaintB.getTextSize();
            f = -(textSize / 2.0f);
        } else {
            float f3 = fontMetrics.descent - fontMetrics.ascent;
            f = (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
            textSize = f3;
        }
        float fA5 = a(qlqVar.a(), this.ae);
        if (qlqVar.i()) {
            fA2 = rect.bottom + a(qlqVar.b(), this.al);
            fA = fA2 + fA5;
            if (fA5 <= 0.0f) {
                fA4 = rect.bottom + textSize;
                fA3 = a(qlqVar.h(), this.ar);
                f2 = fA4 + fA3;
            } else {
                f2 = ((fA2 + fA) / 2.0f) - f;
            }
        } else {
            fA = rect.top + a(qlqVar.b(), this.al);
            fA2 = fA - fA5;
            if (fA5 <= 0.0f) {
                fA3 = rect.top;
                fA4 = a(qlqVar.h(), this.ar);
                f2 = fA4 + fA3;
            } else {
                f2 = ((fA2 + fA) / 2.0f) - f;
            }
        }
        float fA6 = a(qlqVar.e(), this.ah);
        float f4 = fA6 / 2.0f;
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequenceA, textPaintB, ((this.ax - this.aj) - this.am) - fA6, TextUtils.TruncateAt.END);
        float fMeasureText = textPaintB.measureText(charSequenceEllipsize, 0, charSequenceEllipsize.length());
        float f5 = fMeasureText / 2.0f;
        float fMin = Math.min(Math.max((((rect.left + rect.right) / 2.0f) - f5) - f4, this.aj), ((this.ax - fMeasureText) - fA6) - this.am);
        float f6 = f4 + fMin;
        float f7 = f6 + fMeasureText;
        this.an.append(i, textPaintB);
        this.d.append(i, charSequenceEllipsize);
        this.as.append(i, new Pair<>(Float.valueOf(((f6 + f7) / 2.0f) - f5), Float.valueOf(f2)));
        if (fA5 <= 0.0f) {
            return;
        }
        this.ag.append(i, d(b(qlqVar.c(context), this.ab)));
        this.ai.append(i, new RectF(fMin, fA2, fMin + fA6, fA));
        this.af.append(i, new RectF(f6, fA2, f7, fA));
        float f8 = fMin + fMeasureText;
        this.ad.append(i, new RectF(f8, fA2, fA6 + f8, fA));
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.ax, this.ao);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.setDrawFilter(this.p);
        c(canvas);
        a(canvas, this.s, this.t);
        a(canvas, this.x, this.y);
        e(canvas);
        setAlpha(this.f23567a);
    }

    private void c(Canvas canvas) {
        float f;
        RectF rectF;
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.r.keyAt(i);
            Map<IntervalData.RoundCornerType, RectF> map = this.r.get(iKeyAt);
            RectF rectF2 = map.get(IntervalData.RoundCornerType.EDGE_START);
            if (rectF2 != null) {
                f = 90.0f;
            } else {
                rectF2 = null;
                f = 0.0f;
            }
            RectF rectF3 = map.get(IntervalData.RoundCornerType.EDGE_END);
            if (rectF3 != null) {
                f = 270.0f;
                rectF = rectF3;
            } else {
                rectF = rectF2;
            }
            float f2 = f;
            if (rectF != null) {
                if (CollectionUtils.d(this.t, iKeyAt)) {
                    ReleaseLogUtil.d("Interval", "drawArc paintIndex ", Integer.valueOf(iKeyAt), " mPaintList ", this.t);
                } else {
                    Paint paint = this.t.get(iKeyAt);
                    if (paint == null) {
                        ReleaseLogUtil.d("Interval", "drawArc paint is null paintIndex ", Integer.valueOf(iKeyAt));
                    } else {
                        canvas.drawArc(rectF, f2, 180.0f, true, paint);
                        canvas.save();
                    }
                }
            }
        }
    }

    private void a(Canvas canvas, List<RectF> list, List<Paint> list2) {
        if (CollectionUtils.a(list)) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (CollectionUtils.d(list2, i)) {
                ReleaseLogUtil.d("Interval", "drawRect index ", Integer.valueOf(i), " paintList ", list2);
            } else {
                RectF rectF = list.get(i);
                Paint paint = list2.get(i);
                if (rectF == null || paint == null) {
                    ReleaseLogUtil.d("Interval", "drawRect rect ", rectF, " paint ", paint);
                } else {
                    canvas.drawRect(rectF, paint);
                    canvas.save();
                }
            }
        }
    }

    private void e(Canvas canvas) {
        int size = this.f23568b.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.f23568b.keyAt(i);
            Drawable drawable = this.f23568b.get(iKeyAt);
            Rect rect = this.j.get(iKeyAt);
            if (drawable == null || rect == null) {
                ReleaseLogUtil.d("Interval", "drawCursorText drawable ", drawable, " rect ", rect);
            } else {
                drawable.setBounds(rect);
                drawable.draw(canvas);
                canvas.save();
                e(canvas, iKeyAt);
                b(canvas, iKeyAt);
            }
        }
    }

    private void e(Canvas canvas, int i) {
        Paint paint = this.ag.get(i);
        if (paint == null) {
            ReleaseLogUtil.d("Interval", "drawTextBackground paint is null key ", Integer.valueOf(i));
            return;
        }
        RectF rectF = this.ai.get(i);
        if (rectF == null) {
            ReleaseLogUtil.d("Interval", "drawTextBackground startRect is null key ", Integer.valueOf(i));
        } else {
            canvas.drawArc(rectF, 90.0f, 180.0f, true, paint);
            canvas.save();
        }
        RectF rectF2 = this.af.get(i);
        if (rectF2 == null) {
            ReleaseLogUtil.d("Interval", "drawTextBackground rect is null key ", Integer.valueOf(i));
        } else {
            canvas.drawRect(rectF2, paint);
            canvas.save();
        }
        RectF rectF3 = this.ad.get(i);
        if (rectF3 == null) {
            ReleaseLogUtil.d("Interval", "drawTextBackground endRect is null key ", Integer.valueOf(i));
        } else {
            canvas.drawArc(rectF3, 270.0f, 180.0f, true, paint);
            canvas.save();
        }
    }

    private void b(Canvas canvas, int i) {
        CharSequence charSequence = this.d.get(i);
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("Interval", "drawText charSequence ", charSequence);
            return;
        }
        Pair<Float, Float> pair = this.as.get(i);
        if (pair == null) {
            ReleaseLogUtil.d("Interval", "drawText pair is null key ", Integer.valueOf(i));
            return;
        }
        TextPaint textPaint = this.an.get(i);
        if (textPaint == null) {
            ReleaseLogUtil.d("Interval", "drawText paint is null key ", Integer.valueOf(i));
        } else {
            canvas.drawText(charSequence, 0, charSequence.length(), ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), textPaint);
            canvas.save();
        }
    }
}
