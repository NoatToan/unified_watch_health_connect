package defpackage;

import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.ui.main.R;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class vdc {
    public static int d(int i) {
        if (i == 1) {
            return R.drawable.body_shape_apple;
        }
        if (i == 2) {
            return R.drawable.body_shape_pear;
        }
        if (i == 3) {
            return R.drawable.body_shape_chili;
        }
        if (i == 4) {
            return R.drawable.body_shape_inverted_triangle;
        }
        if (i == 5) {
            return R.drawable.body_shape_hourglass;
        }
        return R.drawable.body_shape_well_proportioned;
    }

    public static int b(int i) {
        if (i == 1) {
            return R.drawable.body_data_shape_apple;
        }
        if (i == 2) {
            return R.drawable.body_data_shape_pear;
        }
        if (i == 3) {
            return R.drawable.body_data_shape_pepper;
        }
        if (i == 4) {
            return R.drawable.body_data_shape_triangle;
        }
        if (i == 5) {
            return R.drawable.body_data_shape_hourglass;
        }
        return R.drawable.body_data_shape_tagging;
    }

    public static int e(int i) {
        return ContextCompat.getColor(BaseApplication.b(), c(i));
    }

    public static int h(int i) {
        return ContextCompat.getColor(BaseApplication.b(), g(i));
    }

    public static int j(int i) {
        return ContextCompat.getColor(BaseApplication.b(), a(i));
    }

    public static int f(int i) {
        return ContextCompat.getColor(BaseApplication.b(), i(i));
    }

    public static int c(int i) {
        if (i == 1) {
            return R.color.weight_grade_low;
        }
        if (i == 2) {
            return R.color.weight_grade_standard;
        }
        if (i == 3) {
            return R.color.weight_grade_high;
        }
        return R.color.weight_grade_super_high;
    }

    public static int g(int i) {
        if (i == 1) {
            return R.color.weight_grade_standard;
        }
        if (i == 2) {
            return R.color.weight_grade_standard_critical;
        }
        if (i == 3) {
            return R.color.weight_grade_high;
        }
        return R.color.weight_grade_super_high;
    }

    public static int a(int i) {
        if (i == 1) {
            return R.color.weight_grade_low;
        }
        if (i == 2) {
            return R.color.weight_grade_standard;
        }
        if (i == 3) {
            return R.color.weight_grade_standard_critical;
        }
        return R.color.weight_grade_high;
    }

    public static int i(int i) {
        if (i == 1) {
            return R.color.weight_grade_standard;
        }
        return R.color.weight_grade_high;
    }

    public static double b(int i, dnb dnbVar) {
        if (dnbVar == null) {
            return -1.0d;
        }
        double d = d(i, dnbVar);
        if (!exz.d(d, -1.0d)) {
            return d;
        }
        double dF = f(i, dnbVar);
        if (!exz.d(dF, -1.0d)) {
            return dF;
        }
        double dG = g(i, dnbVar);
        if (exz.d(dG, -1.0d)) {
            return -1.0d;
        }
        return dG;
    }

    private static double d(int i, dnb dnbVar) {
        if (i == 1) {
            return exz.c(dnbVar.an(), dnbVar.c(), dnbVar.b(), 0);
        }
        if (i == 4) {
            return exz.b(dnbVar.an(), dnbVar.c(), dnbVar.av(), dnbVar.e(), 0);
        }
        if (i != 14) {
            if (i == 400) {
                return exz.a(dnbVar.an(), dnbVar.c(), dnbVar.av(), dnbVar.e(), 0);
            }
            switch (i) {
                case 100:
                    return exz.a(dnbVar.an(), dnbVar.c(), dnbVar.b(), 0);
                case 101:
                    return exz.b(dnbVar.an(), dnbVar.c(), dnbVar.b(), 0);
                case 102:
                    return exz.e(dnbVar.an(), dnbVar.c(), 0);
                case 103:
                    break;
                default:
                    return -1.0d;
            }
        }
        double dA = exz.a(dnbVar.b(), dnbVar.av());
        if (i == 14) {
            return exz.a(dnbVar.an(), dnbVar.c(), dnbVar.r(), dA, 0);
        }
        return exz.d(dnbVar.an(), dnbVar.c(), dnbVar.r(), dA, 1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    private static double f(int i, dnb dnbVar) {
        int iD;
        double dS;
        int iC = dnbVar.c();
        byte bAn = dnbVar.an();
        int iR = dnbVar.r();
        if (i == 3 || i == 300) {
            double dAq = dnbVar.aq();
            if (!ezh.r(dAq)) {
                dAq = dnbVar.ak();
            }
            if (i == 3) {
                iD = exz.b(bAn, dAq, iC);
            } else {
                iD = exz.d(bAn, dAq, iC);
            }
        } else if (i == 500) {
            dS = dnbVar.s();
            if (i == 5) {
                iD = exz.i(dS);
            } else {
                iD = exz.f(dS);
            }
        } else if (i == 600) {
            iD = exz.b(bAn, iC, iR, dnbVar.ad(), 0);
        } else if (i == 700) {
            iD = exz.e(b(dnbVar));
        } else if (i == 5) {
            dS = dnbVar.s();
            if (i == 5) {
                iD = exz.i(dS);
            } else {
                iD = exz.f(dS);
            }
        } else if (i == 6) {
            iD = exz.c(bAn, iC, iR, dnbVar.ad(), 0);
        } else {
            if (i != 7) {
                return -1.0d;
            }
            iD = exz.c(b(dnbVar));
        }
        return iD;
    }

    private static fae b(dnb dnbVar) {
        fae faeVar = new fae();
        faeVar.b(dnbVar.an());
        faeVar.e(dnbVar.r());
        faeVar.d(dnbVar.g());
        faeVar.a(0);
        faeVar.d(dnbVar.getFractionDigitByType(7));
        faeVar.c(dnbVar.c());
        return faeVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    private static double g(int i, dnb dnbVar) {
        double dAq;
        double dE;
        int iD;
        if (i == 8) {
            dAq = dnbVar.aq();
            if (!ezh.r(dAq)) {
                dAq = dnbVar.ak();
            }
            dE = exz.e(dnbVar.av(), dAq, dnbVar.b(), dnbVar.g(), dnbVar.getFractionDigitByType(0));
            if (i == 8) {
                iD = exz.a(dnbVar.an(), dnbVar.c(), dE);
            } else {
                iD = exz.d(dnbVar.an(), dnbVar.c(), dE);
            }
        } else if (i == 10) {
            iD = exz.e(dnbVar.an(), dnbVar.c(), dnbVar.r(), dnbVar.am(), 0);
        } else if (i == 800) {
            dAq = dnbVar.aq();
            if (!ezh.r(dAq)) {
                dAq = dnbVar.ak();
            }
            dE = exz.e(dnbVar.av(), dAq, dnbVar.b(), dnbVar.g(), dnbVar.getFractionDigitByType(0));
            if (i == 8) {
                iD = exz.a(dnbVar.an(), dnbVar.c(), dE);
            } else {
                iD = exz.d(dnbVar.an(), dnbVar.c(), dE);
            }
        } else {
            if (i != 1000) {
                return -1.0d;
            }
            iD = exz.f(dnbVar.an(), dnbVar.c(), dnbVar.r(), dnbVar.am(), 0);
        }
        return iD;
    }

    public static String e(int i, dnb dnbVar) {
        if (dnbVar == null || i != 99) {
            return "";
        }
        return WeightDataManager.INSTANCE.getHealthAdvice(exz.b(dnbVar.f(), Utils.o(), dnbVar.an(), dnbVar.c()) - 1, exz.c(dnbVar.an(), dnbVar.c(), dnbVar.b(), 0) - 1, exz.c(dnbVar.an(), dnbVar.c(), dnbVar.r(), dnbVar.ad(), 0) - 1);
    }

    public static double[] a(int i, dnb dnbVar) {
        if (dnbVar == null) {
            return new double[0];
        }
        int iC = dnbVar.c();
        byte bAn = dnbVar.an();
        int iR = dnbVar.r();
        if (i == 1) {
            return exz.b(bAn, iC, 0);
        }
        if (i == 6) {
            return exz.e(bAn, iC, iR, 0);
        }
        if (i == 14) {
            return exz.c(bAn, iC, iR, 0);
        }
        if (i == 10) {
            return exz.d(bAn, iC, iR, 0);
        }
        if (i == 5) {
            return exz.z();
        }
        if (i == 3) {
            return exz.h(bAn, iC);
        }
        if (i == 8) {
            return exz.e(bAn, iC);
        }
        if (i == 7) {
            return exz.c(bAn, iR, iC);
        }
        if (i == 4) {
            return exz.e(bAn, iC, dnbVar.av(), 0);
        }
        return new double[0];
    }

    public static String[] c(int i, dnb dnbVar) {
        if (dnbVar == null) {
            return new String[0];
        }
        int iC = dnbVar.c();
        byte bAn = dnbVar.an();
        if (i == 1) {
            return exz.a(bAn, iC, 0);
        }
        if (i == 5) {
            return exz.u();
        }
        if (i == 3) {
            return exz.b(bAn, iC);
        }
        if (i == 8) {
            return exz.a(bAn, iC);
        }
        if (i == 4) {
            return exz.d(bAn, iC, dnbVar.av(), 0);
        }
        return new String[0];
    }
}
