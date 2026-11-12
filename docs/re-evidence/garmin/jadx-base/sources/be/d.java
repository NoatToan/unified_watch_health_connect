package be;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import j20.x;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinearInterpolator f17678g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q9.b f17679h = new q9.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f17680i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f17683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ValueAnimator f17684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17686f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f17687a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f17688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f17689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f17690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f17691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f17692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f17693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f17694h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f17695i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17696j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f17697k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f17698l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f17699m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f17700n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f17701o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f17702p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f17703q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f17704r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f17705s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17706t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f17707u;

        public a() {
            Paint paint = new Paint();
            this.f17688b = paint;
            Paint paint2 = new Paint();
            this.f17689c = paint2;
            Paint paint3 = new Paint();
            this.f17690d = paint3;
            this.f17691e = 0.0f;
            this.f17692f = 0.0f;
            this.f17693g = 0.0f;
            this.f17694h = 5.0f;
            this.f17702p = 1.0f;
            this.f17706t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i14) {
            this.f17696j = i14;
            this.f17707u = this.f17695i[i14];
        }
    }

    public d(Context context) {
        context.getClass();
        this.f17683c = context.getResources();
        a aVar = new a();
        this.f17681a = aVar;
        aVar.f17695i = f17680i;
        aVar.a(0);
        aVar.f17694h = 2.5f;
        aVar.f17688b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, aVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f17678g);
        valueAnimatorOfFloat.addListener(new c(this, aVar));
        this.f17684d = valueAnimatorOfFloat;
    }

    public static void d(float f14, a aVar) {
        if (f14 <= 0.75f) {
            aVar.f17707u = aVar.f17695i[aVar.f17696j];
            return;
        }
        float f15 = (f14 - 0.75f) / 0.25f;
        int[] iArr = aVar.f17695i;
        int i14 = aVar.f17696j;
        int i15 = iArr[i14];
        int i16 = iArr[(i14 + 1) % iArr.length];
        int i17 = (i15 >> 24) & 255;
        int i18 = (i15 >> 16) & 255;
        int i19 = (i15 >> 8) & 255;
        int i24 = i15 & 255;
        aVar.f17707u = ((i17 + ((int) ((((i16 >> 24) & 255) - i17) * f15))) << 24) | ((i18 + ((int) ((((i16 >> 16) & 255) - i18) * f15))) << 16) | ((i19 + ((int) ((((i16 >> 8) & 255) - i19) * f15))) << 8) | (i24 + ((int) (f15 * ((i16 & 255) - i24))));
    }

    public final void a(float f14, a aVar, boolean z14) {
        float interpolation;
        if (this.f17686f) {
            d(f14, aVar);
            float fFloor = (float) (Math.floor(aVar.f17699m / 0.8f) + 1.0d);
            float f15 = aVar.f17697k;
            float f16 = aVar.f17698l;
            aVar.f17691e = (((f16 - 0.01f) - f15) * f14) + f15;
            aVar.f17692f = f16;
            float f17 = aVar.f17699m;
            aVar.f17693g = x.a(fFloor, f17, f14, f17);
            return;
        }
        if (f14 != 1.0f || z14) {
            float f18 = aVar.f17699m;
            float interpolation2 = aVar.f17697k;
            q9.b bVar = f17679h;
            if (f14 < 0.5f) {
                interpolation = (bVar.getInterpolation(f14 / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f19 = interpolation2 + 0.79f;
                interpolation2 = f19 - (((1.0f - bVar.getInterpolation((f14 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f19;
            }
            float f22 = (0.20999998f * f14) + f18;
            float f24 = (f14 + this.f17685e) * 216.0f;
            aVar.f17691e = interpolation2;
            aVar.f17692f = interpolation;
            aVar.f17693g = f22;
            this.f17682b = f24;
        }
    }

    public final void b(float f14, float f15, float f16, float f17) {
        float f18 = this.f17683c.getDisplayMetrics().density;
        float f19 = f15 * f18;
        a aVar = this.f17681a;
        aVar.f17694h = f19;
        aVar.f17688b.setStrokeWidth(f19);
        aVar.f17703q = f14 * f18;
        aVar.a(0);
        aVar.f17704r = (int) (f16 * f18);
        aVar.f17705s = (int) (f17 * f18);
    }

    public final void c(int i14) {
        if (i14 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f17682b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f17681a;
        Paint paint = aVar.f17688b;
        RectF rectF = aVar.f17687a;
        float f14 = aVar.f17703q;
        float fMin = (aVar.f17694h / 2.0f) + f14;
        if (f14 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f17704r * aVar.f17702p) / 2.0f, aVar.f17694h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f15 = aVar.f17691e;
        float f16 = aVar.f17693g;
        float f17 = (f15 + f16) * 360.0f;
        float f18 = ((aVar.f17692f + f16) * 360.0f) - f17;
        paint.setColor(aVar.f17707u);
        paint.setAlpha(aVar.f17706t);
        float f19 = aVar.f17694h / 2.0f;
        rectF.inset(f19, f19);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f17690d);
        float f22 = -f19;
        rectF.inset(f22, f22);
        canvas.drawArc(rectF, f17, f18, false, paint);
        Paint paint2 = aVar.f17689c;
        if (aVar.f17700n) {
            Path path = aVar.f17701o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f17701o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f24 = (aVar.f17704r * aVar.f17702p) / 2.0f;
            aVar.f17701o.moveTo(0.0f, 0.0f);
            aVar.f17701o.lineTo(aVar.f17704r * aVar.f17702p, 0.0f);
            Path path3 = aVar.f17701o;
            float f25 = aVar.f17704r;
            float f26 = aVar.f17702p;
            path3.lineTo((f25 * f26) / 2.0f, aVar.f17705s * f26);
            aVar.f17701o.offset((rectF.centerX() + fMin2) - f24, (aVar.f17694h / 2.0f) + rectF.centerY());
            aVar.f17701o.close();
            paint2.setColor(aVar.f17707u);
            paint2.setAlpha(aVar.f17706t);
            canvas.save();
            canvas.rotate(f17 + f18, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f17701o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f17681a.f17706t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f17684d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        this.f17681a.f17706t = i14;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17681a.f17688b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f17684d.cancel();
        a aVar = this.f17681a;
        float f14 = aVar.f17691e;
        aVar.f17697k = f14;
        float f15 = aVar.f17692f;
        aVar.f17698l = f15;
        aVar.f17699m = aVar.f17693g;
        if (f15 != f14) {
            this.f17686f = true;
            this.f17684d.setDuration(666L);
            this.f17684d.start();
            return;
        }
        aVar.a(0);
        aVar.f17697k = 0.0f;
        aVar.f17698l = 0.0f;
        aVar.f17699m = 0.0f;
        aVar.f17691e = 0.0f;
        aVar.f17692f = 0.0f;
        aVar.f17693g = 0.0f;
        this.f17684d.setDuration(1332L);
        this.f17684d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f17684d.cancel();
        this.f17682b = 0.0f;
        a aVar = this.f17681a;
        if (aVar.f17700n) {
            aVar.f17700n = false;
        }
        aVar.a(0);
        aVar.f17697k = 0.0f;
        aVar.f17698l = 0.0f;
        aVar.f17699m = 0.0f;
        aVar.f17691e = 0.0f;
        aVar.f17692f = 0.0f;
        aVar.f17693g = 0.0f;
        invalidateSelf();
    }
}
