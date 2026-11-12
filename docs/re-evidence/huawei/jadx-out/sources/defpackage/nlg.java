package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwhealthdatamgr.R;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nlg extends nlc {
    @Override // defpackage.nlc
    public int a() {
        return 5;
    }

    @Override // defpackage.nlc
    public String d() {
        if (this.f43249a == null) {
            return "";
        }
        return UnitUtil.e(g(), 1, 0);
    }

    private int g() {
        int iC;
        if (this.f43249a != null && (iC = qqw.c(this.f43249a.requestSportData(), "overall_score", -1)) >= 0 && iC <= 100) {
            return iC;
        }
        return 0;
    }

    @Override // defpackage.nlc
    public String b() {
        return this.f43249a == null ? "" : qre.e(R.plurals.IDS_sleep_referece_title_score_string, g(), "");
    }

    @Override // defpackage.nlc
    public String c(int i) {
        if (this.f43249a == null) {
            return "";
        }
        String strF = qre.f(R.string.IDS_aw_version2_basketball);
        if (this.f43249a.requestSportType() != 271 || this.f43249a.requestChiefSportDataType() != 5) {
            return strF;
        }
        String strF2 = qre.f(R.string.IDS_aw_version2_show_score);
        if (LanguageUtil.c(BaseApplication.b())) {
            return String.format(qre.f(R.string.IDS_sport_history_run_course_name), strF2, strF);
        }
        return String.format(qre.f(R.string.IDS_sport_history_run_course_name), strF, strF2);
    }

    @Override // defpackage.nlc
    public String c() {
        if (this.f43249a == null) {
            return "";
        }
        return qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, qqw.c(this.f43249a.requestSportData(), "jump_times", -1), new Object[0]);
    }

    @Override // defpackage.nlc
    public String e() {
        if (this.f43249a == null) {
            return "";
        }
        return UnitUtil.e(qqw.c(this.f43249a.requestSportData(), "jump_times", -1), 1, 0);
    }
}
