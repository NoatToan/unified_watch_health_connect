package defpackage;

import com.huawei.health.h5pro.utils.RequestCode;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class usr extends dnb {
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
    public boolean isNewScaleType() {
        return false;
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

    @Override // defpackage.dnb
    public double i() {
        return super.i();
    }

    @Override // defpackage.dnb
    public double j() {
        return super.j();
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String getStringLevelByType(int i) {
        return vdc.e(i, this);
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public double getDoubleOrIntLevelByType(int i) {
        return vdc.b(i, this);
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public double[] getDoubleArrayLevelByType(int i) {
        return vdc.a(i, this);
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public int getFractionDigitByType(int i) {
        if (i == 7) {
            return Math.round(Math.pow(10.0d, 2.0d) * UnitUtil.c(g())) % 10 == 0 ? 1 : 2;
        }
        return 1;
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String getWeightScaleProductId() {
        int iO = o();
        if (iO == 48) {
            return "7a1063dd-0e0f-4a72-9939-461476ff0259";
        }
        if (iO == 57) {
            return "34fa0346-d46c-439d-9cb0-2f696618846b";
        }
        if (iO == 82) {
            return "e4b0b1d5-2003-4d88-8b5f-c4f64542040b";
        }
        switch (iO) {
            case 84:
            case RequestCode.SCANNER_PERMISSION_REQUEST_CODE /* 86 */:
                return "a8ba095d-4123-43c4-a30a-0240011c58de";
            case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                return "e4b0b1d5-2003-4d88-8b5f-c4f64542040b";
            default:
                return "";
        }
    }

    @Override // defpackage.dnb, com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String[] getStringArrayLevelByType(int i) {
        return vdc.c(i, this);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0024 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002b A[RETURN] */
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
                return vdo.b(this, i);
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                return vdo.e(this, i);
            case 9:
            case 13:
                if (z) {
                    return false;
                }
                return vdo.d(this, i);
            case 14:
                LogUtil.a("DefaultWeightViewBean", "is old scale type");
                return false;
            default:
                switch (i) {
                    case 25:
                        if (z) {
                            return vdo.d(this, i);
                        }
                        return false;
                    case 26:
                        return vdo.e(this, i);
                    case 27:
                        return false;
                    default:
                        return true;
                }
        }
    }
}
