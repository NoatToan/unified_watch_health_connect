package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class bep {
    public static int a(int i) {
        return (int) (i * 1.3333334f);
    }

    public static boolean b(int i, int i2, ypk ypkVar) {
        if (ypkVar == null) {
            return ((float) a(i)) >= 2048.0f && a(i2) >= 2048;
        }
        return a(i) >= ypkVar.f40404a && a(i2) >= ypkVar.f40405b;
    }

    public static boolean c(o98 o98Var, ypk ypkVar) {
        if (o98Var == null) {
            return false;
        }
        int iD = o98Var.D();
        return (iD == 90 || iD == 270) ? b(o98Var.getHeight(), o98Var.getWidth(), ypkVar) : b(o98Var.getWidth(), o98Var.getHeight(), ypkVar);
    }
}
