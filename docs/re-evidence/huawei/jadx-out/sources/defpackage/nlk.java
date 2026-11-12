package defpackage;

import com.huawei.hwhealthdatamgr.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nlk extends nlc {
    @Override // defpackage.nlc
    public int a() {
        return 9;
    }

    @Override // defpackage.nlc
    public String d() {
        if (this.f43249a == null) {
            return "";
        }
        long jRequestTotalTime = this.f43249a.requestTotalTime();
        return UnitUtil.e(jRequestTotalTime / 60000.0f, 1, ((jRequestTotalTime % 60000) > 0L ? 1 : ((jRequestTotalTime % 60000) == 0L ? 0 : -1)) == 0 ? 0 : 2);
    }

    @Override // defpackage.nlc
    public String b() {
        if (this.f43249a == null) {
            return "";
        }
        return qre.e(R.plurals.IDS_plugin_fitnessadvice_minute, (int) (this.f43249a.requestTotalTime() / 60000.0f), "");
    }
}
