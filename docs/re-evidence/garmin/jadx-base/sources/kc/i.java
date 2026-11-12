package kc;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f103896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f103897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f103898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f103899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f103900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f103901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f103902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f103903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f103904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Layout.Alignment f103905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f103906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f103907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f103908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f103909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f103910o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f103911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f103912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f103913r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f103914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f103915t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f103916u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f103917v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f103918w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f103919x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f103920y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f103921z;

    public i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f103900e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f103899d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f103896a = fRound;
        this.f103897b = fRound;
        this.f103898c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f103901f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f103902g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f103903h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z14) {
        Canvas canvas2;
        if (!z14) {
            this.J.getClass();
            this.f103906k.getClass();
            canvas.drawBitmap(this.f103906k, (Rect) null, this.J, this.f103903h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f103916u) > 0) {
            int i14 = this.f103916u;
            Paint paint = this.f103902g;
            paint.setColor(i14);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i15 = this.f103918w;
        TextPaint textPaint = this.f103901f;
        if (i15 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f103896a);
            textPaint.setColor(this.f103917v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f14 = this.f103897b;
            if (i15 == 2) {
                float f15 = this.f103898c;
                textPaint.setShadowLayer(f14, f15, f15, this.f103917v);
            } else if (i15 == 3 || i15 == 4) {
                boolean z15 = i15 == 3;
                int i16 = z15 ? -1 : this.f103917v;
                int i17 = z15 ? this.f103917v : -1;
                float f16 = f14 / 2.0f;
                textPaint.setColor(this.f103914s);
                textPaint.setStyle(Paint.Style.FILL);
                float f17 = -f16;
                textPaint.setShadowLayer(f14, f17, f17, i16);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f14, f16, f16, i17);
            }
        }
        textPaint.setColor(this.f103914s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
