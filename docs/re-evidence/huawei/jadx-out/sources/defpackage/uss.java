package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class uss extends dnb {
    private static final long serialVersionUID = 5590260758086929244L;

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public boolean isNewScaleType() {
        return true;
    }

    private static double ai(double d) {
        return Math.round(d * 10.0d) / 10.0d;
    }

    private static fae a(byte b2, int i, double d, int i2, int i3) {
        fae faeVar = new fae();
        faeVar.b(b2);
        faeVar.e(i);
        faeVar.d(d);
        faeVar.a(1);
        faeVar.d(i2);
        faeVar.c(i3);
        return faeVar;
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String getWeightScaleProductId() {
        int iO = o();
        if (iO == 94 || iO == 95) {
            return "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4";
        }
        if (iO == 106) {
            return "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4";
        }
        if (iO == 140) {
            return "e835d102-af95-48a6-ae13-2983bc06f5c0";
        }
        if (iO == 385) {
            return "b29df4e3-b1f7-4e40-960d-4cfb63ccca05";
        }
        if (iO == 672) {
            return "c943c933-442e-4c34-bcd0-66597f24aaed";
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0056 A[RETURN] */
    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public int getFractionDigitByType(int i) {
        double dAv;
        int i2;
        double d;
        double dC;
        LogUtil.a("HagridOrMiniViewBean", "getFractionDigitByType type = ", Integer.valueOf(i));
        if (i == 0) {
            dAv = av();
        } else {
            if (i == 7) {
                dAv = g();
            } else {
                LogUtil.d("HagridOrMiniViewBean", "getFractionDigitByType get value fall into default ");
                d = 0.0d;
                i2 = 1;
            }
            dC = UnitUtil.c(d);
            LogUtil.d("HagridOrMiniViewBean", "getFractionDigitByType type is weight and showImperialUnit, ", Double.valueOf(dC));
            if (Math.round(Math.pow(10.0d, 2.0d) * dC) % 10 == 0) {
                return 1;
            }
            return i2;
        }
        i2 = 2;
        d = dAv;
        dC = UnitUtil.c(d);
        LogUtil.d("HagridOrMiniViewBean", "getFractionDigitByType type is weight and showImperialUnit, ", Double.valueOf(dC));
        if (Math.round(Math.pow(10.0d, 2.0d) * dC) % 10 == 0) {
            return 1;
        }
        return i2;
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String getStringLevelByType(int i) {
        return "";
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public double getDoubleOrIntLevelByType(int i) {
        int iC = c();
        int iR = r();
        byte bAn = an();
        double dE = e(i, iC, bAn);
        if (!exz.d(dE, -1.0d)) {
            return dE;
        }
        double d = d(i, iC, bAn);
        if (!exz.d(d, -1.0d)) {
            return d;
        }
        double dA = a(i, iC, iR, bAn);
        if (exz.d(dA, -1.0d)) {
            return -1.0d;
        }
        return dA;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    private double e(int i, int i2, byte b2) {
        int iC;
        double dAq;
        if (i == 1) {
            iC = exz.c(b2, i2, b(), 1);
        } else if (i == 300) {
            dAq = aq();
            if (!ezh.r(dAq)) {
                dAq = ak();
            }
            if (i == 3) {
                iC = exz.c(exz.h(b2, i2), ai(dAq));
            } else {
                iC = exz.d(b2, dAq, i2);
            }
        } else if (i == 400) {
            iC = exz.e(new double[]{exz.d()[0], 2500.0d}, exz.e(b2, i2, av(), 1), UnitUtil.d(e(), 0), 1);
        } else if (i == 3) {
            dAq = aq();
            if (!ezh.r(dAq)) {
                dAq = ak();
            }
            if (i == 3) {
                iC = exz.c(exz.h(b2, i2), ai(dAq));
            } else {
                iC = exz.d(b2, dAq, i2);
            }
        } else if (i == 4) {
            iC = exz.c(exz.e(b2, i2, av(), 1), ai(e()));
        } else {
            switch (i) {
                case 100:
                    iC = exz.a(b2, i2, b(), 1);
                    break;
                case 101:
                    iC = exz.b(b2, i2, b(), 1);
                    break;
                case 102:
                    return exz.e(b2, i2, 1);
                default:
                    return -1.0d;
            }
        }
        return iC;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    private double d(int i, int i2, byte b2) {
        int iF;
        if (i != 5) {
            if (i != 8) {
                if (i != 500) {
                    if (i != 800) {
                        return -1.0d;
                    }
                } else if (i == 5) {
                    iF = exz.i(s());
                } else {
                    iF = exz.f(s());
                }
            }
            double dAq = aq();
            if (!ezh.r(dAq)) {
                dAq = ak();
            }
            double dE = exz.e(av(), dAq, b(), g(), getFractionDigitByType(0));
            if (i == 8) {
                iF = exz.a(b2, i2, dE);
            } else {
                iF = exz.d(b2, i2, dE);
            }
        } else if (i == 5) {
            iF = exz.i(s());
        } else {
            iF = exz.f(s());
        }
        return iF;
    }

    private double a(int i, int i2, int i3, byte b2) {
        int iC;
        if (i == 6) {
            iC = exz.c(exz.e(b2, i2, i3, 1), ai(ad()));
        } else if (i == 7) {
            iC = exz.c(a(b2, i3, g(), getFractionDigitByType(7), i2));
        } else if (i == 10) {
            iC = exz.c(exz.d(b2, i2, i3, 1), ai(am()));
        } else if (i == 14 || i == 103) {
            double dA = exz.a(b(), av());
            if (i == 14) {
                iC = exz.a(b2, i2, i3, dA, 1);
            } else {
                iC = exz.d(b2, i2, i3, dA, 1);
            }
        } else if (i == 600) {
            iC = exz.b(b2, i2, r(), ad(), 1);
        } else if (i == 700) {
            iC = exz.e(a(b2, i3, g(), getFractionDigitByType(7), i2));
        } else {
            if (i != 1000) {
                return -1.0d;
            }
            iC = exz.f(b2, i2, i3, am(), 1);
        }
        return iC;
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String[] getStringArrayLevelByType(int i) {
        int iC = c();
        byte bAn = an();
        if (i == 1) {
            double[] dArrB = exz.b(bAn, iC, 1);
            return new String[]{exz.e(dArrB[0]), exz.e(dArrB[1]), exz.e(dArrB[2])};
        }
        if (i == 5) {
            double[] dArrZ = exz.z();
            return new String[]{exz.e(dArrZ[0]), exz.e(dArrZ[1]), exz.e(dArrZ[2])};
        }
        if (i == 3) {
            double[] dArrH = exz.h(bAn, iC);
            return new String[]{exz.e(dArrH[0]), exz.e(dArrH[1])};
        }
        if (i == 8) {
            double[] dArrE = exz.e(bAn, iC);
            return new String[]{exz.e(dArrE[0]), exz.e(dArrE[1])};
        }
        if (i != 4) {
            return null;
        }
        double[] dArrE2 = exz.e(bAn, iC, av(), 1);
        return new String[]{UnitUtil.e(dArrE2[0], 1, 0), UnitUtil.e(dArrE2[1], 1, 0)};
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public double[] getDoubleArrayLevelByType(int i) {
        int iC = c();
        byte bAn = an();
        int iR = r();
        if (i == 1) {
            return exz.b(bAn, iC, 1);
        }
        if (i == 6) {
            return exz.e(bAn, iC, iR, 1);
        }
        if (i == 14) {
            double[] dArrE = exz.e(bAn, iC, iR, 1);
            double[] dArrC = exz.c(bAn, iR, iC);
            return new double[]{ai(dArrE[0] + dArrC[0]), ai(dArrE[1] + dArrC[1])};
        }
        if (i == 10) {
            return exz.d(bAn, iC, iR, 1);
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
            return exz.e(bAn, iC, av(), 1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0035  */
    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public boolean isVisible(int i, boolean z) {
        if (i == 31) {
            return super.isVisible(i, z);
        }
        switch (i) {
            case 0:
            case 2:
            case 11:
            case 12:
                if (dxm.v(getWeightScaleProductId()) && i == 11 && c() < 18) {
                    return false;
                }
                return vdo.b(this, i);
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 14:
                return b(i, z);
            case 9:
            case 13:
                if (!z) {
                    return h(i);
                }
            case 6:
                return false;
            default:
                switch (i) {
                    case 25:
                        if (!z) {
                            return h(i);
                        }
                        return false;
                    case 26:
                        return b(i, z);
                    case 27:
                        return e(z);
                    default:
                        return true;
                }
        }
    }

    private boolean b(int i, boolean z) {
        boolean zC;
        String weightScaleProductId = getWeightScaleProductId();
        int iC = c();
        if (dxm.v(weightScaleProductId) && !z) {
            if (Utils.o() && !vdo.d(iC)) {
                return false;
            }
            zC = vdo.b(iC);
        } else if ((dxm.v(weightScaleProductId) && z) || dxm.u(weightScaleProductId) || dxm.q(weightScaleProductId)) {
            zC = vdo.d(iC);
        } else {
            zC = vdo.c(iC);
        }
        if (zC) {
            return vdo.e(this, i);
        }
        LogUtil.a("HagridOrMiniViewBean", "isAboutAgeViewVisible isGone Type", Integer.valueOf(i));
        return false;
    }

    private boolean h(int i) {
        boolean zD;
        if (dxm.v(getWeightScaleProductId())) {
            if (i == 25 || i == 9 || Utils.b(BaseApplication.b()) || Utils.c(BaseApplication.b())) {
                zD = vdo.d(c());
            } else {
                zD = vdo.b(c());
            }
        } else if (dxm.u(getWeightScaleProductId()) || dxm.q(getWeightScaleProductId())) {
            zD = vdo.d(c());
        } else {
            zD = vdo.c(c());
        }
        if (zD) {
            return vdo.d(this, i);
        }
        LogUtil.a("HagridOrMiniViewBean", "isNotOverseaViewVisible isGone Type", Integer.valueOf(i));
        return false;
    }

    private boolean e(boolean z) {
        boolean zC;
        if (dxm.v(getWeightScaleProductId()) && ac() == 2) {
            zC = vdo.d(c());
        } else {
            zC = ("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(getWeightScaleProductId()) && ac() == 2) ? vdo.c(c()) : false;
        }
        boolean z2 = zC && ezh.g(b());
        if (!z && z2 && ezh.a(j())) {
            return true;
        }
        LogUtil.a("HagridOrMiniViewBean", "isBodyShapeVisible isGone");
        return false;
    }
}
