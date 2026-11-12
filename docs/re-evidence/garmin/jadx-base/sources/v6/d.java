package v6;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w6.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends o6.k {

    public static class a extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setAlpha(a(f14));
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<androidx.constraintlayout.widget.a> f175784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f175785g;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f175784f = sparseArray;
        }

        @Override // o6.k
        public final void b(float f14, int i14) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // o6.k
        public final void c(int i14) {
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f175784f;
            int size = sparseArray.size();
            int iC = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.f175785g = new float[iC];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
            for (int i15 = 0; i15 < size; i15++) {
                int iKeyAt = sparseArray.keyAt(i15);
                androidx.constraintlayout.widget.a aVarValueAt = sparseArray.valueAt(i15);
                dArr[i15] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.b(this.f175785g);
                int i16 = 0;
                while (true) {
                    float[] fArr = this.f175785g;
                    if (i16 < fArr.length) {
                        dArr2[i15][i16] = fArr[i16];
                        i16++;
                    }
                }
            }
            this.f129503a = o6.b.a(i14, dArr, dArr2);
        }

        @Override // v6.d
        public final void d(float f14, View view2) {
            this.f129503a.d(f14, this.f175785g);
            v6.a.b(this.f175784f.valueAt(0), view2, this.f175785g);
        }
    }

    public static class c extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setElevation(a(f14));
        }
    }

    /* JADX INFO: renamed from: v6.d$d, reason: collision with other inner class name */
    public static class C3281d extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
        }
    }

    public static class e extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setPivotX(a(f14));
        }
    }

    public static class f extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setPivotY(a(f14));
        }
    }

    public static class g extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f175786f = false;

        @Override // v6.d
        public final void d(float f14, View view2) {
            Method method;
            if (view2 instanceof q) {
                ((q) view2).setProgress(a(f14));
                return;
            }
            if (this.f175786f) {
                return;
            }
            try {
                method = view2.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f175786f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view2, Float.valueOf(a(f14)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    public static class h extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setRotation(a(f14));
        }
    }

    public static class i extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setRotationX(a(f14));
        }
    }

    public static class j extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setRotationY(a(f14));
        }
    }

    public static class k extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setScaleX(a(f14));
        }
    }

    public static class l extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setScaleY(a(f14));
        }
    }

    public static class m extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setTranslationX(a(f14));
        }
    }

    public static class n extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setTranslationY(a(f14));
        }
    }

    public static class o extends d {
        @Override // v6.d
        public final void d(float f14, View view2) {
            view2.setTranslationZ(a(f14));
        }
    }

    public abstract void d(float f14, View view2);
}
