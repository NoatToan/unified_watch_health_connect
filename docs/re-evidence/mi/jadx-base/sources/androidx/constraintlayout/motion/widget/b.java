package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import defpackage.ir5;
import defpackage.u4j;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final float[][] G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f1959r;
    public float s;
    public final MotionLayout t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1956a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1957b = 0;
    public int c = 0;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public float g = 0.5f;
    public float h = 0.5f;
    public float i = 0.5f;
    public float j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1958k = -1;
    public boolean l = false;
    public float m = 0.0f;
    public float n = 1.0f;
    public boolean o = false;
    public float[] p = new float[2];
    public int[] q = new int[2];
    public float u = 4.0f;
    public float v = 1.2f;
    public boolean w = true;
    public float x = 1.0f;
    public int y = 0;
    public float z = 10.0f;
    public float A = 10.0f;
    public float B = 1.0f;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public int E = 0;
    public int F = 0;

    public class a implements View.OnTouchListener {
        public a(b bVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.b$b, reason: collision with other inner class name */
    public class C0019b implements NestedScrollView.d {
        public C0019b(b bVar) {
        }

        @Override // androidx.core.widget.NestedScrollView.d
        public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    public b(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    public void A() {
        View viewFindViewById;
        int i = this.d;
        if (i != -1) {
            viewFindViewById = this.t.findViewById(i);
            if (viewFindViewById == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot find TouchAnchorId @id/");
                sb.append(ir5.c(this.t.getContext(), this.d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a(this));
            nestedScrollView.setOnScrollChangeListener(new C0019b(this));
        }
    }

    public float a(float f, float f2) {
        return (f * this.m) + (f2 * this.n);
    }

    public final void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == u4j.Ka) {
                this.d = typedArray.getResourceId(index, this.d);
            } else if (index == u4j.La) {
                int i2 = typedArray.getInt(index, this.f1956a);
                this.f1956a = i2;
                float[] fArr = G[i2];
                this.h = fArr[0];
                this.g = fArr[1];
            } else if (index == u4j.va) {
                int i3 = typedArray.getInt(index, this.f1957b);
                this.f1957b = i3;
                float[][] fArr2 = H;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.m = fArr3[0];
                    this.n = fArr3[1];
                } else {
                    this.n = Float.NaN;
                    this.m = Float.NaN;
                    this.l = true;
                }
            } else if (index == u4j.Aa) {
                this.u = typedArray.getFloat(index, this.u);
            } else if (index == u4j.za) {
                this.v = typedArray.getFloat(index, this.v);
            } else if (index == u4j.Ba) {
                this.w = typedArray.getBoolean(index, this.w);
            } else if (index == u4j.wa) {
                this.x = typedArray.getFloat(index, this.x);
            } else if (index == u4j.xa) {
                this.z = typedArray.getFloat(index, this.z);
            } else if (index == u4j.Ma) {
                this.e = typedArray.getResourceId(index, this.e);
            } else if (index == u4j.Da) {
                this.c = typedArray.getInt(index, this.c);
            } else if (index == u4j.Ca) {
                this.y = typedArray.getInteger(index, 0);
            } else if (index == u4j.ya) {
                this.f = typedArray.getResourceId(index, 0);
            } else if (index == u4j.Ea) {
                this.f1958k = typedArray.getResourceId(index, this.f1958k);
            } else if (index == u4j.Ga) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == u4j.Ha) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == u4j.Ia) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == u4j.Ja) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == u4j.Fa) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == u4j.ua) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.ta);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.y;
    }

    public RectF f(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public float g() {
        return this.v;
    }

    public float h() {
        return this.u;
    }

    public boolean i() {
        return this.w;
    }

    public float j(float f, float f2) {
        this.t.L(this.d, this.t.getProgress(), this.h, this.g, this.p);
        float f3 = this.m;
        if (f3 != 0.0f) {
            float[] fArr = this.p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.n) / fArr2[1];
    }

    public int k() {
        return this.E;
    }

    public float l() {
        return this.A;
    }

    public float m() {
        return this.B;
    }

    public float n() {
        return this.C;
    }

    public float o() {
        return this.D;
    }

    public RectF p(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.e;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public int q() {
        return this.e;
    }

    public boolean r() {
        return this.o;
    }

    public void s(MotionEvent motionEvent, MotionLayout.h hVar, int i, androidx.constraintlayout.motion.widget.a aVar) {
        int i2;
        if (this.l) {
            t(motionEvent, hVar, i, aVar);
            return;
        }
        hVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1959r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
            this.o = false;
            return;
        }
        if (action == 1) {
            this.o = false;
            hVar.c(1000);
            float fD = hVar.d();
            float fB = hVar.b();
            float progress = this.t.getProgress();
            int i3 = this.d;
            if (i3 != -1) {
                this.t.L(i3, progress, this.h, this.g, this.p);
            } else {
                float fMin = Math.min(this.t.getWidth(), this.t.getHeight());
                float[] fArr = this.p;
                fArr[1] = this.n * fMin;
                fArr[0] = fMin * this.m;
            }
            float f = this.m;
            float[] fArr2 = this.p;
            float fAbs = f != 0.0f ? fD / fArr2[0] : fB / fArr2[1];
            float f2 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f2 == 0.0f || f2 == 1.0f || (i2 = this.c) == 3) {
                if (0.0f >= f2 || 1.0f <= f2) {
                    this.t.setState(MotionLayout.l.FINISHED);
                    return;
                }
                return;
            }
            float f3 = ((double) f2) < 0.5d ? 0.0f : 1.0f;
            if (i2 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f3 = 1.0f;
            }
            if (this.c == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f3 = 0.0f;
            }
            this.t.b0(this.c, f3, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.t.setState(MotionLayout.l.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.s;
        float rawX = motionEvent.getRawX() - this.f1959r;
        if (Math.abs((this.m * rawX) + (this.n * rawY)) > this.z || this.o) {
            float progress2 = this.t.getProgress();
            if (!this.o) {
                this.o = true;
                this.t.setProgress(progress2);
            }
            int i4 = this.d;
            if (i4 != -1) {
                this.t.L(i4, progress2, this.h, this.g, this.p);
            } else {
                float fMin2 = Math.min(this.t.getWidth(), this.t.getHeight());
                float[] fArr3 = this.p;
                fArr3[1] = this.n * fMin2;
                fArr3[0] = fMin2 * this.m;
            }
            float f4 = this.m;
            float[] fArr4 = this.p;
            if (Math.abs(((f4 * fArr4[0]) + (this.n * fArr4[1])) * this.x) < 0.01d) {
                float[] fArr5 = this.p;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.m != 0.0f ? rawX / this.p[0] : rawY / this.p[1]), 1.0f), 0.0f);
            if (this.c == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.c == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.t.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.t.F(progress3 == 0.0f);
                }
                this.t.setProgress(fMax);
                hVar.c(1000);
                this.t.d = this.m != 0.0f ? hVar.d() / this.p[0] : hVar.b() / this.p[1];
            } else {
                this.t.d = 0.0f;
            }
            this.f1959r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0269  */
    /* JADX WARN: Code duplicated, block: B:58:0x028d  */
    /* JADX WARN: Code duplicated, block: B:61:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x02b7  */
    public void t(MotionEvent motionEvent, MotionLayout.h hVar, int i, androidx.constraintlayout.motion.widget.a aVar) {
        float left;
        float f;
        int top;
        int bottom;
        int i2;
        float degrees;
        float f2;
        int i3;
        hVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1959r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
            this.o = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.t.getWidth() / 2.0f;
            float height = this.t.getHeight() / 2.0f;
            int i4 = this.f1958k;
            if (i4 != -1) {
                View viewFindViewById = this.t.findViewById(i4);
                this.t.getLocationOnScreen(this.q);
                float left2 = this.q[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.q[1];
                width = left2;
            } else {
                int i5 = this.d;
                if (i5 != -1) {
                    View viewFindViewById2 = this.t.findViewById(this.t.N(i5).h());
                    if (viewFindViewById2 != null) {
                        this.t.getLocationOnScreen(this.q);
                        width = this.q[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                        height = this.q[1] + ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            double dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
            float fAtan2 = (float) (((dAtan2 - Math.atan2(this.s - height, this.f1959r - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.o) {
                float progress = this.t.getProgress();
                if (!this.o) {
                    this.o = true;
                    this.t.setProgress(progress);
                }
                int i6 = this.d;
                if (i6 != -1) {
                    this.t.L(i6, progress, this.h, this.g, this.p);
                    float[] fArr = this.p;
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    this.p[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(progress + ((fAtan2 * this.x) / this.p[1]), 1.0f), 0.0f);
                float progress2 = this.t.getProgress();
                if (fMax != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.t.F(progress2 == 0.0f);
                    }
                    this.t.setProgress(fMax);
                    hVar.c(1000);
                    float fD = hVar.d();
                    double dB = hVar.b();
                    double d = fD;
                    this.t.d = (float) Math.toDegrees((float) ((Math.hypot(dB, d) * Math.sin(Math.atan2(dB, d) - dAtan2)) / Math.hypot(rawX, rawY)));
                } else {
                    this.t.d = 0.0f;
                }
                this.f1959r = motionEvent.getRawX();
                this.s = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.o = false;
        hVar.c(16);
        float fD2 = hVar.d();
        float fB = hVar.b();
        float progress3 = this.t.getProgress();
        float width2 = this.t.getWidth() / 2.0f;
        float height2 = this.t.getHeight() / 2.0f;
        int i7 = this.f1958k;
        if (i7 == -1) {
            int i8 = this.d;
            if (i8 != -1) {
                View viewFindViewById3 = this.t.findViewById(this.t.N(i8).h());
                this.t.getLocationOnScreen(this.q);
                left = this.q[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
                f = this.q[1];
                top = viewFindViewById3.getTop();
                bottom = viewFindViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            float rawY2 = motionEvent.getRawY() - height2;
            double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
            i2 = this.d;
            if (i2 != -1) {
                this.t.L(i2, progress3, this.h, this.g, this.p);
                float[] fArr2 = this.p;
                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
            } else {
                this.p[1] = 360.0f;
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(fB + rawY2, fD2 + rawX2)) - degrees2)) * 62.5f;
            if (Float.isNaN(degrees)) {
                f2 = progress3;
            } else {
                f2 = (((degrees * 3.0f) * this.x) / this.p[1]) + progress3;
            }
            if (f2 != 0.0f || f2 == 1.0f || (i3 = this.c) == 3) {
                if (0.0f < f2 || 1.0f <= f2) {
                    this.t.setState(MotionLayout.l.FINISHED);
                }
                return;
            }
            float fAbs = (degrees * this.x) / this.p[1];
            float f3 = ((double) f2) < 0.5d ? 0.0f : 1.0f;
            if (i3 == 6) {
                if (progress3 + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f3 = 1.0f;
            }
            if (this.c == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f3 = 0.0f;
            }
            this.t.b0(this.c, f3, fAbs * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.t.setState(MotionLayout.l.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById4 = this.t.findViewById(i7);
        this.t.getLocationOnScreen(this.q);
        left = this.q[0] + ((viewFindViewById4.getLeft() + viewFindViewById4.getRight()) / 2.0f);
        f = this.q[1];
        top = viewFindViewById4.getTop();
        bottom = viewFindViewById4.getBottom();
        height2 = f + ((top + bottom) / 2.0f);
        width2 = left;
        float rawX3 = motionEvent.getRawX() - width2;
        float rawY3 = motionEvent.getRawY() - height2;
        double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
        i2 = this.d;
        if (i2 != -1) {
            this.t.L(i2, progress3, this.h, this.g, this.p);
            float[] fArr3 = this.p;
            fArr3[1] = (float) Math.toDegrees(fArr3[1]);
        } else {
            this.p[1] = 360.0f;
        }
        degrees = ((float) (Math.toDegrees(Math.atan2(fB + rawY3, fD2 + rawX3)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees)) {
            f2 = (((degrees * 3.0f) * this.x) / this.p[1]) + progress3;
        } else {
            f2 = progress3;
        }
        if (f2 != 0.0f) {
        }
        if (0.0f < f2) {
        }
        this.t.setState(MotionLayout.l.FINISHED);
    }

    public String toString() {
        if (Float.isNaN(this.m)) {
            return "rotation";
        }
        return this.m + " , " + this.n;
    }

    public void u(float f, float f2) {
        float progress = this.t.getProgress();
        if (!this.o) {
            this.o = true;
            this.t.setProgress(progress);
        }
        this.t.L(this.d, progress, this.h, this.g, this.p);
        float f3 = this.m;
        float[] fArr = this.p;
        if (Math.abs((f3 * fArr[0]) + (this.n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.m;
        float fMax = Math.max(Math.min(progress + (f4 != 0.0f ? (f * f4) / this.p[0] : (f2 * this.n) / this.p[1]), 1.0f), 0.0f);
        if (fMax != this.t.getProgress()) {
            this.t.setProgress(fMax);
        }
    }

    public void v(float f, float f2) {
        this.o = false;
        float progress = this.t.getProgress();
        this.t.L(this.d, progress, this.h, this.g, this.p);
        float f3 = this.m;
        float[] fArr = this.p;
        float f4 = f3 != 0.0f ? (f * f3) / fArr[0] : (f2 * this.n) / fArr[1];
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z = progress != 1.0f;
            int i = this.c;
            if ((i != 3) && z) {
                this.t.b0(i, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f4);
            }
        }
    }

    public void w(float f, float f2) {
        this.f1959r = f;
        this.s = f2;
    }

    public void x(boolean z) {
        if (z) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = G[this.f1956a];
        this.h = fArr5[0];
        this.g = fArr5[1];
        int i = this.f1957b;
        float[][] fArr6 = H;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.m = fArr7[0];
        this.n = fArr7[1];
    }

    public void y(int i) {
        this.c = i;
    }

    public void z(float f, float f2) {
        this.f1959r = f;
        this.s = f2;
        this.o = false;
    }
}
