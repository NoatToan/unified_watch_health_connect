package defpackage;

import com.huawei.hwhealthdatamgr.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nlb extends nkz {
    @Override // defpackage.nkz, defpackage.nlc
    public String e() {
        if (this.f43249a == null) {
            return "";
        }
        float fRequestCreepingWave = this.f43249a.requestCreepingWave() / 10.0f;
        if (Float.compare(fRequestCreepingWave, 0.0f) == 0) {
            return "";
        }
        if (UnitUtil.i()) {
            return UnitUtil.e(UnitUtil.e(fRequestCreepingWave, 1), 1, 2);
        }
        return UnitUtil.e(fRequestCreepingWave, 1, 1);
    }

    @Override // defpackage.nkz, defpackage.nlc
    public String c() {
        if (UnitUtil.i()) {
            return qre.e(R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(UnitUtil.e(this.f43249a != null ? this.f43249a.requestCreepingWave() / 10.0f : 0.0f, 1)), new Object[0]);
        }
        return qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
    }
}
