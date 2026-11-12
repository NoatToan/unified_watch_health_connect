package defpackage;

import com.huawei.hwhealthdatamgr.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nlh extends nlc {
    @Override // defpackage.nlc
    public int a() {
        return 8;
    }

    @Override // defpackage.nlc
    public String d() {
        if (this.f43249a == null) {
            return "";
        }
        double dRequestTotalDescent = this.f43249a.requestTotalDescent() / 10.0f;
        if (UnitUtil.i()) {
            dRequestTotalDescent = UnitUtil.e(dRequestTotalDescent, 1);
        }
        return UnitUtil.e(dRequestTotalDescent, 1, 1);
    }

    @Override // defpackage.nlc
    public String b() {
        if (this.f43249a == null) {
            return "";
        }
        float fRequestTotalDescent = this.f43249a.requestTotalDescent() / 10.0f;
        if (UnitUtil.i()) {
            return qre.e(R.plurals.IDS_altitude_ft, (int) UnitUtil.e(fRequestTotalDescent, 1), "");
        }
        return qre.e(R.plurals.IDS_altitude_meter, (int) fRequestTotalDescent, "");
    }
}
