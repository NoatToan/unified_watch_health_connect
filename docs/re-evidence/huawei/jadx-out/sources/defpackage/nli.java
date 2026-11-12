package defpackage;

import com.huawei.hwhealthdatamgr.R;

/* JADX INFO: loaded from: classes11.dex */
public class nli extends nlc {
    @Override // defpackage.nlc
    public int a() {
        return 6;
    }

    @Override // defpackage.nlc
    public String d() {
        if (this.f43249a == null) {
            return "";
        }
        return String.valueOf(this.f43249a.getExtendDataInt("golfSwingCount"));
    }

    @Override // defpackage.nlc
    public String b() {
        if (this.f43249a == null) {
            return "";
        }
        return qre.e(R.plurals.IDS_band_data_golf_count_unit, this.f43249a.getExtendDataInt("golfSwingCount"), "");
    }
}
