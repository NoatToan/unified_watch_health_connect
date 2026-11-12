package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class rbl {

    public static abstract class a implements b {
        @Override // rbl.b
        public Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            b(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32389a = j.j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f32390b = i.j;
        public static final b c = g.j;
        public static final b d = h.j;
        public static final b e = c.j;
        public static final b f = e.j;
        public static final b g = d.j;
        public static final b h = k.j;
        public static final b i = f.j;

        Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3);
    }

    public static class c extends a {
        public static final b j = new c();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    public static class d extends a {
        public static final b j = new d();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fHeight;
            float fWidth;
            if (f4 > f3) {
                fWidth = rect.left + ((rect.width() - (i * f4)) * 0.5f);
                fHeight = rect.top;
                f3 = f4;
            } else {
                float f5 = rect.left;
                fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
                fWidth = f5;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    public static class e extends a {
        public static final b j = new e();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(Math.min(f3, f4), 1.0f);
            float fWidth = rect.left + ((rect.width() - (i * fMin)) * 0.5f);
            float fHeight = rect.top + ((rect.height() - (i2 * fMin)) * 0.5f);
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    public static class f extends a {
        public static final b j = new f();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(f3, f4);
            float f5 = rect.left;
            float fHeight = rect.top + (rect.height() - (i2 * fMin));
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    public static class g extends a {
        public static final b j = new g();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(f3, f4);
            float fWidth = rect.left + ((rect.width() - (i * fMin)) * 0.5f);
            float fHeight = rect.top + ((rect.height() - (i2 * fMin)) * 0.5f);
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    public static class h extends a {
        public static final b j = new h();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(f3, f4);
            float fWidth = rect.left + (rect.width() - (i * fMin));
            float fHeight = rect.top + (rect.height() - (i2 * fMin));
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    public static class i extends a {
        public static final b j = new i();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(f3, f4);
            float f5 = rect.left;
            float f6 = rect.top;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    public static class j extends a {
        public static final b j = new j();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = rect.left;
            float f6 = rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    public static class k extends a {
        public static final b j = new k();

        @Override // rbl.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMax;
            float fMax2;
            if (f4 > f3) {
                float f5 = i * f4;
                fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f5), 0.0f), rect.width() - f5);
                fMax2 = rect.top;
                f3 = f4;
            } else {
                fMax = rect.left;
                float f6 = i2 * f3;
                fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f6), 0.0f), rect.height() - f6) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    public interface l {
        Object getState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ibl a(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof ibl) {
            return (ibl) drawable;
        }
        if (drawable instanceof o47) {
            return a(((o47) drawable).getDrawable());
        }
        if (drawable instanceof jj1) {
            jj1 jj1Var = (jj1) drawable;
            int iD = jj1Var.d();
            for (int i2 = 0; i2 < iD; i2++) {
                ibl iblVarA = a(jj1Var.b(i2));
                if (iblVarA != null) {
                    return iblVarA;
                }
            }
        }
        return null;
    }
}
