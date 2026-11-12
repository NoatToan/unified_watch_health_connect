package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class mxq extends gep {

    public static class a extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setAlpha(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class b extends mxq {
        public String l;
        public SparseArray<ConstraintAttribute> m;
        public SparseArray<float[]> n = new SparseArray<>();
        public float[] o;
        public float[] p;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.l = str.split(",")[1];
            this.m = sparseArray;
        }

        @Override // defpackage.gep
        public void b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // defpackage.gep
        public void e(int i) {
            int size = this.m.size();
            int iH = this.m.valueAt(0).h();
            double[] dArr = new double[size];
            int i2 = iH + 2;
            this.o = new float[i2];
            this.p = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.m.keyAt(i3);
                ConstraintAttribute constraintAttributeValueAt = this.m.valueAt(i3);
                float[] fArrValueAt = this.n.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.f(this.o);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.o;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iH] = fArrValueAt[0];
                dArr3[iH + 1] = fArrValueAt[1];
            }
            this.f18904a = hd5.a(i, dArr, dArr2);
        }

        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            this.f18904a.e(f, this.o);
            float[] fArr = this.o;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float fA = szdVar.a(view, this.l, 0);
                this.j = fA;
                if (Float.isNaN(fA)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.j) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.j = f4;
            this.i = j;
            float fA2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.p;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.h;
                float f5 = this.o[i];
                this.h = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fA2) + f3;
                i++;
            }
            ke5.b(this.m.valueAt(0), view, this.p);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }

        public void j(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.m.append(i, constraintAttribute);
            this.n.append(i, new float[]{f, f2});
            this.f18905b = Math.max(this.f18905b, i2);
        }
    }

    public static class c extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setElevation(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class d extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            return this.h;
        }

        public boolean j(View view, szd szdVar, float f, long j, double d, double d2) {
            view.setRotation(f(f, j, view, szdVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.h;
        }
    }

    public static class e extends mxq {
        public boolean l = false;

        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(f(f, j, view, szdVar));
            } else {
                if (this.l) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(f(f, j, view, szdVar)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.h;
        }
    }

    public static class f extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setRotation(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class g extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setRotationX(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class h extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setRotationY(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class i extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setScaleX(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class j extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setScaleY(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class k extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setTranslationX(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class l extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setTranslationY(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static class m extends mxq {
        @Override // defpackage.mxq
        public boolean i(View view, float f, long j, szd szdVar) {
            view.setTranslationZ(f(f, j, view, szdVar));
            return this.h;
        }
    }

    public static mxq g(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    public static mxq h(String str, long j2) {
        mxq gVar;
        str.hashCode();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.c(j2);
        return gVar;
    }

    public float f(float f2, long j2, View view, szd szdVar) {
        this.f18904a.e(f2, this.g);
        float[] fArr = this.g;
        float f3 = fArr[1];
        if (f3 == 0.0f) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float fA = szdVar.a(view, this.f, 0);
            this.j = fA;
            if (Float.isNaN(fA)) {
                this.j = 0.0f;
            }
        }
        float f4 = (float) ((((double) this.j) + (((j2 - this.i) * 1.0E-9d) * ((double) f3))) % 1.0d);
        this.j = f4;
        szdVar.b(view, this.f, 0, f4);
        this.i = j2;
        float f5 = this.g[0];
        float fA2 = (a(this.j) * f5) + this.g[2];
        this.h = (f5 == 0.0f && f3 == 0.0f) ? false : true;
        return fA2;
    }

    public abstract boolean i(View view, float f2, long j2, szd szdVar);
}
