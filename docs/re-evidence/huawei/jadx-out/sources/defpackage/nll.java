package defpackage;

import com.huawei.hwhealthdatamgr.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nll extends nkz {
    @Override // defpackage.nkz, defpackage.nlc
    public String b() {
        if (UnitUtil.i()) {
            int iRequestTotalDistance = this.f43249a != null ? this.f43249a.requestTotalDistance() : 0;
            return qre.e(R.plurals.IDS_hwh_motiontrack_unit_yd, iRequestTotalDistance, UnitUtil.e(iRequestTotalDistance, 1, 0));
        }
        return qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
    }

    @Override // defpackage.nkz, defpackage.nlc
    public String d() {
        if (this.f43249a == null) {
            return "";
        }
        int iRequestTotalDistance = this.f43249a.requestTotalDistance();
        if (iRequestTotalDistance < 1.0f) {
            return "";
        }
        if (UnitUtil.i()) {
            return UnitUtil.e(UnitUtil.e(iRequestTotalDistance, 2), 1, 0);
        }
        return UnitUtil.e(iRequestTotalDistance, 1, 0);
    }

    @Override // defpackage.nkz, defpackage.nlc
    public String e() {
        if (this.f43249a == null) {
            return "";
        }
        float fRequestAvgPace = this.f43249a.requestAvgPace() / 10.0f;
        double d = fRequestAvgPace;
        if (d > 360000.0d || d <= 3.6d) {
            return "";
        }
        if (UnitUtil.i()) {
            fRequestAvgPace = (float) UnitUtil.c(d, 2);
        }
        return izn.a(fRequestAvgPace);
    }

    @Override // defpackage.nkz, defpackage.nlc
    public String c() {
        if (UnitUtil.i()) {
            return qre.e(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
        }
        return qre.e(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
    }
}
