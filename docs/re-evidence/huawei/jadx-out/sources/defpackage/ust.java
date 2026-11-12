package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class ust extends dnb {
    @Override // defpackage.dnb
    public double ab() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double ae() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double af() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double ah() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double aj() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double al() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double ao() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double ap() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double ar() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double as() {
        return -1.0d;
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public int getFractionDigitByType(int i) {
        return 1;
    }

    @Override // defpackage.dnb
    public double i() {
        return -1.0d;
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public boolean isNewScaleType() {
        return false;
    }

    @Override // defpackage.dnb
    public double j() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double m() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double u() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double v() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double w() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double y() {
        return -1.0d;
    }

    @Override // defpackage.dnb
    public double b() {
        return super.b();
    }

    @Override // defpackage.dnb
    public double d() {
        return super.d();
    }

    @Override // defpackage.dnb
    public double ak() {
        return super.ak();
    }

    @Override // defpackage.dnb
    public double aq() {
        return super.aq();
    }

    @Override // defpackage.dnb
    public double g() {
        return super.g();
    }

    @Override // defpackage.dnb
    public double f() {
        return super.f();
    }

    @Override // defpackage.dnb
    public double e() {
        return super.e();
    }

    @Override // defpackage.dnb
    public double ad() {
        return super.ad();
    }

    @Override // defpackage.dnb
    public double aa() {
        return super.aa();
    }

    @Override // defpackage.dnb
    public double h() {
        return super.h();
    }

    @Override // defpackage.dnb
    public double a() {
        return super.a();
    }

    @Override // defpackage.dnb
    public double q() {
        return super.q();
    }

    @Override // defpackage.dnb
    public double z() {
        return super.z();
    }

    @Override // defpackage.dnb
    public double am() {
        return super.am();
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String getStringLevelByType(int i) {
        return "";
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public double[] getDoubleArrayLevelByType(int i) {
        return new double[0];
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String getWeightScaleProductId() {
        if (o() == 133) {
            return "f005e900-7dcf-49f7-a1b0-a98e46bf62ec";
        }
        return "";
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String[] getStringArrayLevelByType(int i) {
        return new String[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0020 A[RETURN] */
    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public boolean isVisible(int i, boolean z) {
        switch (i) {
            case 0:
            case 2:
            case 11:
            case 12:
                return vdo.b(this, i);
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 14:
                return vdo.e(this, i);
            case 9:
            case 13:
                if (!z) {
                    return vdo.d(this, i);
                }
                return false;
            default:
                switch (i) {
                    case 25:
                        if (!z) {
                            return vdo.d(this, i);
                        }
                        return false;
                    case 26:
                        return vdo.e(this, i);
                    case 27:
                        return false;
                    default:
                        switch (i) {
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                                return false;
                            default:
                                return super.isVisible(i, z);
                        }
                }
        }
    }
}
