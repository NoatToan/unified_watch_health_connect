package com.huawei.uikit.animations.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.uikit.hwanimations.R;

/* JADX INFO: loaded from: classes20.dex */
public class HwGravitationalLoadingDrawable extends Drawable implements Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f29184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f29185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f29186c;
    private final c d;
    private final c e;
    private Animator f;
    private Animator g;
    private final c i;
    private boolean h = false;
    private float j = 0.0f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f29188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i f29189c;
        private final o d;
        private final l e;

        a(l lVar, o oVar, i iVar, boolean z) {
            this(lVar, oVar, iVar, null, z);
        }

        public static a a(Context context, AttributeSet attributeSet, int i, int i2) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwGravitationalLoadingAnimation, i, i2);
            l lVarA = l.a(context, typedArrayObtainStyledAttributes);
            e eVarC = e.c(context, typedArrayObtainStyledAttributes);
            o oVarD = o.d(context, typedArrayObtainStyledAttributes);
            i iVarD = i.d(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            return new a(lVarA, oVarD, iVarD, eVarC, true);
        }

        public static a d(Context context, AttributeSet attributeSet, int i, int i2) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwGravitationalLoadingAnimation, i, i2);
            l lVarA = l.a(context, typedArrayObtainStyledAttributes);
            o oVarD = o.d(context, typedArrayObtainStyledAttributes);
            i iVarD = i.d(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            return new a(lVarA, oVarD, iVarD, false);
        }

        a(l lVar, o oVar, i iVar, e eVar, boolean z) {
            this.e = lVar;
            this.d = oVar;
            this.f29189c = iVar;
            this.f29187a = z;
            this.f29188b = eVar;
        }
    }

    static abstract class aijfr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Camera f29190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Matrix f29191b;

        class e extends aijfr {
            e(float f) {
                super(f, null);
            }

            @Override // com.huawei.uikit.animations.drawable.HwGravitationalLoadingDrawable.aijfr
            protected void b(float f) {
                this.f29190a.rotateY(f);
            }
        }

        /* synthetic */ aijfr(float f, n nVar) {
            this(f);
        }

        PointF a(PointF pointF, float f) {
            PointF pointF2 = new PointF();
            b(f);
            a(pointF, pointF2);
            a();
            return pointF2;
        }

        abstract void b(float f);

        void c(float f) {
            Camera camera = this.f29190a;
            camera.setLocation(f, camera.getLocationY(), this.f29190a.getLocationZ());
        }

        void d(float f) {
            Camera camera = this.f29190a;
            camera.setLocation(camera.getLocationX(), f, this.f29190a.getLocationZ());
        }

        void e(float f) {
            Camera camera = this.f29190a;
            camera.setLocation(camera.getLocationX(), this.f29190a.getLocationY(), f);
        }

        private aijfr(float f) {
            Camera camera = new Camera();
            this.f29190a = camera;
            this.f29191b = new Matrix();
            b(f);
            camera.save();
        }

        void a(PointF pointF, PointF pointF2, float f) {
            b(f);
            a(pointF, pointF2);
            a();
        }

        private void a(PointF pointF, PointF pointF2) {
            float[] fArrA = a(pointF);
            this.f29190a.getMatrix(this.f29191b);
            this.f29191b.mapPoints(fArrA);
            pointF2.x = fArrA[0];
            pointF2.y = fArrA[1];
        }

        private static float[] a(PointF pointF) {
            return new float[]{pointF.x, pointF.y};
        }

        private void a() {
            this.f29190a.restore();
            this.f29190a.save();
        }

        static aijfr a(float f) {
            return new e(f);
        }
    }

    interface avpbg {
        void a(Paint paint);
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("HwLoadingAnim", "onAnimationUpdate: null animator");
                return;
            }
            HwGravitationalLoadingDrawable.this.f29184a.c(((Float) valueAnimator.getAnimatedValue("degrees")).floatValue(), ((Integer) valueAnimator.getAnimatedValue("alpha")).intValue(), ((Float) valueAnimator.getAnimatedValue("scale")).floatValue());
            HwGravitationalLoadingDrawable.this.invalidateSelf();
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final PointF f29193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final PointF f29194b;
        private final PointF e;

        c(PointF pointF, PointF pointF2, PointF pointF3) {
            a(pointF.x, "start.x");
            a(pointF.y, "start.y");
            a(pointF2.y, "middle.y");
            a(pointF3.y, "end.y");
            if (Float.compare(pointF.x, pointF2.x) >= 0) {
                throw new IllegalArgumentException("start.x >= middle.x");
            }
            if (Float.compare(pointF2.x, pointF3.x) >= 0) {
                throw new IllegalArgumentException("middle.x >= end.x");
            }
            this.f29193a = pointF;
            this.e = pointF2;
            this.f29194b = pointF3;
        }

        private static void a(float f, String str) {
            if (f >= 0.0f) {
                return;
            }
            throw new IllegalArgumentException(str + " is negative");
        }

        private float b(float f, float f2, float f3) {
            return (f * (f3 - f2)) + f2;
        }

        float d(float f) {
            if (Float.compare(f, this.f29193a.x) <= 0) {
                return this.f29193a.y;
            }
            if (Float.compare(f, this.f29194b.x) >= 0) {
                return this.f29194b.y;
            }
            if (Float.compare(f, this.f29193a.x) <= 0 || Float.compare(f, this.e.x) > 0) {
                PointF pointF = this.e;
                float f2 = pointF.x;
                PointF pointF2 = this.f29194b;
                return b((f - f2) / (pointF2.x - f2), pointF.y, pointF2.y);
            }
            PointF pointF3 = this.f29193a;
            float f3 = pointF3.x;
            PointF pointF4 = this.e;
            return b((f - f3) / (pointF4.x - f3), pointF3.y, pointF4.y);
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float[] f29196b = {16.0f, 40.0f, 76.0f};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float[] f29197c = {2.8f, 1.9f, 1.2f};
        private static final float[] d = {0.5f, 0.2f, 0.1f};
        private static final float[] e = {3.0f, 3.0f, 2.0f};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final float[] f29195a = {3.0f, 3.0f, 2.2f};

        d() {
        }

        static c a(float f) {
            return a(d, f);
        }

        static c c(float f) {
            return a(f29197c, f);
        }

        static c d(float f) {
            return a(e, f);
        }

        static c e(float f) {
            return a(f29195a, f);
        }

        static c a(float[] fArr, float f) {
            return new c(d(d(fArr), f), d(b(fArr), f), d(e(fArr), f));
        }

        private static PointF b(float[] fArr) {
            return c(1, fArr);
        }

        private static PointF d(float[] fArr) {
            return c(0, fArr);
        }

        private static PointF e(float[] fArr) {
            return c(2, fArr);
        }

        private static PointF c(int i, float[] fArr) {
            if (i >= 0) {
                float[] fArr2 = f29196b;
                if (i < fArr2.length && i < fArr.length) {
                    return new PointF(fArr2[i], fArr[i]);
                }
            }
            return new PointF();
        }

        private static PointF d(PointF pointF, float f) {
            pointF.x *= f;
            pointF.y *= f;
            return pointF;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f29198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f29199b;
        private final float e;

        e(float f, float f2, int i) {
            this.e = f;
            this.f29198a = f2;
            this.f29199b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e c(Context context, TypedArray typedArray) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return new e(typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarBackgroundRingStrokeWidth, HwGravitationalLoadingDrawable.a(3.0f, displayMetrics)), typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarBackgroundRingBlurRadius, HwGravitationalLoadingDrawable.a(2.0f, displayMetrics)), typedArray.getInt(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarBackgroundRingAlpha, TsExtractor.TS_STREAM_TYPE_E_AC3));
        }
    }

    public static class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f29202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f29203c;
        private final a d;
        private final float e;
        private Bitmap f;
        private float g;
        private Canvas h;
        private float j;
        private float o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f29201a = new Paint(1);
        private float i = 1.0f;

        static class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Paint f29204b = new Paint(1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PointF f29205c;
            private final PointF d;
            private final aijfr e;

            a(aijfr aijfrVar, PointF pointF, int i) {
                this.e = aijfrVar;
                this.d = pointF;
                this.f29205c = new PointF(pointF.x, pointF.y);
                b(i);
            }

            private void b(int i) {
                this.f29204b.setStyle(Paint.Style.FILL);
                this.f29204b.setColor(i);
            }

            void d(float f) {
                this.e.a(this.d, this.f29205c, f);
            }

            void a(Canvas canvas, float f) {
                PointF pointF = this.f29205c;
                canvas.drawCircle(pointF.x, pointF.y, f, this.f29204b);
            }
        }

        static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f29206a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f29207b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PointF f29208c;
            private final e[] d;
            private final Paint e = new Paint(1);
            private float h;
            private int i;

            d(PointF pointF, aijfr aijfrVar, i iVar, int i) {
                this.f29208c = pointF;
                int i2 = iVar.f29211a;
                this.f29206a = i2;
                this.f29207b = iVar.e;
                this.h = iVar.e;
                this.d = new e[i2];
                float f = iVar.d;
                int i3 = 0;
                while (true) {
                    e[] eVarArr = this.d;
                    if (i3 >= eVarArr.length) {
                        e(i);
                        return;
                    }
                    if (i3 == 0) {
                        eVarArr[i3] = new e(aijfrVar, a(255, f));
                    } else {
                        eVarArr[i3] = new e(aijfrVar, a(eVarArr[i3 - 1].f29209b, f));
                    }
                    i3++;
                }
            }

            private int a(int i, float f) {
                return (int) (i * f);
            }

            void a(float f) {
                this.h = Math.min(f, this.f29207b);
            }

            private void e(int i) {
                this.e.setColor(i);
                this.e.setStyle(Paint.Style.FILL);
            }

            void c() {
                this.h = this.f29207b;
            }

            void c(float f) {
                int i = this.f29207b;
                int i2 = 0;
                if (i <= 0) {
                    this.i = 0;
                    return;
                }
                this.i = (int) ((this.h / i) * this.f29206a);
                while (true) {
                    int i3 = this.i;
                    if (i2 >= i3) {
                        return;
                    }
                    int i4 = i2 + 1;
                    this.d[i2].a(i4 / i3, this.f29208c, f, this.h);
                    i2 = i4;
                }
            }

            void b(Canvas canvas, float f) {
                for (int i = 0; i < this.i; i++) {
                    this.d[i].a(canvas, this.e, f);
                }
            }
        }

        static class e {
            private static final FloatEvaluator e = new FloatEvaluator();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f29209b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PointF f29210c = new PointF();
            private final aijfr d;

            e(aijfr aijfrVar, int i) {
                this.d = aijfrVar;
                this.f29209b = i;
            }

            void a(Canvas canvas, Paint paint, float f) {
                int i = this.f29209b;
                if (i == 0) {
                    return;
                }
                paint.setAlpha(i);
                PointF pointF = this.f29210c;
                canvas.drawCircle(pointF.x, pointF.y, f, paint);
            }

            void a(float f, PointF pointF, float f2, float f3) {
                this.d.a(pointF, this.f29210c, e.evaluate(f, (Number) Float.valueOf(f2), (Number) Float.valueOf(f2 - f3)).floatValue());
            }
        }

        h(int i, float f, float f2, float f3, i iVar) {
            this.e = f;
            a(300);
            this.j = f2;
            this.o = f2;
            PointF pointF = new PointF(f3, 0.0f);
            aijfr aijfrVarA = aijfr.a(-90.0f);
            aijfrVarA.d(1.0f);
            this.f29203c = aijfrVarA.a(pointF, 0.0f).y;
            this.d = new a(aijfrVarA, pointF, i);
            this.f29202b = new d(pointF, aijfrVarA, iVar, i);
        }

        void e(int i) {
            float f = i;
            if (f > this.g) {
                a(i);
            }
            this.i = f / this.e;
        }

        private void a(int i) {
            this.f = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            this.h = new Canvas(this.f);
            this.g = i;
        }

        public void b(float f) {
            this.f29202b.a(f);
        }

        void b(int i) {
            this.d.f29204b.setColor(i);
            this.f29202b.e.setColor(i);
        }

        void d(Canvas canvas, Rect rect, float f) {
            this.f.eraseColor(0);
            this.h.save();
            Canvas canvas2 = this.h;
            float f2 = this.i;
            canvas2.scale(f2, f2);
            float fD = HwGravitationalLoadingDrawable.d(this.e);
            this.h.translate(fD, fD);
            this.h.rotate(-f, 0.0f, 0.0f);
            this.h.translate(0.0f, -this.f29203c);
            this.d.a(this.h, this.o);
            this.f29202b.b(this.h, this.o);
            canvas.drawBitmap(this.f, rect.left, rect.top, this.f29201a);
            this.h.restore();
        }

        void c(float f, int i, float f2) {
            c(f);
            this.f29201a.setAlpha(i);
            this.o = this.j * f2;
        }

        public void c(float f) {
            this.d.d(f);
            this.f29202b.c(f);
        }
    }

    static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29211a;
        private final float d;
        private final int e;

        i(int i, int i2, float f) {
            this.f29211a = i;
            this.e = i2;
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i d(TypedArray typedArray) {
            int integer = typedArray.getInteger(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarCometTailCount, 20);
            int i = integer >= 0 ? integer : 20;
            int integer2 = typedArray.getInteger(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarCometTailRangeDegrees, 60);
            int i2 = integer2 > 0 ? integer2 : 60;
            float fraction = typedArray.getFraction(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarCometTailAlphaTransferFactor, 1, 1, 0.82f);
            return new i(i, i2, fraction >= 0.0f ? fraction : 0.82f);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f29212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f29213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f29214c;
        private final float d;
        private final k e;
        private float f;
        private float g;
        private Canvas h;
        private Bitmap i;
        private float j;

        j(float f, k kVar, boolean z) {
            this(f, kVar, null, z);
        }

        j(float f, k kVar, k kVar2, boolean z) {
            this.f29213b = new Paint(1);
            this.f = 1.0f;
            this.g = 1.0f;
            this.d = f;
            this.f29212a = kVar;
            this.e = kVar2;
            this.f29214c = z;
            d(300);
            d();
        }

        private void d(int i) {
            this.i = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            this.h = new Canvas(this.i);
            this.j = i;
        }

        void a(int i) {
            if (this.i == null || i > this.j) {
                d(i);
            } else {
                b();
            }
            this.g = i / this.d;
            d();
        }

        void e(int i) {
            this.f29212a.b(i);
            k kVar = this.e;
            if (kVar != null) {
                kVar.b(i);
            }
            b();
            d();
        }

        private void b() {
            this.i.eraseColor(0);
        }

        public void d(float f) {
            this.f = f;
        }

        void c(Canvas canvas, Rect rect) {
            canvas.save();
            float f = this.f;
            canvas.scale(f, f, rect.exactCenterX(), rect.exactCenterY());
            canvas.drawBitmap(this.i, rect.left, rect.top, this.f29213b);
            canvas.restore();
        }

        private void d() {
            this.h.save();
            Canvas canvas = this.h;
            float f = this.g;
            canvas.scale(f, f);
            float fD = HwGravitationalLoadingDrawable.d(this.d);
            k kVar = this.e;
            if (kVar != null) {
                kVar.b(this.h, fD, fD);
            }
            this.f29212a.b(this.h, fD, fD);
            this.h.restore();
        }
    }

    static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f29216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f29217c;
        private final Paint d;
        private final float e;

        k(int i, float f, float f2) {
            this(i, f, f2, 255);
        }

        k(int i, float f, float f2, int i2) {
            this.d = new Paint(1);
            this.f29215a = i;
            this.e = f;
            this.f29217c = f2;
            this.f29216b = i2;
            a();
        }

        private void a() {
            this.d.setStyle(Paint.Style.STROKE);
            this.d.setStrokeWidth(this.f29217c);
            this.d.setColor(this.f29215a);
            this.d.setAlpha(this.f29216b);
        }

        void b(int i) {
            this.d.setColor(i);
            this.d.setAlpha(this.f29216b);
        }

        void d(float f) {
            this.f29217c = f;
            this.d.setStrokeWidth(f);
        }

        void d(avpbg avpbgVar) {
            avpbgVar.a(this.d);
        }

        void b(Canvas canvas, float f, float f2) {
            canvas.drawCircle(f, f2, this.e, this.d);
        }
    }

    static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f29218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f29219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f29220c;
        private final int d;
        private final float e;

        l(float f, float f2, int i, float f3, float f4) {
            this.f29218a = f;
            this.f29220c = f2;
            this.d = i;
            this.f29219b = f3;
            this.e = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static l a(Context context, TypedArray typedArray) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float dimension = typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarRingRadius, HwGravitationalLoadingDrawable.a(10.5f, displayMetrics));
            float dimension2 = typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarRingStrokeWidth, HwGravitationalLoadingDrawable.a(1.9f, displayMetrics));
            int integer = typedArray.getInteger(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarRingAlpha, 200);
            float dimension3 = typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarRingBlurRadius, HwGravitationalLoadingDrawable.a(0.2f, displayMetrics));
            float f = displayMetrics.density * 40.0f;
            float dimension4 = typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarDimensionScaleBaseline, f);
            return new l(dimension, dimension2, integer, dimension3, dimension4 <= 0.0f ? f : dimension4);
        }
    }

    class n implements ValueAnimator.AnimatorUpdateListener {
        n() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("HwLoadingAnim", "onAnimationUpdate:null animator");
                return;
            }
            HwGravitationalLoadingDrawable.this.j = ((Float) valueAnimator.getAnimatedValue(TypedValues.CycleType.S_WAVE_OFFSET)).floatValue() * HwGravitationalLoadingDrawable.this.f29186c.g;
            HwGravitationalLoadingDrawable.this.invalidateSelf();
        }
    }

    static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f29221a;
        private final float d;
        private final float e;

        o(float f, float f2, float f3) {
            this.e = f;
            this.d = f2;
            this.f29221a = f3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static o d(Context context, TypedArray typedArray) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float dimension = typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarCometRadius, HwGravitationalLoadingDrawable.a(3.0f, displayMetrics));
            float dimension2 = typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarOrbitRadius, HwGravitationalLoadingDrawable.a(17.0f, displayMetrics));
            float f = displayMetrics.density * 40.0f;
            float dimension3 = typedArray.getDimension(R.styleable.HwGravitationalLoadingAnimation_hwProgressBarDimensionScaleBaseline, f);
            if (dimension3 > 0.0f) {
                f = dimension3;
            }
            return new o(dimension, dimension2, f);
        }
    }

    public HwGravitationalLoadingDrawable(j jVar, h hVar, int i2, float f2) {
        this.f29186c = jVar;
        this.f29184a = hVar;
        e(i2);
        b(i2);
        this.e = d.c(f2);
        this.d = d.a(f2);
        this.f29185b = d.d(f2);
        this.i = d.e(f2);
    }

    private void b(int i2) {
        this.f = g.b(i2, 35.0f, (ValueAnimator.AnimatorUpdateListener) new b());
    }

    private void c(int i2) {
        float f2 = i2;
        this.f29186c.f29212a.d(this.e.d(f2));
        this.f29184a.j = this.i.d(f2);
        h hVar = this.f29184a;
        hVar.o = hVar.j;
        if (this.f29186c.f29214c) {
            this.f29186c.f29212a.d(f.e(this.d.d(f2)));
            if (this.f29186c.e != null) {
                this.f29186c.e.d(this.f29185b.d(f2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float d(float f2) {
        return f2 / 2.0f;
    }

    private void e(int i2) {
        this.g = g.b(i2, this.f29186c.f29212a.e * 2.0f, new n());
    }

    public void a(int i2) {
        int iD = d(i2);
        this.f29184a.b(iD);
        this.f29186c.e(iD);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.j);
        this.f29186c.c(canvas, getBounds());
        this.f29184a.d(canvas, getBounds(), 23.3f);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (rect == null) {
            return;
        }
        super.onBoundsChange(rect);
        int iMin = Math.min(rect.width(), rect.height());
        c(iMin);
        this.f29186c.a(iMin);
        this.f29184a.e(iMin);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        e(true);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        d();
    }

    static class f implements avpbg {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BlurMaskFilter.Blur f29200c;
        private final float e;

        f(float f, BlurMaskFilter.Blur blur) {
            this.e = f;
            this.f29200c = blur;
        }

        @Override // com.huawei.uikit.animations.drawable.HwGravitationalLoadingDrawable.avpbg
        public void a(Paint paint) {
            paint.setMaskFilter(null);
            paint.setMaskFilter(new BlurMaskFilter(this.e, this.f29200c));
        }

        static f e(float f) {
            return new f(f, BlurMaskFilter.Blur.NORMAL);
        }
    }

    public static j a(int i2, a aVar) {
        if (aVar.f29187a && aVar.f29188b == null) {
            throw new IllegalArgumentException("create for night mode, but BackgroundRingParams is null");
        }
        return aVar.f29187a ? c(i2, aVar.e, aVar.f29188b) : e(i2, aVar.e);
    }

    public void e(boolean z) {
        if (this.h) {
            return;
        }
        if (z) {
            this.f29184a.f29202b.c();
        }
        this.f.start();
        this.g.start();
        this.h = true;
    }

    static class g {
        g() {
        }

        static Animator b(long j, float f, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            float f2 = f * 0.06f;
            ValueAnimator valueAnimatorC = c(j, f2);
            valueAnimatorC.addUpdateListener(animatorUpdateListener);
            ValueAnimator valueAnimatorB = b(j, f2);
            valueAnimatorB.addUpdateListener(animatorUpdateListener);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(valueAnimatorC, valueAnimatorB);
            return animatorSet;
        }

        private static ValueAnimator c(long j, float f) {
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat(TypedValues.CycleType.S_WAVE_OFFSET, 0.0f, -f));
            valueAnimatorOfPropertyValuesHolder.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.67f, 1.0f));
            valueAnimatorOfPropertyValuesHolder.setDuration(j / 4);
            return valueAnimatorOfPropertyValuesHolder;
        }

        private static ValueAnimator b(long j, float f) {
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat(TypedValues.CycleType.S_WAVE_OFFSET, -f, f));
            valueAnimatorOfPropertyValuesHolder.setDuration(j / 2);
            valueAnimatorOfPropertyValuesHolder.setInterpolator(PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f));
            valueAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
            valueAnimatorOfPropertyValuesHolder.setRepeatMode(2);
            return valueAnimatorOfPropertyValuesHolder;
        }

        static ValueAnimator b(int i, float f, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("scale", Keyframe.ofFloat(0.0f, 0.93f), Keyframe.ofFloat(0.4f, 0.65f), Keyframe.ofFloat(0.9f, 1.0f), Keyframe.ofFloat(1.0f, 0.93f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofInt(0.0f, 255), Keyframe.ofInt(0.4f, 51), Keyframe.ofInt(0.8f, 255), Keyframe.ofInt(1.0f, 255)), PropertyValuesHolder.ofFloat("degrees", f, 360.0f + f));
            valueAnimatorOfPropertyValuesHolder.setDuration(i);
            valueAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
            valueAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
            valueAnimatorOfPropertyValuesHolder.setRepeatMode(1);
            valueAnimatorOfPropertyValuesHolder.addUpdateListener(animatorUpdateListener);
            return valueAnimatorOfPropertyValuesHolder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float a(float f2, DisplayMetrics displayMetrics) {
        return f2 * displayMetrics.density;
    }

    void d() {
        if (this.h) {
            this.f.end();
            this.g.end();
            this.h = false;
        }
    }

    private static j e(int i2, l lVar) {
        return new j(lVar.e, new k(i2, lVar.f29218a, lVar.f29220c, lVar.d), false);
    }

    private static j c(int i2, l lVar, e eVar) {
        k kVar = new k(i2, lVar.f29218a, eVar.e, eVar.f29199b);
        kVar.d(f.e(eVar.f29198a));
        k kVar2 = new k(i2, lVar.f29218a, lVar.f29220c);
        kVar2.d(f.e(lVar.f29219b));
        return new j(lVar.e, kVar2, kVar, true);
    }

    public static h d(int i2, a aVar) {
        return new h(i2, aVar.d.f29221a, aVar.d.e, aVar.d.d, aVar.f29189c);
    }

    public static int d(int i2) {
        return ColorUtils.setAlphaComponent(i2, 255);
    }
}
