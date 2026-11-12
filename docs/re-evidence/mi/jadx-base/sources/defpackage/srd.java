package defpackage;

import android.graphics.Matrix;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.facebook.common.internal.ImmutableList;

/* JADX INFO: loaded from: classes4.dex */
public class srd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImmutableList<Integer> f33913a = ImmutableList.of((Object[]) new Integer[]{2, 7, 4, 5});

    public static int a(int i) {
        return Math.max(1, 8 / i);
    }

    public static float b(ypk ypkVar, int i, int i2) {
        if (ypkVar == null) {
            return 1.0f;
        }
        float f = i;
        float f2 = i2;
        float fMax = Math.max(ypkVar.f40404a / f, ypkVar.f40405b / f2);
        float f3 = f * fMax;
        float f4 = ypkVar.c;
        if (f3 > f4) {
            fMax = f4 / f;
        }
        return f2 * fMax > f4 ? f4 / f2 : fMax;
    }

    public static int c(o98 o98Var) {
        int iD = o98Var.D();
        if (iD == 90 || iD == 180 || iD == 270) {
            return o98Var.D();
        }
        return 0;
    }

    public static int d(jxk jxkVar, o98 o98Var) {
        int iO = o98Var.o();
        ImmutableList<Integer> immutableList = f33913a;
        int iIndexOf = immutableList.indexOf(Integer.valueOf(iO));
        if (iIndexOf >= 0) {
            return immutableList.get((iIndexOf + ((!jxkVar.g() ? jxkVar.e() : 0) / 90)) % immutableList.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int e(jxk jxkVar, o98 o98Var) {
        if (!jxkVar.f()) {
            return 0;
        }
        int iC = c(o98Var);
        return jxkVar.g() ? iC : (iC + jxkVar.e()) % SpatialRelationUtil.A_CIRCLE_DEGREE;
    }

    public static int f(jxk jxkVar, ypk ypkVar, o98 o98Var, boolean z) {
        if (!z || ypkVar == null) {
            return 8;
        }
        int iE = e(jxkVar, o98Var);
        int iD = f33913a.contains(Integer.valueOf(o98Var.o())) ? d(jxkVar, o98Var) : 0;
        boolean z2 = iE == 90 || iE == 270 || iD == 5 || iD == 7;
        int iK = k(b(ypkVar, z2 ? o98Var.getHeight() : o98Var.getWidth(), z2 ? o98Var.getWidth() : o98Var.getHeight()), ypkVar.d);
        if (iK > 8) {
            return 8;
        }
        if (iK < 1) {
            return 1;
        }
        return iK;
    }

    public static Matrix g(o98 o98Var, jxk jxkVar) {
        if (f33913a.contains(Integer.valueOf(o98Var.o()))) {
            return h(d(jxkVar, o98Var));
        }
        int iE = e(jxkVar, o98Var);
        if (iE == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iE);
        return matrix;
    }

    public static Matrix h(int i) {
        Matrix matrix = new Matrix();
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else {
            if (i != 5) {
                return null;
            }
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static boolean i(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static boolean j(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    public static int k(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }
}
