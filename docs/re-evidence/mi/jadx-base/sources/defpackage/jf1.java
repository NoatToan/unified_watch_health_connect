package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class jf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f22720b = PorterDuff.Mode.SRC_IN;
    public static jf1 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public crk f22721a;

    public class a implements crk.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f22722a = {hpi.R, hpi.P, hpi.f20317a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f22723b = {hpi.o, hpi.B, hpi.t, hpi.p, hpi.q, hpi.s, hpi.f20320r};
        public final int[] c = {hpi.O, hpi.Q, hpi.f20319k, hpi.K, hpi.L, hpi.M, hpi.N};
        public final int[] d = {hpi.w, hpi.i, hpi.v};
        public final int[] e = {hpi.J, hpi.S};
        public final int[] f = {hpi.c, hpi.g, hpi.d, hpi.h};

        @Override // crk.c
        public Drawable a(crk crkVar, Context context, int i) {
            if (i == hpi.j) {
                return new LayerDrawable(new Drawable[]{crkVar.i(context, hpi.i), crkVar.i(context, hpi.f20319k)});
            }
            if (i == hpi.y) {
                return l(crkVar, context, smi.i);
            }
            if (i == hpi.x) {
                return l(crkVar, context, smi.j);
            }
            if (i == hpi.z) {
                return l(crkVar, context, smi.f33791k);
            }
            return null;
        }

        @Override // crk.c
        public ColorStateList b(Context context, int i) {
            if (i == hpi.m) {
                return of1.a(context, dli.e);
            }
            if (i == hpi.I) {
                return of1.a(context, dli.h);
            }
            if (i == hpi.H) {
                return k(context);
            }
            if (i == hpi.f) {
                return j(context);
            }
            if (i == hpi.f20318b) {
                return g(context);
            }
            if (i == hpi.e) {
                return i(context);
            }
            if (i == hpi.D || i == hpi.E) {
                return of1.a(context, dli.g);
            }
            if (f(this.f22723b, i)) {
                return f9p.e(context, qii.y);
            }
            if (f(this.e, i)) {
                return of1.a(context, dli.d);
            }
            if (f(this.f, i)) {
                return of1.a(context, dli.c);
            }
            if (i == hpi.A) {
                return of1.a(context, dli.f);
            }
            return null;
        }

        @Override // crk.c
        public PorterDuff.Mode c(int i) {
            if (i == hpi.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // crk.c
        public boolean d(Context context, int i, Drawable drawable) {
            if (i == hpi.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), f9p.c(context, qii.y), jf1.f22720b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), f9p.c(context, qii.y), jf1.f22720b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), f9p.c(context, qii.w), jf1.f22720b);
                return true;
            }
            if (i != hpi.y && i != hpi.x && i != hpi.z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), f9p.b(context, qii.y), jf1.f22720b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), f9p.c(context, qii.w), jf1.f22720b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), f9p.c(context, qii.w), jf1.f22720b);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
        /* JADX WARN: Code duplicated, block: B:24:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x0068  */
        /* JADX WARN: Code duplicated, block: B:29:0x006c A[RETURN] */
        @Override // crk.c
        public boolean e(Context context, int i, Drawable drawable) {
            int i2;
            boolean z;
            int iRound;
            PorterDuff.Mode mode = jf1.f22720b;
            if (!f(this.f22722a, i)) {
                if (f(this.c, i)) {
                    i2 = qii.w;
                } else {
                    if (f(this.d, i)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else if (i == hpi.u) {
                        z = true;
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                        mode = mode;
                    } else if (i != hpi.l) {
                        i2 = 0;
                        z = false;
                        iRound = -1;
                    }
                    mode = mode;
                    iRound = -1;
                    i2 = 16842801;
                    z = true;
                }
                if (z) {
                    return false;
                }
                if (x47.a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(jf1.e(f9p.c(context, i2), mode));
                if (iRound != -1) {
                    drawable.setAlpha(iRound);
                }
                return true;
            }
            i2 = qii.y;
            z = true;
            iRound = -1;
            if (z) {
                return false;
            }
            if (x47.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(jf1.e(f9p.c(context, i2), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }

        public final boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i) {
            int iC = f9p.c(context, qii.x);
            return new ColorStateList(new int[][]{f9p.f17577b, f9p.e, f9p.c, f9p.i}, new int[]{f9p.b(context, qii.v), z44.j(iC, i), z44.j(iC, i), i});
        }

        public final ColorStateList i(Context context) {
            return h(context, f9p.c(context, qii.u));
        }

        public final ColorStateList j(Context context) {
            return h(context, f9p.c(context, qii.v));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = f9p.e(context, qii.A);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = f9p.f17577b;
                iArr2[0] = f9p.b(context, qii.A);
                iArr[1] = f9p.f;
                iArr2[1] = f9p.c(context, qii.w);
                iArr[2] = f9p.i;
                iArr2[2] = f9p.c(context, qii.A);
            } else {
                int[] iArr3 = f9p.f17577b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = f9p.f;
                iArr2[1] = f9p.c(context, qii.w);
                iArr[2] = f9p.i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(crk crkVar, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableI = crkVar.i(context, hpi.F);
            Drawable drawableI2 = crkVar.i(context, hpi.G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (x47.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = jf1.f22720b;
            }
            drawable.setColorFilter(jf1.e(i, mode));
        }
    }

    public static synchronized jf1 b() {
        try {
            if (c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        return crk.k(i, mode);
    }

    public static synchronized void h() {
        if (c == null) {
            jf1 jf1Var = new jf1();
            c = jf1Var;
            jf1Var.f22721a = crk.g();
            c.f22721a.t(new a());
        }
    }

    public static void i(Drawable drawable, vfp vfpVar, int[] iArr) {
        crk.v(drawable, vfpVar, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.f22721a.i(context, i);
    }

    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.f22721a.j(context, i, z);
    }

    public synchronized ColorStateList f(Context context, int i) {
        return this.f22721a.l(context, i);
    }

    public synchronized void g(Context context) {
        this.f22721a.r(context);
    }
}
