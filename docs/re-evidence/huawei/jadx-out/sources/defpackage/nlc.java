package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwhealthdatamgr.sportrecordingstrategy.SportsRecordingBean;
import health.compact.a.UnitUtil;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class nlc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected MotionPathSimplify f43249a;

    public int a() {
        return 0;
    }

    public boolean i() {
        return false;
    }

    public SportsRecordingBean e(MotionPathSimplify motionPathSimplify) {
        SportsRecordingBean sportsRecordingBean = new SportsRecordingBean();
        if (motionPathSimplify != null) {
            this.f43249a = motionPathSimplify;
            sportsRecordingBean.setNeedConvertToTime(i());
            sportsRecordingBean.setSportStartTime(motionPathSimplify.requestStartTime());
            sportsRecordingBean.setSportEndTime(motionPathSimplify.requestEndTime());
            sportsRecordingBean.setShowType(a());
            sportsRecordingBean.setSportTime(c(motionPathSimplify.requestStartTime()));
            sportsRecordingBean.setSportData(d());
            sportsRecordingBean.setSportUnit(b());
            sportsRecordingBean.setSportSpeed(e());
            sportsRecordingBean.setSportSpeedUnit(c());
            sportsRecordingBean.setSportTypeName(c(motionPathSimplify.requestSportType()));
            sportsRecordingBean.setSportKeepTime(e(motionPathSimplify.requestTotalTime()));
            if (njy.b(motionPathSimplify.requestChildSportItems())) {
                sportsRecordingBean.setChildSportItems(motionPathSimplify.requestChildSportItems());
            }
        }
        return sportsRecordingBean;
    }

    public String c(long j) {
        if (lsl.i(j, System.currentTimeMillis())) {
            return DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_MONTH_DAY_MD);
        }
        return DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD);
    }

    public String c(int i) {
        if (this.f43249a == null) {
            return "";
        }
        return jaa.d(BaseApplication.b(), i);
    }

    public String e(long j) {
        return b(j);
    }

    public String d() {
        return "";
    }

    public String b() {
        return "";
    }

    public String c() {
        return "";
    }

    public String e() {
        return "";
    }

    private static String b(long j) {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.getDefault());
        int i = (int) (j / 1000);
        sb.setLength(0);
        return formatter.format("%02d:%02d:%02d", Integer.valueOf(i / 3600), Integer.valueOf((i / 60) % 60), Integer.valueOf(i % 60)).toString();
    }

    protected String b(double d, double d2) {
        if (d <= 0.0d || d >= d2) {
            d = d2;
        }
        return UnitUtil.e(d / 1000.0d, 1, 0);
    }
}
