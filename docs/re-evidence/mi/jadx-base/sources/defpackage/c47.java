package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class c47 {
    public static float a(jxk jxkVar, ypk ypkVar, o98 o98Var) {
        b6i.b(o98.M(o98Var));
        if (ypkVar == null || ypkVar.f40405b <= 0 || ypkVar.f40404a <= 0 || o98Var.getWidth() == 0 || o98Var.getHeight() == 0) {
            return 1.0f;
        }
        int iC = c(jxkVar, o98Var);
        boolean z = iC == 90 || iC == 270;
        int height = z ? o98Var.getHeight() : o98Var.getWidth();
        int width = z ? o98Var.getWidth() : o98Var.getHeight();
        float f = ypkVar.f40404a / height;
        float f2 = ypkVar.f40405b / width;
        float fMax = Math.max(f, f2);
        cm8.x("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(ypkVar.f40404a), Integer.valueOf(ypkVar.f40405b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(fMax));
        return fMax;
    }

    public static int b(jxk jxkVar, ypk ypkVar, o98 o98Var, int i) {
        if (!o98.M(o98Var)) {
            return 1;
        }
        float fA = a(jxkVar, ypkVar, o98Var);
        int iE = o98Var.s() == pv5.f30818a ? e(fA) : d(fA);
        int iMax = Math.max(o98Var.getHeight(), o98Var.getWidth());
        float f = ypkVar != null ? ypkVar.c : i;
        while (iMax / iE > f) {
            iE = o98Var.s() == pv5.f30818a ? iE * 2 : iE + 1;
        }
        return iE;
    }

    public static int c(jxk jxkVar, o98 o98Var) {
        if (!jxkVar.g()) {
            return 0;
        }
        int iD = o98Var.D();
        b6i.b(iD == 0 || iD == 90 || iD == 180 || iD == 270);
        return iD;
    }

    public static int d(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = i;
            if ((1.0d / d) + ((1.0d / (Math.pow(d, 2.0d) - d)) * 0.3333333432674408d) <= f) {
                return i - 1;
            }
            i++;
        }
    }

    public static int e(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = 1.0d / ((double) i2);
            if (d + (0.3333333432674408d * d) <= f) {
                return i;
            }
            i = i2;
        }
    }
}
