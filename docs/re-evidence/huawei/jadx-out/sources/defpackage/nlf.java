package defpackage;

import com.huawei.hwhealthdatamgr.R;

/* JADX INFO: loaded from: classes11.dex */
public class nlf extends nld {
    @Override // defpackage.nld, defpackage.nlc
    public int a() {
        return 2;
    }

    @Override // defpackage.nlc
    public String c() {
        return qre.f(R.string.IDS_main_watch_heart_rate_unit_string);
    }

    @Override // defpackage.nlc
    public String e() {
        if (this.f43249a == null) {
            return "";
        }
        return String.valueOf(this.f43249a.requestAvgHeartRate());
    }
}
