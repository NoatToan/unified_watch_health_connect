package v6;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import o6.p;
import w6.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends p {

    public static class a extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setAlpha(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class b extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f175787k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final SparseArray<androidx.constraintlayout.widget.a> f175788l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final SparseArray<float[]> f175789m = new SparseArray<>();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float[] f175790n;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f175787k = str.split(",")[1];
            this.f175788l = sparseArray;
        }

        @Override // o6.p
        public final void b(float f14, float f15, float f16, int i14, int i15) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // o6.p
        public final void c(int i14) {
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f175788l;
            int size = sparseArray.size();
            int iC = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            int i15 = iC + 2;
            this.f175790n = new float[i15];
            this.f129538g = new float[iC];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i15);
            for (int i16 = 0; i16 < size; i16++) {
                int iKeyAt = sparseArray.keyAt(i16);
                androidx.constraintlayout.widget.a aVarValueAt = sparseArray.valueAt(i16);
                float[] fArrValueAt = this.f175789m.valueAt(i16);
                dArr[i16] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.b(this.f175790n);
                int i17 = 0;
                while (true) {
                    float[] fArr = this.f175790n;
                    if (i17 < fArr.length) {
                        dArr2[i16][i17] = fArr[i17];
                        i17++;
                    }
                }
                double[] dArr3 = dArr2[i16];
                dArr3[iC] = fArrValueAt[0];
                dArr3[iC + 1] = fArrValueAt[1];
            }
            this.f129532a = o6.b.a(i14, dArr, dArr2);
        }

        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            this.f129532a.d(f14, this.f175790n);
            float[] fArr = this.f175790n;
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            long j14 = j8 - this.f129540i;
            if (Float.isNaN(this.f129541j)) {
                float fA = dVar.a(view2, this.f175787k);
                this.f129541j = fA;
                if (Float.isNaN(fA)) {
                    this.f129541j = 0.0f;
                }
            }
            float f17 = (float) ((((j14 * 1.0E-9d) * ((double) f15)) + ((double) this.f129541j)) % 1.0d);
            this.f129541j = f17;
            this.f129540i = j8;
            float fA2 = a(f17);
            this.f129539h = false;
            int i14 = 0;
            while (true) {
                float[] fArr2 = this.f129538g;
                if (i14 >= fArr2.length) {
                    break;
                }
                boolean z14 = this.f129539h;
                float f18 = this.f175790n[i14];
                this.f129539h = z14 | (((double) f18) != 0.0d);
                fArr2[i14] = (f18 * fA2) + f16;
                i14++;
            }
            v6.a.b(this.f175788l.valueAt(0), view2, this.f129538g);
            if (f15 != 0.0f) {
                this.f129539h = true;
            }
            return this.f129539h;
        }
    }

    public static class c extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setElevation(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class d extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            return this.f129539h;
        }
    }

    /* JADX INFO: renamed from: v6.e$e, reason: collision with other inner class name */
    public static class C3282e extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f175791k = false;

        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            Method method;
            C3282e c3282e;
            if (view2 instanceof q) {
                float fD = d(f14, j8, view2, dVar);
                c3282e = this;
                ((q) view2).setProgress(fD);
            } else {
                if (this.f175791k) {
                    return false;
                }
                try {
                    method = view2.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f175791k = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        float fD2 = d(f14, j8, view2, dVar);
                        c3282e = this;
                        try {
                            method.invoke(view2, Float.valueOf(fD2));
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        c3282e = this;
                    }
                } else {
                    c3282e = this;
                }
            }
            return c3282e.f129539h;
        }
    }

    public static class f extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setRotation(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class g extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setRotationX(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class h extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setRotationY(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class i extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setScaleX(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class j extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setScaleY(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class k extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setTranslationX(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class l extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setTranslationY(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public static class m extends e {
        @Override // v6.e
        public final boolean e(float f14, long j8, View view2, o6.d dVar) {
            view2.setTranslationZ(d(f14, j8, view2, dVar));
            return this.f129539h;
        }
    }

    public final float d(float f14, long j8, View view2, o6.d dVar) {
        this.f129532a.d(f14, this.f129538g);
        float[] fArr = this.f129538g;
        boolean z14 = true;
        float f15 = fArr[1];
        if (f15 == 0.0f) {
            this.f129539h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f129541j)) {
            float fA = dVar.a(view2, this.f129537f);
            this.f129541j = fA;
            if (Float.isNaN(fA)) {
                this.f129541j = 0.0f;
            }
        }
        float f16 = (float) (((((j8 - this.f129540i) * 1.0E-9d) * ((double) f15)) + ((double) this.f129541j)) % 1.0d);
        this.f129541j = f16;
        String str = this.f129537f;
        HashMap<Object, HashMap<String, float[]>> map = dVar.f129467a;
        if (map.containsKey(view2)) {
            HashMap<String, float[]> map2 = map.get(view2);
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f16;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f16});
                map.put(view2, map2);
            }
        } else {
            HashMap<String, float[]> map3 = new HashMap<>();
            map3.put(str, new float[]{f16});
            map.put(view2, map3);
        }
        this.f129540i = j8;
        float f17 = this.f129538g[0];
        float fA2 = (a(this.f129541j) * f17) + this.f129538g[2];
        if (f17 == 0.0f && f15 == 0.0f) {
            z14 = false;
        }
        this.f129539h = z14;
        return fA2;
    }

    public abstract boolean e(float f14, long j8, View view2, o6.d dVar);
}
