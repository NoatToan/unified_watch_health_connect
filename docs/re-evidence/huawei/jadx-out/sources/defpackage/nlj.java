package defpackage;

import com.huawei.hwhealthdatamgr.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nlj extends nlc {
    @Override // defpackage.nlc
    public int a() {
        return 7;
    }

    @Override // defpackage.nlc
    public String d() {
        if (this.f43249a == null) {
            return "";
        }
        return UnitUtil.e(this.f43249a.getExtendDataInt("skipNum"), 1, 0);
    }

    @Override // defpackage.nlc
    public String b() {
        if (this.f43249a == null) {
            return "";
        }
        return qre.e(R.plurals.IDS_indoor_skipper_number_unit_value, this.f43249a.getExtendDataInt("skipNum"), "");
    }
}
