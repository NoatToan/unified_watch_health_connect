package defpackage;

import com.huawei.hwhealthdatamgr.R;

/* JADX INFO: loaded from: classes11.dex */
public class nlp extends nkz {
    @Override // defpackage.nkz, defpackage.nlc
    public int a() {
        return 4;
    }

    @Override // defpackage.nkz, defpackage.nlc
    public String e() {
        if (this.f43249a == null) {
            return "";
        }
        return b(this.f43249a.requestActiveCalories(), this.f43249a.requestTotalCalories());
    }

    @Override // defpackage.nkz, defpackage.nlc
    public String c() {
        return qre.f(R.string.IDS_band_data_sport_energy_unit);
    }
}
