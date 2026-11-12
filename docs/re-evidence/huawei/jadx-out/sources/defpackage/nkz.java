package defpackage;

import com.huawei.hwhealthdatamgr.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nkz extends nlc {
    private boolean e(int i) {
        return i == 259 || i == 265 || i == 260;
    }

    @Override // defpackage.nlc
    public int a() {
        return 0;
    }

    @Override // defpackage.nlc
    public String d() {
        if (this.f43249a == null) {
            return "";
        }
        double dRequestTotalDistance = this.f43249a.requestTotalDistance();
        if (UnitUtil.i()) {
            dRequestTotalDistance = UnitUtil.e(dRequestTotalDistance, 3);
        }
        return UnitUtil.e(dRequestTotalDistance / 1000.0d, 1, 2);
    }

    @Override // defpackage.nlc
    public String b() {
        int i;
        if (UnitUtil.i()) {
            i = R.string.IDS_band_data_sport_distance_unit_en;
        } else {
            i = R.string.IDS_motiontrack_show_sport_unit_km;
        }
        return qre.f(i);
    }

    @Override // defpackage.nlc
    public String c() {
        if (this.f43249a == null) {
            return "";
        }
        return b(this.f43249a.requestSportType());
    }

    @Override // defpackage.nlc
    public String e() {
        if (this.f43249a == null) {
            return "";
        }
        float fRequestAvgPace = this.f43249a.requestAvgPace();
        if (!e(this.f43249a.requestSportType())) {
            return e(0, fRequestAvgPace);
        }
        if (fRequestAvgPace == 0.0f) {
            return "";
        }
        return e(1, (1.0f / fRequestAvgPace) * 3600.0f);
    }

    private String e(int i, double d) {
        String strA = a(d);
        if (strA != null) {
            return strA;
        }
        if (i != 0) {
            if (i != 1) {
                return "";
            }
            return UnitUtil.e(nkw.d(false, 3, d), 1, 2);
        }
        if (d > 360000.0d || d <= 3.6d) {
            return "";
        }
        return izn.a((float) nkw.d(true, 3, d));
    }

    private String a(double d) {
        boolean z = d > -1.0E-4d && d < 1.0E-4d;
        if (d == 0.0d || z) {
            return "";
        }
        return null;
    }

    private String b(int i) {
        if (i != 264) {
            if (i != 265) {
                switch (i) {
                    case 257:
                    case 258:
                        break;
                    case 259:
                        break;
                    default:
                        return "";
                }
            }
            return f();
        }
        return g();
    }

    private String f() {
        if (UnitUtil.i()) {
            return qre.f(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        }
        return qre.f(R.string.IDS_motiontrack_show_detail_average_speed);
    }

    private String g() {
        if (UnitUtil.i()) {
            return "/" + qre.f(R.string.IDS_band_data_sport_distance_unit_en);
        }
        return "/" + qre.f(R.string.IDS_band_data_sport_distance_unit);
    }
}
