package defpackage;

import com.huawei.hwhealthdatamgr.R;

/* JADX INFO: loaded from: classes11.dex */
public class nld extends nlc {
    @Override // defpackage.nlc
    public int a() {
        return 1;
    }

    @Override // defpackage.nlc
    public boolean i() {
        return true;
    }

    @Override // defpackage.nlc
    public String e(long j) {
        return String.valueOf(j);
    }

    @Override // defpackage.nlc
    public String d() {
        if (this.f43249a == null) {
            return "";
        }
        return b(this.f43249a.requestActiveCalories(), this.f43249a.requestTotalCalories());
    }

    @Override // defpackage.nlc
    public String b() {
        return qre.f(R.string.IDS_band_data_sport_energy_unit);
    }
}
